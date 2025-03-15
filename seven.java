public class seven {
     public static void main(String[] args) {
 
         Library library = new Library(5);
 
         library.addBook(new PrintedBook("J.K. Rowling", "Harry Potter and the Sorcerer", 1997, 300));
         library.addBook(new EBook("Dan Brown", "The Da Vinci Code", 2003,500));
         library.addBook(new AudioBook("Malala Yousafzai", "I Am Malala", 2013, 354));
 
         library.displayBooks();
     }
 }