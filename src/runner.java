public class runner {
    //warmup1
    public boolean hasTeen(int a, int b, int c) {
        if(a>=13 && a<20 || b>=13 && b<20 || c>= 13 && c<20){
            return true;
        }else{
            return false;
        }
    }
    //warmup2
    int countXX(String str) {
        int total=0;
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx")){
                total++;
            }
        }
        return total;

    }


    //string 1
    public String helloName(String name) {
        return ("Hello " + name + "!");
    }
    //array 1
    public boolean sameFirstLast(int[] nums) {
        if(nums.length>0 && nums[0] == nums[nums.length-1]){
            return true;
        }else{
            return false;
        }
    }
    //string 2
    public boolean bobThere(String str) {
        for( int i=0; i< str.length()-2; i++){
            if(str.substring(i, i+1).equals("b") && str.substring(i+2, i+3).equals("b")){
                return true;
            }
        }
        return false;
    }
    //string 3
    public int countTriple(String str) {
        int count=0;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i, i+1).equals(str.substring(i+1, i+2)) && str.substring(i+1, i+2).equals(str.substring(i+2, i+3))){
                count=count+1;
            }
        }
        return count;
    }
    //array 2
    public int countEvens(int[] nums) {
        int count= 0;
        for ( int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    //array 3
    public int countClumps(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length-1; i++){
            if((nums[i])==(nums[i+1]) && ( i==0 || nums[i] != nums[i-1] )){
                count=count+1;
            }
        }
        return count;
    }

    //logic 1
    public boolean love6(int a, int b) {
        if(a==6 || b==6 || (a+b==6) || (a-b==6) || (b-a==6)){
            return true;
        }else{
            return false;
        }

    }

    //logic 2
    public int luckySum(int a, int b, int c) {
        int sum=0;
        if(a==13){
            sum= 0;
        }
        if(b==13){
            sum= a;
        }

        if((c==13) && a!=13 && b!=13 ){
            sum= a+b;
        }
        if(a!=13 && b!=13){
            sum =a +b +c;
        }
        return sum;
    }
    //ap 1
    public boolean scores100(int[] scores) {
        for( int i=0; i<scores.length-1; i++){
            if(scores[i]==100 && scores[i+1]==100){
                return true;
            }
        }
        return false;
    }


}
