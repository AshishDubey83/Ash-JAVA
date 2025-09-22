// One java code have only one class 
// we an any no. of objects for the same class 
class Employee{
    int salary;
    int id;
    String name;
    // by this we can print the complete details of an Employees
    public void printDetails(){
        System.out.println("My ID is : "+ id);
        System.out.println("And My name is :"+ name);
    }
    //  making the function/method for the salary 
    public int getsalary(){
        return salary;
    }
}
public class cwh_38_customclass {
    public static void main(String[] args) {
        Employee Raman=new Employee();// Instantiating a new Employee Object
        // Setting the Attributes for Raman
        Raman.id=24;
        Raman.name="Raman";
        Raman.salary=40000;
        // let we have to add more Employees 
        // Setting the Attributes for Aman
        Employee Aman=new Employee();
        Aman.id=25;
        Aman.name="Aman";// here raman and aman are objects 
        Aman.salary=35000;
        // Printing the Attributes
        /*System.out.println(raman.id);
        System.out.println(raman.name);*/
        Raman.printDetails(); // prints all details about Raman
        int salary=Raman.getsalary();
        System.out.println(salary);
        Aman.printDetails();//  prints the all  details about Aman
        int salar=Aman.getsalary();
        System.out.println(salar);
    }
}
