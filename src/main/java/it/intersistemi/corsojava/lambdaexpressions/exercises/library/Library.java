package it.intersistemi.corsojava.lambdaexpressions.exercises.library;


import java.io.IOException;

public class Library {

    private String productTitle;
    private int publicationYear;
    private Data loanStartDate;
    private Data loanEndDate;
    private String firstNameUser;
    private String lastNameUser;

    public Library(String productTitle, int publicationYear, Data loanStartDate, Data loanEndDate, String firstNameUser, String lastNameUser) {
        this.productTitle = productTitle;
        this.publicationYear = publicationYear;
        this.loanStartDate = loanStartDate;
        this.loanEndDate = loanEndDate;
        this.firstNameUser = firstNameUser;
        this.lastNameUser = lastNameUser;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Data getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(Data loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public Data getLoanEndDate() {
        return loanEndDate;
    }

    public void setLoanEndDate(Data loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    public String getFirstNameUser() {
        return firstNameUser;
    }

    public void setFirstNameUser(String firstNameUser) {
        this.firstNameUser = firstNameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public int loadPeriod(Data loanStartDate, Data loanEndDate){
        return loanEndDate.getDifference(loanStartDate);
    }

    public static void main(String[] args) throws IOException {
        Library dvd1 = new Library("Titanic", 1998 , new Data (21,10,2017), Data.dataNow(), "Alessio", "Fabio");
        int d = dvd1.loadPeriod(dvd1.getLoanEndDate(), dvd1.getLoanStartDate());
        System.out.println(d);
    }
}
