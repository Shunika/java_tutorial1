package ru.stqa.pft.addressbok;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{
    

    
    @Test
    public void testGroupDeletion() {

        gotoGroupPage(); //заменили шаги на методы из TestBase
        selectGroup(); //создали новый метод
        deleteSelectedGroup();//создали новый метод
        returnToGroupPage();//заменили шаги на методы из TestBase
    }


}
