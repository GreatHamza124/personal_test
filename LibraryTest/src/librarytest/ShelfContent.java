/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarytest;

import java.util.ArrayList;

/**
 *
 * @author Hamza
 */
public class ShelfContent {

    ArrayList<Book> shelf = new ArrayList();
    
    public ShelfContent(){
        
    }
    
    public void addBook(Book book){
        shelf.add(book);
    }
    
    public void addBook(String title, int page, String author){
        Book book = new Book();
        book.setAuthor(author);
        book.setPage(page);
        book.setTitle(title);
        shelf.add(book);
    }
    
    public void removeBook(Book book){
        shelf.remove(book);
    }
    
    public String displayBook(String title){
        boolean bookFound = false;
        String display = "";
        for(int i = 0; i < shelf.size();i++){
            if (shelf.get(i).getTitle().equalsIgnoreCase(title)){
                display = shelf.get(i).toString();
                bookFound = true;
            }
        }
        if (bookFound == false){
            display = "Book not found";
        }
        return display;
    }
    
    public String displayBooks(){
        String displaybook = "============ Shelf ============\n";
        for (int i = 0; i < shelf.size(); i++){
            displaybook += (i+1) + ") " + shelf.get(i).toString() + "\n\n";
        }
        return displaybook;
    }
    

}
