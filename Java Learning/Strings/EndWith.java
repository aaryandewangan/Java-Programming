package Strings;

class EndWith {
    public static void main(String[] args) {
        String s = "Aaryan";
        System.err.println(s.endsWith("n"));
        System.err.println(s.endsWith("an"));
        System.err.println(s.endsWith("A"));
        System.err.println(s.endsWith("Aar"));
        System.err.println(s.endsWith("yan"));
    }
}
