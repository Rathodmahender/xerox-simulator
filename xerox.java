import java.util.Scanner;
public class xerox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 'start' to begin:");
        String start =  sc.nextLine();
        if (start.equalsIgnoreCase("start")){
        System.out.println("Xerox machine started.");
         System.out.println("Enter print type: 'black' or 'color'");
         String printType = sc.nextLine();
         if (printType.equalsIgnoreCase("black")) {
            System.out.println("Select a print mode:");
            System.out.println("Select 1 for one copy ");
            System.out.println("select 2 for two copies ");
            System.out.println("select 3 for three copies ");
            System.out.println("select  4 Double-sided printing (Front and Back) ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    case 2:
                    case 3:
                        System.out.println("Printing " + choice + " copies...");
                        for (int i = 1; i <= choice; i++) {
                            System.out.println("Copy " + i + " printed successfully.");
                        }
                        break;
                    case 4:
                        System.out.println("Copy 4 - Front side printed.");
                        System.out.println("Copy 4 - Back side printed.");
                        System.out.println("Printed double-sided copies...");
                        System.out.println("-------------------------");
                        break;
                    default:
                        System.out.println("Invalid choice for black and white printing.");
                }
            }else if (printType.equalsIgnoreCase("color")) {
                System.out.println("Color printing selected.");
                System.out.print("Enter number of color copies to print: ");
                int colorCopies = sc.nextInt();  // Read how many color copies

                if (colorCopies > 0) {
                for (int i = 1; i <= colorCopies; i++) {
                System.out.println("Color Copy " + i + " printed successfully.");
                }
                } else {
            System.out.println("Invalid number of copies. Please enter a positive integer.");
            }
            
            } else {
                System.out.println("Invalid print type. Please enter 'black' or 'color'.");
            }

        } else {
            System.out.println("Please type 'start' to begin.");
        }
    }
}




