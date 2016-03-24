/**
 * 
 */
package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jess Rudolph
 * 
 * The unit test Class for VendingMachine.
 *
 */

public class VendingMachineTest {
	
	/**
	 * Declares necessary test objects for VendingMachine.
	 */
	VendingMachine snacksVendingMachine;
	
	VendingMachineItem doritos, utz, skittles, popcorn;
	
	/**
	 * Initializes the test objects for the test cases.
	 * 
	 * Fills the vending machine such that slots with code A, B, & C are occupied.
	 * 
	 * @throws Exception the exception
	 */
	@Before
		public void setUp() throws Exception {
				
		doritos = new VendingMachineItem("Doritos", 1.75);
		utz = new VendingMachineItem("Utz", 1.50);
		skittles = new VendingMachineItem("Skittles", 1.85);
		popcorn = new VendingMachineItem("Buttery Popcorn", 2.00);
		
		snacksVendingMachine = new VendingMachine();
		
		snacksVendingMachine.addItem(doritos, "A");
		snacksVendingMachine.addItem(utz, "B");
		snacksVendingMachine.addItem(skittles, "C");
		}
	
	
	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineItem, java.lang.String)}.
	 * 
	 * Adds item to slot with code labeled "D", since that is the last empty slot to be filled.
	 */
	@Test
	public void testAddItem() {
		snacksVendingMachine.addItem(popcorn, "D");
		assertSame(popcorn, snacksVendingMachine.getItem("D"));
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 * 
	 */
	@Test
	public void testRemoveItem() {
		assertSame(utz, snacksVendingMachine.removeItem("B"));
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
	@Test
	public void testInsertMoney() {
		snacksVendingMachine.insertMoney(1.85);
		assertEquals(1.85, snacksVendingMachine.balance, 0.00);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		snacksVendingMachine.getBalance();
		assertTrue(snacksVendingMachine.getBalance() >= 0);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 */
	@Test
	public void testMakePurchase() {
		snacksVendingMachine.makePurchase("C");
		snacksVendingMachine.getItem("C");
		assertNotNull(snacksVendingMachine.getItem("C"));
		assertSame(skittles, snacksVendingMachine.getItem("C"));
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#returnChange()}.
	 */
	@Test
	public void testReturnChange() {
		assertEquals(0.00, snacksVendingMachine.getBalance(), 0.00);
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		snacksVendingMachine = null;
		doritos = null; 
		utz = null;
		skittles = null;
		popcorn = null;
	}

}
