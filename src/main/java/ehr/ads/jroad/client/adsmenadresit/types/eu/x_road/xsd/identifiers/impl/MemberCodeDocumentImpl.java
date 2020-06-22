/*
 * An XML document type.
 * Localname: memberCode
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberCodeDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one memberCode(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public class MemberCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MemberCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBERCODE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "memberCode");
    
    
    /**
     * Gets the "memberCode" element
     */
    public java.lang.String getMemberCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERCODE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERCODE$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBERCODE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBERCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEMBERCODE$0);
            }
            target.set(memberCode);
        }
    }
}
