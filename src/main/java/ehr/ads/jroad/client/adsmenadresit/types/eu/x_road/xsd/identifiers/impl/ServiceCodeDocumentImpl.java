/*
 * An XML document type.
 * Localname: serviceCode
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.ServiceCodeDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one serviceCode(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public class ServiceCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.ServiceCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICECODE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "serviceCode");
    
    
    /**
     * Gets the "serviceCode" element
     */
    public java.lang.String getServiceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serviceCode" element
     */
    public org.apache.xmlbeans.XmlString xgetServiceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "serviceCode" element
     */
    public void setServiceCode(java.lang.String serviceCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICECODE$0);
            }
            target.setStringValue(serviceCode);
        }
    }
    
    /**
     * Sets (as xml) the "serviceCode" element
     */
    public void xsetServiceCode(org.apache.xmlbeans.XmlString serviceCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICECODE$0);
            }
            target.set(serviceCode);
        }
    }
}
