/*
 * An XML document type.
 * Localname: memberClass
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one memberClass(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public class MemberClassDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument
{
    private static final long serialVersionUID = 1L;
    
    public MemberClassDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBERCLASS$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "memberClass");
    
    
    /**
     * Gets the "memberClass" element
     */
    public java.lang.String getMemberClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERCLASS$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERCLASS$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBERCLASS$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERCLASS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEMBERCLASS$0);
            }
            target.set(memberClass);
        }
    }
}
