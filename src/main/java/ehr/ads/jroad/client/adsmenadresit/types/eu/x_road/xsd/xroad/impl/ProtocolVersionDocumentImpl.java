/*
 * An XML document type.
 * Localname: protocolVersion
 * Namespace: http://x-road.eu/xsd/xroad.xsd
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.ProtocolVersionDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.impl;
/**
 * A document containing one protocolVersion(@http://x-road.eu/xsd/xroad.xsd) element.
 *
 * This is a complex type.
 */
public class ProtocolVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.ProtocolVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProtocolVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROTOCOLVERSION$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", "protocolVersion");
    
    
    /**
     * Gets the "protocolVersion" element
     */
    public java.lang.String getProtocolVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOLVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "protocolVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetProtocolVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROTOCOLVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "protocolVersion" element
     */
    public void setProtocolVersion(java.lang.String protocolVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOLVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROTOCOLVERSION$0);
            }
            target.setStringValue(protocolVersion);
        }
    }
    
    /**
     * Sets (as xml) the "protocolVersion" element
     */
    public void xsetProtocolVersion(org.apache.xmlbeans.XmlString protocolVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROTOCOLVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROTOCOLVERSION$0);
            }
            target.set(protocolVersion);
        }
    }
}
