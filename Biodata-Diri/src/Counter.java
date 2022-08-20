
import java.util.Scanner;
public class Counter {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.print("Masukkan batas bilangan :");
        int batas = input.nextInt();
        int hasil = 0;
        for(int i=1;i<=batas;i++)
        hasil+=i;
        System.out.println("Total jumlahnya adalah :"+hasil);
    }
}
