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

public class App { 

    static void AddPassword() {
        System.out.println("add");
    }

    static void ViewPassword() {
        System.out.println("view");
    }

    static void DelPassword() {
        System.out.println("del");
    }

    static void EditPassword() {
        System.out.println("edit");
    }

    static void ClearScreen() {
        // Clear the console screen and print the app header
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        // System.out.print("---------------Password Manager App ---------------\n");
    }

    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        int Option;

        while (true) {
            ClearScreen();
            System.out.printf("---------------Password Manager App ---------------\n");
            
            System.out.printf("1 - Add Password\n2 - View Password\n3 - Edit Password\n4 - Delete Password\n5 - Exit App\n->");
            Option = Scanner.nextInt();

            switch (Option) {
                case 1:
                    AddPassword();
                    break;
                case 2:
                    ViewPassword();
                    break;
                case 3:
                    EditPassword();
                    break;
                case 4:
                    DelPassword();
                    break;
                case 5:
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