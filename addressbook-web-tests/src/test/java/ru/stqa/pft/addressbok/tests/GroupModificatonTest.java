package ru.stqa.pft.addressbok.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbok.model.GroupData;

/**
 * Created by shunya on 04.09.2016.
 */
public class GroupModificatonTest extends TestBase {

  @Test
  public void testGroupModification () { //создали новый метод
    app.getNavigationHelper().gotoGroupPage(); //скопировли из другога теста
    app.getGroupHelper().selectGroup();//скопировли из другога теста
    app.getGroupHelper().initGroupModification (); // создали метод в GroupHelper
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3")); // скопировали из др. теста
    app.getGroupHelper().submitGroupModification ();// создали метод в GroupHelper
    app.getGroupHelper().returnToGroupPage();// скопировали из др. теста
  }
}
