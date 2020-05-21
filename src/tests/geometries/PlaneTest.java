/*
Hanna Fettaya
330446261
 */
package unittests.geometries;


import geometries.Plane;
import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Vector;
import static org.junit.jupiter.api.Assertions.*;
import static primitives.Util.*;
/**
 * Unit tests for primitives.Vector class
 * @author Hanna
 */
class PlaneTest {
    /**
     * Test method for {@link Plane#getNormal()} (geometries.Plane)}.
     */
@Test
    public void getNormal() {
        Plane plane = new Plane(new Point3D(1,2,3),new Point3D(1,1,1), new Point3D(2,2,2));
        // ============ Equivalence Partitions Tests ==============
        assertEquals(plane.getNormal(new Point3D(1,2,3)),new Vector(1,-2,1).normalize());
    }

}
