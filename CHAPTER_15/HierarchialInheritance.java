public class HierarchialInheritance {
    public static void main(String[] args) {
      birds b=new birds();
      b.eat();  
      mammals m=new mammals();
      m.breathe();
    }
}
//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
//Derived Class  or  SubClass
class fish extends Animal{
    
    void swim(){
        System.out.println("Swims");
    }
}
class birds extends Animal{
    
    void fly(){
        System.out.println("fly");
    }
}
class mammals extends Animal{
    
    void walk(){
        System.out.println("walk");
    }
}
