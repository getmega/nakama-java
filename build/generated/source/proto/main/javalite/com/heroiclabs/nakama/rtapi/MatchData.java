// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * Realtime match data received from the server.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.MatchData}
 */
public  final class MatchData extends
    com.google.protobuf.GeneratedMessageLite<
        MatchData, MatchData.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.MatchData)
    MatchDataOrBuilder {
  private MatchData() {
    matchId_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
  }
  public static final int MATCH_ID_FIELD_NUMBER = 1;
  private java.lang.String matchId_;
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  public java.lang.String getMatchId() {
    return matchId_;
  }
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMatchIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(matchId_);
  }
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  private void setMatchId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    matchId_ = value;
  }
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  private void clearMatchId() {
    
    matchId_ = getDefaultInstance().getMatchId();
  }
  /**
   * <pre>
   * The match unique ID.
   * </pre>
   *
   * <code>optional string match_id = 1;</code>
   */
  private void setMatchIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    matchId_ = value.toStringUtf8();
  }

  public static final int PRESENCE_FIELD_NUMBER = 2;
  private com.heroiclabs.nakama.rtapi.UserPresence presence_;
  /**
   * <pre>
   * A reference to the user presence that sent this data, if any.
   * </pre>
   *
   * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
   */
  public boolean hasPresence() {
    return presence_ != null;
  }
  /**
   * <pre>
   * A reference to the user presence that sent this data, if any.
   * </pre>
   *
   * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
   */
  public com.heroiclabs.nakama.rtapi.UserPresence getPresence() {
    return presence_ == null ? com.heroiclabs.nakama.rtapi.UserPresence.getDefaultInstance() : presence_;
  }
  /**
   * <pre>
   * A reference to the user presence that sent this data, if any.
   * </pre>
   *
   * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
   */
  private void setPresence(com.heroiclabs.nakama.rtapi.UserPresence value) {
    if (value == null) {
      throw new NullPointerException();
    }
    presence_ = value;
    
    }
  /**
   * <pre>
   * A reference to the user presence that sent this data, if any.
   * </pre>
   *
   * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
   */
  private void setPresence(
      com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
    presence_ = builderForValue.build();
    
  }
  /**
   * <pre>
   * A reference to the user presence that sent this data, if any.
   * </pre>
   *
   * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
   */
  private void mergePresence(com.heroiclabs.nakama.rtapi.UserPresence value) {
    if (presence_ != null &&
        presence_ != com.heroiclabs.nakama.rtapi.UserPresence.getDefaultInstance()) {
      presence_ =
        com.heroiclabs.nakama.rtapi.UserPresence.newBuilder(presence_).mergeFrom(value).buildPartial();
    } else {
      presence_ = value;
    }
    
  }
  /**
   * <pre>
   * A reference to the user presence that sent this data, if any.
   * </pre>
   *
   * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
   */
  private void clearPresence() {  presence_ = null;
    
  }

  public static final int OP_CODE_FIELD_NUMBER = 3;
  private long opCode_;
  /**
   * <pre>
   * Op code value.
   * </pre>
   *
   * <code>optional int64 op_code = 3;</code>
   */
  public long getOpCode() {
    return opCode_;
  }
  /**
   * <pre>
   * Op code value.
   * </pre>
   *
   * <code>optional int64 op_code = 3;</code>
   */
  private void setOpCode(long value) {
    
    opCode_ = value;
  }
  /**
   * <pre>
   * Op code value.
   * </pre>
   *
   * <code>optional int64 op_code = 3;</code>
   */
  private void clearOpCode() {
    
    opCode_ = 0L;
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * Data payload, if any.
   * </pre>
   *
   * <code>optional bytes data = 4;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }
  /**
   * <pre>
   * Data payload, if any.
   * </pre>
   *
   * <code>optional bytes data = 4;</code>
   */
  private void setData(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    data_ = value;
  }
  /**
   * <pre>
   * Data payload, if any.
   * </pre>
   *
   * <code>optional bytes data = 4;</code>
   */
  private void clearData() {
    
    data_ = getDefaultInstance().getData();
  }

  public static final int RELIABLE_FIELD_NUMBER = 5;
  private boolean reliable_;
  /**
   * <pre>
   * True if this data was delivered reliably, false otherwise.
   * </pre>
   *
   * <code>optional bool reliable = 5;</code>
   */
  public boolean getReliable() {
    return reliable_;
  }
  /**
   * <pre>
   * True if this data was delivered reliably, false otherwise.
   * </pre>
   *
   * <code>optional bool reliable = 5;</code>
   */
  private void setReliable(boolean value) {
    
    reliable_ = value;
  }
  /**
   * <pre>
   * True if this data was delivered reliably, false otherwise.
   * </pre>
   *
   * <code>optional bool reliable = 5;</code>
   */
  private void clearReliable() {
    
    reliable_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!matchId_.isEmpty()) {
      output.writeString(1, getMatchId());
    }
    if (presence_ != null) {
      output.writeMessage(2, getPresence());
    }
    if (opCode_ != 0L) {
      output.writeInt64(3, opCode_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(4, data_);
    }
    if (reliable_ != false) {
      output.writeBool(5, reliable_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!matchId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getMatchId());
    }
    if (presence_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPresence());
    }
    if (opCode_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, opCode_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, data_);
    }
    if (reliable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, reliable_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.rtapi.MatchData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.MatchData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.MatchData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.MatchData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.MatchData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.MatchData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.MatchData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.MatchData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.MatchData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.MatchData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.MatchData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Realtime match data received from the server.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.MatchData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.rtapi.MatchData, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.MatchData)
      com.heroiclabs.nakama.rtapi.MatchDataOrBuilder {
    // Construct using com.heroiclabs.nakama.rtapi.MatchData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public java.lang.String getMatchId() {
      return instance.getMatchId();
    }
    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMatchIdBytes() {
      return instance.getMatchIdBytes();
    }
    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public Builder setMatchId(
        java.lang.String value) {
      copyOnWrite();
      instance.setMatchId(value);
      return this;
    }
    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public Builder clearMatchId() {
      copyOnWrite();
      instance.clearMatchId();
      return this;
    }
    /**
     * <pre>
     * The match unique ID.
     * </pre>
     *
     * <code>optional string match_id = 1;</code>
     */
    public Builder setMatchIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMatchIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * A reference to the user presence that sent this data, if any.
     * </pre>
     *
     * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
     */
    public boolean hasPresence() {
      return instance.hasPresence();
    }
    /**
     * <pre>
     * A reference to the user presence that sent this data, if any.
     * </pre>
     *
     * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
     */
    public com.heroiclabs.nakama.rtapi.UserPresence getPresence() {
      return instance.getPresence();
    }
    /**
     * <pre>
     * A reference to the user presence that sent this data, if any.
     * </pre>
     *
     * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
     */
    public Builder setPresence(com.heroiclabs.nakama.rtapi.UserPresence value) {
      copyOnWrite();
      instance.setPresence(value);
      return this;
      }
    /**
     * <pre>
     * A reference to the user presence that sent this data, if any.
     * </pre>
     *
     * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
     */
    public Builder setPresence(
        com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
      copyOnWrite();
      instance.setPresence(builderForValue);
      return this;
    }
    /**
     * <pre>
     * A reference to the user presence that sent this data, if any.
     * </pre>
     *
     * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
     */
    public Builder mergePresence(com.heroiclabs.nakama.rtapi.UserPresence value) {
      copyOnWrite();
      instance.mergePresence(value);
      return this;
    }
    /**
     * <pre>
     * A reference to the user presence that sent this data, if any.
     * </pre>
     *
     * <code>optional .nakama.realtime.UserPresence presence = 2;</code>
     */
    public Builder clearPresence() {  copyOnWrite();
      instance.clearPresence();
      return this;
    }

    /**
     * <pre>
     * Op code value.
     * </pre>
     *
     * <code>optional int64 op_code = 3;</code>
     */
    public long getOpCode() {
      return instance.getOpCode();
    }
    /**
     * <pre>
     * Op code value.
     * </pre>
     *
     * <code>optional int64 op_code = 3;</code>
     */
    public Builder setOpCode(long value) {
      copyOnWrite();
      instance.setOpCode(value);
      return this;
    }
    /**
     * <pre>
     * Op code value.
     * </pre>
     *
     * <code>optional int64 op_code = 3;</code>
     */
    public Builder clearOpCode() {
      copyOnWrite();
      instance.clearOpCode();
      return this;
    }

    /**
     * <pre>
     * Data payload, if any.
     * </pre>
     *
     * <code>optional bytes data = 4;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return instance.getData();
    }
    /**
     * <pre>
     * Data payload, if any.
     * </pre>
     *
     * <code>optional bytes data = 4;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setData(value);
      return this;
    }
    /**
     * <pre>
     * Data payload, if any.
     * </pre>
     *
     * <code>optional bytes data = 4;</code>
     */
    public Builder clearData() {
      copyOnWrite();
      instance.clearData();
      return this;
    }

    /**
     * <pre>
     * True if this data was delivered reliably, false otherwise.
     * </pre>
     *
     * <code>optional bool reliable = 5;</code>
     */
    public boolean getReliable() {
      return instance.getReliable();
    }
    /**
     * <pre>
     * True if this data was delivered reliably, false otherwise.
     * </pre>
     *
     * <code>optional bool reliable = 5;</code>
     */
    public Builder setReliable(boolean value) {
      copyOnWrite();
      instance.setReliable(value);
      return this;
    }
    /**
     * <pre>
     * True if this data was delivered reliably, false otherwise.
     * </pre>
     *
     * <code>optional bool reliable = 5;</code>
     */
    public Builder clearReliable() {
      copyOnWrite();
      instance.clearReliable();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.MatchData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.rtapi.MatchData();
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
        com.heroiclabs.nakama.rtapi.MatchData other = (com.heroiclabs.nakama.rtapi.MatchData) arg1;
        matchId_ = visitor.visitString(!matchId_.isEmpty(), matchId_,
            !other.matchId_.isEmpty(), other.matchId_);
        presence_ = visitor.visitMessage(presence_, other.presence_);
        opCode_ = visitor.visitLong(opCode_ != 0L, opCode_,
            other.opCode_ != 0L, other.opCode_);
        data_ = visitor.visitByteString(data_ != com.google.protobuf.ByteString.EMPTY, data_,
            other.data_ != com.google.protobuf.ByteString.EMPTY, other.data_);
        reliable_ = visitor.visitBoolean(reliable_ != false, reliable_,
            other.reliable_ != false, other.reliable_);
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

                matchId_ = s;
                break;
              }
              case 18: {
                com.heroiclabs.nakama.rtapi.UserPresence.Builder subBuilder = null;
                if (presence_ != null) {
                  subBuilder = presence_.toBuilder();
                }
                presence_ = input.readMessage(com.heroiclabs.nakama.rtapi.UserPresence.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(presence_);
                  presence_ = subBuilder.buildPartial();
                }

                break;
              }
              case 24: {

                opCode_ = input.readInt64();
                break;
              }
              case 34: {

                data_ = input.readBytes();
                break;
              }
              case 40: {

                reliable_ = input.readBool();
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.rtapi.MatchData.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.realtime.MatchData)
  private static final com.heroiclabs.nakama.rtapi.MatchData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MatchData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.rtapi.MatchData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MatchData> PARSER;

  public static com.google.protobuf.Parser<MatchData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

