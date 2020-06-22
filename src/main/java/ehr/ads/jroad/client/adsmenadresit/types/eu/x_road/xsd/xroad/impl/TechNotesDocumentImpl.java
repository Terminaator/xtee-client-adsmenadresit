/*
 * An XML document type.
 * Localname: techNotes
 * Namespace: http://x-road.eu/xsd/xroad.xsd
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.impl;
/**
 * A document containing one techNotes(@http://x-road.eu/xsd/xroad.xsd) element.
 *
 * This is a complex type.
 */
public class TechNotesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument
{
    private static final long serialVersionUID = 1L;
    
    public TechNotesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TECHNOTES$0 = 
        new javax.xml.namespace.QName("http://x-road.eu/xsd/xroad.xsd", "techNotes");
    
    
    /**
     * Gets the "techNotes" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes getTechNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes)get_store().find_element_user(TECHNOTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "techNotes" element
     */
    public void setTechNotes(ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes techNotes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes)get_store().find_element_user(TECHNOTES$0, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes)get_store().add_element_user(TECHNOTES$0);
            }
            target.set(techNotes);
        }
    }
    
    /**
     * Appends and returns a new empty "techNotes" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes addNewTechNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes)get_store().add_element_user(TECHNOTES$0);
            return target;
        }
    }
    /**
     * An XML techNotes(@http://x-road.eu/xsd/xroad.xsd).
     *
     * This is an atomic type that is a restriction of ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument$TechNotes.
     */
    public static class TechNotesImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.xroad.TechNotesDocument.TechNotes
    {
        private static final long serialVersionUID = 1L;
        
        public TechNotesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TechNotesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LANG$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LANG$0);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_default_attribute_value(LANG$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }
    }
}
