package ru.stqa.pft.addressbok.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by shunya on 04.09.2016.
 */
public class SessionHelper extends HelperBase {


  public SessionHelper(WebDriver wd) {

    super(wd);
  }
  public void login(String username, String password) {
    type(By.name("user"),username); //вставили метод из helperbase, вставили параметры -  локатор и  текст
    type(By.name("pass"),password); //вставили метод из helperbase, вставили параметры -  локатор и  текст


   click(By.xpath("//form[@id='LoginForm']/input[3]")); //вызов метода click из  helperbase
  }
}
