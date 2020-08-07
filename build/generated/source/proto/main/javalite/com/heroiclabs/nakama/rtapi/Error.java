// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * A logical error which may occur on the server.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.Error}
 */
public  final class Error extends
    com.google.protobuf.GeneratedMessageLite<
        Error, Error.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.Error)
    ErrorOrBuilder {
  private Error() {
    message_ = "";
  }
  /**
   * <pre>
   * The selection of possible error codes.
   * </pre>
   *
   * Protobuf enum {@code nakama.realtime.Error.Code}
   */
  public enum Code
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <pre>
     * An unexpected result from the server.
     * </pre>
     *
     * <code>RUNTIME_EXCEPTION = 0;</code>
     */
    RUNTIME_EXCEPTION(0),
    /**
     * <pre>
     * The server received a message which is not recognised.
     * </pre>
     *
     * <code>UNRECOGNIZED_PAYLOAD = 1;</code>
     */
    UNRECOGNIZED_PAYLOAD(1),
    /**
     * <pre>
     * A message was expected but contains no content.
     * </pre>
     *
     * <code>MISSING_PAYLOAD = 2;</code>
     */
    MISSING_PAYLOAD(2),
    /**
     * <pre>
     * Fields in the message have an invalid format.
     * </pre>
     *
     * <code>BAD_INPUT = 3;</code>
     */
    BAD_INPUT(3),
    /**
     * <pre>
     * The match id was not found.
     * </pre>
     *
     * <code>MATCH_NOT_FOUND = 4;</code>
     */
    MATCH_NOT_FOUND(4),
    /**
     * <pre>
     * The match join was rejected.
     * </pre>
     *
     * <code>MATCH_JOIN_REJECTED = 5;</code>
     */
    MATCH_JOIN_REJECTED(5),
    /**
     * <pre>
     * The runtime function does not exist on the server.
     * </pre>
     *
     * <code>RUNTIME_FUNCTION_NOT_FOUND = 6;</code>
     */
    RUNTIME_FUNCTION_NOT_FOUND(6),
    /**
     * <pre>
     * The runtime function executed with an error.
     * </pre>
     *
     * <code>RUNTIME_FUNCTION_EXCEPTION = 7;</code>
     */
    RUNTIME_FUNCTION_EXCEPTION(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * An unexpected result from the server.
     * </pre>
     *
     * <code>RUNTIME_EXCEPTION = 0;</code>
     */
    public static final int RUNTIME_EXCEPTION_VALUE = 0;
    /**
     * <pre>
     * The server received a message which is not recognised.
     * </pre>
     *
     * <code>UNRECOGNIZED_PAYLOAD = 1;</code>
     */
    public static final int UNRECOGNIZED_PAYLOAD_VALUE = 1;
    /**
     * <pre>
     * A message was expected but contains no content.
     * </pre>
     *
     * <code>MISSING_PAYLOAD = 2;</code>
     */
    public static final int MISSING_PAYLOAD_VALUE = 2;
    /**
     * <pre>
     * Fields in the message have an invalid format.
     * </pre>
     *
     * <code>BAD_INPUT = 3;</code>
     */
    public static final int BAD_INPUT_VALUE = 3;
    /**
     * <pre>
     * The match id was not found.
     * </pre>
     *
     * <code>MATCH_NOT_FOUND = 4;</code>
     */
    public static final int MATCH_NOT_FOUND_VALUE = 4;
    /**
     * <pre>
     * The match join was rejected.
     * </pre>
     *
     * <code>MATCH_JOIN_REJECTED = 5;</code>
     */
    public static final int MATCH_JOIN_REJECTED_VALUE = 5;
    /**
     * <pre>
     * The runtime function does not exist on the server.
     * </pre>
     *
     * <code>RUNTIME_FUNCTION_NOT_FOUND = 6;</code>
     */
    public static final int RUNTIME_FUNCTION_NOT_FOUND_VALUE = 6;
    /**
     * <pre>
     * The runtime function executed with an error.
     * </pre>
     *
     * <code>RUNTIME_FUNCTION_EXCEPTION = 7;</code>
     */
    public static final int RUNTIME_FUNCTION_EXCEPTION_VALUE = 7;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Code valueOf(int value) {
      return forNumber(value);
    }

    public static Code forNumber(int value) {
      switch (value) {
        case 0: return RUNTIME_EXCEPTION;
        case 1: return UNRECOGNIZED_PAYLOAD;
        case 2: return MISSING_PAYLOAD;
        case 3: return BAD_INPUT;
        case 4: return MATCH_NOT_FOUND;
        case 5: return MATCH_JOIN_REJECTED;
        case 6: return RUNTIME_FUNCTION_NOT_FOUND;
        case 7: return RUNTIME_FUNCTION_EXCEPTION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Code>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Code> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Code>() {
            public Code findValueByNumber(int number) {
              return Code.forNumber(number);
            }
          };

    private final int value;

    private Code(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:nakama.realtime.Error.Code)
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <pre>
   * The error code which should be one of "Error.Code" enums.
   * </pre>
   *
   * <code>optional int32 code = 1;</code>
   */
  public int getCode() {
    return code_;
  }
  /**
   * <pre>
   * The error code which should be one of "Error.Code" enums.
   * </pre>
   *
   * <code>optional int32 code = 1;</code>
   */
  private void setCode(int value) {
    
    code_ = value;
  }
  /**
   * <pre>
   * The error code which should be one of "Error.Code" enums.
   * </pre>
   *
   * <code>optional int32 code = 1;</code>
   */
  private void clearCode() {
    
    code_ = 0;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private java.lang.String message_;
  /**
   * <pre>
   * A message in English to help developers debug the response.
   * </pre>
   *
   * <code>optional string message = 2;</code>
   */
  public java.lang.String getMessage() {
    return message_;
  }
  /**
   * <pre>
   * A message in English to help developers debug the response.
   * </pre>
   *
   * <code>optional string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(message_);
  }
  /**
   * <pre>
   * A message in English to help developers debug the response.
   * </pre>
   *
   * <code>optional string message = 2;</code>
   */
  private void setMessage(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    message_ = value;
  }
  /**
   * <pre>
   * A message in English to help developers debug the response.
   * </pre>
   *
   * <code>optional string message = 2;</code>
   */
  private void clearMessage() {
    
    message_ = getDefaultInstance().getMessage();
  }
  /**
   * <pre>
   * A message in English to help developers debug the response.
   * </pre>
   *
   * <code>optional string message = 2;</code>
   */
  private void setMessageBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    message_ = value.toStringUtf8();
  }

  public static final int CONTEXT_FIELD_NUMBER = 3;
  private static final class ContextDefaultEntryHolder {
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
      java.lang.String, java.lang.String> context_ =
          com.google.protobuf.MapFieldLite.emptyMapField();
  private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>
  internalGetContext() {
    return context_;
  }
  private com.google.protobuf.MapFieldLite<java.lang.String, java.lang.String>
  internalGetMutableContext() {
    if (!context_.isMutable()) {
      context_ = context_.mutableCopy();
    }
    return context_;
  }

  public int getContextCount() {
    return internalGetContext().size();
  }
  /**
   * <pre>
   * Additional error details which may be different for each response.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */

  public boolean containsContext(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetContext().containsKey(key);
  }
  /**
   * Use {@link #getContextMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getContext() {
    return getContextMap();
  }
  /**
   * <pre>
   * Additional error details which may be different for each response.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getContextMap() {
    return java.util.Collections.unmodifiableMap(
        internalGetContext());
  }
  /**
   * <pre>
   * Additional error details which may be different for each response.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */

  public java.lang.String getContextOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetContext();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Additional error details which may be different for each response.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */

  public java.lang.String getContextOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetContext();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }
  /**
   * <pre>
   * Additional error details which may be different for each response.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 3;</code>
   */
  private java.util.Map<java.lang.String, java.lang.String>
  getMutableContextMap() {
    return internalGetMutableContext();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (code_ != 0) {
      output.writeInt32(1, code_);
    }
    if (!message_.isEmpty()) {
      output.writeString(2, getMessage());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetContext().entrySet()) {
      ContextDefaultEntryHolder.defaultEntry.serializeTo(
          output, 3, entry.getKey(), entry.getValue());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, code_);
    }
    if (!message_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getMessage());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetContext().entrySet()) {
      size += ContextDefaultEntryHolder.defaultEntry.computeMessageSize(
        3, entry.getKey(), entry.getValue());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.Error parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.Error prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * A logical error which may occur on the server.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.Error}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.rtapi.Error, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.Error)
      com.heroiclabs.nakama.rtapi.ErrorOrBuilder {
    // Construct using com.heroiclabs.nakama.rtapi.Error.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The error code which should be one of "Error.Code" enums.
     * </pre>
     *
     * <code>optional int32 code = 1;</code>
     */
    public int getCode() {
      return instance.getCode();
    }
    /**
     * <pre>
     * The error code which should be one of "Error.Code" enums.
     * </pre>
     *
     * <code>optional int32 code = 1;</code>
     */
    public Builder setCode(int value) {
      copyOnWrite();
      instance.setCode(value);
      return this;
    }
    /**
     * <pre>
     * The error code which should be one of "Error.Code" enums.
     * </pre>
     *
     * <code>optional int32 code = 1;</code>
     */
    public Builder clearCode() {
      copyOnWrite();
      instance.clearCode();
      return this;
    }

    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public java.lang.String getMessage() {
      return instance.getMessage();
    }
    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      return instance.getMessageBytes();
    }
    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      copyOnWrite();
      instance.setMessage(value);
      return this;
    }
    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public Builder clearMessage() {
      copyOnWrite();
      instance.clearMessage();
      return this;
    }
    /**
     * <pre>
     * A message in English to help developers debug the response.
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMessageBytes(value);
      return this;
    }


    public int getContextCount() {
      return instance.getContextMap().size();
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3;</code>
     */

    public boolean containsContext(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return instance.getContextMap().containsKey(key);
    }

    public Builder clearContext() {
      copyOnWrite();
      instance.getMutableContextMap().clear();
      return this;
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3;</code>
     */

    public Builder removeContext(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      copyOnWrite();
      instance.getMutableContextMap().remove(key);
      return this;
    }
    /**
     * Use {@link #getContextMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getContext() {
      return getContextMap();
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getContextMap() {
      return java.util.Collections.unmodifiableMap(
          instance.getContextMap());
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3;</code>
     */

    public java.lang.String getContextOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          instance.getContextMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3;</code>
     */

    public java.lang.String getContextOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          instance.getContextMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3;</code>
     */
    public Builder putContext(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      copyOnWrite();
      instance.getMutableContextMap().put(key, value);
      return this;
    }
    /**
     * <pre>
     * Additional error details which may be different for each response.
     * </pre>
     *
     * <code>map&lt;string, string&gt; context = 3;</code>
     */
    public Builder putAllContext(
        java.util.Map<java.lang.String, java.lang.String> values) {
      copyOnWrite();
      instance.getMutableContextMap().putAll(values);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.Error)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.rtapi.Error();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        context_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.rtapi.Error other = (com.heroiclabs.nakama.rtapi.Error) arg1;
        code_ = visitor.visitInt(code_ != 0, code_,
            other.code_ != 0, other.code_);
        message_ = visitor.visitString(!message_.isEmpty(), message_,
            !other.message_.isEmpty(), other.message_);
        context_ = visitor.visitMap(
            context_, other.internalGetContext());
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
              case 8: {

                code_ = input.readInt32();
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                message_ = s;
                break;
              }
              case 26: {
                if (!context_.isMutable()) {
                  context_ = context_.mutableCopy();
                }
                ContextDefaultEntryHolder.defaultEntry.parseInto(context_, input, extensionRegistry);  break;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.rtapi.Error.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.realtime.Error)
  private static final com.heroiclabs.nakama.rtapi.Error DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Error();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.rtapi.Error getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Error> PARSER;

  public static com.google.protobuf.Parser<Error> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
