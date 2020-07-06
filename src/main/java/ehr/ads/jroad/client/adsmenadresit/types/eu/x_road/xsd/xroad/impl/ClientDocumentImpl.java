/*
 * An XML document type.
 * Localname: client
 * Namespace: http://x-road.eu/xsd/xroad.xsd
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.ClientDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.impl;
/**
 * A document containing one client(@http://x-road.eu/xsd/xroad.xsd) element.
 *
 * This is a complex type.
 */
public class ClientDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.ClientDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClientDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENT$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", "client");
    
    
    /**
     * Gets the "client" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType getClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "client" element
     */
    public void setClient(ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType client)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType)get_store().add_element_user(CLIENT$0);
            }
            target.set(client);
        }
    }
    
    /**
     * Appends and returns a new empty "client" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType addNewClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType)get_store().add_element_user(CLIENT$0);
            return target;
        }
    }
}
