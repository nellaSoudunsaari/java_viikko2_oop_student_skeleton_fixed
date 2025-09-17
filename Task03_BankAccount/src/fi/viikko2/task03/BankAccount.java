/**
 * Tehtävä 3 – BankAccount (kapselointi, konstruktorit, toString, equals)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: accountNumber (String), balance (double).
 *  2. Konstruktori: jos initialBalance < 0 -> nollaa.
 *  3. `deposit(amount)` ja `withdraw(amount)` säännöillä.
 *  4. `toString()` ja `equals(Object)` (tilinumero).
 *
 * VINKIT:
 *  - equals: pelkkä tilinumero riittää; vältä double-vertailua.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task03;

public class BankAccount {
   public String accountNumber;
   public double balance;

   public BankAccount(String accountNumber, double balance){
    if(balance < 0){
        balance = 0;
    }
    this.accountNumber = accountNumber;
    this.balance = balance;
   }

   public double deposit(int amount){
    if(amount <= 0){
        return balance;
    } else {
        balance = amount + balance;
        return balance;
    }
   }

   public double withdraw(int amount){
    if(amount <= 0 || amount > balance){
        return balance;
    } else {
        balance = balance - amount;
        return balance;
    }
   }

   public double getBalance(){
    return balance;
   }


    @Override
    public String toString(){
        return accountNumber;
    }

    @Override
    public boolean equals(Object o){
        if(o == accountNumber){
            return true;
        } else {
            return false;
        }
    }
}