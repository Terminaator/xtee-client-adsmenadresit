/*
 * An XML document type.
 * Localname: subsystemCode
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.SubsystemCodeDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one subsystemCode(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public class SubsystemCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.SubsystemCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubsystemCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSYSTEMCODE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "subsystemCode");
    
    
    /**
     * Gets the "subsystemCode" element
     */
    public java.lang.String getSubsystemCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSYSTEMCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subsystemCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSubsystemCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSYSTEMCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "subsystemCode" element
     */
    public void setSubsystemCode(java.lang.String subsystemCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSYSTEMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSYSTEMCODE$0);
            }
            target.setStringValue(subsystemCode);
        }
    }
    
    /**
     * Sets (as xml) the "subsystemCode" element
     */
    public void xsetSubsystemCode(org.apache.xmlbeans.XmlString subsystemCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSYSTEMCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSYSTEMCODE$0);
            }
            target.set(subsystemCode);
        }
    }
}
