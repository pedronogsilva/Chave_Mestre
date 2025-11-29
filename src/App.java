/*
This code consists of a password manger app via Command Line Interface.
Starting Date: 15/11/2025 - Finish Date: "ongoing"

Versions: 0.1 - Initial version. 15/11/2025
Versions: 0.1.2 - Initial version. 16/11/2025
In this version, we have to implement:
-Matrizes;
-If;✓
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

//import of all the libraries needed for the project
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import javax.lang.model.type.NullType;
// import com.google.gson.Gson;
import javax.sound.midi.SysexMessage;


public class App { 
    //Matrix positions
    static final int site = 0;
    static final int login = 1;
    static final int user = 2;
    static final int pass = 3;
    //Variables


    static File DBFile = new File("PassWords.json");
    static int MaxSize;//the maximum size of the matrix on this exact instance of the code since the maximum amount of passowrd is dynamic. 

    static Scanner Scanner = new Scanner(System.in);
    static ArrayList<ArrayList<String>> bd= new ArrayList<>();

    
    static void Start() {
        //check if the DB file exists, if it does, copies it and adds 10 slots to the matrix, if it doesn't creates it
        
    }

    static void SavePassword() {
        
    }

    static void AddPassword() {
        ArrayList<String> entrada  = new ArrayList<>();
        String add;

        //Open the menu the adding and ask app or site
        ClearScreen();
        System.out.println("---------------Adding Password---------------\n");
        System.out.printf("What is the app or website\n->");
        add = Scanner.nextLine();
        entrada.add(add);

        //Ask waht type login is, it´s username.. or quick login
        ClearScreen();
        System.out.printf("---------------Adding Password---------------\n");
        System.out.printf("What type of login?\n1- Username/Email, Password\n2- Google, Facebook, etc\n->");
        add = Scanner.nextLine();
        entrada.add(add);
        
        switch (add) {
            case "1":
                //ask the username or email for login and save in "UserEmail"
                ClearScreen();
                System.out.printf("---------------Adding Password---------------\n");
                System.out.printf("Username/Email:\n->");
                add = Scanner.nextLine();
                entrada.add(add);

                //Ask the password and save in "PassWord"
                System.out.printf("Password:\n->");
                add = Scanner.nextLine();
                entrada.add(add);
                break;

            case "2":
                //Ask the quick login and save in the "username"
                    ClearScreen();
                    System.out.printf("---------------Adding Password---------------\n");
                    System.out.printf("What's the quick login?\n->");
                    add = Scanner.nextLine();
                    entrada.add(add);
                break;

            default:
                System.out.printf("Invalid Option! Please try again.\n");
                break;
        }
        bd.add(entrada);
    }

    static void ViewPassword() {
        ClearScreen();
        System.out.println("---------------View Passwords---------------\n");
        for (int i = 0; i < bd.size();i++){
            if (bd.get(i).get(login).equals("1")){            
                System.out.printf("\nSite: %s\tUser: %s\tPassWord: %s\t",bd.get(i).get(site),bd.get(i).get(user),bd.get(i).get(pass));
            }else{System.out.printf("\nSite: %s\tLogin Rápido: %s", bd.get(i).get(site), bd.get(i).get(user));}
        }
        
        /*
        System.out.println("---------------View Passwords---------------\n");
        System.out.print(bd);
        */
        System.out.printf("\n\n\nPress Enter to return to the main menu...");
        Scanner.nextLine();
    }

    static void EditPassword() {
        String Edit;
        int i = 0; 

        //Ask what ID whant to edit, change for ID and not user/email or password
        ClearScreen();
        System.out.printf("---------------Edit Password---------------\n");
        System.out.printf("Choose the name of the site/app you wish to edit.\n->");
        Edit = Scanner.nextLine();
        
        //get the matrix line for the specific password
        while(!bd.get(i).get(site).equals(Edit)){
            i++;
        }

        //Change the old password for the new password
        ClearScreen();
        System.out.printf("---------------Edit Password---------------\n");
        System.out.printf("Old PassWord:  %s\n", bd.get(i).get(pass));
        System.out.printf("New PassWord:\n->");
        Edit = Scanner.nextLine();
        bd.get(i).set(pass, Edit);
    }

    static void DelPassword() {

    }

    static void Exit() {
        ClearScreen();
        System.out.printf("GoodBye :)");
    }

    static void ClearScreen() {
        // Clear the console screen and print the app header
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void GeneratePassword(){
        
    }

    public static void main(String[] args) throws Exception {        
        int Option;

        Start();

        while (true) {
            ClearScreen();

            // Application main menu
            System.out.printf("---------------Password Manager App---------------\n");
            System.out.printf("1 - Add Password\n2 - View Password\n3 - Edit Password\n4 - Generate PassWord\n5 - Exit App\n->");
            Option = Scanner.nextInt();
            Scanner.nextLine();

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
                    return;
                case 6:
                    GeneratePassword();
                    break;
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