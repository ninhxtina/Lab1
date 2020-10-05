import java.util.Scanner;
public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car();
        Scanner keyboard = new Scanner(System.in);
        //user sets make
        System.out.println("Enter make: ");
        String make = keyboard.nextLine();
        c1.setMake(make);
        //user sets model
        System.out.println("Enter model: ");
        String model = keyboard.nextLine();
        c1.setModel(model);
        Scanner input = new Scanner(System.in);
        //user sets miles
        System.out.println("Enter mph: ");
        int miles = input.nextInt();
        c1.setMiles(miles);
        System.out.println(c1.toString());

        Car c2 = new Car();
        //user sets make
        System.out.println("Enter make: ");
        String make2 = keyboard.nextLine();
        c2.setMake(make2);
        //user sets model
        System.out.println("Enter model: ");
        String model2 = keyboard.nextLine();
        c2.setModel(model2);
        Scanner input2 = new Scanner(System.in);
        //user sets miles
        System.out.println("Enter mph: ");
        int miles2 = input2.nextInt();
        c2.setMiles(miles2);
        System.out.println(c2.toString());
    }
}
