import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        
        System.out.println("Welcome to the Great Library of Kalimdor!\n");
        
        App app = new App(); // creating an instance of the App class
        ListOfBooks listOfBooks = app.new ListOfBooks(); // creating an instance of the class
        listOfBooks.PrintTheBooks();
        UserAsksForBook userAsksForBook = app.new UserAsksForBook(listOfBooks);
        

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

        public String getName() {                   
            return name;
        }
        public boolean isAvailable() {
            return isAvailable;
        }
        
        public void setAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;

        }
        

        @Override
        public String toString() { //toString is a method's name for overriding 
            return "'" + name + "', author='" + author + "', yearPublished=" + yearPublished + ", isAvailable=" + isAvailable;
        }
    }

    public class ListOfBooks {
        private List<Book> books; // - field; List<Book>: The books field is a List that holds 'Book' objects. An ArrayList is used for dynamic resizing.

        public ListOfBooks(){
            this.books = new ArrayList<>(); // initialization of the Book list

            //firstly, creating a new Book object and then is adding this object to the books.list
            books.add(new Book("Ancient Tales of the Kaldorei", "Archivist Seralen (attributed)", -9500, true)); 
            books.add(new Book("The Wisdom of the Earthmother", "Chief Thunderhoof (attributed)", -1500, true)); 
            books.add(new Book("A Traveler's Guide to Un'Goro Crater and its Wonders", "Explorer's League Cartographers", 25, true)); 
            books.add(new Book("The War of the Sands", "Silithus Historians' Guild", 80, false)); 
            books.add(new Book("Echoes of the Long Hunt", "Bravehoof the Scribe",150, true)); 
 
        }

        public void PrintTheBooks(){

            System.out.println("Here is the list of our treasured books: \n");
            for(Book bookName : books) {
                System.out.println(bookName);
            }
        }   

        public List<Book> getBooks() {                                  
            return books;
        }
    }

    public class UserAsksForBook{
        private Scanner scanner;

        public UserAsksForBook(ListOfBooks listOfBooks) {
            this.scanner = new Scanner(System.in);
            

            while(true) {
                System.out.println();
                System.out.println("Please make your choice (or type 'exit' to quit):");
                String name = scanner.nextLine();
            
            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Will see you another time.");
                break;
            }
           
            boolean bookFound = false;
            for(Book book : listOfBooks.getBooks()) {
                if(book.getName().equalsIgnoreCase(name)){  
                    if(book.isAvailable()) {
                        System.out.println("Your book choice was " + book +"\n");
                        book.setAvailable(false);
                        System.out.println("This book has already been borrowed.");

                    }   else {
                        System.out.println("Sorry, this book is currently unavailable.");  
                    }             
                    bookFound = true;
                    break;
                  
                }
            }

            if (!bookFound) {
                System.out.println("Sorry, this book is not in our inventory");
            }    

           
        }

    scanner.close();
}
}


}






