
public class UjiRelationLine {
    
    public static void main(String[] args){
        Line garis1 = new Line (1,2,3,4);
        Line garis2 = new Line (1,2,3,4);
        garis1.getLength();
        garis2.getLength();
        
        System.out.println("garis1 > garis2 = "+garis1.isGeater(garis1, garis2));
        System.out.println("garis1 < garis2 = "+garis1.isLess(garis1, garis2));
        System.out.println("garis1 == garis2 = "+garis1.isEqual(garis1, garis2));
    }
}
