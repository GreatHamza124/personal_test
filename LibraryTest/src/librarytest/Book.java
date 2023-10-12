/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarytest;

/**
 *
 * @author Hamza
 */
public class Book {
    private String author;
    private int page;
    private String title;
    
    public Book(){
        
    }
    
    public Book(String title, int page, String author){
        setTitle(title);
        setPage(page);
        setAuthor(author);
        
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String toString(){
        return "Title: " + getTitle() + "\nPage: " + getPage() + "\nAuthor: " + getAuthor();
    }
}
