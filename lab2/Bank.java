package lab2;



/** 
 *   Bank defines for each user the balance at a given time
     in the ledger model of bitcoins
 */

public class Bank extends UserAmount{


    /** 
     *
     *  Task 1: Fill in the method checkUserAmountDeductable()
     *          You need to replace the dummy value true by the correct calculation
     *
     * Check all items in userAmountCheck can be deducted from the current one
     *
     *   userAmountCheck is usually obtained
     *   from a list of inputs of a transaction
     *
     * Checking that a TransactionOutputList  can be deducted will be later done
     *  by first converting that TransactionOutputList into a
     *  TreeMap<String, Integer> and then using this method
     *
     * A naive check would just check whether each entry of a TransactionOutputList can be 
     *   deducted
     *
     * But there could be an output for the same user Alice of say 10 units twice
     *   where there are not enough funds to deduct it twice but enough
     *   funds to deduct it once
     * The naive check would succeed, but after converting the TransactionOutputList
     *  to TreeMap<String, Integer> we have that for Alice 20 units have to be deducted
     *  so the deduction of the bank created fails.
     *
     * One could try for checking that one should actually deduct each entry in squence
     *   but then one has to backtrack again.
     * Converting the TransactionOutputList into a TreeMap<String, Integer> 
     *   is a better approach since the
     *   TransactionOutputList is usually much smaller than the main Bank.
     * 
     *
     */    


    public boolean checkUserAmountDeductable(UserAmount userAmountCheck){
	// you need to replace then next line by the correct statement
	return true;
       };


    /** 
     *
     *  Task 2: Fill in the method checkTxEldeductable 
     *          You need to replace the dummy value true by the correct calculation
     *
     *  It checks that a list of txEntries (which will be inputs of a transactions)
     *     can be deducted from Bank
     *
     *   done by first converting the list of txEntries into an bank
     *     and then checking that the resulting bank can be deducted.
     *   
     */    

      public boolean checkTxEldeductable(EntryList txel){
	// you need to replace then next line by the correct statement
	return true;
      };

    /** 
     *  Task 3: Fill in the methods subtractTxEl and  addTxEl.
     *
     *   Subtract a list of txEntries (txel, usually transaction inputs) from the bank 
     *
     *   requires that the list to be deducted is deductable.
     *   
     */    
    

    public void subtractTxEl(EntryList txel){
	//  fill in Body
    }



    /** 
     * Add a list of txEntries (txel, usually transaction outputs) to the current bank
     *
     */    

    public void addTxEl(EntryList txel){
	for (Entry entry : txel.toList()){
	    addBalance(entry.getUser(),entry.getAmount());
	}

    }


    /** 
     *
     *  Task 4: Fill in the method checkTransactionValid
     *          You need to replace the dummy value true by the correct calculation
     *
     * Check a transaction is valid:
     *    the sum of outputs is less than or equal the sum of inputs
     *    and the inputs can be deducted from the bank.
     *
     */    

    public boolean checkTransactionValid(Transaction tx){
	// you need to replace then next line by the correct statement
	return true;
    };

    /** 
     *
     *  Task 5: Fill in the method processTransaction
     *
     * Process a transaction
     *    by first deducting all the inputs
     *    and then adding all the outputs.
     *
     */    
    

    public void processTransaction(Transaction tx){
	// fill in Body

    };



    /** 
     *  Task 6: Fill in the testcases as described in the labsheet
     *    
     * Testcase
     */
    
    public static void test() {
	// fill in Body
    }
    
    /** 
     * main function running test cases
     */            

    public static void main(String[] args) {
	Bank.test();	
    }
}
