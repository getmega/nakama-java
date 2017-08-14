/*
 * Copyright 2017 The Nakama Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.heroiclabs.nakama;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;

public interface SelfLinkMessage extends CollatedMessage<Boolean> {

    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    class Builder {

        public static SelfLinkMessage custom(final @NonNull String id) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLink(com.heroiclabs.nakama.Api.TLink.newBuilder()
                                    .setCustom(id));
            return new DefaultSelfLinkMessage(payload);
        }

        public static SelfLinkMessage device(final @NonNull String id) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLink(com.heroiclabs.nakama.Api.TLink.newBuilder()
                                    .setDevice(id));
            return new DefaultSelfLinkMessage(payload);
        }

        public static SelfLinkMessage email(final @NonNull String email, final @NonNull String password) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLink(com.heroiclabs.nakama.Api.TLink.newBuilder()
                                    .setEmail(com.heroiclabs.nakama.Api.AuthenticateRequest.Email.newBuilder()
                                            .setEmail(email)
                                            .setPassword(password)
                                            .build()));
            return new DefaultSelfLinkMessage(payload);
        }

        public static SelfLinkMessage facebook(final @NonNull String oauthToken) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLink(com.heroiclabs.nakama.Api.TLink.newBuilder()
                                    .setFacebook(oauthToken));
            return new DefaultSelfLinkMessage(payload);
        }

        public static SelfLinkMessage gameCenter(final @NonNull String playerId, final @NonNull String bundleId,
                                          final long timestamp, final @NonNull String salt,
                                          final @NonNull String signature, final @NonNull String publicKeyUrl) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLink(com.heroiclabs.nakama.Api.TLink.newBuilder()
                                    .setGameCenter(com.heroiclabs.nakama.Api.AuthenticateRequest.GameCenter.newBuilder()
                                            .setPlayerId(playerId)
                                            .setBundleId(bundleId)
                                            .setTimestamp(timestamp)
                                            .setSalt(salt)
                                            .setSignature(signature)
                                            .setPublicKeyUrl(publicKeyUrl)
                                            .build()));
            return new DefaultSelfLinkMessage(payload);
        }

        public static SelfLinkMessage google(final @NonNull String oauthToken) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLink(com.heroiclabs.nakama.Api.TLink.newBuilder()
                                    .setGoogle(oauthToken));
            return new DefaultSelfLinkMessage(payload);
        }

        public static SelfLinkMessage steam(final @NonNull String sessionToken) {
            final com.heroiclabs.nakama.Api.Envelope.Builder payload =
                    com.heroiclabs.nakama.Api.Envelope.newBuilder()
                            .setLink(com.heroiclabs.nakama.Api.TLink.newBuilder()
                                    .setSteam(sessionToken));
            return new DefaultSelfLinkMessage(payload);
        }

    }

}
