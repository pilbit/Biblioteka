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
    
    private int id;
    private String tytul;
    private String autor;
    private String opis;
    private int user_id;
    
    public Book()
    {
        //this.id ++ ;
    }
    
    public void add(int index)
    {
        this.id = index;
    }
    
    public String getId(int n){
        if((n+1)<=this.id)
        {
        return Integer.toString(n);
        }else {
            return Integer.toString(n);
        }
            
    }
    public void setTytul(String tytul){
        this.tytul=tytul;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public void setOpis(String opis){
        this.opis=opis;
    }
    
    public void setUserId(String userid){
        this.user_id=Integer.valueOf(userid);
    }
    
    public String getTytul(){
        return tytul;
    }
    
    
    public String getAutor(){
        return autor;
    }
    
    public String getOpis(){
        return opis;
    }
    
    public String getUserId(){
        return Integer.toString(user_id);
    }
    
    public void getData(int obj_users, int i)
    {
        //for(int i=0; i<obj_users; i++){
        if(i==0){
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
        }else{
            
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
        //}
        
    }
    
    public void setData(String[] tab, int book_counter)//ile to index ksiazki moze buc 0(1)
    {

            this.add(book_counter);
            int i = 1;
            this.tytul = tab[i];
            i++;
            this.autor = tab[i];
            i++;
            this.opis = tab[i];
            i++;
            this.user_id = Integer.valueOf(tab[i]);
    
    }
    
}
