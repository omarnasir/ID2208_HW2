/**
 * FlightCityData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dataObjects;

public class FlightCityData  implements java.io.Serializable {
    private java.lang.Integer flightNum;

    private java.lang.String fromCity;

    private java.lang.Integer id;

    private java.lang.String toCity;

    public FlightCityData() {
    }

    public FlightCityData(
           java.lang.Integer flightNum,
           java.lang.String fromCity,
           java.lang.Integer id,
           java.lang.String toCity) {
           this.flightNum = flightNum;
           this.fromCity = fromCity;
           this.id = id;
           this.toCity = toCity;
    }


    /**
     * Gets the flightNum value for this FlightCityData.
     * 
     * @return flightNum
     */
    public java.lang.Integer getFlightNum() {
        return flightNum;
    }


    /**
     * Sets the flightNum value for this FlightCityData.
     * 
     * @param flightNum
     */
    public void setFlightNum(java.lang.Integer flightNum) {
        this.flightNum = flightNum;
    }


    /**
     * Gets the fromCity value for this FlightCityData.
     * 
     * @return fromCity
     */
    public java.lang.String getFromCity() {
        return fromCity;
    }


    /**
     * Sets the fromCity value for this FlightCityData.
     * 
     * @param fromCity
     */
    public void setFromCity(java.lang.String fromCity) {
        this.fromCity = fromCity;
    }


    /**
     * Gets the id value for this FlightCityData.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this FlightCityData.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the toCity value for this FlightCityData.
     * 
     * @return toCity
     */
    public java.lang.String getToCity() {
        return toCity;
    }


    /**
     * Sets the toCity value for this FlightCityData.
     * 
     * @param toCity
     */
    public void setToCity(java.lang.String toCity) {
        this.toCity = toCity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightCityData)) return false;
        FlightCityData other = (FlightCityData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flightNum==null && other.getFlightNum()==null) || 
             (this.flightNum!=null &&
              this.flightNum.equals(other.getFlightNum()))) &&
            ((this.fromCity==null && other.getFromCity()==null) || 
             (this.fromCity!=null &&
              this.fromCity.equals(other.getFromCity()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.toCity==null && other.getToCity()==null) || 
             (this.toCity!=null &&
              this.toCity.equals(other.getToCity())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFlightNum() != null) {
            _hashCode += getFlightNum().hashCode();
        }
        if (getFromCity() != null) {
            _hashCode += getFromCity().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getToCity() != null) {
            _hashCode += getToCity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightCityData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dataObjects", "FlightCityData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dataObjects", "flightNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dataObjects", "fromCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dataObjects", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dataObjects", "toCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
