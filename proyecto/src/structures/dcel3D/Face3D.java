package geom.structures.dcel3D;

/**
 * Representación de una cara de una DCEL de tres dimensiones.
 *
 */
public class Face3D {

	// Identificador único dentro de la DCEL
	private String id;

	// Apuntador a una media arista que compone la componente exterior
	public HalfEdge3D outerComponent;

	/**
	 * Constuye una cara con su id, componente externo y sus componentes internos.
	 *
	 * @param id Identificador único dentro de la DCEL.
	 * @param outerComponent Arista del componente externo.
	 */
	public Face3D(String id, HalfEdge3D outerComponent) {
		this.id = id;

		this.outerComponent = outerComponent;
	}

	/**
	 * Obtiene el identificador de la cara.
	 *
	 * @return String El identificador de la cara.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Compara dos caras para ver si son iguales.
	 *
	 * @return boolean El test de si son iguales
	 */
	public boolean equals(Face3D face) {
		return this.getId().equals(face.getId());
	}
}
