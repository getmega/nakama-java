// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

public interface ChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.Channel)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The ID of the channel.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID of the channel.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The users currently in the channel.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 2;</code>
   */
  java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> 
      getPresencesList();
  /**
   * <pre>
   * The users currently in the channel.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 2;</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresence getPresences(int index);
  /**
   * <pre>
   * The users currently in the channel.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 2;</code>
   */
  int getPresencesCount();

  /**
   * <pre>
   * A reference to the current user's presence in the channel.
   * </pre>
   *
   * <code>optional .nakama.realtime.UserPresence self = 3;</code>
   */
  boolean hasSelf();
  /**
   * <pre>
   * A reference to the current user's presence in the channel.
   * </pre>
   *
   * <code>optional .nakama.realtime.UserPresence self = 3;</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresence getSelf();

  /**
   * <pre>
   * The name of the chat room, or an empty string if this message was not sent through a chat room.
   * </pre>
   *
   * <code>optional string room_name = 4;</code>
   */
  java.lang.String getRoomName();
  /**
   * <pre>
   * The name of the chat room, or an empty string if this message was not sent through a chat room.
   * </pre>
   *
   * <code>optional string room_name = 4;</code>
   */
  com.google.protobuf.ByteString
      getRoomNameBytes();

  /**
   * <pre>
   * The ID of the group, or an empty string if this message was not sent through a group channel.
   * </pre>
   *
   * <code>optional string group_id = 5;</code>
   */
  java.lang.String getGroupId();
  /**
   * <pre>
   * The ID of the group, or an empty string if this message was not sent through a group channel.
   * </pre>
   *
   * <code>optional string group_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getGroupIdBytes();

  /**
   * <pre>
   * The ID of the first DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>optional string user_id_one = 6;</code>
   */
  java.lang.String getUserIdOne();
  /**
   * <pre>
   * The ID of the first DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>optional string user_id_one = 6;</code>
   */
  com.google.protobuf.ByteString
      getUserIdOneBytes();

  /**
   * <pre>
   * The ID of the second DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>optional string user_id_two = 7;</code>
   */
  java.lang.String getUserIdTwo();
  /**
   * <pre>
   * The ID of the second DM user, or an empty string if this message was not sent through a DM chat.
   * </pre>
   *
   * <code>optional string user_id_two = 7;</code>
   */
  com.google.protobuf.ByteString
      getUserIdTwoBytes();
}
