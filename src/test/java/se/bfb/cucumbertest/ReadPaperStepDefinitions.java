package se.bfb.cucumbertest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import se.bfb.cucumbertest.pages.Dn;

import static junit.framework.TestCase.assertTrue;

@ContextConfiguration("classpath:cucumber.xml")
public class ReadPaperStepDefinitions {

    @Autowired
    private Dn dn;

    @Given("^the user is at www.dn.se$")
    public void the_user_is_at_www_dn_se() {
        dn.openFirstPage();
        assertTrue(dn.showsFirstPage());
    }

    @When("^he clicks on sport$")
    public void he_clicks_on_sport() throws Throwable {
        dn.openSportSection();
    }

    @Then("^the sport section should be shown$")
    public void the_sport_section_should_be_shown() throws Throwable {

    }

}
