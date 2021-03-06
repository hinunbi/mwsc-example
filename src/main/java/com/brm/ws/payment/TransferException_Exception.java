
package com.brm.ws.payment;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-11-05T13:13:55.227+09:00
 * Generated source version: 2.7.11
 */

@WebFault(name = "TransferException", targetNamespace = "http://payment.ws.brm.com/")
public class TransferException_Exception extends Exception {
    
    private com.brm.ws.payment.TransferException transferException;

    public TransferException_Exception() {
        super();
    }
    
    public TransferException_Exception(String message) {
        super(message);
    }
    
    public TransferException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public TransferException_Exception(String message, com.brm.ws.payment.TransferException transferException) {
        super(message);
        this.transferException = transferException;
    }

    public TransferException_Exception(String message, com.brm.ws.payment.TransferException transferException, Throwable cause) {
        super(message, cause);
        this.transferException = transferException;
    }

    public com.brm.ws.payment.TransferException getFaultInfo() {
        return this.transferException;
    }
}
