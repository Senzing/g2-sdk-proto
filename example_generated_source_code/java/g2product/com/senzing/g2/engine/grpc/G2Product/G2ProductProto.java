// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: g2product.proto

package com.senzing.g2.engine.grpc.G2Product;

public final class G2ProductProto {
  private G2ProductProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_DestroyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_DestroyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_DestroyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_DestroyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_InitRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_InitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_InitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_InitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_LicenseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_LicenseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_LicenseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_LicenseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ValidateLicenseFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ValidateLicenseFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ValidateLicenseFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ValidateLicenseFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ValidateLicenseStringBase64Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ValidateLicenseStringBase64Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_ValidateLicenseStringBase64Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_ValidateLicenseStringBase64Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_VersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_VersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_g2product_VersionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_g2product_VersionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017g2product.proto\022\tg2product\"\020\n\016DestroyR" +
      "equest\"\021\n\017DestroyResponse\"L\n\013InitRequest" +
      "\022\022\n\nmoduleName\030\001 \001(\t\022\021\n\tiniParams\030\002 \001(\t\022" +
      "\026\n\016verboseLogging\030\003 \001(\005\"\016\n\014InitResponse\"" +
      "\020\n\016LicenseRequest\"!\n\017LicenseResponse\022\016\n\006" +
      "result\030\001 \001(\t\"5\n\032ValidateLicenseFileReque" +
      "st\022\027\n\017licenseFilePath\030\001 \001(\t\"-\n\033ValidateL" +
      "icenseFileResponse\022\016\n\006result\030\001 \001(\t\";\n\"Va" +
      "lidateLicenseStringBase64Request\022\025\n\rlice" +
      "nseString\030\001 \001(\t\"5\n#ValidateLicenseString" +
      "Base64Response\022\016\n\006result\030\001 \001(\t\"\020\n\016Versio" +
      "nRequest\"!\n\017VersionResponse\022\016\n\006result\030\001 " +
      "\001(\t2\372\003\n\tG2Product\022B\n\007Destroy\022\031.g2product" +
      ".DestroyRequest\032\032.g2product.DestroyRespo" +
      "nse\"\000\0229\n\004Init\022\026.g2product.InitRequest\032\027." +
      "g2product.InitResponse\"\000\022B\n\007License\022\031.g2" +
      "product.LicenseRequest\032\032.g2product.Licen" +
      "seResponse\"\000\022f\n\023ValidateLicenseFile\022%.g2" +
      "product.ValidateLicenseFileRequest\032&.g2p" +
      "roduct.ValidateLicenseFileResponse\"\000\022~\n\033" +
      "ValidateLicenseStringBase64\022-.g2product." +
      "ValidateLicenseStringBase64Request\032..g2p" +
      "roduct.ValidateLicenseStringBase64Respon" +
      "se\"\000\022B\n\007Version\022\031.g2product.VersionReque" +
      "st\032\032.g2product.VersionResponse\"\000Be\n$com." +
      "senzing.g2.engine.grpc.G2ProductB\016G2Prod" +
      "uctProtoP\001Z+github.com/senzing/g2-sdk-go" +
      "-grpc/g2productb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_g2product_DestroyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_g2product_DestroyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_DestroyRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_DestroyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_g2product_DestroyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_DestroyResponse_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_InitRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_g2product_InitRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_InitRequest_descriptor,
        new java.lang.String[] { "ModuleName", "IniParams", "VerboseLogging", });
    internal_static_g2product_InitResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_g2product_InitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_InitResponse_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_LicenseRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_g2product_LicenseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_LicenseRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_LicenseResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_g2product_LicenseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_LicenseResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_g2product_ValidateLicenseFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_g2product_ValidateLicenseFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ValidateLicenseFileRequest_descriptor,
        new java.lang.String[] { "LicenseFilePath", });
    internal_static_g2product_ValidateLicenseFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_g2product_ValidateLicenseFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ValidateLicenseFileResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_g2product_ValidateLicenseStringBase64Request_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_g2product_ValidateLicenseStringBase64Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ValidateLicenseStringBase64Request_descriptor,
        new java.lang.String[] { "LicenseString", });
    internal_static_g2product_ValidateLicenseStringBase64Response_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_g2product_ValidateLicenseStringBase64Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_ValidateLicenseStringBase64Response_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_g2product_VersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_g2product_VersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_VersionRequest_descriptor,
        new java.lang.String[] { });
    internal_static_g2product_VersionResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_g2product_VersionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_g2product_VersionResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}