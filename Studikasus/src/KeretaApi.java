public class KeretaApi {
    
    private double penumpang;
    private double maxPenumpang;
    private double penumpangBaru;
    private double counter;
    private double hargaTiket;
    private char namaPenumpang;
    
    public KeretaApi(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;        
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        double temp;
        temp = (this.penumpang+penumpang);
        if(temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    public void getPenumpang(int penumpang){
        this.penumpang = penumpang;
        addPenumpang(10);
        
    }
    public double getAvarege(){
        return penumpang/counter;
    }
    public double hargatTiket(){
        System.out.println("Harga tiker = 15.000");
        return hargaTiket;
    }
    public char namaPenumPang(){
        System.out.println("Nama Penumpang = Ardhian Calwa Nugraha");
        return namaPenumpang;
    }
    public void cetak(){
        System.out.println("Penumpang Kereta sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}
