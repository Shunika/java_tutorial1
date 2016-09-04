package ru.stqa.pft.addressbok.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbok.model.GroupData;


public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() {//method

    app.getNavigationHelper().gotoGroupPage(); //выделили вспомогательный метод
    app.getGroupHelper().initGroupCreation();//выделили вспомогательный метод
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3")); //создался новый объект с параметрами
    app.getGroupHelper().submitGroupCreation();//выделили вспомогательный метод
    app.getGroupHelper().returnToGroupPage();//выделили вспомогательный метод
  }

}
