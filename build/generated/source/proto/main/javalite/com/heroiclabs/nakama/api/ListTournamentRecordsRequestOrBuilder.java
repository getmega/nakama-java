// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface ListTournamentRecordsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.ListTournamentRecordsRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The ID of the tournament to list for.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  java.lang.String getTournamentId();
  /**
   * <pre>
   * The ID of the tournament to list for.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getTournamentIdBytes();

  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  java.util.List<String>
      getOwnerIdsList();
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  int getOwnerIdsCount();
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  java.lang.String getOwnerIds(int index);
  /**
   * <pre>
   * One or more owners to retrieve records for.
   * </pre>
   *
   * <code>repeated string owner_ids = 2;</code>
   */
  com.google.protobuf.ByteString
      getOwnerIdsBytes(int index);

  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  boolean hasLimit();
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 3;</code>
   */
  com.google.protobuf.Int32Value getLimit();

  /**
   * <pre>
   * A next or previous page cursor.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  java.lang.String getCursor();
  /**
   * <pre>
   * A next or previous page cursor.
   * </pre>
   *
   * <code>optional string cursor = 4;</code>
   */
  com.google.protobuf.ByteString
      getCursorBytes();

  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 5;</code>
   */
  boolean hasExpiry();
  /**
   * <pre>
   * Expiry in seconds (since epoch) to begin fetching records from.
   * </pre>
   *
   * <code>optional .google.protobuf.Int64Value expiry = 5;</code>
   */
  com.google.protobuf.Int64Value getExpiry();
}
