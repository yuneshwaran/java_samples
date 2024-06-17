import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
     //int i = 10;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter a integer: ");
     int i = s.nextInt();
     if (checker(i)==i){
        System.out.println("palindrome");
       }
        else{
        System.out.println("not palindrome");
     }
    // System.out.print(checker(i));
     s.close();       
    }       

    static int checker(int n){
        int tmp=n;
        int s=0;
        if (n!=0){
                while (n>0){
                    tmp = n%10;
                    s = s*10+tmp;
                    n = n/10;
                }
                return s;
            }
        else{
            return 0;
            }
    }

}
