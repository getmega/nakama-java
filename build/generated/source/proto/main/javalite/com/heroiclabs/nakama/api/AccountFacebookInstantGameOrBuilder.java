// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface AccountFacebookInstantGameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AccountFacebookInstantGame)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The OAuth token received from a Facebook Instant Game that may be decoded with the Application Secret (must be available with the nakama configuration)
   * </pre>
   *
   * <code>optional string signed_player_info = 1;</code>
   */
  java.lang.String getSignedPlayerInfo();
  /**
   * <pre>
   * The OAuth token received from a Facebook Instant Game that may be decoded with the Application Secret (must be available with the nakama configuration)
   * </pre>
   *
   * <code>optional string signed_player_info = 1;</code>
   */
  com.google.protobuf.ByteString
      getSignedPlayerInfoBytes();

  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */
  int getVarsCount();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */
  boolean containsVars(
      java.lang.String key);
  /**
   * Use {@link #getVarsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getVars();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getVarsMap();
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */

  java.lang.String getVarsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */

  java.lang.String getVarsOrThrow(
      java.lang.String key);
}
