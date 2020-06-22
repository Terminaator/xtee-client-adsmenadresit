/*
 * XML Type:  XRoadGlobalGroupIdentifierType
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers;


/**
 * An XML XRoadGlobalGroupIdentifierType(@http://x-road.eu/xsd/identifiers).
 *
 * This is a complex type.
 */
public interface XRoadGlobalGroupIdentifierType extends ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadIdentifierType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XRoadGlobalGroupIdentifierType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s39E58D991472BE4B7CFAB063BB7BE25A").resolveHandle("xroadglobalgroupidentifiertype91bctype");
    
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
     * Gets the "groupCode" element
     */
    java.lang.String getGroupCode();
    
    /**
     * Gets (as xml) the "groupCode" element
     */
    org.apache.xmlbeans.XmlString xgetGroupCode();
    
    /**
     * True if has "groupCode" element
     */
    boolean isSetGroupCode();
    
    /**
     * Sets the "groupCode" element
     */
    void setGroupCode(java.lang.String groupCode);
    
    /**
     * Sets (as xml) the "groupCode" element
     */
    void xsetGroupCode(org.apache.xmlbeans.XmlString groupCode);
    
    /**
     * Unsets the "groupCode" element
     */
    void unsetGroupCode();
    
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
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType newInstance() {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.XRoadGlobalGroupIdentifierType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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