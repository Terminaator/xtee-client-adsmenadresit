/*
 * An XML document type.
 * Localname: securityCategoryCode
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.SecurityCategoryCodeDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.impl;
/**
 * A document containing one securityCategoryCode(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public class SecurityCategoryCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.SecurityCategoryCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityCategoryCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYCATEGORYCODE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/identifiers", "securityCategoryCode");
    
    
    /**
     * Gets the "securityCategoryCode" element
     */
    public java.lang.String getSecurityCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYCATEGORYCODE$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYCATEGORYCODE$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYCATEGORYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYCATEGORYCODE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYCATEGORYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYCATEGORYCODE$0);
            }
            target.set(securityCategoryCode);
        }
    }
}
