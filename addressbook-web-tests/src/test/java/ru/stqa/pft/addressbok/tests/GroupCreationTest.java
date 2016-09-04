package ru.stqa.pft.addressbok.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbok.model.GroupData;


public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() {//method

    app.gotoGroupPage(); //выделили вспомогательный метод
    app.initGroupCreation();//выделили вспомогательный метод
    app.fillGroupForm(new GroupData("test1", "test2", "test3")); //создался новый объект с параметрами
    app.submitGroupCreation();//выделили вспомогательный метод
    app.returnToGroupPage();//выделили вспомогательный метод
  }

}
