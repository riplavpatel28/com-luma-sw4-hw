package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.Gear;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    Gear gear = new Gear();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //* Mouse Hover on Gear Menu
        gear.mouseHooverOnGear();
        //  * Click on Bags
        Thread.sleep(3000);

         gear.ClickOnBags();
        //* Click on Product Name ‘Overnight Duffle’
        gear.ClickOnOverNightDuffle();
        //* Verify the text ‘Overnight Duffle’
        String actualProductMessage = "Overnight Duffle";
        String expectedProductMessage = gear.getTextOverNightDuffle();
        Assert.assertEquals(actualProductMessage, expectedProductMessage);
        ;        //* Change Qty 3
        gear.clearAndAddQuantity();

        // * Click on ‘Add to Cart’ Button.
        gear.clickOnAddToCart1();
        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String actualMessage = "‘You added Overnight Duffle to your shopping cart.";
        String expectedMessage = gear.getTextOverNightDuffleToYourShoppingCart();
        Assert.assertEquals(actualMessage, expectedMessage);


        //* Click on ‘shopping cart’ Link into message
        gear.clickOnShoppingCartLink();
        //* Verify the product name ‘Cronus Yoga Pant’
        String actualProductName = "Cronus Yoga Pant";
        String expectedProductName = gear.getTextCronusYogaPant();
        Assert.assertEquals(actualProductName, expectedProductName);

        // * Verify the Qty is ‘3’
        String actualQuantity = "3";
        String expectedQuantity = gear.getTextToQty();
        Assert.assertEquals(actualQuantity, expectedQuantity);

        //* Verify the product price ‘$135.00’
        String actualPrice = "$135.00";
        String expectedPrice = gear.getTextToPrice();
        Assert.assertEquals(actualPrice, expectedPrice);

        //* Change Qty to ‘5’
        gear.clearAndAddQuantity2();

        //* Click on ‘Update Shopping Cart’ button
        gear.clickOnUpdateCart();
        //* Verify the product price ‘$225.00’
        String expectedUpdatedTotalAmount = "$225.00";
        String actualUpdatedTotalAmount   = gear. getTextToVerifyTotalAmountInTheCartAfterUpdatingQty();
        Assert.assertEquals(expectedUpdatedTotalAmount,actualUpdatedTotalAmount);
    }


}
