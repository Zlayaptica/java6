import java.util.Scanner;


public class Sorting {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows 10", "red");
        Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "green");
        Laptop l3 = new Laptop(3, 32, 512, "Windows 10", "gray");
        Laptop l4 = new Laptop(4, 16, 256, "Windows 11", "orange");
        System.out.println(l1);

        System.out.println("Select a function:");
        System.out.println("1 - sorting by RAM");
        System.out.println("2 - sorting by SSD");
        System.out.println("3 - sorting by OS");
        Scanner sc = new Scanner(System.in, "ibm866");
        Integer choice = sc.nextInt();
        if (choice == 1) {

            System.out.print("Enter the RAM value: ");
            Integer ram = sc.nextInt();
            if (ram >= 32) {
                System.out.printf(l1 + "\n" + l2 + "\n" + l4 + "\n" + l3 + "\n");
            } else if (ram < 32) {
                System.out.printf(l1 + "\n" + l2 + "\n" + l4);
            } else if (ram < 16) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ram < 4) {
                System.out.printf(l1.toString());
            } else System.out.println("There are no such laptops!");

        } else if (choice == 2) {

            System.out.print("Enter a value SSD: ");
            Integer ssd = sc.nextInt();
            if (ssd >= 512) {
                System.out.printf(l1 + "\n" + l2 + "\n" + l4 + "\n" + l3 + "\n");
            } else if (ssd < 512) {
                System.out.printf(l1 + "\n" + l2 + "\n" + l4);
            } else if (ssd < 256) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ssd < 128) {
                System.out.printf(l1.toString());
            } else System.out.println("There are no such laptops!");

        } else if (choice == 3) {

            System.out.println("Enter a name OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if (os.equals("Windows")) {
                System.out.printf(l1 + "\n" + l2 + "\n" + l4 + "\n" + l3 + "\n");
            } else if (os.equals("Windows 10")) {
                System.out.printf(l1 + "\n" + l3);
            } else if (os.equals("Windows 11")) {
                System.out.printf(l2 + "\n" + l4);
            } else System.out.println("There are no such laptops!");
            sc1.close();
        }

        sc.close();
    }
}
