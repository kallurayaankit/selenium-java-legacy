package com.sdet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    WebDriver driver;

    By shoppingCartLink = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isInventoryDisplayed() {
        return driver.getCurrentUrl().contains("inventory.html");
    }

    public void addItemToCart(String itemName) {
        // itemName is the product name text
        driver.findElement(By.xpath("//div[text()='" + itemName + "']/ancestor::div[@class='inventory_item']//button")).click();
    }

    public void goToCart() {
        driver.findElement(shoppingCartLink).click();
    }
}