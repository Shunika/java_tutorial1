package ru.stqa.pft.addressbok;


import org.testng.annotations.Test;



public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() {//method

    gotoGroupPage(); //выделили вспомогательный метод
    initGroupCreation();//выделили вспомогательный метод
    fillGroupForm(new GroupData("test1", "test2", "test3")); //создался новый объект с параметрами
    submitGroupCreation();//выделили вспомогательный метод
    returnToGroupPage();//выделили вспомогательный метод
  }

}
