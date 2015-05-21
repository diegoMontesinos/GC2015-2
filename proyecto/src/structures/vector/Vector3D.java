package geom.structures.vector;

/**
 * Representa un vector en el espacio, contiene operaciones básicas
 * de vectores.
 *
 */
public class Vector3D {

	// Coordenadas
	public float x, y, z;

	/**
	 * Construye el vector en el origen.
	 *
	 */
	public Vector3D() {
		this.x = 0.0f;
		this.y = 0.0f;
		this.z = 0.0f;
	}

	/**
	 * Construye el vector dadas sus coordenadas
	 *
	 * @param x La coordenada x del vector.
	 * @param y La coordenada y del vector.
	 */
	public Vector3D(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Compara dos vectores para ver si son iguales.
	 *
	 * @return boolean El test de si son iguales
	 */
	public boolean equals( Vector3D vec ) {
		return this.x == vec.x && this.y == vec.y && this.z == vec.z;
	}
}