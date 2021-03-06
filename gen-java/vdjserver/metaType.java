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
public class metaType implements org.apache.thrift.TBase<metaType, metaType._Fields>, java.io.Serializable, Cloneable, Comparable<metaType> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("metaType");

  private static final org.apache.thrift.protocol.TField ALIGNER_FIELD_DESC = new org.apache.thrift.protocol.TField("aligner", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField GENERATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("generator", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField GERMLINE_DB_FIELD_DESC = new org.apache.thrift.protocol.TField("germline_db", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new metaTypeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new metaTypeTupleSchemeFactory());
  }

  public alignerType aligner; // optional
  public generatorType generator; // required
  public germline_dbType germline_db; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ALIGNER((short)1, "aligner"),
    GENERATOR((short)2, "generator"),
    GERMLINE_DB((short)3, "germline_db");

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
        case 1: // ALIGNER
          return ALIGNER;
        case 2: // GENERATOR
          return GENERATOR;
        case 3: // GERMLINE_DB
          return GERMLINE_DB;
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
  private static final _Fields optionals[] = {_Fields.ALIGNER,_Fields.GERMLINE_DB};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ALIGNER, new org.apache.thrift.meta_data.FieldMetaData("aligner", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, alignerType.class)));
    tmpMap.put(_Fields.GENERATOR, new org.apache.thrift.meta_data.FieldMetaData("generator", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, generatorType.class)));
    tmpMap.put(_Fields.GERMLINE_DB, new org.apache.thrift.meta_data.FieldMetaData("germline_db", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, germline_dbType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(metaType.class, metaDataMap);
  }

  public metaType() {
  }

  public metaType(
    generatorType generator)
  {
    this();
    this.generator = generator;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public metaType(metaType other) {
    if (other.isSetAligner()) {
      this.aligner = new alignerType(other.aligner);
    }
    if (other.isSetGenerator()) {
      this.generator = new generatorType(other.generator);
    }
    if (other.isSetGermline_db()) {
      this.germline_db = new germline_dbType(other.germline_db);
    }
  }

  public metaType deepCopy() {
    return new metaType(this);
  }

  @Override
  public void clear() {
    this.aligner = null;
    this.generator = null;
    this.germline_db = null;
  }

  public alignerType getAligner() {
    return this.aligner;
  }

  public metaType setAligner(alignerType aligner) {
    this.aligner = aligner;
    return this;
  }

  public void unsetAligner() {
    this.aligner = null;
  }

  /** Returns true if field aligner is set (has been assigned a value) and false otherwise */
  public boolean isSetAligner() {
    return this.aligner != null;
  }

  public void setAlignerIsSet(boolean value) {
    if (!value) {
      this.aligner = null;
    }
  }

  public generatorType getGenerator() {
    return this.generator;
  }

  public metaType setGenerator(generatorType generator) {
    this.generator = generator;
    return this;
  }

  public void unsetGenerator() {
    this.generator = null;
  }

  /** Returns true if field generator is set (has been assigned a value) and false otherwise */
  public boolean isSetGenerator() {
    return this.generator != null;
  }

  public void setGeneratorIsSet(boolean value) {
    if (!value) {
      this.generator = null;
    }
  }

  public germline_dbType getGermline_db() {
    return this.germline_db;
  }

  public metaType setGermline_db(germline_dbType germline_db) {
    this.germline_db = germline_db;
    return this;
  }

  public void unsetGermline_db() {
    this.germline_db = null;
  }

  /** Returns true if field germline_db is set (has been assigned a value) and false otherwise */
  public boolean isSetGermline_db() {
    return this.germline_db != null;
  }

  public void setGermline_dbIsSet(boolean value) {
    if (!value) {
      this.germline_db = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ALIGNER:
      if (value == null) {
        unsetAligner();
      } else {
        setAligner((alignerType)value);
      }
      break;

    case GENERATOR:
      if (value == null) {
        unsetGenerator();
      } else {
        setGenerator((generatorType)value);
      }
      break;

    case GERMLINE_DB:
      if (value == null) {
        unsetGermline_db();
      } else {
        setGermline_db((germline_dbType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ALIGNER:
      return getAligner();

    case GENERATOR:
      return getGenerator();

    case GERMLINE_DB:
      return getGermline_db();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ALIGNER:
      return isSetAligner();
    case GENERATOR:
      return isSetGenerator();
    case GERMLINE_DB:
      return isSetGermline_db();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof metaType)
      return this.equals((metaType)that);
    return false;
  }

  public boolean equals(metaType that) {
    if (that == null)
      return false;

    boolean this_present_aligner = true && this.isSetAligner();
    boolean that_present_aligner = true && that.isSetAligner();
    if (this_present_aligner || that_present_aligner) {
      if (!(this_present_aligner && that_present_aligner))
        return false;
      if (!this.aligner.equals(that.aligner))
        return false;
    }

    boolean this_present_generator = true && this.isSetGenerator();
    boolean that_present_generator = true && that.isSetGenerator();
    if (this_present_generator || that_present_generator) {
      if (!(this_present_generator && that_present_generator))
        return false;
      if (!this.generator.equals(that.generator))
        return false;
    }

    boolean this_present_germline_db = true && this.isSetGermline_db();
    boolean that_present_germline_db = true && that.isSetGermline_db();
    if (this_present_germline_db || that_present_germline_db) {
      if (!(this_present_germline_db && that_present_germline_db))
        return false;
      if (!this.germline_db.equals(that.germline_db))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_aligner = true && (isSetAligner());
    list.add(present_aligner);
    if (present_aligner)
      list.add(aligner);

    boolean present_generator = true && (isSetGenerator());
    list.add(present_generator);
    if (present_generator)
      list.add(generator);

    boolean present_germline_db = true && (isSetGermline_db());
    list.add(present_germline_db);
    if (present_germline_db)
      list.add(germline_db);

    return list.hashCode();
  }

  @Override
  public int compareTo(metaType other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAligner()).compareTo(other.isSetAligner());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAligner()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aligner, other.aligner);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGenerator()).compareTo(other.isSetGenerator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGenerator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.generator, other.generator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGermline_db()).compareTo(other.isSetGermline_db());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGermline_db()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.germline_db, other.germline_db);
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
    StringBuilder sb = new StringBuilder("metaType(");
    boolean first = true;

    if (isSetAligner()) {
      sb.append("aligner:");
      if (this.aligner == null) {
        sb.append("null");
      } else {
        sb.append(this.aligner);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("generator:");
    if (this.generator == null) {
      sb.append("null");
    } else {
      sb.append(this.generator);
    }
    first = false;
    if (isSetGermline_db()) {
      if (!first) sb.append(", ");
      sb.append("germline_db:");
      if (this.germline_db == null) {
        sb.append("null");
      } else {
        sb.append(this.germline_db);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (generator == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'generator' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (aligner != null) {
      aligner.validate();
    }
    if (generator != null) {
      generator.validate();
    }
    if (germline_db != null) {
      germline_db.validate();
    }
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

  private static class metaTypeStandardSchemeFactory implements SchemeFactory {
    public metaTypeStandardScheme getScheme() {
      return new metaTypeStandardScheme();
    }
  }

  private static class metaTypeStandardScheme extends StandardScheme<metaType> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, metaType struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ALIGNER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.aligner = new alignerType();
              struct.aligner.read(iprot);
              struct.setAlignerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GENERATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.generator = new generatorType();
              struct.generator.read(iprot);
              struct.setGeneratorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GERMLINE_DB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.germline_db = new germline_dbType();
              struct.germline_db.read(iprot);
              struct.setGermline_dbIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, metaType struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.aligner != null) {
        if (struct.isSetAligner()) {
          oprot.writeFieldBegin(ALIGNER_FIELD_DESC);
          struct.aligner.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.generator != null) {
        oprot.writeFieldBegin(GENERATOR_FIELD_DESC);
        struct.generator.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.germline_db != null) {
        if (struct.isSetGermline_db()) {
          oprot.writeFieldBegin(GERMLINE_DB_FIELD_DESC);
          struct.germline_db.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class metaTypeTupleSchemeFactory implements SchemeFactory {
    public metaTypeTupleScheme getScheme() {
      return new metaTypeTupleScheme();
    }
  }

  private static class metaTypeTupleScheme extends TupleScheme<metaType> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, metaType struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.generator.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetAligner()) {
        optionals.set(0);
      }
      if (struct.isSetGermline_db()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAligner()) {
        struct.aligner.write(oprot);
      }
      if (struct.isSetGermline_db()) {
        struct.germline_db.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, metaType struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.generator = new generatorType();
      struct.generator.read(iprot);
      struct.setGeneratorIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.aligner = new alignerType();
        struct.aligner.read(iprot);
        struct.setAlignerIsSet(true);
      }
      if (incoming.get(1)) {
        struct.germline_db = new germline_dbType();
        struct.germline_db.read(iprot);
        struct.setGermline_dbIsSet(true);
      }
    }
  }

}

