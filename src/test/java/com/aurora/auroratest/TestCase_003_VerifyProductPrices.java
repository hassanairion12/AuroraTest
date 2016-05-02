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

import com.commonclasses.JSONReaderWriter;
import com.screenpofs.CreateNewProductPage;
import com.screenpofs.HomePagePrizy;
import com.screenpofs.ProductViewerPage;
import com.screenpofs.ProductListPage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Hassan
 */
public class TestCase_003_VerifyProductPrices {
    
    public TestCase_003_VerifyProductPrices() {
    }

    static WebDriver driver;
 
            HomePagePrizy HomePage;
            CreateNewProductPage CreateProduct;
            ProductViewerPage ProductViewer;
            ProductListPage ProductListPg;
 
 
  @BeforeMethod
 
  public void beforeMethod() {
 
      driver = new FirefoxDriver();
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("http://tomcat.jcor.com.ar/prizy-pricer/?lang=en");
 
      HomePage = PageFactory.initElements(driver, HomePagePrizy.class);
      CreateProduct = PageFactory.initElements(driver, CreateNewProductPage.class);
      ProductViewer = PageFactory.initElements(driver, ProductViewerPage.class);
      ProductListPg = PageFactory.initElements(driver, ProductListPage.class);
      
 
 
  }
 
  @Test
 
  public void test() {
      
      
      System.out.println("Click to navigate to New Product Page");
      HomePage.link_CreateNewProduct.click();
      
      //Step 1: Create Product 1 from JSON File
      JSONReaderWriter newReader= new JSONReaderWriter();
      String filePath; 
      filePath = "D:\\Selenuim\\AuroraTest\\AuroraTest\\src\\test\\testdata\\testcase001\\testcase001.json";
      
      //Peoduct No 1
      String getBarCode1= newReader.GetJSONDataTestCase001(filePath, "BarCode1");
           
      HomePage.SearchProduct(getBarCode1);
      ProductListPg.barCode_Href.click();
      
      String AveragePrice1= ProductViewer.GetNewProductData("AveragePrice");
      Assert.assertEquals(AveragePrice1,"10");
      
      String LowestPrice1= ProductViewer.GetNewProductData("LowestPrice");
      Assert.assertEquals(LowestPrice1,"10");
      
      String HigestPrice1= ProductViewer.GetNewProductData("HighestPrice");
      Assert.assertEquals(HigestPrice1,"10");
      
      String IdealPrice1= ProductViewer.GetNewProductData("HighestPrice");
      Assert.assertEquals(IdealPrice1,"12");
      
      //Product No 2
      String getBarCode2= newReader.GetJSONDataTestCase001(filePath, "BarCode2");
           
      HomePage.SearchProduct(getBarCode2);
      ProductListPg.barCode_Href.click();
      
      String AveragePrice2= ProductViewer.GetNewProductData("AveragePrice");
      Assert.assertEquals(AveragePrice2,"10");
      
      String LowestPrice2= ProductViewer.GetNewProductData("LowestPrice");
      Assert.assertEquals(LowestPrice2,"10");
      
      String HigestPrice2= ProductViewer.GetNewProductData("HighestPrice");
      Assert.assertEquals(HigestPrice2,"10");
      
      String IdealPrice2= ProductViewer.GetNewProductData("HighestPrice");
      Assert.assertEquals(IdealPrice2,"12");
      
     //Product No 3
      
     String getBarCode3= newReader.GetJSONDataTestCase001(filePath, "BarCode3");
           
      HomePage.SearchProduct(getBarCode3);
      ProductListPg.barCode_Href.click();
      
      String AveragePrice3= ProductViewer.GetNewProductData("AveragePrice");
      Assert.assertEquals(AveragePrice3,"10");
      
      String LowestPrice3= ProductViewer.GetNewProductData("LowestPrice");
      Assert.assertEquals(LowestPrice3,"10");
      
      String HigestPrice3= ProductViewer.GetNewProductData("HighestPrice");
      Assert.assertEquals(HigestPrice3,"10");
      
      String IdealPrice3= ProductViewer.GetNewProductData("HighestPrice");
      Assert.assertEquals(IdealPrice3,"12");
   }
 
  @AfterMethod
 
  public void afterMethod() {
 
	driver.quit();
 
  }
}
