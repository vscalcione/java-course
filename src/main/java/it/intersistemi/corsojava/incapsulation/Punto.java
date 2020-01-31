package it.intersistemi.corsojava.incapsulation;

public class Punto {

    private int coordinateX;
    private int coordinateY;

    public Punto() {
    }

    public Punto(int coordinateX, int coordinateY) {
        if(coordinateX >= 0 || coordinateY >=0 ){
            this.coordinateX = coordinateX;
            this.coordinateY = coordinateY;
        }
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(-16, 23);
        System.out.println("Coordinates are: " + p1.getCoordinateX() + ", " + p1.getCoordinateY());
        Punto[] arrayPunti = new Punto[] {
                new Punto(2, 10),
                new Punto(7,28),
                new Punto(25, 2)
        };
        for (Punto p : arrayPunti) {
            System.out.println("Coordinates are: " + p.getCoordinateX() + ", " + p.getCoordinateY());
        }
    }
}
