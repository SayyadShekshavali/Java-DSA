public class fandlOccurence {

    public static int first=-1;
      public static int last=-1;
    public static void FindFirstandLastOccurence(String s,int idx,char element){
        if(idx==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current=s.charAt(idx);
        if(current==element){
            if(first==-1){
            first=idx;
        }
        else{
            last=idx;
        }
    }
    FindFirstandLastOccurence(s, idx+1, element);
}
    public static void main(String[] args) {
        String s="aaphsnfdsdsaf";
        char element='a';
        FindFirstandLastOccurence(s,0, element);
        
    }
}
