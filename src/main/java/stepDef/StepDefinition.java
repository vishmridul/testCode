package stepDef;

import com.google.gson.Gson;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.SpaceXResponce;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Constants;

public class StepDefinition {
  WebDriver driver;
  WebDriverWait wait;
  String price;
  String flight_number;
  String Airline;
  Response response;


  @Given("^user navigate to flight booking screen$")
  public void user_navigate_to_flight_booking_screen() throws Throwable {
    System.out.println("APP URL:- "+ Constants.URL);
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();
    //options.addArguments("--headless", "--window-size=1920,1200");
    driver = new ChromeDriver(options);

    driver.get(Constants.URL );
    wait = new WebDriverWait(driver, 5);
    wait.until(driver -> ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"));
    if (driver.findElement(By.xpath("//div[@class='container']/h1")).getText().contains("Welcome to the Simple Travel Agency")){
      System.out.println("Home Page Displayed successfully");
    }else{
      System.out.println("Home page not displayed");
      Assert.fail();
    }

  }

  @When("^user select the departure \"([^\"]*)\" city$")
  public void user_select_the_departure_city(String city) throws Throwable {
    Select from_ddl=new Select(driver.findElement(By.name("fromPort")));
    from_ddl.selectByValue(city);
    WebElement selcted = from_ddl.getFirstSelectedOption();
    if (selcted.getText().equalsIgnoreCase(city)){
      System.out.println("City Is selected as "+city);
    }else {
      System.out.println("fail to select city "+city);
      Assert.fail();
    }

  }

  @When("^user select destination \"([^\"]*)\" city$")
  public void user_select_destination_city(String city) throws Throwable {
    Select from_ddl=new Select(driver.findElement(By.name("toPort")));
    from_ddl.selectByValue(city);
    WebElement selcted = from_ddl.getFirstSelectedOption();
    if (selcted.getText().equalsIgnoreCase(city)){
      System.out.println("City Is selected as "+city);
    }else {
      System.out.println("fail to select city "+city);
      Assert.fail();
    }

  }

  @When("^Search for flight$")
  public void search_for_flight() throws Throwable {
    System.out.println("Clicking Submit to register ");
    driver.findElement(By.xpath("//input[@type='submit']")).click();


  }

  @Then("^User Should be able to see the search result$")
  public void user_Should_be_able_to_see_the_search_result() throws Throwable {
    wait = new WebDriverWait(driver, 5);
    wait.until(driver -> ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"));
    if (driver.findElement(By.xpath("//div[@class='container']/h3")).getText().contains("Flights from")){
      System.out.println("Search result Page Displayed successfully");
      System.out.println("Total result Displayed "+driver.findElements(By.xpath("//input[@value='Choose This Flight']")).size());
    }else{
      System.out.println("Search result page not displayed");
      Assert.fail();
    }
    driver.close();

  }


  @When("^user select a flight and supply user details$")
  public void user_select_a_flight_and_supply_user_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Selecting the first flight in result and booking the ticket");
    price=driver.findElement(By.xpath("//tr/td[6]")).getText();
    flight_number=driver.findElement(By.xpath("//tr/td[2]")).getText();
    Airline=driver.findElement(By.xpath("//tr/td[2]")).getText();
    driver.findElements(By.xpath("//input[@value='Choose This Flight']")).get(0).click();

    driver.findElement(By.id("inputName")).sendKeys(RandomStringUtils.randomAlphabetic(6));
    driver.findElement(By.id("address")).sendKeys(RandomStringUtils.randomAlphabetic(6)+" "+RandomStringUtils.randomAlphabetic(6));
    driver.findElement(By.id("city")).sendKeys(RandomStringUtils.randomAlphabetic(4));
    driver.findElement(By.id("state")).sendKeys(RandomStringUtils.randomAlphabetic(4));
    driver.findElement(By.id("zipCode")).sendKeys(RandomStringUtils.randomNumeric(6));
    driver.findElement(By.id("creditCardNumber")).sendKeys(RandomStringUtils.randomNumeric(16));
    driver.findElement(By.id("nameOnCard")).sendKeys(RandomStringUtils.randomAlphabetic(6));
    driver.findElement(By.xpath("//input[@type='submit']")).click();
  }

  @Then("^user should be able to book the flight$")
  public void user_should_be_able_to_book_the_flight() throws Throwable {
    wait = new WebDriverWait(driver, 5);
    wait.until(driver -> ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"));
    if (driver.findElement(By.xpath("//div[@class='container hero-unit']/h1")).getText().contains("Thank you for your purchase today")){
      System.out.println("Success page Displayed successfully");
      System.out.println("Booking Id  "+driver.findElement(By.xpath("//tr/td[2]")).getText());
    }else{
      System.out.println("Search result page not displayed");
      Assert.fail();
    }
    driver.close();

  }

  @Given("^user hit spacex api$")
  public void user_hit_spacex_api() throws Throwable {
    response=getApi(Constants.SPACEX_URL_END_POINT);


  }

  @When("^user receives the responce with \"([^\"]*)\"$")
  public void user_receives_the_responce_with(String arg1) throws Throwable {
    if(response.getStatusCode()==Integer.parseInt(arg1)){
      System.out.println(arg1+" Response received");
    }else{
      System.out.println(arg1+" Response received");
      Assert.fail();
    }

  }

  @Then("^User Should be able to see the flight number$")
  public void user_Should_be_able_to_see_the_flight_number() throws Throwable {
    String responceBody=response.getBody().asString();
    SpaceXResponce spaceXResponce=new Gson().fromJson(responceBody,SpaceXResponce.class);
    System.out.println(spaceXResponce.getCapsules());

  }

  public Response getApi(String uri) {
    Response responseObj = null;
    try {
      RestAssured.baseURI = uri;
      RequestSpecification httpRequest = RestAssured.given();
      responseObj = (Response) httpRequest.get();
    } catch (Exception var4) {
      var4.printStackTrace();
    }

    return responseObj;
  }






}
