package it.intersistemi.corsojava.lambdaexpressions.exercises.library;

public class EmployeeA extends Employee {

    private int disease = 0;

    public EmployeeA(String id, double salary, double extraordinary, int disease) {
        super(id, salary, extraordinary);
        this.disease = disease;
    }

    public int getDisease() {
        return disease;
    }

    public void setDisease(int disease) {
        this.disease = disease;
    }

    @Override
    public double pay(int extraordinaryHours) {
        double pay = super.pay(extraordinaryHours);
        if(disease != 0){
            return pay = super.pay(extraordinaryHours) - disease * 15.0;
        }else{
            return pay;
        }
    }

    public void printDisease(){
        System.out.println(disease);
    }
}
