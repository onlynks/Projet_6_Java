
package com.projet3.library_webapp.library_webapp_model.book;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.projet3.library_webapp.library_webapp_model.book package. 
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

    private final static QName _GetBookList_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookList");
    private final static QName _CreateBookResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "createBookResponse");
    private final static QName _ExtendBorrowingResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "extendBorrowingResponse");
    private final static QName _GetUserBorrowing_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getUserBorrowing");
    private final static QName _ExtendBorrowing_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "extendBorrowing");
    private final static QName _BookResearch_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "bookResearch");
    private final static QName _GetBook_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBook");
    private final static QName _GetBookListResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookListResponse");
    private final static QName _DeleteBorrowingResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "deleteBorrowingResponse");
    private final static QName _GetBookResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookResponse");
    private final static QName _GetUserBorrowingResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getUserBorrowingResponse");
    private final static QName _BookResearchResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "bookResearchResponse");
    private final static QName _DeleteBorrowing_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "deleteBorrowing");
    private final static QName _CreateBook_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "createBook");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.projet3.library_webapp.library_webapp_model.book
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteBorrowingResponse }
     * 
     */
    public DeleteBorrowingResponse createDeleteBorrowingResponse() {
        return new DeleteBorrowingResponse();
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
     * Create an instance of {@link ExtendBorrowing }
     * 
     */
    public ExtendBorrowing createExtendBorrowing() {
        return new ExtendBorrowing();
    }

    /**
     * Create an instance of {@link BookResearch }
     * 
     */
    public BookResearch createBookResearch() {
        return new BookResearch();
    }

    /**
     * Create an instance of {@link GetUserBorrowing }
     * 
     */
    public GetUserBorrowing createGetUserBorrowing() {
        return new GetUserBorrowing();
    }

    /**
     * Create an instance of {@link CreateBookResponse }
     * 
     */
    public CreateBookResponse createCreateBookResponse() {
        return new CreateBookResponse();
    }

    /**
     * Create an instance of {@link ExtendBorrowingResponse }
     * 
     */
    public ExtendBorrowingResponse createExtendBorrowingResponse() {
        return new ExtendBorrowingResponse();
    }

    /**
     * Create an instance of {@link GetBookList }
     * 
     */
    public GetBookList createGetBookList() {
        return new GetBookList();
    }

    /**
     * Create an instance of {@link CreateBook }
     * 
     */
    public CreateBook createCreateBook() {
        return new CreateBook();
    }

    /**
     * Create an instance of {@link DeleteBorrowing }
     * 
     */
    public DeleteBorrowing createDeleteBorrowing() {
        return new DeleteBorrowing();
    }

    /**
     * Create an instance of {@link BookResearchResponse }
     * 
     */
    public BookResearchResponse createBookResearchResponse() {
        return new BookResearchResponse();
    }

    /**
     * Create an instance of {@link GetUserBorrowingResponse }
     * 
     */
    public GetUserBorrowingResponse createGetUserBorrowingResponse() {
        return new GetUserBorrowingResponse();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link Borrowing }
     * 
     */
    public Borrowing createBorrowing() {
        return new Borrowing();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getBookList")
    public JAXBElement<GetBookList> createGetBookList(GetBookList value) {
        return new JAXBElement<GetBookList>(_GetBookList_QNAME, GetBookList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "createBookResponse")
    public JAXBElement<CreateBookResponse> createCreateBookResponse(CreateBookResponse value) {
        return new JAXBElement<CreateBookResponse>(_CreateBookResponse_QNAME, CreateBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "extendBorrowingResponse")
    public JAXBElement<ExtendBorrowingResponse> createExtendBorrowingResponse(ExtendBorrowingResponse value) {
        return new JAXBElement<ExtendBorrowingResponse>(_ExtendBorrowingResponse_QNAME, ExtendBorrowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getUserBorrowing")
    public JAXBElement<GetUserBorrowing> createGetUserBorrowing(GetUserBorrowing value) {
        return new JAXBElement<GetUserBorrowing>(_GetUserBorrowing_QNAME, GetUserBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "extendBorrowing")
    public JAXBElement<ExtendBorrowing> createExtendBorrowing(ExtendBorrowing value) {
        return new JAXBElement<ExtendBorrowing>(_ExtendBorrowing_QNAME, ExtendBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookResearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "bookResearch")
    public JAXBElement<BookResearch> createBookResearch(BookResearch value) {
        return new JAXBElement<BookResearch>(_BookResearch_QNAME, BookResearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<GetBook>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getBookListResponse")
    public JAXBElement<GetBookListResponse> createGetBookListResponse(GetBookListResponse value) {
        return new JAXBElement<GetBookListResponse>(_GetBookListResponse_QNAME, GetBookListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "deleteBorrowingResponse")
    public JAXBElement<DeleteBorrowingResponse> createDeleteBorrowingResponse(DeleteBorrowingResponse value) {
        return new JAXBElement<DeleteBorrowingResponse>(_DeleteBorrowingResponse_QNAME, DeleteBorrowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<GetBookResponse>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getUserBorrowingResponse")
    public JAXBElement<GetUserBorrowingResponse> createGetUserBorrowingResponse(GetUserBorrowingResponse value) {
        return new JAXBElement<GetUserBorrowingResponse>(_GetUserBorrowingResponse_QNAME, GetUserBorrowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookResearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "bookResearchResponse")
    public JAXBElement<BookResearchResponse> createBookResearchResponse(BookResearchResponse value) {
        return new JAXBElement<BookResearchResponse>(_BookResearchResponse_QNAME, BookResearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "deleteBorrowing")
    public JAXBElement<DeleteBorrowing> createDeleteBorrowing(DeleteBorrowing value) {
        return new JAXBElement<DeleteBorrowing>(_DeleteBorrowing_QNAME, DeleteBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "createBook")
    public JAXBElement<CreateBook> createCreateBook(CreateBook value) {
        return new JAXBElement<CreateBook>(_CreateBook_QNAME, CreateBook.class, null, value);
    }

}
