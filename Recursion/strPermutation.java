public class strPermutation {

    public static void generatePermutation(String str,String result){
        if(str.length()==0){
            System.out.print(" "+result);
            return;
        }
        for (int i = 0; i <str.length(); i++) {
         char currChar=str.charAt(i);
         String combo=str.substring(0, i)+str.substring(i+1);
         generatePermutation(combo, result+currChar);
            
        }
    }
    public static void main(String[] args) {
        String str="abc";
        String result="";
        generatePermutation(str,result);
    }
}
