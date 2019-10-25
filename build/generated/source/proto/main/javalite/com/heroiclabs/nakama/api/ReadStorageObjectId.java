// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Storage objects to get.
 * </pre>
 *
 * Protobuf type {@code nakama.api.ReadStorageObjectId}
 */
public  final class ReadStorageObjectId extends
    com.google.protobuf.GeneratedMessageLite<
        ReadStorageObjectId, ReadStorageObjectId.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.ReadStorageObjectId)
    ReadStorageObjectIdOrBuilder {
  private ReadStorageObjectId() {
    collection_ = "";
    key_ = "";
    userId_ = "";
  }
  public static final int COLLECTION_FIELD_NUMBER = 1;
  private java.lang.String collection_;
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  public java.lang.String getCollection() {
    return collection_;
  }
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCollectionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(collection_);
  }
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  private void setCollection(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    collection_ = value;
  }
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  private void clearCollection() {
    
    collection_ = getDefaultInstance().getCollection();
  }
  /**
   * <pre>
   * The collection which stores the object.
   * </pre>
   *
   * <code>optional string collection = 1;</code>
   */
  private void setCollectionBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    collection_ = value.toStringUtf8();
  }

  public static final int KEY_FIELD_NUMBER = 2;
  private java.lang.String key_;
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  public java.lang.String getKey() {
    return key_;
  }
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getKeyBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(key_);
  }
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  private void setKey(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    key_ = value;
  }
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  private void clearKey() {
    
    key_ = getDefaultInstance().getKey();
  }
  /**
   * <pre>
   * The key of the object within the collection.
   * </pre>
   *
   * <code>optional string key = 2;</code>
   */
  private void setKeyBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    key_ = value.toStringUtf8();
  }

  public static final int USER_ID_FIELD_NUMBER = 3;
  private java.lang.String userId_;
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  public java.lang.String getUserId() {
    return userId_;
  }
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userId_);
  }
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  private void setUserId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    userId_ = value;
  }
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  private void clearUserId() {
    
    userId_ = getDefaultInstance().getUserId();
  }
  /**
   * <pre>
   * The user owner of the object.
   * </pre>
   *
   * <code>optional string user_id = 3;</code>
   */
  private void setUserIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    userId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!collection_.isEmpty()) {
      output.writeString(1, getCollection());
    }
    if (!key_.isEmpty()) {
      output.writeString(2, getKey());
    }
    if (!userId_.isEmpty()) {
      output.writeString(3, getUserId());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!collection_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getCollection());
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getKey());
    }
    if (!userId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getUserId());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.ReadStorageObjectId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.ReadStorageObjectId prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Storage objects to get.
   * </pre>
   *
   * Protobuf type {@code nakama.api.ReadStorageObjectId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.ReadStorageObjectId, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.ReadStorageObjectId)
      com.heroiclabs.nakama.api.ReadStorageObjectIdOrBuilder {
    // Construct using com.heroiclabs.nakama.api.ReadStorageObjectId.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public java.lang.String getCollection() {
      return instance.getCollection();
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCollectionBytes() {
      return instance.getCollectionBytes();
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public Builder setCollection(
        java.lang.String value) {
      copyOnWrite();
      instance.setCollection(value);
      return this;
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public Builder clearCollection() {
      copyOnWrite();
      instance.clearCollection();
      return this;
    }
    /**
     * <pre>
     * The collection which stores the object.
     * </pre>
     *
     * <code>optional string collection = 1;</code>
     */
    public Builder setCollectionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCollectionBytes(value);
      return this;
    }

    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public java.lang.String getKey() {
      return instance.getKey();
    }
    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      return instance.getKeyBytes();
    }
    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public Builder setKey(
        java.lang.String value) {
      copyOnWrite();
      instance.setKey(value);
      return this;
    }
    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public Builder clearKey() {
      copyOnWrite();
      instance.clearKey();
      return this;
    }
    /**
     * <pre>
     * The key of the object within the collection.
     * </pre>
     *
     * <code>optional string key = 2;</code>
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setKeyBytes(value);
      return this;
    }

    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public java.lang.String getUserId() {
      return instance.getUserId();
    }
    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      return instance.getUserIdBytes();
    }
    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      copyOnWrite();
      instance.setUserId(value);
      return this;
    }
    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public Builder clearUserId() {
      copyOnWrite();
      instance.clearUserId();
      return this;
    }
    /**
     * <pre>
     * The user owner of the object.
     * </pre>
     *
     * <code>optional string user_id = 3;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUserIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.ReadStorageObjectId)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.ReadStorageObjectId();
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
        com.heroiclabs.nakama.api.ReadStorageObjectId other = (com.heroiclabs.nakama.api.ReadStorageObjectId) arg1;
        collection_ = visitor.visitString(!collection_.isEmpty(), collection_,
            !other.collection_.isEmpty(), other.collection_);
        key_ = visitor.visitString(!key_.isEmpty(), key_,
            !other.key_.isEmpty(), other.key_);
        userId_ = visitor.visitString(!userId_.isEmpty(), userId_,
            !other.userId_.isEmpty(), other.userId_);
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

                collection_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                key_ = s;
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                userId_ = s;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.ReadStorageObjectId.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.ReadStorageObjectId)
  private static final com.heroiclabs.nakama.api.ReadStorageObjectId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReadStorageObjectId();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.ReadStorageObjectId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ReadStorageObjectId> PARSER;

  public static com.google.protobuf.Parser<ReadStorageObjectId> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

