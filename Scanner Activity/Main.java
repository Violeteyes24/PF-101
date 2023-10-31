import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = null;
        int option;

        do {
            System.out.println("1 - Create employee instance");
            System.out.println("2 - Update Name");
            System.out.println("3 - Update Address");
            System.out.println("4 - Update Email Address");
            System.out.println("5 - Show employee Details");
            System.out.println("Enter Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (emp == null) {
                        emp = new Employee();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        emp.setName(scanner.nextLine());
                        System.out.print("Enter Address: ");
                        emp.setAddress(scanner.nextLine());
                        System.out.print("Enter Email Address: ");
                        emp.setEmailaddress(scanner.nextLine());
                        System.out.println("Employee created successfully.");
                    } else {
                        System.out.println("An employee already exists. You can only create one employee.");
                    }
                    break;
                case 2:
                    if (emp != null) {
                        scanner.nextLine(); 
                        System.out.print("Enter updated Name: ");
                        emp.setName(scanner.nextLine());
                        System.out.println("Name updated successfully.");
                    } else {
                        System.out.println("No employee exists. Create an employee first.");
                    }
                    break;
                case 3:
                    if (emp != null) {
                        scanner.nextLine(); 
                        // updated name
                        System.out.print("Enter updated Address: ");
                        emp.setAddress(scanner.nextLine());
                        System.out.println("Address updated successfully.");
                    } else {
                        System.out.println("No employee exists. Create an employee first.");
                    }
                    break;
                case 4:
                    if (emp != null) {
                        scanner.nextLine(); 
                        System.out.print("Enter updated Email Address: ");
                        emp.setEmailaddress(scanner.nextLine());
                        System.out.println("Email Address updated successfully.");
                    } else {
                        System.out.println("No employee exists. Create an employee first.");
                    }
                    break;
                case 5:
                    if (emp != null) {
                        System.out.println("Employee Details:");
                        System.out.println("Name: " + emp.getName());
                        System.out.println("Address: " + emp.getAddress());
                        System.out.println("Email Address: " + emp.getEmailaddress());
                    } else {
                        System.out.println("No employee exists. Create an employee first.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        } while (option != 0);
    }
}
