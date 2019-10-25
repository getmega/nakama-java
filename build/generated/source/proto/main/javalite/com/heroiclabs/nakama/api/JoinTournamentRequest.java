// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/api.proto

package com.heroiclabs.nakama.api;

/**
 * <pre>
 * The request to join a tournament.
 * </pre>
 *
 * Protobuf type {@code nakama.api.JoinTournamentRequest}
 */
public  final class JoinTournamentRequest extends
    com.google.protobuf.GeneratedMessageLite<
        JoinTournamentRequest, JoinTournamentRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:nakama.api.JoinTournamentRequest)
    JoinTournamentRequestOrBuilder {
  private JoinTournamentRequest() {
    tournamentId_ = "";
  }
  public static final int TOURNAMENT_ID_FIELD_NUMBER = 1;
  private java.lang.String tournamentId_;
  /**
   * <pre>
   * The ID of the tournament to join. The tournament must already exist.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  public java.lang.String getTournamentId() {
    return tournamentId_;
  }
  /**
   * <pre>
   * The ID of the tournament to join. The tournament must already exist.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTournamentIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(tournamentId_);
  }
  /**
   * <pre>
   * The ID of the tournament to join. The tournament must already exist.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  private void setTournamentId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    tournamentId_ = value;
  }
  /**
   * <pre>
   * The ID of the tournament to join. The tournament must already exist.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  private void clearTournamentId() {
    
    tournamentId_ = getDefaultInstance().getTournamentId();
  }
  /**
   * <pre>
   * The ID of the tournament to join. The tournament must already exist.
   * </pre>
   *
   * <code>optional string tournament_id = 1;</code>
   */
  private void setTournamentIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    tournamentId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!tournamentId_.isEmpty()) {
      output.writeString(1, getTournamentId());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!tournamentId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getTournamentId());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.heroiclabs.nakama.api.JoinTournamentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.heroiclabs.nakama.api.JoinTournamentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * The request to join a tournament.
   * </pre>
   *
   * Protobuf type {@code nakama.api.JoinTournamentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.heroiclabs.nakama.api.JoinTournamentRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:nakama.api.JoinTournamentRequest)
      com.heroiclabs.nakama.api.JoinTournamentRequestOrBuilder {
    // Construct using com.heroiclabs.nakama.api.JoinTournamentRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The ID of the tournament to join. The tournament must already exist.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public java.lang.String getTournamentId() {
      return instance.getTournamentId();
    }
    /**
     * <pre>
     * The ID of the tournament to join. The tournament must already exist.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTournamentIdBytes() {
      return instance.getTournamentIdBytes();
    }
    /**
     * <pre>
     * The ID of the tournament to join. The tournament must already exist.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public Builder setTournamentId(
        java.lang.String value) {
      copyOnWrite();
      instance.setTournamentId(value);
      return this;
    }
    /**
     * <pre>
     * The ID of the tournament to join. The tournament must already exist.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public Builder clearTournamentId() {
      copyOnWrite();
      instance.clearTournamentId();
      return this;
    }
    /**
     * <pre>
     * The ID of the tournament to join. The tournament must already exist.
     * </pre>
     *
     * <code>optional string tournament_id = 1;</code>
     */
    public Builder setTournamentIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTournamentIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:nakama.api.JoinTournamentRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.heroiclabs.nakama.api.JoinTournamentRequest();
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
        com.heroiclabs.nakama.api.JoinTournamentRequest other = (com.heroiclabs.nakama.api.JoinTournamentRequest) arg1;
        tournamentId_ = visitor.visitString(!tournamentId_.isEmpty(), tournamentId_,
            !other.tournamentId_.isEmpty(), other.tournamentId_);
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

                tournamentId_ = s;
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
        if (PARSER == null) {    synchronized (com.heroiclabs.nakama.api.JoinTournamentRequest.class) {
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


  // @@protoc_insertion_point(class_scope:nakama.api.JoinTournamentRequest)
  private static final com.heroiclabs.nakama.api.JoinTournamentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new JoinTournamentRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.heroiclabs.nakama.api.JoinTournamentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<JoinTournamentRequest> PARSER;

  public static com.google.protobuf.Parser<JoinTournamentRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

