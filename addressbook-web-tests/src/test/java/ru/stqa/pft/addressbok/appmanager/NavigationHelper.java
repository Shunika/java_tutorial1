package ru.stqa.pft.addressbok.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by shunya on 04.09.2016.
 */
public class NavigationHelper extends HelperBase {


  public NavigationHelper(FirefoxDriver wd) {
    super (wd);
  }

  public void gotoGroupPage() {//вставили метод из helperbase, вставили параметры -  локатор и  текст
   click(By.linkText("groups"));
  }

  public void goToHomePage() {
    click(By.linkText("home page"));
  }

  public  void goToAddNewContact() {
    click (By.linkText("add new"));
  }
}

