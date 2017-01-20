package geometric_solver;

import geometric_solver.geometry.*;
import geometric_solver.math.*;
import geometric_solver.math.constraints.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Begin");
        Source testSource = new Source();
        Lagrange testLagrange = new Lagrange(testSource);
        Point testPoint = new Point(5.0, 7.0);
        testLagrange.addComponents(testPoint.getLagrangeComponents());
        FixAxis testFixXPoint = new FixAxis(Axis.AXIS_X, 5.0);
        testLagrange.addConstraint(testFixXPoint);
        //MatrixBuilder testMatrix = new MatrixBuilder(testLagrange.getSize(), testLagrange, testSource);
        //testMatrix.generateAndPrint();
        System.out.println(testLagrange.print());
        //System.out.println(lagrange.diff(source.getVariable(0), source));
        //System.out.println(lagrange.diff(source.getVariable(1), source));


    }
}
