package com.webapplication.springbootecommerce.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.webapplication.springbootecommerce.dto.PaymentInfo;
import com.webapplication.springbootecommerce.dto.Purchase;
import com.webapplication.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
