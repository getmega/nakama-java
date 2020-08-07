// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

public interface ChannelMessageRemoveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.ChannelMessageRemove)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The channel the message was sent to.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  java.lang.String getChannelId();
  /**
   * <pre>
   * The channel the message was sent to.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <pre>
   * The ID assigned to the message to update.
   * </pre>
   *
   * <code>optional string message_id = 2;</code>
   */
  java.lang.String getMessageId();
  /**
   * <pre>
   * The ID assigned to the message to update.
   * </pre>
   *
   * <code>optional string message_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();
}
