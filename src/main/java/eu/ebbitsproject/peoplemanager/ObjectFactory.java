
package eu.ebbitsproject.peoplemanager;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.ebbitsproject.peoplemanager package. 
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

    private final static QName _IsPersonAvailableByIdResponse_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "isPersonAvailableByIdResponse");
    private final static QName _GetEventsResponse_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "getEventsResponse");
    private final static QName _UpdateEventResponse_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "updateEventResponse");
    private final static QName _IsPersonAvailableByErpIdResponse_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "isPersonAvailableByErpIdResponse");
    private final static QName _InsertEvent_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "insertEvent");
    private final static QName _GetPersons_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "getPersons");
    private final static QName _GetPersonByErpIdResponse_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "getPersonByErpIdResponse");
    private final static QName _IsPersonAvailableById_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "isPersonAvailableById");
    private final static QName _GetPersonByErpId_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "getPersonByErpId");
    private final static QName _IsPersonAvailableByRfid_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "isPersonAvailableByRfid");
    private final static QName _InsertEventResponse_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "insertEventResponse");
    private final static QName _IsPersonAvailableByRfidResponse_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "isPersonAvailableByRfidResponse");
    private final static QName _IsPersonAvailableByErpId_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "isPersonAvailableByErpId");
    private final static QName _UpdateEvent_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "updateEvent");
    private final static QName _GetPersonById_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "getPersonById");
    private final static QName _GetPersonByIdResponse_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "getPersonByIdResponse");
    private final static QName _GetPersonsResponse_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "getPersonsResponse");
    private final static QName _GetEvents_QNAME = new QName("http://peoplemanager.ebbitsproject.eu/", "getEvents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.ebbitsproject.peoplemanager
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link Event.Props }
     * 
     */
    public Event.Props createEventProps() {
        return new Event.Props();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Person.Props }
     * 
     */
    public Person.Props createPersonProps() {
        return new Person.Props();
    }

    /**
     * Create an instance of {@link GetPersonByErpId }
     * 
     */
    public GetPersonByErpId createGetPersonByErpId() {
        return new GetPersonByErpId();
    }

    /**
     * Create an instance of {@link IsPersonAvailableByRfid }
     * 
     */
    public IsPersonAvailableByRfid createIsPersonAvailableByRfid() {
        return new IsPersonAvailableByRfid();
    }

    /**
     * Create an instance of {@link GetPersons }
     * 
     */
    public GetPersons createGetPersons() {
        return new GetPersons();
    }

    /**
     * Create an instance of {@link GetPersonByErpIdResponse }
     * 
     */
    public GetPersonByErpIdResponse createGetPersonByErpIdResponse() {
        return new GetPersonByErpIdResponse();
    }

    /**
     * Create an instance of {@link IsPersonAvailableById }
     * 
     */
    public IsPersonAvailableById createIsPersonAvailableById() {
        return new IsPersonAvailableById();
    }

    /**
     * Create an instance of {@link InsertEvent }
     * 
     */
    public InsertEvent createInsertEvent() {
        return new InsertEvent();
    }

    /**
     * Create an instance of {@link GetEventsResponse }
     * 
     */
    public GetEventsResponse createGetEventsResponse() {
        return new GetEventsResponse();
    }

    /**
     * Create an instance of {@link UpdateEventResponse }
     * 
     */
    public UpdateEventResponse createUpdateEventResponse() {
        return new UpdateEventResponse();
    }

    /**
     * Create an instance of {@link IsPersonAvailableByErpIdResponse }
     * 
     */
    public IsPersonAvailableByErpIdResponse createIsPersonAvailableByErpIdResponse() {
        return new IsPersonAvailableByErpIdResponse();
    }

    /**
     * Create an instance of {@link IsPersonAvailableByIdResponse }
     * 
     */
    public IsPersonAvailableByIdResponse createIsPersonAvailableByIdResponse() {
        return new IsPersonAvailableByIdResponse();
    }

    /**
     * Create an instance of {@link GetEvents }
     * 
     */
    public GetEvents createGetEvents() {
        return new GetEvents();
    }

    /**
     * Create an instance of {@link GetPersonsResponse }
     * 
     */
    public GetPersonsResponse createGetPersonsResponse() {
        return new GetPersonsResponse();
    }

    /**
     * Create an instance of {@link UpdateEvent }
     * 
     */
    public UpdateEvent createUpdateEvent() {
        return new UpdateEvent();
    }

    /**
     * Create an instance of {@link GetPersonByIdResponse }
     * 
     */
    public GetPersonByIdResponse createGetPersonByIdResponse() {
        return new GetPersonByIdResponse();
    }

    /**
     * Create an instance of {@link GetPersonById }
     * 
     */
    public GetPersonById createGetPersonById() {
        return new GetPersonById();
    }

    /**
     * Create an instance of {@link IsPersonAvailableByErpId }
     * 
     */
    public IsPersonAvailableByErpId createIsPersonAvailableByErpId() {
        return new IsPersonAvailableByErpId();
    }

    /**
     * Create an instance of {@link IsPersonAvailableByRfidResponse }
     * 
     */
    public IsPersonAvailableByRfidResponse createIsPersonAvailableByRfidResponse() {
        return new IsPersonAvailableByRfidResponse();
    }

    /**
     * Create an instance of {@link InsertEventResponse }
     * 
     */
    public InsertEventResponse createInsertEventResponse() {
        return new InsertEventResponse();
    }

    /**
     * Create an instance of {@link Event.Props.Entry }
     * 
     */
    public Event.Props.Entry createEventPropsEntry() {
        return new Event.Props.Entry();
    }

    /**
     * Create an instance of {@link Person.Props.Entry }
     * 
     */
    public Person.Props.Entry createPersonPropsEntry() {
        return new Person.Props.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPersonAvailableByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "isPersonAvailableByIdResponse")
    public JAXBElement<IsPersonAvailableByIdResponse> createIsPersonAvailableByIdResponse(IsPersonAvailableByIdResponse value) {
        return new JAXBElement<IsPersonAvailableByIdResponse>(_IsPersonAvailableByIdResponse_QNAME, IsPersonAvailableByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "getEventsResponse")
    public JAXBElement<GetEventsResponse> createGetEventsResponse(GetEventsResponse value) {
        return new JAXBElement<GetEventsResponse>(_GetEventsResponse_QNAME, GetEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "updateEventResponse")
    public JAXBElement<UpdateEventResponse> createUpdateEventResponse(UpdateEventResponse value) {
        return new JAXBElement<UpdateEventResponse>(_UpdateEventResponse_QNAME, UpdateEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPersonAvailableByErpIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "isPersonAvailableByErpIdResponse")
    public JAXBElement<IsPersonAvailableByErpIdResponse> createIsPersonAvailableByErpIdResponse(IsPersonAvailableByErpIdResponse value) {
        return new JAXBElement<IsPersonAvailableByErpIdResponse>(_IsPersonAvailableByErpIdResponse_QNAME, IsPersonAvailableByErpIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "insertEvent")
    public JAXBElement<InsertEvent> createInsertEvent(InsertEvent value) {
        return new JAXBElement<InsertEvent>(_InsertEvent_QNAME, InsertEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "getPersons")
    public JAXBElement<GetPersons> createGetPersons(GetPersons value) {
        return new JAXBElement<GetPersons>(_GetPersons_QNAME, GetPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByErpIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "getPersonByErpIdResponse")
    public JAXBElement<GetPersonByErpIdResponse> createGetPersonByErpIdResponse(GetPersonByErpIdResponse value) {
        return new JAXBElement<GetPersonByErpIdResponse>(_GetPersonByErpIdResponse_QNAME, GetPersonByErpIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPersonAvailableById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "isPersonAvailableById")
    public JAXBElement<IsPersonAvailableById> createIsPersonAvailableById(IsPersonAvailableById value) {
        return new JAXBElement<IsPersonAvailableById>(_IsPersonAvailableById_QNAME, IsPersonAvailableById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByErpId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "getPersonByErpId")
    public JAXBElement<GetPersonByErpId> createGetPersonByErpId(GetPersonByErpId value) {
        return new JAXBElement<GetPersonByErpId>(_GetPersonByErpId_QNAME, GetPersonByErpId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPersonAvailableByRfid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "isPersonAvailableByRfid")
    public JAXBElement<IsPersonAvailableByRfid> createIsPersonAvailableByRfid(IsPersonAvailableByRfid value) {
        return new JAXBElement<IsPersonAvailableByRfid>(_IsPersonAvailableByRfid_QNAME, IsPersonAvailableByRfid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "insertEventResponse")
    public JAXBElement<InsertEventResponse> createInsertEventResponse(InsertEventResponse value) {
        return new JAXBElement<InsertEventResponse>(_InsertEventResponse_QNAME, InsertEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPersonAvailableByRfidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "isPersonAvailableByRfidResponse")
    public JAXBElement<IsPersonAvailableByRfidResponse> createIsPersonAvailableByRfidResponse(IsPersonAvailableByRfidResponse value) {
        return new JAXBElement<IsPersonAvailableByRfidResponse>(_IsPersonAvailableByRfidResponse_QNAME, IsPersonAvailableByRfidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPersonAvailableByErpId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "isPersonAvailableByErpId")
    public JAXBElement<IsPersonAvailableByErpId> createIsPersonAvailableByErpId(IsPersonAvailableByErpId value) {
        return new JAXBElement<IsPersonAvailableByErpId>(_IsPersonAvailableByErpId_QNAME, IsPersonAvailableByErpId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "updateEvent")
    public JAXBElement<UpdateEvent> createUpdateEvent(UpdateEvent value) {
        return new JAXBElement<UpdateEvent>(_UpdateEvent_QNAME, UpdateEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "getPersonById")
    public JAXBElement<GetPersonById> createGetPersonById(GetPersonById value) {
        return new JAXBElement<GetPersonById>(_GetPersonById_QNAME, GetPersonById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "getPersonByIdResponse")
    public JAXBElement<GetPersonByIdResponse> createGetPersonByIdResponse(GetPersonByIdResponse value) {
        return new JAXBElement<GetPersonByIdResponse>(_GetPersonByIdResponse_QNAME, GetPersonByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "getPersonsResponse")
    public JAXBElement<GetPersonsResponse> createGetPersonsResponse(GetPersonsResponse value) {
        return new JAXBElement<GetPersonsResponse>(_GetPersonsResponse_QNAME, GetPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peoplemanager.ebbitsproject.eu/", name = "getEvents")
    public JAXBElement<GetEvents> createGetEvents(GetEvents value) {
        return new JAXBElement<GetEvents>(_GetEvents_QNAME, GetEvents.class, null, value);
    }

}
