package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {

    initContactCreation();
    fillContactForm(new ContactData("Test", "Testov", "Testovy", "Testo", "test", "ooo test", "ulitsa testovaya", "1", "89655555555", "89655555555", "89655555555", "test@test.test", "test@test.test", "test@test.test", "test.ru", "1990", "2010", "ulitsa testovaya", "2", "test"));
    submitContactCreation();
  }

}
