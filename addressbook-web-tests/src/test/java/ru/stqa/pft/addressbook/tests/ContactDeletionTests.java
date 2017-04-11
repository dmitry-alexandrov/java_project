package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoContactPage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Dmitry", "Yurievich", "Alexandrov", "Dim", "Google", "Palo Alto", "test1"), true);
    }
    app.getContactHelper().selectContacts();
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().returntoContactsPage();
  }
}
