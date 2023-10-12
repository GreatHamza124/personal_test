/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarytest;

/**
 *
 * @author Hamza
 */
public class CustomerInterface {
    public static void main(String[] args) {
        LibraryContents lib = new LibraryContents();
        System.out.println("Welcome to the Library");
        Book mybook = new Book();
        mybook.setAuthor("Obama");
        mybook.setPage(230);
        mybook.setTitle("My Life");
        lib.addBook(mybook);
        System.out.println("Good Morning");
        System.out.println("Good Afternoon");
    }
    
}
