
public class Bola {
    private double jarijari;
    public Bola(double jarijari){
        this.jarijari=jarijari;
    }
    public void setJarijari(double jarijari){
        this.jarijari=jarijari;
    }
    public void showDiameter(){
        System.out.println("Diameter Bola :"+2*jarijari);
    }
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan Bola :"+(4/3*Math.PI*Math.pow(jarijari, 3)));
    }
    public void showVolume(){
        System.out.println("Volume Bola :"+(4*Math.PI*Math.pow(jarijari, 2)));
    }
}
