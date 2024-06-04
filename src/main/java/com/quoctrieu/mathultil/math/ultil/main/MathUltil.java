/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.quoctrieu.mathultil.math.ultil.main;

import com.quoctrieu.mthutil.mathutil.core.MathUtil1808;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MathUltil {

    public static void main(String[] args) {
        //Test case 01 
        // N= 0 , Ex value =1 , actual value = ? STATUS :PASS/FAILD
        int n = 0;
        long expectedValue = 1;// hu vọng 0! = 1 
        long actualValue;
        actualValue = MathUtil1808.getFactorial(n);
        
        
        String result = n + ": | Expected: "+expectedValue 
                          + "  |Actual  : "+actualValue ;
      
        JOptionPane.showMessageDialog(null, result);
        
        





    }
}
