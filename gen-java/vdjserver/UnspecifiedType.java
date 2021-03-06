/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package vdjserver;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-07")
public class UnspecifiedType implements org.apache.thrift.TBase<UnspecifiedType, UnspecifiedType._Fields>, java.io.Serializable, Cloneable, Comparable<UnspecifiedType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UnspecifiedType");

  private static final org.apache.thrift.protocol.TField BASE_OBJECT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("baseObjectType", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OBJECT_FIELD_DESC = new org.apache.thrift.protocol.TField("object", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UnspecifiedTypeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UnspecifiedTypeTupleSchemeFactory());
  }

  public String baseObjectType; // required
  public ByteBuffer object; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE_OBJECT_TYPE((short)1, "baseObjectType"),
    OBJECT((short)2, "object");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BASE_OBJECT_TYPE
          return BASE_OBJECT_TYPE;
        case 2: // OBJECT
          return OBJECT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE_OBJECT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("baseObjectType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OBJECT, new org.apache.thrift.meta_data.FieldMetaData("object", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UnspecifiedType.class, metaDataMap);
  }

  public UnspecifiedType() {
  }

  public UnspecifiedType(
    String baseObjectType,
    ByteBuffer object)
  {
    this();
    this.baseObjectType = baseObjectType;
    this.object = org.apache.thrift.TBaseHelper.copyBinary(object);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UnspecifiedType(UnspecifiedType other) {
    if (other.isSetBaseObjectType()) {
      this.baseObjectType = other.baseObjectType;
    }
    if (other.isSetObject()) {
      this.object = org.apache.thrift.TBaseHelper.copyBinary(other.object);
    }
  }

  public UnspecifiedType deepCopy() {
    return new UnspecifiedType(this);
  }

  @Override
  public void clear() {
    this.baseObjectType = null;
    this.object = null;
  }

  public String getBaseObjectType() {
    return this.baseObjectType;
  }

  public UnspecifiedType setBaseObjectType(String baseObjectType) {
    this.baseObjectType = baseObjectType;
    return this;
  }

  public void unsetBaseObjectType() {
    this.baseObjectType = null;
  }

  /** Returns true if field baseObjectType is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseObjectType() {
    return this.baseObjectType != null;
  }

  public void setBaseObjectTypeIsSet(boolean value) {
    if (!value) {
      this.baseObjectType = null;
    }
  }

  public byte[] getObject() {
    setObject(org.apache.thrift.TBaseHelper.rightSize(object));
    return object == null ? null : object.array();
  }

  public ByteBuffer bufferForObject() {
    return org.apache.thrift.TBaseHelper.copyBinary(object);
  }

  public UnspecifiedType setObject(byte[] object) {
    this.object = object == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(object, object.length));
    return this;
  }

  public UnspecifiedType setObject(ByteBuffer object) {
    this.object = org.apache.thrift.TBaseHelper.copyBinary(object);
    return this;
  }

  public void unsetObject() {
    this.object = null;
  }

  /** Returns true if field object is set (has been assigned a value) and false otherwise */
  public boolean isSetObject() {
    return this.object != null;
  }

  public void setObjectIsSet(boolean value) {
    if (!value) {
      this.object = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BASE_OBJECT_TYPE:
      if (value == null) {
        unsetBaseObjectType();
      } else {
        setBaseObjectType((String)value);
      }
      break;

    case OBJECT:
      if (value == null) {
        unsetObject();
      } else {
        setObject((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE_OBJECT_TYPE:
      return getBaseObjectType();

    case OBJECT:
      return getObject();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BASE_OBJECT_TYPE:
      return isSetBaseObjectType();
    case OBJECT:
      return isSetObject();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UnspecifiedType)
      return this.equals((UnspecifiedType)that);
    return false;
  }

  public boolean equals(UnspecifiedType that) {
    if (that == null)
      return false;

    boolean this_present_baseObjectType = true && this.isSetBaseObjectType();
    boolean that_present_baseObjectType = true && that.isSetBaseObjectType();
    if (this_present_baseObjectType || that_present_baseObjectType) {
      if (!(this_present_baseObjectType && that_present_baseObjectType))
        return false;
      if (!this.baseObjectType.equals(that.baseObjectType))
        return false;
    }

    boolean this_present_object = true && this.isSetObject();
    boolean that_present_object = true && that.isSetObject();
    if (this_present_object || that_present_object) {
      if (!(this_present_object && that_present_object))
        return false;
      if (!this.object.equals(that.object))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_baseObjectType = true && (isSetBaseObjectType());
    list.add(present_baseObjectType);
    if (present_baseObjectType)
      list.add(baseObjectType);

    boolean present_object = true && (isSetObject());
    list.add(present_object);
    if (present_object)
      list.add(object);

    return list.hashCode();
  }

  @Override
  public int compareTo(UnspecifiedType other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBaseObjectType()).compareTo(other.isSetBaseObjectType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseObjectType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.baseObjectType, other.baseObjectType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetObject()).compareTo(other.isSetObject());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObject()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.object, other.object);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UnspecifiedType(");
    boolean first = true;

    sb.append("baseObjectType:");
    if (this.baseObjectType == null) {
      sb.append("null");
    } else {
      sb.append(this.baseObjectType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("object:");
    if (this.object == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.object, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (baseObjectType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'baseObjectType' was not present! Struct: " + toString());
    }
    if (object == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'object' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UnspecifiedTypeStandardSchemeFactory implements SchemeFactory {
    public UnspecifiedTypeStandardScheme getScheme() {
      return new UnspecifiedTypeStandardScheme();
    }
  }

  private static class UnspecifiedTypeStandardScheme extends StandardScheme<UnspecifiedType> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UnspecifiedType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BASE_OBJECT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.baseObjectType = iprot.readString();
              struct.setBaseObjectTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OBJECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.object = iprot.readBinary();
              struct.setObjectIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UnspecifiedType struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.baseObjectType != null) {
        oprot.writeFieldBegin(BASE_OBJECT_TYPE_FIELD_DESC);
        oprot.writeString(struct.baseObjectType);
        oprot.writeFieldEnd();
      }
      if (struct.object != null) {
        oprot.writeFieldBegin(OBJECT_FIELD_DESC);
        oprot.writeBinary(struct.object);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UnspecifiedTypeTupleSchemeFactory implements SchemeFactory {
    public UnspecifiedTypeTupleScheme getScheme() {
      return new UnspecifiedTypeTupleScheme();
    }
  }

  private static class UnspecifiedTypeTupleScheme extends TupleScheme<UnspecifiedType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UnspecifiedType struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.baseObjectType);
      oprot.writeBinary(struct.object);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UnspecifiedType struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.baseObjectType = iprot.readString();
      struct.setBaseObjectTypeIsSet(true);
      struct.object = iprot.readBinary();
      struct.setObjectIsSet(true);
    }
  }

}

