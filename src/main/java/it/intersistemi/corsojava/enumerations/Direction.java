package it.intersistemi.corsojava.enumerations;

public enum Direction {

    NORD (0, 'N', 2 * Math.PI),
    SUD (180, 'S', Math.PI),
    EST (270, 'E', ((Math.PI * 3) / 2)),
    OVEST (90, 'O', (Math.PI / 2));

    private int grades;
    private char direction;
    private double radius;

    Direction() {
    }

    Direction(int grades, char direction, double radius) {
        this.grades = grades;
        this.direction = direction;
        this.radius = radius;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Direction direction = Direction.EST;
        System.out.println("**********************");
        System.out.println(direction + " ===> " + direction.getDirection());
        System.out.println("**********************");
    }
}
