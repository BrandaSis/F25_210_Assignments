package assn02;
import lec05.USMS.CsStudent;

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
}


class AllBooks {
    Scanner s = new Scanner(System.in);

    void menu() {
        boolean exit = false;
        do {
            System.out.println("Library Menu:");
            System.out.println("0. Exit");
            System.out.println("1. Add a book");
            System.out.println("2. Display All Books");
            System.out.println("3. Check Out a Book");
            System.out.println("4. Return a Book");
            System.out.println("Enter your choice:");
            int choice = s.nextInt();
            switch (choice) {
                case 0: {exit = true;                           break;   }
                case 1: {AddBook();                             break;   }
                case 2: {PrintAllBooks();                       break;   }
                case 3: {CheckoutBook();                        break;   }
                case 4: {ReturnBook();                          break;   }
                System.out.println("\nEnter your choice:");
                default: {System.out.println("Invalid choice. Try again."); break;   }
            }
        } while (!exit);
    }
    void AddBook() {
        LibBooks bk = new LibBooks();
        System.out.println("Enter book title:");
        bk._BName = s.next();
        System.out.println("Enter book author:");
        bk._AName = s.next();
        System.out.println("Book added to library!");
    }
}