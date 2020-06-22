/*
 * An XML document type.
 * Localname: groupCode
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.GroupCodeDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one groupCode(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public class GroupCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.GroupCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPCODE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "groupCode");
    
    
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
}
