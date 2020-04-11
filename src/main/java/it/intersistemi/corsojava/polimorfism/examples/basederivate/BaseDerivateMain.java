package it.intersistemi.corsojava.polimorfism.examples.basederivate;

public class BaseDerivateMain {

    public static void main(String[] args) {
        firstTypeComparation();
        printIstances();
    }

    public static void firstTypeComparation(){
        Base base1 = new Base();
        Base base2 = new Base();
        Derivate derivate = new Derivate();

        System.out.println("base1.compareType(base2): " + base1.compareType(base2));
        System.out.println("base1.compareType(derivate): " + base1.compareType(derivate));
        System.out.println("base2.compareType(base1): " + base2.compareType(base1));
        System.out.println("base2.compareType(derivate): " + base2.compareType(derivate));
    }

    public static void printIstances(){
        Base b1 = new Base();
        Base b2 = new Base();
        printBase(b1);
        printBase(b2);
        printBase(new Derivate());
    }

    public static void printBase(Base b){
        if(b instanceof Derivate){
            Derivate d = (Derivate) b;
        }else{
            System.out.println(b);
        }
    }
}

