// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcDemo.proto

package com.ccl.grpc.api;

public final class RPCDateServiceApi {
  private RPCDateServiceApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ccl_grpc_api_RPCDateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ccl_grpc_api_RPCDateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ccl_grpc_api_RPCDateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ccl_grpc_api_RPCDateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016GrpcDemo.proto\022\020com.ccl.grpc.api\"\"\n\016RP" +
      "CDateRequest\022\020\n\010userName\030\001 \001(\t\"%\n\017RPCDat" +
      "eResponse\022\022\n\nserverDate\030\001 \001(\t2b\n\016RPCDate" +
      "Service\022P\n\007getDate\022 .com.ccl.grpc.api.RP" +
      "CDateRequest\032!.com.ccl.grpc.api.RPCDateR" +
      "esponse\"\000B\'\n\020com.ccl.grpc.apiB\021RPCDateSe" +
      "rviceApiP\001b\006proto3"
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
    internal_static_com_ccl_grpc_api_RPCDateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ccl_grpc_api_RPCDateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ccl_grpc_api_RPCDateRequest_descriptor,
        new java.lang.String[] { "UserName", });
    internal_static_com_ccl_grpc_api_RPCDateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ccl_grpc_api_RPCDateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ccl_grpc_api_RPCDateResponse_descriptor,
        new java.lang.String[] { "ServerDate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}