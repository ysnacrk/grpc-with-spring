// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProductService.proto

package com.ysnacrk.grpcclient;

public final class ProductServiceOuterClass {
  private ProductServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ysnacrk_grpcclient_AddProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ysnacrk_grpcclient_AddProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ysnacrk_grpcclient_AddProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ysnacrk_grpcclient_AddProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ysnacrk_grpcclient_GetProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ysnacrk_grpcclient_GetProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ysnacrk_grpcclient_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ysnacrk_grpcclient_Product_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ProductService.proto\022\026com.ysnacrk.grpc" +
      "client\"3\n\021AddProductRequest\022\014\n\004code\030\001 \001(" +
      "\t\022\020\n\010quantity\030\002 \001(\t\" \n\022AddProductRespons" +
      "e\022\n\n\002id\030\001 \001(\t\"\037\n\021GetProductRequest\022\n\n\002id" +
      "\030\001 \001(\t\"5\n\007Product\022\n\n\002id\030\001 \001(\t\022\020\n\010quantit" +
      "y\030\002 \001(\t\022\014\n\004code\030\003 \001(\t2\317\001\n\016ProductService" +
      "\022c\n\naddProduct\022).com.ysnacrk.grpcclient." +
      "AddProductRequest\032*.com.ysnacrk.grpcclie" +
      "nt.AddProductResponse\022X\n\ngetProduct\022).co" +
      "m.ysnacrk.grpcclient.GetProductRequest\032\037",
      ".com.ysnacrk.grpcclient.ProductB\002P\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_ysnacrk_grpcclient_AddProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ysnacrk_grpcclient_AddProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ysnacrk_grpcclient_AddProductRequest_descriptor,
        new java.lang.String[] { "Code", "Quantity", });
    internal_static_com_ysnacrk_grpcclient_AddProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ysnacrk_grpcclient_AddProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ysnacrk_grpcclient_AddProductResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_ysnacrk_grpcclient_GetProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_ysnacrk_grpcclient_GetProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ysnacrk_grpcclient_GetProductRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_ysnacrk_grpcclient_Product_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_ysnacrk_grpcclient_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ysnacrk_grpcclient_Product_descriptor,
        new java.lang.String[] { "Id", "Quantity", "Code", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}