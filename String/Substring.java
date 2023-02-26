public class Substring {

    public static String subString(String name,int si,int ei){
        String subStr="";
        for(int i=si;i<ei;i++){
            subStr+=name.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String name="HelloWorld";
        System.out.println(subString(name, 0, 5));
        System.out.println(name.substring(0, 5)); // Inbuild Function
        
    }
    
}
