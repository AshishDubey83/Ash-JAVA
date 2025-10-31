class Base{
     public int x;
     public void printMe(){
        System.out.println("I am a Constructor");
    }
   // making getters and setters
   public int getX(){
    return x;
   }
   public void setX(int x){
    System.out.println("I am in base and setting x now");
    this.x=x;
   }
// We want to make a new class Derived which has all properties of class (Base + some more properties) we use Inhritance
// for Inhretance we use the keyword "extends"
class Derived extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}


}
public class cwh_45_Inheritance {
    public static void main(String[] args) {
        // Hm Derived class ka obj bna ke x set kr skte h aur Base class ka obj bna ke bhi
 
        // Creating an object of Base class 
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());     
        
        // Creating an Object of Derived class 

    /*    Derived d =  new Derived();
        d.setX(56);
        System.out.println(d.getX());  */
   // we can,t  access y by using Base class
        
    }
    
}
