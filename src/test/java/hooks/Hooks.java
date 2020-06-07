package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinitions.Base;

public class Hooks extends Base {

    @Before("@MobileTest")
    public void beforeValidation(){
        System.out.println("Mobile before hook ----------");

    }

    @After("@MobileTest")
    public void AfterValidation(){
        System.out.println("Mobile After hook ------------");
    }

    @After
    public void AfterTest() {
       driver.quit();
    }

}
