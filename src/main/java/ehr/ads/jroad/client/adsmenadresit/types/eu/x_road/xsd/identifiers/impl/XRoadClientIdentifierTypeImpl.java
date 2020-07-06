/*
 * XML Type:  XRoadClientIdentifierType
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * An XML XRoadClientIdentifierType(@http://x-road.eu/xsd/identifiers).
 *
 * This is a complex type.
 */
public class XRoadClientIdentifierTypeImpl extends ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl.XRoadIdentifierTypeImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadClientIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public XRoadClientIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XROADINSTANCE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "xRoadInstance");
    private static final javax.xml.namespace.QName MEMBERCLASS$2 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "memberClass");
    private static final javax.xml.namespace.QName MEMBERCODE$4 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "memberCode");
    
    
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
     * True if has "xRoadInstance" element
     */
    public boolean isSetXRoadInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XROADINSTANCE$0) != 0;
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
    
    /**
     * Unsets the "xRoadInstance" element
     */
    public void unsetXRoadInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XROADINSTANCE$0, 0);
        }
    }
    
    /**
     * Gets the "memberClass" element
     */
    public java.lang.String getMemberClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERCLASS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "memberClass" element
     */
    public org.apache.xmlbeans.XmlString xgetMemberClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERCLASS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "memberClass" element
     */
    public boolean isSetMemberClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBERCLASS$2) != 0;
        }
    }
    
    /**
     * Sets the "memberClass" element
     */
    public void setMemberClass(java.lang.String memberClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERCLASS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBERCLASS$2);
            }
            target.setStringValue(memberClass);
        }
    }
    
    /**
     * Sets (as xml) the "memberClass" element
     */
    public void xsetMemberClass(org.apache.xmlbeans.XmlString memberClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERCLASS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEMBERCLASS$2);
            }
            target.set(memberClass);
        }
    }
    
    /**
     * Unsets the "memberClass" element
     */
    public void unsetMemberClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBERCLASS$2, 0);
        }
    }
    
    /**
     * Gets the "memberCode" element
     */
    public java.lang.String getMemberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "memberCode" element
     */
    public org.apache.xmlbeans.XmlString xgetMemberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "memberCode" element
     */
    public boolean isSetMemberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBERCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "memberCode" element
     */
    public void setMemberCode(java.lang.String memberCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBERCODE$4);
            }
            target.setStringValue(memberCode);
        }
    }
    
    /**
     * Sets (as xml) the "memberCode" element
     */
    public void xsetMemberCode(org.apache.xmlbeans.XmlString memberCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEMBERCODE$4);
            }
            target.set(memberCode);
        }
    }
    
    /**
     * Unsets the "memberCode" element
     */
    public void unsetMemberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBERCODE$4, 0);
        }
    }
}
