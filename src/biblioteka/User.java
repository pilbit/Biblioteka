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

/**
 *
 * @author ppilus
 */
public class User extends Biblioteka
{
    private int id;
    private String name;
    private String city;
    private String street;
    private int number;
    private int phone;
    
    public User()
    {
        
    }
    
    public void add(int i)
    {
        this.id=i;
    }
    
    public String getId(){
        return Integer.toString(id);
    }
<<<<<<< HEAD
    public int getIdInt(){
        return this.id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getStreet(){
        return street;
    }
    
    public String getNumber(){
        return Integer.toString(number);
    }
    
    public String getPhone(){
        return Integer.toString(phone);
    }
    
    public void getData(int obj_books, int i)
    {
       //for(int i=0; i<obj_books; i++){
        if(i==0){
=======
    
    public String getName(){
        return name;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getStreet(){
        return street;
<<<<<<< HEAD
=======
    }
    
    public String getNumber(){
        return Integer.toString(number);
    }
    
    public String getPhone(){
        return Integer.toString(phone);
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
    }
    
    public String getNumber(){
        return Integer.toString(number);
    }
    
    public String getPhone(){
        return Integer.toString(phone);
    }
    
    public void getData(int obj_books, int i)
    {
<<<<<<< HEAD
       //for(int i=0; i<obj_books; i++){
        if(i==0){
=======
       
        if(i==1)
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
        System.out.println("* Zawartość Bazy Bibliotecznej * - Użytkownicy - *");
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("ID Użytkownika   : "+this.id);
        System.out.println("--------------------------------------------------");
        System.out.println("Imię i Nazwisko   : "+this.name);
        System.out.println("--------------------------------------------------");
        System.out.println("Miasto            : "+this.city);
        System.out.println("--------------------------------------------------");
        System.out.println("Ulica             : "+this.street);
        System.out.println("--------------------------------------------------");
        System.out.println("Numer domu        : "+this.number);
        System.out.println("--------------------------------------------------");
        System.out.println("Telefon kontaktowy: "+this.phone);
        System.out.println("--------------------------------------------------");
        System.out.println("");
        }else{
        System.out.println("--------------------------------------------------");
        System.out.println("ID Użytkownika   : "+this.id);
        System.out.println("--------------------------------------------------");
        System.out.println("Imię i Nazwisko   : "+this.name);
        System.out.println("--------------------------------------------------");
        System.out.println("Miasto            : "+this.city);
        System.out.println("--------------------------------------------------");
        System.out.println("Ulica             : "+this.street);
        System.out.println("--------------------------------------------------");
        System.out.println("Numer domu        : "+this.number);
        System.out.println("--------------------------------------------------");
        System.out.println("Telefon kontaktowy: "+this.phone);
        System.out.println("--------------------------------------------------");
        System.out.println("");
        }
       //}
        
    }
    
    public void setData(String[] tab,int user_counter)
    {
<<<<<<< HEAD
        this.add(user_counter);
            int i =1;
           // i++;
=======
<<<<<<< HEAD
        this.add(user_counter);
            int i =1;
           // i++;
=======
        
        this.add(user_counter);
            int i =1;
>>>>>>> 5e6cbfc11d50b03b75ba559be3413f4d39878b13
>>>>>>> 3b41d1e446f554947eda9f9772bd8ffbd08f9750
            this.name = tab[i];
            i++;
            this.city = tab[i];
            i++;
            this.street = tab[i];
            i++;
           // System.out.println("sprawdzamu co w i tab"+tab[i]);
            this.number = Integer.valueOf(tab[i]);//Integer.valueOf(tab[i]);
            i++;
            this.phone = Integer.valueOf(tab[i]);   
        
    }
    
    public void read(String name) throws IOException
    {
         try
                    {
                        FileReader fr = new FileReader(name);
                        BufferedReader bf = new BufferedReader(fr);
                  
                        String[] tab =new String[3];
                        String line = bf.readLine();
                        
                        for(int i=0; line!=null; i++)
                        {
                            tab[i]=line;
                            line = bf.readLine();
                        }
                        for(int i=0;i<tab.length;i++)
                        {
                            System.out.println(tab[i]);
                        }
                        bf.close();
                        

                        
                    }
                    catch(FileNotFoundException fnfe)
                    {
                        fnfe.printStackTrace();
                    }
    }
    
    public void write(String name) throws IOException
    {
        FileWriter fw = new FileWriter(name);
        BufferedWriter bw = new BufferedWriter(fw);
        
        
    }
    
//    public String toString()
//    {
//        return "|------------------------------------------------|\n"
//             + "|---   System Wirtualnej Biblioteki Książek   ---|\n"
//             + "|---           ***   MENU   ***               ---|\n"
//             + "|------------------------------------------------|\n"
//             + "| Wybierz odpowiedznią funkcję programu:         |\n"
//             + "|------------------------------------------------|\n"
//             + "|1 - Odczyt Bazy Danych                       ---|\n"
//             + "|------------------------------------------------|\n"
//             + "|2 - Zapis Bazy Danych                        ---|\n"
//             + "|------------------------------------------------|\n"
//             + "|3 - Dodanie Nowych Danych                    ---|\n"
//             + "|------------------------------------------------|\n"
//             + "|4 - Wypożyczenie Zbioru                      ---|\n"
//             + "|------------------------------------------------|\n"
//             + "|5 - Oddane Zbioru                            ---|\n"
//             + "|------------------------------------------------|\n"
//             + "|6 - Wyjście z Programu                       ---|\n"
//             + "|------------------------------------------------|\n";
//
//    } 
}
