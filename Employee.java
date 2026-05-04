class Employee {
    double basic, overtime, deduction;

    Employee(double b, double o, double d) {
        basic = b; overtime = o; deduction = d;
    }

    double hra() { return 0.2 * basic; }
    double da() { return 0.1 * basic; }

    double gross() {
        return basic + hra() + da() + overtime;
    }

    double net() {
        return gross() - deduction;
    }
}