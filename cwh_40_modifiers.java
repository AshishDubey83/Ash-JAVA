  class MyEmployee{
     private int id; // we can't directly Access private Access modifiers
     private String name;
     // We define the getters and the setters for accessing the private type modifiers
     /*We getter & setter since name me agr koi integer input krega to Code throws an ERROR
      and aur agr integer me string input krega to bhi Error dega since we defined
       setName as String and setid as integer  */
     // Defining the setName as the string 
     public void setName(String n){
        name=n; //we can also use this.name to setName 
     }
     // we define the getter for name 
     public String getName()
     {
        return name;
     }
    
      // defining the setters for the id
      public void setId(int i){
        id=i;
     }
     // we define the getter for id
     public int getid(){
        return id;
     }
}
public class cwh_40_modifiers {
    public static void main(String[] args) {
        /* since the name and id are Private access modifiers(can't we access directly )
         we can access them through the getters and the setters */
        MyEmployee Raman =new MyEmployee();
     /* Raman.id= 344;
        Raman.name = "Raman";  */ // Throws an Error due to private access modifiers
       Raman.setName("Ramandeep"); // we use setter to use the private modifiers 
       System.out.println(Raman.getName());// we use getter to access the private modifiers
       Raman.setId(353);
       System.out.println(Raman.getid());
    }
    
}
