package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@MobileTest")
    public void beforeValidation(){
        System.out.println("Mobile before hook ----------");

    }

    @After("@MobileTest")
    public void AfterValidation(){
        System.out.println("Mobile After hook ------------");
    }

}
