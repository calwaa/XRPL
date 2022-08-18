
public class MainBola {
    public static void main(String[] args){
        double Jarijari=14;
        Bola objekbola;
        objekbola = new Bola(7);
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
        System.out.println("\n\n");
        objekbola.setJarijari(Jarijari);
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
    }
}
