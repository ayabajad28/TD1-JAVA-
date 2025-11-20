class BankAccount {
    private String iban;
    private long balanceInCents;
    
    public BankAccount(String iban, long balanceInCents) {
        if (iban == null || iban.isBlank()) {
            throw new IllegalArgumentException("IBAN cannot be null or empty");
        }
        if (balanceInCents < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.iban = iban;
        this.balanceInCents = balanceInCents;
    }
    
    public void deposit(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balanceInCents += amount;
    }  
    public void withdraw(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balanceInCents) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balanceInCents -= amount;
    }
    public long getBalanceInCents() {
        return balanceInCents;
    }  
    public String getFormattedBalance() {
        long euros = balanceInCents / 100;
        long cents = balanceInCents % 100;
        return String.format("%d.%02d EUR", euros, cents);
    }
}
class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("FR7630001007941234567890185", 50000);
        System.out.println("Solde initial: " + account.getFormattedBalance());   
        account.deposit(2500);
        System.out.println("Après dépôt: " + account.getFormattedBalance()); 
        account.withdraw(1500);
        System.out.println("Après retrait: " + account.getFormattedBalance()); 
        try {
            account.withdraw(100000);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}