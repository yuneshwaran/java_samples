public class Palindrome {
     public boolean isPalind(int i){
     if (palin(i)==i){
         return true;
       }
        else {
         return false;
     }
    }

    int palin(int n){
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
