package io;

/**
 * Created by michaelfestger on 5/24/17.
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        Account myAccount;
        try {
            System.out.println(56 / 60);
            myAccount = new Account(-12);
            myAccount.withdrawel(-100);
            System.out.println(myAccount.getBalance());
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

}

