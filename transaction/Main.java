import java.util.*;
import controller.*;
import hook.*;
import model.*;

/**
 * Nama : Tofik hidayat
 * NIM  : 20200040056
 * Keas : TI20C
 */


public class Main {
    static ArrayList<Book> books = new ArrayList<Book>();
    static ArrayList<Student> students = new ArrayList<Student>();
    static ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    
    public static void main(String[] args) {
        String wantToInsertMore = "y";
        // seed
        Seed.seedStudent(students);
        Seed.seedBook(books);
        Seed.seedTransaction(transactions, books, students);
        // clear console
        Util.clearConsole();
        Scanner scanner = new Scanner(System.in);
        while(wantToInsertMore.toLowerCase().equals("y")) {
            // show menu
            Util.showMenu();
            System.out.print("\n");
            String propmtMenu = Util.promptMenu("Choose menu : ", scanner);
            switch(propmtMenu) {
                // student block
                case "1" :
                    StudentController.viewAllStudent(students);
                    break;
                case "2" :
                    StudentController.addStudent(scanner, students);
                    System.out.println("Bashasil menginput data");
                    break;
                case "3" :
                    StudentController.removeStudent(scanner, students);
                    break;
                // book block
                case "4" :
                    BookController.viewAllBook(books);
                    break;
                case "5" :
                    BookController.addBook(scanner, books);
                    break;
                case "6" :
                    BookController.removeBook(scanner, books);
                    break;
                // transaction block
                case "7" :
                    TransactionController.viewAllTransaction(transactions);
                    break;
                case "8" :
                    TransactionController.addTransaction(scanner, transactions, students, books);
                    break;
                case "9" :
                    TransactionController.removeTransaction(scanner, transactions);
                    break;
                default :
                    wantToInsertMore = "n";
            }
        }
        scanner.close();
        System.out.println("\n======== End Action ========");   
    }
}