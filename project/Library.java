//Creating Library which addBooks(),issueBooks()/getBook(),returnBook()/putBook(),showAvalableBooks();
//property: Array to store avaliable books 
//          Array to store the issued books 
import java.util.*;
import java.lang.*;

class Books{
    String[] book_name=new String[20];
    static int count=0;
    static int remove_count=1;
    String[] book_issued=new String[20];
    Scanner scan = new Scanner(System.in);
    public void addBooks(){
        System.out.println("Add a Book Name");
        book_name[count]=scan.nextLine();
        count++;
    }
    public void issueBooks(){
        System.out.println("Removing the book");
        remove_count++;
        //book_issued[remove_count]=book_name[count];
        String some_value=book_name[count];
        //ch2 = ch2.copyValueOf( ch );
        book_issued[remove_count]=book_issued[remove_count].valueOf(book_name[count]);
        count--;
        System.out.println("Removed book is "+book_issued[remove_count]);
    }
    public void returnBooks(){
        count++;
        System.out.println("Returning the book");
        //book_name[count]=book_issued[remove_count];

        remove_count--;
    }
    void showAvalableBooks(){
        int i;
        System.out.println("printing the books");
        for(i=0;i<count;i++){
            System.out.println(book_name[i]);
        }
    }
}

class Library{
    public static void main (String[] args){
        //System.out.println("");
        Books my_book=new Books();
        my_book.addBooks();
        my_book.showAvalableBooks();
        my_book.issueBooks();
        my_book.addBooks();
        // my_book.returnBooks();
        // my_book.showAvalableBooks();
        // my_book.addBooks();
        System.out.print("\033[H\033[2J");  




        my_book.showAvalableBooks();
    }
}