package it.intersistemi.corsojava.lambdaexpressions.exercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

    public static enum Sex{
        MEN,
        WOMAN
    };

    private String name;
    private String emailAddress;
    private LocalDate birthday;
    private Sex sex;

    public Person(String name, String emailAddress, LocalDate birthday, Sex sex) {
        super();
        this.name = name;
        this.emailAddress = emailAddress;
        this.birthday = birthday;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge(){
        if(this.birthday != null){
            LocalDate now = LocalDate.now();
            return Period.between(birthday, now).getYears();
        }else{
            return null;
        }
    }

    public String printPerson(){
        return "Person{" + "name='" + name + '\'' + ", emailAddress='" + emailAddress + '\'' + ", birthday=" + birthday + ", sex=" + sex + '}';
    }
}
