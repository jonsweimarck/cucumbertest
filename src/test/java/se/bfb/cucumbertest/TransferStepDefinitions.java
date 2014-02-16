package se.bfb.cucumbertest;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@ContextConfiguration("classpath:cucumber.xml")
public class TransferStepDefinitions {


    @Autowired
    private TransferService transferService;
    private Account source;
    private Account target;
    private Receipt receipt;

    @Before(value="@UserAccounts")
    public void initialize() {

        if (source == null) {
            source = new Account(111111);
        }
        if (target == null) {
            target = new Account(222222);
        }
    }

    @Given("^a source account with balance £(\\d+)$")
    public void a_source_account_with_balance_£(int sourceBalance) {
        source.balance = sourceBalance;
    }

    @Given("^a target account with balance £(\\d+)$")
    public void a_target_account_with_balance_£(int targetBalance) {
        target.balance = targetBalance;
    }

    @When("^£(\\d+) is transfered from source to target$")
    public void £_is_transfered_from_source_to_target(int transferAmount) {
        receipt = transferService.transfer(source, target, transferAmount);
    }

    @Then("^the source balance should be £(\\d+)$")
    public void the_source_balance_should_be_£(int sourceBalance) {
        assertThat(receipt.sourceBalance, is(sourceBalance));
    }

    @Then("^the target balance should be £(\\d+)$")
    public void the_target_balance_should_be_£(int targetBalance)  {
        assertThat(receipt.targetBalance, is(targetBalance));
    }
}
