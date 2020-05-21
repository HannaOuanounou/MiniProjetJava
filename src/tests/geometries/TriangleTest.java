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

    @Test
    public void testFindIntersections()
    {
        Point3D a = new Point3D(0, 0, 1);
        Point3D b = new Point3D(0, 1, 0);
        Point3D c = new Point3D(1, 0, 0);

        Triangle tr = new Triangle(a , b, c);

        //============ Equivalence Partitions Tests ==============

        Ray ray1 = new Ray(new Vector(-1, -1, -1), new Point3D(0.5, 0.5,  0.5));
        List<Point3D> intersectionPoints1 = tr.findIntersections(ray1);
        assertEquals( intersectionPoints1.size(), 1, 0.000001,"ERROR, there must be an intersection point");

        //outside against edge
        Ray ray2 = new Ray(new Vector(0, 1, 0), new Point3D(1, 1,  0));
        //List intersectionPoints2 =  tr.findIntersections(ray2);

        assertEquals(null, tr.findIntersections(ray2), "ERROR, there must not be any intersection point");

        //outside against vertex
        Ray ray3 = new Ray(new Vector(0, 0, -1), new Point3D(0, 2,  0));
        List<Point3D> intersectionPoints3 = tr.findIntersections(ray3);

        assertEquals(null, intersectionPoints3, "ERROR, there must not be any intersection point");

        // =============== Boundary Values Tests ==================

        try
        {
            Ray ray4 = new Ray(new Vector(0, 1, 0), new Point3D(1, 0,  0));
            List<Point3D> intersectionPoints4 = tr.findIntersections(ray4);

            Ray ray5 = new Ray(new Vector(-1, -1, 0), new Point3D(1, 1,  0));
            List<Point3D> intersectionPoints5 = tr.findIntersections(ray5);

            Ray ray6 = new Ray(new Vector(-1, 0, 0), new Point3D(-0.5, 2,  0));
            List<Point3D> intersectionPoints6 = tr.findIntersections(ray6);
        }
        catch(Exception e)
        {
            fail("ERROR, there must be no intersections");
        }



    }


}