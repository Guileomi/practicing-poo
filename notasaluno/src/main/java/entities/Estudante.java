package entities;

public class Estudante {

    public String name;

    public double nota1;

    public double nota2;

    public double nota3;

    public double totalValue(){
        return nota1 + nota2 + nota3;
    }

    public double missingPoint(){
        if(totalValue() < 60.0){
            return 60.0 - totalValue();
        }
        else {
            return 0.0;
        }
    }

}
