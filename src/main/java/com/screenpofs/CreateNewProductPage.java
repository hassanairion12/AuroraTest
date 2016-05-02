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
 * Update Summary:       Create New Product- Page Object Factory: Defines methods for handling and finding objects
 */
public class CreateNewProductPage {
     final WebDriver driver;
 
	@FindBy(how = How.XPATH, using = "//*[@id=\"barCode\"]")
 	public WebElement barCode_TextBox;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
 	public WebElement descpription_TextBox;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"create\"]")
 	public WebElement create_Button;
 
// This is a constructor, as every page need a base driver to find web elements
 
	public CreateNewProductPage(WebDriver driver)
 
	{
 
		this.driver = driver;
 
		}
        
        public void CreateProduct(String barCodeTD, String descTD){
          
            this.barCode_TextBox.sendKeys(barCodeTD);
            this.descpription_TextBox.sendKeys(descTD);
            this.create_Button.click();
        }
}
