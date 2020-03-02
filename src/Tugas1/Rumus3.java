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
public class Rumus3 {
    static double volume ( double as,double t,double tl )
      throws IllegalArgumentException {
        
        if((as<=0) || (t<=0) ||(tl<=0)){
        throw new IllegalArgumentException("input yang dimasukkan tidak boleh nol atau kurang dari nol.");
        }
        else {
                return (as*t*tl)/6;
        }
      }
    static double luasper ( double as,double t,double bc,double t2,double ac,double t3, double t4 )
      throws IllegalArgumentException {
        if((bc<=0) ||(t2<=0) ||(ac<=0) ||(t3<=0) ||(t4<=0)){
        throw new IllegalArgumentException("input yang dimasukkan tidak boleh nol atau kurang dari nol.");
        }
        else {
                return (as*t/2)+ (bc*t2/2)+(ac*t3/2)+(as*t4/2);
    }
    
    }
}