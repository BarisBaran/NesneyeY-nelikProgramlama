
package com.mycompany.userinterface;

import java.io.*;

/**
 *
 * @author Barış
 */
public class dashBoard {

    public void Giris(String username, String password) {

        System.out.println("1");
    }

    public void List() {

        String ayrac = new String(new char[15]).replace("\n", "-");
        String okunanVeri = null;
        File dosya = new File("C:\\Users\\baris baran\\Desktop\\userInterface\\src\\main\\java\\com\\mycompany\\userinterface\\users.txt");

        FileReader fileReader;
        char veriler[] = new char[(int) dosya.length()];
        System.out.println(ayrac + "\n< USER INFORMATION >\n" + ayrac);
        try {
            fileReader = new FileReader(dosya);
            fileReader.read(veriler);
            okunanVeri = new String(veriler);
            System.out.println(veriler);
        } catch (FileNotFoundException e) {
            System.out.println("-> Aradığınız Dosyaya Ulaşamadım.\n-> Hata Mesajım: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("-> Aradığınız Dosya Üzerinde Veri Okuyamıyorum.\n-> Hata Mesajım: " + e.getMessage());
        } finally {
            System.out.println(ayrac);
        }
    }

    public void Register(String username, String password) throws IOException {

        try {
            
            File yazDosya = new File("C:\\Users\\baris baran\\Desktop\\userInterface\\src\\main\\java\\com\\mycompany\\userinterface\\users.txt");
           
            FileWriter print;
            print = new FileWriter(yazDosya,true);
            print.append(username + " ");
            print.append(password + "\n");
            print.close();

            

        } catch (IOException e) {
            System.out.println("-> Hata Mesajım: " + e.getMessage() + "\n-> Hata Kodum: " + e.hashCode());
        }
    }
}