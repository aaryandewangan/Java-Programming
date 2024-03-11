package OOPS;

class Student {
    int roll_no = 120;
    String name = "Aaryan";

    public void showInfo(){
        System.out.println("Roll No : "+roll_no);
        System.out.println("Name : "+name);
    }
    public static void main(String[] args) {
        Student obj = new Student();
        obj.showInfo();
   }
}