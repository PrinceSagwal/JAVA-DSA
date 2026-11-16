public class AbstractClass {
    public static void main(String[] args) {
         Mustang a=new Mustang();
        //  h.walk();
        //  chicken ch=new chicken();
        // ch.walk();
    }}
abstract class Animal{
    Animal(){
        System.out.println("ANimal Constructor Called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();//abb ye sab mei define hona chahiye
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void walk(){
        System.out.println("have 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor is called");
    }
}
class chicken extends Animal{
    
    void walk(){
        System.out.println("have 2 legs");
    }
}
