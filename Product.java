class Product {
    int id, qty;
    double price;

    Product(int id, int q, double p) {
        this.id = id; qty = q; price = p;
    }

    double total() {
        double cost = qty * price;

        if(qty > 10)
            cost *= 0.9; // discount

        return cost + cost*0.05; // tax
    }
}