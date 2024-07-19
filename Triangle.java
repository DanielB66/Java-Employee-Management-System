public class Triangle {
    private Point A, B, C;

    public Triangle(Point a, Point b, Point c) {
        if (a.equals(b) || b.equals(c) || c.equals(a)) {
            System.out.println("not a triangle. setting default values instead");
            this.A = new Point(0, 0);
            this.B = new Point(1, 1);
            this.C = new Point(2, 0);
        } else {
            this.A = a;
            this.B = b;
            this.C = c;
        }
    }

    public double computePerimeter() {
        double AB = A.distanceTo(B);
        double BC = B.distanceTo(C);
        double CA = C.distanceTo(A);
        return AB + BC + CA;
    }

    public double computeArea() {
        double AB = A.distanceTo(B);
        double BC = B.distanceTo(C);
        double CA = C.distanceTo(A);
        double s = (AB + BC + CA) / 2;
        return Math.sqrt(s * (s - AB) * (s - BC) * (s - CA));
    }

    public boolean isEquilateral() {
        double AB = A.distanceTo(B);
        double BC = B.distanceTo(C);
        double CA = C.distanceTo(A);
        return AB == BC && BC == CA;
    }

    public boolean isIsosceles() {
        double AB = A.distanceTo(B);
        double BC = B.distanceTo(C);
        double CA = C.distanceTo(A);
        return AB == BC || BC == CA || CA == AB;
    }

    public boolean isRightAngle() {
        double AB = A.distanceTo(B);
        double BC = B.distanceTo(C);
        double CA = C.distanceTo(A);
        double AB2 = AB * AB;
        double BC2 = BC * BC;
        double CA2 = CA * CA;
        return (AB2 + BC2 == CA2) || (AB2 + CA2 == BC2) || (BC2 + CA2 == AB2);
    }

    public String toString() {
        return "Triangle [ A" + A + ", B" + B + ", C" + C + " ] (Area = " + computeArea() + " , Perimeter= " + computePerimeter() + ")";
    }

    public boolean equals(Object that) {
        if (!(that instanceof Triangle)) return false;
        Triangle t = (Triangle) that;
        return this.computeArea() == t.computeArea();
    }

    public double computeHeightB() {
        double area = computeArea();
        double AC = A.distanceTo(C);
        return 2 * area / AC;
    }
}
