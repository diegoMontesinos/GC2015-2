package geom.structures.vector;

import processing.core.PApplet;

/**
 * Funciones de utileria para cálculo con vectores.
 *
 */
public class VectorUtils {

	/**
	 * Calcula el volumen con signo del tetraedro formado por cuatro
	 * vectores basado en el producto cruz.
	 *
	 * Ayuda para el giro:
	 * 0 : colineal
	 * - : vuelta a la izquierda
	 * + : vuelta a la derecha
	 * 
	 * @param a Primer vector del tetraedro
	 * @param b Segundo vector del tetraedro
	 * @param c Tercer vector del tetraedro
	 * @param d Cuarto vector del tetreaedro
	 * @return float volumen con signo calculada
	 */
	public static float volume3(Vector3D a, Vector3D b, Vector3D c, Vector3D d) {
		// Tu código va aquí
		return 0.0f;
	}

	/**
	 * Lee un archivo con un conjunto de puntos en el espacio.
	 *
	 * El archivo esta formado por n líneas y cada línea
	 * representa un punto.
	 * Por cada línea (punto), las coordenadas estan se separan por
	 * una coma, es decir:
	 *
	 * x1,y1,z1
	 * x2,y2,z2
	 * ...
	 * xn,yn,zn
	 *
	 * @param filePath La url del archivo
	 * @param processing Un objeto de tipo PApplet para leer las lineas facilmente
	 * @return Vector3D[] el arreglo leído
	 */
	public static Vector3D[] readVectors(String fileName, PApplet processing) {
		String[] vectorLines = processing.loadStrings(fileName);
		Vector3D[] vectors = new Vector3D[vectorLines.length];

		for (int i = 0; i < vectorLines.length; i++) {
			String vectorStr = vectorLines[i];
			String[] vectorData = vectorStr.trim().split(",");

			float x = Float.parseFloat(vectorData[0]);
			float y = Float.parseFloat(vectorData[1]);
			float z = Float.parseFloat(vectorData[2]);

			vectors[i] = new Vector3D(x, y, z);
		}

		return vectors;
	}
}