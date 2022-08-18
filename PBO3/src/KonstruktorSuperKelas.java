class Person{
        private String nama;
        private int usia;

        //Konstruktor
        public Person (String nama,int usia){
            this.nama = nama;
            this.usia = usia;
        }
        //Method 
        public void info(){
            System.out.println("Nama :"+this.nama);
            System.out.println("Usia :"+this.usia);
        }
    }
class Employ extends Person{
        private String noKaryawan;
        //Konstruktor
        public Employ(String noKaryawan,String nama,int usia){
            super(nama,usia);
            this.noKaryawan = noKaryawan;
        }
        //Method 
        public void info(){
            System.out.println("No. Karyawan :"+this.noKaryawan);
            super.info();
        }
    }
public class KonstruktorSuperKelas {
    public static void main (String [] args){
        Employ programer1 = new Employ ("12345678","Yanto",32);
        programer1.info();
    }
}
