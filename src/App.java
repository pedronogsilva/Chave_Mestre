/*
This code consists of a password manger app via Command Line Interface.
Starting Date: 15/11/2025 - Finish Date: "ongoing"

Versions: 0.1 - Initial version. 15/11/2025
In this version, we have to implement:
-Matrizes;
-If;
-For;
-While; ✓
-Functions; ✓
-Tipo variavel;
-long;
-random;
-file handling;
-"infinite" matrix;

I go to the bathroom fazer pipi.
*/

import java.util.Scanner;
import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class App { 
    static File MatrixJson = new File("PassWords.json");
    static Scanner Scanner = new Scanner(System.in);

    
    static void Start() {
        MatrixJson.createNewFile();

    }

    static void SavePassword() {
        
    }

    static void AddPassword() {
        //Open the menu the adding and ask app or site
        System.out.println("---------------Adding Password---------------\n");
        System.out.printf("What is the app or website\n->");
        String AppSite = Scanner.nextLine();

        //Ask waht type login is, it´s username.. or quick login
        ClearScreen();
        System.out.println("---------------Adding Password---------------\n");
        System.out.printf("What type of login?\n1- Username/Email, Password\n2- Google, Facebook, etc\n->");
        int TypeLogin = Scanner.nextInt();
        
        switch (TypeLogin) {
            case 1:
                //ask the username or email for login and save in "UserEmail"
                ClearScreen();
                System.out.println("---------------Adding Password---------------\n");
                System.out.printf("Username/Email:\n->");
                String UserEmail = Scanner.nextLine();

                //Ask the password and save in "PassWord"
                System.out.printf("Password:\n->");
                String PassWord = Scanner.nextLine();

                break;
            case 2:
                //Ask the quick login and save in the "PassWord"
                ClearScreen();
                System.out.println("---------------Adding Password---------------\n");
                System.out.printf("What's the quick login?\n->");
                PassWord = Scanner.nextLine();

                break;
            default:
                System.out.printf("Invalid Option! Please try again.\n");
                break;
        }

        
    }

    static void ViewPassword() {
        System.out.println("---------------View Passwords---------------\n");

    }

    static void DelPassword() {
        System.out.println("---------------Edit Password---------------\n");

    }

    static void EditPassword() {
        System.out.println("---------------Delete Password---------------\n");

    }

    static void Exit() {
        System.out.println("---------------Exit App---------------\n");
        
    }

    static void ClearScreen() {
        // Clear the console screen and print the app header
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        // System.out.print("---------------Password Manager App ---------------\n");
    }

    public static void main(String[] args) throws Exception {
        int Option;
        Start();
        

        while (true) {
            ClearScreen();

            // Application main menu
            System.out.printf("---------------Password Manager App---------------\n");
            System.out.printf("1 - Add Password\n2 - View Password\n3 - Edit Password\n4 - Delete Password\n5 - Exit App\n->");
            Option = Scanner.nextInt();

            switch (Option) {
                case 1:
                    AddPassword();
                    SavePassword();
                    break;
                case 2:
                    ViewPassword();
                    break;
                case 3:
                    EditPassword();
                    SavePassword();
                    break;
                case 4:
                    DelPassword();
                    SavePassword();
                    break;
                case 5:
                    Exit();
                    return ;
                default:
                    System.out.printf("Invalid Option! Please try again.\n");
                    break;
            }
        }
    }
}

/*  
Developers, Gil Pereira and Pedro Silva
*/