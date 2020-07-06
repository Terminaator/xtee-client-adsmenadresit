/*
 * An XML document type.
 * Localname: centralService
 * Namespace: http://x-road.eu/xsd/xroad.xsd
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.CentralServiceDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.impl;
/**
 * A document containing one centralService(@http://x-road.eu/xsd/xroad.xsd) element.
 *
 * This is a complex type.
 */
public class CentralServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.CentralServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public CentralServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CENTRALSERVICE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", "centralService");
    
    
    /**
     * Gets the "centralService" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType getCentralService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType)get_store().find_element_user(CENTRALSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "centralService" element
     */
    public void setCentralService(ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType centralService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType)get_store().find_element_user(CENTRALSERVICE$0, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType)get_store().add_element_user(CENTRALSERVICE$0);
            }
            target.set(centralService);
        }
    }
    
    /**
     * Appends and returns a new empty "centralService" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType addNewCentralService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadCentralServiceIdentifierType)get_store().add_element_user(CENTRALSERVICE$0);
            return target;
        }
    }
}
