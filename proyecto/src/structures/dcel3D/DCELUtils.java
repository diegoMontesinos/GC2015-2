package geom.structures.dcel3D;

import geom.structures.dcel3D.*;

/**
 * Clase con algunos métodos de utilería para manejo y 
 * construcción de la estructura Double Connected Edge List (DCEL).
 *
 */
public class DCELUtils {

	/**
	 * Construye una arista completa, es decir, sus dos medias aristas
	 */
	public static HalfEdge3D[] buildCompleteEdge(Vertex3D origin, Vertex3D end) {

		// Creamos las dos medias aristas con origen y final correspondientes
		HalfEdge3D he1 = new HalfEdge3D(origin, end);
		HalfEdge3D he2 = new HalfEdge3D(end, origin);

		// Relacion de gemelos
		he1.twin = he2;
		he2.twin = he1;

		// Creamos las dos medias aristas
		HalfEdge3D[] doubleEdge = { he1, he2 };
		return doubleEdge;
	}

	/**
	 * Construye una cara dado su id y su componente
	 */
	public static Face3D buildFace(String id, HalfEdge3D[] halfEdges) {

		// Creamos la cara (ponemos como refencia de componente a la primera media arista)
		Face3D face = new Face3D(id, halfEdges[0]);

		// Componemos prev y next
		linkComponent(halfEdges);

		// Recorremos las medias aristas
		for (int i = 0; i < halfEdges.length; i++) {

			// Asignamos la cara incidente
			halfEdges[i].incidentFace = face;
		}

		return face;
	}

	/**
	 * Enlaza un componente, es decir, asigna el previo y el siguiente.
	 */
	public static void linkComponent(HalfEdge3D[] component) {

		// Iteramos el componente
		for (int i = 0; i < component.length; i++) {
			HalfEdge3D he = component[i];
			HalfEdge3D nextHe = component[(i + 1) % component.length];

			// Asignamos previo y siguiente
			he.next = nextHe;
			nextHe.prev = he;
		}
	}

}