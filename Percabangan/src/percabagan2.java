
import java.util.Scanner;


public class percabagan2 {
    public static void main(String[] args) {
        System.out.println("\nPotoongan dari pembelian barang\n");
        Scanner input = new Scanner(System.in);
        float potongan;
        
        System.out.println("Masukkan total pembelian = Rp ");
        potongan=input.nextFloat();
        if(potongan > 50.000) {
            System.out.println("\nPotongan yang diterima sebesar 20% dari total pembelian\n");
        }else
            System.out.println("\nTidak ada potongan\n");
    }
}
