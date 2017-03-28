package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    app.navigationHelper.gotoContactPage();
    app.contactHelper.selectContacts();
    app.contactHelper.initContactModification();
    app.contactHelper.fillContactForm(new ContactData("Dmitry1", "Yurievich1", "Alexandrov1", "Dim1", "Google1", "Palo Alto1"));
    app.contactHelper.testContactModification();
    app.contactHelper.returntoContactsPage();
  }
}
