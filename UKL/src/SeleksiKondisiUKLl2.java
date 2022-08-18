
import java.util.Scanner;


public class SeleksiKondisiUKLl2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan id mahasiswa:");
        int id = input.nextInt();
        System.out.println("Masukkan jumlah pendapatan:");
        long gaji = input.nextLong();
        System.out.println("Masukkan jumlah bulan untuk SPP:");
        int jumlahBulan = input.nextInt();
        
        /* define data */
        String nama[]={"Mira","Nina","Oemar","Pena"};
        String jalur[]={"SBMPTN","SNMPTN","Mandiri","SBMPTN"};
        String alamat[]={"Sawojajar","Kedungkandang","Ijen","Dinoyo"};
        
        //menghitung nomminal DSP
        long DSP = getDSP(jalur[id-1],gaji);
        long SPP = getSPP(jalur[id-1],gaji,jumlahBulan);
        long total = DSP+SPP;
        
        //print out
        System.out.println("----------------------------------");
        System.out.println("Nama \t: "+nama[id-1]);
        System.out.println("Alamat \t: "+alamat[id-1]);
        System.out.println("Jalur Masuk\t: "+jalur[id-1]);
        System.out.println("Nominal \t: "+total);
    }
    
    public static long getDSP(String jalur,long pendapatan){
        long sbmptn[]={500000,1500000,3000000};
        long snmptn[]={700000,1700000,3500000};
        long mandiri[]={1000000,2500000,5000000};
        
        int index=0;
        if(pendapatan < 2000000){
            index=0;
        }
        else if(pendapatan >= 2000000 && pendapatan <= 1000000){
            index=1;
        }
        else{
            index=2;
        }
        
        //seleksi jalur masuk
        if(jalur.equals("SBMPTN")){
            return sbmptn[index];
        }
        else if(jalur.equals("SNMPTN")){
            return snmptn[index];
        }
        else{
            return mandiri[index];
    } 
    }
    
    public static long getSPP(String jalur,long pendapatan,int jumlahBulan){
        long sbmptn[]={500000,1000000,2000000};
        long snmptn[]={500000,1000000,2000000};
        long mandiri[]={1000000,2000000,3000000};
        
        int index=0;
        if(pendapatan < 2000000){
            index=0;
        }
        else if(pendapatan >= 2000000 && pendapatan <= 1000000){
            index=1;
        }
        else{
            index=2;
        }
        
        //seleksi jalur masuk
        if(jalur.equals("SBMPTN")){
            return sbmptn[index]*jumlahBulan;
        }
        else if(jalur.equals("SNMPTN")){
            return snmptn[index]*jumlahBulan;
        }
        else{
            return mandiri[index]*jumlahBulan;
    } 
    }
}

