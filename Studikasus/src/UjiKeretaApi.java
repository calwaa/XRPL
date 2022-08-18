
public class UjiKeretaApi {
    
    public static void main(String[] args){
        //membuat objek kereta dari kelas KeretaApi
        KeretaApi kereta = new KeretaApi(60);
        kereta.cetak();
        
        //Penamabahan penumpang
        kereta.getPenumpang(20);
        kereta.cetak();
        
        kereta.getPenumpang(20);
        kereta.cetak();
        
        kereta.getPenumpang(20);
        kereta.cetak();
        
        kereta.hargatTiket();
        
        kereta.namaPenumPang();
        
        System.out.println("Rata-rata penumpang :"+kereta.getAvarege());
    }
}
