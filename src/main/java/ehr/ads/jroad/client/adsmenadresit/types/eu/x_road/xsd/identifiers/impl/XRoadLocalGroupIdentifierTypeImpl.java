/*
 * XML Type:  XRoadLocalGroupIdentifierType
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadLocalGroupIdentifierType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * An XML XRoadLocalGroupIdentifierType(@http://x-road.eu/xsd/identifiers).
 *
 * This is a complex type.
 */
public class XRoadLocalGroupIdentifierTypeImpl extends ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl.XRoadIdentifierTypeImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadLocalGroupIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public XRoadLocalGroupIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPCODE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "groupCode");
    private static final javax.xml.namespace.QName OBJECTTYPE$2 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "objectType");
    
    
    /**
     * Gets the "groupCode" element
     */
    public java.lang.String getGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupCode" element
     */
    public org.apache.xmlbeans.XmlString xgetGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "groupCode" element
     */
    public boolean isSetGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "groupCode" element
     */
    public void setGroupCode(java.lang.String groupCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPCODE$0);
            }
            target.setStringValue(groupCode);
        }
    }
    
    /**
     * Sets (as xml) the "groupCode" element
     */
    public void xsetGroupCode(org.apache.xmlbeans.XmlString groupCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPCODE$0);
            }
            target.set(groupCode);
        }
    }
    
    /**
     * Unsets the "groupCode" element
     */
    public void unsetGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPCODE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OBJECTTYPE$2);
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
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().find_attribute_user(OBJECTTYPE$2);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_default_attribute_value(OBJECTTYPE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTTYPE$2);
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
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().find_attribute_user(OBJECTTYPE$2);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().add_attribute_user(OBJECTTYPE$2);
            }
            target.set(objectType);
        }
    }
}
