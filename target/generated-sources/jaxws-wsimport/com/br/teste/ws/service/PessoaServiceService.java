
package com.br.teste.ws.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PessoaServiceService", targetNamespace = "http://service.ws.teste.br.com/", wsdlLocation = "http://localhost:8080/coronaws?wsdl")
public class PessoaServiceService
    extends Service
{

    private final static URL PESSOASERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException PESSOASERVICESERVICE_EXCEPTION;
    private final static QName PESSOASERVICESERVICE_QNAME = new QName("http://service.ws.teste.br.com/", "PessoaServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/coronaws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PESSOASERVICESERVICE_WSDL_LOCATION = url;
        PESSOASERVICESERVICE_EXCEPTION = e;
    }

    public PessoaServiceService() {
        super(__getWsdlLocation(), PESSOASERVICESERVICE_QNAME);
    }

    public PessoaServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PESSOASERVICESERVICE_QNAME, features);
    }

    public PessoaServiceService(URL wsdlLocation) {
        super(wsdlLocation, PESSOASERVICESERVICE_QNAME);
    }

    public PessoaServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PESSOASERVICESERVICE_QNAME, features);
    }

    public PessoaServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PessoaServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PessoaService
     */
    @WebEndpoint(name = "PessoaServicePort")
    public PessoaService getPessoaServicePort() {
        return super.getPort(new QName("http://service.ws.teste.br.com/", "PessoaServicePort"), PessoaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PessoaService
     */
    @WebEndpoint(name = "PessoaServicePort")
    public PessoaService getPessoaServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ws.teste.br.com/", "PessoaServicePort"), PessoaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PESSOASERVICESERVICE_EXCEPTION!= null) {
            throw PESSOASERVICESERVICE_EXCEPTION;
        }
        return PESSOASERVICESERVICE_WSDL_LOCATION;
    }

}
