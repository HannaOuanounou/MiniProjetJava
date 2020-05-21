package unittests.geometries;
import static primitives.Util.*;
import geometries.Cylinder;
import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    /**
     * Test method for {@link geometries.Cylinder#getNormal(Point3D)} (primitives.Vector)}.
     */
    @Test
    void getNormal() {
        Point3D _point=new Point3D(6,4,3);
        Vector _direction=new Vector(3,4,5);
        Ray r=new Ray(_direction, _point);
        Cylinder c= new Cylinder(4,r,7);
        Vector n=c.getNormal(new Point3D(6,5,3));
        Vector check=new Vector(-0.2910427500435999, 0.8246211251235319, -0.48507125007266594);
        assertEquals(n, check);

    }
}