// E 
// D E 
// C D E 
// B C D E
// A B C D E


public class CharacterPattern5 {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            char ch = (char)('E' - (i-1));
            for (int j=1; j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
