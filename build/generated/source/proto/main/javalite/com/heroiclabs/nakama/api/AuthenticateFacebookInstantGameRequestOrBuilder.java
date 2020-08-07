// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

public interface AuthenticateFacebookInstantGameRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.api.AuthenticateFacebookInstantGameRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The Facebook Instant Game account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountFacebookInstantGame account = 1;</code>
   */
  boolean hasAccount();
  /**
   * <pre>
   * The Facebook Instant Game account details.
   * </pre>
   *
   * <code>optional .nakama.api.AccountFacebookInstantGame account = 1;</code>
   */
  com.heroiclabs.nakama.api.AccountFacebookInstantGame getAccount();

  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Register the account if the user does not already exist.
   * </pre>
   *
   * <code>optional .google.protobuf.BoolValue create = 2;</code>
   */
  com.google.protobuf.BoolValue getCreate();

  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>optional string username = 3;</code>
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * Set the username on the account at register. Must be unique.
   * </pre>
   *
   * <code>optional string username = 3;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();
}
