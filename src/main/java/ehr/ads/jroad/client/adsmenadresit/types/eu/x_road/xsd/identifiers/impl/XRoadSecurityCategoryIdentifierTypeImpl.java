/*
 * XML Type:  XRoadSecurityCategoryIdentifierType
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityCategoryIdentifierType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * An XML XRoadSecurityCategoryIdentifierType(@http://x-road.eu/xsd/identifiers).
 *
 * This is a complex type.
 */
public class XRoadSecurityCategoryIdentifierTypeImpl extends ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl.XRoadIdentifierTypeImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityCategoryIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public XRoadSecurityCategoryIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XROADINSTANCE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "xRoadInstance");
    private static final javax.xml.namespace.QName SECURITYCATEGORYCODE$2 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "securityCategoryCode");
    private static final javax.xml.namespace.QName OBJECTTYPE$4 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "objectType");
    
    
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
     * Gets the "securityCategoryCode" element
     */
    public java.lang.String getSecurityCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYCATEGORYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "securityCategoryCode" element
     */
    public org.apache.xmlbeans.XmlString xgetSecurityCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYCATEGORYCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "securityCategoryCode" element
     */
    public boolean isSetSecurityCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYCATEGORYCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "securityCategoryCode" element
     */
    public void setSecurityCategoryCode(java.lang.String securityCategoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYCATEGORYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYCATEGORYCODE$2);
            }
            target.setStringValue(securityCategoryCode);
        }
    }
    
    /**
     * Sets (as xml) the "securityCategoryCode" element
     */
    public void xsetSecurityCategoryCode(org.apache.xmlbeans.XmlString securityCategoryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYCATEGORYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYCATEGORYCODE$2);
            }
            target.set(securityCategoryCode);
        }
    }
    
    /**
     * Unsets the "securityCategoryCode" element
     */
    public void unsetSecurityCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYCATEGORYCODE$2, 0);
        }
    }
    
    /**
     * Gets the "objectType" attribute
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType.Enum getObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OBJECTTYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "objectType" attribute
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType xgetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().find_attribute_user(OBJECTTYPE$4);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_default_attribute_value(OBJECTTYPE$4);
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectType" attribute
     */
    public void setObjectType(ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType.Enum objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTTYPE$4);
            }
            target.setEnumValue(objectType);
        }
    }
    
    /**
     * Sets (as xml) the "objectType" attribute
     */
    public void xsetObjectType(ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().find_attribute_user(OBJECTTYPE$4);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().add_attribute_user(OBJECTTYPE$4);
            }
            target.set(objectType);
        }
    }
}
