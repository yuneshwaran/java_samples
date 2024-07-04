public class numSuffix {
    public String suffix(int num){
        String[] suf = {"rd","st","nd"};
        int last = num%10;
        int lastTwo = num%100;
        if (lastTwo >= 11 & lastTwo <=20){
            return "th";
        }
        switch (last){
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}
