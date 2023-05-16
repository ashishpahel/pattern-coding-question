// A 
// B C 
// C D E 
// D E F G

public class CharacterPattern4 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            char ch = (char)('A' + i-1);
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
