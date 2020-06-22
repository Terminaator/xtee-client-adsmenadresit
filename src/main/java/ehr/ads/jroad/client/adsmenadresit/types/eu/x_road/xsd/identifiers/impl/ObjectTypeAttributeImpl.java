/*
 * An XML attribute type.
 * Localname: objectType
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.ObjectTypeAttribute
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one objectType(@http://x-road.eu/xsd/identifiers) attribute.
 *
 * This is a complex type.
 */
public class ObjectTypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.ObjectTypeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ObjectTypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTTYPE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "objectType");
    
    
    /**
     * Gets the "objectType" attribute
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType.Enum getObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$0);
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
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().find_attribute_user(OBJECTTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "objectType" attribute
     */
    public boolean isSetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OBJECTTYPE$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTTYPE$0);
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
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().find_attribute_user(OBJECTTYPE$0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().add_attribute_user(OBJECTTYPE$0);
            }
            target.set(objectType);
        }
    }
    
    /**
     * Unsets the "objectType" attribute
     */
    public void unsetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OBJECTTYPE$0);
        }
    }
}
