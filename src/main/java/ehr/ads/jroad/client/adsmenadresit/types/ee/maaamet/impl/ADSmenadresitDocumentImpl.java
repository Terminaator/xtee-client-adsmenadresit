/*
 * An XML document type.
 * Localname: ADSmenadresit
 * Namespace: http://www.maaamet.ee
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.impl;
/**
 * A document containing one ADSmenadresit(@http://www.maaamet.ee) element.
 *
 * This is a complex type.
 */
public class ADSmenadresitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ADSmenadresitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADSMENADRESIT$0 = 
        new javax.xml.namespace.QName("http://www.maaamet.ee", "ADSmenadresit");
    
    
    /**
     * Gets the "ADSmenadresit" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType getADSmenadresit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType)get_store().find_element_user(ADSMENADRESIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ADSmenadresit" element
     */
    public void setADSmenadresit(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType adSmenadresit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType)get_store().find_element_user(ADSMENADRESIT$0, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType)get_store().add_element_user(ADSMENADRESIT$0);
            }
            target.set(adSmenadresit);
        }
    }
    
    /**
     * Appends and returns a new empty "ADSmenadresit" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType addNewADSmenadresit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType)get_store().add_element_user(ADSMENADRESIT$0);
            return target;
        }
    }
}
