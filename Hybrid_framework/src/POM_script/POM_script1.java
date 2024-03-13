package POM_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import generic_script.base_page;

public class POM_script1 extends base_page
{
  @FindBy(id="email")
  private WebElement uname;
  @FindBy(id="pass")
  private WebElement pwd;
  @FindBy(name="login")
  private WebElement login;
  public POM_script1(WebDriver driver)
  {
	  super(driver);
  }
  public void passData(String un)
  {
	  uname.sendKeys(un);
  }
  public void passData1(String password)
  {
	  pwd.sendKeys(password);
  }
  public void passData2()
  {
	  login.click();
  }
}
