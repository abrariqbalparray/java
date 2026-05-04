class ElectricityBill {
    int units;

    ElectricityBill(int u) {
        units = u;
    }

    double calculate() {
        double bill = 0;

        if(units <= 100)
            bill = units * 5;
        else if(units <= 200)
            bill = 100*5 + (units-100)*7;
        else
            bill = 100*5 + 100*7 + (units-200)*10;

        return bill + bill*0.1; // tax
    }
}