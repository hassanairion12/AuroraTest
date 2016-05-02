/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.commonclasses;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.aurora.auroratest.TestDataCookBook;

 

/**
 *
 * @author Hassan
 */
public class JSONReaderWriter {
    
    public JSONReaderWriter(){
    
    }
     public String GetJSONDataTestCase001(String filePath, String JSONObjVal)
    {
        Gson gson=new Gson();
        String returnVal= "";
        try {
            System.out.println("Reading JSON from a file");
            System.out.println("----------------------------");

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            //convert the json string back to object
            TestDataCookBook testCasesObj = gson.fromJson(br, TestDataCookBook.class);
                       
            switch (JSONObjVal){
                
                case "BarCode1": returnVal= testCasesObj.getBarCode1(); 
                    break;
                case "Description1": returnVal= testCasesObj.getDescription1();
                    break;
                case "BarCode2": returnVal= testCasesObj.getBarCode2();
                    break;
                case "Description2": returnVal= testCasesObj.getDescription2();
                    break;
                case "BarCode3": returnVal= testCasesObj.getBarCode3();
                    break;
                case "Description3": returnVal= testCasesObj.getDescription3();
                    break;
                    
                default: throw new IllegalArgumentException("Invalid day of the week: " + JSONObjVal);
                    
            
            }

            
        } catch (IOException e) {
        }
    return returnVal ;}
     
     public String GetJSONDataTestCase002(String filePath, String JSONObjVal)
    {
        Gson gson=new Gson();
        String returnVal= "";
        try {
            System.out.println("Reading JSON from a file");
            System.out.println("----------------------------");

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            //convert the json string back to object
            TestDataCookBook testCasesObj = gson.fromJson(br, TestDataCookBook.class);
                       
            switch (JSONObjVal){
                
                case "Product1": returnVal= testCasesObj.getProduct1(); 
                    break;
                case "Product2": returnVal= testCasesObj.getProduct2(); 
                    break;
                case "Product3": returnVal= testCasesObj.getProduct3(); 
                    break;
                case "Store1": returnVal= testCasesObj.getStore1(); 
                    break;
                case "Price1": returnVal= testCasesObj.getPrice1();
                    break;
                case "Store2": returnVal= testCasesObj.getStore2();
                    break;
                case "Price2": returnVal= testCasesObj.getPrice2();
                    break;
                case "Store3": returnVal= testCasesObj.getStore3();
                    break;
                case "Price3": returnVal= testCasesObj.getPrice3();
                    break;
                case "Store4": returnVal= testCasesObj.getStore4();
                    break;
                case "Price4": returnVal= testCasesObj.getPrice4();
                    break;
                case "Store5": returnVal= testCasesObj.getStore5();
                    break;
                case "Price5": returnVal= testCasesObj.getPrice5();
                    break;
                case "Store6": returnVal= testCasesObj.getStore3();
                    break;
                case "Price6": returnVal= testCasesObj.getPrice6();
                    break;
                case "Store7": returnVal= testCasesObj.getStore7();
                    break;
                case "Price7": returnVal= testCasesObj.getPrice7();
                    break;
                case "Store8": returnVal= testCasesObj.getStore8();
                    break;
                case "Price8": returnVal= testCasesObj.getPrice8();
                    break;
                case "Store9": returnVal= testCasesObj.getStore9();
                    break;
                case "Price9": returnVal= testCasesObj.getPrice9();
                    break;
                case "Store10": returnVal= testCasesObj.getStore1();
                    break;
                case "Price10": returnVal= testCasesObj.getPrice10();
                    break;
                    
                default: throw new IllegalArgumentException("Invalid day of the week: " + JSONObjVal);
                    
            
            }

            
        } catch (IOException e) {
        }
    return returnVal ;
    }
    
   
   
    
}
