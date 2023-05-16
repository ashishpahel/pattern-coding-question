// A B C D
// B C D E 
// C D E F 
// D E F G


public class CharacterPattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            char ch = (char)('A' + i-1);
            for(int j=1;j<=4;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
