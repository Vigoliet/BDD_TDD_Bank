package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.bank.Account;

import static org.junit.jupiter.api.Assertions.*;

public class AccountStepDefinitions {

    private int balance;

    Account account;
    @Given("the user balance is {int} dollars")
    public int the_user_balance_is_dollars(int initialBalance) {
        account = new Account(initialBalance);
        return account.getBalance();

    }

    @When("the user desposits {int} dollars")
    public void the_user_desposits_dollars(Integer amount) {
        account.deposit(amount);
    }
    @Then("balance should be {int} dollars")
    public void balance_should_be_dollars(Integer expectedAnswer) {
        balance = account.getBalance(); // actual

        assertEquals(expectedAnswer, balance);
    }
}
