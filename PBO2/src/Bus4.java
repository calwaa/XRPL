
public class Bus4 {
    private double penumpang;
    private double maxPenumpang;
    private double penumpangBaru;
    private double counter;
    
    //konstruktor kelas Bus
    public Bus4(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;        
    }
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(double penumpang) {
        double temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    //password
    public void getPenumpang(double password){
        if(password==123){
            System.out.println("\nPassword Benar");
            addPenumpang(15);                    
        }else{
            System.out.println("\nPassword Salah!!!");
        }
    }
    public double getAverage(){
        return penumpang/counter;
    }       
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang);
    }
}
