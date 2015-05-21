package geom.algorithms.convexHull3D.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import processing.core.PApplet;
import geom.structures.dcel3D.*;
import geom.structures.vector.*;
import geom.algorithms.convexHull3D.IncrementalCH;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IncrementalCHTest {

	@Test
	public void test1ConvexHull() {

		// Un punto
		Vector3D[] points = { new Vector3D(0.0f, 0.0f, 0.0f) };
		Dcel3D polyhedron = IncrementalCH.calculateConvexHull(points);
		assertNull(polyhedron);

		// Nube de puntos
		points = VectorUtils.readVectors("data/pointCloud.txt", new PApplet());

		// Todos están
		polyhedron = IncrementalCH.calculateConvexHull(points);
		assertNotNull(polyhedron);
		for (int i = 0; i < points.length; i++) {
			assertTrue(polyhedron.containsPoint(points[i]));
		}
	}
}
