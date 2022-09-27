/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author henry
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // variable's life cycle: declaration -> allocaation -> initialization -> reclaim
        System.out.println("HelloWorld");
        
        int i = 3;
        System.out.println(i);
        
        int grade = 70;
        if(grade>=60){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }
        
        int l =0;
        for (int j=1;j<=10;j++){
            if(j%4==0 || j%4==1){
               l=l+j;
           }else{
               l=l-j;
           }
        }
        System.out.println(l);
    }
    
}
