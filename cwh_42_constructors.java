class MyMainEmployee{
    private int id;
    private String name;
    // by using the Constructors we can pass name & class as we define the class
    public MyMainEmployee(String myName, int myId){
        id=myId;
        name=myName;
    }
    // if we only pass the name then we get id=13 by default and the what we entered 
    public MyMainEmployee(String myName){
        id=13;
        name=myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}

// Overloading means ek hi name ke methods ko different diferrent no. of arguments se bna dete h they get selected as we pass arguments 
// here we overloaded myMainEmployee constructer in this code
// Constructers can we overloaded just like other methods in java
public class cwh_42_constructors {
    public static void main(String[] args){
      /* MyEmployee Aman =new MyEmployee();// 
        Aman.setName("Aman"); // without constructors we need to define id & name for each clas
        Aman.setId(45);
        System.out.println(Aman.getName());
        System.out.println(Aman.getId());*/
        // now by the help of the constructors we can directly pass name&Id to class
        MyMainEmployee Aman=new MyMainEmployee("Aman",45);
        MyMainEmployee Raman=new MyMainEmployee("Raman");
        System.out.println(Aman.getId());
        System.out.println(Aman.getName());
        System.out.println(Raman.getName());
        System.out.println(Raman.getId());// by fdefault wle se id milega 
    }
    
}
