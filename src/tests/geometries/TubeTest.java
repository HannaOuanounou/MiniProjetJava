package unittests.geometries;

import geometries.Tube;
import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Ray;
import primitives.Util;
import primitives.Vector;
import static primitives.Util.*;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class TubeTest {

    private Object Ray;

    /**
     * Test method for {@link geometries.Tube#getNormal(primitives.Point3D)}.
     */

    public void getNormal() {
        Point3D center = new Point3D(0, 0, 0);
        Vector direction = new Vector(0, 0, 1);
        Ray ray = new Ray(direction, center);
        Tube tube = new Tube(25, (primitives.Ray) Ray
        );

        Point3D p = new Point3D(25, 0, 1);

        double t = p.subtract(center).dotProduct(direction);

        Point3D o = null;
        if (!Util.isZero(t))
            o = center.add(direction.scale(t));

        //============ Equivalence Partitions Tests ==============
        Vector n = (p.subtract(o)).normalize();
        Vector Res = new Vector(1, 0, 0);

        assertEquals("ERROR, Tube's GetNormal() - wrong result ", Res, (Supplier<String>) n);
    }

}