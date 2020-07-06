/*
 * An XML document type.
 * Localname: serviceVersion
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.ServiceVersionDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one serviceVersion(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public class ServiceVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.ServiceVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEVERSION$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "serviceVersion");
    
    
    /**
     * Gets the "serviceVersion" element
     */
    public java.lang.String getServiceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serviceVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetServiceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "serviceVersion" element
     */
    public void setServiceVersion(java.lang.String serviceVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEVERSION$0);
            }
            target.setStringValue(serviceVersion);
        }
    }
    
    /**
     * Sets (as xml) the "serviceVersion" element
     */
    public void xsetServiceVersion(org.apache.xmlbeans.XmlString serviceVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICEVERSION$0);
            }
            target.set(serviceVersion);
        }
    }
}
