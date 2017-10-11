package eu.sig.training.ch04;

public class CheckingAccount {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private Money balance = new Money();
    private int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        // 1. Check withdrawal limit:
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
        if (Accounts.isValid(counterAccount)) {
        	CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        	Transfer result = new Transfer(this, acct, amount);
        	return result;
        } else {
        	throw new BusinessException("Invalid account number!");
        }
    }
}
// end::CheckingAccount[]
