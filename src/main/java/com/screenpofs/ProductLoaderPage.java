/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screenpofs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * Updated by:           Hassan Arshad
 * Updated on:           May 01, 2016
 * Update Summary:       View A New Product- Page Object Factory: Defines methods for handling and finding objects
 */
public class ProductLoaderPage {
     final WebDriver driver;
 
	@FindBy(how = How.XPATH, using = "//*[@id=\"product\"]")
 	public WebElement Product_DropDown;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"store\"]")
 	public WebElement store_TextBox;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"price\"]")
 	public WebElement price_TextBox;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"notes\"]")
 	public WebElement notes_TextBox;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"create\"]")
 	public WebElement create_Button; //Hassan Arshad's Note (Redundant): This object and like sof it are not changing ove rthe application so there must be a common class that cater sthese objects, which si left for later work
        
        
// This is a constructor, as every page need a base driver to find web elements
 
	public ProductLoaderPage(WebDriver driver)
 
	{
 
		this.driver = driver;
 
		}
        
        public void LoadProduct(String ProuctDataString) throws InterruptedException{
         Select oSelect;
         oSelect = new Select(this.Product_DropDown);
         oSelect.selectByVisibleText(ProuctDataString);
	 Thread.sleep(2000);
            
                                         }
        
        public void ProductData(String storeTD, String priceTD){
            this.store_TextBox.sendKeys(storeTD);
            this.price_TextBox.sendKeys(priceTD);
            this.create_Button.click();
                                         }
}
