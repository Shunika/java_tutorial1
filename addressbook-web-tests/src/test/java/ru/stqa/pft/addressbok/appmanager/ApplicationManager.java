package ru.stqa.pft.addressbok.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbok.model.ContactData;

import java.util.concurrent.TimeUnit;


public class ApplicationManager {
  FirefoxDriver wd;
  private  ContactHelper contactHelper;
  private SessionHelper sessionHelper;
  private  NavigationHelper navigationHelper;
  private  GroupHelper groupHelper;

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper.login ("admin", "secret");

  }




  public void stop() {
    wd.quit();
  }


  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }



  public ContactHelper getContacthelper() {
    return contactHelper;
  }
}

