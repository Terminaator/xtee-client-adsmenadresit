/*
 * An XML document type.
 * Localname: service
 * Namespace: http://x-road.eu/xsd/xroad.xsd
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.ServiceDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.impl;
/**
 * A document containing one service(@http://x-road.eu/xsd/xroad.xsd) element.
 *
 * This is a complex type.
 */
public class ServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.ServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", "service");
    
    
    /**
     * Gets the "service" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service" element
     */
    public void setService(ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType)get_store().add_element_user(SERVICE$0);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "service" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadServiceIdentifierType)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
}
