/*
 * An XML document type.
 * Localname: issue
 * Namespace: http://x-road.eu/xsd/xroad.xsd
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.IssueDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.impl;
/**
 * A document containing one issue(@http://x-road.eu/xsd/xroad.xsd) element.
 *
 * This is a complex type.
 */
public class IssueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.IssueDocument
{
    private static final long serialVersionUID = 1L;
    
    public IssueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISSUE$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", "issue");
    
    
    /**
     * Gets the "issue" element
     */
    public java.lang.String getIssue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "issue" element
     */
    public org.apache.xmlbeans.XmlString xgetIssue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "issue" element
     */
    public void setIssue(java.lang.String issue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUE$0);
            }
            target.setStringValue(issue);
        }
    }
    
    /**
     * Sets (as xml) the "issue" element
     */
    public void xsetIssue(org.apache.xmlbeans.XmlString issue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUE$0);
            }
            target.set(issue);
        }
    }
}
