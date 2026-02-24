import java.util.Scanner; //Needed to take user input from keyboard

public class VectorDemo {
    public static void main(String[] args) { //This is the main class containing the main method.
        //static → belongs to the class, not an object
        Scanner sc = new Scanner(System.in); //System.in means input will come from keyboard.

        try {
            // Dimension of Vector 1
            System.out.print("Enter dimension of Vector 1 (2 or 3): ");
            int dim1 = sc.nextInt();

            double[] arr1 = new double[dim1]; //Creates array to store vector components, Size depends on user input.
            System.out.println("Enter components of Vector 1:");
            for (int i = 0; i < dim1; i++) {
                arr1[i] = sc.nextDouble(); //Reads each component from user and Stores in array.
            }

            // Dimension of Vector 2
            System.out.print("Enter dimension of Vector 2 (2 or 3): ");
            int dim2 = sc.nextInt();

            double[] arr2 = new double[dim2];
            System.out.println("Enter components of Vector 2:");
            for (int i = 0; i < dim2; i++) {
                arr2[i] = sc.nextDouble();
            }

            Vector v1 = new Vector(arr1);
            Vector v2 = new Vector(arr2);

            // Perform operations
            Vector sum = v1.add(v2);
            Vector diff = v1.subtract(v2);
            double dot = v1.dotProduct(v2);

            System.out.print("Vector 1 = ");
            v1.display();

            System.out.print("Vector 2 = ");
            v2.display();

            System.out.print("Addition = ");
            sum.display();

            System.out.print("Subtraction = ");
            diff.display();

            System.out.println("Dot Product = " + dot);

        } catch (VectorException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}