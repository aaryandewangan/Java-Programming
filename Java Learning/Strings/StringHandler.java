package Strings;

class StringHandler
{
    public static void main(String[] args) {
        String s1 = "Aaryan";
        String s2 = "Aaryan";
        System.out.println(s1==s2);

        String s3 = new String("Aaryan");
        String s4 = new String("Aaryan");
        System.out.println(s3==s4); 
    }
}