package ru.stqa.pft.addressbok.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{

    

    @Test
    public void ContactDeletionTest() {

      app.getNavigationHelper().goToHomePage();
      app.getContacthelper().selectContact();
      app.getContacthelper().deleteContact ();
      app.getNavigationHelper().goToHomePage();



    }
    


}
