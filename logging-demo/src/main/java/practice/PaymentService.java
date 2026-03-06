package practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentService  {

    private static final Logger log =
            LoggerFactory.getLogger(PaymentService.class);

    public void processPayment() {
        log.info("Payment started");
        log.warn("Payment processing delay");
        log.info("Payment successful");
    }
}