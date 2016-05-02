/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screenpofs;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * Updated by:           Hassan Arshad
 * Updated on:           May 01, 2016
 * Update Summary:       View A New Product- Page Object Factory: Defines methods for handling and finding objects
 */
public class ProductViewerPage {
     final WebDriver driver;
 
	@FindBy(how = How.XPATH, using = "//*[@id=\"show-product\"]/ol/li[1]/span[2]")
 	public WebElement barCode_TextBox;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"show-product\"]/ol/li[2]/span[2]")
 	public WebElement descpription_Text;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"show-product\"]/ol/li[3]/span[2]")
 	public WebElement averagePrice_Text;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"show-product\"]/ol/li[4]/span[2]")
 	public WebElement lowestPrice_Text;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"show-product\"]/ol/li[5]/span[2]")
 	public WebElement highestPrice_Text;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"show-product\"]/ol/li[6]/span[2]")
 	public WebElement idealPrice_Text;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"show-product\"]/ol/li[7]/span[2]")
 	public WebElement numberOfPrices_Text;
        
        @FindBy(how = How.XPATH, using = "/html/body/div[4]/ul/li[4]/a")
 	public WebElement newProduct_MenuOption;
 
// This is a constructor, as every page need a base driver to find web elements
 
	public ProductViewerPage(WebDriver driver)
 
	{
 
		this.driver = driver;
 
		}
        
        public String GetNewProductData(String dataAttribute){
          String dataVal= "";
          try{
            switch (dataAttribute){
                case "BarCode": dataVal= this.barCode_TextBox.getText(); 
                break;
                case "Description":dataVal=this.descpription_Text.getText();
                break;
                case "AveragePrice":dataVal=this.averagePrice_Text.getText();
                break;
                case "HighestPrice":dataVal=this.highestPrice_Text.getText();
                break;
                case "IdealPrice":dataVal=this.idealPrice_Text.getText();
                break;
                case "LowestPrice":dataVal=this.lowestPrice_Text.getText();
                break;
                default: throw new IllegalArgumentException("Invalid data: " + dataAttribute);
            }
          }
          catch (Exception e) {
        }
            
        return dataVal;
        }
}
