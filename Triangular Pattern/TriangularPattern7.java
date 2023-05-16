//       *
//     * *
//   * * *
// * * * *

public class TriangularPattern7 {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){
            // inner loop for space
            for (int j = 1; j<=4-i; j++){
                System.out.print(" ");
            }

            // inner loop for number
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
