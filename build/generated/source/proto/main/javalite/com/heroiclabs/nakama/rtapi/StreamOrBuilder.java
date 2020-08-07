// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

public interface StreamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.Stream)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Mode identifies the type of stream.
   * </pre>
   *
   * <code>optional int32 mode = 1;</code>
   */
  int getMode();

  /**
   * <pre>
   * Subject is the primary identifier, if any.
   * </pre>
   *
   * <code>optional string subject = 2;</code>
   */
  java.lang.String getSubject();
  /**
   * <pre>
   * Subject is the primary identifier, if any.
   * </pre>
   *
   * <code>optional string subject = 2;</code>
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <pre>
   * Subcontext is a secondary identifier, if any.
   * </pre>
   *
   * <code>optional string subcontext = 3;</code>
   */
  java.lang.String getSubcontext();
  /**
   * <pre>
   * Subcontext is a secondary identifier, if any.
   * </pre>
   *
   * <code>optional string subcontext = 3;</code>
   */
  com.google.protobuf.ByteString
      getSubcontextBytes();

  /**
   * <pre>
   * The label is an arbitrary identifying string, if the stream has one.
   * </pre>
   *
   * <code>optional string label = 4;</code>
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * The label is an arbitrary identifying string, if the stream has one.
   * </pre>
   *
   * <code>optional string label = 4;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();
}
