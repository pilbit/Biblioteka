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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
             + "|5 - Oddanie Zbioru                            ---|\n"
             + "|------------------------------------------------|\n"
             + "|6 - Wyjście z Programu                       ---|\n"
             + "|------------------------------------------------|\n";

    } 
    
    public Book[] read(int records,String name, int linie, int obj_books) throws IOException//nazwa pliku i numer obiektu 1
    {
        //records - counter lines on one book, name - rdad file path, linie - lines of whole file
        //int index =linie/records; //obj_books - counter books
        Book[] book = new Book[obj_books];
         try
                    {
                        
                        FileReader fr = new FileReader(name);
                        BufferedReader bf = new BufferedReader(fr);
                        String line ; //bf.readLine();
                        //index *= 5;
                        String[] tab = new String[records];
                        //Book book = new Book();//1
                        //
                        for(int i=0;i<book.length;i++){
                            book[i]= new Book();
                        }
                          
                        int book_counter = 0;
                            for(int i=0; i<obj_books; i++)
                            {
 
                                int counter = 0;
                                line = bf.readLine();
                                tab[counter]= line;
                                
                                counter++;
                                line = bf.readLine();
                                tab[counter]=line;
                                
                                counter++;
                                line = bf.readLine();
                                tab[counter]=line;
                                
                                counter++;
                                line = bf.readLine();
                                tab[counter]=line;
                                
                                counter++;
                                line = bf.readLine();
                                tab[counter]=line;
                     
                                book_counter++;
                                book[i].setData(tab,book_counter);
<<<<<<< HEAD
                                //book[i].getData(book_counter); 
=======
<<<<<<< HEAD
<<<<<<< HEAD
                                //book[i].getData(book_counter); 
=======
                                book[i].getData(book_counter); 
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
                                book[i].getData(book_counter); 
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
                    
                            }
                       
                        bf.close();                    
                    }
                    catch(FileNotFoundException fnfe)
                    {
                        fnfe.printStackTrace();
                        System.err.println(name);
                    }
//         
         return book;
    }
    
    public User[] read2(String name, int record_user,int linie2, int obj_users) throws IOException//nazwa pliku i numer obielktu
    {//name - name of the file, (name2, record_user, linie2, obj_users)
        
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
        FileReader fr = new FileReader(name);
                        BufferedReader bf = new BufferedReader(fr);
                        String line;
        User[] users = new User[obj_users];
<<<<<<< HEAD
<<<<<<< HEAD
         try
                    {
                         
=======
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
         try
                    {
                         
=======
        
        User[] users = new User[obj_users];
         try
                    {
                        FileReader fr = new FileReader(name);
                        BufferedReader bf = new BufferedReader(fr);
                        String line; 
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
                        
                        String[] tab = new String[record_user];
                       
                        for(int i=0;i<obj_users; i++)
                        {
                            users[i] = new User();
                            
                        }
                        int user_counter=0;
                         for(int i=0;i<obj_users; i++){
                             
                             int counter = 0;
                             line = bf.readLine();
                             tab[counter]= line;
                                
                             counter++;
                             line = bf.readLine();
                             tab[counter]= line;
                             
                             counter++;
                             line = bf.readLine();
                             tab[counter]= line;
                             
                             counter++;
                             line = bf.readLine();
                             tab[counter]= line;
                             
                             counter++;
                             line = bf.readLine();
                             tab[counter]= line;
                             
                             counter++;
                             line = bf.readLine();
                             tab[counter]= line;

                            user_counter++;
                            
                            users[i].setData(tab,user_counter);
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750

                        //}
                         }
                       
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
                            users[i].getData(user_counter);
                        //}
                         }
                        bf.close();
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
                     
                    }
                    catch(FileNotFoundException fnfe)
                    {
                        fnfe.printStackTrace();
                    }
         bf.close();
        
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
    
    public void write(ArrayList<Book> books1, ArrayList<User> users1, String file, String file2) throws FileNotFoundException, IOException
    {
        FileWriter fr = new FileWriter(file);
        BufferedWriter bf = new BufferedWriter(fr);
        FileWriter fr2 = new FileWriter(file2);
        BufferedWriter bf2 = new BufferedWriter(fr2);
       
        try{    //print tablice books i user i zobaczymy
        
        for (int i=0; i<books1.size(); i++){
     
            bf.write(Integer.toString(i+1));
            bf.write("\n");
            bf.write(books1.get(i).getTytul());
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
            System.out.println(books1.get(i).getTytul());
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
            System.out.println(books1.get(i).getTytul());
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
            bf.write("\n");
            bf.write(books1.get(i).getAutor());
            bf.write("\n");
            bf.write(books1.get(i).getOpis());
            bf.write("\n");
            bf.write(books1.get(i).getUserId());
            bf.write("\n");
        }
        for (int i=0; i<users1.size(); i++){
            bf2.write(Integer.toString(i+1));
            bf2.write("\n");
            bf2.write(users1.get(i).getName());
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
            System.out.println(users1.get(i).getName());
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
            System.out.println(users1.get(i).getName());
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
            bf2.write("\n");
            bf2.write(users1.get(i).getCity());
            bf2.write("\n");
            bf2.write(users1.get(i).getStreet());
            bf2.write("\n");
            bf2.write(users1.get(i).getNumber());
            bf2.write("\n");
            bf2.write(users1.get(i).getPhone());
            bf2.write("\n");
        }

        }catch(Exception e){
            e.printStackTrace();
        }
        
        bf2.close();
        bf.close();
    }
    
    public Book addBook(int record_book,int size){//ilosc rekordów na obiekt
        Scanner input = new Scanner(System.in);
        Book book = new Book();
        //System.out.println("ilweee: "+a);
        String[] tab = new String[record_book];
        int i =1 ;
        //tab[i] = Integer.toString(size+1);
        //i++;
        System.out.println("Podaj Tytuł ksiązki");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj Autora ksiązki");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj Opis ksiązki");
        tab[i]=input.nextLine();
        i++;
       // System.out.println("");
        tab[i]="0";
        //i++;
        book.setData(tab,size+1);
        
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
        
=======
        
        return book;
    }
    
    public User addUser(int record_user,int size){
        Scanner input = new Scanner(System.in);
        User user = new User();
        //System.out.println("ilweee: "+a);
        String[] tab = new String[record_user];
        int i =1 ;
        //tab[i] = Integer.toString(size+1);
        //i++;
        System.out.println("Podaj imie i nazwisko uzytkownika: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj miasto: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj ulice: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj numer domu: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj telefon kontaktowy: ");
        tab[i]=input.nextLine();
        //i++;
       // System.out.println("");
        //tab[i]="0";
        //i++;
        user.setData(tab,size+1);
        
        
        return user;
    }
    
=======
        
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
        return book;
    }
    
    public User addUser(int record_user,int size){
        Scanner input = new Scanner(System.in);
        User user = new User();
        //System.out.println("ilweee: "+a);
        String[] tab = new String[record_user];
        int i =1 ;
        //tab[i] = Integer.toString(size+1);
        //i++;
        System.out.println("Podaj imie i nazwisko uzytkownika: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj miasto: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj ulice: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj numer domu: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj telefon kontaktowy: ");
        tab[i]=input.nextLine();
        //i++;
       // System.out.println("");
        //tab[i]="0";
        //i++;
        user.setData(tab,size+1);
<<<<<<< HEAD
<<<<<<< HEAD
        
        
        return user;
    }
    
    public void borrow(ArrayList<Book> books1, ArrayList<User> users1) {
        System.out.println("Wyszukaj dane osoby wypożyczającej zbiory");
        boolean check = true;
        String line;
        ArrayList<Integer> index = new ArrayList<Integer>();
        int user_index = 0;
        int book_index = 0;
        Scanner input = new Scanner(System.in);
        
        do {
            
            System.out.println("Podaj imie i nazwisko osoby: ");
            
            line = input.nextLine();
            //System.out.println("line: " + line);
            
            for (int i = 0; i < users1.size(); i++) {

                if (users1.get(i).getName().equalsIgnoreCase(line)) { //== line) {
                    user_index = i;
                    check = false;
                }
            }

            if (check == true) {
                System.out.println("Nie znaleziono osoby, spróbuj ponownie: ");
                System.out.println("Czy chcesz spróbować ponownie N - przerywa: ");
                line = input.nextLine();
                
                if (line.equalsIgnoreCase("N")) {
                    break;
                }
                
            } else {
                System.out.println("Znaleziono: " + users1.get(user_index).getName());
                //user_index = users1.get(user_index).getIdInt();
                //check = false;
            }

        } while (check);
        check = true;
        
        do{
        System.out.println("Podaj tytuł zbióru do wypożyczenia: ");
        line = input.nextLine();
        
        for (int i = 0; i < books1.size(); i++) {

                if (books1.get(i).getTytul().equalsIgnoreCase(line)){
            System.out.println("Znaleziono i : " +i+"ff"+books1.get(i).getTytul());
                    book_index = i;
                    check = false;
                }
            }
        if (check == true) {
                System.out.println("Nie znaleziono książki, spróbuj ponownie: ");
                System.out.println("Czy chcesz spróbować ponownie N - przerywa: ");
                line = input.nextLine();
                
                if (line.equalsIgnoreCase("N")) {
                    break;
                }
                
            } else {
                System.out.println("Znaleziono: " + books1.get(book_index).getTytul());
                System.out.println("Wypożyczyć zbiór dla danego uzytkownika ? N - przrywa");
                line = input.nextLine();
                if (line.equalsIgnoreCase("N")) {
                    break;
                }else{
                  //System.out.println("Wypożycdsd users"+users1.get(user_index).getId());
                          
                books1.get(book_index).setUserId(users1.get(user_index).getId());
                
                }
                System.out.println("Wypożyczyć kolejny zbiór dla danego uzytkownika? N - przerywa");
                line = input.nextLine();
                if (line.equalsIgnoreCase("N")) {
                    break;
                }
                check=true;
                //System.out.println("Wyp ---> us"+users1.get(user_index).getId()+"bk"+books1.get(book_index).getId(book_index));//check = false;
            }
        }while(check);
    }
        
    
=======
        
        
        return user;
    }
    
=======
        
        return book;
    }
    
    public User addUser(int record_user,int size){
        Scanner input = new Scanner(System.in);
        User user = new User();
        //System.out.println("ilweee: "+a);
        String[] tab = new String[record_user];
        int i =1 ;
        //tab[i] = Integer.toString(size+1);
        //i++;
        System.out.println("Podaj imie i nazwisko uzytkownika: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj miasto: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj ulice: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj numer domu: ");
        tab[i]=input.nextLine();
        i++;
        System.out.println("Podaj telefon kontaktowy: ");
        tab[i]=input.nextLine();
        //i++;
       // System.out.println("");
        //tab[i]="0";
        //i++;
        user.setData(tab,size+1);
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
        
        
        return user;
    }
    
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        String name = "/home/ppilus/books";
        String name2 = "/home/ppilus/users";
        
        Biblioteka bib = new Biblioteka();
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
        
        int linie = bib.licz(name);;
        int linie2 = bib.licz(name2);
        int record_book = 5;
        int record_user = 6;
        
        int obj_books=linie/record_book;
        int obj_users=linie2/record_user;
        
        ArrayList<Book> books1 = new ArrayList<Book>();
        ArrayList<User> users1 = new ArrayList<User>();
        
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
        int linie ;
        int linie2 ;
        int record_book = 5;
        int record_user = 6;
        int obj_books ;
        int obj_users ;
        ArrayList<Book> books1 = new ArrayList<Book>();
        ArrayList<User> users1 = new ArrayList<User>();
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
        System.out.println(bib);
        Scanner input = new Scanner(System.in);
        
        int menu = input.nextInt();
        int add_counter=0;
        int add_counter2=0;
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
        
        Book book = new Book();
        User user = new User();
        Book[] books = new Book[(obj_books)];
        for(int i=0; i<books.length; i++)
            books[i]=new Book();
        User[] users = new User[(obj_users)];
        for(int i=0; i<users.length; i++)
            users[i]=new User();
        
        books = bib.read(record_book,name, linie,obj_books);
        users = bib.read2(name2, record_user, linie2, obj_users);
<<<<<<< HEAD
 
        Collections.addAll(users1, users);
        Collections.addAll(books1, books);
        
=======
=======
        
        Book book = new Book();
        User user = new User();
        Book[] books = new Book[(obj_books)];
        for(int i=0; i<books.length; i++)
            books[i]=new Book();
        User[] users = new User[(obj_users)];
        for(int i=0; i<users.length; i++)
            users[i]=new User();
        
        books = bib.read(record_book,name, linie,obj_books);
        users = bib.read2(name2, record_user, linie2, obj_users);
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750

        Collections.addAll(users1, users);
        Collections.addAll(books1, books);
        
=======
        Book book = new Book();
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
        while (menu != 6)
        {
            
            switch(menu)
            {
                case 1: //READ
                    linie = bib.licz(name);
                    linie2 = bib.licz(name2);
                    obj_books=linie/record_book;
                    obj_users=linie2/record_user;
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
                    for(int i=0; i<obj_books; i++)
                    books1.get(i).getData(obj_books, i);//book.getData(obj_books,i);
                    for(int i=0; i<obj_users; i++)
                    users1.get(i).getData(obj_users, i);
                    
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
                    Book[] books = new Book[(obj_books)];
                    User[] users = new User[(obj_users)];
                    books = bib.read(record_book,name, linie,obj_books);
                    users = bib.read2(name2, record_user, linie2, obj_users);
                    
                    Collections.addAll(users1, users);
                    Collections.addAll(books1, books);
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
<<<<<<< HEAD
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
=======
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
                    
                    break;
                case 2://WRITE
                    
                    bib.write(books1,users1,name,name2);
                    System.out.println("Zapisano dane w bazie danych");
                    break;
                case 3://CREATE
                    System.out.println("1 - Dodanie nowej książki\n2 - Dodanie nowego użytkownika");
                    menu = input.nextInt();
                    if(menu==1){
                        int size = books1.size();
                        books1.add(bib.addBook(record_book, size));
                        //add_counter++;
                    }else if(menu==2){
                        int size = users1.size();
                        users1.add(bib.addUser(record_user, size));
                    }else{
                        System.out.println("Nieznany wybór, spróbuj ponownie");
                    }
                    break;
                case 4://barrow books
                    bib.borrow(books1,users1);
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
