// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// logic if sum of row and column is even print 1 else 0

public class TriangularPattern12 {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println(" ");
        }
    }
}
