// 1 
// 2 2 
// 3 3 3
// 4 4 4 4

public class TriangularPattern9 {
    public static void main(String[] args) {
        for(int i =1; i<=4; i++){
            int num = i;
            for(int j= 1; j<=i; j++){
                System.out.print(num);
            }
            System.out.println(" ");
        }
    }
}
