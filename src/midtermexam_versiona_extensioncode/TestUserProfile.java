/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author yacob
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to create a new profile? (yes or "
                + "no)");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Comedy, Drama, Action, Mystery (pick 1): ");
            String genre = input.nextLine();
            UserProfile profile = new UserProfile(name, genre);
            System.out.println(profile.getUserID() +", your profile was created"
                    + ". Enjoy your " + profile.getGenre() + " movies!");
        }
        
    }
}
