import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        
        System.out.println("Welcome to the Great Library of Kalimdor!");
        
        App app = new App(); // creating an instance of the App class
        ListOfBooks listOfBooks = app.new ListOfBooks();
        UserAsksForBook userAsksForBook = app.new UserAsksForBook();
        

    }

    public class Book {
        private String name;
        private String author;
        private int yearPublished;
        private boolean isAvailable;

        public Book (String name, String author, int yearPublished, boolean isAvailable){
            this.name = name;
            this.author = author;
            this.yearPublished = yearPublished;
            this.isAvailable = isAvailable;
        }

    }

    public class ListOfBooks {
        private List<Book> books; // - field; List<Book>: The books field is a List that holds 'Book' objects. An ArrayList is used for dynamic resizing.

        public ListOfBooks(){
            this.books = new ArrayList<>(); // initialization of the Book list

            //firstly, creating a new Book object and then is adding this object to the books.list
            books.add(new Book("Ancient Tales of the Kaldorei: Volume I", "Archivist Seralen (attributed)", -9500, true)); 
            books.add(new Book("The Wisdom of the Earthmother: Teachings of the Tauren", "Chief Thunderhoof (attributed)", -1500, true)); 
            books.add(new Book("A Traveler's Guide to Un'Goro Crater and its Wonders", "Explorer's League Cartographers", 25, true)); 
            books.add(new Book("The War of the Sands: Chronicles of the Ahn'Qiraj Conflict", "Silithus Historians' Guild", 80, false)); 
            books.add(new Book("Echoes of the Long Hunt: Tauren Oral Traditions (Transcribed)", "Bravehoof the Scribe",150, true)); 
 
        }

        public void PrintTheBooks(){

            for(Book bookName : books) {
                System.out.println(bookName);
            }
        }   
    }

    public class UserAsksForBook{
        private Scanner scanner;

        public UserAsksForBook(){
            System.out.println("Please make your choice:");
            this.scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Your book choice was " + name); 
            scanner.close();
        }





    }

}






