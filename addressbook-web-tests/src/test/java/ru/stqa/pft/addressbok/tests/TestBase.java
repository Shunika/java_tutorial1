package ru.stqa.pft.addressbok.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbok.appmanager.ApplicationManager;

/**
 * Created by shunya on 31.08.2016.
 */
public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init(); //выделен вспомогательный метод
  }

  @AfterMethod
  public void tearDown() {
    app.stop();//выделен вспомогательный метод окончания теста
  }

}
