/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author DELL
 */
public class Rumus2 {
   static double volume ( double r,double t,double pi )
         throws IllegalArgumentException {
        
    if((r<=0) || (t<=0) ){
        throw new IllegalArgumentException("input yang dimasukkan tidak boleh nol atau kurang dari nol.");
    }
    else {
                return (pi*r*r*t)/3;
    }}
    
    double s ( double r,double t ){
                return Math.sqrt(r*r + t*t);
    }
    double luasper ( double r,double pi,double s ){
                return pi*r*(r+s);
    }
}
