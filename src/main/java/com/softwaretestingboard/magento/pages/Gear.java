package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utiliites.Utility;
import org.openqa.selenium.By;

public class Gear extends Utility {
    By Gear = By.xpath("//span[normalize-space()='Gear']");
    By Bags = By.xpath("//span[contains(text(),'Bags')]");
    By overnightDuffle = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By ProductMessage = By.id("page-title-wrapper");
    By AddQty = By.xpath("//input[@id='qty']");
    By AddToCart1 = By.xpath("//span[normalize-space()='Add to Cart']");
    By message = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By ShoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By CronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By VerifyQty3 = By.id("qty");
    By Price = By.xpath("//span[contains(text(),'$135.00')]");
    By AddQty2 = By.xpath("//input[@id='cart-245684-qty']");
    By TotalAmount = By.xpath("//span[@data-bind='text: getValue()'][normalize-space()='$135.00']");
    By UpdateCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public void mouseHooverOnGear() {
        mouseHoverToElement(Gear);
    }

    public void ClickOnBags() {
        clickOnElement(Bags);
    }

    public void ClickOnOverNightDuffle() {
        clickOnElement(overnightDuffle);
    }

    public String getTextOverNightDuffle() {
        return getTextFromElement(ProductMessage);
    }

    public void clearAndAddQuantity() {
        clearTextToElement(AddQty);
        sendTextToElement(AddQty, "3");
        clickOnElement(AddQty);
    }

    public void clickOnAddToCart1() {
        clickOnElement(AddToCart1);
    }

    public String getTextOverNightDuffleToYourShoppingCart() {
        return getTextFromElement(message);

    }

    public void clickOnShoppingCartLink() {
        clickOnElement(ShoppingCartLink);
    }

    public String getTextCronusYogaPant() {
        return getTextFromElement(CronusYogaPant);
    }

    public String getTextToQty() {
        return getTextFromElement(VerifyQty3);
    }

    public String getTextToPrice() {
        return getTextFromElement(Price);
    }

    public void clearAndAddQuantity2() {
        clearTextToElement(AddQty2);
        sendTextToElement(AddQty2, "2");
        clickOnElement(AddQty2);
    }

    public void clickOnUpdateCart() {
        clickOnElement(UpdateCart);

    }

    public String getTextToVerifyTotalAmountInTheCartAfterUpdatingQty() {
        return getTextFromElement(TotalAmount);
    }

}




