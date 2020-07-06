/*
 * An XML document type.
 * Localname: serverCode
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.ServerCodeDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one serverCode(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public class ServerCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.ServerCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServerCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVERCODE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "serverCode");
    
    
    /**
     * Gets the "serverCode" element
     */
    public java.lang.String getServerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serverCode" element
     */
    public org.apache.xmlbeans.XmlString xgetServerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVERCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "serverCode" element
     */
    public void setServerCode(java.lang.String serverCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVERCODE$0);
            }
            target.setStringValue(serverCode);
        }
    }
    
    /**
     * Sets (as xml) the "serverCode" element
     */
    public void xsetServerCode(org.apache.xmlbeans.XmlString serverCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVERCODE$0);
            }
            target.set(serverCode);
        }
    }
}
