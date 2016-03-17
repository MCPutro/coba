/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

/**
 *
 * @author Mu'ti C Putro
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,0};
        
        int getIndex = -1;
        int c = 2;
        for (int i = 0; i < a.length; i++) {
            if(c == a[i]){
                getIndex = i;
            }
        }
        for (int i = getIndex+1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }
    }
    
}
