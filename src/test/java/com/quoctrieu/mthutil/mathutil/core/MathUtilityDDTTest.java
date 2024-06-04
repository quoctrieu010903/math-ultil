/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.quoctrieu.mthutil.mathutil.core;


// Quy tắt đặt tên package trong java 
// tên miền công ty đảo ngược , đi kèm thông tin dự án / project và module
//com.ten-cty.ten-du-an.module. ten class
//com.microsoft/sqlserver.jdbc.
//com.microsoft.sql
import com.quoctrieu.mathultil.math.ultil.main.MathUltil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author HP
 */

// class này chứa các test case dùng đê test code của class 
// chính bên mathun
public class MathUtilityDDTTest {
   
    //CHUẨN BỊ BỘ DATA ĐƯA VÀO HÀM getFactorial()
    //chuẩn bị luôn bộ data kết quả trả về từ hàm
    // 0! -> 1 ; 1! -> 1 , 2! -> 2  , 3!  - > 6  4! -> 24  5! -> 120 
    //  {0,1}, {1,1}  , {2,2} , {3,6} , {4,24} , {5, 120}
    
    public static Object[][] initData(){
        return new Object[][] {{0,1}, 
                               {1,1},
                               {2,2}, 
                               {3,6}, 
                               {4,24}, 
                               {5,120},
                               {6,720}
                              };
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void TestFactorialGivenRightAgrumentReturnsWell(int n , long expected){
        
        assertEquals(expected , MathUtil1808.getFactorial(n));
    }
}
