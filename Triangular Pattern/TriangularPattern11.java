// * * * *
//   * * *
//     * *
//       *

public class TriangularPattern11 {
    public static void main(String[] args) {
        for(int i=4; i>=1;i--){
            // inner loop for spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            // inner loop for numbere
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
