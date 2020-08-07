// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

/**
 * <pre>
 * Send realtime match data to the server.
 * </pre>
 *
 * Protobuf type {@code nakama.realtime.MatchDataSend}
 */
public  final class MatchDataSend extends
    com.google.protobuf.GeneratedMessageLite<
        MatchDataSend, MatchDataSend.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.realtime.MatchDataSend)
    MatchDataSendOrBuilder {
  private MatchDataSend() {
    matchId_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
    presences_ = emptyProtobufList();
  }
  private int bitField0_;
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

  public static final int OP_CODE_FIELD_NUMBER = 2;
  private long opCode_;
  /**
   * <pre>
   * Op code value.
   * </pre>
   *
   * <code>optional int64 op_code = 2;</code>
   */
  public long getOpCode() {
    return opCode_;
  }
  /**
   * <pre>
   * Op code value.
   * </pre>
   *
   * <code>optional int64 op_code = 2;</code>
   */
  private void setOpCode(long value) {
    
    opCode_ = value;
  }
  /**
   * <pre>
   * Op code value.
   * </pre>
   *
   * <code>optional int64 op_code = 2;</code>
   */
  private void clearOpCode() {
    
    opCode_ = 0L;
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * Data payload, if any.
   * </pre>
   *
   * <code>optional bytes data = 3;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }
  /**
   * <pre>
   * Data payload, if any.
   * </pre>
   *
   * <code>optional bytes data = 3;</code>
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
   * <code>optional bytes data = 3;</code>
   */
  private void clearData() {
    
    data_ = getDefaultInstance().getData();
  }

  public static final int PRESENCES_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.ProtobufList<com.heroiclabs.nakama.rtapi.UserPresence> presences_;
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  public java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> getPresencesList() {
    return presences_;
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  public java.util.List<? extends com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder> 
      getPresencesOrBuilderList() {
    return presences_;
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  public int getPresencesCount() {
    return presences_.size();
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  public com.heroiclabs.nakama.rtapi.UserPresence getPresences(int index) {
    return presences_.get(index);
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  public com.heroiclabs.nakama.rtapi.UserPresenceOrBuilder getPresencesOrBuilder(
      int index) {
    return presences_.get(index);
  }
  private void ensurePresencesIsMutable() {
    if (!presences_.isModifiable()) {
      presences_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(presences_);
     }
  }

  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  private void setPresences(
      int index, com.heroiclabs.nakama.rtapi.UserPresence value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensurePresencesIsMutable();
    presences_.set(index, value);
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  private void setPresences(
      int index, com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
    ensurePresencesIsMutable();
    presences_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  private void addPresences(com.heroiclabs.nakama.rtapi.UserPresence value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensurePresencesIsMutable();
    presences_.add(value);
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  private void addPresences(
      int index, com.heroiclabs.nakama.rtapi.UserPresence value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensurePresencesIsMutable();
    presences_.add(index, value);
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  private void addPresences(
      com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
    ensurePresencesIsMutable();
    presences_.add(builderForValue.build());
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  private void addPresences(
      int index, com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
    ensurePresencesIsMutable();
    presences_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  private void addAllPresences(
      java.lang.Iterable<? extends com.heroiclabs.nakama.rtapi.UserPresence> values) {
    ensurePresencesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, presences_);
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  private void clearPresences() {
    presences_ = emptyProtobufList();
  }
  /**
   * <pre>
   * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
   * </pre>
   *
   * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
   */
  private void removePresences(int index) {
    ensurePresencesIsMutable();
    presences_.remove(index);
  }

  public static final int RELIABLE_FIELD_NUMBER = 5;
  private boolean reliable_;
  /**
   * <pre>
   * True if the data should be sent reliably, false otherwise.
   * </pre>
   *
   * <code>optional bool reliable = 5;</code>
   */
  public boolean getReliable() {
    return reliable_;
  }
  /**
   * <pre>
   * True if the data should be sent reliably, false otherwise.
   * </pre>
   *
   * <code>optional bool reliable = 5;</code>
   */
  private void setReliable(boolean value) {
    
    reliable_ = value;
  }
  /**
   * <pre>
   * True if the data should be sent reliably, false otherwise.
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
    if (opCode_ != 0L) {
      output.writeInt64(2, opCode_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(3, data_);
    }
    for (int i = 0; i < presences_.size(); i++) {
      output.writeMessage(4, presences_.get(i));
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
    if (opCode_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, opCode_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, data_);
    }
    for (int i = 0; i < presences_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, presences_.get(i));
    }
    if (reliable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, reliable_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.rtapi.MatchDataSend parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.rtapi.MatchDataSend prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Send realtime match data to the server.
   * </pre>
   *
   * Protobuf type {@code nakama.realtime.MatchDataSend}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.rtapi.MatchDataSend, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.realtime.MatchDataSend)
      com.heroiclabs.nakama.rtapi.MatchDataSendOrBuilder {
    // Construct using com.heroiclabs.nakama.rtapi.MatchDataSend.newBuilder()
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
     * Op code value.
     * </pre>
     *
     * <code>optional int64 op_code = 2;</code>
     */
    public long getOpCode() {
      return instance.getOpCode();
    }
    /**
     * <pre>
     * Op code value.
     * </pre>
     *
     * <code>optional int64 op_code = 2;</code>
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
     * <code>optional int64 op_code = 2;</code>
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
     * <code>optional bytes data = 3;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return instance.getData();
    }
    /**
     * <pre>
     * Data payload, if any.
     * </pre>
     *
     * <code>optional bytes data = 3;</code>
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
     * <code>optional bytes data = 3;</code>
     */
    public Builder clearData() {
      copyOnWrite();
      instance.clearData();
      return this;
    }

    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public java.util.List<com.heroiclabs.nakama.rtapi.UserPresence> getPresencesList() {
      return java.util.Collections.unmodifiableList(
          instance.getPresencesList());
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public int getPresencesCount() {
      return instance.getPresencesCount();
    }/**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public com.heroiclabs.nakama.rtapi.UserPresence getPresences(int index) {
      return instance.getPresences(index);
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public Builder setPresences(
        int index, com.heroiclabs.nakama.rtapi.UserPresence value) {
      copyOnWrite();
      instance.setPresences(index, value);
      return this;
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public Builder setPresences(
        int index, com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
      copyOnWrite();
      instance.setPresences(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public Builder addPresences(com.heroiclabs.nakama.rtapi.UserPresence value) {
      copyOnWrite();
      instance.addPresences(value);
      return this;
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public Builder addPresences(
        int index, com.heroiclabs.nakama.rtapi.UserPresence value) {
      copyOnWrite();
      instance.addPresences(index, value);
      return this;
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public Builder addPresences(
        com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
      copyOnWrite();
      instance.addPresences(builderForValue);
      return this;
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public Builder addPresences(
        int index, com.heroiclabs.nakama.rtapi.UserPresence.Builder builderForValue) {
      copyOnWrite();
      instance.addPresences(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public Builder addAllPresences(
        java.lang.Iterable<? extends com.heroiclabs.nakama.rtapi.UserPresence> values) {
      copyOnWrite();
      instance.addAllPresences(values);
      return this;
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public Builder clearPresences() {
      copyOnWrite();
      instance.clearPresences();
      return this;
    }
    /**
     * <pre>
     * List of presences in the match to deliver to, if filtering is required. Otherwise deliver to everyone in the match.
     * </pre>
     *
     * <code>repeated .nakama.realtime.UserPresence presences = 4;</code>
     */
    public Builder removePresences(int index) {
      copyOnWrite();
      instance.removePresences(index);
      return this;
    }

    /**
     * <pre>
     * True if the data should be sent reliably, false otherwise.
     * </pre>
     *
     * <code>optional bool reliable = 5;</code>
     */
    public boolean getReliable() {
      return instance.getReliable();
    }
    /**
     * <pre>
     * True if the data should be sent reliably, false otherwise.
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
     * True if the data should be sent reliably, false otherwise.
     * </pre>
     *
     * <code>optional bool reliable = 5;</code>
     */
    public Builder clearReliable() {
      copyOnWrite();
      instance.clearReliable();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.realtime.MatchDataSend)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.rtapi.MatchDataSend();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        presences_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.heroiclabs.nakama.rtapi.MatchDataSend other = (com.heroiclabs.nakama.rtapi.MatchDataSend) arg1;
        matchId_ = visitor.visitString(!matchId_.isEmpty(), matchId_,
            !other.matchId_.isEmpty(), other.matchId_);
        opCode_ = visitor.visitLong(opCode_ != 0L, opCode_,
            other.opCode_ != 0L, other.opCode_);
        data_ = visitor.visitByteString(data_ != com.google.protobuf.ByteString.EMPTY, data_,
            other.data_ != com.google.protobuf.ByteString.EMPTY, other.data_);
        presences_= visitor.visitList(presences_, other.presences_);
        reliable_ = visitor.visitBoolean(reliable_ != false, reliable_,
            other.reliable_ != false, other.reliable_);
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

                matchId_ = s;
                break;
              }
              case 16: {

                opCode_ = input.readInt64();
                break;
              }
              case 26: {

                data_ = input.readBytes();
                break;
              }
              case 34: {
                if (!presences_.isModifiable()) {
                  presences_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(presences_);
                }
                presences_.add(
                    input.readMessage(com.heroiclabs.nakama.rtapi.UserPresence.parser(), extensionRegistry));
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.rtapi.MatchDataSend.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.realtime.MatchDataSend)
  private static final com.heroiclabs.nakama.rtapi.MatchDataSend DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MatchDataSend();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.rtapi.MatchDataSend getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MatchDataSend> PARSER;

  public static com.google.protobuf.Parser<MatchDataSend> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
