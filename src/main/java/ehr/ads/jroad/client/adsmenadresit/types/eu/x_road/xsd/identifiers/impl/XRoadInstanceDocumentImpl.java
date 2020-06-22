/*
 * An XML document type.
 * Localname: xRoadInstance
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadInstanceDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one xRoadInstance(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public class XRoadInstanceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadInstanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public XRoadInstanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XROADINSTANCE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "xRoadInstance");
    
    
    /**
     * Gets the "xRoadInstance" element
     */
    public java.lang.String getXRoadInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XROADINSTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xRoadInstance" element
     */
    public org.apache.xmlbeans.XmlString xgetXRoadInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XROADINSTANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "xRoadInstance" element
     */
    public void setXRoadInstance(java.lang.String xRoadInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XROADINSTANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XROADINSTANCE$0);
            }
            target.setStringValue(xRoadInstance);
        }
    }
    
    /**
     * Sets (as xml) the "xRoadInstance" element
     */
    public void xsetXRoadInstance(org.apache.xmlbeans.XmlString xRoadInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XROADINSTANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XROADINSTANCE$0);
            }
            target.set(xRoadInstance);
        }
    }
}
