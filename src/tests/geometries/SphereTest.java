package unittests.geometries;
import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;
import geometries.Sphere;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {


    /**
     * Test method for {@link geometries.Sphere#getNormal(Point3D)} (geometries.Sphere)}.
     */

    @Test
    void getNormalTest1() {
        Sphere sp = new Sphere(1.0, new Point3D(0, 0, 1));
        assertEquals(new Vector(0, 0, 1), sp.getNormal(new Point3D(0, 0, 2)));
    }

    @Test
    void getNormalTest2() {
        Sphere sp = new Sphere(1, new Point3D(0, 0, 1));
        assertNotEquals(new Vector(0, 0, 1), sp.getNormal(new Point3D(0, 1, 1)));
        System.out.println(sp.getNormal(new Point3D(0, 1, 1)));
    }

   
    }
