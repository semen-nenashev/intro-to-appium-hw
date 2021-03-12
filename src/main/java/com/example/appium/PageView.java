package com.example.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;

public class PageView {
    AppiumDriver<MobileElement> driver;
    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeTextField[`label == \"TextField1\"`]")
    @AndroidFindBy(id = "edit")
    MobileElement textField;
    // TODO define textField MobileElement using @FindBy kind of annotations for iOS and Android

    public PageView(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getTextField() {
        return textField.getText();
    }

    public PageView setTextField(String text) {
        textField.sendKeys(text);
        return this;
    }
}
