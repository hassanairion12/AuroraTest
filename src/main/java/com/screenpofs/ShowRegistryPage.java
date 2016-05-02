/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screenpofs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * Updated by:           Hassan Arshad
 * Updated on:           May 01, 2016
 * Update Summary:       View A Product Registry- Page Object Factory: Defines methods for handling and finding objects
 */
public class ShowRegistryPage {
     final WebDriver driver;
 
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/ul/li[3]/a")
 	public WebElement newRegistry_MenuOption;
        
        @FindBy(how = How.ID, using = "show-registry")
 	public WebElement product_Hyperlink;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"show-registry\"]/ol/li[2]/span[2]")
 	public WebElement store_TextBox;
        //driver.findElement (By.ByTagName);
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"show-registry\"]/ol/li[3]/span[2]")
 	public WebElement price_TextBox;
       
        
// This is a constructor, as every page need a base driver to find web elements
 
	public ShowRegistryPage(WebDriver driver)
 
	{
 
		this.driver = driver;
 
		}
        
       public String GetProductData(String dataAttribute){
          String dataVal= "";
          try{
            switch (dataAttribute){
                case "Product": 
                    this.product_Hyperlink.click();
                    dataVal= this.product_Hyperlink.getText();//getText(); 
                break;
                case "Store":dataVal=this.store_TextBox.getText();
                break;
                case "Price":dataVal=this.price_TextBox.getText();
                break;
                
                default: throw new IllegalArgumentException("Invalid data: " + dataAttribute);
            }
          }
          catch (Exception e) {
        }
            
        return dataVal;
        }
}
