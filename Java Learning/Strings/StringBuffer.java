package Strings;

class StringBuffers {
    public static void main(String[] args) {
        // Conversion of String to String Buffer............
        String s1 = "Aaryan";
        StringBuffer sb1 = new StringBuffer(s1);
        System.out.println(sb1);
        
        // Conversion of StringBuffer to String.............
        StringBuffer sb2 = new StringBuffer("Aary");
        String s2 = sb2.toString();
        System.out.println(s2);
    }
}