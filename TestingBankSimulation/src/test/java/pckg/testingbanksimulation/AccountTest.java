/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckg.testingbanksimulation;

import java.time.LocalDateTime;
import java.util.List;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author reyna
 */
public class AccountTest {
    
    private Bank bank;
    private Customer customer;
    private String custID;
    private Account account;
    private String account1Description;
    
    public AccountTest() {
    }
   
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        bank = new Bank("My Bank");
        custID = bank.addCustomer("Reynaldo", "Marin");
        Customer customer = bank.getCustomer(custID);
        Account savings = customer.addSavingsAccount(0.00, "Test Account");       
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    @DisplayName("Account.deposit Tests")
    public void testDeposit() {
        final double initialBalance = account.getBalance();
        final double amount = 20.00;
        account.deposit(amount);
        final double finalBalance = account.getBalance();
        assertEquals(finalBalance, initialBalance + amount, "Balance should be " +
                (initialBalance + amount) + "but was " + finalBalance);
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    @DisplayName("Account.withdraw Tests")
    public void testWithdraw() {
        final double balance = account.getBalance();
        final double finalBalance;
        final double amount = 20.00;
        final double penalty = 30.00;
        if (balance > amount) {
            account.withdraw(amount);
            finalBalance = account.getBalance(); }
        else{
            account.withdraw(amount); 
            finalBalance = account.getBalance() - penalty; }          
    }

    /**
     * Test of transfer method, of class Account.
     */
    @Test
    @DisplayName("Account.transfer Tests")
    public void testTransfer() {       
        Account fromAccount = customer.addSavingsAccount(100.00, "First account");
        Account toAccount = customer.addSavingsAccount(100.00, "Second account");
        final double amount = 20.00;       
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    /**
     * Test of getAccountDescription method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testGetAccountDescription() {
        System.out.println("getAccountDescription");
        Account instance = null;
        String expResult = "";
        String result = instance.getAccountDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccountDescription method, of class Account.
     */
    @Test
    @DisplayName("Account.setAccountDescription Tests")
    public void testSetAccountDescription() {
         final String accountDescription = "This is everyday checking.";
         final String account1Description;
         this.account1Description = accountDescription;
    }

    /**
     * Test of getBalance method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Account instance = null;
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getTransactions method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testGetTransactions() {
        System.out.println("getTransactions");
        Account instance = null;
        List<Transaction> expResult = null;
        List<Transaction> result = instance.getTransactions();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTransaction method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testGetTransaction() {
        System.out.println("getTransaction");
        int transactionId = 0;
        Account instance = null;
        Transaction expResult = null;
        Transaction result = instance.getTransaction(transactionId);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAccountId method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testGetAccountId() {
        System.out.println("getAccountId");
        Account instance = null;
        String expResult = "";
        String result = instance.getAccountId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomerId method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Account instance = null;
        String expResult = "";
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAccountCreationDate method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testGetAccountCreationDate() {
        System.out.println("getAccountCreationDate");
        Account instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getAccountCreationDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testHashCode() {
        System.out.println("hashCode");
        Account instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Account instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Account.
     */
    @org.junit.jupiter.api.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Account other = null;
        Account instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
    }

    /**
     * Not necessary.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Account instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    public class AccountImpl extends Account {

        public AccountImpl() {
            super(null, 0.0, "");
        }

        public void deposit(double amount) {
        }

        public void withdraw(double amount) {
        }
    }
    
}
