

class TestAmazon {
    
    public static void main(String args[]) {
        Amazon a = new Amazon();
        Product p = new Product();
        p.price = 2000;
        p.qt = 5;
        p.name = "Nike_shoes";

        double total = a.addToCart(p);
        double inst_amount = a.installements(total, 6);
        System.out.println(total);
        System.out.println(inst_amount);
    }

}