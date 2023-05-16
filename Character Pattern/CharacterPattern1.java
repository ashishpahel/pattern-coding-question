// A B C D
// A B C D
// A B C D
// A B C D

public class CharacterPattern1 {
    public static void main(String[] args) {
        for(int i=1; i<=4;i++){
            for(int j=1;j<=4;j++){
                char ch = (char) ('A' + j-1);
                System.out.print(ch);
            }
            System.out.println(" ");
        }
        
    }
}
