package ru.stqa.pft.addressbok.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbok.model.ContactData;

/**
 * Created by shunya on 04.09.2016.
 */
public class ContactHelper extends HelperBase{



  public ContactHelper(FirefoxDriver wd) {
    super (wd);
  }

  public void submitContactCreation() {
    click("//div[@id='content']/form/input[21]");
  }

  private void click(String locator) {
    click (By.xpath(locator));
  }

  public  void fillContactForm(ContactData contactData) {
    type("firstname", contactData.getFirstname());
    type("middlename", contactData.getMiddlename());
    type("lastname", contactData.getLastname());
    click (By.name("title"));
    type("company", contactData.getCompanyname());
    type("address", contactData.getAddressname());

  }

  private void type(String locator, String text) {
    wd.findElement(By.name(locator)).click();
    wd.findElement(By.name(locator)).clear();
    wd.findElement(By.name(locator)).sendKeys(text);
  }



}

