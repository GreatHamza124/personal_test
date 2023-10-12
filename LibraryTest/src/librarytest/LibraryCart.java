/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarytest;

/**
 *
 * @author Hamza
 */
public class LibraryCart {
    private ShelfContent cart = new ShelfContent();
    
    public LibraryCart(){
        
    }
    
    public LibraryCart(ShelfContent cart){
        setCart(cart);
    }

    public ShelfContent getCart() {
        return cart;
    }

    public void setCart(ShelfContent cart) {
        this.cart = cart;
    }
    
    public void addtoCart(Book book){
        cart.addBook(book);
    }
    
    public void removetoCart(Book book){
        cart.removeBook(book);
    }
    
    public String displayCart(){
        String displayCart = "============ Cart ============\n";
        for (int i = 0; i < cart.shelf.size();i++){
            displayCart += (i+1) + ") " + cart.shelf.get(i).toString() + "\n\n";
        }
        return displayCart;
    }
    
   
    
    
}
