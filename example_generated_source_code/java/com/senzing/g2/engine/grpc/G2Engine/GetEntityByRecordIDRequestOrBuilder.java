// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2engine.proto

package com.senzing.g2.engine.grpc.G2Engine;

public interface GetEntityByRecordIDRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:g2engine.GetEntityByRecordIDRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string dataSourceCode = 1;</code>
   * @return The dataSourceCode.
   */
  java.lang.String getDataSourceCode();
  /**
   * <code>string dataSourceCode = 1;</code>
   * @return The bytes for dataSourceCode.
   */
  com.google.protobuf.ByteString
      getDataSourceCodeBytes();

  /**
   * <code>string recordID = 2;</code>
   * @return The recordID.
   */
  java.lang.String getRecordID();
  /**
   * <code>string recordID = 2;</code>
   * @return The bytes for recordID.
   */
  com.google.protobuf.ByteString
      getRecordIDBytes();
}
