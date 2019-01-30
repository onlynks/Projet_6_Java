
package com.projet3.library_webapp.library_webapp_model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.projet3.library_webapp.library_webapp_model package. 
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

    private final static QName _GetBookResponse_QNAME = new QName("http://Service.webservice.projet3.com/", "getBookResponse");
    private final static QName _GetBook_QNAME = new QName("http://Service.webservice.projet3.com/", "getBook");
    private final static QName _GetBookListResponse_QNAME = new QName("http://Service.webservice.projet3.com/", "getBookListResponse");
    private final static QName _GetBookList_QNAME = new QName("http://Service.webservice.projet3.com/", "getBookList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.projet3.library_webapp.library_webapp_model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link GetBookListResponse }
     * 
     */
    public GetBookListResponse createGetBookListResponse() {
        return new GetBookListResponse();
    }

    /**
     * Create an instance of {@link GetBookList }
     * 
     */
    public GetBookList createGetBookList() {
        return new GetBookList();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.webservice.projet3.com/", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<GetBookResponse>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.webservice.projet3.com/", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<GetBook>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.webservice.projet3.com/", name = "getBookListResponse")
    public JAXBElement<GetBookListResponse> createGetBookListResponse(GetBookListResponse value) {
        return new JAXBElement<GetBookListResponse>(_GetBookListResponse_QNAME, GetBookListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.webservice.projet3.com/", name = "getBookList")
    public JAXBElement<GetBookList> createGetBookList(GetBookList value) {
        return new JAXBElement<GetBookList>(_GetBookList_QNAME, GetBookList.class, null, value);
    }

}
