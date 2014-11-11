
package com.brm.ws.payment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.brm.ws.payment package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TransferFunds_QNAME = new QName("http://payment.ws.brm.com/", "transferFunds");
    private final static QName _TransferException_QNAME = new QName("http://payment.ws.brm.com/", "TransferException");
    private final static QName _TransferFundsResponse_QNAME = new QName("http://payment.ws.brm.com/", "transferFundsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.brm.ws.payment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransferFundsResponse }
     * 
     */
    public TransferFundsResponse createTransferFundsResponse() {
        return new TransferFundsResponse();
    }

    /**
     * Create an instance of {@link TransferException }
     * 
     */
    public TransferException createTransferException() {
        return new TransferException();
    }

    /**
     * Create an instance of {@link TransferFunds }
     * 
     */
    public TransferFunds createTransferFunds() {
        return new TransferFunds();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link TransferRequest }
     * 
     */
    public TransferRequest createTransferRequest() {
        return new TransferRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferFunds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payment.ws.brm.com/", name = "transferFunds")
    public JAXBElement<TransferFunds> createTransferFunds(TransferFunds value) {
        return new JAXBElement<TransferFunds>(_TransferFunds_QNAME, TransferFunds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payment.ws.brm.com/", name = "TransferException")
    public JAXBElement<TransferException> createTransferException(TransferException value) {
        return new JAXBElement<TransferException>(_TransferException_QNAME, TransferException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferFundsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://payment.ws.brm.com/", name = "transferFundsResponse")
    public JAXBElement<TransferFundsResponse> createTransferFundsResponse(TransferFundsResponse value) {
        return new JAXBElement<TransferFundsResponse>(_TransferFundsResponse_QNAME, TransferFundsResponse.class, null, value);
    }

}
