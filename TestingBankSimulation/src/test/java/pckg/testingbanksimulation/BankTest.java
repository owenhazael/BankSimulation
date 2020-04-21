/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckg.testingbanksimulation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
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
public class BankTest {
    private String NAME;
    private final Map<String, Customer> customers = new HashMap<>();
    private double insufficientFundsPenalty = 10.00;  // Default, in dollars
    public BankTest() {
    }
    
    //@BeforeAll
    //public static void setUpClass() {
    //}
    
    //@AfterAll
    //public static void tearDownClass() {
    //}
    
    @BeforeEach
    public void setUp() {
        NAME = ("My Bank");
   
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Not necessary to test the main method;
     */
    public void testMain() {
        System.out.println("Hello from My Bank");
        String[] args = null;
        Bank.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Not necessary to test this Get Method since its only return the Constant InsufficientFundPenalty
     */
    
    public void testGetInsufficientFundsPenalty() {
        System.out.println("getInsufficientFundsPenalty");
        Bank instance = null;
        double expResult = 10.0;
        double result = instance.getInsufficientFundsPenalty();
        assertEquals(expResult, result, 10.0);
    }

    /**
     * Test of setInsufficientFundsPenalty method, of class Bank.
     */
    @Test
   @DisplayName("Bank.SetInsufficientFundPenalty Tests")
    public void testSetInsufficientFundsPenalty() {
        System.out.println("setInsufficientFundsPenalty");
        double insufficientFundsPenalty = 10.0;
        Bank instance = null;
        instance.setInsufficientFundsPenalty(insufficientFundsPenalty);
    }

    /**
     * Not necessary to test this Get Method since its only return the string Name
     */
    public void testGetNAME() {
        System.out.println("getNAME");
        Bank instance = null;
        String expResult = "";
        String result = instance.getNAME();
        assertEquals(expResult, result);
    }

    /**
     * Not necessary to test since its a GUI function.
     */
   
    public void testAddAccountWizard() {
        System.out.println("addAccountWizard");
        Bank instance = null;
        instance.addAccountWizard();
    }

   
    /**
     * Test of GetAllAccounts, of class Bank.
     */
    @Test
    @DisplayName("Bank.GetAllAccounts Tests")
    public void testGetAllAccounts() {
        System.out.println("getAllAccounts");
        Bank instance = null;
        SortedSet<Account> expResult = null;
        SortedSet<Account> result = instance.getAllAccounts();
        assertEquals(expResult, result);
    }

    /**
     * Not necessary to test since its a GUI function.
     */

    public void testAddCustomerWizard() {
        System.out.println("addCustomerWizard");
        Bank instance = null;
        instance.addCustomerWizard();
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Test
    @DisplayName("Bank.AddCustomer Tests")
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String lastName = "Bueso";
        String firstName = "Owen";
        Bank instance = null;
        String expResult = "Owen Bueso";
        String result = instance.addCustomer(lastName, firstName);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCustomer method, of class Bank.
     */
    @Test
    @DisplayName("Bank.RemoveCustomer Tests")
    public void testRemoveCustomer() {
        System.out.println("removeCustomer");
        String customerId = "";
        Bank instance = null;
        instance.removeCustomer(customerId);
    }

    /**
     * Test of getAllCustomers method, of class Bank.
     */
    @Test
     @DisplayName("Bank.GetAllCustomers Tests")
    public void testGetAllCustomers() {
        System.out.println("getAllCustomers");
        Bank instance = null;
        SortedSet<Customer> expResult = null;
        SortedSet<Customer> result = instance.getAllCustomers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    @DisplayName("Bank.GetCustomer_String Tests")
    public void testGetCustomer_String() {
        System.out.println("getCustomer");
        String customerId = "001";
        Bank instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer(customerId);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
     @DisplayName("Bank.GetCustomer_String_String Tests")
    public void testGetCustomer_String_String() {
        System.out.println("getCustomer");
        String lastName = "Bueso";
        String firstName = "Owen";
        Bank instance = null;
        List<Customer> expResult = null;
        List<Customer> result = instance.getCustomer(lastName, firstName);
        assertEquals(expResult, result);
    }

     /**
     * Test of getCustomer method, of class Bank.
     */
     @Test
     @DisplayName("Bank.GetCustomerAccounts Tests")
    public void testGetCustomersAccounts() {
        System.out.println("getCustomersAccounts");
        String customerId = "001";
        Bank instance = null;
        List<Account> expResult = null;
        List<Account> result = instance.getCustomersAccounts(customerId);
        assertEquals(expResult, result);
    }
    
}
