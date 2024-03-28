package entities;

public class Retangulo {

    public double width;
    public double height;

    public double calcArea(){
        return width * height;
    }

    public double calcPerimeter(){
        return 2 * (width + height);
    }

    public double calcDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String toString(){
        return "Area = "
                + String.format("%.2f%n", calcArea())
                + "Perimeter = "
                + String.format("%.2f%n", calcPerimeter())
                + "Diagonal = "
                + String.format("%.2f%n", calcDiagonal());
    }
}
