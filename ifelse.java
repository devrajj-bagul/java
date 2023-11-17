import java.util.*;

public class ifelse {
    /**
     * @param args
     */
    public static void main(String args[]){

    Scanner sl = new Scanner (System.in);

       int age = sl.nextInt();
    // int age=15;

        if (age >=18){
            System.out.println("adult : drive, vote");
        }
        
        if( age>13 && age  <18){
            System.out.println(" Teneger");
        }

        else{
            System.out.println("Not adult");
        }
    }

    
}
