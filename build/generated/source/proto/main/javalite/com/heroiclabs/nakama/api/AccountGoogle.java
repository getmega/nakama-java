// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * Send a Google token to the server. Used with authenticate/link/unlink.
 * </pre>
 *
 * Protobuf type {@code nakama.api.AccountGoogle}
 */
public  final class AccountGoogle extends
    com.google.protobuf.GeneratedMessageLite<
        AccountGoogle, AccountGoogle.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.AccountGoogle)
    AccountGoogleOrBuilder {
  private AccountGoogle() {
    token_ = "";
  }
  private int bitField0_;
  public static final int TOKEN_FIELD_NUMBER = 1;
  private java.lang.String token_;
  /**
   * <pre>
   * The OAuth token received from Google to access their profile API.
   * </pre>
   *
   * <code>optional string token = 1;</code>
   */
  public java.lang.String getToken() {
    return token_;
  }
  /**
   * <pre>
   * The OAuth token received from Google to access their profile API.
   * </pre>
   *
   * <code>optional string token = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(token_);
  }
  /**
   * <pre>
   * The OAuth token received from Google to access their profile API.
   * </pre>
   *
   * <code>optional string token = 1;</code>
   */
  private void setToken(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    token_ = value;
  }
  /**
   * <pre>
   * The OAuth token received from Google to access their profile API.
   * </pre>
   *
   * <code>optional string token = 1;</code>
   */
  private void clearToken() {
    
    token_ = getDefaultInstance().getToken();
  }
  /**
   * <pre>
   * The OAuth token received from Google to access their profile API.
   * </pre>
   *
   * <code>optional string token = 1;</code>
   */
  private void setTokenBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    token_ = value.toStringUtf8();
  }

  public static final int VARS_FIELD_NUMBER = 2;
  private static final class VarsDefaultEntryHolder {
    static final com.google.protobuf.MapEntryLite<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntryLite
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapFieldLite<
      java.lang.String, java.lang.String> vars_ =
          com.google.protobuf.MapFieldLite.emptyMapField();
  private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>
  internalGetVars() {
    return vars_;
  }
  private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>
  internalGetMutableVars() {
    if (!vars_.isMutable()) {
      vars_ = vars_.mutableCopy();
    }
    return vars_;
  }

  public int getVarsCount() {
    return internalGetVars().size();
  }
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */

  public boolean containsVars(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetVars().containsKey(key);
  }
  /**
   * Use {@link #getVarsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getVars() {
    return getVarsMap();
  }
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getVarsMap() {
    return java.util.Collections.unmodifiableMap(
        internalGetVars());
  }
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */

  public java.lang.String getVarsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetVars();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */

  public java.lang.String getVarsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetVars();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }
  /**
   * <pre>
   * Extra information that will be bundled in the session token.
   * </pre>
   *
   * <code>map&lt;string, string&gt; vars = 2;</code>
   */
  private java.util.Map<java.lang.String, java.lang.String>
  getMutableVarsMap() {
    return internalGetMutableVars();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!token_.isEmpty()) {
      output.writeString(1, getToken());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetVars().entrySet()) {
      VarsDefaultEntryHolder.defaultEntry.serializeTo(
          output, 2, entry.getKey(), entry.getValue());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!token_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getToken());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetVars().entrySet()) {
      size += VarsDefaultEntryHolder.defaultEntry.computeMessageSize(
        2, entry.getKey(), entry.getValue());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.AccountGoogle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AccountGoogle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountGoogle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.AccountGoogle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountGoogle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AccountGoogle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountGoogle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AccountGoogle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.AccountGoogle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.AccountGoogle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.AccountGoogle prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Send a Google token to the server. Used with authenticate/link/unlink.
   * </pre>
   *
   * Protobuf type {@code nakama.api.AccountGoogle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.AccountGoogle, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.AccountGoogle)
      com.heroiclabs.nakama.api.AccountGoogleOrBuilder {
    // Construct using com.heroiclabs.nakama.api.AccountGoogle.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The OAuth token received from Google to access their profile API.
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    public java.lang.String getToken() {
      return instance.getToken();
    }
    /**
     * <pre>
     * The OAuth token received from Google to access their profile API.
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      return instance.getTokenBytes();
    }
    /**
     * <pre>
     * The OAuth token received from Google to access their profile API.
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setToken(value);
      return this;
    }
    /**
     * <pre>
     * The OAuth token received from Google to access their profile API.
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    public Builder clearToken() {
      copyOnWrite();
      instance.clearToken();
      return this;
    }
    /**
     * <pre>
     * The OAuth token received from Google to access their profile API.
     * </pre>
     *
     * <code>optional string token = 1;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTokenBytes(value);
      return this;
    }


    public int getVarsCount() {
      return instance.getVarsMap().size();
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2;</code>
     */

    public boolean containsVars(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return instance.getVarsMap().containsKey(key);
    }

    public Builder clearVars() {
      copyOnWrite();
      instance.getMutableVarsMap().clear();
      return this;
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2;</code>
     */

    public Builder removeVars(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      copyOnWrite();
      instance.getMutableVarsMap().remove(key);
      return this;
    }
    /**
     * Use {@link #getVarsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getVars() {
      return getVarsMap();
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getVarsMap() {
      return java.util.Collections.unmodifiableMap(
          instance.getVarsMap());
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2;</code>
     */

    public java.lang.String getVarsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          instance.getVarsMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2;</code>
     */

    public java.lang.String getVarsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          instance.getVarsMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2;</code>
     */
    public Builder putVars(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      copyOnWrite();
      instance.getMutableVarsMap().put(key, value);
      return this;
    }
    /**
     * <pre>
     * Extra information that will be bundled in the session token.
     * </pre>
     *
     * <code>map&lt;string, string&gt; vars = 2;</code>
     */
    public Builder putAllVars(
        java.util.Map<java.lang.String, java.lang.String> values) {
      copyOnWrite();
      instance.getMutableVarsMap().putAll(values);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.AccountGoogle)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.AccountGoogle();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        vars_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.api.AccountGoogle other = (com.heroiclabs.nakama.api.AccountGoogle) arg1;
        token_ = visitor.visitString(!token_.isEmpty(), token_,
            !other.token_.isEmpty(), other.token_);
        vars_ = visitor.visitMap(
            vars_, other.internalGetVars());
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
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

                token_ = s;
                break;
              }
              case 18: {
                if (!vars_.isMutable()) {
                  vars_ = vars_.mutableCopy();
                }
                VarsDefaultEntryHolder.defaultEntry.parseInto(vars_, input, extensionRegistry);  break;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.AccountGoogle.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.AccountGoogle)
  private static final com.heroiclabs.nakama.api.AccountGoogle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AccountGoogle();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.AccountGoogle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AccountGoogle> PARSER;

  public static com.google.protobuf.Parser<AccountGoogle> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

