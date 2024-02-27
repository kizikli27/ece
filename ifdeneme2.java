import java.util.Scanner;

public class ifdeneme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Enter the number of citizens under 15: ");
        int children = scanner.nextInt();

        System.out.print("Enter the number of citizens between 15 and 64: ");
        int workingAdults = scanner.nextInt();

        System.out.print("Enter the number of citizens over 64: ");
        int seniors = scanner.nextInt();

        // Calculate working adult population (for reference)
        
       
        double childDependencyRatio = (double) children / workingAdults * 100;
        double seniorDependencyRatio = (double) seniors / workingAdults * 100;
        String category;
        if(seniorDependencyRatio<15){
            if(childDependencyRatio<29){
                category="Low Overall Dependency";
            }
            else if(childDependencyRatio<45){
                category="Moderate Child Dependency";
            }
            else{
                category="High Child Dependency";
            }
        }

        else{
            if(childDependencyRatio>=29){
                category="Double Dependency";
            }
            else{
                category="High Old-age Dependency";
            }
        }
        // Determine and display the dependency category
        
        

        // Output with additional information
        System.out.println("Child Dependency: " + childDependencyRatio + "%");
        System.out.println("Senior Dependency: " + seniorDependencyRatio + "%");
        System.out.println("Age Dependency Category: " + category);

        scanner.close();
    }
}
