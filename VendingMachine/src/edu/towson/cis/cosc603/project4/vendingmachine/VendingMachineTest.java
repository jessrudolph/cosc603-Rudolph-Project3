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
 */
public class VendingMachineTest {
	
	VendingMachine myVendingMachineForSnacks;
	
	VendingMachineItem doritos, utz, skittles, popcorn;
	
	String[] identifyingCode = {"A", "B", "C", "D"};

	/**
	 * @throws java.lang.Exception
	 */
	@Before
		public void setUp() throws Exception {
		myVendingMachineForSnacks = new VendingMachine();
		doritos = new VendingMachineItem("Doritos", 1.75);
		utz = new VendingMachineItem("Utz", 1.50);
		skittles = new VendingMachineItem("Skittles", 1.85);
		popcorn = new VendingMachineItem("Buttery Popcorn", 2.00);
		}



	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineItem, java.lang.String)}.
	 */
	@Test
	public void testAddItem() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 */
	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
	@Test
	public void testInsertMoney() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 */
	@Test
	public void testMakePurchase() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine#returnChange()}.
	 */
	@Test
	public void testReturnChange() {
		fail("Not yet implemented");
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
