public class cwh_26_array {
    public static void main(String[] args) {
        int[] marks=new int[5];// defining the array and allocating the memory
        marks[0]=100;// assigning the values to the array elements
        marks[1]=96;
        marks[2]=78;
        System.out.println(marks[4]);// by default 0 is assigned to the array elements 
        //System.out.println(marks[24]);  (gives an error ArrayIndexOutofBound)
        // another way to declare and  initialise the array 
        int[] maths={34,49,45,56,67};// Declartion  +  Initilalization + memory allocation
        System.out.println(maths[3]);
    

    }
    
}
