
public class String_Builder{

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        /*
         * O(26) -Times run the loop : for StringBuilder();
         * O(26*n^2)- Times run the loop : for normal String;
         */
        System.out.println(sb.toString());
    }
    
}
