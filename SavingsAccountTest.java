//package
package javaprogram.bankingtestclasses;
//imports
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

/*
 * @author Roland Colon III
 */
public class SavingsAccountTest {
    
    public SavingsAccountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp()
    {
        bank = new Bank("Imperium Bank");
        custID = bank.addCustomer("Roland", "Colon");
        Customer customer = bank.getCustomer(custID);
        SavingsAccount savingsAccount = customer.addSavingsAccount(0.00, "Test Account");
    }

    @AfterEach
    public void tearDown()
    { 
    }
    
    /*
     * Test of deposit method, of class SavingsAccount.
     */
    @Test
    @DisplayName("SavingsAccount.deposit Tests")
    public void testDeposit() {
        final double initialBalance = savingsAccount.getBalance();
        final double amount = 30.00;
        savingsAccount.deposit(amount);
        final double finalBalance = savingsAccount.getBalance();
        assertEquals(finalBalance, initialBalance + amount, "Balance:" + 
        (initialBalance + amount) + "Final Balance:" + finalBalance);
    }

    /*
     * Test of withdraw method, of class SavingsAccount.
     */
    @Test
    @DisplayName("SavingsAccount.withdraw Tests")
    public void testWithdraw() {
        final double balance = savingsAccount.getBalance();
        final double finalBalance;
        final double amount = 30.00;
        final double penalty = 27.00;
        if (balance > amount)
        {
            savingsAccount.withdraw(amount);
            finalBalance = savingsAccount.getBalance();
        }
        else
        {
            savingsAccount.withdraw(amount);
            finalBalance = savingsAccount.getBalance() - penalty;
        }
    }

    /*
     * Test of addInterestTransaction method, of class SavingsAccount.
     */
    @Test
    public void testAddInterestTransaction() {
        System.out.println("addInterestTransaction");
        double rate = 0.3;
        SavingsAccount instance = null;
        instance.addInterestTransaction(rate);
    }

    /*
     * Test of getDefaultInterestRate method, of class SavingsAccount.
     */
    
    @Test
    @DisplayName("SavingsAccount.getDefaultInterestRate")
    public void testGetDefaultInterestRate() {
        System.out.println("getDefaultInterestRate");
        SavingsAccount instance = null;
        double expResult = 0.0;
        double result = SavingsAccount.getDefaultInterestRate();
        assertEquals(expResult, result, 0.0);
    }
    

    /*
     * Test of setDefaultInterestRate method, of class SavingsAccount.
     */
    @Test
    @DisplayName("SavingsAccount.setDefaultInterestRate")
    public void testSetDefaultInterestRate()
    {
        System.out.println("setDefaultInterestRate");
        SavingsAccount instance = null;
        final double expResult = 0.0;
        final double interestRate = 0.5;
        SavingsAccount.setDefaultInterestRate(interestRate);
        assertEquals(expResult, interestRate, 0.0);
    }
    
}
