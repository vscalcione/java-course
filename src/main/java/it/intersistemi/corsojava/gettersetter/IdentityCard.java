package it.intersistemi.corsojava.gettersetter;

import it.intersistemi.corsojava.consoleinput.ConsoleInputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdentityCard {

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Person person1 = new Person();

        String firstName = ConsoleInputString.readString(console, "Insert your first name: ");
        String lastName = ConsoleInputString.readString(console, "Insert your last name: ");
        String sex = ConsoleInputString.readString(console, "Insert your sex: ");
        String birthDate = ConsoleInputString.readString(console, "Insert your birth date: ");
        String fiscalCode = ConsoleInputString.readString(console, "Insert your fiscal code: ").toUpperCase();
        String email = ConsoleInputString.readString(console, "Insert your email: ");
        String phoneNumber = ConsoleInputString.readString(console, "Insert your telephone number: ");

        person1.setFirstName(firstName);
        person1.setLastName(lastName);
        person1.setSex(sex);
        person1.setBirthDate(birthDate);
        person1.setFiscalCode(fiscalCode);
        person1.setEmail(email);
        person1.setPhoneNumber(phoneNumber);

        printPerson(person1);
    }

    public static void printPerson(Person p){
        System.out.println(" ========= Dati Anagrafici ============= ");
        System.out.println("Nome: " + p.getFirstName() +
                "\nCognome: " + p.getLastName()
                + "\nSesso: " + p.getSex()
                + "\nData di nascita: " + p.getBirthDate()
                + "\nCodice Fiscale: " + p.getFiscalCode()
                + "\nEmail: " + p.getEmail()
                + "\nNumero di telefono: " + p.getPhoneNumber()
        );
        System.out.println(" ======================================= ");
    }

}
