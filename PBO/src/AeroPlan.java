
public class AeroPlan extends Vehicle {
    
    public void walk(){
        System.out.println("AeroPlan is Flying");
    }
    public void fuel(){
        System.out.println("Fuels");
    }
    public static void main(String[] args){
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
