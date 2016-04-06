/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.curator.generated;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeleteSpec implements org.apache.thrift.TBase<DeleteSpec, DeleteSpec._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeleteSpec");

  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GUARANTEED_FIELD_DESC = new org.apache.thrift.protocol.TField("guaranteed", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField ASYNC_CONTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("asyncContext", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteSpecTupleSchemeFactory());
  }

  public String path; // required
  public boolean guaranteed; // required
  public String asyncContext; // required
  public Version version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PATH((short)1, "path"),
    GUARANTEED((short)2, "guaranteed"),
    ASYNC_CONTEXT((short)3, "asyncContext"),
    VERSION((short)4, "version");

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
        case 1: // PATH
          return PATH;
        case 2: // GUARANTEED
          return GUARANTEED;
        case 3: // ASYNC_CONTEXT
          return ASYNC_CONTEXT;
        case 4: // VERSION
          return VERSION;
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
  private static final int __GUARANTEED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GUARANTEED, new org.apache.thrift.meta_data.FieldMetaData("guaranteed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ASYNC_CONTEXT, new org.apache.thrift.meta_data.FieldMetaData("asyncContext", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Version.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeleteSpec.class, metaDataMap);
  }

  public DeleteSpec() {
  }

  public DeleteSpec(
    String path,
    boolean guaranteed,
    String asyncContext,
    Version version)
  {
    this();
    this.path = path;
    this.guaranteed = guaranteed;
    setGuaranteedIsSet(true);
    this.asyncContext = asyncContext;
    this.version = version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteSpec(DeleteSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPath()) {
      this.path = other.path;
    }
    this.guaranteed = other.guaranteed;
    if (other.isSetAsyncContext()) {
      this.asyncContext = other.asyncContext;
    }
    if (other.isSetVersion()) {
      this.version = new Version(other.version);
    }
  }

  public DeleteSpec deepCopy() {
    return new DeleteSpec(this);
  }

  @Override
  public void clear() {
    this.path = null;
    setGuaranteedIsSet(false);
    this.guaranteed = false;
    this.asyncContext = null;
    this.version = null;
  }

  public String getPath() {
    return this.path;
  }

  public DeleteSpec setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public boolean isGuaranteed() {
    return this.guaranteed;
  }

  public DeleteSpec setGuaranteed(boolean guaranteed) {
    this.guaranteed = guaranteed;
    setGuaranteedIsSet(true);
    return this;
  }

  public void unsetGuaranteed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GUARANTEED_ISSET_ID);
  }

  /** Returns true if field guaranteed is set (has been assigned a value) and false otherwise */
  public boolean isSetGuaranteed() {
    return EncodingUtils.testBit(__isset_bitfield, __GUARANTEED_ISSET_ID);
  }

  public void setGuaranteedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GUARANTEED_ISSET_ID, value);
  }

  public String getAsyncContext() {
    return this.asyncContext;
  }

  public DeleteSpec setAsyncContext(String asyncContext) {
    this.asyncContext = asyncContext;
    return this;
  }

  public void unsetAsyncContext() {
    this.asyncContext = null;
  }

  /** Returns true if field asyncContext is set (has been assigned a value) and false otherwise */
  public boolean isSetAsyncContext() {
    return this.asyncContext != null;
  }

  public void setAsyncContextIsSet(boolean value) {
    if (!value) {
      this.asyncContext = null;
    }
  }

  public Version getVersion() {
    return this.version;
  }

  public DeleteSpec setVersion(Version version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case GUARANTEED:
      if (value == null) {
        unsetGuaranteed();
      } else {
        setGuaranteed((Boolean)value);
      }
      break;

    case ASYNC_CONTEXT:
      if (value == null) {
        unsetAsyncContext();
      } else {
        setAsyncContext((String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Version)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PATH:
      return getPath();

    case GUARANTEED:
      return Boolean.valueOf(isGuaranteed());

    case ASYNC_CONTEXT:
      return getAsyncContext();

    case VERSION:
      return getVersion();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PATH:
      return isSetPath();
    case GUARANTEED:
      return isSetGuaranteed();
    case ASYNC_CONTEXT:
      return isSetAsyncContext();
    case VERSION:
      return isSetVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteSpec)
      return this.equals((DeleteSpec)that);
    return false;
  }

  public boolean equals(DeleteSpec that) {
    if (that == null)
      return false;

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_guaranteed = true;
    boolean that_present_guaranteed = true;
    if (this_present_guaranteed || that_present_guaranteed) {
      if (!(this_present_guaranteed && that_present_guaranteed))
        return false;
      if (this.guaranteed != that.guaranteed)
        return false;
    }

    boolean this_present_asyncContext = true && this.isSetAsyncContext();
    boolean that_present_asyncContext = true && that.isSetAsyncContext();
    if (this_present_asyncContext || that_present_asyncContext) {
      if (!(this_present_asyncContext && that_present_asyncContext))
        return false;
      if (!this.asyncContext.equals(that.asyncContext))
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(DeleteSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, other.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGuaranteed()).compareTo(other.isSetGuaranteed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGuaranteed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.guaranteed, other.guaranteed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAsyncContext()).compareTo(other.isSetAsyncContext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAsyncContext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.asyncContext, other.asyncContext);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
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
    StringBuilder sb = new StringBuilder("DeleteSpec(");
    boolean first = true;

    sb.append("path:");
    if (this.path == null) {
      sb.append("null");
    } else {
      sb.append(this.path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("guaranteed:");
    sb.append(this.guaranteed);
    first = false;
    if (!first) sb.append(", ");
    sb.append("asyncContext:");
    if (this.asyncContext == null) {
      sb.append("null");
    } else {
      sb.append(this.asyncContext);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (version != null) {
      version.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DeleteSpecStandardSchemeFactory implements SchemeFactory {
    public DeleteSpecStandardScheme getScheme() {
      return new DeleteSpecStandardScheme();
    }
  }

  private static class DeleteSpecStandardScheme extends StandardScheme<DeleteSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DeleteSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.path = iprot.readString();
              struct.setPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GUARANTEED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.guaranteed = iprot.readBool();
              struct.setGuaranteedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ASYNC_CONTEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.asyncContext = iprot.readString();
              struct.setAsyncContextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.version = new Version();
              struct.version.read(iprot);
              struct.setVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DeleteSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.path != null) {
        oprot.writeFieldBegin(PATH_FIELD_DESC);
        oprot.writeString(struct.path);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(GUARANTEED_FIELD_DESC);
      oprot.writeBool(struct.guaranteed);
      oprot.writeFieldEnd();
      if (struct.asyncContext != null) {
        oprot.writeFieldBegin(ASYNC_CONTEXT_FIELD_DESC);
        oprot.writeString(struct.asyncContext);
        oprot.writeFieldEnd();
      }
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        struct.version.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeleteSpecTupleSchemeFactory implements SchemeFactory {
    public DeleteSpecTupleScheme getScheme() {
      return new DeleteSpecTupleScheme();
    }
  }

  private static class DeleteSpecTupleScheme extends TupleScheme<DeleteSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeleteSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPath()) {
        optionals.set(0);
      }
      if (struct.isSetGuaranteed()) {
        optionals.set(1);
      }
      if (struct.isSetAsyncContext()) {
        optionals.set(2);
      }
      if (struct.isSetVersion()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPath()) {
        oprot.writeString(struct.path);
      }
      if (struct.isSetGuaranteed()) {
        oprot.writeBool(struct.guaranteed);
      }
      if (struct.isSetAsyncContext()) {
        oprot.writeString(struct.asyncContext);
      }
      if (struct.isSetVersion()) {
        struct.version.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeleteSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.path = iprot.readString();
        struct.setPathIsSet(true);
      }
      if (incoming.get(1)) {
        struct.guaranteed = iprot.readBool();
        struct.setGuaranteedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.asyncContext = iprot.readString();
        struct.setAsyncContextIsSet(true);
      }
      if (incoming.get(3)) {
        struct.version = new Version();
        struct.version.read(iprot);
        struct.setVersionIsSet(true);
      }
    }
  }

}

