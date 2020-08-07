// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

public interface ChannelMessageSendOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.ChannelMessageSend)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The channel to sent to.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  java.lang.String getChannelId();
  /**
   * <pre>
   * The channel to sent to.
   * </pre>
   *
   * <code>optional string channel_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getChannelIdBytes();

  /**
   * <pre>
   * Message content.
   * </pre>
   *
   * <code>optional string content = 2;</code>
   */
  java.lang.String getContent();
  /**
   * <pre>
   * Message content.
   * </pre>
   *
   * <code>optional string content = 2;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();
}