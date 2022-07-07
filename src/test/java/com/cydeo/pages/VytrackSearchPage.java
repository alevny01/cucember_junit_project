package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackSearchPage  {

    public VytrackSearchPage(){

     PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement login;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleet;


    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicles;

    @FindBy(xpath = "//div[@class='btn-group']")
    public WebElement export;




































}
