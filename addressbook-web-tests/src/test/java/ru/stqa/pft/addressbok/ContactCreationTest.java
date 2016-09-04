package ru.stqa.pft.addressbok;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbok.tests.TestBase;

public class ContactCreationTest  extends TestBase{


    @Test
    public void testContactCreation() {

        goToAddNewContact();
        fillContactForm(new ContactData("1name", "mname", "lname", "testcompany", "test street"));
        submitContactCreation();
        goToHomePage();
    }


}
