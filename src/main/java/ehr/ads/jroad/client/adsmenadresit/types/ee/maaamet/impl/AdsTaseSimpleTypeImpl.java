/*
 * XML Type:  adsTaseSimpleType
 * Namespace: http://www.maaamet.ee
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.impl;
/**
 * An XML adsTaseSimpleType(@http://www.maaamet.ee).
 *
 * This is a complex type.
 */
public class AdsTaseSimpleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType
{
    private static final long serialVersionUID = 1L;
    
    public AdsTaseSimpleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KOOD$0 = 
        new javax.xml.namespace.QName("", "kood");
    private static final javax.xml.namespace.QName NIMETUS$2 = 
        new javax.xml.namespace.QName("", "nimetus");
    
    
    /**
     * Gets the "kood" element
     */
    public java.lang.String getKood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "kood" element
     */
    public org.apache.xmlbeans.XmlString xgetKood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOOD$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "kood" element
     */
    public boolean isSetKood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KOOD$0) != 0;
        }
    }
    
    /**
     * Sets the "kood" element
     */
    public void setKood(java.lang.String kood)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOOD$0);
            }
            target.setStringValue(kood);
        }
    }
    
    /**
     * Sets (as xml) the "kood" element
     */
    public void xsetKood(org.apache.xmlbeans.XmlString kood)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOOD$0);
            }
            target.set(kood);
        }
    }
    
    /**
     * Unsets the "kood" element
     */
    public void unsetKood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KOOD$0, 0);
        }
    }
    
    /**
     * Gets the "nimetus" element
     */
    public java.lang.String getNimetus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIMETUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nimetus" element
     */
    public org.apache.xmlbeans.XmlString xgetNimetus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NIMETUS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "nimetus" element
     */
    public boolean isSetNimetus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NIMETUS$2) != 0;
        }
    }
    
    /**
     * Sets the "nimetus" element
     */
    public void setNimetus(java.lang.String nimetus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIMETUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NIMETUS$2);
            }
            target.setStringValue(nimetus);
        }
    }
    
    /**
     * Sets (as xml) the "nimetus" element
     */
    public void xsetNimetus(org.apache.xmlbeans.XmlString nimetus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NIMETUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NIMETUS$2);
            }
            target.set(nimetus);
        }
    }
    
    /**
     * Unsets the "nimetus" element
     */
    public void unsetNimetus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NIMETUS$2, 0);
        }
    }
}
