import java.util.*;
class Strings{

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
        // Strings are IMMUTABLE .
/* 
        Scanner input=new Scanner(System.in);
        String name;
        name=input.nextLine();

        System.out.println(name);

 */
       // Concatenation (Adding two Strings)
        String firstName="Susanta";
        String lastName="Gorai";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
 
        // Function Calls .
        printLetters(str);
    }
}