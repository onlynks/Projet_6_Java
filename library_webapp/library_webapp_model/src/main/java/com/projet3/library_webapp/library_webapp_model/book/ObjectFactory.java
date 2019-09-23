
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

    private final static QName _GetNextBookReturn_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getNextBookReturn");
    private final static QName _GetAllBooking_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getAllBooking");
    private final static QName _GetUserBorrowing_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getUserBorrowing");
    private final static QName _BookResearch_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "bookResearch");
    private final static QName _GetBook_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBook");
    private final static QName _GetBookListResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookListResponse");
    private final static QName _CreateBookingResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "createBookingResponse");
    private final static QName _DeleteBorrowingResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "deleteBorrowingResponse");
    private final static QName _GetBookResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookResponse");
    private final static QName _GetUserBorrowingResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getUserBorrowingResponse");
    private final static QName _CreateBooking_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "createBooking");
    private final static QName _GetNextBookReturnResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getNextBookReturnResponse");
    private final static QName _DeleteBorrowing_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "deleteBorrowing");
    private final static QName _GetBookingQuantityResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookingQuantityResponse");
    private final static QName _GetBookList_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookList");
    private final static QName _CreateBookResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "createBookResponse");
    private final static QName _GetBookingQuantity_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookingQuantity");
    private final static QName _ExtendBorrowingResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "extendBorrowingResponse");
    private final static QName _DeleteBooking_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "deleteBooking");
    private final static QName _ExtendBorrowing_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "extendBorrowing");
    private final static QName _GetBookingForUser_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookingForUser");
    private final static QName _GetBookingForUserResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getBookingForUserResponse");
    private final static QName _DeleteBookingResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "deleteBookingResponse");
    private final static QName _AddAlertDateResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "addAlertDateResponse");
    private final static QName _AddAlertDate_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "addAlertDate");
    private final static QName _BookResearchResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "bookResearchResponse");
    private final static QName _GetAllBookingResponse_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "getAllBookingResponse");
    private final static QName _CreateBook_QNAME = new QName("http://library_webservice_service.library_webservice.projet3.com/", "createBook");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.projet3.library_webapp.library_webapp_model.book
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteBookingResponse }
     * 
     */
    public DeleteBookingResponse createDeleteBookingResponse() {
        return new DeleteBookingResponse();
    }

    /**
     * Create an instance of {@link AddAlertDateResponse }
     * 
     */
    public AddAlertDateResponse createAddAlertDateResponse() {
        return new AddAlertDateResponse();
    }

    /**
     * Create an instance of {@link GetBookingForUserResponse }
     * 
     */
    public GetBookingForUserResponse createGetBookingForUserResponse() {
        return new GetBookingForUserResponse();
    }

    /**
     * Create an instance of {@link DeleteBooking }
     * 
     */
    public DeleteBooking createDeleteBooking() {
        return new DeleteBooking();
    }

    /**
     * Create an instance of {@link ExtendBorrowing }
     * 
     */
    public ExtendBorrowing createExtendBorrowing() {
        return new ExtendBorrowing();
    }

    /**
     * Create an instance of {@link GetBookingForUser }
     * 
     */
    public GetBookingForUser createGetBookingForUser() {
        return new GetBookingForUser();
    }

    /**
     * Create an instance of {@link CreateBookResponse }
     * 
     */
    public CreateBookResponse createCreateBookResponse() {
        return new CreateBookResponse();
    }

    /**
     * Create an instance of {@link GetBookingQuantity }
     * 
     */
    public GetBookingQuantity createGetBookingQuantity() {
        return new GetBookingQuantity();
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
     * Create an instance of {@link GetAllBookingResponse }
     * 
     */
    public GetAllBookingResponse createGetAllBookingResponse() {
        return new GetAllBookingResponse();
    }

    /**
     * Create an instance of {@link BookResearchResponse }
     * 
     */
    public BookResearchResponse createBookResearchResponse() {
        return new BookResearchResponse();
    }

    /**
     * Create an instance of {@link AddAlertDate }
     * 
     */
    public AddAlertDate createAddAlertDate() {
        return new AddAlertDate();
    }

    /**
     * Create an instance of {@link CreateBookingResponse }
     * 
     */
    public CreateBookingResponse createCreateBookingResponse() {
        return new CreateBookingResponse();
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
     * Create an instance of {@link BookResearch }
     * 
     */
    public BookResearch createBookResearch() {
        return new BookResearch();
    }

    /**
     * Create an instance of {@link GetNextBookReturn }
     * 
     */
    public GetNextBookReturn createGetNextBookReturn() {
        return new GetNextBookReturn();
    }

    /**
     * Create an instance of {@link GetAllBooking }
     * 
     */
    public GetAllBooking createGetAllBooking() {
        return new GetAllBooking();
    }

    /**
     * Create an instance of {@link GetUserBorrowing }
     * 
     */
    public GetUserBorrowing createGetUserBorrowing() {
        return new GetUserBorrowing();
    }

    /**
     * Create an instance of {@link GetBookingQuantityResponse }
     * 
     */
    public GetBookingQuantityResponse createGetBookingQuantityResponse() {
        return new GetBookingQuantityResponse();
    }

    /**
     * Create an instance of {@link DeleteBorrowing }
     * 
     */
    public DeleteBorrowing createDeleteBorrowing() {
        return new DeleteBorrowing();
    }

    /**
     * Create an instance of {@link GetNextBookReturnResponse }
     * 
     */
    public GetNextBookReturnResponse createGetNextBookReturnResponse() {
        return new GetNextBookReturnResponse();
    }

    /**
     * Create an instance of {@link GetUserBorrowingResponse }
     * 
     */
    public GetUserBorrowingResponse createGetUserBorrowingResponse() {
        return new GetUserBorrowingResponse();
    }

    /**
     * Create an instance of {@link CreateBooking }
     * 
     */
    public CreateBooking createCreateBooking() {
        return new CreateBooking();
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextBookReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getNextBookReturn")
    public JAXBElement<GetNextBookReturn> createGetNextBookReturn(GetNextBookReturn value) {
        return new JAXBElement<GetNextBookReturn>(_GetNextBookReturn_QNAME, GetNextBookReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getAllBooking")
    public JAXBElement<GetAllBooking> createGetAllBooking(GetAllBooking value) {
        return new JAXBElement<GetAllBooking>(_GetAllBooking_QNAME, GetAllBooking.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "createBookingResponse")
    public JAXBElement<CreateBookingResponse> createCreateBookingResponse(CreateBookingResponse value) {
        return new JAXBElement<CreateBookingResponse>(_CreateBookingResponse_QNAME, CreateBookingResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "createBooking")
    public JAXBElement<CreateBooking> createCreateBooking(CreateBooking value) {
        return new JAXBElement<CreateBooking>(_CreateBooking_QNAME, CreateBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextBookReturnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getNextBookReturnResponse")
    public JAXBElement<GetNextBookReturnResponse> createGetNextBookReturnResponse(GetNextBookReturnResponse value) {
        return new JAXBElement<GetNextBookReturnResponse>(_GetNextBookReturnResponse_QNAME, GetNextBookReturnResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingQuantityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getBookingQuantityResponse")
    public JAXBElement<GetBookingQuantityResponse> createGetBookingQuantityResponse(GetBookingQuantityResponse value) {
        return new JAXBElement<GetBookingQuantityResponse>(_GetBookingQuantityResponse_QNAME, GetBookingQuantityResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getBookingQuantity")
    public JAXBElement<GetBookingQuantity> createGetBookingQuantity(GetBookingQuantity value) {
        return new JAXBElement<GetBookingQuantity>(_GetBookingQuantity_QNAME, GetBookingQuantity.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "deleteBooking")
    public JAXBElement<DeleteBooking> createDeleteBooking(DeleteBooking value) {
        return new JAXBElement<DeleteBooking>(_DeleteBooking_QNAME, DeleteBooking.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getBookingForUser")
    public JAXBElement<GetBookingForUser> createGetBookingForUser(GetBookingForUser value) {
        return new JAXBElement<GetBookingForUser>(_GetBookingForUser_QNAME, GetBookingForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingForUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getBookingForUserResponse")
    public JAXBElement<GetBookingForUserResponse> createGetBookingForUserResponse(GetBookingForUserResponse value) {
        return new JAXBElement<GetBookingForUserResponse>(_GetBookingForUserResponse_QNAME, GetBookingForUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "deleteBookingResponse")
    public JAXBElement<DeleteBookingResponse> createDeleteBookingResponse(DeleteBookingResponse value) {
        return new JAXBElement<DeleteBookingResponse>(_DeleteBookingResponse_QNAME, DeleteBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAlertDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "addAlertDateResponse")
    public JAXBElement<AddAlertDateResponse> createAddAlertDateResponse(AddAlertDateResponse value) {
        return new JAXBElement<AddAlertDateResponse>(_AddAlertDateResponse_QNAME, AddAlertDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAlertDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "addAlertDate")
    public JAXBElement<AddAlertDate> createAddAlertDate(AddAlertDate value) {
        return new JAXBElement<AddAlertDate>(_AddAlertDate_QNAME, AddAlertDate.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library_webservice_service.library_webservice.projet3.com/", name = "getAllBookingResponse")
    public JAXBElement<GetAllBookingResponse> createGetAllBookingResponse(GetAllBookingResponse value) {
        return new JAXBElement<GetAllBookingResponse>(_GetAllBookingResponse_QNAME, GetAllBookingResponse.class, null, value);
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
