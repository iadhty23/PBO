/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123190158_d;
import java.util.Scanner;
/**
 *
 * @author Ilhamadhty
 */
public class Main {
    public static void main(String[] args) {
        String name, email, phoneNumber, search, menu;
        do{
            
        ContactsManager ContactsManager = new ContactsManager();
        
        name = "Dady";
        phoneNumber = "081326548455";
        email = "dady@gmail.com";
        Contact contact1 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact1);
   
        name = "Rifqi"; 
        phoneNumber = "081256878544";
        email = "iqi@outlook.co.id";
        Contact contact2 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact2);

        name = "Ican";
        phoneNumber = "08854687542";
        email = "ican@yahoo.co.id";
        Contact contact3 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact3);
        
        name = "Acid";
        phoneNumber = "081224975125";
        email = "acid@yahoo.co.id";
        Contact contact4 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact4);
        
        name = "Angga";
        phoneNumber = "081325469752";
        email = "angga@yahoo.co.id";
        Contact contact5 = new Contact(name, phoneNumber, email);
        ContactsManager.addContact(contact5);
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Search Name : "); search = input.nextLine();
        System.out.println("Looking for " + search + "'s contact . . .");

        Contact result = ContactsManager.searchContact(search.toLowerCase());
            if(result != null){
                System.out.println("Name        : " + result.getName());
                System.out.println("Phone Number: " + result.getPhoneNumber());
                System.out.println("E-mail      : " + result.getEmail());
            }else{
                System.out.println("Contact not found!");
            } 
            System.out.println("Again? (y/n) : ");  menu = input.nextLine();
            if("n".equals(menu)){
                System.exit(0);
            }
        } while (true);
    } 
}