public class BankMain {
    public static void main(String[] args) {
        // Создаём банковские счета
        SavingsAccount savings = new SavingsAccount("SA123", 5000);
        CreditAccount credit = new CreditAccount("CA456", 1000, 2000); // лимит кредита 2000

        // Работа со счетами
        savings.deposit(2000);     // пополнение
        savings.withdraw(1000);    // снятие

        credit.deposit(500);       // пополнение
        credit.withdraw(2500);     // снятие в пределах кредита
        credit.withdraw(2000);     // превышение лимита кредита
    }
}

// Базовый класс BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("На счет " + accountNumber + " зачислено: " + amount + ". Текущий баланс: " + balance);
        } else {
            System.out.println("Сумма пополнения должна быть положительной!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Со счета " + accountNumber + " снято: " + amount + ". Текущий баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств на счете " + accountNumber + " или неверная сумма!");
        }
    }
}

// Класс-наследник SavingsAccount (сберегательный счет)
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    // Для сберегательного счета можно использовать методы базового класса
}

// Класс-наследник CreditAccount (кредитный счет)
class CreditAccount extends BankAccount {
    private double creditLimit;

    public CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + creditLimit)) {
            balance -= amount;
            System.out.println("Со счета " + accountNumber + " снято: " + amount + ". Текущий баланс: " + balance);
        } else {
            System.out.println("Превышен лимит кредита для счета " + accountNumber + "!");
        }
    }
}