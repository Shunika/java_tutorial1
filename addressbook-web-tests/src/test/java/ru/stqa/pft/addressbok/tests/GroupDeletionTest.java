package ru.stqa.pft.addressbok.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{
    

    
    @Test
    public void testGroupDeletion() {

        app.getNavigationHelper().gotoGroupPage(); //заменили шаги на методы из TestBase
        app.getGroupHelper().selectGroup(); //создали новый метод
        app.getGroupHelper().deleteSelectedGroup();//создали новый метод
        app.getGroupHelper().returnToGroupPage();//заменили шаги на методы из TestBase
    }


}
