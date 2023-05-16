//       1
//     1 2
//   1 2 3
// 1 2 3 4 

public class TriangularPattern8 {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){
            // inner loop for space
            for (int j = 1; j<=4-i; j++){
                System.out.print(" ");
            }

            // inner loop for number
            for(int j = 1; j<=i;j++){
                int num = j;
                System.out.print(num);
                num++;
            }

            System.out.println("");
        }
    }
}
