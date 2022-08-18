
public class postTestPBO1 {
    public static void main(String[] args){
        int sisi,panjang,lebar,tinggi,jarijari;
        double luas,phi;
        
        sisi = 4;
        panjang = 8;
        lebar = 3;
        tinggi = 10;
        phi = 3.14;
        jarijari = 20;
        
        //Balok
        luas = 2 * ((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        System.out.println("Luas balok adalah : "+luas);
        //Kubus
        luas = 6 * sisi * sisi;
        System.out.println("Luas Kubus adalah : "+luas);
        //Kerucut
        luas = phi * jarijari *(jarijari + sisi);
        System.out.println("Luas Kerucut adalah : "+luas);
    }
}
