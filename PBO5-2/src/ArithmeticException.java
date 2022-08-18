
import java.util.Scanner;


public class ArithmeticException {

    public static void main(String[] args) {
        //int a=100;
    //     System.out.println("Enter the value for b");
         Scanner console = new Scanner(System.in);
	// int b = console.nextInt();
     
        System.out.println("Enter the value for c");
        try{
	int c = console.nextInt();
        int res=c/0;
        // 10/(b-c);
        System.out.println(" The result is "+res);
        }
        catch(java.lang.ArithmeticException e){
            System.out.println("adalah = "+e);
        }
    }

    ArithmeticException(String not_Eligible_for_voting) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
