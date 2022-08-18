
import java.util.Scanner;


public class perulangan1 {

    public static void main(String[] args) {
        String nama = "Ardhian Calwa Nugraha";
        int i = 6;
        int bilangan = 1;
        
        for(int j = 1;j <= i;j++){
            System.out.println("a");
        }
        Scanner input = new Scanner(System.in);
        while(bilangan!=0){
            System.out.println("Masukkan bilangan 0: ");
            bilangan=input.nextInt();
        }
        do{
            System.out.println(bilangan);
        }while(bilangan>=5);
    }
    
    
}
