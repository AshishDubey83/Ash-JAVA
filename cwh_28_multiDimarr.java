public class cwh_28_multiDimarr {
    public static void main(String[] args) {
        // MUlTI-DIMENSIONAL ARRAYS IN JAVA
        //1. One-Dim array
        int [] marks={78,89,88};
        System.out.println(marks[2]);
        // 2. Two-Dim array
        int[][] flats;
        flats=new int[2][3]; // yha 2 ghr h aur 3 floor h in each ghr
        flats[0][0]=101; // means ground floor ka 1st ghr
        flats[0][1]=102;// means ground floor ka 2nd ghr
        flats[0][2]=103;// means ground floor ka 3rd ghr
        flats[1][0]=201;// means 1st floor ka 1st ghr
        flats[1][1]=202;// means 1st floor ka 2nt ghr
        flats[1][2]=203;// means 1st floor ka 3rd ghr
        //Displaying the elements of the 2d array
        System.out.println("Printing the 2d array using for loop:");
        for(int i=0;i<flats.length;i++){
            for( int j=0;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
