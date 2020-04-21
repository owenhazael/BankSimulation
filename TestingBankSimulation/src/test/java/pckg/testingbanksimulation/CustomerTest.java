/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckg.testingbanksimulation;

import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Owen Bueso
 */
public class CustomerTest {
    
    private Bank bank;
    private String customerId;
    private String lastName;
    private String firstName;
    private SortedSet<Account> customerAccounts = new TreeSet<>();
    
   
    
    public CustomerTest() {
    }
 
   //@BeforeAll
    //public static void setUpClass() {
    //}
    
    //@AfterAll
    //public static void tearDownClass() {
    //}
    
    @BeforeEach
    public void setUp() {
        bank = new Bank ("My Bank");
        customerId=bank.addCustomer("Owen","Bueso");
        Customer customer = bank.getCustomer(customerId);
        lastName = ("Bueso");
        firstName= ("Owen");

    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Not necessary to test since its only return the Bank value.
     */
    
    public void testGetBank() {
        System.out.println("getBank");
        Customer instance = null;
        Bank expResult = bank;
        Bank result = instance.getBank();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    @DisplayName("Bank.GetCustomerId Tests")
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Customer instance = null;
        String expResult = customerId;
        String result = instance.getCustomerId();
        assertEquals(expResult, result);
        
    }

    /**
     * Not necessary to test this Get Method since its only return Last Name of Customer
     */

    public void testGetLastName() {
        System.out.println("getLastName");
        Customer instance = null;
        String expResult = "Bueso";
        String result = instance.getLastName();
        assertEquals(expResult, result);
      
    }

    /**
     * Not necessary to test this Get Method since its only return First name of Customer
     */
 
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Customer instance = null;
        String expResult = "Owen";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCustomerAccounts method, of class Customer.
     */
    @Test
    @DisplayName("Bank.GetCustomerAccounts Tests")
    public void testGetCustomerAccounts() {
        System.out.println("getCustomerAccounts");
        Customer instance = null;
        SortedSet<Account> expResult = customerAccounts;
        SortedSet<Account> result = instance.getCustomerAccounts();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ytdFees method, of class Customer.
     */
    @Test
    @DisplayName("Bank.YtdFees Tests")
    public void testYtdFees() {
        System.out.println("ytdFees");
        Customer instance = null;
        double F = 25;
        double time= 3;
        double fee= F*time;
        String expResult = ("75.00");
        double result = instance.ytdFees();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ytdInterest method, of class Customer.
     */
    @Test
    @DisplayName("Bank.YtdInterest Tests")
    public void testYtdInterest() {
        System.out.println("ytdInterest");
        Customer instance = null;
        double P = 23312;
        double R = 8;
        double T = 3;
        double I= (P*R*T)/100;
        String expResult = ("5,594.88");
        double result = instance.ytdInterest();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of addSavingsAccount method, of class Customer.
     */
    @Test
    @DisplayName("Bank.AddSavingsAccount Tests")
    public void testAddSavingsAccount() {
        System.out.println("addSavingsAccount");
        double initBal = 0.0;
        String desc = "";
        Customer instance = null;
        SavingsAccount expResult = null;
        SavingsAccount result = instance.addSavingsAccount(initBal, desc);
        assertEquals(expResult, result);

    }

    /**
     * Test of removeAccount method, of class Customer.
     */
    @Test
    @DisplayName("Bank.RemoveAccount Tests")
    public void testRemoveAccount() {
        System.out.println("removeAccount");
        String accountId = "001234";
        Customer instance = null;
        instance.removeAccount(accountId);
      
    }

    /**
     * Test of getAccount method, of class Customer.
     */
    @Test
    @DisplayName("Bank.GetAccount Tests")
    public void testGetAccount() {
        System.out.println("getAccount");
        String accountId = "001233";
        Customer instance = null;
        Account expResult = null;
        Account result = instance.getAccount(accountId);
        assertEquals(expResult, result);
      
    }

    /**
     *Not necessary to test since its only a toString method.
     */
    
    public void testToString() {
        System.out.println("toString");
        Customer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of hashCode method, of class Customer.
     */
    @Test
    @DisplayName("Bank.HashCode Tests")
    public void testHashCode() {
        System.out.println("hashCode");
        Customer instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Customer.
     */
    @Test
    @DisplayName("Bank.Equals Tests")
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Customer instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of compareTo method, of class Customer.
     */
    @Test
    @DisplayName("Bank.CompareTo Tests")
    public void testCompareTo() {
        System.out.println("compareTo");
        Customer other = null;
        Customer instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
      
    }
    
}
