class Triangle {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    boolean isValid() {
        return (a+b>c && a+c>b && b+c>a);
    }

    void type() {
        if(a==b && b==c)
            System.out.println("Equilateral");
        else if(a==b || b==c || a==c)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }

    double area() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

class Main4 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3,4,5);
        System.out.println(t.isValid());
        t.type();
        System.out.println(t.area());
    }
}