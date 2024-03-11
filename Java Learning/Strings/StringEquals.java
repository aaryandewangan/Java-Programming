package Strings;

class StringEquals {
    public static void main(String[] args) {
        String s1 = "Ashish";
        boolean b = s1.equals("ashish");
        System.out.println(b);
        
        System.out.println(s1.equals("Ashish"));

        String s2 = "Prashant";
        boolean b1 = s1.equals(s2);

        System.out.println(b1);
    }
}
