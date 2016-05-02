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
public class ProductListPage {
     final WebDriver driver;
 
	@FindBy(how = How.XPATH, using = "//*[@id=\"list-product\"]/table/tbody/tr/td[1]/a")
 	public WebElement barCode_Href;
        
        @FindBy(how = How.XPATH, using = "//*[@id=\"list-product\"]/table/tbody/tr/td[2]")
 	public WebElement descpription_TableObject;
        
        
// This is a constructor, as every page need a base driver to find web elements
 
	public ProductListPage(WebDriver driver)
 
	{
 
		this.driver = driver;
 
		}
        
       
}
