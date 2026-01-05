class This {
    String name;
    double height;

    void run() {
        System.out.println(this.name);
        System.out.println("Theses is the current invoking object" +this);
    }

    void jump() {
        System.out.println(this.height);
                System.out.println(this);

    }

    public static void main(String args[]) {
        This Horse1 = new This();
        Horse1.name = "chetak";
        Horse1.height = 10.2;
        Horse1.run();
        Horse1.jump();

        This Horse2 = new This();
        Horse2.name = "leog";
        Horse2.height = 9.2;
        
        Horse2.run();
        Horse2.jump();

        ;
    }

}