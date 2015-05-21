package geom.structures.dcel3D;

import geom.structures.vector.Vector3D;

/**
 * Representación de un vertice de una DCEL de tres dimensiones.
 * Hereda de la clase Vector3D, dado que también es un punto en el
 * espacio y facilita las operaciones de la DCEL.
 *
 */
public class Vertex3D extends Vector3D {

	// Arista incidente (de la cual es origen)
	public HalfEdge3D incidentEdge;

	/**
	 * Constuye un vértice con sus coordenadas x, y, z.
	 *
	 * NOTA: El vértice se crea separado, es decir, sin arista incidente.
	 *
	 * @param x La coordenada x del vertice.
	 * @param y La coordenada y del vertice.
	 */
	public Vertex3D(float x, float y, float z) {
		super(x, y, z);

		this.incidentEdge = null;
	}

	/**
	 * Obtiene el identificador del vertice.
	 *
	 * @return String El identificador del vertice.
	 */
	public String getId () {
		return this.x + "," + this.y + "," + this.z;
	}
}