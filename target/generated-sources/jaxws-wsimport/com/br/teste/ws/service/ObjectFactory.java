
package com.br.teste.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.br.teste.ws.service package. 
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

    private final static QName _ReturnOnePersonResponse_QNAME = new QName("http://service.ws.teste.br.com/", "ReturnOnePersonResponse");
    private final static QName _ReturnOnePerson_QNAME = new QName("http://service.ws.teste.br.com/", "ReturnOnePerson");
    private final static QName _ListResponse_QNAME = new QName("http://service.ws.teste.br.com/", "listResponse");
    private final static QName _Remove_QNAME = new QName("http://service.ws.teste.br.com/", "remove");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.ws.teste.br.com/", "updateResponse");
    private final static QName _List_QNAME = new QName("http://service.ws.teste.br.com/", "list");
    private final static QName _Create_QNAME = new QName("http://service.ws.teste.br.com/", "create");
    private final static QName _CreateResponse_QNAME = new QName("http://service.ws.teste.br.com/", "createResponse");
    private final static QName _Update_QNAME = new QName("http://service.ws.teste.br.com/", "update");
    private final static QName _RemoveResponse_QNAME = new QName("http://service.ws.teste.br.com/", "removeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.br.teste.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnOnePerson }
     * 
     */
    public ReturnOnePerson createReturnOnePerson() {
        return new ReturnOnePerson();
    }

    /**
     * Create an instance of {@link ReturnOnePersonResponse }
     * 
     */
    public ReturnOnePersonResponse createReturnOnePersonResponse() {
        return new ReturnOnePersonResponse();
    }

    /**
     * Create an instance of {@link RemoveResponse }
     * 
     */
    public RemoveResponse createRemoveResponse() {
        return new RemoveResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link ListResponse }
     * 
     */
    public ListResponse createListResponse() {
        return new ListResponse();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnOnePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "ReturnOnePersonResponse")
    public JAXBElement<ReturnOnePersonResponse> createReturnOnePersonResponse(ReturnOnePersonResponse value) {
        return new JAXBElement<ReturnOnePersonResponse>(_ReturnOnePersonResponse_QNAME, ReturnOnePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnOnePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "ReturnOnePerson")
    public JAXBElement<ReturnOnePerson> createReturnOnePerson(ReturnOnePerson value) {
        return new JAXBElement<ReturnOnePerson>(_ReturnOnePerson_QNAME, ReturnOnePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "listResponse")
    public JAXBElement<ListResponse> createListResponse(ListResponse value) {
        return new JAXBElement<ListResponse>(_ListResponse_QNAME, ListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "list")
    public JAXBElement<List> createList(List value) {
        return new JAXBElement<List>(_List_QNAME, List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<Create>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.teste.br.com/", name = "removeResponse")
    public JAXBElement<RemoveResponse> createRemoveResponse(RemoveResponse value) {
        return new JAXBElement<RemoveResponse>(_RemoveResponse_QNAME, RemoveResponse.class, null, value);
    }

}
