package org.listasforeach.foreach;

public class ForEach {

    public static void main(String[] args) {

        String[] vect = new String[]{"Guima", "Gui", "Max"};

        for (int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("Duas formas de fazer, este é o ForEach");

        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
