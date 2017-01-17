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
public class User 
{
    private static int id;
    private String name;
    private String city;
    private String street;
    private int number;
    private int phone;
    
    public User()
    {
        id++;
    }
    
    public void add()
    {
        id++;
    }
    
    public void getData(int i)
    {
        if(i==0)
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
        
    }
    
    public void setData(String[] tab,int ile)
    {
        
        if (ile == 0) {//sprawdzenie czy pierwsza ksiazka i zapis
            ile++;
            this.name = tab[ile];
            ile++;
            this.city = tab[ile];
            ile++;
            this.street = tab[ile];
            ile++;
            this.number = Integer.valueOf(tab[ile]);
            ile++;
            this.phone = Integer.valueOf(tab[ile]);
        } else {//jesli nie piwerwsza ustawienie indexu tablicy
            ile*=6;
            ile++;
            this.name = tab[ile];
            ile++;
            this.city = tab[ile];
            ile++;
            this.street= tab[ile];
            ile++;
            this.number = Integer.valueOf(tab[ile]);
            ile++;
            this.phone = Integer.valueOf(tab[ile]);

        }
        
        
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
}
