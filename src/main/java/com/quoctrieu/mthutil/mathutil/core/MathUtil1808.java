/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quoctrieu.mthutil.mathutil.core;
// Quy tắc đặt tên package trong JAVA 
// + chữ thường toàn tập 
// + ghi theo tên miền công ty đảo ngược 
// +com.ten-cong-ty.ten-du-an.tên - module-nhóm - chức-năng 
// + com.microsoft.sqlserver.jdbc . tên class import vào để dùng 
// đây là kĩ thuật giúp code của nhiều dự án trong 1 cty có thể 
// ở chung folder mà ko bị lẫn lộn
// giúp thứ viện của các công ty khác nhau có ở cùng với nhau đã trùng
// tên
//KMS 




// C# GiaoLang.mathultil
// MICROSOT.MATHUTILS

/**
 *
 * @author HP
 */
public class MathUtil1808 {
    //hàm tính n! = 1...2....3...4..n!
    //hàm là static vì tính xong r trả về th
    //thg các thư viện sẽ là dug chug tính toán số liệu ta hay dug static
    //dug static
    
    //o! = 1! =1
    //n = 0...20! vì n = 21! vượt 10 số 0, 18 sô là vừa dủ long
    public static long getFactorial(int n){
        
        long product = 1; //tích - kết quả phép nhân
        if(n < 0 || n > 20 )
            throw new IllegalArgumentException("Invalid n , n must be between 0 to 20!!");
        if(n == 0 )
            return 1;
        for (int i = 1; i <= n; i++) 
            product*=i; // thuật toán nhân dồn vào
      
            
        return product;
    }
    
    
    
    
    
    
}
