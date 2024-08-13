package lec4;
public class Book { 
    String title;
    boolean borrowed;
    public class baby
    {
    };
    public Book(String bookTitle) {
        title=bookTitle; 
    } 
    public void borrowed() { 
        borrowed=true;
    } 
    // Marks the book as not rented 
    public void returned() { 
        borrowed=false;
    } 
    // Returns true if the book is rented, false otherwise 
    public boolean isBorrowed() { 
        return this.borrowed;
    } 
    public String getTitle() { 
    // Implement this method 
        return this.title;
    } 
    public static void main(String[] arguments) { 
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    } 
}
/*
    Title (should be The Da Vinci Code): The Da Vinci Code
    Rented? (should be false): false
    Rented? (should be true): true
    Rented? (should be false): false
 */