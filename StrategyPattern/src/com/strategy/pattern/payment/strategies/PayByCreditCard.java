package com.strategy.pattern.payment.strategies;

import com.strategy.pattern.payment.dataobject.CreditCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

/**
 * Concrete strategy. Implements credit card payment method.
 */
public class PayByCreditCard implements PayStrategy {
    private static final Logger LOGGER = Logger.getLogger(PayByCreditCard.class.getName());
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    /**
     * Collect credit card data.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            LOGGER.info("Enter the card number: ");
            String number = READER.readLine();
            LOGGER.info("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            LOGGER.info("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // Validate credit card number...

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * After card validation we can charge customer's credit card.
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            String msg = "Paying " + paymentAmount + " using Credit Card.";
            LOGGER.info(msg);

            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}