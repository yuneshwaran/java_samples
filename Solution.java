
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numSuffix suf = new numSuffix();
        int [] age = {5,4,3,2,1};
        System.out.print("Enter target to search: ");
        int tar = sc.nextInt();
        int index = 1;
        sc.close();
        for(int num : age){
        if(num==tar) {
            System.out.println("Target is "+ index+suf.suffix(index)+" in array");
        }
        else {
            System.out.println("Not Found");
        }
        index++;
        }

        }
    }

