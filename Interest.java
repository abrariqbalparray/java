class Interest {
    double p, r, t;

    Interest(double p, double r, double t) {
        this.p = p; this.r = r; this.t = t;
    }

    double SI() {
        return (p*r*t)/100;
    }

    double CI() {
        return p * Math.pow((1+r/100), t) - p;
    }
}