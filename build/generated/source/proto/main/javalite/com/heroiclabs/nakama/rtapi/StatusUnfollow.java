// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * Stop receiving status updates for some set of users.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.StatusUnfollow}
 */
public  final class StatusUnfollow extends
    com.google.protobuf.GeneratedMessageLite<
        StatusUnfollow, StatusUnfollow.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.StatusUnfollow)
    StatusUnfollowOrBuilder {
  private StatusUnfollow() {
    userIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  public static final int USER_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<String> userIds_;
  /**
   * <pre>
   * Users to unfollow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  public java.util.List<String> getUserIdsList() {
    return userIds_;
  }
  /**
   * <pre>
   * Users to unfollow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  public int getUserIdsCount() {
    return userIds_.size();
  }
  /**
   * <pre>
   * Users to unfollow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  public java.lang.String getUserIds(int index) {
    return userIds_.get(index);
  }
  /**
   * <pre>
   * Users to unfollow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdsBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        userIds_.get(index));
  }
  private void ensureUserIdsIsMutable() {
    if (!userIds_.isModifiable()) {
      userIds_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(userIds_);
     }
  }
  /**
   * <pre>
   * Users to unfollow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  private void setUserIds(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureUserIdsIsMutable();
    userIds_.set(index, value);
  }
  /**
   * <pre>
   * Users to unfollow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  private void addUserIds(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureUserIdsIsMutable();
    userIds_.add(value);
  }
  /**
   * <pre>
   * Users to unfollow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  private void addAllUserIds(
      java.lang.Iterable<java.lang.String> values) {
    ensureUserIdsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, userIds_);
  }
  /**
   * <pre>
   * Users to unfollow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  private void clearUserIds() {
    userIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * Users to unfollow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  private void addUserIdsBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    ensureUserIdsIsMutable();
    userIds_.add(value.toStringUtf8());
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < userIds_.size(); i++) {
      output.writeString(1, userIds_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < userIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(userIds_.get(i));
      }
      size += dataSize;
      size += 1 * getUserIdsList().size();
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.StatusUnfollow parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.StatusUnfollow prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Stop receiving status updates for some set of users.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.StatusUnfollow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.rtapi.StatusUnfollow, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.StatusUnfollow)
      com.heroiclabs.nakama.rtapi.StatusUnfollowOrBuilder {
    // Construct using com.heroiclabs.nakama.rtapi.StatusUnfollow.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Users to unfollow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public java.util.List<String>
        getUserIdsList() {
      return java.util.Collections.unmodifiableList(
          instance.getUserIdsList());
    }
    /**
     * <pre>
     * Users to unfollow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public int getUserIdsCount() {
      return instance.getUserIdsCount();
    }
    /**
     * <pre>
     * Users to unfollow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public java.lang.String getUserIds(int index) {
      return instance.getUserIds(index);
    }
    /**
     * <pre>
     * Users to unfollow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdsBytes(int index) {
      return instance.getUserIdsBytes(index);
    }
    /**
     * <pre>
     * Users to unfollow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public Builder setUserIds(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setUserIds(index, value);
      return this;
    }
    /**
     * <pre>
     * Users to unfollow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public Builder addUserIds(
        java.lang.String value) {
      copyOnWrite();
      instance.addUserIds(value);
      return this;
    }
    /**
     * <pre>
     * Users to unfollow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public Builder addAllUserIds(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllUserIds(values);
      return this;
    }
    /**
     * <pre>
     * Users to unfollow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public Builder clearUserIds() {
      copyOnWrite();
      instance.clearUserIds();
      return this;
    }
    /**
     * <pre>
     * Users to unfollow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public Builder addUserIdsBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addUserIdsBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.StatusUnfollow)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.rtapi.StatusUnfollow();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        userIds_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.rtapi.StatusUnfollow other = (com.heroiclabs.nakama.rtapi.StatusUnfollow) arg1;
        userIds_= visitor.visitList(userIds_, other.userIds_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();
                if (!userIds_.isModifiable()) {
                  userIds_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(userIds_);
                }
                userIds_.add(s);
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.rtapi.StatusUnfollow.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:nakama.realtime.StatusUnfollow)
  private static final com.heroiclabs.nakama.rtapi.StatusUnfollow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StatusUnfollow();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.rtapi.StatusUnfollow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StatusUnfollow> PARSER;

  public static com.google.protobuf.Parser<StatusUnfollow> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
