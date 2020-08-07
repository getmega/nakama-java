// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: github.com/heroiclabs/nakama-common/api/realtime.proto

package com.heroiclabs.nakama.rtapi;

public interface EnvelopeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.Envelope)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string cid = 1;</code>
   */
  java.lang.String getCid();
  /**
   * <code>optional string cid = 1;</code>
   */
  com.google.protobuf.ByteString
      getCidBytes();

  /**
   * <pre>
   * A response from a channel join operation.
   * </pre>
   *
   * <code>optional .nakama.realtime.Channel channel = 2;</code>
   */
  com.heroiclabs.nakama.rtapi.Channel getChannel();

  /**
   * <pre>
   * Join a realtime chat channel.
   * </pre>
   *
   * <code>optional .nakama.realtime.ChannelJoin channel_join = 3;</code>
   */
  com.heroiclabs.nakama.rtapi.ChannelJoin getChannelJoin();

  /**
   * <pre>
   * Leave a realtime chat channel.
   * </pre>
   *
   * <code>optional .nakama.realtime.ChannelLeave channel_leave = 4;</code>
   */
  com.heroiclabs.nakama.rtapi.ChannelLeave getChannelLeave();

  /**
   * <pre>
   * An incoming message on a realtime chat channel.
   * </pre>
   *
   * <code>optional .nakama.api.ChannelMessage channel_message = 5;</code>
   */
  com.heroiclabs.nakama.api.ChannelMessage getChannelMessage();

  /**
   * <pre>
   * An acknowledgement received in response to sending a message on a chat channel.
   * </pre>
   *
   * <code>optional .nakama.realtime.ChannelMessageAck channel_message_ack = 6;</code>
   */
  com.heroiclabs.nakama.rtapi.ChannelMessageAck getChannelMessageAck();

  /**
   * <pre>
   * Send a message to a realtime chat channel.
   * </pre>
   *
   * <code>optional .nakama.realtime.ChannelMessageSend channel_message_send = 7;</code>
   */
  com.heroiclabs.nakama.rtapi.ChannelMessageSend getChannelMessageSend();

  /**
   * <pre>
   * Update a message previously sent to a realtime chat channel.
   * </pre>
   *
   * <code>optional .nakama.realtime.ChannelMessageUpdate channel_message_update = 8;</code>
   */
  com.heroiclabs.nakama.rtapi.ChannelMessageUpdate getChannelMessageUpdate();

  /**
   * <pre>
   * Remove a message previously sent to a realtime chat channel.
   * </pre>
   *
   * <code>optional .nakama.realtime.ChannelMessageRemove channel_message_remove = 9;</code>
   */
  com.heroiclabs.nakama.rtapi.ChannelMessageRemove getChannelMessageRemove();

  /**
   * <pre>
   * Presence update for a particular realtime chat channel.
   * </pre>
   *
   * <code>optional .nakama.realtime.ChannelPresenceEvent channel_presence_event = 10;</code>
   */
  com.heroiclabs.nakama.rtapi.ChannelPresenceEvent getChannelPresenceEvent();

  /**
   * <pre>
   * Describes an error which occurred on the server.
   * </pre>
   *
   * <code>optional .nakama.realtime.Error error = 11;</code>
   */
  com.heroiclabs.nakama.rtapi.Error getError();

  /**
   * <pre>
   * Incoming information about a realtime match.
   * </pre>
   *
   * <code>optional .nakama.realtime.Match match = 12;</code>
   */
  com.heroiclabs.nakama.rtapi.Match getMatch();

  /**
   * <pre>
   * A client to server request to create a realtime match.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchCreate match_create = 13;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchCreate getMatchCreate();

  /**
   * <pre>
   * Incoming realtime match data delivered from the server.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchData match_data = 14;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchData getMatchData();

  /**
   * <pre>
   * A client to server request to send data to a realtime match.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchDataSend match_data_send = 15;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchDataSend getMatchDataSend();

  /**
   * <pre>
   * A client to server request to join a realtime match.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchJoin match_join = 16;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchJoin getMatchJoin();

  /**
   * <pre>
   * A client to server request to leave a realtime match.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchLeave match_leave = 17;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchLeave getMatchLeave();

  /**
   * <pre>
   * Presence update for a particular realtime match.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchPresenceEvent match_presence_event = 18;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchPresenceEvent getMatchPresenceEvent();

  /**
   * <pre>
   * Submit a new matchmaking process request.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchmakerAdd matchmaker_add = 19;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchmakerAdd getMatchmakerAdd();

  /**
   * <pre>
   * A successful matchmaking result.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchmakerMatched matchmaker_matched = 20;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchmakerMatched getMatchmakerMatched();

  /**
   * <pre>
   * Cancel a matchmaking process using a ticket.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchmakerRemove matchmaker_remove = 21;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchmakerRemove getMatchmakerRemove();

  /**
   * <pre>
   * A response from starting a new matchmaking process.
   * </pre>
   *
   * <code>optional .nakama.realtime.MatchmakerTicket matchmaker_ticket = 22;</code>
   */
  com.heroiclabs.nakama.rtapi.MatchmakerTicket getMatchmakerTicket();

  /**
   * <pre>
   * Notifications send by the server.
   * </pre>
   *
   * <code>optional .nakama.realtime.Notifications notifications = 23;</code>
   */
  com.heroiclabs.nakama.rtapi.Notifications getNotifications();

  /**
   * <pre>
   * RPC call or response.
   * </pre>
   *
   * <code>optional .nakama.api.Rpc rpc = 24;</code>
   */
  com.heroiclabs.nakama.api.Rpc getRpc();

  /**
   * <pre>
   * An incoming status snapshot for some set of users.
   * </pre>
   *
   * <code>optional .nakama.realtime.Status status = 25;</code>
   */
  com.heroiclabs.nakama.rtapi.Status getStatus();

  /**
   * <pre>
   * Start following some set of users to receive their status updates.
   * </pre>
   *
   * <code>optional .nakama.realtime.StatusFollow status_follow = 26;</code>
   */
  com.heroiclabs.nakama.rtapi.StatusFollow getStatusFollow();

  /**
   * <pre>
   * An incoming status update.
   * </pre>
   *
   * <code>optional .nakama.realtime.StatusPresenceEvent status_presence_event = 27;</code>
   */
  com.heroiclabs.nakama.rtapi.StatusPresenceEvent getStatusPresenceEvent();

  /**
   * <pre>
   * Stop following some set of users to no longer receive their status updates.
   * </pre>
   *
   * <code>optional .nakama.realtime.StatusUnfollow status_unfollow = 28;</code>
   */
  com.heroiclabs.nakama.rtapi.StatusUnfollow getStatusUnfollow();

  /**
   * <pre>
   * Set the user's own status.
   * </pre>
   *
   * <code>optional .nakama.realtime.StatusUpdate status_update = 29;</code>
   */
  com.heroiclabs.nakama.rtapi.StatusUpdate getStatusUpdate();

  /**
   * <pre>
   * A data message delivered over a stream.
   * </pre>
   *
   * <code>optional .nakama.realtime.StreamData stream_data = 30;</code>
   */
  com.heroiclabs.nakama.rtapi.StreamData getStreamData();

  /**
   * <pre>
   * Presence update for a particular stream.
   * </pre>
   *
   * <code>optional .nakama.realtime.StreamPresenceEvent stream_presence_event = 31;</code>
   */
  com.heroiclabs.nakama.rtapi.StreamPresenceEvent getStreamPresenceEvent();

  /**
   * <pre>
   * Application-level heartbeat and connection check.
   * </pre>
   *
   * <code>optional .nakama.realtime.Ping ping = 32;</code>
   */
  com.heroiclabs.nakama.rtapi.Ping getPing();

  /**
   * <pre>
   * Application-level heartbeat and connection check response.
   * </pre>
   *
   * <code>optional .nakama.realtime.Pong pong = 33;</code>
   */
  com.heroiclabs.nakama.rtapi.Pong getPong();

  public com.heroiclabs.nakama.rtapi.Envelope.MessageCase getMessageCase();
}
