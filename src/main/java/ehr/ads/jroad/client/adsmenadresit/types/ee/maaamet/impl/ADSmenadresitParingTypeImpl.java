/*
 * XML Type:  ADSmenadresitParingType
 * Namespace: http://www.maaamet.ee
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.impl;
/**
 * An XML ADSmenadresitParingType(@http://www.maaamet.ee).
 *
 * This is a complex type.
 */
public class ADSmenadresitParingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType
{
    private static final long serialVersionUID = 1L;
    
    public ADSmenadresitParingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESITAJAKOOD$0 = 
        new javax.xml.namespace.QName("", "esitajaKood");
    private static final javax.xml.namespace.QName MENETLEJANIMI$2 = 
        new javax.xml.namespace.QName("", "menetlejaNimi");
    private static final javax.xml.namespace.QName AINULTKONTROLL$4 = 
        new javax.xml.namespace.QName("", "ainultKontroll");
    private static final javax.xml.namespace.QName MENETLUSNR$6 = 
        new javax.xml.namespace.QName("", "menetlusNr");
    private static final javax.xml.namespace.QName RUUMIANDMETEFORMAAT$8 = 
        new javax.xml.namespace.QName("", "ruumiAndmeteFormaat");
    private static final javax.xml.namespace.QName OBJEKTID$10 = 
        new javax.xml.namespace.QName("", "objektid");
    
    
    /**
     * Gets the "esitajaKood" element
     */
    public java.lang.String getEsitajaKood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESITAJAKOOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "esitajaKood" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.EsitajakoodType xgetEsitajaKood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.EsitajakoodType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.EsitajakoodType)get_store().find_element_user(ESITAJAKOOD$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "esitajaKood" element
     */
    public boolean isSetEsitajaKood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESITAJAKOOD$0) != 0;
        }
    }
    
    /**
     * Sets the "esitajaKood" element
     */
    public void setEsitajaKood(java.lang.String esitajaKood)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESITAJAKOOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESITAJAKOOD$0);
            }
            target.setStringValue(esitajaKood);
        }
    }
    
    /**
     * Sets (as xml) the "esitajaKood" element
     */
    public void xsetEsitajaKood(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.EsitajakoodType esitajaKood)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.EsitajakoodType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.EsitajakoodType)get_store().find_element_user(ESITAJAKOOD$0, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.EsitajakoodType)get_store().add_element_user(ESITAJAKOOD$0);
            }
            target.set(esitajaKood);
        }
    }
    
    /**
     * Unsets the "esitajaKood" element
     */
    public void unsetEsitajaKood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESITAJAKOOD$0, 0);
        }
    }
    
    /**
     * Gets the "menetlejaNimi" element
     */
    public java.lang.String getMenetlejaNimi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENETLEJANIMI$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "menetlejaNimi" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.MenetlejanimiType xgetMenetlejaNimi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.MenetlejanimiType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.MenetlejanimiType)get_store().find_element_user(MENETLEJANIMI$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "menetlejaNimi" element
     */
    public boolean isSetMenetlejaNimi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENETLEJANIMI$2) != 0;
        }
    }
    
    /**
     * Sets the "menetlejaNimi" element
     */
    public void setMenetlejaNimi(java.lang.String menetlejaNimi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENETLEJANIMI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENETLEJANIMI$2);
            }
            target.setStringValue(menetlejaNimi);
        }
    }
    
    /**
     * Sets (as xml) the "menetlejaNimi" element
     */
    public void xsetMenetlejaNimi(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.MenetlejanimiType menetlejaNimi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.MenetlejanimiType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.MenetlejanimiType)get_store().find_element_user(MENETLEJANIMI$2, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.MenetlejanimiType)get_store().add_element_user(MENETLEJANIMI$2);
            }
            target.set(menetlejaNimi);
        }
    }
    
    /**
     * Unsets the "menetlejaNimi" element
     */
    public void unsetMenetlejaNimi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENETLEJANIMI$2, 0);
        }
    }
    
    /**
     * Gets the "ainultKontroll" element
     */
    public boolean getAinultKontroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AINULTKONTROLL$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ainultKontroll" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAinultKontroll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AINULTKONTROLL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ainultKontroll" element
     */
    public void setAinultKontroll(boolean ainultKontroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AINULTKONTROLL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AINULTKONTROLL$4);
            }
            target.setBooleanValue(ainultKontroll);
        }
    }
    
    /**
     * Sets (as xml) the "ainultKontroll" element
     */
    public void xsetAinultKontroll(org.apache.xmlbeans.XmlBoolean ainultKontroll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AINULTKONTROLL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AINULTKONTROLL$4);
            }
            target.set(ainultKontroll);
        }
    }
    
    /**
     * Gets the "menetlusNr" element
     */
    public java.math.BigInteger getMenetlusNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENETLUSNR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "menetlusNr" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMenetlusNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MENETLUSNR$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "menetlusNr" element
     */
    public boolean isSetMenetlusNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENETLUSNR$6) != 0;
        }
    }
    
    /**
     * Sets the "menetlusNr" element
     */
    public void setMenetlusNr(java.math.BigInteger menetlusNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENETLUSNR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENETLUSNR$6);
            }
            target.setBigIntegerValue(menetlusNr);
        }
    }
    
    /**
     * Sets (as xml) the "menetlusNr" element
     */
    public void xsetMenetlusNr(org.apache.xmlbeans.XmlInteger menetlusNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MENETLUSNR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MENETLUSNR$6);
            }
            target.set(menetlusNr);
        }
    }
    
    /**
     * Unsets the "menetlusNr" element
     */
    public void unsetMenetlusNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENETLUSNR$6, 0);
        }
    }
    
    /**
     * Gets the "ruumiAndmeteFormaat" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType.Enum getRuumiAndmeteFormaat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUUMIANDMETEFORMAAT$8, 0);
            if (target == null)
            {
                return null;
            }
            return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ruumiAndmeteFormaat" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType xgetRuumiAndmeteFormaat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType)get_store().find_element_user(RUUMIANDMETEFORMAAT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ruumiAndmeteFormaat" element
     */
    public boolean isSetRuumiAndmeteFormaat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUUMIANDMETEFORMAAT$8) != 0;
        }
    }
    
    /**
     * Sets the "ruumiAndmeteFormaat" element
     */
    public void setRuumiAndmeteFormaat(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType.Enum ruumiAndmeteFormaat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUUMIANDMETEFORMAAT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUUMIANDMETEFORMAAT$8);
            }
            target.setEnumValue(ruumiAndmeteFormaat);
        }
    }
    
    /**
     * Sets (as xml) the "ruumiAndmeteFormaat" element
     */
    public void xsetRuumiAndmeteFormaat(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType ruumiAndmeteFormaat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType)get_store().find_element_user(RUUMIANDMETEFORMAAT$8, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType)get_store().add_element_user(RUUMIANDMETEFORMAAT$8);
            }
            target.set(ruumiAndmeteFormaat);
        }
    }
    
    /**
     * Unsets the "ruumiAndmeteFormaat" element
     */
    public void unsetRuumiAndmeteFormaat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUUMIANDMETEFORMAAT$8, 0);
        }
    }
    
    /**
     * Gets the "objektid" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid getObjektid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid)get_store().find_element_user(OBJEKTID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "objektid" element
     */
    public boolean isSetObjektid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJEKTID$10) != 0;
        }
    }
    
    /**
     * Sets the "objektid" element
     */
    public void setObjektid(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid objektid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid)get_store().find_element_user(OBJEKTID$10, 0);
            if (target == null)
            {
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid)get_store().add_element_user(OBJEKTID$10);
            }
            target.set(objektid);
        }
    }
    
    /**
     * Appends and returns a new empty "objektid" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid addNewObjektid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid)get_store().add_element_user(OBJEKTID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "objektid" element
     */
    public void unsetObjektid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJEKTID$10, 0);
        }
    }
    /**
     * An XML objektid(@).
     *
     * This is a complex type.
     */
    public static class ObjektidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid
    {
        private static final long serialVersionUID = 1L;
        
        public ObjektidImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MENOBJEKT$0 = 
            new javax.xml.namespace.QName("", "menobjekt");
        
        
        /**
         * Gets a List of "menobjekt" elements
         */
        public java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt> getMenobjektList()
        {
            final class MenobjektList extends java.util.AbstractList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt>
            {
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt get(int i)
                    { return ObjektidImpl.this.getMenobjektArray(i); }
                
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt set(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt o)
                {
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt old = ObjektidImpl.this.getMenobjektArray(i);
                    ObjektidImpl.this.setMenobjektArray(i, o);
                    return old;
                }
                
                public void add(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt o)
                    { ObjektidImpl.this.insertNewMenobjekt(i).set(o); }
                
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt remove(int i)
                {
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt old = ObjektidImpl.this.getMenobjektArray(i);
                    ObjektidImpl.this.removeMenobjekt(i);
                    return old;
                }
                
                public int size()
                    { return ObjektidImpl.this.sizeOfMenobjektArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MenobjektList();
            }
        }
        
        /**
         * Gets array of all "menobjekt" elements
         * @deprecated
         */
        public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt[] getMenobjektArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt> targetList = new java.util.ArrayList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt>();
                get_store().find_all_element_users(MENOBJEKT$0, targetList);
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt[] result = new ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "menobjekt" element
         */
        public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt getMenobjektArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt target = null;
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt)get_store().find_element_user(MENOBJEKT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "menobjekt" element
         */
        public int sizeOfMenobjektArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MENOBJEKT$0);
            }
        }
        
        /**
         * Sets array of all "menobjekt" element
         */
        public void setMenobjektArray(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt[] menobjektArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(menobjektArray, MENOBJEKT$0);
            }
        }
        
        /**
         * Sets ith "menobjekt" element
         */
        public void setMenobjektArray(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt menobjekt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt target = null;
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt)get_store().find_element_user(MENOBJEKT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(menobjekt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "menobjekt" element
         */
        public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt insertNewMenobjekt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt target = null;
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt)get_store().insert_element_user(MENOBJEKT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "menobjekt" element
         */
        public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt addNewMenobjekt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt target = null;
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt)get_store().add_element_user(MENOBJEKT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "menobjekt" element
         */
        public void removeMenobjekt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MENOBJEKT$0, i);
            }
        }
        /**
         * An XML menobjekt(@).
         *
         * This is a complex type.
         */
        public static class MenobjektImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt
        {
            private static final long serialVersionUID = 1L;
            
            public MenobjektImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OBJEKTILIIK$0 = 
                new javax.xml.namespace.QName("", "objektiLiik");
            private static final javax.xml.namespace.QName ADSOID$2 = 
                new javax.xml.namespace.QName("", "adsOid");
            private static final javax.xml.namespace.QName ORIGTUNNUS$4 = 
                new javax.xml.namespace.QName("", "origTunnus");
            private static final javax.xml.namespace.QName OIGUSLIKALUS$6 = 
                new javax.xml.namespace.QName("", "oiguslikAlus");
            private static final javax.xml.namespace.QName ALUSEKUUPAEV$8 = 
                new javax.xml.namespace.QName("", "aluseKuupaev");
            private static final javax.xml.namespace.QName OLEK$10 = 
                new javax.xml.namespace.QName("", "olek");
            private static final javax.xml.namespace.QName TAHIS$12 = 
                new javax.xml.namespace.QName("", "tahis");
            private static final javax.xml.namespace.QName KORRUS$14 = 
                new javax.xml.namespace.QName("", "korrus");
            private static final javax.xml.namespace.QName RUUMIKUJU$16 = 
                new javax.xml.namespace.QName("", "ruumiKuju");
            private static final javax.xml.namespace.QName KUJUMOODUSTUSVIIS$18 = 
                new javax.xml.namespace.QName("", "kujuMoodustusviis");
            private static final javax.xml.namespace.QName HOONEADSOID$20 = 
                new javax.xml.namespace.QName("", "hooneAdsOid");
            private static final javax.xml.namespace.QName HOONEORIGTUNNUS$22 = 
                new javax.xml.namespace.QName("", "hooneOrigTunnus");
            private static final javax.xml.namespace.QName AADRESSID$24 = 
                new javax.xml.namespace.QName("", "aadressid");
            
            
            /**
             * Gets the "objektiLiik" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator.Enum getObjektiLiik()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJEKTILIIK$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "objektiLiik" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator xgetObjektiLiik()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator)get_store().find_element_user(OBJEKTILIIK$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "objektiLiik" element
             */
            public void setObjektiLiik(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator.Enum objektiLiik)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJEKTILIIK$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJEKTILIIK$0);
                    }
                    target.setEnumValue(objektiLiik);
                }
            }
            
            /**
             * Sets (as xml) the "objektiLiik" element
             */
            public void xsetObjektiLiik(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator objektiLiik)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator)get_store().find_element_user(OBJEKTILIIK$0, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator)get_store().add_element_user(OBJEKTILIIK$0);
                    }
                    target.set(objektiLiik);
                }
            }
            
            /**
             * Gets the "adsOid" element
             */
            public java.lang.String getAdsOid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADSOID$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "adsOid" element
             */
            public org.apache.xmlbeans.XmlString xgetAdsOid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADSOID$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "adsOid" element
             */
            public boolean isSetAdsOid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ADSOID$2) != 0;
                }
            }
            
            /**
             * Sets the "adsOid" element
             */
            public void setAdsOid(java.lang.String adsOid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADSOID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADSOID$2);
                    }
                    target.setStringValue(adsOid);
                }
            }
            
            /**
             * Sets (as xml) the "adsOid" element
             */
            public void xsetAdsOid(org.apache.xmlbeans.XmlString adsOid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADSOID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADSOID$2);
                    }
                    target.set(adsOid);
                }
            }
            
            /**
             * Unsets the "adsOid" element
             */
            public void unsetAdsOid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ADSOID$2, 0);
                }
            }
            
            /**
             * Gets the "origTunnus" element
             */
            public java.lang.String getOrigTunnus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGTUNNUS$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "origTunnus" element
             */
            public org.apache.xmlbeans.XmlString xgetOrigTunnus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGTUNNUS$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "origTunnus" element
             */
            public void setOrigTunnus(java.lang.String origTunnus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGTUNNUS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGTUNNUS$4);
                    }
                    target.setStringValue(origTunnus);
                }
            }
            
            /**
             * Sets (as xml) the "origTunnus" element
             */
            public void xsetOrigTunnus(org.apache.xmlbeans.XmlString origTunnus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGTUNNUS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGTUNNUS$4);
                    }
                    target.set(origTunnus);
                }
            }
            
            /**
             * Gets the "oiguslikAlus" element
             */
            public java.lang.String getOiguslikAlus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OIGUSLIKALUS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "oiguslikAlus" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.OiguslikalusType xgetOiguslikAlus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.OiguslikalusType target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.OiguslikalusType)get_store().find_element_user(OIGUSLIKALUS$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "oiguslikAlus" element
             */
            public boolean isSetOiguslikAlus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OIGUSLIKALUS$6) != 0;
                }
            }
            
            /**
             * Sets the "oiguslikAlus" element
             */
            public void setOiguslikAlus(java.lang.String oiguslikAlus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OIGUSLIKALUS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OIGUSLIKALUS$6);
                    }
                    target.setStringValue(oiguslikAlus);
                }
            }
            
            /**
             * Sets (as xml) the "oiguslikAlus" element
             */
            public void xsetOiguslikAlus(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.OiguslikalusType oiguslikAlus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.OiguslikalusType target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.OiguslikalusType)get_store().find_element_user(OIGUSLIKALUS$6, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.OiguslikalusType)get_store().add_element_user(OIGUSLIKALUS$6);
                    }
                    target.set(oiguslikAlus);
                }
            }
            
            /**
             * Unsets the "oiguslikAlus" element
             */
            public void unsetOiguslikAlus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OIGUSLIKALUS$6, 0);
                }
            }
            
            /**
             * Gets the "aluseKuupaev" element
             */
            public java.util.Calendar getAluseKuupaev()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALUSEKUUPAEV$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "aluseKuupaev" element
             */
            public org.apache.xmlbeans.XmlDate xgetAluseKuupaev()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ALUSEKUUPAEV$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "aluseKuupaev" element
             */
            public boolean isSetAluseKuupaev()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ALUSEKUUPAEV$8) != 0;
                }
            }
            
            /**
             * Sets the "aluseKuupaev" element
             */
            public void setAluseKuupaev(java.util.Calendar aluseKuupaev)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALUSEKUUPAEV$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALUSEKUUPAEV$8);
                    }
                    target.setCalendarValue(aluseKuupaev);
                }
            }
            
            /**
             * Sets (as xml) the "aluseKuupaev" element
             */
            public void xsetAluseKuupaev(org.apache.xmlbeans.XmlDate aluseKuupaev)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDate target = null;
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ALUSEKUUPAEV$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ALUSEKUUPAEV$8);
                    }
                    target.set(aluseKuupaev);
                }
            }
            
            /**
             * Unsets the "aluseKuupaev" element
             */
            public void unsetAluseKuupaev()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ALUSEKUUPAEV$8, 0);
                }
            }
            
            /**
             * Gets the "olek" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType.Enum getOlek()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLEK$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "olek" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType xgetOlek()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType)get_store().find_element_user(OLEK$10, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "olek" element
             */
            public void setOlek(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType.Enum olek)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLEK$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OLEK$10);
                    }
                    target.setEnumValue(olek);
                }
            }
            
            /**
             * Sets (as xml) the "olek" element
             */
            public void xsetOlek(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType olek)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType)get_store().find_element_user(OLEK$10, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType)get_store().add_element_user(OLEK$10);
                    }
                    target.set(olek);
                }
            }
            
            /**
             * Gets the "tahis" element
             */
            public java.lang.String getTahis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAHIS$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "tahis" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.TahisType xgetTahis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.TahisType target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.TahisType)get_store().find_element_user(TAHIS$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "tahis" element
             */
            public boolean isSetTahis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TAHIS$12) != 0;
                }
            }
            
            /**
             * Sets the "tahis" element
             */
            public void setTahis(java.lang.String tahis)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAHIS$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAHIS$12);
                    }
                    target.setStringValue(tahis);
                }
            }
            
            /**
             * Sets (as xml) the "tahis" element
             */
            public void xsetTahis(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.TahisType tahis)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.TahisType target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.TahisType)get_store().find_element_user(TAHIS$12, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.TahisType)get_store().add_element_user(TAHIS$12);
                    }
                    target.set(tahis);
                }
            }
            
            /**
             * Unsets the "tahis" element
             */
            public void unsetTahis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TAHIS$12, 0);
                }
            }
            
            /**
             * Gets the "korrus" element
             */
            public java.math.BigInteger getKorrus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KORRUS$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "korrus" element
             */
            public org.apache.xmlbeans.XmlInteger xgetKorrus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KORRUS$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "korrus" element
             */
            public boolean isSetKorrus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(KORRUS$14) != 0;
                }
            }
            
            /**
             * Sets the "korrus" element
             */
            public void setKorrus(java.math.BigInteger korrus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KORRUS$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KORRUS$14);
                    }
                    target.setBigIntegerValue(korrus);
                }
            }
            
            /**
             * Sets (as xml) the "korrus" element
             */
            public void xsetKorrus(org.apache.xmlbeans.XmlInteger korrus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInteger target = null;
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KORRUS$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(KORRUS$14);
                    }
                    target.set(korrus);
                }
            }
            
            /**
             * Unsets the "korrus" element
             */
            public void unsetKorrus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(KORRUS$14, 0);
                }
            }
            
            /**
             * Gets the "ruumiKuju" element
             */
            public java.lang.String getRuumiKuju()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUUMIKUJU$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ruumiKuju" element
             */
            public org.apache.xmlbeans.XmlString xgetRuumiKuju()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUUMIKUJU$16, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ruumiKuju" element
             */
            public boolean isSetRuumiKuju()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RUUMIKUJU$16) != 0;
                }
            }
            
            /**
             * Sets the "ruumiKuju" element
             */
            public void setRuumiKuju(java.lang.String ruumiKuju)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUUMIKUJU$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUUMIKUJU$16);
                    }
                    target.setStringValue(ruumiKuju);
                }
            }
            
            /**
             * Sets (as xml) the "ruumiKuju" element
             */
            public void xsetRuumiKuju(org.apache.xmlbeans.XmlString ruumiKuju)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUUMIKUJU$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RUUMIKUJU$16);
                    }
                    target.set(ruumiKuju);
                }
            }
            
            /**
             * Unsets the "ruumiKuju" element
             */
            public void unsetRuumiKuju()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RUUMIKUJU$16, 0);
                }
            }
            
            /**
             * Gets the "kujuMoodustusviis" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType.Enum getKujuMoodustusviis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KUJUMOODUSTUSVIIS$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "kujuMoodustusviis" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType xgetKujuMoodustusviis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType)get_store().find_element_user(KUJUMOODUSTUSVIIS$18, 0);
                    return target;
                }
            }
            
            /**
             * True if has "kujuMoodustusviis" element
             */
            public boolean isSetKujuMoodustusviis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(KUJUMOODUSTUSVIIS$18) != 0;
                }
            }
            
            /**
             * Sets the "kujuMoodustusviis" element
             */
            public void setKujuMoodustusviis(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType.Enum kujuMoodustusviis)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KUJUMOODUSTUSVIIS$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KUJUMOODUSTUSVIIS$18);
                    }
                    target.setEnumValue(kujuMoodustusviis);
                }
            }
            
            /**
             * Sets (as xml) the "kujuMoodustusviis" element
             */
            public void xsetKujuMoodustusviis(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType kujuMoodustusviis)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType)get_store().find_element_user(KUJUMOODUSTUSVIIS$18, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType)get_store().add_element_user(KUJUMOODUSTUSVIIS$18);
                    }
                    target.set(kujuMoodustusviis);
                }
            }
            
            /**
             * Unsets the "kujuMoodustusviis" element
             */
            public void unsetKujuMoodustusviis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(KUJUMOODUSTUSVIIS$18, 0);
                }
            }
            
            /**
             * Gets the "hooneAdsOid" element
             */
            public java.lang.String getHooneAdsOid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOONEADSOID$20, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "hooneAdsOid" element
             */
            public org.apache.xmlbeans.XmlString xgetHooneAdsOid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOONEADSOID$20, 0);
                    return target;
                }
            }
            
            /**
             * True if has "hooneAdsOid" element
             */
            public boolean isSetHooneAdsOid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(HOONEADSOID$20) != 0;
                }
            }
            
            /**
             * Sets the "hooneAdsOid" element
             */
            public void setHooneAdsOid(java.lang.String hooneAdsOid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOONEADSOID$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOONEADSOID$20);
                    }
                    target.setStringValue(hooneAdsOid);
                }
            }
            
            /**
             * Sets (as xml) the "hooneAdsOid" element
             */
            public void xsetHooneAdsOid(org.apache.xmlbeans.XmlString hooneAdsOid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOONEADSOID$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOONEADSOID$20);
                    }
                    target.set(hooneAdsOid);
                }
            }
            
            /**
             * Unsets the "hooneAdsOid" element
             */
            public void unsetHooneAdsOid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(HOONEADSOID$20, 0);
                }
            }
            
            /**
             * Gets the "hooneOrigTunnus" element
             */
            public java.lang.String getHooneOrigTunnus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOONEORIGTUNNUS$22, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "hooneOrigTunnus" element
             */
            public org.apache.xmlbeans.XmlString xgetHooneOrigTunnus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOONEORIGTUNNUS$22, 0);
                    return target;
                }
            }
            
            /**
             * True if has "hooneOrigTunnus" element
             */
            public boolean isSetHooneOrigTunnus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(HOONEORIGTUNNUS$22) != 0;
                }
            }
            
            /**
             * Sets the "hooneOrigTunnus" element
             */
            public void setHooneOrigTunnus(java.lang.String hooneOrigTunnus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOONEORIGTUNNUS$22, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOONEORIGTUNNUS$22);
                    }
                    target.setStringValue(hooneOrigTunnus);
                }
            }
            
            /**
             * Sets (as xml) the "hooneOrigTunnus" element
             */
            public void xsetHooneOrigTunnus(org.apache.xmlbeans.XmlString hooneOrigTunnus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOONEORIGTUNNUS$22, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOONEORIGTUNNUS$22);
                    }
                    target.set(hooneOrigTunnus);
                }
            }
            
            /**
             * Unsets the "hooneOrigTunnus" element
             */
            public void unsetHooneOrigTunnus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(HOONEORIGTUNNUS$22, 0);
                }
            }
            
            /**
             * Gets the "aadressid" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid getAadressid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid)get_store().find_element_user(AADRESSID$24, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "aadressid" element
             */
            public boolean isSetAadressid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AADRESSID$24) != 0;
                }
            }
            
            /**
             * Sets the "aadressid" element
             */
            public void setAadressid(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid aadressid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid)get_store().find_element_user(AADRESSID$24, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid)get_store().add_element_user(AADRESSID$24);
                    }
                    target.set(aadressid);
                }
            }
            
            /**
             * Appends and returns a new empty "aadressid" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid addNewAadressid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid)get_store().add_element_user(AADRESSID$24);
                    return target;
                }
            }
            
            /**
             * Unsets the "aadressid" element
             */
            public void unsetAadressid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AADRESSID$24, 0);
                }
            }
            /**
             * An XML aadressid(@).
             *
             * This is a complex type.
             */
            public static class AadressidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid
            {
                private static final long serialVersionUID = 1L;
                
                public AadressidImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName AADRESS$0 = 
                    new javax.xml.namespace.QName("", "aadress");
                
                
                /**
                 * Gets a List of "aadress" elements
                 */
                public java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress> getAadressList()
                {
                    final class AadressList extends java.util.AbstractList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress>
                    {
                      public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress get(int i)
                          { return AadressidImpl.this.getAadressArray(i); }
                      
                      public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress set(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress o)
                      {
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress old = AadressidImpl.this.getAadressArray(i);
                        AadressidImpl.this.setAadressArray(i, o);
                        return old;
                      }
                      
                      public void add(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress o)
                          { AadressidImpl.this.insertNewAadress(i).set(o); }
                      
                      public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress remove(int i)
                      {
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress old = AadressidImpl.this.getAadressArray(i);
                        AadressidImpl.this.removeAadress(i);
                        return old;
                      }
                      
                      public int size()
                          { return AadressidImpl.this.sizeOfAadressArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new AadressList();
                    }
                }
                
                /**
                 * Gets array of all "aadress" elements
                 * @deprecated
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress[] getAadressArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress> targetList = new java.util.ArrayList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress>();
                      get_store().find_all_element_users(AADRESS$0, targetList);
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress[] result = new ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "aadress" element
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress getAadressArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress)get_store().find_element_user(AADRESS$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "aadress" element
                 */
                public int sizeOfAadressArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(AADRESS$0);
                    }
                }
                
                /**
                 * Sets array of all "aadress" element
                 */
                public void setAadressArray(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress[] aadressArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(aadressArray, AADRESS$0);
                    }
                }
                
                /**
                 * Sets ith "aadress" element
                 */
                public void setAadressArray(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress aadress)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress)get_store().find_element_user(AADRESS$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(aadress);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "aadress" element
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress insertNewAadress(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress)get_store().insert_element_user(AADRESS$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "aadress" element
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress addNewAadress()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress)get_store().add_element_user(AADRESS$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "aadress" element
                 */
                public void removeAadress(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(AADRESS$0, i);
                    }
                }
                /**
                 * An XML aadress(@).
                 *
                 * This is a complex type.
                 */
                public static class AadressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress
                {
                    private static final long serialVersionUID = 1L;
                    
                    public AadressImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName ADSTASE1$0 = 
                      new javax.xml.namespace.QName("", "adsTase1");
                    private static final javax.xml.namespace.QName ADSTASE2$2 = 
                      new javax.xml.namespace.QName("", "adsTase2");
                    private static final javax.xml.namespace.QName ADSTASE3$4 = 
                      new javax.xml.namespace.QName("", "adsTase3");
                    private static final javax.xml.namespace.QName ADSTASE4$6 = 
                      new javax.xml.namespace.QName("", "adsTase4");
                    private static final javax.xml.namespace.QName ADSTASE5$8 = 
                      new javax.xml.namespace.QName("", "adsTase5");
                    private static final javax.xml.namespace.QName ADSTASE6$10 = 
                      new javax.xml.namespace.QName("", "adsTase6");
                    private static final javax.xml.namespace.QName ADSTASE7$12 = 
                      new javax.xml.namespace.QName("", "adsTase7");
                    private static final javax.xml.namespace.QName ADSTASE8$14 = 
                      new javax.xml.namespace.QName("", "adsTase8");
                    private static final javax.xml.namespace.QName PUNKTX$16 = 
                      new javax.xml.namespace.QName("", "punktX");
                    private static final javax.xml.namespace.QName PUNKTY$18 = 
                      new javax.xml.namespace.QName("", "punktY");
                    
                    
                    /**
                     * Gets the "adsTase1" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType getAdsTase1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().find_element_user(ADSTASE1$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "adsTase1" element
                     */
                    public boolean isSetAdsTase1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADSTASE1$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase1" element
                     */
                    public void setAdsTase1(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType adsTase1)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().find_element_user(ADSTASE1$0, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().add_element_user(ADSTASE1$0);
                        }
                        target.set(adsTase1);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase1" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType addNewAdsTase1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().add_element_user(ADSTASE1$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "adsTase1" element
                     */
                    public void unsetAdsTase1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADSTASE1$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase2" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType getAdsTase2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().find_element_user(ADSTASE2$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "adsTase2" element
                     */
                    public boolean isSetAdsTase2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADSTASE2$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase2" element
                     */
                    public void setAdsTase2(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType adsTase2)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().find_element_user(ADSTASE2$2, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().add_element_user(ADSTASE2$2);
                        }
                        target.set(adsTase2);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase2" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType addNewAdsTase2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().add_element_user(ADSTASE2$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "adsTase2" element
                     */
                    public void unsetAdsTase2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADSTASE2$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase3" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType getAdsTase3()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().find_element_user(ADSTASE3$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "adsTase3" element
                     */
                    public boolean isSetAdsTase3()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADSTASE3$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase3" element
                     */
                    public void setAdsTase3(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType adsTase3)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().find_element_user(ADSTASE3$4, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().add_element_user(ADSTASE3$4);
                        }
                        target.set(adsTase3);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase3" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType addNewAdsTase3()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType)get_store().add_element_user(ADSTASE3$4);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "adsTase3" element
                     */
                    public void unsetAdsTase3()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADSTASE3$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase4" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase4()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE4$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "adsTase4" element
                     */
                    public boolean isSetAdsTase4()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADSTASE4$6) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase4" element
                     */
                    public void setAdsTase4(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase4)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE4$6, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE4$6);
                        }
                        target.set(adsTase4);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase4" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase4()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE4$6);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "adsTase4" element
                     */
                    public void unsetAdsTase4()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADSTASE4$6, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase5" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase5()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE5$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "adsTase5" element
                     */
                    public boolean isSetAdsTase5()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADSTASE5$8) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase5" element
                     */
                    public void setAdsTase5(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase5)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE5$8, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE5$8);
                        }
                        target.set(adsTase5);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase5" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase5()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE5$8);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "adsTase5" element
                     */
                    public void unsetAdsTase5()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADSTASE5$8, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase6" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase6()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE6$10, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "adsTase6" element
                     */
                    public boolean isSetAdsTase6()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADSTASE6$10) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase6" element
                     */
                    public void setAdsTase6(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase6)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE6$10, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE6$10);
                        }
                        target.set(adsTase6);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase6" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase6()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE6$10);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "adsTase6" element
                     */
                    public void unsetAdsTase6()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADSTASE6$10, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase7" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase7()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE7$12, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "adsTase7" element
                     */
                    public boolean isSetAdsTase7()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADSTASE7$12) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase7" element
                     */
                    public void setAdsTase7(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase7)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE7$12, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE7$12);
                        }
                        target.set(adsTase7);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase7" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase7()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE7$12);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "adsTase7" element
                     */
                    public void unsetAdsTase7()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADSTASE7$12, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase8" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase8()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE8$14, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "adsTase8" element
                     */
                    public boolean isSetAdsTase8()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADSTASE8$14) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase8" element
                     */
                    public void setAdsTase8(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase8)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE8$14, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE8$14);
                        }
                        target.set(adsTase8);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase8" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase8()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE8$14);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "adsTase8" element
                     */
                    public void unsetAdsTase8()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADSTASE8$14, 0);
                      }
                    }
                    
                    /**
                     * Gets the "punktX" element
                     */
                    public double getPunktX()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNKTX$16, 0);
                        if (target == null)
                        {
                          return 0.0;
                        }
                        return target.getDoubleValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "punktX" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordxType xgetPunktX()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordxType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordxType)get_store().find_element_user(PUNKTX$16, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "punktX" element
                     */
                    public boolean isSetPunktX()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(PUNKTX$16) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "punktX" element
                     */
                    public void setPunktX(double punktX)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNKTX$16, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUNKTX$16);
                        }
                        target.setDoubleValue(punktX);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "punktX" element
                     */
                    public void xsetPunktX(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordxType punktX)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordxType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordxType)get_store().find_element_user(PUNKTX$16, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordxType)get_store().add_element_user(PUNKTX$16);
                        }
                        target.set(punktX);
                      }
                    }
                    
                    /**
                     * Unsets the "punktX" element
                     */
                    public void unsetPunktX()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(PUNKTX$16, 0);
                      }
                    }
                    
                    /**
                     * Gets the "punktY" element
                     */
                    public double getPunktY()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNKTY$18, 0);
                        if (target == null)
                        {
                          return 0.0;
                        }
                        return target.getDoubleValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "punktY" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordyType xgetPunktY()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordyType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordyType)get_store().find_element_user(PUNKTY$18, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "punktY" element
                     */
                    public boolean isSetPunktY()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(PUNKTY$18) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "punktY" element
                     */
                    public void setPunktY(double punktY)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNKTY$18, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUNKTY$18);
                        }
                        target.setDoubleValue(punktY);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "punktY" element
                     */
                    public void xsetPunktY(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordyType punktY)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordyType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordyType)get_store().find_element_user(PUNKTY$18, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordyType)get_store().add_element_user(PUNKTY$18);
                        }
                        target.set(punktY);
                      }
                    }
                    
                    /**
                     * Unsets the "punktY" element
                     */
                    public void unsetPunktY()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(PUNKTY$18, 0);
                      }
                    }
                }
            }
        }
    }
}
