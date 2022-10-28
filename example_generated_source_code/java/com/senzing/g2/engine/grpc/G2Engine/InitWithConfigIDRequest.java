// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2engine.proto

package com.senzing.g2.engine.grpc.G2Engine;

/**
 * Protobuf type {@code g2engine.InitWithConfigIDRequest}
 */
public final class InitWithConfigIDRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:g2engine.InitWithConfigIDRequest)
    InitWithConfigIDRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InitWithConfigIDRequest.newBuilder() to construct.
  private InitWithConfigIDRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InitWithConfigIDRequest() {
    moduleName_ = "";
    iniParams_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InitWithConfigIDRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InitWithConfigIDRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            moduleName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            iniParams_ = s;
            break;
          }
          case 24: {

            initConfigID_ = input.readInt64();
            break;
          }
          case 32: {

            verboseLogging_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_InitWithConfigIDRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_InitWithConfigIDRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest.class, com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest.Builder.class);
  }

  public static final int MODULENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object moduleName_;
  /**
   * <code>string moduleName = 1;</code>
   * @return The moduleName.
   */
  @java.lang.Override
  public java.lang.String getModuleName() {
    java.lang.Object ref = moduleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      moduleName_ = s;
      return s;
    }
  }
  /**
   * <code>string moduleName = 1;</code>
   * @return The bytes for moduleName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModuleNameBytes() {
    java.lang.Object ref = moduleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      moduleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INIPARAMS_FIELD_NUMBER = 2;
  private volatile java.lang.Object iniParams_;
  /**
   * <code>string iniParams = 2;</code>
   * @return The iniParams.
   */
  @java.lang.Override
  public java.lang.String getIniParams() {
    java.lang.Object ref = iniParams_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iniParams_ = s;
      return s;
    }
  }
  /**
   * <code>string iniParams = 2;</code>
   * @return The bytes for iniParams.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIniParamsBytes() {
    java.lang.Object ref = iniParams_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iniParams_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INITCONFIGID_FIELD_NUMBER = 3;
  private long initConfigID_;
  /**
   * <code>int64 initConfigID = 3;</code>
   * @return The initConfigID.
   */
  @java.lang.Override
  public long getInitConfigID() {
    return initConfigID_;
  }

  public static final int VERBOSELOGGING_FIELD_NUMBER = 4;
  private int verboseLogging_;
  /**
   * <code>int32 verboseLogging = 4;</code>
   * @return The verboseLogging.
   */
  @java.lang.Override
  public int getVerboseLogging() {
    return verboseLogging_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(moduleName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, moduleName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iniParams_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, iniParams_);
    }
    if (initConfigID_ != 0L) {
      output.writeInt64(3, initConfigID_);
    }
    if (verboseLogging_ != 0) {
      output.writeInt32(4, verboseLogging_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(moduleName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, moduleName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iniParams_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, iniParams_);
    }
    if (initConfigID_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, initConfigID_);
    }
    if (verboseLogging_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, verboseLogging_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest)) {
      return super.equals(obj);
    }
    com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest other = (com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest) obj;

    if (!getModuleName()
        .equals(other.getModuleName())) return false;
    if (!getIniParams()
        .equals(other.getIniParams())) return false;
    if (getInitConfigID()
        != other.getInitConfigID()) return false;
    if (getVerboseLogging()
        != other.getVerboseLogging()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MODULENAME_FIELD_NUMBER;
    hash = (53 * hash) + getModuleName().hashCode();
    hash = (37 * hash) + INIPARAMS_FIELD_NUMBER;
    hash = (53 * hash) + getIniParams().hashCode();
    hash = (37 * hash) + INITCONFIGID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInitConfigID());
    hash = (37 * hash) + VERBOSELOGGING_FIELD_NUMBER;
    hash = (53 * hash) + getVerboseLogging();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code g2engine.InitWithConfigIDRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:g2engine.InitWithConfigIDRequest)
      com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_InitWithConfigIDRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_InitWithConfigIDRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest.class, com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest.Builder.class);
    }

    // Construct using com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      moduleName_ = "";

      iniParams_ = "";

      initConfigID_ = 0L;

      verboseLogging_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_InitWithConfigIDRequest_descriptor;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest getDefaultInstanceForType() {
      return com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest build() {
      com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest buildPartial() {
      com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest result = new com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest(this);
      result.moduleName_ = moduleName_;
      result.iniParams_ = iniParams_;
      result.initConfigID_ = initConfigID_;
      result.verboseLogging_ = verboseLogging_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest) {
        return mergeFrom((com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest other) {
      if (other == com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest.getDefaultInstance()) return this;
      if (!other.getModuleName().isEmpty()) {
        moduleName_ = other.moduleName_;
        onChanged();
      }
      if (!other.getIniParams().isEmpty()) {
        iniParams_ = other.iniParams_;
        onChanged();
      }
      if (other.getInitConfigID() != 0L) {
        setInitConfigID(other.getInitConfigID());
      }
      if (other.getVerboseLogging() != 0) {
        setVerboseLogging(other.getVerboseLogging());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object moduleName_ = "";
    /**
     * <code>string moduleName = 1;</code>
     * @return The moduleName.
     */
    public java.lang.String getModuleName() {
      java.lang.Object ref = moduleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moduleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string moduleName = 1;</code>
     * @return The bytes for moduleName.
     */
    public com.google.protobuf.ByteString
        getModuleNameBytes() {
      java.lang.Object ref = moduleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moduleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string moduleName = 1;</code>
     * @param value The moduleName to set.
     * @return This builder for chaining.
     */
    public Builder setModuleName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      moduleName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string moduleName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModuleName() {
      
      moduleName_ = getDefaultInstance().getModuleName();
      onChanged();
      return this;
    }
    /**
     * <code>string moduleName = 1;</code>
     * @param value The bytes for moduleName to set.
     * @return This builder for chaining.
     */
    public Builder setModuleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      moduleName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object iniParams_ = "";
    /**
     * <code>string iniParams = 2;</code>
     * @return The iniParams.
     */
    public java.lang.String getIniParams() {
      java.lang.Object ref = iniParams_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iniParams_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string iniParams = 2;</code>
     * @return The bytes for iniParams.
     */
    public com.google.protobuf.ByteString
        getIniParamsBytes() {
      java.lang.Object ref = iniParams_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iniParams_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string iniParams = 2;</code>
     * @param value The iniParams to set.
     * @return This builder for chaining.
     */
    public Builder setIniParams(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      iniParams_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string iniParams = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIniParams() {
      
      iniParams_ = getDefaultInstance().getIniParams();
      onChanged();
      return this;
    }
    /**
     * <code>string iniParams = 2;</code>
     * @param value The bytes for iniParams to set.
     * @return This builder for chaining.
     */
    public Builder setIniParamsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      iniParams_ = value;
      onChanged();
      return this;
    }

    private long initConfigID_ ;
    /**
     * <code>int64 initConfigID = 3;</code>
     * @return The initConfigID.
     */
    @java.lang.Override
    public long getInitConfigID() {
      return initConfigID_;
    }
    /**
     * <code>int64 initConfigID = 3;</code>
     * @param value The initConfigID to set.
     * @return This builder for chaining.
     */
    public Builder setInitConfigID(long value) {
      
      initConfigID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 initConfigID = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearInitConfigID() {
      
      initConfigID_ = 0L;
      onChanged();
      return this;
    }

    private int verboseLogging_ ;
    /**
     * <code>int32 verboseLogging = 4;</code>
     * @return The verboseLogging.
     */
    @java.lang.Override
    public int getVerboseLogging() {
      return verboseLogging_;
    }
    /**
     * <code>int32 verboseLogging = 4;</code>
     * @param value The verboseLogging to set.
     * @return This builder for chaining.
     */
    public Builder setVerboseLogging(int value) {
      
      verboseLogging_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 verboseLogging = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearVerboseLogging() {
      
      verboseLogging_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:g2engine.InitWithConfigIDRequest)
  }

  // @@protoc_insertion_point(class_scope:g2engine.InitWithConfigIDRequest)
  private static final com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest();
  }

  public static com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitWithConfigIDRequest>
      PARSER = new com.google.protobuf.AbstractParser<InitWithConfigIDRequest>() {
    @java.lang.Override
    public InitWithConfigIDRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InitWithConfigIDRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InitWithConfigIDRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitWithConfigIDRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.senzing.g2.engine.grpc.G2Engine.InitWithConfigIDRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

