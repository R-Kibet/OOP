package org.exmp.OOP3;

//compostion - using classes inside other class//


public class Main {
    public static void main(String[] args) {
        Car merc = new Car("Merc b", 2 , "red", new Engine("vH", 8000));

        Engine engine = merc.getEngine();

        System.out.println("ENGINE  MODEL " + merc.getEngine().getModel());
    }
}
