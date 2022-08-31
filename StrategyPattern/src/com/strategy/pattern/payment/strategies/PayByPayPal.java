package com.strategy.pattern.payment.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Concrete strategy. Implements PayPal payment method.
 */
public class PayByPayPal implements PayStrategy {
    private static final Logger LOGGER = Logger.getLogger(PayByPayPal.class.getName());

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("xyz@gmail.com", "strategy");
        DATA_BASE.put("abc@gmail.com", "qwerty");
    }

    /**
     * Collect customer's data.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                LOGGER.info("Enter the user's email: ");
                email = READER.readLine();
                LOGGER.info("Enter the password: ");
                password = READER.readLine();
                if (verify()) {
                    LOGGER.info("Data verification has been successful.");
                } else {
                    LOGGER.info("Wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(password.equals(DATA_BASE.get(email)));
        return signedIn;
    }

    /**
     * Save customer data for future shopping attempts.
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            String msg = "Paying " + paymentAmount + " using PayPal.";
            LOGGER.info(msg);
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}