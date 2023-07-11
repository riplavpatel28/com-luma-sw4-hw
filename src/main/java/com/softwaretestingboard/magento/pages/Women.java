package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utiliites.Utility;
import org.openqa.selenium.By;

public class Women extends Utility {
    By Women =By.xpath("//a[@id='ui-id-4']");
    By Top =By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]");
    By Jacket = By.xpath("//a[@id='ui-id-11']");
    By sortBy = By.xpath("//div[2]//div[3]//select[1]");
    By Price =By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");

    public void mouseHoverOnWomen(){
        mouseHoverToElement(Women);
    }
    public void mouseHoverOnTop(){
        mouseHoverToElement(Top);
    }
    public void clickOnJacket(){
        clickOnElement(Jacket);
    }
    // Select Sort By filter “Product Name” alphabetical order
    public void selectSortByProductName(){
        selectByValueFromDropDown(sortBy,"name");
    }
    public void selectSortPrice(){
        selectByValueFromDropDown(Price,"price");
    }






















}
