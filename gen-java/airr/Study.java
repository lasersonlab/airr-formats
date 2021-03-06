/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package airr;

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
public class Study implements org.apache.thrift.TBase<Study, Study._Fields>, java.io.Serializable, Cloneable, Comparable<Study> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Study");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LAB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("labName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CORRESPONDENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("correspondence", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DOI_FIELD_DESC = new org.apache.thrift.protocol.TField("doi", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StudyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StudyTupleSchemeFactory());
  }

  public String id; // optional
  public String title; // optional
  public String labName; // optional
  public String correspondence; // optional
  public String doi; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    TITLE((short)2, "title"),
    LAB_NAME((short)3, "labName"),
    CORRESPONDENCE((short)4, "correspondence"),
    DOI((short)5, "doi");

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
        case 1: // ID
          return ID;
        case 2: // TITLE
          return TITLE;
        case 3: // LAB_NAME
          return LAB_NAME;
        case 4: // CORRESPONDENCE
          return CORRESPONDENCE;
        case 5: // DOI
          return DOI;
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
  private static final _Fields optionals[] = {_Fields.ID,_Fields.TITLE,_Fields.LAB_NAME,_Fields.CORRESPONDENCE,_Fields.DOI};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAB_NAME, new org.apache.thrift.meta_data.FieldMetaData("labName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CORRESPONDENCE, new org.apache.thrift.meta_data.FieldMetaData("correspondence", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOI, new org.apache.thrift.meta_data.FieldMetaData("doi", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Study.class, metaDataMap);
  }

  public Study() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Study(Study other) {
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetLabName()) {
      this.labName = other.labName;
    }
    if (other.isSetCorrespondence()) {
      this.correspondence = other.correspondence;
    }
    if (other.isSetDoi()) {
      this.doi = other.doi;
    }
  }

  public Study deepCopy() {
    return new Study(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.title = null;
    this.labName = null;
    this.correspondence = null;
    this.doi = null;
  }

  public String getId() {
    return this.id;
  }

  public Study setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public String getTitle() {
    return this.title;
  }

  public Study setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getLabName() {
    return this.labName;
  }

  public Study setLabName(String labName) {
    this.labName = labName;
    return this;
  }

  public void unsetLabName() {
    this.labName = null;
  }

  /** Returns true if field labName is set (has been assigned a value) and false otherwise */
  public boolean isSetLabName() {
    return this.labName != null;
  }

  public void setLabNameIsSet(boolean value) {
    if (!value) {
      this.labName = null;
    }
  }

  public String getCorrespondence() {
    return this.correspondence;
  }

  public Study setCorrespondence(String correspondence) {
    this.correspondence = correspondence;
    return this;
  }

  public void unsetCorrespondence() {
    this.correspondence = null;
  }

  /** Returns true if field correspondence is set (has been assigned a value) and false otherwise */
  public boolean isSetCorrespondence() {
    return this.correspondence != null;
  }

  public void setCorrespondenceIsSet(boolean value) {
    if (!value) {
      this.correspondence = null;
    }
  }

  public String getDoi() {
    return this.doi;
  }

  public Study setDoi(String doi) {
    this.doi = doi;
    return this;
  }

  public void unsetDoi() {
    this.doi = null;
  }

  /** Returns true if field doi is set (has been assigned a value) and false otherwise */
  public boolean isSetDoi() {
    return this.doi != null;
  }

  public void setDoiIsSet(boolean value) {
    if (!value) {
      this.doi = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case LAB_NAME:
      if (value == null) {
        unsetLabName();
      } else {
        setLabName((String)value);
      }
      break;

    case CORRESPONDENCE:
      if (value == null) {
        unsetCorrespondence();
      } else {
        setCorrespondence((String)value);
      }
      break;

    case DOI:
      if (value == null) {
        unsetDoi();
      } else {
        setDoi((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TITLE:
      return getTitle();

    case LAB_NAME:
      return getLabName();

    case CORRESPONDENCE:
      return getCorrespondence();

    case DOI:
      return getDoi();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case TITLE:
      return isSetTitle();
    case LAB_NAME:
      return isSetLabName();
    case CORRESPONDENCE:
      return isSetCorrespondence();
    case DOI:
      return isSetDoi();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Study)
      return this.equals((Study)that);
    return false;
  }

  public boolean equals(Study that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_labName = true && this.isSetLabName();
    boolean that_present_labName = true && that.isSetLabName();
    if (this_present_labName || that_present_labName) {
      if (!(this_present_labName && that_present_labName))
        return false;
      if (!this.labName.equals(that.labName))
        return false;
    }

    boolean this_present_correspondence = true && this.isSetCorrespondence();
    boolean that_present_correspondence = true && that.isSetCorrespondence();
    if (this_present_correspondence || that_present_correspondence) {
      if (!(this_present_correspondence && that_present_correspondence))
        return false;
      if (!this.correspondence.equals(that.correspondence))
        return false;
    }

    boolean this_present_doi = true && this.isSetDoi();
    boolean that_present_doi = true && that.isSetDoi();
    if (this_present_doi || that_present_doi) {
      if (!(this_present_doi && that_present_doi))
        return false;
      if (!this.doi.equals(that.doi))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_labName = true && (isSetLabName());
    list.add(present_labName);
    if (present_labName)
      list.add(labName);

    boolean present_correspondence = true && (isSetCorrespondence());
    list.add(present_correspondence);
    if (present_correspondence)
      list.add(correspondence);

    boolean present_doi = true && (isSetDoi());
    list.add(present_doi);
    if (present_doi)
      list.add(doi);

    return list.hashCode();
  }

  @Override
  public int compareTo(Study other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLabName()).compareTo(other.isSetLabName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLabName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.labName, other.labName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCorrespondence()).compareTo(other.isSetCorrespondence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCorrespondence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.correspondence, other.correspondence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDoi()).compareTo(other.isSetDoi());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDoi()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.doi, other.doi);
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
    StringBuilder sb = new StringBuilder("Study(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        sb.append(this.id);
      }
      first = false;
    }
    if (isSetTitle()) {
      if (!first) sb.append(", ");
      sb.append("title:");
      if (this.title == null) {
        sb.append("null");
      } else {
        sb.append(this.title);
      }
      first = false;
    }
    if (isSetLabName()) {
      if (!first) sb.append(", ");
      sb.append("labName:");
      if (this.labName == null) {
        sb.append("null");
      } else {
        sb.append(this.labName);
      }
      first = false;
    }
    if (isSetCorrespondence()) {
      if (!first) sb.append(", ");
      sb.append("correspondence:");
      if (this.correspondence == null) {
        sb.append("null");
      } else {
        sb.append(this.correspondence);
      }
      first = false;
    }
    if (isSetDoi()) {
      if (!first) sb.append(", ");
      sb.append("doi:");
      if (this.doi == null) {
        sb.append("null");
      } else {
        sb.append(this.doi);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class StudyStandardSchemeFactory implements SchemeFactory {
    public StudyStandardScheme getScheme() {
      return new StudyStandardScheme();
    }
  }

  private static class StudyStandardScheme extends StandardScheme<Study> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Study struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.labName = iprot.readString();
              struct.setLabNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CORRESPONDENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.correspondence = iprot.readString();
              struct.setCorrespondenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DOI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.doi = iprot.readString();
              struct.setDoiIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Study struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeString(struct.id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.title != null) {
        if (struct.isSetTitle()) {
          oprot.writeFieldBegin(TITLE_FIELD_DESC);
          oprot.writeString(struct.title);
          oprot.writeFieldEnd();
        }
      }
      if (struct.labName != null) {
        if (struct.isSetLabName()) {
          oprot.writeFieldBegin(LAB_NAME_FIELD_DESC);
          oprot.writeString(struct.labName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.correspondence != null) {
        if (struct.isSetCorrespondence()) {
          oprot.writeFieldBegin(CORRESPONDENCE_FIELD_DESC);
          oprot.writeString(struct.correspondence);
          oprot.writeFieldEnd();
        }
      }
      if (struct.doi != null) {
        if (struct.isSetDoi()) {
          oprot.writeFieldBegin(DOI_FIELD_DESC);
          oprot.writeString(struct.doi);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StudyTupleSchemeFactory implements SchemeFactory {
    public StudyTupleScheme getScheme() {
      return new StudyTupleScheme();
    }
  }

  private static class StudyTupleScheme extends TupleScheme<Study> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Study struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetLabName()) {
        optionals.set(2);
      }
      if (struct.isSetCorrespondence()) {
        optionals.set(3);
      }
      if (struct.isSetDoi()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetLabName()) {
        oprot.writeString(struct.labName);
      }
      if (struct.isSetCorrespondence()) {
        oprot.writeString(struct.correspondence);
      }
      if (struct.isSetDoi()) {
        oprot.writeString(struct.doi);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Study struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.labName = iprot.readString();
        struct.setLabNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.correspondence = iprot.readString();
        struct.setCorrespondenceIsSet(true);
      }
      if (incoming.get(4)) {
        struct.doi = iprot.readString();
        struct.setDoiIsSet(true);
      }
    }
  }

}

