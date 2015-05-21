package geom.structures.dcel3D;

/**
 * Representación de una arista de una DCEL de tres dimensiones.
 *
 */
public class HalfEdge3D {

	// Vertice de inicio
	public Vertex3D origin;

	// Vertice de final
	public Vertex3D end;

	// Arista gemela
	public HalfEdge3D twin;

	// Arista siguiente
	public HalfEdge3D next;

	// Arista previa
	public HalfEdge3D prev;

	// Cara incidente
	public Face3D incidentFace;

	// Bandera para saber si ha sido visitada
	public boolean visited;

	/**
	 * Constuye una arista con su origen y final.
	 * Este constructor asigna automaticamente que la arista
	 * incidente al origen es la creada.
	 *
	 * NOTA: La arista se crea separada, es decir, sin gemela, ni previo, ni siguiente.
	 *
	 * @param origin Vertice de origen.
	 * @param end Vertice de final.
	 */
	public HalfEdge3D(Vertex3D origin, Vertex3D end) {
		this.origin = origin;
		this.end = end;
		this.origin.incidentEdge = this;

		this.twin = null;
		this.next = null;
		this.prev = null;
		this.incidentFace = null;
	}

	/**
	 * Obtiene el identificador de la arista.
	 *
	 * @return String El identificador de la arista.
	 */
	public String getId () {
		return this.origin.getId() + "-" + this.end.getId();
	}

	/**
	 * Compara dos aristas para ver si son iguales.
	 *
	 * @return boolean El test de si son iguales
	 */
	public boolean equals(HalfEdge3D he) {
		return this.origin.equals(he.origin) && this.end.equals(he.end);
	}
}