/*
 * XML Type:  ADSmenadresitParingType
 * Namespace: http://www.maaamet.ee
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet;


/**
 * An XML ADSmenadresitParingType(@http://www.maaamet.ee).
 *
 * This is a complex type.
 */
public interface ADSmenadresitParingType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ADSmenadresitParingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDAA038902D6383D650A740D0012D3547").resolveHandle("adsmenadresitparingtypeecc3type");
    
    /**
     * Gets the "esitajaKood" element
     */
    @com.nortal.jroad.model.XRoadElement(title="Esitaja kood", sequence=1)
    java.lang.String getEsitajaKood();
    
    /**
     * Gets (as xml) the "esitajaKood" element
     */
    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.EsitajakoodType xgetEsitajaKood();
    
    /**
     * True if has "esitajaKood" element
     */
    boolean isSetEsitajaKood();
    
    /**
     * Sets the "esitajaKood" element
     */
    void setEsitajaKood(java.lang.String esitajaKood);
    
    /**
     * Sets (as xml) the "esitajaKood" element
     */
    void xsetEsitajaKood(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.EsitajakoodType esitajaKood);
    
    /**
     * Unsets the "esitajaKood" element
     */
    void unsetEsitajaKood();
    
    /**
     * Gets the "menetlejaNimi" element
     */
    @com.nortal.jroad.model.XRoadElement(title="Menetleja nimi", sequence=2)
    java.lang.String getMenetlejaNimi();
    
    /**
     * Gets (as xml) the "menetlejaNimi" element
     */
    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.MenetlejanimiType xgetMenetlejaNimi();
    
    /**
     * True if has "menetlejaNimi" element
     */
    boolean isSetMenetlejaNimi();
    
    /**
     * Sets the "menetlejaNimi" element
     */
    void setMenetlejaNimi(java.lang.String menetlejaNimi);
    
    /**
     * Sets (as xml) the "menetlejaNimi" element
     */
    void xsetMenetlejaNimi(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.MenetlejanimiType menetlejaNimi);
    
    /**
     * Unsets the "menetlejaNimi" element
     */
    void unsetMenetlejaNimi();
    
    /**
     * Gets the "ainultKontroll" element
     */
    @com.nortal.jroad.model.XRoadElement(title="Menetlust ei jõustata, vaid kustutatakse menetlus pärast kontrollide teostamist", sequence=3)
    boolean getAinultKontroll();
    
    /**
     * Gets (as xml) the "ainultKontroll" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAinultKontroll();
    
    /**
     * Sets the "ainultKontroll" element
     */
    void setAinultKontroll(boolean ainultKontroll);
    
    /**
     * Sets (as xml) the "ainultKontroll" element
     */
    void xsetAinultKontroll(org.apache.xmlbeans.XmlBoolean ainultKontroll);
    
    /**
     * Gets the "menetlusNr" element
     */
    @com.nortal.jroad.model.XRoadElement(title="Menetluse number", sequence=4)
    java.math.BigInteger getMenetlusNr();
    
    /**
     * Gets (as xml) the "menetlusNr" element
     */
    org.apache.xmlbeans.XmlInteger xgetMenetlusNr();
    
    /**
     * True if has "menetlusNr" element
     */
    boolean isSetMenetlusNr();
    
    /**
     * Sets the "menetlusNr" element
     */
    void setMenetlusNr(java.math.BigInteger menetlusNr);
    
    /**
     * Sets (as xml) the "menetlusNr" element
     */
    void xsetMenetlusNr(org.apache.xmlbeans.XmlInteger menetlusNr);
    
    /**
     * Unsets the "menetlusNr" element
     */
    void unsetMenetlusNr();
    
    /**
     * Gets the "ruumiAndmeteFormaat" element
     */
    @com.nortal.jroad.model.XRoadElement(title="Millises formaadis tagastada objekti kuju geomeetria", sequence=5)
    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType.Enum getRuumiAndmeteFormaat();
    
    /**
     * Gets (as xml) the "ruumiAndmeteFormaat" element
     */
    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType xgetRuumiAndmeteFormaat();
    
    /**
     * True if has "ruumiAndmeteFormaat" element
     */
    boolean isSetRuumiAndmeteFormaat();
    
    /**
     * Sets the "ruumiAndmeteFormaat" element
     */
    void setRuumiAndmeteFormaat(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType.Enum ruumiAndmeteFormaat);
    
    /**
     * Sets (as xml) the "ruumiAndmeteFormaat" element
     */
    void xsetRuumiAndmeteFormaat(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType ruumiAndmeteFormaat);
    
    /**
     * Unsets the "ruumiAndmeteFormaat" element
     */
    void unsetRuumiAndmeteFormaat();
    
    /**
     * Gets the "objektid" element
     */
    @com.nortal.jroad.model.XRoadElement(title="Objektid", sequence=6)
    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid getObjektid();
    
    /**
     * True if has "objektid" element
     */
    boolean isSetObjektid();
    
    /**
     * Sets the "objektid" element
     */
    void setObjektid(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid objektid);
    
    /**
     * Appends and returns a new empty "objektid" element
     */
    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid addNewObjektid();
    
    /**
     * Unsets the "objektid" element
     */
    void unsetObjektid();
    
    /**
     * An XML objektid(@).
     *
     * This is a complex type.
     */
    public interface Objektid extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Objektid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDAA038902D6383D650A740D0012D3547").resolveHandle("objektid7ae1elemtype");
        
        /**
         * Gets a List of "menobjekt" elements
         */
        @com.nortal.jroad.model.XRoadElement(title="Menobjekt", sequence=1)
        java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt> getMenobjektList();
        
        /**
         * Gets array of all "menobjekt" elements
         * @deprecated
         */
        @com.nortal.jroad.model.XRoadElement(title="Menobjekt", sequence=1)
        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt[] getMenobjektArray();
        
        /**
         * Gets ith "menobjekt" element
         */
        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt getMenobjektArray(int i);
        
        /**
         * Returns number of "menobjekt" element
         */
        int sizeOfMenobjektArray();
        
        /**
         * Sets array of all "menobjekt" element
         */
        void setMenobjektArray(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt[] menobjektArray);
        
        /**
         * Sets ith "menobjekt" element
         */
        void setMenobjektArray(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt menobjekt);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "menobjekt" element
         */
        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt insertNewMenobjekt(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "menobjekt" element
         */
        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt addNewMenobjekt();
        
        /**
         * Removes the ith "menobjekt" element
         */
        void removeMenobjekt(int i);
        
        /**
         * An XML menobjekt(@).
         *
         * This is a complex type.
         */
        public interface Menobjekt extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Menobjekt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDAA038902D6383D650A740D0012D3547").resolveHandle("menobjekt4138elemtype");
            
            /**
             * Gets the "objektiLiik" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Objekti liik", sequence=1)
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator.Enum getObjektiLiik();
            
            /**
             * Gets (as xml) the "objektiLiik" element
             */
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator xgetObjektiLiik();
            
            /**
             * Sets the "objektiLiik" element
             */
            void setObjektiLiik(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator.Enum objektiLiik);
            
            /**
             * Sets (as xml) the "objektiLiik" element
             */
            void xsetObjektiLiik(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator objektiLiik);
            
            /**
             * Gets the "adsOid" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Objekti tunnus ADS süsteemis", sequence=2)
            java.lang.String getAdsOid();
            
            /**
             * Gets (as xml) the "adsOid" element
             */
            org.apache.xmlbeans.XmlString xgetAdsOid();
            
            /**
             * True if has "adsOid" element
             */
            boolean isSetAdsOid();
            
            /**
             * Sets the "adsOid" element
             */
            void setAdsOid(java.lang.String adsOid);
            
            /**
             * Sets (as xml) the "adsOid" element
             */
            void xsetAdsOid(org.apache.xmlbeans.XmlString adsOid);
            
            /**
             * Unsets the "adsOid" element
             */
            void unsetAdsOid();
            
            /**
             * Gets the "origTunnus" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Objekti tunnus päritoluregistris", sequence=3)
            java.lang.String getOrigTunnus();
            
            /**
             * Gets (as xml) the "origTunnus" element
             */
            org.apache.xmlbeans.XmlString xgetOrigTunnus();
            
            /**
             * Sets the "origTunnus" element
             */
            void setOrigTunnus(java.lang.String origTunnus);
            
            /**
             * Sets (as xml) the "origTunnus" element
             */
            void xsetOrigTunnus(org.apache.xmlbeans.XmlString origTunnus);
            
            /**
             * Gets the "oiguslikAlus" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Objekti versiooni tekkimise või tühistamise õiguslik alus", sequence=4)
            java.lang.String getOiguslikAlus();
            
            /**
             * Gets (as xml) the "oiguslikAlus" element
             */
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.OiguslikalusType xgetOiguslikAlus();
            
            /**
             * True if has "oiguslikAlus" element
             */
            boolean isSetOiguslikAlus();
            
            /**
             * Sets the "oiguslikAlus" element
             */
            void setOiguslikAlus(java.lang.String oiguslikAlus);
            
            /**
             * Sets (as xml) the "oiguslikAlus" element
             */
            void xsetOiguslikAlus(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.OiguslikalusType oiguslikAlus);
            
            /**
             * Unsets the "oiguslikAlus" element
             */
            void unsetOiguslikAlus();
            
            /**
             * Gets the "aluseKuupaev" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Õigusliku aluse kuupäev", sequence=5)
            java.util.Calendar getAluseKuupaev();
            
            /**
             * Gets (as xml) the "aluseKuupaev" element
             */
            org.apache.xmlbeans.XmlDate xgetAluseKuupaev();
            
            /**
             * True if has "aluseKuupaev" element
             */
            boolean isSetAluseKuupaev();
            
            /**
             * Sets the "aluseKuupaev" element
             */
            void setAluseKuupaev(java.util.Calendar aluseKuupaev);
            
            /**
             * Sets (as xml) the "aluseKuupaev" element
             */
            void xsetAluseKuupaev(org.apache.xmlbeans.XmlDate aluseKuupaev);
            
            /**
             * Unsets the "aluseKuupaev" element
             */
            void unsetAluseKuupaev();
            
            /**
             * Gets the "olek" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Olek", sequence=6)
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType.Enum getOlek();
            
            /**
             * Gets (as xml) the "olek" element
             */
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType xgetOlek();
            
            /**
             * Sets the "olek" element
             */
            void setOlek(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType.Enum olek);
            
            /**
             * Sets (as xml) the "olek" element
             */
            void xsetOlek(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType olek);
            
            /**
             * Gets the "tahis" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Hoone osa korral tähis, hoone korral üldnimetus", sequence=7)
            java.lang.String getTahis();
            
            /**
             * Gets (as xml) the "tahis" element
             */
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.TahisType xgetTahis();
            
            /**
             * True if has "tahis" element
             */
            boolean isSetTahis();
            
            /**
             * Sets the "tahis" element
             */
            void setTahis(java.lang.String tahis);
            
            /**
             * Sets (as xml) the "tahis" element
             */
            void xsetTahis(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.TahisType tahis);
            
            /**
             * Unsets the "tahis" element
             */
            void unsetTahis();
            
            /**
             * Gets the "korrus" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Hoone osa korral sissepääsu korrus", sequence=8)
            java.math.BigInteger getKorrus();
            
            /**
             * Gets (as xml) the "korrus" element
             */
            org.apache.xmlbeans.XmlInteger xgetKorrus();
            
            /**
             * True if has "korrus" element
             */
            boolean isSetKorrus();
            
            /**
             * Sets the "korrus" element
             */
            void setKorrus(java.math.BigInteger korrus);
            
            /**
             * Sets (as xml) the "korrus" element
             */
            void xsetKorrus(org.apache.xmlbeans.XmlInteger korrus);
            
            /**
             * Unsets the "korrus" element
             */
            void unsetKorrus();
            
            /**
             * Gets the "ruumiKuju" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Objekti ruumikuju", sequence=9)
            java.lang.String getRuumiKuju();
            
            /**
             * Gets (as xml) the "ruumiKuju" element
             */
            org.apache.xmlbeans.XmlString xgetRuumiKuju();
            
            /**
             * True if has "ruumiKuju" element
             */
            boolean isSetRuumiKuju();
            
            /**
             * Sets the "ruumiKuju" element
             */
            void setRuumiKuju(java.lang.String ruumiKuju);
            
            /**
             * Sets (as xml) the "ruumiKuju" element
             */
            void xsetRuumiKuju(org.apache.xmlbeans.XmlString ruumiKuju);
            
            /**
             * Unsets the "ruumiKuju" element
             */
            void unsetRuumiKuju();
            
            /**
             * Gets the "kujuMoodustusviis" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Kuju moodustusviis", sequence=10)
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType.Enum getKujuMoodustusviis();
            
            /**
             * Gets (as xml) the "kujuMoodustusviis" element
             */
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType xgetKujuMoodustusviis();
            
            /**
             * True if has "kujuMoodustusviis" element
             */
            boolean isSetKujuMoodustusviis();
            
            /**
             * Sets the "kujuMoodustusviis" element
             */
            void setKujuMoodustusviis(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType.Enum kujuMoodustusviis);
            
            /**
             * Sets (as xml) the "kujuMoodustusviis" element
             */
            void xsetKujuMoodustusviis(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType kujuMoodustusviis);
            
            /**
             * Unsets the "kujuMoodustusviis" element
             */
            void unsetKujuMoodustusviis();
            
            /**
             * Gets the "hooneAdsOid" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Viide hoone ADS_OID väärtusele", sequence=11)
            java.lang.String getHooneAdsOid();
            
            /**
             * Gets (as xml) the "hooneAdsOid" element
             */
            org.apache.xmlbeans.XmlString xgetHooneAdsOid();
            
            /**
             * True if has "hooneAdsOid" element
             */
            boolean isSetHooneAdsOid();
            
            /**
             * Sets the "hooneAdsOid" element
             */
            void setHooneAdsOid(java.lang.String hooneAdsOid);
            
            /**
             * Sets (as xml) the "hooneAdsOid" element
             */
            void xsetHooneAdsOid(org.apache.xmlbeans.XmlString hooneAdsOid);
            
            /**
             * Unsets the "hooneAdsOid" element
             */
            void unsetHooneAdsOid();
            
            /**
             * Gets the "hooneOrigTunnus" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Viide hoone tunnusele, mille osaga on tegemist", sequence=12)
            java.lang.String getHooneOrigTunnus();
            
            /**
             * Gets (as xml) the "hooneOrigTunnus" element
             */
            org.apache.xmlbeans.XmlString xgetHooneOrigTunnus();
            
            /**
             * True if has "hooneOrigTunnus" element
             */
            boolean isSetHooneOrigTunnus();
            
            /**
             * Sets the "hooneOrigTunnus" element
             */
            void setHooneOrigTunnus(java.lang.String hooneOrigTunnus);
            
            /**
             * Sets (as xml) the "hooneOrigTunnus" element
             */
            void xsetHooneOrigTunnus(org.apache.xmlbeans.XmlString hooneOrigTunnus);
            
            /**
             * Unsets the "hooneOrigTunnus" element
             */
            void unsetHooneOrigTunnus();
            
            /**
             * Gets the "aadressid" element
             */
            @com.nortal.jroad.model.XRoadElement(title="Aadressid", sequence=13)
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid getAadressid();
            
            /**
             * True if has "aadressid" element
             */
            boolean isSetAadressid();
            
            /**
             * Sets the "aadressid" element
             */
            void setAadressid(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid aadressid);
            
            /**
             * Appends and returns a new empty "aadressid" element
             */
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid addNewAadressid();
            
            /**
             * Unsets the "aadressid" element
             */
            void unsetAadressid();
            
            /**
             * An XML aadressid(@).
             *
             * This is a complex type.
             */
            public interface Aadressid extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Aadressid.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDAA038902D6383D650A740D0012D3547").resolveHandle("aadressidc58aelemtype");
                
                /**
                 * Gets a List of "aadress" elements
                 */
                @com.nortal.jroad.model.XRoadElement(title="Aadress", sequence=1)
                java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress> getAadressList();
                
                /**
                 * Gets array of all "aadress" elements
                 * @deprecated
                 */
                @com.nortal.jroad.model.XRoadElement(title="Aadress", sequence=1)
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress[] getAadressArray();
                
                /**
                 * Gets ith "aadress" element
                 */
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress getAadressArray(int i);
                
                /**
                 * Returns number of "aadress" element
                 */
                int sizeOfAadressArray();
                
                /**
                 * Sets array of all "aadress" element
                 */
                void setAadressArray(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress[] aadressArray);
                
                /**
                 * Sets ith "aadress" element
                 */
                void setAadressArray(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress aadress);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "aadress" element
                 */
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress insertNewAadress(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "aadress" element
                 */
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress addNewAadress();
                
                /**
                 * Removes the ith "aadress" element
                 */
                void removeAadress(int i);
                
                /**
                 * An XML aadress(@).
                 *
                 * This is a complex type.
                 */
                public interface Aadress extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Aadress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDAA038902D6383D650A740D0012D3547").resolveHandle("aadress9817elemtype");
                    
                    /**
                     * Gets the "adsTase1" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Tase 1", sequence=1)
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType getAdsTase1();
                    
                    /**
                     * True if has "adsTase1" element
                     */
                    boolean isSetAdsTase1();
                    
                    /**
                     * Sets the "adsTase1" element
                     */
                    void setAdsTase1(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType adsTase1);
                    
                    /**
                     * Appends and returns a new empty "adsTase1" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType addNewAdsTase1();
                    
                    /**
                     * Unsets the "adsTase1" element
                     */
                    void unsetAdsTase1();
                    
                    /**
                     * Gets the "adsTase2" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Tase 2", sequence=2)
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType getAdsTase2();
                    
                    /**
                     * True if has "adsTase2" element
                     */
                    boolean isSetAdsTase2();
                    
                    /**
                     * Sets the "adsTase2" element
                     */
                    void setAdsTase2(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType adsTase2);
                    
                    /**
                     * Appends and returns a new empty "adsTase2" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType addNewAdsTase2();
                    
                    /**
                     * Unsets the "adsTase2" element
                     */
                    void unsetAdsTase2();
                    
                    /**
                     * Gets the "adsTase3" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Tase 3", sequence=3)
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType getAdsTase3();
                    
                    /**
                     * True if has "adsTase3" element
                     */
                    boolean isSetAdsTase3();
                    
                    /**
                     * Sets the "adsTase3" element
                     */
                    void setAdsTase3(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType adsTase3);
                    
                    /**
                     * Appends and returns a new empty "adsTase3" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseSimpleType addNewAdsTase3();
                    
                    /**
                     * Unsets the "adsTase3" element
                     */
                    void unsetAdsTase3();
                    
                    /**
                     * Gets the "adsTase4" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Tase 4", sequence=4)
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase4();
                    
                    /**
                     * True if has "adsTase4" element
                     */
                    boolean isSetAdsTase4();
                    
                    /**
                     * Sets the "adsTase4" element
                     */
                    void setAdsTase4(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase4);
                    
                    /**
                     * Appends and returns a new empty "adsTase4" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase4();
                    
                    /**
                     * Unsets the "adsTase4" element
                     */
                    void unsetAdsTase4();
                    
                    /**
                     * Gets the "adsTase5" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Tase 5", sequence=5)
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase5();
                    
                    /**
                     * True if has "adsTase5" element
                     */
                    boolean isSetAdsTase5();
                    
                    /**
                     * Sets the "adsTase5" element
                     */
                    void setAdsTase5(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase5);
                    
                    /**
                     * Appends and returns a new empty "adsTase5" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase5();
                    
                    /**
                     * Unsets the "adsTase5" element
                     */
                    void unsetAdsTase5();
                    
                    /**
                     * Gets the "adsTase6" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Tase 6", sequence=6)
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase6();
                    
                    /**
                     * True if has "adsTase6" element
                     */
                    boolean isSetAdsTase6();
                    
                    /**
                     * Sets the "adsTase6" element
                     */
                    void setAdsTase6(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase6);
                    
                    /**
                     * Appends and returns a new empty "adsTase6" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase6();
                    
                    /**
                     * Unsets the "adsTase6" element
                     */
                    void unsetAdsTase6();
                    
                    /**
                     * Gets the "adsTase7" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Tase 7", sequence=7)
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase7();
                    
                    /**
                     * True if has "adsTase7" element
                     */
                    boolean isSetAdsTase7();
                    
                    /**
                     * Sets the "adsTase7" element
                     */
                    void setAdsTase7(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase7);
                    
                    /**
                     * Appends and returns a new empty "adsTase7" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase7();
                    
                    /**
                     * Unsets the "adsTase7" element
                     */
                    void unsetAdsTase7();
                    
                    /**
                     * Gets the "adsTase8" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Tase 8", sequence=8)
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase8();
                    
                    /**
                     * True if has "adsTase8" element
                     */
                    boolean isSetAdsTase8();
                    
                    /**
                     * Sets the "adsTase8" element
                     */
                    void setAdsTase8(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase8);
                    
                    /**
                     * Appends and returns a new empty "adsTase8" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase8();
                    
                    /**
                     * Unsets the "adsTase8" element
                     */
                    void unsetAdsTase8();
                    
                    /**
                     * Gets the "punktX" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Aadressipunkti x-koordinaat L-Est süsteemis", sequence=9)
                    double getPunktX();
                    
                    /**
                     * Gets (as xml) the "punktX" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordxType xgetPunktX();
                    
                    /**
                     * True if has "punktX" element
                     */
                    boolean isSetPunktX();
                    
                    /**
                     * Sets the "punktX" element
                     */
                    void setPunktX(double punktX);
                    
                    /**
                     * Sets (as xml) the "punktX" element
                     */
                    void xsetPunktX(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordxType punktX);
                    
                    /**
                     * Unsets the "punktX" element
                     */
                    void unsetPunktX();
                    
                    /**
                     * Gets the "punktY" element
                     */
                    @com.nortal.jroad.model.XRoadElement(title="Aadressipunkti y-koordinaat L-Est süsteemis", sequence=10)
                    double getPunktY();
                    
                    /**
                     * Gets (as xml) the "punktY" element
                     */
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordyType xgetPunktY();
                    
                    /**
                     * True if has "punktY" element
                     */
                    boolean isSetPunktY();
                    
                    /**
                     * Sets the "punktY" element
                     */
                    void setPunktY(double punktY);
                    
                    /**
                     * Sets (as xml) the "punktY" element
                     */
                    void xsetPunktY(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KoordyType punktY);
                    
                    /**
                     * Unsets the "punktY" element
                     */
                    void unsetPunktY();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress newInstance() {
                        return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid.Aadress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid newInstance() {
                      return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt.Aadressid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt newInstance() {
                  return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid.Menobjekt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid newInstance() {
              return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType.Objektid) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType newInstance() {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
//comment out artifacts from xmlbeans