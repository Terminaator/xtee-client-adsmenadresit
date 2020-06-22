/*
 * XML Type:  adsobjliikKlassifikaator
 * Namespace: http://www.maaamet.ee
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet;


/**
 * An XML adsobjliikKlassifikaator(@http://www.maaamet.ee).
 *
 * This is an atomic type that is a restriction of ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator.
 */
public interface AdsobjliikKlassifikaator extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdsobjliikKlassifikaator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s39E58D991472BE4B7CFAB063BB7BE25A").resolveHandle("adsobjliikklassifikaatord2b6type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AY = Enum.forString("AY");
    static final Enum CU = Enum.forString("CU");
    static final Enum EE = Enum.forString("EE");
    static final Enum ER = Enum.forString("ER");
    static final Enum KN = Enum.forString("KN");
    static final Enum LO = Enum.forString("LO");
    static final Enum LP = Enum.forString("LP");
    static final Enum ME = Enum.forString("ME");
    static final Enum MK = Enum.forString("MK");
    static final Enum MR = Enum.forString("MR");
    static final Enum OV = Enum.forString("OV");
    static final Enum TT = Enum.forString("TT");
    static final Enum VK = Enum.forString("VK");
    
    static final int INT_AY = Enum.INT_AY;
    static final int INT_CU = Enum.INT_CU;
    static final int INT_EE = Enum.INT_EE;
    static final int INT_ER = Enum.INT_ER;
    static final int INT_KN = Enum.INT_KN;
    static final int INT_LO = Enum.INT_LO;
    static final int INT_LP = Enum.INT_LP;
    static final int INT_ME = Enum.INT_ME;
    static final int INT_MK = Enum.INT_MK;
    static final int INT_MR = Enum.INT_MR;
    static final int INT_OV = Enum.INT_OV;
    static final int INT_TT = Enum.INT_TT;
    static final int INT_VK = Enum.INT_VK;
    
    /**
     * Enumeration value class for ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AY
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_AY = 1;
        static final int INT_CU = 2;
        static final int INT_EE = 3;
        static final int INT_ER = 4;
        static final int INT_KN = 5;
        static final int INT_LO = 6;
        static final int INT_LP = 7;
        static final int INT_ME = 8;
        static final int INT_MK = 9;
        static final int INT_MR = 10;
        static final int INT_OV = 11;
        static final int INT_TT = 12;
        static final int INT_VK = 13;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("AY", INT_AY),
                new Enum("CU", INT_CU),
                new Enum("EE", INT_EE),
                new Enum("ER", INT_ER),
                new Enum("KN", INT_KN),
                new Enum("LO", INT_LO),
                new Enum("LP", INT_LP),
                new Enum("ME", INT_ME),
                new Enum("MK", INT_MK),
                new Enum("MR", INT_MR),
                new Enum("OV", INT_OV),
                new Enum("TT", INT_TT),
                new Enum("VK", INT_VK),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator newValue(java.lang.Object obj) {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) type.newValue( obj ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator newInstance() {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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