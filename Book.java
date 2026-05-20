
package com.mycompany.book;

public class Book {

    public static void main(String[] args) {
        
        Books B1 = new Books("Legend", "Shahram", 300, 200);
       
        B1.openbook();
        B1.tostart();
        B1.close();
        System.out.println("----------------------------------------");
        System.out.println(B1);
  
        
    }
}

class Books{
    String name;
    String author;
    int pages;
    int prise;
   

   void openbook(){
   
       System.out.println("The "+this.name+ " book is open!");
   }    
   
   void tostart(){
   
       System.out.println("The book is start to reading!");
   }
   void close(){
   
       System.out.println("The book closed!");
   }
   
   Books(String name,String author,int pages,int prise){
       
       this.name = name;
       this.author = author;
       this.pages = pages;
       this.prise = prise;

   }
   
     @Override
   public String toString() {
       return "Book Details:\n" +
              "- Title: " + name + "\n" +
              "- Author: " + author + "\n" +
              "- Pages: " + pages + "\n" +
              "- Price: " + prise;
   } 
   
}
