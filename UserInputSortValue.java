import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInputSortValue {

    public void Sort(){
        Scanner scan=new Scanner(System.in); //java.util Scanner use for user input
        ArrayList<Integer>ar=new ArrayList<Integer>(); //ArrayList
        System.out.println("Enter The Your Values");

        int x=scan.nextInt();
        int z= scan.nextInt();
        int y=scan.nextInt();

        ar.add(x); //Adding values
        ar.add(z);
        ar.add(y);
        System.out.println("Before The Sorting:"+" "+ar);

        System.out.println("Size of Array:"+" "+ar.size());//Print Array Size

        Collections.sort(ar);

        for(Integer i:ar){
            System.out.println(i); //Print ArrayList one by one
        }


    }

    public static void main(String[] args) {
        UserInputSortValue u=new UserInputSortValue(); //Create the Object because above method is not Static
        u.Sort(); // Call the method;
    }

}
