package unittests.geometries;

import geometries.Triangle;
import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static primitives.Util.*;
class TriangleTest {

    @Test
    public void testGetNormal() {
        //============Equivalence Partition Tests==============

        Triangle triangle = new Triangle(new Point3D(0, 0, 1), new Point3D(1, 0, 0), new Point3D(0, 1, 0));
        assertEquals(new Vector(1, 1, 1), triangle.getNormal(new Point3D(0, 0, 1)), "Bad normal for a trinagle");
    }

   

}
