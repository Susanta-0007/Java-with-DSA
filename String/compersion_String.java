 class compersion_String {
    public static void main(String[] args) {
        String s1="Susanta";
        String s2="Susanta";
        String s3=new String("Susanta");

        if(s1.equals(s2)){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are Not Equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are Not Equal");
        }
    }
}
