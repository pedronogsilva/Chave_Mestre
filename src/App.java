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
    static final int id = 0;
    static final int appsite = 1;
    static final int typelogin = 2;
    static final int usernameemail = 3;
    static final int password = 4;
    //Variables


    static File DBFile = new File("PassWords.json");
    static int MaxSize;//the maximum size of the matrix on this exact instance of the code since the maximum amount of passowrd is dynamic. 

    static Scanner Scanner = new Scanner(System.in);
    static String AppSite = "";
    static String UserEmail = "";
    static String PassWord = "";
    static int EditID = 0; //temp
    static int DelPassword = 0;
    static ArrayList<ArrayList<String>> bd= new ArrayList<>();

    
    static void Start() {
        //check if the DB file exists, if it does, copies it and adds 10 slots to the matrix, if it doesn't creates it
        
    }

    static void SavePassword() {
        
    }

    static void AddPassword() {
        ArrayList<String> entrada  = new ArrayList<>();

            //Open the menu the adding and ask app or site
            ClearScreen();
            System.out.println("---------------Adding Password---------------\n");
            System.out.printf("What is the app or website\n->");
            AppSite = Scanner.nextLine();
            entrada.add(AppSite);

        //Ask waht type login is, it´s username.. or quick login
        ClearScreen();
        System.out.printf("---------------Adding Password---------------\n");
        System.out.printf("What type of login?\n1- Username/Email, Password\n2- Google, Facebook, etc\n->");
        String TypeLogin = Scanner.nextLine();
        entrada.add(TypeLogin);
        

        
        switch (TypeLogin) {
            case "1":
                //ask the username or email for login and save in "UserEmail"
                    ClearScreen();
                    System.out.printf("---------------Adding Password---------------\n");
                    System.out.printf("Username/Email:\n->");
                    UserEmail = Scanner.nextLine();
                    entrada.add(UserEmail);

                    //Ask the password and save in "PassWord"
                    if (UserEmail != "" && PassWord == "") {
                        System.out.printf("Password:\n->");
                        PassWord = Scanner.nextLine();
                        entrada.add(PassWord);
                    } 
                

                break;

            case "2":
                //Ask the quick login and save in the "username"
                while (UserEmail == "") {
                    ClearScreen();
                    System.out.printf("---------------Adding Password---------------\n");
                    System.out.printf("What's the quick login?\n->");
                    UserEmail = Scanner.nextLine();
                    entrada.add(UserEmail);
                }

                break;

            default:
                System.out.printf("Invalid Option! Please try again.\n");
                break;
        }
        bd.add(entrada);
    }

    static void ViewPassword() {
        System.out.println("---------------View Passwords---------------\n");
        System.out.print(bd);
        System.out.printf("\nPress Enter to return to the main menu...");
        Scanner.nextLine();

    }

    static void EditPassword() {

        while (EditID == 0) {
            //Ask what ID whant to edit, change for ID and not user/email or password
            ClearScreen();
            System.out.printf("---------------Edit Password---------------\n");
            System.out.printf("Choose the ID of the Password you wish to edit.\n->");
            EditID = Scanner.nextInt();
            Scanner.nextLine();
            
            if (EditID >= 0) { 
                //Change the old password for the new password
                ClearScreen();
                System.out.printf("---------------Edit Password---------------\n");
                System.out.printf("Password:\n->");
                PassWord = Scanner.nextLine();
            }
        }
    }

    static void DelPassword() {

        while (EditID == 0) {
            //Ask what ID whant to delete
            ClearScreen();
            System.out.printf("---------------Delete Password---------------\n");
            System.out.printf("Choose the ID of the Password you wish to delete.\n->");
            EditID = Scanner.nextInt();
            Scanner.nextLine();

            if (EditID >= 0) {
                ClearScreen();
                System.out.printf("---------------Delete Password---------------\n");
                System.out.printf("Are you sure you want to delete this passowrd()?\n1- Yes\n2- No\n->"/*, matrix[EditID,2]*/);
                DelPassword = Scanner.nextInt();
                Scanner.nextLine();
            }
        }
    }

    static void Exit() {
        ClearScreen();
        System.out.printf("GoodBye :)");
        
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