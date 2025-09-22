public class Main {
    public static void main(String[] args) {
        double spring = 120.00;
        double summer = 180.50;
        double fall = 95.25;
        double winter = 210.00;

        double yearly = spring + summer + fall + winter;

        System.out.println("Spring cost: $" + spring);
        System.out.println("Summer cost: $" + summer);
        System.out.println("Fall cost: $" + fall);
        System.out.println("Winter cost: $" + winter);
        System.out.println("Yearly maintenance total: $" + yearly);
    }
}