/*
 * An XML document type.
 * Localname: requestHash
 * Namespace: http://x-road.eu/xsd/xroad.xsd
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.impl;
/**
 * A document containing one requestHash(@http://x-road.eu/xsd/xroad.xsd) element.
 *
 * This is a complex type.
 */
public class RequestHashDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestHashDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTHASH$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", "requestHash");
    
    
    /**
     * Gets the "requestHash" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash getRequestHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash)get_store().find_element_user(REQUESTHASH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestHash" element
     */
    public void setRequestHash(ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash requestHash)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash)get_store().find_element_user(REQUESTHASH$0, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash)get_store().add_element_user(REQUESTHASH$0);
            }
            target.set(requestHash);
        }
    }
    
    /**
     * Appends and returns a new empty "requestHash" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash addNewRequestHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash)get_store().add_element_user(REQUESTHASH$0);
            return target;
        }
    }
    /**
     * An XML requestHash(@http://x-road.eu/xsd/xroad.xsd).
     *
     * This is an atomic type that is a restriction of ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument$RequestHash.
     */
    public static class RequestHashImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.RequestHashDocument.RequestHash
    {
        private static final long serialVersionUID = 1L;
        
        public RequestHashImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RequestHashImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName ALGORITHMID$0 = 
            new javax.xml.namespace.QName("", "algorithmId");
        
        
        /**
         * Gets the "algorithmId" attribute
         */
        public java.lang.String getAlgorithmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHMID$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "algorithmId" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAlgorithmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALGORITHMID$0);
                return target;
            }
        }
        
        /**
         * True if has "algorithmId" attribute
         */
        public boolean isSetAlgorithmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALGORITHMID$0) != null;
            }
        }
        
        /**
         * Sets the "algorithmId" attribute
         */
        public void setAlgorithmId(java.lang.String algorithmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHMID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITHMID$0);
                }
                target.setStringValue(algorithmId);
            }
        }
        
        /**
         * Sets (as xml) the "algorithmId" attribute
         */
        public void xsetAlgorithmId(org.apache.xmlbeans.XmlString algorithmId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALGORITHMID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALGORITHMID$0);
                }
                target.set(algorithmId);
            }
        }
        
        /**
         * Unsets the "algorithmId" attribute
         */
        public void unsetAlgorithmId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALGORITHMID$0);
            }
        }
    }
}
