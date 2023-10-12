/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarytest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hamza
 */
public class LibraryInterface {
    public static void main(String[] args) {
        ArrayList<ShelfContent> library = new ArrayList();
        LibraryCart libcart = new LibraryCart();
        Scanner scan = new Scanner(System.in);
        int input = 0;
        
        Book book1 = new Book("Life of Obama",340,"Obama");
        Book book2 = new Book("How to make Hamburger",3240,"Mr Crabs");
        Book book3 = new Book("Spiders",200,"Dr Tarantula");
        Book book4 = new Book("The Scary Cloud Monster",2314,"Mr Potter");
        Book book5 = new Book("The Even Scary Cloud Monster",512,"Mr Potter");
        Book book6 = new Book("History of Napolean Empire",670,"Dr Richard");
        Book book7 = new Book("The Best Book in the Entire World",45,"Mr Trump");
        Book book8 = new Book("How to do Calculus",18040,"Ms Boring");
        Book book9 = new Book("How to Improve Yourself",270,"Dr Tyson");
        Book book10 = new Book("Wrath of the Fire Lord",340,"Mr Brown");
        Book book11 = new Book("C++ Explainer",5000,"Mr Reeds");
        
        ShelfContent shelf1 = new ShelfContent();
        shelf1.addBook(book9);
        shelf1.addBook(book5);
        shelf1.addBook(book10);
        
        ShelfContent shelf2 = new ShelfContent();
        shelf2.addBook(book2);
        shelf2.addBook(book11);
        
        ShelfContent shelf3 = new ShelfContent();
        shelf3.addBook(book8);
        
        ShelfContent shelf4 = new ShelfContent();
        shelf4.addBook(book1);
        shelf4.addBook(book6);
        
        ShelfContent shelf5 = new ShelfContent();
        shelf5.addBook(book3);
        shelf5.addBook(book4);
        shelf5.addBook(book7);
        
        System.out.println(shelf5.displayBooks());
        libcart.addtoCart(book1);
        libcart.addtoCart(book4);
        libcart.addtoCart(book11);
        libcart.addtoCart(book7);
        
        System.out.println(libcart.displayCart());
        
        while(input != -1){
            System.out.print("Which shelf would you like to see sir:");
            input = scan.nextInt();
            switch(input){
                case -1:
                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                default:
                    System.out.println("Wrong input");
            }
            
            
        }
    }

}
