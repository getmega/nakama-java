// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.heroiclabs.nakama.api;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.Event)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * An event name, type, category, or identifier.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * An event name, type, category, or identifier.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Arbitrary event property values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * Arbitrary event property values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */
  boolean containsProperties(
      java.lang.String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getProperties();
  /**
   * <pre>
   * Arbitrary event property values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPropertiesMap();
  /**
   * <pre>
   * Arbitrary event property values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Arbitrary event property values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2;</code>
   */

  java.lang.String getPropertiesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The time when the event was triggered.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * The time when the event was triggered.
   * </pre>
   *
   * <code>optional .google.protobuf.Timestamp timestamp = 3;</code>
   */
  com.google.protobuf.Timestamp getTimestamp();

  /**
   * <pre>
   * True if the event came directly from a client call, false otherwise.
   * </pre>
   *
   * <code>optional bool external = 4;</code>
   */
  boolean getExternal();
}
