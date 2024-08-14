import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class vowelRemove {
    public static void main(String[] args){
        String vow = "aeiouAEIOU";
        String res="";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String  : ");
        String inp = sc.nextLine();
        int l = inp.length();
        for(int i=1;i<l;i++){

            //save current and previous char at c1 and c2
            String c1 = String.valueOf(inp.charAt(i-1));
            String c2 = String.valueOf(inp.charAt(i));

            //check vowel in i
            if(vow.contains(c1)){

                //check vowel in i and previous
                if (vow.contains(c2)){
                    res+=c1;
                    res+=c2;
                }
                else{

                }
            }
            else {
                res+= inp.charAt(i-1);
            }

        }
//print result
        System.out.println(res);

    }}
