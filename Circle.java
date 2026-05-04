class Circle {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }

    double circumference() {
        return 2 * Math.PI * r;
    }

    boolean canFitInside(Circle c) {
        return this.r < c.r;
    }

    void compare(Circle c) {
        if(this.area() > c.area())
            System.out.println("Circle1 bigger");
        else
            System.out.println("Circle2 bigger");
    }
}

class Main2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);

        System.out.println(c1.area());
        System.out.println(c1.circumference());
        c1.compare(c2);
        System.out.println(c1.canFitInside(c2));
    }
}