/*
 * XML Type:  ADSmenadresitVastusType
 * Namespace: http://www.maaamet.ee
 * Java type: ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType
 *
 * Automatically generated - do not modify.
 */
package ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.impl;
/**
 * An XML ADSmenadresitVastusType(@http://www.maaamet.ee).
 *
 * This is a complex type.
 */
public class ADSmenadresitVastusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType
{
    private static final long serialVersionUID = 1L;
    
    public ADSmenadresitVastusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TULEM$0 = 
        new javax.xml.namespace.QName("", "tulem");
    private static final javax.xml.namespace.QName TEADE$2 = 
        new javax.xml.namespace.QName("", "teade");
    private static final javax.xml.namespace.QName MENETLUSNR$4 = 
        new javax.xml.namespace.QName("", "menetlusNr");
    private static final javax.xml.namespace.QName JOUSTATUD$6 = 
        new javax.xml.namespace.QName("", "joustatud");
    private static final javax.xml.namespace.QName OBJEKTID$8 = 
        new javax.xml.namespace.QName("", "objektid");
    
    
    /**
     * Gets a List of "tulem" elements
     */
    public java.util.List<java.lang.String> getTulemList()
    {
        final class TulemList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ADSmenadresitVastusTypeImpl.this.getTulemArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ADSmenadresitVastusTypeImpl.this.getTulemArray(i);
                ADSmenadresitVastusTypeImpl.this.setTulemArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ADSmenadresitVastusTypeImpl.this.insertTulem(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ADSmenadresitVastusTypeImpl.this.getTulemArray(i);
                ADSmenadresitVastusTypeImpl.this.removeTulem(i);
                return old;
            }
            
            public int size()
                { return ADSmenadresitVastusTypeImpl.this.sizeOfTulemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TulemList();
        }
    }
    
    /**
     * Gets array of all "tulem" elements
     * @deprecated
     */
    public java.lang.String[] getTulemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(TULEM$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "tulem" element
     */
    public java.lang.String getTulemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TULEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "tulem" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetTulemList()
    {
        final class TulemList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ADSmenadresitVastusTypeImpl.this.xgetTulemArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ADSmenadresitVastusTypeImpl.this.xgetTulemArray(i);
                ADSmenadresitVastusTypeImpl.this.xsetTulemArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ADSmenadresitVastusTypeImpl.this.insertNewTulem(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ADSmenadresitVastusTypeImpl.this.xgetTulemArray(i);
                ADSmenadresitVastusTypeImpl.this.removeTulem(i);
                return old;
            }
            
            public int size()
                { return ADSmenadresitVastusTypeImpl.this.sizeOfTulemArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TulemList();
        }
    }
    
    /**
     * Gets array of all "tulem" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetTulemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(TULEM$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "tulem" element
     */
    public org.apache.xmlbeans.XmlString xgetTulemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TULEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "tulem" element
     */
    public int sizeOfTulemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TULEM$0);
        }
    }
    
    /**
     * Sets array of all "tulem" element
     */
    public void setTulemArray(java.lang.String[] tulemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tulemArray, TULEM$0);
        }
    }
    
    /**
     * Sets ith "tulem" element
     */
    public void setTulemArray(int i, java.lang.String tulem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TULEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(tulem);
        }
    }
    
    /**
     * Sets (as xml) array of all "tulem" element
     */
    public void xsetTulemArray(org.apache.xmlbeans.XmlString[]tulemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tulemArray, TULEM$0);
        }
    }
    
    /**
     * Sets (as xml) ith "tulem" element
     */
    public void xsetTulemArray(int i, org.apache.xmlbeans.XmlString tulem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TULEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tulem);
        }
    }
    
    /**
     * Inserts the value as the ith "tulem" element
     */
    public void insertTulem(int i, java.lang.String tulem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TULEM$0, i);
            target.setStringValue(tulem);
        }
    }
    
    /**
     * Appends the value as the last "tulem" element
     */
    public void addTulem(java.lang.String tulem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TULEM$0);
            target.setStringValue(tulem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tulem" element
     */
    public org.apache.xmlbeans.XmlString insertNewTulem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TULEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tulem" element
     */
    public org.apache.xmlbeans.XmlString addNewTulem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TULEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tulem" element
     */
    public void removeTulem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TULEM$0, i);
        }
    }
    
    /**
     * Gets a List of "teade" elements
     */
    public java.util.List<java.lang.String> getTeadeList()
    {
        final class TeadeList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ADSmenadresitVastusTypeImpl.this.getTeadeArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ADSmenadresitVastusTypeImpl.this.getTeadeArray(i);
                ADSmenadresitVastusTypeImpl.this.setTeadeArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ADSmenadresitVastusTypeImpl.this.insertTeade(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ADSmenadresitVastusTypeImpl.this.getTeadeArray(i);
                ADSmenadresitVastusTypeImpl.this.removeTeade(i);
                return old;
            }
            
            public int size()
                { return ADSmenadresitVastusTypeImpl.this.sizeOfTeadeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TeadeList();
        }
    }
    
    /**
     * Gets array of all "teade" elements
     * @deprecated
     */
    public java.lang.String[] getTeadeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(TEADE$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "teade" element
     */
    public java.lang.String getTeadeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEADE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "teade" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetTeadeList()
    {
        final class TeadeList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ADSmenadresitVastusTypeImpl.this.xgetTeadeArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ADSmenadresitVastusTypeImpl.this.xgetTeadeArray(i);
                ADSmenadresitVastusTypeImpl.this.xsetTeadeArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ADSmenadresitVastusTypeImpl.this.insertNewTeade(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ADSmenadresitVastusTypeImpl.this.xgetTeadeArray(i);
                ADSmenadresitVastusTypeImpl.this.removeTeade(i);
                return old;
            }
            
            public int size()
                { return ADSmenadresitVastusTypeImpl.this.sizeOfTeadeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TeadeList();
        }
    }
    
    /**
     * Gets array of all "teade" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetTeadeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(TEADE$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "teade" element
     */
    public org.apache.xmlbeans.XmlString xgetTeadeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEADE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "teade" element
     */
    public int sizeOfTeadeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEADE$2);
        }
    }
    
    /**
     * Sets array of all "teade" element
     */
    public void setTeadeArray(java.lang.String[] teadeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(teadeArray, TEADE$2);
        }
    }
    
    /**
     * Sets ith "teade" element
     */
    public void setTeadeArray(int i, java.lang.String teade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEADE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(teade);
        }
    }
    
    /**
     * Sets (as xml) array of all "teade" element
     */
    public void xsetTeadeArray(org.apache.xmlbeans.XmlString[]teadeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(teadeArray, TEADE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "teade" element
     */
    public void xsetTeadeArray(int i, org.apache.xmlbeans.XmlString teade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEADE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(teade);
        }
    }
    
    /**
     * Inserts the value as the ith "teade" element
     */
    public void insertTeade(int i, java.lang.String teade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TEADE$2, i);
            target.setStringValue(teade);
        }
    }
    
    /**
     * Appends the value as the last "teade" element
     */
    public void addTeade(java.lang.String teade)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEADE$2);
            target.setStringValue(teade);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "teade" element
     */
    public org.apache.xmlbeans.XmlString insertNewTeade(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TEADE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "teade" element
     */
    public org.apache.xmlbeans.XmlString addNewTeade()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEADE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "teade" element
     */
    public void removeTeade(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEADE$2, i);
        }
    }
    
    /**
     * Gets a List of "menetlusNr" elements
     */
    public java.util.List<java.math.BigInteger> getMenetlusNrList()
    {
        final class MenetlusNrList extends java.util.AbstractList<java.math.BigInteger>
        {
            public java.math.BigInteger get(int i)
                { return ADSmenadresitVastusTypeImpl.this.getMenetlusNrArray(i); }
            
            public java.math.BigInteger set(int i, java.math.BigInteger o)
            {
                java.math.BigInteger old = ADSmenadresitVastusTypeImpl.this.getMenetlusNrArray(i);
                ADSmenadresitVastusTypeImpl.this.setMenetlusNrArray(i, o);
                return old;
            }
            
            public void add(int i, java.math.BigInteger o)
                { ADSmenadresitVastusTypeImpl.this.insertMenetlusNr(i, o); }
            
            public java.math.BigInteger remove(int i)
            {
                java.math.BigInteger old = ADSmenadresitVastusTypeImpl.this.getMenetlusNrArray(i);
                ADSmenadresitVastusTypeImpl.this.removeMenetlusNr(i);
                return old;
            }
            
            public int size()
                { return ADSmenadresitVastusTypeImpl.this.sizeOfMenetlusNrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MenetlusNrList();
        }
    }
    
    /**
     * Gets array of all "menetlusNr" elements
     * @deprecated
     */
    public java.math.BigInteger[] getMenetlusNrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlInteger> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlInteger>();
            get_store().find_all_element_users(MENETLUSNR$4, targetList);
            java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
            return result;
        }
    }
    
    /**
     * Gets ith "menetlusNr" element
     */
    public java.math.BigInteger getMenetlusNrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENETLUSNR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "menetlusNr" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetMenetlusNrList()
    {
        final class MenetlusNrList extends java.util.AbstractList<org.apache.xmlbeans.XmlInteger>
        {
            public org.apache.xmlbeans.XmlInteger get(int i)
                { return ADSmenadresitVastusTypeImpl.this.xgetMenetlusNrArray(i); }
            
            public org.apache.xmlbeans.XmlInteger set(int i, org.apache.xmlbeans.XmlInteger o)
            {
                org.apache.xmlbeans.XmlInteger old = ADSmenadresitVastusTypeImpl.this.xgetMenetlusNrArray(i);
                ADSmenadresitVastusTypeImpl.this.xsetMenetlusNrArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlInteger o)
                { ADSmenadresitVastusTypeImpl.this.insertNewMenetlusNr(i).set(o); }
            
            public org.apache.xmlbeans.XmlInteger remove(int i)
            {
                org.apache.xmlbeans.XmlInteger old = ADSmenadresitVastusTypeImpl.this.xgetMenetlusNrArray(i);
                ADSmenadresitVastusTypeImpl.this.removeMenetlusNr(i);
                return old;
            }
            
            public int size()
                { return ADSmenadresitVastusTypeImpl.this.sizeOfMenetlusNrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MenetlusNrList();
        }
    }
    
    /**
     * Gets array of all "menetlusNr" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlInteger[] xgetMenetlusNrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlInteger> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlInteger>();
            get_store().find_all_element_users(MENETLUSNR$4, targetList);
            org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "menetlusNr" element
     */
    public org.apache.xmlbeans.XmlInteger xgetMenetlusNrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MENETLUSNR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlInteger)target;
        }
    }
    
    /**
     * Returns number of "menetlusNr" element
     */
    public int sizeOfMenetlusNrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MENETLUSNR$4);
        }
    }
    
    /**
     * Sets array of all "menetlusNr" element
     */
    public void setMenetlusNrArray(java.math.BigInteger[] menetlusNrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(menetlusNrArray, MENETLUSNR$4);
        }
    }
    
    /**
     * Sets ith "menetlusNr" element
     */
    public void setMenetlusNrArray(int i, java.math.BigInteger menetlusNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MENETLUSNR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(menetlusNr);
        }
    }
    
    /**
     * Sets (as xml) array of all "menetlusNr" element
     */
    public void xsetMenetlusNrArray(org.apache.xmlbeans.XmlInteger[]menetlusNrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(menetlusNrArray, MENETLUSNR$4);
        }
    }
    
    /**
     * Sets (as xml) ith "menetlusNr" element
     */
    public void xsetMenetlusNrArray(int i, org.apache.xmlbeans.XmlInteger menetlusNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MENETLUSNR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(menetlusNr);
        }
    }
    
    /**
     * Inserts the value as the ith "menetlusNr" element
     */
    public void insertMenetlusNr(int i, java.math.BigInteger menetlusNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MENETLUSNR$4, i);
            target.setBigIntegerValue(menetlusNr);
        }
    }
    
    /**
     * Appends the value as the last "menetlusNr" element
     */
    public void addMenetlusNr(java.math.BigInteger menetlusNr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MENETLUSNR$4);
            target.setBigIntegerValue(menetlusNr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "menetlusNr" element
     */
    public org.apache.xmlbeans.XmlInteger insertNewMenetlusNr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(MENETLUSNR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "menetlusNr" element
     */
    public org.apache.xmlbeans.XmlInteger addNewMenetlusNr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MENETLUSNR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "menetlusNr" element
     */
    public void removeMenetlusNr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MENETLUSNR$4, i);
        }
    }
    
    /**
     * Gets a List of "joustatud" elements
     */
    public java.util.List<java.util.Calendar> getJoustatudList()
    {
        final class JoustatudList extends java.util.AbstractList<java.util.Calendar>
        {
            public java.util.Calendar get(int i)
                { return ADSmenadresitVastusTypeImpl.this.getJoustatudArray(i); }
            
            public java.util.Calendar set(int i, java.util.Calendar o)
            {
                java.util.Calendar old = ADSmenadresitVastusTypeImpl.this.getJoustatudArray(i);
                ADSmenadresitVastusTypeImpl.this.setJoustatudArray(i, o);
                return old;
            }
            
            public void add(int i, java.util.Calendar o)
                { ADSmenadresitVastusTypeImpl.this.insertJoustatud(i, o); }
            
            public java.util.Calendar remove(int i)
            {
                java.util.Calendar old = ADSmenadresitVastusTypeImpl.this.getJoustatudArray(i);
                ADSmenadresitVastusTypeImpl.this.removeJoustatud(i);
                return old;
            }
            
            public int size()
                { return ADSmenadresitVastusTypeImpl.this.sizeOfJoustatudArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new JoustatudList();
        }
    }
    
    /**
     * Gets array of all "joustatud" elements
     * @deprecated
     */
    public java.util.Calendar[] getJoustatudArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlDateTime> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlDateTime>();
            get_store().find_all_element_users(JOUSTATUD$6, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "joustatud" element
     */
    public java.util.Calendar getJoustatudArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOUSTATUD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "joustatud" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlDateTime> xgetJoustatudList()
    {
        final class JoustatudList extends java.util.AbstractList<org.apache.xmlbeans.XmlDateTime>
        {
            public org.apache.xmlbeans.XmlDateTime get(int i)
                { return ADSmenadresitVastusTypeImpl.this.xgetJoustatudArray(i); }
            
            public org.apache.xmlbeans.XmlDateTime set(int i, org.apache.xmlbeans.XmlDateTime o)
            {
                org.apache.xmlbeans.XmlDateTime old = ADSmenadresitVastusTypeImpl.this.xgetJoustatudArray(i);
                ADSmenadresitVastusTypeImpl.this.xsetJoustatudArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlDateTime o)
                { ADSmenadresitVastusTypeImpl.this.insertNewJoustatud(i).set(o); }
            
            public org.apache.xmlbeans.XmlDateTime remove(int i)
            {
                org.apache.xmlbeans.XmlDateTime old = ADSmenadresitVastusTypeImpl.this.xgetJoustatudArray(i);
                ADSmenadresitVastusTypeImpl.this.removeJoustatud(i);
                return old;
            }
            
            public int size()
                { return ADSmenadresitVastusTypeImpl.this.sizeOfJoustatudArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new JoustatudList();
        }
    }
    
    /**
     * Gets array of all "joustatud" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetJoustatudArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlDateTime> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlDateTime>();
            get_store().find_all_element_users(JOUSTATUD$6, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "joustatud" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetJoustatudArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(JOUSTATUD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDateTime)target;
        }
    }
    
    /**
     * Returns number of "joustatud" element
     */
    public int sizeOfJoustatudArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JOUSTATUD$6);
        }
    }
    
    /**
     * Sets array of all "joustatud" element
     */
    public void setJoustatudArray(java.util.Calendar[] joustatudArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(joustatudArray, JOUSTATUD$6);
        }
    }
    
    /**
     * Sets ith "joustatud" element
     */
    public void setJoustatudArray(int i, java.util.Calendar joustatud)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOUSTATUD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(joustatud);
        }
    }
    
    /**
     * Sets (as xml) array of all "joustatud" element
     */
    public void xsetJoustatudArray(org.apache.xmlbeans.XmlDateTime[]joustatudArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(joustatudArray, JOUSTATUD$6);
        }
    }
    
    /**
     * Sets (as xml) ith "joustatud" element
     */
    public void xsetJoustatudArray(int i, org.apache.xmlbeans.XmlDateTime joustatud)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(JOUSTATUD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(joustatud);
        }
    }
    
    /**
     * Inserts the value as the ith "joustatud" element
     */
    public void insertJoustatud(int i, java.util.Calendar joustatud)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(JOUSTATUD$6, i);
            target.setCalendarValue(joustatud);
        }
    }
    
    /**
     * Appends the value as the last "joustatud" element
     */
    public void addJoustatud(java.util.Calendar joustatud)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOUSTATUD$6);
            target.setCalendarValue(joustatud);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "joustatud" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewJoustatud(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(JOUSTATUD$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "joustatud" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewJoustatud()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(JOUSTATUD$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "joustatud" element
     */
    public void removeJoustatud(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JOUSTATUD$6, i);
        }
    }
    
    /**
     * Gets a List of "objektid" elements
     */
    public java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid> getObjektidList()
    {
        final class ObjektidList extends java.util.AbstractList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid>
        {
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid get(int i)
                { return ADSmenadresitVastusTypeImpl.this.getObjektidArray(i); }
            
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid set(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid o)
            {
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid old = ADSmenadresitVastusTypeImpl.this.getObjektidArray(i);
                ADSmenadresitVastusTypeImpl.this.setObjektidArray(i, o);
                return old;
            }
            
            public void add(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid o)
                { ADSmenadresitVastusTypeImpl.this.insertNewObjektid(i).set(o); }
            
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid remove(int i)
            {
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid old = ADSmenadresitVastusTypeImpl.this.getObjektidArray(i);
                ADSmenadresitVastusTypeImpl.this.removeObjektid(i);
                return old;
            }
            
            public int size()
                { return ADSmenadresitVastusTypeImpl.this.sizeOfObjektidArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ObjektidList();
        }
    }
    
    /**
     * Gets array of all "objektid" elements
     * @deprecated
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid[] getObjektidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid> targetList = new java.util.ArrayList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid>();
            get_store().find_all_element_users(OBJEKTID$8, targetList);
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid[] result = new ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "objektid" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid getObjektidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid)get_store().find_element_user(OBJEKTID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "objektid" element
     */
    public int sizeOfObjektidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJEKTID$8);
        }
    }
    
    /**
     * Sets array of all "objektid" element
     */
    public void setObjektidArray(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid[] objektidArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objektidArray, OBJEKTID$8);
        }
    }
    
    /**
     * Sets ith "objektid" element
     */
    public void setObjektidArray(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid objektid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid)get_store().find_element_user(OBJEKTID$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objektid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objektid" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid insertNewObjektid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid)get_store().insert_element_user(OBJEKTID$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objektid" element
     */
    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid addNewObjektid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid target = null;
            target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid)get_store().add_element_user(OBJEKTID$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "objektid" element
     */
    public void removeObjektid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJEKTID$8, i);
        }
    }
    /**
     * An XML objektid(@).
     *
     * This is a complex type.
     */
    public static class ObjektidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid
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
        public java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt> getMenobjektList()
        {
            final class MenobjektList extends java.util.AbstractList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt>
            {
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt get(int i)
                    { return ObjektidImpl.this.getMenobjektArray(i); }
                
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt set(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt o)
                {
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt old = ObjektidImpl.this.getMenobjektArray(i);
                    ObjektidImpl.this.setMenobjektArray(i, o);
                    return old;
                }
                
                public void add(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt o)
                    { ObjektidImpl.this.insertNewMenobjekt(i).set(o); }
                
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt remove(int i)
                {
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt old = ObjektidImpl.this.getMenobjektArray(i);
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
        public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt[] getMenobjektArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt> targetList = new java.util.ArrayList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt>();
                get_store().find_all_element_users(MENOBJEKT$0, targetList);
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt[] result = new ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "menobjekt" element
         */
        public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt getMenobjektArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt target = null;
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt)get_store().find_element_user(MENOBJEKT$0, i);
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
        public void setMenobjektArray(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt[] menobjektArray)
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
        public void setMenobjektArray(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt menobjekt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt target = null;
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt)get_store().find_element_user(MENOBJEKT$0, i);
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
        public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt insertNewMenobjekt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt target = null;
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt)get_store().insert_element_user(MENOBJEKT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "menobjekt" element
         */
        public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt addNewMenobjekt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt target = null;
                target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt)get_store().add_element_user(MENOBJEKT$0);
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
        public static class MenobjektImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt
        {
            private static final long serialVersionUID = 1L;
            
            public MenobjektImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ADSOID$0 = 
                new javax.xml.namespace.QName("", "adsOid");
            private static final javax.xml.namespace.QName ADOBID$2 = 
                new javax.xml.namespace.QName("", "adobId");
            private static final javax.xml.namespace.QName OBJEKTILIIK$4 = 
                new javax.xml.namespace.QName("", "objektiLiik");
            private static final javax.xml.namespace.QName ORIGTUNNUS$6 = 
                new javax.xml.namespace.QName("", "origTunnus");
            private static final javax.xml.namespace.QName OLEK$8 = 
                new javax.xml.namespace.QName("", "olek");
            private static final javax.xml.namespace.QName TAISAADRESS$10 = 
                new javax.xml.namespace.QName("", "taisAadress");
            private static final javax.xml.namespace.QName LAHIAADRESS$12 = 
                new javax.xml.namespace.QName("", "lahiAadress");
            private static final javax.xml.namespace.QName OIGUSLIKALUS$14 = 
                new javax.xml.namespace.QName("", "oiguslikAlus");
            private static final javax.xml.namespace.QName ALUSEKUUPAEV$16 = 
                new javax.xml.namespace.QName("", "aluseKuupaev");
            private static final javax.xml.namespace.QName TAHIS$18 = 
                new javax.xml.namespace.QName("", "tahis");
            private static final javax.xml.namespace.QName KORRUS$20 = 
                new javax.xml.namespace.QName("", "korrus");
            private static final javax.xml.namespace.QName HOONEADSOID$22 = 
                new javax.xml.namespace.QName("", "hooneAdsOid");
            private static final javax.xml.namespace.QName RUUMIKUJU$24 = 
                new javax.xml.namespace.QName("", "ruumiKuju");
            private static final javax.xml.namespace.QName KUJUMOODUSTUSVIIS$26 = 
                new javax.xml.namespace.QName("", "kujuMoodustusviis");
            private static final javax.xml.namespace.QName AADRESSID$28 = 
                new javax.xml.namespace.QName("", "aadressid");
            private static final javax.xml.namespace.QName MENPROBLEEMID$30 = 
                new javax.xml.namespace.QName("", "menProbleemid");
            
            
            /**
             * Gets the "adsOid" element
             */
            public java.lang.String getAdsOid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADSOID$0, 0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADSOID$0, 0);
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
                    return get_store().count_elements(ADSOID$0) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADSOID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADSOID$0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADSOID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADSOID$0);
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
                    get_store().remove_element(ADSOID$0, 0);
                }
            }
            
            /**
             * Gets the "adobId" element
             */
            public java.lang.String getAdobId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADOBID$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "adobId" element
             */
            public org.apache.xmlbeans.XmlString xgetAdobId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADOBID$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "adobId" element
             */
            public boolean isSetAdobId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ADOBID$2) != 0;
                }
            }
            
            /**
             * Sets the "adobId" element
             */
            public void setAdobId(java.lang.String adobId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADOBID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADOBID$2);
                    }
                    target.setStringValue(adobId);
                }
            }
            
            /**
             * Sets (as xml) the "adobId" element
             */
            public void xsetAdobId(org.apache.xmlbeans.XmlString adobId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADOBID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADOBID$2);
                    }
                    target.set(adobId);
                }
            }
            
            /**
             * Unsets the "adobId" element
             */
            public void unsetAdobId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ADOBID$2, 0);
                }
            }
            
            /**
             * Gets the "objektiLiik" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator.Enum getObjektiLiik()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJEKTILIIK$4, 0);
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
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator)get_store().find_element_user(OBJEKTILIIK$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "objektiLiik" element
             */
            public boolean isSetObjektiLiik()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OBJEKTILIIK$4) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJEKTILIIK$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJEKTILIIK$4);
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
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator)get_store().find_element_user(OBJEKTILIIK$4, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsobjliikKlassifikaator)get_store().add_element_user(OBJEKTILIIK$4);
                    }
                    target.set(objektiLiik);
                }
            }
            
            /**
             * Unsets the "objektiLiik" element
             */
            public void unsetObjektiLiik()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OBJEKTILIIK$4, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGTUNNUS$6, 0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGTUNNUS$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "origTunnus" element
             */
            public boolean isSetOrigTunnus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORIGTUNNUS$6) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGTUNNUS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGTUNNUS$6);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGTUNNUS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGTUNNUS$6);
                    }
                    target.set(origTunnus);
                }
            }
            
            /**
             * Unsets the "origTunnus" element
             */
            public void unsetOrigTunnus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORIGTUNNUS$6, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLEK$8, 0);
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
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType)get_store().find_element_user(OLEK$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "olek" element
             */
            public boolean isSetOlek()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OLEK$8) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OLEK$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OLEK$8);
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
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType)get_store().find_element_user(OLEK$8, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsMenOlekType)get_store().add_element_user(OLEK$8);
                    }
                    target.set(olek);
                }
            }
            
            /**
             * Unsets the "olek" element
             */
            public void unsetOlek()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OLEK$8, 0);
                }
            }
            
            /**
             * Gets the "taisAadress" element
             */
            public java.lang.String getTaisAadress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAISAADRESS$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "taisAadress" element
             */
            public org.apache.xmlbeans.XmlString xgetTaisAadress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAISAADRESS$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "taisAadress" element
             */
            public boolean isSetTaisAadress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TAISAADRESS$10) != 0;
                }
            }
            
            /**
             * Sets the "taisAadress" element
             */
            public void setTaisAadress(java.lang.String taisAadress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAISAADRESS$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAISAADRESS$10);
                    }
                    target.setStringValue(taisAadress);
                }
            }
            
            /**
             * Sets (as xml) the "taisAadress" element
             */
            public void xsetTaisAadress(org.apache.xmlbeans.XmlString taisAadress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAISAADRESS$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAISAADRESS$10);
                    }
                    target.set(taisAadress);
                }
            }
            
            /**
             * Unsets the "taisAadress" element
             */
            public void unsetTaisAadress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TAISAADRESS$10, 0);
                }
            }
            
            /**
             * Gets the "lahiAadress" element
             */
            public java.lang.String getLahiAadress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAHIAADRESS$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "lahiAadress" element
             */
            public org.apache.xmlbeans.XmlString xgetLahiAadress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAHIAADRESS$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "lahiAadress" element
             */
            public boolean isSetLahiAadress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LAHIAADRESS$12) != 0;
                }
            }
            
            /**
             * Sets the "lahiAadress" element
             */
            public void setLahiAadress(java.lang.String lahiAadress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAHIAADRESS$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAHIAADRESS$12);
                    }
                    target.setStringValue(lahiAadress);
                }
            }
            
            /**
             * Sets (as xml) the "lahiAadress" element
             */
            public void xsetLahiAadress(org.apache.xmlbeans.XmlString lahiAadress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAHIAADRESS$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAHIAADRESS$12);
                    }
                    target.set(lahiAadress);
                }
            }
            
            /**
             * Unsets the "lahiAadress" element
             */
            public void unsetLahiAadress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LAHIAADRESS$12, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OIGUSLIKALUS$14, 0);
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
            public org.apache.xmlbeans.XmlString xgetOiguslikAlus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OIGUSLIKALUS$14, 0);
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
                    return get_store().count_elements(OIGUSLIKALUS$14) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OIGUSLIKALUS$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OIGUSLIKALUS$14);
                    }
                    target.setStringValue(oiguslikAlus);
                }
            }
            
            /**
             * Sets (as xml) the "oiguslikAlus" element
             */
            public void xsetOiguslikAlus(org.apache.xmlbeans.XmlString oiguslikAlus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OIGUSLIKALUS$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OIGUSLIKALUS$14);
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
                    get_store().remove_element(OIGUSLIKALUS$14, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALUSEKUUPAEV$16, 0);
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
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ALUSEKUUPAEV$16, 0);
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
                    return get_store().count_elements(ALUSEKUUPAEV$16) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALUSEKUUPAEV$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALUSEKUUPAEV$16);
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
                    target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(ALUSEKUUPAEV$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(ALUSEKUUPAEV$16);
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
                    get_store().remove_element(ALUSEKUUPAEV$16, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAHIS$18, 0);
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
            public org.apache.xmlbeans.XmlString xgetTahis()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAHIS$18, 0);
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
                    return get_store().count_elements(TAHIS$18) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAHIS$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAHIS$18);
                    }
                    target.setStringValue(tahis);
                }
            }
            
            /**
             * Sets (as xml) the "tahis" element
             */
            public void xsetTahis(org.apache.xmlbeans.XmlString tahis)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAHIS$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAHIS$18);
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
                    get_store().remove_element(TAHIS$18, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KORRUS$20, 0);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KORRUS$20, 0);
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
                    return get_store().count_elements(KORRUS$20) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KORRUS$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KORRUS$20);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(KORRUS$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(KORRUS$20);
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
                    get_store().remove_element(KORRUS$20, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOONEADSOID$22, 0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOONEADSOID$22, 0);
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
                    return get_store().count_elements(HOONEADSOID$22) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOONEADSOID$22, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOONEADSOID$22);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOONEADSOID$22, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOONEADSOID$22);
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
                    get_store().remove_element(HOONEADSOID$22, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUUMIKUJU$24, 0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUUMIKUJU$24, 0);
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
                    return get_store().count_elements(RUUMIKUJU$24) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUUMIKUJU$24, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUUMIKUJU$24);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUUMIKUJU$24, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RUUMIKUJU$24);
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
                    get_store().remove_element(RUUMIKUJU$24, 0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KUJUMOODUSTUSVIIS$26, 0);
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
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType)get_store().find_element_user(KUJUMOODUSTUSVIIS$26, 0);
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
                    return get_store().count_elements(KUJUMOODUSTUSVIIS$26) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KUJUMOODUSTUSVIIS$26, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KUJUMOODUSTUSVIIS$26);
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
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType)get_store().find_element_user(KUJUMOODUSTUSVIIS$26, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsObjmviisType)get_store().add_element_user(KUJUMOODUSTUSVIIS$26);
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
                    get_store().remove_element(KUJUMOODUSTUSVIIS$26, 0);
                }
            }
            
            /**
             * Gets the "aadressid" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid getAadressid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid)get_store().find_element_user(AADRESSID$28, 0);
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
                    return get_store().count_elements(AADRESSID$28) != 0;
                }
            }
            
            /**
             * Sets the "aadressid" element
             */
            public void setAadressid(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid aadressid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid)get_store().find_element_user(AADRESSID$28, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid)get_store().add_element_user(AADRESSID$28);
                    }
                    target.set(aadressid);
                }
            }
            
            /**
             * Appends and returns a new empty "aadressid" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid addNewAadressid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid)get_store().add_element_user(AADRESSID$28);
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
                    get_store().remove_element(AADRESSID$28, 0);
                }
            }
            
            /**
             * Gets the "menProbleemid" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid getMenProbleemid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid)get_store().find_element_user(MENPROBLEEMID$30, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "menProbleemid" element
             */
            public boolean isSetMenProbleemid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MENPROBLEEMID$30) != 0;
                }
            }
            
            /**
             * Sets the "menProbleemid" element
             */
            public void setMenProbleemid(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid menProbleemid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid)get_store().find_element_user(MENPROBLEEMID$30, 0);
                    if (target == null)
                    {
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid)get_store().add_element_user(MENPROBLEEMID$30);
                    }
                    target.set(menProbleemid);
                }
            }
            
            /**
             * Appends and returns a new empty "menProbleemid" element
             */
            public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid addNewMenProbleemid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid target = null;
                    target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid)get_store().add_element_user(MENPROBLEEMID$30);
                    return target;
                }
            }
            
            /**
             * Unsets the "menProbleemid" element
             */
            public void unsetMenProbleemid()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MENPROBLEEMID$30, 0);
                }
            }
            /**
             * An XML aadressid(@).
             *
             * This is a complex type.
             */
            public static class AadressidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid
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
                public java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress> getAadressList()
                {
                    final class AadressList extends java.util.AbstractList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress>
                    {
                      public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress get(int i)
                          { return AadressidImpl.this.getAadressArray(i); }
                      
                      public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress set(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress o)
                      {
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress old = AadressidImpl.this.getAadressArray(i);
                        AadressidImpl.this.setAadressArray(i, o);
                        return old;
                      }
                      
                      public void add(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress o)
                          { AadressidImpl.this.insertNewAadress(i).set(o); }
                      
                      public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress remove(int i)
                      {
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress old = AadressidImpl.this.getAadressArray(i);
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
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress[] getAadressArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress> targetList = new java.util.ArrayList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress>();
                      get_store().find_all_element_users(AADRESS$0, targetList);
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress[] result = new ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "aadress" element
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress getAadressArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress)get_store().find_element_user(AADRESS$0, i);
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
                public void setAadressArray(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress[] aadressArray)
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
                public void setAadressArray(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress aadress)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress)get_store().find_element_user(AADRESS$0, i);
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
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress insertNewAadress(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress)get_store().insert_element_user(AADRESS$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "aadress" element
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress addNewAadress()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress)get_store().add_element_user(AADRESS$0);
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
                public static class AadressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.Aadressid.Aadress
                {
                    private static final long serialVersionUID = 1L;
                    
                    public AadressImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName ADRID$0 = 
                      new javax.xml.namespace.QName("", "adrId");
                    private static final javax.xml.namespace.QName KOODAADRESS$2 = 
                      new javax.xml.namespace.QName("", "koodAadress");
                    private static final javax.xml.namespace.QName TAISAADRESS$4 = 
                      new javax.xml.namespace.QName("", "taisAadress");
                    private static final javax.xml.namespace.QName LAHIAADRESS$6 = 
                      new javax.xml.namespace.QName("", "lahiAadress");
                    private static final javax.xml.namespace.QName PUNKTX$8 = 
                      new javax.xml.namespace.QName("", "punktX");
                    private static final javax.xml.namespace.QName PUNKTY$10 = 
                      new javax.xml.namespace.QName("", "punktY");
                    private static final javax.xml.namespace.QName ADSTASE1$12 = 
                      new javax.xml.namespace.QName("", "adsTase1");
                    private static final javax.xml.namespace.QName ADSTASE2$14 = 
                      new javax.xml.namespace.QName("", "adsTase2");
                    private static final javax.xml.namespace.QName ADSTASE3$16 = 
                      new javax.xml.namespace.QName("", "adsTase3");
                    private static final javax.xml.namespace.QName ADSTASE4$18 = 
                      new javax.xml.namespace.QName("", "adsTase4");
                    private static final javax.xml.namespace.QName ADSTASE5$20 = 
                      new javax.xml.namespace.QName("", "adsTase5");
                    private static final javax.xml.namespace.QName ADSTASE6$22 = 
                      new javax.xml.namespace.QName("", "adsTase6");
                    private static final javax.xml.namespace.QName ADSTASE7$24 = 
                      new javax.xml.namespace.QName("", "adsTase7");
                    private static final javax.xml.namespace.QName ADSTASE8$26 = 
                      new javax.xml.namespace.QName("", "adsTase8");
                    
                    
                    /**
                     * Gets the "adrId" element
                     */
                    public java.math.BigInteger getAdrId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADRID$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "adrId" element
                     */
                    public org.apache.xmlbeans.XmlInteger xgetAdrId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADRID$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "adrId" element
                     */
                    public boolean isSetAdrId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ADRID$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adrId" element
                     */
                    public void setAdrId(java.math.BigInteger adrId)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADRID$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADRID$0);
                        }
                        target.setBigIntegerValue(adrId);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "adrId" element
                     */
                    public void xsetAdrId(org.apache.xmlbeans.XmlInteger adrId)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ADRID$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ADRID$0);
                        }
                        target.set(adrId);
                      }
                    }
                    
                    /**
                     * Unsets the "adrId" element
                     */
                    public void unsetAdrId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ADRID$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "koodAadress" element
                     */
                    public java.lang.String getKoodAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOODAADRESS$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "koodAadress" element
                     */
                    public org.apache.xmlbeans.XmlString xgetKoodAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOODAADRESS$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "koodAadress" element
                     */
                    public boolean isSetKoodAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(KOODAADRESS$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "koodAadress" element
                     */
                    public void setKoodAadress(java.lang.String koodAadress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KOODAADRESS$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KOODAADRESS$2);
                        }
                        target.setStringValue(koodAadress);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "koodAadress" element
                     */
                    public void xsetKoodAadress(org.apache.xmlbeans.XmlString koodAadress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KOODAADRESS$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KOODAADRESS$2);
                        }
                        target.set(koodAadress);
                      }
                    }
                    
                    /**
                     * Unsets the "koodAadress" element
                     */
                    public void unsetKoodAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(KOODAADRESS$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "taisAadress" element
                     */
                    public java.lang.String getTaisAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAISAADRESS$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "taisAadress" element
                     */
                    public org.apache.xmlbeans.XmlString xgetTaisAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAISAADRESS$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "taisAadress" element
                     */
                    public boolean isSetTaisAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TAISAADRESS$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "taisAadress" element
                     */
                    public void setTaisAadress(java.lang.String taisAadress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAISAADRESS$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAISAADRESS$4);
                        }
                        target.setStringValue(taisAadress);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "taisAadress" element
                     */
                    public void xsetTaisAadress(org.apache.xmlbeans.XmlString taisAadress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TAISAADRESS$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TAISAADRESS$4);
                        }
                        target.set(taisAadress);
                      }
                    }
                    
                    /**
                     * Unsets the "taisAadress" element
                     */
                    public void unsetTaisAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TAISAADRESS$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "lahiAadress" element
                     */
                    public java.lang.String getLahiAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAHIAADRESS$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "lahiAadress" element
                     */
                    public org.apache.xmlbeans.XmlString xgetLahiAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAHIAADRESS$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "lahiAadress" element
                     */
                    public boolean isSetLahiAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(LAHIAADRESS$6) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "lahiAadress" element
                     */
                    public void setLahiAadress(java.lang.String lahiAadress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAHIAADRESS$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAHIAADRESS$6);
                        }
                        target.setStringValue(lahiAadress);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "lahiAadress" element
                     */
                    public void xsetLahiAadress(org.apache.xmlbeans.XmlString lahiAadress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAHIAADRESS$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAHIAADRESS$6);
                        }
                        target.set(lahiAadress);
                      }
                    }
                    
                    /**
                     * Unsets the "lahiAadress" element
                     */
                    public void unsetLahiAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(LAHIAADRESS$6, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNKTX$8, 0);
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
                    public org.apache.xmlbeans.XmlDouble xgetPunktX()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PUNKTX$8, 0);
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
                        return get_store().count_elements(PUNKTX$8) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNKTX$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUNKTX$8);
                        }
                        target.setDoubleValue(punktX);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "punktX" element
                     */
                    public void xsetPunktX(org.apache.xmlbeans.XmlDouble punktX)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PUNKTX$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PUNKTX$8);
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
                        get_store().remove_element(PUNKTX$8, 0);
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNKTY$10, 0);
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
                    public org.apache.xmlbeans.XmlDouble xgetPunktY()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PUNKTY$10, 0);
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
                        return get_store().count_elements(PUNKTY$10) != 0;
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
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUNKTY$10, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUNKTY$10);
                        }
                        target.setDoubleValue(punktY);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "punktY" element
                     */
                    public void xsetPunktY(org.apache.xmlbeans.XmlDouble punktY)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDouble target = null;
                        target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PUNKTY$10, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PUNKTY$10);
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
                        get_store().remove_element(PUNKTY$10, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase1" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE1$12, 0);
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
                        return get_store().count_elements(ADSTASE1$12) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase1" element
                     */
                    public void setAdsTase1(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase1)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE1$12, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE1$12);
                        }
                        target.set(adsTase1);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase1" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase1()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE1$12);
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
                        get_store().remove_element(ADSTASE1$12, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase2" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE2$14, 0);
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
                        return get_store().count_elements(ADSTASE2$14) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase2" element
                     */
                    public void setAdsTase2(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase2)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE2$14, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE2$14);
                        }
                        target.set(adsTase2);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase2" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE2$14);
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
                        get_store().remove_element(ADSTASE2$14, 0);
                      }
                    }
                    
                    /**
                     * Gets the "adsTase3" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType getAdsTase3()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE3$16, 0);
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
                        return get_store().count_elements(ADSTASE3$16) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "adsTase3" element
                     */
                    public void setAdsTase3(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType adsTase3)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE3$16, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE3$16);
                        }
                        target.set(adsTase3);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "adsTase3" element
                     */
                    public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType addNewAdsTase3()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType target = null;
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE3$16);
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
                        get_store().remove_element(ADSTASE3$16, 0);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE4$18, 0);
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
                        return get_store().count_elements(ADSTASE4$18) != 0;
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE4$18, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE4$18);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE4$18);
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
                        get_store().remove_element(ADSTASE4$18, 0);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE5$20, 0);
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
                        return get_store().count_elements(ADSTASE5$20) != 0;
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE5$20, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE5$20);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE5$20);
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
                        get_store().remove_element(ADSTASE5$20, 0);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE6$22, 0);
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
                        return get_store().count_elements(ADSTASE6$22) != 0;
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE6$22, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE6$22);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE6$22);
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
                        get_store().remove_element(ADSTASE6$22, 0);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE7$24, 0);
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
                        return get_store().count_elements(ADSTASE7$24) != 0;
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE7$24, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE7$24);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE7$24);
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
                        get_store().remove_element(ADSTASE7$24, 0);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE8$26, 0);
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
                        return get_store().count_elements(ADSTASE8$26) != 0;
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().find_element_user(ADSTASE8$26, 0);
                        if (target == null)
                        {
                          target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE8$26);
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
                        target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.AdsTaseType)get_store().add_element_user(ADSTASE8$26);
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
                        get_store().remove_element(ADSTASE8$26, 0);
                      }
                    }
                }
            }
            /**
             * An XML menProbleemid(@).
             *
             * This is a complex type.
             */
            public static class MenProbleemidImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid
            {
                private static final long serialVersionUID = 1L;
                
                public MenProbleemidImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName MENPROBLEEM$0 = 
                    new javax.xml.namespace.QName("", "menProbleem");
                
                
                /**
                 * Gets a List of "menProbleem" elements
                 */
                public java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem> getMenProbleemList()
                {
                    final class MenProbleemList extends java.util.AbstractList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem>
                    {
                      public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem get(int i)
                          { return MenProbleemidImpl.this.getMenProbleemArray(i); }
                      
                      public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem set(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem o)
                      {
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem old = MenProbleemidImpl.this.getMenProbleemArray(i);
                        MenProbleemidImpl.this.setMenProbleemArray(i, o);
                        return old;
                      }
                      
                      public void add(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem o)
                          { MenProbleemidImpl.this.insertNewMenProbleem(i).set(o); }
                      
                      public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem remove(int i)
                      {
                        ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem old = MenProbleemidImpl.this.getMenProbleemArray(i);
                        MenProbleemidImpl.this.removeMenProbleem(i);
                        return old;
                      }
                      
                      public int size()
                          { return MenProbleemidImpl.this.sizeOfMenProbleemArray(); }
                      
                    }
                    
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return new MenProbleemList();
                    }
                }
                
                /**
                 * Gets array of all "menProbleem" elements
                 * @deprecated
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem[] getMenProbleemArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem> targetList = new java.util.ArrayList<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem>();
                      get_store().find_all_element_users(MENPROBLEEM$0, targetList);
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem[] result = new ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "menProbleem" element
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem getMenProbleemArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem)get_store().find_element_user(MENPROBLEEM$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "menProbleem" element
                 */
                public int sizeOfMenProbleemArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MENPROBLEEM$0);
                    }
                }
                
                /**
                 * Sets array of all "menProbleem" element
                 */
                public void setMenProbleemArray(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem[] menProbleemArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(menProbleemArray, MENPROBLEEM$0);
                    }
                }
                
                /**
                 * Sets ith "menProbleem" element
                 */
                public void setMenProbleemArray(int i, ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem menProbleem)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem)get_store().find_element_user(MENPROBLEEM$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(menProbleem);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "menProbleem" element
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem insertNewMenProbleem(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem)get_store().insert_element_user(MENPROBLEEM$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "menProbleem" element
                 */
                public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem addNewMenProbleem()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem target = null;
                      target = (ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem)get_store().add_element_user(MENPROBLEEM$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "menProbleem" element
                 */
                public void removeMenProbleem(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MENPROBLEEM$0, i);
                    }
                }
                /**
                 * An XML menProbleem(@).
                 *
                 * This is a complex type.
                 */
                public static class MenProbleemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType.Objektid.Menobjekt.MenProbleemid.MenProbleem
                {
                    private static final long serialVersionUID = 1L;
                    
                    public MenProbleemImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName AADRESS$0 = 
                      new javax.xml.namespace.QName("", "aadress");
                    private static final javax.xml.namespace.QName VEAKOOD$2 = 
                      new javax.xml.namespace.QName("", "veaKood");
                    private static final javax.xml.namespace.QName VEATEKST$4 = 
                      new javax.xml.namespace.QName("", "veaTekst");
                    private static final javax.xml.namespace.QName MARKUS$6 = 
                      new javax.xml.namespace.QName("", "markus");
                    
                    
                    /**
                     * Gets the "aadress" element
                     */
                    public java.lang.String getAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AADRESS$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "aadress" element
                     */
                    public org.apache.xmlbeans.XmlString xgetAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AADRESS$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "aadress" element
                     */
                    public boolean isSetAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(AADRESS$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "aadress" element
                     */
                    public void setAadress(java.lang.String aadress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AADRESS$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AADRESS$0);
                        }
                        target.setStringValue(aadress);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "aadress" element
                     */
                    public void xsetAadress(org.apache.xmlbeans.XmlString aadress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AADRESS$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AADRESS$0);
                        }
                        target.set(aadress);
                      }
                    }
                    
                    /**
                     * Unsets the "aadress" element
                     */
                    public void unsetAadress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(AADRESS$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "veaKood" element
                     */
                    public java.math.BigInteger getVeaKood()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEAKOOD$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "veaKood" element
                     */
                    public org.apache.xmlbeans.XmlInteger xgetVeaKood()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEAKOOD$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "veaKood" element
                     */
                    public boolean isSetVeaKood()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(VEAKOOD$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "veaKood" element
                     */
                    public void setVeaKood(java.math.BigInteger veaKood)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEAKOOD$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEAKOOD$2);
                        }
                        target.setBigIntegerValue(veaKood);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "veaKood" element
                     */
                    public void xsetVeaKood(org.apache.xmlbeans.XmlInteger veaKood)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInteger target = null;
                        target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(VEAKOOD$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(VEAKOOD$2);
                        }
                        target.set(veaKood);
                      }
                    }
                    
                    /**
                     * Unsets the "veaKood" element
                     */
                    public void unsetVeaKood()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(VEAKOOD$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "veaTekst" element
                     */
                    public java.lang.String getVeaTekst()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEATEKST$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "veaTekst" element
                     */
                    public org.apache.xmlbeans.XmlString xgetVeaTekst()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEATEKST$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "veaTekst" element
                     */
                    public boolean isSetVeaTekst()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(VEATEKST$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "veaTekst" element
                     */
                    public void setVeaTekst(java.lang.String veaTekst)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VEATEKST$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VEATEKST$4);
                        }
                        target.setStringValue(veaTekst);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "veaTekst" element
                     */
                    public void xsetVeaTekst(org.apache.xmlbeans.XmlString veaTekst)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VEATEKST$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VEATEKST$4);
                        }
                        target.set(veaTekst);
                      }
                    }
                    
                    /**
                     * Unsets the "veaTekst" element
                     */
                    public void unsetVeaTekst()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(VEATEKST$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "markus" element
                     */
                    public java.lang.String getMarkus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKUS$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "markus" element
                     */
                    public org.apache.xmlbeans.XmlString xgetMarkus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MARKUS$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "markus" element
                     */
                    public boolean isSetMarkus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(MARKUS$6) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "markus" element
                     */
                    public void setMarkus(java.lang.String markus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKUS$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARKUS$6);
                        }
                        target.setStringValue(markus);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "markus" element
                     */
                    public void xsetMarkus(org.apache.xmlbeans.XmlString markus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MARKUS$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MARKUS$6);
                        }
                        target.set(markus);
                      }
                    }
                    
                    /**
                     * Unsets the "markus" element
                     */
                    public void unsetMarkus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(MARKUS$6, 0);
                      }
                    }
                }
            }
        }
    }
}
