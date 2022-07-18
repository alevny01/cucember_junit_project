package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void setUp(){  // it will run before my feature files
        System.out.println("It is coming from @Before in Hooks");


    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("It is coming from @After in Hooks");

        if (scenario.isFailed()) {


            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());


            Driver.closeDriver();

        }

    }
}

// If I want some scenario/feature to have pre- /post- conditions, I can use certain @TAG, and pass the same @TAG into the annotation in Hooks class.