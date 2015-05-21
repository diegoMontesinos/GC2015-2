package geom.algorithms.convexHull3D;

import geom.structures.dcel3D.*;
import geom.structures.vector.*;

/**
 * Implementación del algoritmo incremental
 * para construir el cierre convexo de un 
 * conjunto de puntos.
 *
 */
public class IncrementalCH {

	/**
	 * Calcula el cierre convexo dado un arreglo de puntos.
	 *
	 * @param points El arreglo de puntos para obtener el cierre
	 * @return Dcel3D El cierre convexo almacenado en una DCEL de tres dimensiones.
	 */
	public static Dcel3D calculateConvexHull(Vector3D[] points) {
		// Tu código va aqui
		return null;
	}

	/**
	 * Calcula el cierre convexo de la unión de un cierre convexo
	 * con un punto, es decir, agrega el punto al cierre convexo
	 * para obtener una solución de un conjunto más grande de puntos.
	 *
	 * @param convexHull El cierre convexo al que se agregara el punto
	 * @param point El punto a agregar
	 * @return Dcel3D El cierre convexo resultante
	 */
	public static Dcel3D append(Dcel3D convexHull, Vector3D point) {
		// Tu código va aqui
		return null;
	}

}