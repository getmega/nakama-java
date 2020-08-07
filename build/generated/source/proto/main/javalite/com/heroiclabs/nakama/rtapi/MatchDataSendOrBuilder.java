// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

public interface MatchDataSendOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.MatchDataSend)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  java.lang.String getMatchId();
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getMatchIdBytes();

  /**
   * <pre>
   * Op code value.
   * </pre>
   *
   * <code>optional int64 op_code = 2;</code>
   */
  long getOpCode();

  /**
   * <pre>
   * Data payload, if any.
   * </pre>
   *
   * <code>optional bytes data = 3;</code>
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> 
      getPresencesList();
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  com.heroiclabs.nakama.rtapi.UserPresence getPresences(int index);
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  int getPresencesCount();

  /**
   * <pre>
   * True if the data should be sent reliably, false otherwise.
   * </pre>
   *
   * <code>optional bool reliable = 5;</code>
   */
  boolean getReliable();
}
