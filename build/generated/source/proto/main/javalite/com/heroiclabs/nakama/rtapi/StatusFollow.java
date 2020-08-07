// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * Start receiving status updates for some set of users.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.StatusFollow}
 */
public  final class StatusFollow extends
    com.google.protobuf.GeneratedMessageLite<
        StatusFollow, StatusFollow.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.StatusFollow)
    StatusFollowOrBuilder {
  private StatusFollow() {
    userIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    usernames_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  public static final int USER_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<String> userIds_;
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  public java.util.List<String> getUserIdsList() {
    return userIds_;
  }
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  public int getUserIdsCount() {
    return userIds_.size();
  }
  /**
   * <pre>
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  public java.lang.String getUserIds(int index) {
    return userIds_.get(index);
  }
  /**
   * <pre>
   * User IDs to follow.
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
   * User IDs to follow.
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
   * User IDs to follow.
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
   * User IDs to follow.
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
   * User IDs to follow.
   * </pre>
   *
   * <code>repeated string user_ids = 1;</code>
   */
  private void clearUserIds() {
    userIds_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * User IDs to follow.
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

  public static final int USERNAMES_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<String> usernames_;
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  public java.util.List<String> getUsernamesList() {
    return usernames_;
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  public int getUsernamesCount() {
    return usernames_.size();
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  public java.lang.String getUsernames(int index) {
    return usernames_.get(index);
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUsernamesBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        usernames_.get(index));
  }
  private void ensureUsernamesIsMutable() {
    if (!usernames_.isModifiable()) {
      usernames_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(usernames_);
     }
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void setUsernames(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureUsernamesIsMutable();
    usernames_.set(index, value);
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void addUsernames(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureUsernamesIsMutable();
    usernames_.add(value);
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void addAllUsernames(
      java.lang.Iterable<java.lang.String> values) {
    ensureUsernamesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, usernames_);
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void clearUsernames() {
    usernames_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * Usernames to follow.
   * </pre>
   *
   * <code>repeated string usernames = 2;</code>
   */
  private void addUsernamesBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    ensureUsernamesIsMutable();
    usernames_.add(value.toStringUtf8());
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < userIds_.size(); i++) {
      output.writeString(1, userIds_.get(i));
    }
    for (int i = 0; i < usernames_.size(); i++) {
      output.writeString(2, usernames_.get(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < usernames_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(usernames_.get(i));
      }
      size += dataSize;
      size += 1 * getUsernamesList().size();
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.rtapi.StatusFollow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.StatusFollow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusFollow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.StatusFollow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusFollow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.StatusFollow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusFollow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.StatusFollow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.StatusFollow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.StatusFollow parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.StatusFollow prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Start receiving status updates for some set of users.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.StatusFollow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.rtapi.StatusFollow, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.StatusFollow)
      com.heroiclabs.nakama.rtapi.StatusFollowOrBuilder {
    // Construct using com.heroiclabs.nakama.rtapi.StatusFollow.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * User IDs to follow.
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
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public int getUserIdsCount() {
      return instance.getUserIdsCount();
    }
    /**
     * <pre>
     * User IDs to follow.
     * </pre>
     *
     * <code>repeated string user_ids = 1;</code>
     */
    public java.lang.String getUserIds(int index) {
      return instance.getUserIds(index);
    }
    /**
     * <pre>
     * User IDs to follow.
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
     * User IDs to follow.
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
     * User IDs to follow.
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
     * User IDs to follow.
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
     * User IDs to follow.
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
     * User IDs to follow.
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

    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public java.util.List<String>
        getUsernamesList() {
      return java.util.Collections.unmodifiableList(
          instance.getUsernamesList());
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public int getUsernamesCount() {
      return instance.getUsernamesCount();
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public java.lang.String getUsernames(int index) {
      return instance.getUsernames(index);
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernamesBytes(int index) {
      return instance.getUsernamesBytes(index);
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder setUsernames(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setUsernames(index, value);
      return this;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder addUsernames(
        java.lang.String value) {
      copyOnWrite();
      instance.addUsernames(value);
      return this;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder addAllUsernames(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllUsernames(values);
      return this;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder clearUsernames() {
      copyOnWrite();
      instance.clearUsernames();
      return this;
    }
    /**
     * <pre>
     * Usernames to follow.
     * </pre>
     *
     * <code>repeated string usernames = 2;</code>
     */
    public Builder addUsernamesBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addUsernamesBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.StatusFollow)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.rtapi.StatusFollow();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        userIds_.makeImmutable();
        usernames_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.rtapi.StatusFollow other = (com.heroiclabs.nakama.rtapi.StatusFollow) arg1;
        userIds_= visitor.visitList(userIds_, other.userIds_);
        usernames_= visitor.visitList(usernames_, other.usernames_);
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
              case 18: {
                String s = input.readStringRequireUtf8();
                if (!usernames_.isModifiable()) {
                  usernames_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(usernames_);
                }
                usernames_.add(s);
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.rtapi.StatusFollow.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.realtime.StatusFollow)
  private static final com.heroiclabs.nakama.rtapi.StatusFollow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new StatusFollow();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.rtapi.StatusFollow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StatusFollow> PARSER;

  public static com.google.protobuf.Parser<StatusFollow> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
