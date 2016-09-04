package ru.stqa.pft.addressbok;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String companyname;
  private final String addressname;

  public ContactData(String firstname, String middlename, String lastname, String companyname, String addressname) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.companyname = companyname;
    this.addressname = addressname;
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

  public String getCompanyname() {
    return companyname;
  }

  public String getAddressname() {
    return addressname;
  }
}
