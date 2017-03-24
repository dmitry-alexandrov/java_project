package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Test", "Testov", "Testovy", "Testo", "test", "ooo test", "ulitsa testovaya", "1", "89655555555", "89655555555", "89655555555", "test@test.test", "test@test.test", "test@test.test", "test.ru", "1990", "2010", "ulitsa testovaya", "2", "test"));
    app.getContactHelper().submitContactCreation();
  }

}
