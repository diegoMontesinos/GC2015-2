package geom.structures.dcel3D;

import java.util.TreeMap;
import processing.core.PApplet;
import geom.structures.vector.*;
import toxi.geom.mesh.TriangleMesh;

/**
 * Implementación de la estructura de datos Double Connected Edge List
 * para representar un poliedro (tres dimensiones) que puede aplanarse
 * en una subdivisión planar.
 * Se mantienen tres registros: Caras, Aritstas y Vertices.
 * Dado que una arista es adyacente a dos caras, una arista
 * se guarda en dos registros llamados half-edge.
 *
 * Ocupa la implementación en la JavaAPI de los árboles rojo-negro para
 * guardar los registros.
 *
 */
public class Dcel3D {

	// Registros comunes de la DCEL
	public TreeMap<String, Vertex3D> vertices;
	public TreeMap<String, HalfEdge3D> halfEdges;
	public TreeMap<String, Face3D> faces;

	/**
	 * Construye una DCEL vacía.
	 * Inicia los registros de caras, aristas y vertices vacios.
	 *
	 */
	public Dcel3D() {
		this.vertices = new TreeMap<String, Vertex3D>();
		this.halfEdges = new TreeMap<String, HalfEdge3D>();
		this.faces = new TreeMap<String, Face3D>();
	}

	/**
	 * Construye una DCEL con los registros dados.
	 *
	 * @param vertices Registro de vertices en un árbol rojo-negro.
	 * @param halfEdges Registro de vertices en un árbol rojo-negro.
	 * @param faces Registro de vertices en un árbol rojo-negro.
	 */
	public Dcel3D(TreeMap<String, Vertex3D> vertices, TreeMap<String, HalfEdge3D> halfEdges, TreeMap<String, Face3D> faces) {
		this.vertices = vertices;
		this.halfEdges = halfEdges;
		this.faces = faces;
	}

	/**
	 * Agrega una cara al registro de caras.
	 *
	 * @param face La cara a agregar.
	 */
	public void addFace(Face3D face) {
		if(!this.faces.containsKey(face.getId())) {
			this.faces.put(face.getId(), face);
		}
	}

	/**
	 * Agrega una arista al registro de aristas.
	 *
	 * @param halfEdge La arista por agregar.
	 */
	public void addHalfEdge(HalfEdge3D halfEdge) {
		if(!this.halfEdges.containsKey(halfEdge.getId())) {
			this.halfEdges.put(halfEdge.getId(), halfEdge);
		}
	}

	/**
	 * Agrega un vertice al registro de vertices.
	 *
	 * @param vertex El vertice por agregar.
	 */
	public void addVertex(Vertex3D vertex) {
		if(!this.vertices.containsKey(vertex.getId())) {
			this.vertices.put(vertex.getId(), vertex);
		}
	}

	/**
	 * Verifica si un punto está dentro o sobre el poliedro.
	 * NOTA: Este método supone que todas las caras del poliedro
	 * son convexas.
	 *
	 * @param point El punto a verificar.
	 * @return boolean Si el punto esta contenido o no.
	 */
	public boolean containsPoint(Vector3D point) {
		return false;
	}

	/**
	 * Dibuja la DCEL en un sketch de Processing.
	 * Esto debe hacer el dibujo en tres dimensiones.
	 *
	 * @param processing El sketch donde se debe pintar la DCEL.
	 */
	public void draw(PApplet processing) {
		// Tu código va aqui
	}

	/**
	 * Construye un objteo TriangleMesh de la biblioteca
	 * toxiclibs con la información geometrica de la DCEL.
	 *
	 * @return TriangleMesh el objeto contruido.
	 */
	public TriangleMesh toTriangleMesh() {
		// Tu código va aqui
		return null;
	}

	/**
	 * Crea un archivo STL con la informacion de la DCEL.
	 *
	 * @param filePath La url del archivo
	 */
	public void generateSTL(String filePath) {
		TriangleMesh triangleMesh = toTriangleMesh();
		triangleMesh.saveAsSTL(filePath);
	}
}