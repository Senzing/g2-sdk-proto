// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2engine.proto

package com.senzing.g2.engine.grpc.G2Engine;

/**
 * Protobuf type {@code g2engine.WhyEntities_V2Request}
 */
public final class WhyEntities_V2Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:g2engine.WhyEntities_V2Request)
    WhyEntities_V2RequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WhyEntities_V2Request.newBuilder() to construct.
  private WhyEntities_V2Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WhyEntities_V2Request() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WhyEntities_V2Request();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WhyEntities_V2Request(
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
          case 8: {

            entityID1_ = input.readInt64();
            break;
          }
          case 16: {

            entityID2_ = input.readInt64();
            break;
          }
          case 24: {

            flags_ = input.readInt64();
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
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyEntities_V2Request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyEntities_V2Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request.class, com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request.Builder.class);
  }

  public static final int ENTITYID1_FIELD_NUMBER = 1;
  private long entityID1_;
  /**
   * <code>int64 entityID1 = 1;</code>
   * @return The entityID1.
   */
  @java.lang.Override
  public long getEntityID1() {
    return entityID1_;
  }

  public static final int ENTITYID2_FIELD_NUMBER = 2;
  private long entityID2_;
  /**
   * <code>int64 entityID2 = 2;</code>
   * @return The entityID2.
   */
  @java.lang.Override
  public long getEntityID2() {
    return entityID2_;
  }

  public static final int FLAGS_FIELD_NUMBER = 3;
  private long flags_;
  /**
   * <code>int64 flags = 3;</code>
   * @return The flags.
   */
  @java.lang.Override
  public long getFlags() {
    return flags_;
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
    if (entityID1_ != 0L) {
      output.writeInt64(1, entityID1_);
    }
    if (entityID2_ != 0L) {
      output.writeInt64(2, entityID2_);
    }
    if (flags_ != 0L) {
      output.writeInt64(3, flags_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entityID1_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, entityID1_);
    }
    if (entityID2_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, entityID2_);
    }
    if (flags_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, flags_);
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
    if (!(obj instanceof com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request)) {
      return super.equals(obj);
    }
    com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request other = (com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request) obj;

    if (getEntityID1()
        != other.getEntityID1()) return false;
    if (getEntityID2()
        != other.getEntityID2()) return false;
    if (getFlags()
        != other.getFlags()) return false;
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
    hash = (37 * hash) + ENTITYID1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEntityID1());
    hash = (37 * hash) + ENTITYID2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEntityID2());
    hash = (37 * hash) + FLAGS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFlags());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parseFrom(
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
  public static Builder newBuilder(com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request prototype) {
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
   * Protobuf type {@code g2engine.WhyEntities_V2Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:g2engine.WhyEntities_V2Request)
      com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyEntities_V2Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyEntities_V2Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request.class, com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request.Builder.class);
    }

    // Construct using com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request.newBuilder()
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
      entityID1_ = 0L;

      entityID2_ = 0L;

      flags_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.senzing.g2.engine.grpc.G2Engine.G2EngineProto.internal_static_g2engine_WhyEntities_V2Request_descriptor;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request getDefaultInstanceForType() {
      return com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request.getDefaultInstance();
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request build() {
      com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request buildPartial() {
      com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request result = new com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request(this);
      result.entityID1_ = entityID1_;
      result.entityID2_ = entityID2_;
      result.flags_ = flags_;
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
      if (other instanceof com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request) {
        return mergeFrom((com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request other) {
      if (other == com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request.getDefaultInstance()) return this;
      if (other.getEntityID1() != 0L) {
        setEntityID1(other.getEntityID1());
      }
      if (other.getEntityID2() != 0L) {
        setEntityID2(other.getEntityID2());
      }
      if (other.getFlags() != 0L) {
        setFlags(other.getFlags());
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
      com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long entityID1_ ;
    /**
     * <code>int64 entityID1 = 1;</code>
     * @return The entityID1.
     */
    @java.lang.Override
    public long getEntityID1() {
      return entityID1_;
    }
    /**
     * <code>int64 entityID1 = 1;</code>
     * @param value The entityID1 to set.
     * @return This builder for chaining.
     */
    public Builder setEntityID1(long value) {
      
      entityID1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 entityID1 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityID1() {
      
      entityID1_ = 0L;
      onChanged();
      return this;
    }

    private long entityID2_ ;
    /**
     * <code>int64 entityID2 = 2;</code>
     * @return The entityID2.
     */
    @java.lang.Override
    public long getEntityID2() {
      return entityID2_;
    }
    /**
     * <code>int64 entityID2 = 2;</code>
     * @param value The entityID2 to set.
     * @return This builder for chaining.
     */
    public Builder setEntityID2(long value) {
      
      entityID2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 entityID2 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityID2() {
      
      entityID2_ = 0L;
      onChanged();
      return this;
    }

    private long flags_ ;
    /**
     * <code>int64 flags = 3;</code>
     * @return The flags.
     */
    @java.lang.Override
    public long getFlags() {
      return flags_;
    }
    /**
     * <code>int64 flags = 3;</code>
     * @param value The flags to set.
     * @return This builder for chaining.
     */
    public Builder setFlags(long value) {
      
      flags_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 flags = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlags() {
      
      flags_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:g2engine.WhyEntities_V2Request)
  }

  // @@protoc_insertion_point(class_scope:g2engine.WhyEntities_V2Request)
  private static final com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request();
  }

  public static com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WhyEntities_V2Request>
      PARSER = new com.google.protobuf.AbstractParser<WhyEntities_V2Request>() {
    @java.lang.Override
    public WhyEntities_V2Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WhyEntities_V2Request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WhyEntities_V2Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WhyEntities_V2Request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.senzing.g2.engine.grpc.G2Engine.WhyEntities_V2Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
