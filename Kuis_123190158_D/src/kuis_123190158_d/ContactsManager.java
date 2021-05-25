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
public class ContactsManager {
    Contact [] myFriends;
    int friendsCount;
    // Default Constructor:
    ContactsManager(){
        myFriends = new Contact[500];
        friendsCount = 0;
    }

    // Methods:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].getName().toLowerCase().equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
} 