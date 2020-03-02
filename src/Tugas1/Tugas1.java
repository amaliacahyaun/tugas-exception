/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Lab Informatika
 */
public class Tugas1 {

    public static void main(String[] args) {
   for(String b = "y"; b.equals("y") || b.equals("Y");){
        System.out.println("Pilihan");
        System.out.println("1.Balok");
        System.out.println("2.Kerucut");
        System.out.println("3.Limas Segitiga");
        //pilih 4 akan masuk exception
         Scanner pilih;
                pilih = new Scanner (System.in);
        System.out.print("PILIH=");
        int Pilih= pilih.nextInt();  
        switch(Pilih){
        
          
            case 1: {
            Rumus1 rumusbalok = new Rumus1();
            System.out.println("BALOK");
            Scanner sisi = new Scanner (System.in);
            boolean inputan= true;
            //memasukkan sisi bukan dengan angka akan muncul exception
      do{
                try{
            System.out.print("panjang=");
            double panjang= sisi.nextDouble();
            System.out.print("lebar=");
            double lebar= sisi.nextDouble();
            System.out.print("tinggi=");
            double tinggi= sisi.nextDouble();
            System.out.println("");
            
            double Volume = Rumus1.volume(panjang,lebar,tinggi);
            System.out.println("Volume Balok="+ Volume);
            double Luasper = rumusbalok.luasper(panjang,lebar,tinggi);
            System.out.println("Luas Permukaan Balok="+ Luasper);
            inputan=false;
                    }
            catch(IllegalArgumentException | InputMismatchException ex){
            System.out.println(ex);
            System.out.println("coba lagi memasukkan angka ");
            sisi.nextLine();
            }
           
          }while(inputan);
        
        break;
        }
        
           case 2: {
            double pi=3.14;
            Rumus2 rumuskerucut = new Rumus2();
            System.out.println("KERUCUT");
            Scanner sisi = new Scanner (System.in);
            boolean inputan= true;
            //memasukkan sisi bukan dengan angka akan muncul exception
        do{
            try{
            System.out.print("jari-jari=");
            double jarijari= sisi.nextDouble();
            System.out.print("tinggi=");
            double tinggi= sisi.nextDouble();
            System.out.println("");
                    
            double Volume = Rumus2.volume(jarijari,tinggi,pi);
            System.out.println("Volume Kerucut="+ Volume);
            double SisiS = rumuskerucut.s(jarijari,tinggi);
            System.out.println("Sisi Selimut="+ SisiS);
            double Luasper = rumuskerucut.luasper(jarijari,pi,SisiS);
            System.out.println("Luas Permukaan Kerucut="+ Luasper);
            inputan=false;
           }
            catch(IllegalArgumentException | InputMismatchException ex){
            System.out.println(ex);
            System.out.println("coba lagi memasukkan angka ");
            sisi.nextLine();
            }
           }while(inputan);
        
            break;
           }

        
           case 3 :{
            Rumus3 rumuslimas = new Rumus3();
            System.out.println("LIMAS SEGITIGA");
            Scanner sisi = new Scanner (System.in);
            boolean inputan= true;
            //memasukkan sisi bukan dengan angka akan muncul exception
      do{
                try{
            
            System.out.print("alas segitiga ABC=");
            double asegitiga= sisi.nextDouble();
            System.out.print("tinggi segitiga alas ABC=");
            double tsegitiga= sisi.nextDouble();
            System.out.print("tinggi limas=");
            double tlimas= sisi.nextDouble();
            System.out.print("alas segitiga BCD=");
            double sisibc= sisi.nextDouble();
            System.out.print("tinggi segitiga BCD=");
            double tsisi2= sisi.nextDouble();
            System.out.print("alas segitiga ACD=");
            double sisiac= sisi.nextDouble();
            System.out.print("tinggi segitiga ACD=");
            double tsisi3= sisi.nextDouble();
            System.out.print("tinggi segitiga ABD=");
            double tsisi4= sisi.nextDouble();
               System.out.println("");
            
            double Volume = Rumus3.volume(asegitiga,tsegitiga,tlimas);
            System.out.println("Volume Limas Segitiga="+ Volume);
            double Luasper = Rumus3.luasper(asegitiga, tsegitiga,sisibc,tsisi2,sisiac,tsisi3,tsisi4);
            System.out.println("Luas Permukaan Kerucut="+ Luasper);
            inputan=false;
                }
            catch(IllegalArgumentException | InputMismatchException ex){
            System.out.println(ex);
            System.out.println("coba lagi memasukkan angka ");
            sisi.nextLine();
            }
           }while(inputan);
        
        break;
           }
        
          case 4:
          {
            try{f();
            }
            catch(Exception e){
            System.out.println(e);
            }
            break;
          }
        }      
        System.out.print("Apakah Anda Mau Memilih Menu Lain? (Y/N) ");
        //untuk menginput apakah inhin memilih lagi atau tidak
        b = pilih.next();       
      }

    /**
     *
     * @throws ArrayIndexOutOfBoundsException
     */
    }
    public static void f() throws NullPointerException, ArrayIndexOutOfBoundsException
    {
        //implementasi method
        //throw new NullPointerException();
        throw new ArrayIndexOutOfBoundsException();
    }
        
}


