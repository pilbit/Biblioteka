/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;
/**
 *
 * @author pawel
 */
public class Biblioteka {

    /**
     * @param args the command line arguments
     */
    public String toString()
    {
        return "|------------------------------------------------|\n"
             + "|---   System Wirtualnej Biblioteki Książek   ---|\n"
             + "|---           ***   MENU   ***               ---|\n"
             + "|------------------------------------------------|\n"
             + "| Wybierz odpowiedznią funkcję programu:         |\n"
             + "|------------------------------------------------|\n"
             + "|1 - Odczyt Bazy Danych                       ---|\n"
             + "|------------------------------------------------|\n"
             + "|2 - Zapis Bazy Danych                        ---|\n"
             + "|------------------------------------------------|\n"
             + "|3 - Dodanie Nowych Danych                    ---|\n"
             + "|------------------------------------------------|\n"
             + "|4 - Wypożyczenie Zbioru                      ---|\n"
             + "|------------------------------------------------|\n"
             + "|5 - Oddane Zbioru                            ---|\n"
             + "|------------------------------------------------|\n"
             + "|5 - Wyjście z Programu                       ---|\n"
             + "|------------------------------------------------|\n";

    } 
    
    public Book[] read(String name, int index) throws IOException
    {
        
        index /= 5;
        Book[] books = new Book[index];
         try
                    {
                        
                        
                        FileReader fr = new FileReader(name);
                        BufferedReader bf = new BufferedReader(fr);
                        String line = bf.readLine();
                        index *= 5;
                        String[] tab = new String[index];
                        //int q = 1;
                        Book book = new Book();

                        for(int i=0; line!=null; i++)
                        {
                            tab[i]=line;
                            line = bf.readLine();
                        }
                        index /= 5;
                        for(int i=0;i<index;i++)//i= ile ksiazek w bazie
                        {
                            book.setData(tab,i);
                            books[i] = book;
                            book.getData(i);
                            book.add();
                        }
                 
                        bf.close();
                     
                    }
                    catch(FileNotFoundException fnfe)
                    {
                        fnfe.printStackTrace();
                    }
         return books;
    }
    
    public User[] read2(String name, int index) throws IOException
    {
        
        index /= 6;
        User[] users = new User[index];
         try
                    {
                        
                        
                        FileReader fr = new FileReader(name);
                        BufferedReader bf = new BufferedReader(fr);
                        String line = bf.readLine();
                        index *= 6;
                        String[] tab = new String[index];
                        
                        User user = new User();

                        for(int i=0; line!=null; i++)
                        {
                            tab[i]=line;
                            line = bf.readLine();
                        }
                        index /= 6;
                        for(int i=0;i<index;i++)//i= ile ksiazek w bazie
                        {
                            user.setData(tab,i);
                            users[i] = user;
                            user.getData(i);
                            user.add();

                        }
                 
                        bf.close();
                     
                    }
                    catch(FileNotFoundException fnfe)
                    {
                        fnfe.printStackTrace();
                    }
         return users;
    }
    
    
    public int licz(String name) throws IOException
    {
        FileReader fr = new FileReader(name);
        LineNumberReader lnr = new LineNumberReader(fr);
        int cnt = 0;
        String lineRead = "";
        while ((lineRead = lnr.readLine()) != null) {}

        cnt = lnr.getLineNumber(); 
        lnr.close();
       return cnt;
    }
    
    public void write(Book[] books, User[] users, String file, String File2) throws FileNotFoundException, IOException
    {
        FileWriter fr = new FileWriter(file);
        BufferedWriter bf = new BufferedWriter(fr);
        
    }
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        String name = "/home/ppilus/books";
        String name2 = "/home/ppilus/users";
        Biblioteka bib = new Biblioteka();
        int linie = bib.licz(name);
        int linie2 = bib.licz(name2);
        Book[] books = new Book[(linie/5)];
        User[] users = new User[(linie2/6)];
        System.out.println(bib);
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();
        
        while (menu != 5)
        {
            
            switch(menu)
            {
                case 1:  
                   books = bib.read(name, linie);
                   users = bib.read2(name2, linie2);
                    break;
                case 2:
                    bib.write(books,users,name,name2);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
            System.out.println(bib);
            menu = input.nextInt();
            
        }
        System.out.println("KONIEC PROGRAMU !");
            
    }
    
}
