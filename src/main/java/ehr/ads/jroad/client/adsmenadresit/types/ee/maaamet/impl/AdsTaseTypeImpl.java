/*
 * XML Type:  adsTaseType
 * Namespace: http://www.maaamet.ee
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.impl;
/**
 * An XML adsTaseType(@http://www.maaamet.ee).
 *
 * This is a complex type.
 */
public class AdsTaseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType
{
    private static final long serialVersionUID = 1L;
    
    public AdsTaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KOOD$0 = 
        new javax.xml.namespace.QName("", "kood");
    private static final javax.xml.namespace.QName NIMETUS$2 = 
        new javax.xml.namespace.QName("", "nimetus");
    private static final javax.xml.namespace.QName NIMETUSLIIGIGA$4 = 
        new javax.xml.namespace.QName("", "nimetus_liigiga");
    
    
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
    
    /**
     * Gets the "nimetus_liigiga" element
     */
    public java.lang.String getNimetusLiigiga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIMETUSLIIGIGA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nimetus_liigiga" element
     */
    public org.apache.xmlbeans.XmlString xgetNimetusLiigiga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NIMETUSLIIGIGA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "nimetus_liigiga" element
     */
    public boolean isSetNimetusLiigiga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NIMETUSLIIGIGA$4) != 0;
        }
    }
    
    /**
     * Sets the "nimetus_liigiga" element
     */
    public void setNimetusLiigiga(java.lang.String nimetusLiigiga)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIMETUSLIIGIGA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NIMETUSLIIGIGA$4);
            }
            target.setStringValue(nimetusLiigiga);
        }
    }
    
    /**
     * Sets (as xml) the "nimetus_liigiga" element
     */
    public void xsetNimetusLiigiga(org.apache.xmlbeans.XmlString nimetusLiigiga)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NIMETUSLIIGIGA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NIMETUSLIIGIGA$4);
            }
            target.set(nimetusLiigiga);
        }
    }
    
    /**
     * Unsets the "nimetus_liigiga" element
     */
    public void unsetNimetusLiigiga()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NIMETUSLIIGIGA$4, 0);
        }
    }
}
