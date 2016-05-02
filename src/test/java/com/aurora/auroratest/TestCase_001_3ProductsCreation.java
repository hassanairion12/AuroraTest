/*----------------------BUG Report-------------------------------------------
1. 
Error 500: Internal Server Error
URI
/prizy-pricer/product/show/2525
Class
java.lang.NullPointerException
Message
Cannot invoke method getIdealPrice() on null object
Trace
   Line | Method
->>   9 | getIdealPrice in prizy.pricer.IdealPriceStrategy
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
|    54 | getPrices     in prizy.pricer.ProductController
|    42 | show . . . .  in     ''
^   662 | run           in java.lang.Thread


2. The Language settings do not apply to the whole application it only applies to an individual page which is not a corretc behavior, ust apply to each page and must be intuitive neough to follow the settings of a parent page
------------------------------------------------------------------------------- */

package com.aurora.auroratest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.screenpofs.HomePagePrizy;
import com.screenpofs.CreateNewProductPage;
import com.screenpofs.ProductViewerPage;

import com.commonclasses.JSONReaderWriter;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hassan
 */
public class TestCase_001_3ProductsCreation {
    
    static WebDriver driver;
 
            HomePagePrizy HomePage;
            CreateNewProductPage CreateProduct;
            ProductViewerPage ProductViewer;
 
 
  @BeforeMethod
 
  public void beforeMethod() {
 
      driver = new FirefoxDriver();
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("http://tomcat.jcor.com.ar/prizy-pricer/?lang=en");
 
      HomePage = PageFactory.initElements(driver, HomePagePrizy.class);
      CreateProduct = PageFactory.initElements(driver, CreateNewProductPage.class);
      ProductViewer = PageFactory.initElements(driver, ProductViewerPage.class);
      
 
 
  }
 
  @Test
 
  public void test() {
      
         
      
      JSONReaderWriter newReader= new JSONReaderWriter();
      String filePath; 
      
      //Note: Always use a relativ epath, the Absolute path here is for demo purposes only for this particular assignment
      filePath = "D:\\Selenuim\\AuroraTest\\AuroraTest\\src\\test\\testdata\\testcase001\\testcase001.json";
      
      String getBarCode1= newReader.GetJSONDataTestCase001(filePath, "BarCode1");
      String getDescription1= newReader.GetJSONDataTestCase001(filePath, "Description1");
      
      CreateProduct.CreateProduct(getBarCode1, getDescription1);
      
      String barCode1= ProductViewer.GetNewProductData("BarCode");
      Assert.assertEquals(barCode1,getBarCode1);
      
      String description1= ProductViewer.GetNewProductData("Description");
      Assert.assertEquals(description1,getDescription1);
      
      ProductViewer.newProduct_MenuOption.click();
      
      String getBarCode2= newReader.GetJSONDataTestCase001(filePath, "BarCode2");
      String getDescription2= newReader.GetJSONDataTestCase001(filePath, "Description2");
      
      CreateProduct.CreateProduct(getBarCode2, getDescription2);
      
      String barCode2= ProductViewer.GetNewProductData("BarCode");
      Assert.assertEquals(barCode2,getBarCode2);
      
      String description2= ProductViewer.GetNewProductData("Description");
      Assert.assertEquals(description2,getDescription2);
      
      ProductViewer.newProduct_MenuOption.click();
      
      String getBarCode3= newReader.GetJSONDataTestCase001(filePath, "BarCode3");
      String getDescription3= newReader.GetJSONDataTestCase001(filePath, "Description3");
      
      CreateProduct.CreateProduct(getBarCode3, getDescription3);
      
      String barCode3= ProductViewer.GetNewProductData("BarCode");
      Assert.assertEquals(barCode3,getBarCode3);
      
      String description3= ProductViewer.GetNewProductData("Description");
      Assert.assertEquals(description3,getDescription3);

      
      
   }
 
  @AfterMethod
 
  public void afterMethod() {
 
	driver.quit();
 
  }
}
