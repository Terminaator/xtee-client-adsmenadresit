/*
 * XML Type:  kujuGeomeetriaFormaatType
 * Namespace: http://www.maaamet.ee
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet;


/**
 * An XML kujuGeomeetriaFormaatType(@http://www.maaamet.ee).
 *
 * This is an atomic type that is a restriction of ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType.
 */
public interface KujuGeomeetriaFormaatType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KujuGeomeetriaFormaatType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s39E58D991472BE4B7CFAB063BB7BE25A").resolveHandle("kujugeomeetriaformaattype41c9type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum WKT = Enum.forString("WKT");
    static final Enum GML = Enum.forString("GML");
    static final Enum GEO_JSON = Enum.forString("GeoJSON");
    
    static final int INT_WKT = Enum.INT_WKT;
    static final int INT_GML = Enum.INT_GML;
    static final int INT_GEO_JSON = Enum.INT_GEO_JSON;
    
    /**
     * Enumeration value class for ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_WKT
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
        
        static final int INT_WKT = 1;
        static final int INT_GML = 2;
        static final int INT_GEO_JSON = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("WKT", INT_WKT),
                new Enum("GML", INT_GML),
                new Enum("GeoJSON", INT_GEO_JSON),
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
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType newValue(java.lang.Object obj) {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) type.newValue( obj ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType newInstance() {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.KujuGeomeetriaFormaatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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