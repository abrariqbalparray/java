class Rectangle {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double area() { return l * b; }
    double perimeter() { return 2 * (l + b); }

    boolean isSquare() {
        return l == b;
    }

    double diagonal() {
        return Math.sqrt(l*l + b*b);
    }

    void compare(Rectangle r) {
        if(this.area() > r.area())
            System.out.println("Rectangle1 bigger");
        else
            System.out.println("Rectangle2 bigger");
    }
}

class Main3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 4);
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println(r1.area());
        System.out.println(r1.isSquare());
        r1.compare(r2);
    }
}