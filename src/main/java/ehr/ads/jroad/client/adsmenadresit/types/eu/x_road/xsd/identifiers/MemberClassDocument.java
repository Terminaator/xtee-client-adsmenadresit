/*
 * An XML document type.
 * Localname: memberClass
 * Namespace: http://x-road.eu/xsd/identifiers
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers;


/**
 * A document containing one memberClass(@http://x-road.eu/xsd/identifiers) element.
 *
 * This is a complex type.
 */
public interface MemberClassDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MemberClassDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s39E58D991472BE4B7CFAB063BB7BE25A").resolveHandle("memberclass4aa7doctype");
    
    /**
     * Gets the "memberClass" element
     */
    java.lang.String getMemberClass();
    
    /**
     * Gets (as xml) the "memberClass" element
     */
    org.apache.xmlbeans.XmlString xgetMemberClass();
    
    /**
     * Sets the "memberClass" element
     */
    void setMemberClass(java.lang.String memberClass);
    
    /**
     * Sets (as xml) the "memberClass" element
     */
    void xsetMemberClass(org.apache.xmlbeans.XmlString memberClass);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument newInstance() {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ehr.ads.jroad.client.adsmenadresit.types.eu.x_road.xsd.identifiers.MemberClassDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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