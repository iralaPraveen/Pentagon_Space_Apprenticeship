class Amazon {
    double addToCart(Product p) {
        double sume = p.price * p.qt;
        return sume;
    }

    double installements(double amt, int m) {
        double imt = amt / m;
        return imt;
    }
}