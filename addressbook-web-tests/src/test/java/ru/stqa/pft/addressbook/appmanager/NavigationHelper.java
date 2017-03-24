package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dmaleksandrov on 24.03.2017.
 */
public class NavigationHelper extends BaseHelper{

  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {

    this.wd = wd;

  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }
}
