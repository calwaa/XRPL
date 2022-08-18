
public class TestSiswa {
    public static void main(String [] arg){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");
        
        System.out.print("Name : "+ siswa.getName()
        + " Absen : "+ siswa.getAbsen()+
        " Address : "+ siswa.getAddress());
    }
}
