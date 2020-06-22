/*
 * XML Type:  XRoadSecurityServerIdentifierType
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers;


/**
 * An XML XRoadSecurityServerIdentifierType(@http://x-road.eu/xsd/identifiers).
 *
 * This is a complex type.
 */
public interface XRoadSecurityServerIdentifierType extends ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadIdentifierType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XRoadSecurityServerIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s39E58D991472BE4B7CFAB063BB7BE25A").resolveHandle("xroadsecurityserveridentifiertype0617type");
    
    /**
     * Gets the "xRoadInstance" element
     */
    java.lang.String getXRoadInstance();
    
    /**
     * Gets (as xml) the "xRoadInstance" element
     */
    org.apache.xmlbeans.XmlString xgetXRoadInstance();
    
    /**
     * True if has "xRoadInstance" element
     */
    boolean isSetXRoadInstance();
    
    /**
     * Sets the "xRoadInstance" element
     */
    void setXRoadInstance(java.lang.String xRoadInstance);
    
    /**
     * Sets (as xml) the "xRoadInstance" element
     */
    void xsetXRoadInstance(org.apache.xmlbeans.XmlString xRoadInstance);
    
    /**
     * Unsets the "xRoadInstance" element
     */
    void unsetXRoadInstance();
    
    /**
     * Gets the "memberClass" element
     */
    java.lang.String getMemberClass();
    
    /**
     * Gets (as xml) the "memberClass" element
     */
    org.apache.xmlbeans.XmlString xgetMemberClass();
    
    /**
     * True if has "memberClass" element
     */
    boolean isSetMemberClass();
    
    /**
     * Sets the "memberClass" element
     */
    void setMemberClass(java.lang.String memberClass);
    
    /**
     * Sets (as xml) the "memberClass" element
     */
    void xsetMemberClass(org.apache.xmlbeans.XmlString memberClass);
    
    /**
     * Unsets the "memberClass" element
     */
    void unsetMemberClass();
    
    /**
     * Gets the "memberCode" element
     */
    java.lang.String getMemberCode();
    
    /**
     * Gets (as xml) the "memberCode" element
     */
    org.apache.xmlbeans.XmlString xgetMemberCode();
    
    /**
     * True if has "memberCode" element
     */
    boolean isSetMemberCode();
    
    /**
     * Sets the "memberCode" element
     */
    void setMemberCode(java.lang.String memberCode);
    
    /**
     * Sets (as xml) the "memberCode" element
     */
    void xsetMemberCode(org.apache.xmlbeans.XmlString memberCode);
    
    /**
     * Unsets the "memberCode" element
     */
    void unsetMemberCode();
    
    /**
     * Gets the "serverCode" element
     */
    java.lang.String getServerCode();
    
    /**
     * Gets (as xml) the "serverCode" element
     */
    org.apache.xmlbeans.XmlString xgetServerCode();
    
    /**
     * True if has "serverCode" element
     */
    boolean isSetServerCode();
    
    /**
     * Sets the "serverCode" element
     */
    void setServerCode(java.lang.String serverCode);
    
    /**
     * Sets (as xml) the "serverCode" element
     */
    void xsetServerCode(org.apache.xmlbeans.XmlString serverCode);
    
    /**
     * Unsets the "serverCode" element
     */
    void unsetServerCode();
    
    /**
     * Gets the "objectType" attribute
     */
    ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType.Enum getObjectType();
    
    /**
     * Gets (as xml) the "objectType" attribute
     */
    ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType xgetObjectType();
    
    /**
     * Sets the "objectType" attribute
     */
    void setObjectType(ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType.Enum objectType);
    
    /**
     * Sets (as xml) the "objectType" attribute
     */
    void xsetObjectType(ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadObjectType objectType);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType newInstance() {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadSecurityServerIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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