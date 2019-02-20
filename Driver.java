package Lab1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Driver {
    public static void main(String[] args) {
        Model jasper = new Model("Can","Jiang",true,false,90,183);
        System.out.println("Model's firstname : " + jasper.getFirstName());
        System.out.println("Model's lastname : " + jasper.getLastName());
        System.out.println("Model's weight : " + jasper.getWeight() + "KG");
        System.out.println("Model's height " + jasper.getHeight() + "CM");
        if(jasper.getCanTravel() == false) {
            System.out.println("He does not travel.");
        } else {
            System.out.println("He is a traveler.");
        }

        if(jasper.getSmokes() == false) {
            System.out.println("He does not smoke at all.");
        } else {
            System.out.println("He enjoys smoking!");
        }
    }
}
