class classcreation{
    public void show(){
        System.out.println("Hi");
    }
}
class Useme{
    public static void main(String[] args){    
        classcreation test=new classcreation();
        test.show();
    }
}