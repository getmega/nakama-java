// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * List friends for a user.
 * </pre>
 *
 * Protobuf type {@code nakama.api.ListFriendsRequest}
 */
public  final class ListFriendsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListFriendsRequest, ListFriendsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.ListFriendsRequest)
    ListFriendsRequestOrBuilder {
  private ListFriendsRequest() {
    cursor_ = "";
  }
  public static final int LIMIT_FIELD_NUMBER = 1;
  private com.google.protobuf.Int32Value limit_;
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  public boolean hasLimit() {
    return limit_ != null;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  public com.google.protobuf.Int32Value getLimit() {
    return limit_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : limit_;
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  private void setLimit(com.google.protobuf.Int32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    limit_ = value;
    
    }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  private void setLimit(
      com.google.protobuf.Int32Value.Builder builderForValue) {
    limit_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  private void mergeLimit(com.google.protobuf.Int32Value value) {
    if (limit_ != null &&
        limit_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      limit_ =
        com.google.protobuf.Int32Value.newBuilder(limit_).mergeFrom(value).buildPartial();
    } else {
      limit_ = value;
    }
    
  }
  /**
   * <pre>
   * Max number of records to return. Between 1 and 100.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value limit = 1;</code>
   */
  private void clearLimit() {  limit_ = null;
    
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value state_;
  /**
   * <pre>
   * The friend state to list.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  public boolean hasState() {
    return state_ != null;
  }
  /**
   * <pre>
   * The friend state to list.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  public com.google.protobuf.Int32Value getState() {
    return state_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : state_;
  }
  /**
   * <pre>
   * The friend state to list.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  private void setState(com.google.protobuf.Int32Value value) {
    if (value == null) {
      throw new NullPointerException();
    }
    state_ = value;
    
    }
  /**
   * <pre>
   * The friend state to list.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  private void setState(
      com.google.protobuf.Int32Value.Builder builderForValue) {
    state_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * The friend state to list.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  private void mergeState(com.google.protobuf.Int32Value value) {
    if (state_ != null &&
        state_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      state_ =
        com.google.protobuf.Int32Value.newBuilder(state_).mergeFrom(value).buildPartial();
    } else {
      state_ = value;
    }
    
  }
  /**
   * <pre>
   * The friend state to list.
   * </pre>
   *
   * <code>optional .google.protobuf.Int32Value state = 2;</code>
   */
  private void clearState() {  state_ = null;
    
  }

  public static final int CURSOR_FIELD_NUMBER = 3;
  private java.lang.String cursor_;
  /**
   * <pre>
   * An optional next page cursor.
   * </pre>
   *
   * <code>optional string cursor = 3;</code>
   */
  public java.lang.String getCursor() {
    return cursor_;
  }
  /**
   * <pre>
   * An optional next page cursor.
   * </pre>
   *
   * <code>optional string cursor = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCursorBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(cursor_);
  }
  /**
   * <pre>
   * An optional next page cursor.
   * </pre>
   *
   * <code>optional string cursor = 3;</code>
   */
  private void setCursor(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    cursor_ = value;
  }
  /**
   * <pre>
   * An optional next page cursor.
   * </pre>
   *
   * <code>optional string cursor = 3;</code>
   */
  private void clearCursor() {
    
    cursor_ = getDefaultInstance().getCursor();
  }
  /**
   * <pre>
   * An optional next page cursor.
   * </pre>
   *
   * <code>optional string cursor = 3;</code>
   */
  private void setCursorBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    cursor_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (limit_ != null) {
      output.writeMessage(1, getLimit());
    }
    if (state_ != null) {
      output.writeMessage(2, getState());
    }
    if (!cursor_.isEmpty()) {
      output.writeString(3, getCursor());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (limit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLimit());
    }
    if (state_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getState());
    }
    if (!cursor_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getCursor());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.ListFriendsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListFriendsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListFriendsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ListFriendsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListFriendsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListFriendsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListFriendsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListFriendsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ListFriendsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ListFriendsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.ListFriendsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * List friends for a user.
   * </pre>
   *
   * Protobuf type {@code nakama.api.ListFriendsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.ListFriendsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ListFriendsRequest)
      com.heroiclabs.nakama.api.ListFriendsRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.ListFriendsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public boolean hasLimit() {
      return instance.hasLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public com.google.protobuf.Int32Value getLimit() {
      return instance.getLimit();
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public Builder setLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setLimit(value);
      return this;
      }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public Builder setLimit(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setLimit(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public Builder mergeLimit(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeLimit(value);
      return this;
    }
    /**
     * <pre>
     * Max number of records to return. Between 1 and 100.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value limit = 1;</code>
     */
    public Builder clearLimit() {  copyOnWrite();
      instance.clearLimit();
      return this;
    }

    /**
     * <pre>
     * The friend state to list.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public boolean hasState() {
      return instance.hasState();
    }
    /**
     * <pre>
     * The friend state to list.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public com.google.protobuf.Int32Value getState() {
      return instance.getState();
    }
    /**
     * <pre>
     * The friend state to list.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public Builder setState(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setState(value);
      return this;
      }
    /**
     * <pre>
     * The friend state to list.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public Builder setState(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setState(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The friend state to list.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public Builder mergeState(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeState(value);
      return this;
    }
    /**
     * <pre>
     * The friend state to list.
     * </pre>
     *
     * <code>optional .google.protobuf.Int32Value state = 2;</code>
     */
    public Builder clearState() {  copyOnWrite();
      instance.clearState();
      return this;
    }

    /**
     * <pre>
     * An optional next page cursor.
     * </pre>
     *
     * <code>optional string cursor = 3;</code>
     */
    public java.lang.String getCursor() {
      return instance.getCursor();
    }
    /**
     * <pre>
     * An optional next page cursor.
     * </pre>
     *
     * <code>optional string cursor = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCursorBytes() {
      return instance.getCursorBytes();
    }
    /**
     * <pre>
     * An optional next page cursor.
     * </pre>
     *
     * <code>optional string cursor = 3;</code>
     */
    public Builder setCursor(
        java.lang.String value) {
      copyOnWrite();
      instance.setCursor(value);
      return this;
    }
    /**
     * <pre>
     * An optional next page cursor.
     * </pre>
     *
     * <code>optional string cursor = 3;</code>
     */
    public Builder clearCursor() {
      copyOnWrite();
      instance.clearCursor();
      return this;
    }
    /**
     * <pre>
     * An optional next page cursor.
     * </pre>
     *
     * <code>optional string cursor = 3;</code>
     */
    public Builder setCursorBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCursorBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ListFriendsRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.ListFriendsRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.ListFriendsRequest other = (com.heroiclabs.nakama.api.ListFriendsRequest) arg1;
        limit_ = visitor.visitMessage(limit_, other.limit_);
        state_ = visitor.visitMessage(state_, other.state_);
        cursor_ = visitor.visitString(!cursor_.isEmpty(), cursor_,
            !other.cursor_.isEmpty(), other.cursor_);
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
                com.google.protobuf.Int32Value.Builder subBuilder = null;
                if (limit_ != null) {
                  subBuilder = limit_.toBuilder();
                }
                limit_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(limit_);
                  limit_ = subBuilder.buildPartial();
                }

                break;
              }
              case 18: {
                com.google.protobuf.Int32Value.Builder subBuilder = null;
                if (state_ != null) {
                  subBuilder = state_.toBuilder();
                }
                state_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(state_);
                  state_ = subBuilder.buildPartial();
                }

                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                cursor_ = s;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.ListFriendsRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.ListFriendsRequest)
  private static final com.heroiclabs.nakama.api.ListFriendsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListFriendsRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.ListFriendsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListFriendsRequest> PARSER;

  public static com.google.protobuf.Parser<ListFriendsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

