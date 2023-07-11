package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.Women;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    Women women =new Women();
    @Test
    public void verifyTheSortByProductNameFilter() {
        // * Mouse Hover on Women Menu
        women.mouseHoverOnWomen();
        //* Mouse Hover on Tops
        women.mouseHoverOnTop();
        //* Click on Jackets
        women.clickOnJacket();
        //* Select Sort By filter “Product Name”
        women.selectSortByProductName();

        // * Verify the products name display in alphabetical order


    }

      @Test
    public void verifyTheSortByPriceFilter(){
          women.mouseHoverOnWomen();
          //* Mouse Hover on Tops
          women.mouseHoverOnTop();
          //* Click on Jackets
          women.clickOnJacket();
         // Select Sort By filter “Price”
          women.selectSortPrice();
         // Verify the products price display inLow to High





      }













    }












