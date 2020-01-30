package it.intersistemi.corsojava.generics.exercises;

public class Employee extends Person{

    private String idBankBranch;
    private String idOffice;

    public Employee(String name, String surname, Sex sex, String idBankBranch, String idOffice) {
        super(name, surname, sex);
        this.idBankBranch = idBankBranch;
        this.idOffice = idOffice;
    }

    public void transferMoney(String idBankBranch, String idOffice){
        this.idBankBranch = idBankBranch;
        this.idOffice = idOffice;
    }

    public String getIdBankBranch() {
        return idBankBranch;
    }

    public void setIdBankBranch(String idBankBranch) {
        this.idBankBranch = idBankBranch;
    }

    public String getIdOffice() {
        return idOffice;
    }

    public void setIdOffice(String idOffice) {
        this.idOffice = idOffice;
    }
}
