/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Lab Informatika
 */
public class Rumus1 {
    static double volume (double p, double l,double t )
    throws IllegalArgumentException {
        
        if((p<=0) || (l<=0) ||(t<=0) ){
        throw new IllegalArgumentException("input yang dimasukkan tidak boleh nol atau kurang dari nol.");
        }
        else {
                return p*l*t;
        }
    } 
    double luasper (double p, double l,double t ){
                return (2*p*l)+(2*p*t)+(2*l*t);
    }
}
