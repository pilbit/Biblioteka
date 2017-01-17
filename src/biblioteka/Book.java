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

/**
 *
 * @author ppilus
 */
public class Book extends Biblioteka
{
    
    private static int id;
    private String tytul;
    private String autor;
    private String opis;
    private int user_id;
    
    public Book()
    {
        this.id ++ ;
    }
    
    public void add()
    {
        id++;
    }
    
    public void getData(int i)
    {
        if(i==0)
        System.out.println("* Zawartość Bazy Bibliotecznej * - Ksiązki - *");
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("Id    ksiązki         : "+this.id);
        System.out.println("----------------------------------------------");
        System.out.println("Tytuł ksiązki         : "+this.tytul);
        System.out.println("--------------------------------------------------");
        System.out.println("Autor ksiązki         : "+this.autor);
        System.out.println("--------------------------------------------------");
        System.out.println("Opis ksiązki          : "+this.opis);
        System.out.println("--------------------------------------------------");
        System.out.println("ID użytkownika ksiązki: "+this.user_id);
        System.out.println("----------------------------------------------");
        System.out.println("");
        
    }
    
    public void setData(String[] tab,int ile)
    {
        if (ile == 0) {//sprawdzenie czy pierwsza ksiazka i zapis
            tab[ile] = Integer.toString(id);
            ile++;
            this.tytul = tab[ile];
            ile++;
            this.autor = tab[ile];
            ile++;
            this.opis = tab[ile];
            ile++;
            this.user_id = Integer.valueOf(tab[ile]);
        } else {//jesli nie piwerwsza ustawienie indexu tablicy
            ile*=5;
            tab[ile] = Integer.toString(id);
            ile++;
            this.tytul = tab[ile];
            ile++;
            this.autor = tab[ile];
            ile++;
            this.opis = tab[ile];
            ile++;
            this.user_id = Integer.valueOf(tab[ile]);

        }
        
    }
    
    
    
     
    
     public void write(String name) throws IOException
    {
        FileWriter fw = new FileWriter(name);
        BufferedWriter bw = new BufferedWriter(fw);
        
        
    }
    
    
}
