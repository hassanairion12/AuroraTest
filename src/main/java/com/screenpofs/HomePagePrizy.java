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

/**
 *
 * Updated by:           Hassan Arshad
 * Updated on:           May 01, 2016
 * Update Summary:       Home Page- Page Object Factory: Defines methods for handling and finding objects
 */
public class HomePagePrizy {
     final WebDriver driver;
 
	@FindBy(how = How.XPATH, using = "//*[@id=\"controller-list\"]/ul/li[4]/a")
 	public WebElement link_CreateNewProduct;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"controller-list\"]/ul/li[3]/a")
 	public WebElement link_ProductLoader;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"q\"]")
 	public WebElement search_TextBox;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"productSearchForm\"]/input[2]")
 	public WebElement findProduct_Button;
 
// This is a constructor, as every page need a base driver to find web elements
 
	public HomePagePrizy(WebDriver driver)
 
	{
 
		this.driver = driver;
 
		}
        public void SearchProduct(String productNameByBarCode){
          this.search_TextBox.sendKeys(productNameByBarCode);
          this.findProduct_Button.click();
        }
}
