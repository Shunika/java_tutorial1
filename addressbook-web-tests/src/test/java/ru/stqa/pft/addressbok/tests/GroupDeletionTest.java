package ru.stqa.pft.addressbok.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{
    

    
    @Test
    public void testGroupDeletion() {

        app.gotoGroupPage(); //заменили шаги на методы из TestBase
        app.selectGroup(); //создали новый метод
        app.deleteSelectedGroup();//создали новый метод
        app.returnToGroupPage();//заменили шаги на методы из TestBase
    }


}
