/*
 * XML Type:  XRoadIdentifierType
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadIdentifierType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * An XML XRoadIdentifierType(@http://x-road.eu/xsd/identifiers).
 *
 * This is a complex type.
 */
public class XRoadIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public XRoadIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XROADINSTANCE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "xRoadInstance");
    private static final javax.xml.namespace.QName MEMBERCLASS$2 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "memberClass");
    private static final javax.xml.namespace.QName MEMBERCODE$4 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "memberCode");
    private static final javax.xml.namespace.QName SUBSYSTEMCODE$6 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "subsystemCode");
    private static final javax.xml.namespace.QName GROUPCODE$8 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "groupCode");
    private static final javax.xml.namespace.QName SERVICECODE$10 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "serviceCode");
    private static final javax.xml.namespace.QName SERVICEVERSION$12 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "serviceVersion");
    private static final javax.xml.namespace.QName SECURITYCATEGORYCODE$14 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "securityCategoryCode");
    private static final javax.xml.namespace.QName SERVERCODE$16 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "serverCode");
    private static final javax.xml.namespace.QName OBJECTTYPE$18 = 
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
    
    /**
     * Gets the "subsystemCode" element
     */
    public java.lang.String getSubsystemCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSYSTEMCODE$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSYSTEMCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "subsystemCode" element
     */
    public boolean isSetSubsystemCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSYSTEMCODE$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSYSTEMCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSYSTEMCODE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSYSTEMCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSYSTEMCODE$6);
            }
            target.set(subsystemCode);
        }
    }
    
    /**
     * Unsets the "subsystemCode" element
     */
    public void unsetSubsystemCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSYSTEMCODE$6, 0);
        }
    }
    
    /**
     * Gets the "groupCode" element
     */
    public java.lang.String getGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCODE$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCODE$8, 0);
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
            return get_store().count_elements(GROUPCODE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUPCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUPCODE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUPCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUPCODE$8);
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
            get_store().remove_element(GROUPCODE$8, 0);
        }
    }
    
    /**
     * Gets the "serviceCode" element
     */
    public java.lang.String getServiceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECODE$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "serviceCode" element
     */
    public boolean isSetServiceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECODE$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICECODE$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICECODE$10);
            }
            target.set(serviceCode);
        }
    }
    
    /**
     * Unsets the "serviceCode" element
     */
    public void unsetServiceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECODE$10, 0);
        }
    }
    
    /**
     * Gets the "serviceVersion" element
     */
    public java.lang.String getServiceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEVERSION$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEVERSION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "serviceVersion" element
     */
    public boolean isSetServiceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEVERSION$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICEVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICEVERSION$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICEVERSION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICEVERSION$12);
            }
            target.set(serviceVersion);
        }
    }
    
    /**
     * Unsets the "serviceVersion" element
     */
    public void unsetServiceVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEVERSION$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYCATEGORYCODE$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYCATEGORYCODE$14, 0);
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
            return get_store().count_elements(SECURITYCATEGORYCODE$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYCATEGORYCODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYCATEGORYCODE$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYCATEGORYCODE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYCATEGORYCODE$14);
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
            get_store().remove_element(SECURITYCATEGORYCODE$14, 0);
        }
    }
    
    /**
     * Gets the "serverCode" element
     */
    public java.lang.String getServerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERCODE$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVERCODE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "serverCode" element
     */
    public boolean isSetServerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVERCODE$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERCODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVERCODE$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVERCODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVERCODE$16);
            }
            target.set(serverCode);
        }
    }
    
    /**
     * Unsets the "serverCode" element
     */
    public void unsetServerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVERCODE$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$18);
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
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().find_attribute_user(OBJECTTYPE$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTTYPE$18);
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
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().find_attribute_user(OBJECTTYPE$18);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType)get_store().add_attribute_user(OBJECTTYPE$18);
            }
            target.set(objectType);
        }
    }
}
