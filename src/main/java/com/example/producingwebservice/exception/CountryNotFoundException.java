package com.example.producingwebservice.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM,
        customFaultCode = "NOT_FOUND",
        faultStringOrReason = "Country not found...")
public class CountryNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;
    public static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    public CountryNotFoundException(String message) {
        super(message);
    }
}

