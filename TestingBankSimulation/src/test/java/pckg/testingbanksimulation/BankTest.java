/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckg.testingbanksimulation;

import java.util.List;
import java.util.SortedSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class BankTest {
    
    public BankTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Bank.
     */
    public void testMain() {
        System.out.println("Hello from Bank");
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
     * Test of addAccountWizard method, of class Bank.
     */
    @Test
    public void testAddAccountWizard() {
        System.out.println("addAccountWizard");
        Bank instance = null;
        instance.addAccountWizard();
    }

    /**
     * Not necessary to test this Get Method since its only return Null value
     */
    
    public void testGetAllAccounts() {
        System.out.println("getAllAccounts");
        Bank instance = null;
        SortedSet<Account> expResult = null;
        SortedSet<Account> result = instance.getAllAccounts();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCustomerWizard method, of class Bank.
     */
    @Test
    public void testAddCustomerWizard() {
        System.out.println("addCustomerWizard");
        Bank instance = null;
        instance.addCustomerWizard();
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String lastName = "";
        String firstName = "";
        Bank instance = null;
        String expResult = "";
        String result = instance.addCustomer(lastName, firstName);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCustomer method, of class Bank.
     */
    @Test
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
    public void testGetCustomer_String() {
        System.out.println("getCustomer");
        String customerId = "";
        Bank instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer(customerId);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer_String_String() {
        System.out.println("getCustomer");
        String lastName = "";
        String firstName = "";
        Bank instance = null;
        List<Customer> expResult = null;
        List<Customer> result = instance.getCustomer(lastName, firstName);
        assertEquals(expResult, result);
    }

    /**
     * Not necessary to test this Get Method since its only return a Null value
     */
    public void testGetCustomersAccounts() {
        System.out.println("getCustomersAccounts");
        String customerId = "";
        Bank instance = null;
        List<Account> expResult = null;
        List<Account> result = instance.getCustomersAccounts(customerId);
        assertEquals(expResult, result);
    }
    
}
