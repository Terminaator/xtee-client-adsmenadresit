/*
 * An XML document type.
 * Localname: ADSmenadresitResponse
 * Namespace: http://www.maaamet.ee
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitResponseDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.impl;
/**
 * A document containing one ADSmenadresitResponse(@http://www.maaamet.ee) element.
 *
 * This is a complex type.
 */
public class ADSmenadresitResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ADSmenadresitResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADSMENADRESITRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.maaamet.ee", "ADSmenadresitResponse");
    
    
    /**
     * Gets the "ADSmenadresitResponse" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType getADSmenadresitResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType)get_store().find_element_user(ADSMENADRESITRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ADSmenadresitResponse" element
     */
    public void setADSmenadresitResponse(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType adSmenadresitResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType)get_store().find_element_user(ADSMENADRESITRESPONSE$0, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType)get_store().add_element_user(ADSMENADRESITRESPONSE$0);
            }
            target.set(adSmenadresitResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ADSmenadresitResponse" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType addNewADSmenadresitResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType)get_store().add_element_user(ADSMENADRESITRESPONSE$0);
            return target;
        }
    }
}
