// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2diagnostic.proto

package com.senzing.g2.engine.grpc.G2Diagnostic;

public interface GetEntityDetailsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:g2diagnostic.GetEntityDetailsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 entityID = 1;</code>
   * @return The entityID.
   */
  long getEntityID();

  /**
   * <code>int32 includeInternalFeatures = 2;</code>
   * @return The includeInternalFeatures.
   */
  int getIncludeInternalFeatures();
}