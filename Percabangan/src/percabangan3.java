
import java.util.Scanner;


public class percabangan3 {
    public static void main(String[] args) {
        String identitas = "Ardhian Calwa Nugraha/03/XRPL3";
        System.out.println("Identitas : "+identitas);
        System.out.println("\nKomisi kepada Salesman\n");
        Scanner input = new Scanner(System.in);
        float jualbarang;
        
        System.out.println("Masukkan hasil jual barang= ");
        jualbarang = input.nextFloat();
        
        if(jualbarang > 500.000) {
            System.out.println("\nakan diberikan uang jasa sebesar Rp. 30.000 ditambah dengan uang komisi Rp. 20% dari pendapatan yangdiperoleh hari itu\n");
        }else
            System.out.println("\n");
    }
}
