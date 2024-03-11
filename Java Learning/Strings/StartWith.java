package Strings;

class StartWith {
    public static void main(String[] args) {
        String s = "Aaryan";
        System.out.println(s.startsWith("A"));
        System.out.println(s.startsWith("Aa"));
        System.out.println(s.startsWith("Aaryan"));
        System.out.println(s.startsWith("aaryan"));
        System.out.println(s.startsWith("yen"));
    }
}