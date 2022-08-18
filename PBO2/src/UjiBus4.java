
public class UjiBus4 {
    public static void main(String [] arg) {
        int password;
        
        //membuat objek busBesar dari class Bus
        Bus4 busBesar = new Bus4(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.getPenumpang(123);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.getPenumpang(121);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.getPenumpang(123);
        busBesar.cetak();
        
        System.out.println("Rata-rata Penumpang :"+busBesar.getAverage());
    }
}
