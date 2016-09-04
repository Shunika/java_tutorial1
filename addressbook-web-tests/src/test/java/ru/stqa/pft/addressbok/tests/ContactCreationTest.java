package ru.stqa.pft.addressbok.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbok.model.ContactData;

public class ContactCreationTest  extends TestBase{


    @Test
    public void testContactCreation() {

       app.getNavigationHelper().goToAddNewContact();
        app.getContacthelper().fillContactForm(new ContactData("1name", "mname", "lname", "testcompany", "test street"));
        app.getContacthelper().submitContactCreation();
        app.getNavigationHelper().goToHomePage();
    }


}
