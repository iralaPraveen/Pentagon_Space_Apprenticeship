class This_1 {
    double height = 2.4;

    void jump() {
        double height = 9.3;
        System.out.println("THe dog height" + this.height);
        System.out.println("The dog jumping height" + height);
    }
     
    public static void main(String[] args) {
        This_1 t = new This_1();
        t.jump();
    }

}