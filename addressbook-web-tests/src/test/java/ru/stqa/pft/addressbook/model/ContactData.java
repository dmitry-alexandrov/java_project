package ru.stqa.pft.addressbook.model;

public class ContactData {

  public final String firstname;
  public final String middlename;
  public final String lastname;
  public final String nickname;
  public final String company;
  public final String address;
  public String group;

  public ContactData(String firstname, String middlename, String lastname, String nickname, String company, String address, String group) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.company = company;
    this.address = address;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getGroup() {
    return group;
  }
}
