package assn02;
import java.util.Scanner;

public class LMS {
    public static void main (String[] args){
        AllBooks book = new AllBooks();
        book.menu();
    }
}

class LibBooks{
    String _BName;
    String _AName;
    boolean _Checkout = false;
}


class AllBooks {
    Scanner s = new Scanner(System.in);
    LibBooks[] library = new LibBooks[5];
    int count = 0;

    void menu() {
        boolean exit = false;
        do {
            System.out.println("Library Menu:");
            System.out.println("0. Exit");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Check Out a Book");
            System.out.println("4. Return a Book");
            System.out.println("Enter your choice:");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 0: { System.out.println("Bye for now!");
                    exit = true;                                break;   }
                case 1: {AddBook();                             break;   }
                case 2: {PrintAllBooks();                       break;   }
                case 3: {CheckoutBook();                        break;   }
                case 4: {ReturnBook();                          break;   }
                default: {System.out.println("Invalid choice. Try again."); break;   }
            }
        } while (!exit);
    }
    void AddBook() {
        if (count >= library.length) {
            System.out.println("Book not added. Library is full!");
            return;
        }
        LibBooks bk = new LibBooks();
        System.out.println("Enter book title:");
        bk._BName = s.nextLine();
        System.out.println("Enter book author:");
        bk._AName = s.nextLine();
        library[count++] = bk;
        System.out.println("Book added to library!");
    }
    void CheckoutBook(){
        System.out.println("Enter book number to check out:");
        int num = s.nextInt();
        s.nextLine();
        if (num < 1 || num > count){
            System.out.println("Invalid book number!");
        } else {
            library[num-1]._Checkout = true;
            System.out.println("Book checked out successfully!");
        }
    }
    void ReturnBook() {
        System.out.println("Enter book number to return:");
        int num = s.nextInt();
        s.nextLine();

        if (num < 1 || num > count) {
            System.out.println("Invalid book number!");
        } else {
            library[num - 1]._Checkout = false;
            System.out.println("Book returned!");
        }
    }
    void PrintAllBooks() {
        if (count == 0) {
            return;
        }
        System.out.println("Books in Library:");
        for (int i = 0; i < count; i++) {
            LibBooks b = library[i];
            String status = b._Checkout ? "Yes" : "No";
            System.out.println((i + 1) + ". Title: " + b._BName
                    + ", Author: " + b._AName
                    + ", Checked Out: " + status);
        }
    }
}