class Guru{
        private int G;
        public void setG (int Guru){
            G = Guru;
        }
        
        public int getG(){
            return G;
        }
        
        public void tampilkanJumlah(){
            System.out.println("Jumlah Guru : "+getG());
        }
    }
class Perpustakaan extends Guru{
        private int B;
        public void setB (int Buku){
            B = Buku;
        }
        
        public int getB(){
            return B;
        }
        
        public void tampilkanJumlah(){
            super.tampilkanJumlah();
            System.out.println("Jumlah Buku di Perpustakaan :"+getB());
        }
}
class Karyawan extends Perpustakaan{
        private int K;
        public void setK (int Karyawan){
            K = Karyawan;
        }
        
        public int getK(){
            return K;
        }
             
        public void tampilkanJumlah(){
            super.tampilkanJumlah();
            System.out.println("Jumlah Karyawan :"+getK());
        }
}
class MatPel extends Karyawan{
        private int M;
        public void setM (int Matpel){
            M = Matpel;
        }
        
        public int getM(){
            return M;
        }
                
        public void tampilkanJumlah(){
            super.tampilkanJumlah();
            System.out.println("Jumlah Matpel :"+getM());
        }
}
class Siswa extends MatPel{
        private int S;
        public void setS (int Siswa){
            S = Siswa;
        }
        
        public int getS(){
            return S;
        }
                
        public void tampilkanJumlah(){
            super.tampilkanJumlah();
            System.out.println("Jumlah Siswa di Sekolah :"+getS());
        }
}
public class TugasPraktikum {
    public static void main(String[] args){
            Siswa obj = new Siswa();
            obj.setG(85);
            obj.setB(1290);
            obj.setK(90);
            obj.setM(15);
            obj.setS(3500);
            //akan memanggil method yang terdapat pada semua kelas
            obj.tampilkanJumlah();
            

    }
}
