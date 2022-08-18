
package latihanukl;

import java.util.Scanner;

public class SeleksiKondisiPDAM {
    static int hitung(int nilai){
            int bayar=20000;
            nilai=nilai-10;
            
            if(nilai>10){
                bayar=bayar+30000;
                nilai=nilai-10;
            }else{
                bayar=bayar+3000*nilai;
                nilai=0;
            }
            
            if(nilai>10){
                bayar=bayar+40000;
                nilai=nilai-10;
            }else{
                bayar=bayar+4000*nilai;
                nilai=0;
            }
            
            if(nilai>10){
                bayar=bayar+3000*nilai;
            }
            return bayar;
    }
    
    public static void main(String[] args) {
        int id[]={1,2,3,4,5,};
        String namaPelanggan[]={"Ali", "Budi", "Dani", "Dani", "Umar"};
        
        Scanner myObj=new Scanner(System.in);
        System.out.println("Masukkan id pelanggan: ");
        String idIn=myObj.nextLine();
        int iId=Integer.valueOf(idIn);
        
        System.out.println("Masukkan jumlah tagihan");
        String tagihan=myObj.nextLine();
        int iTagihan=Integer.valueOf(tagihan);
        
        if(iTagihan<10){
            iTagihan=20000;
        }else{
            iTagihan=hitung(iTagihan);
        }
        
        iTagihan=iTagihan+10000;
        
        System.out.println("Print Out Tagihan");
        System.out.println("ID\t: "+idIn);
        System.out.println("Nama\t:"+namaPelanggan[iId-1]);
        System.out.println("Tagihan\t:Rp."+iTagihan+",-");
    }

}
