package net.runelite.client.party;

/**
 * <pre>
 * s-&gt;c
 * </pre>
 * <p>
 * Protobuf type {@code party.UserJoin}
 */
public final class UserJoin extends
        com.google.protobuf.GeneratedMessageLite<
                UserJoin, UserJoin.Builder> implements
        // @@protoc_insertion_point(message_implements:party.UserJoin)
        Party.UserJoinOrBuilder {
    private UserJoin() {
    }

    private long partyId_;

    /**
     * <code>int64 partyId = 1;</code>
     *
     * @return The partyId.
     */
    @Override
    public long getPartyId() {
        return partyId_;
    }

    /**
     * <code>int64 partyId = 1;</code>
     *
     * @param value The partyId to set.
     */
    private void setPartyId(long value) {

        partyId_ = value;
    }

    /**
     * <code>int64 partyId = 1;</code>
     */
    private void clearPartyId() {

        partyId_ = 0L;
    }

    private long memberId_;

    /**
     * <code>int64 memberId = 2;</code>
     *
     * @return The memberId.
     */
    @Override
    public long getMemberId() {
        return memberId_;
    }

    /**
     * <code>int64 memberId = 2;</code>
     *
     * @param value The memberId to set.
     */
    private void setMemberId(long value) {

        memberId_ = value;
    }

    /**
     * <code>int64 memberId = 2;</code>
     */
    private void clearMemberId() {

        memberId_ = 0L;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(UserJoin prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * s-&gt;c
     * </pre>
     * <p>
     * Protobuf type {@code party.UserJoin}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    UserJoin, Builder> implements
            // @@protoc_insertion_point(builder_implements:party.UserJoin)
            Party.UserJoinOrBuilder {
        // Construct using net.runelite.client.party.Party.UserJoin.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <code>int64 partyId = 1;</code>
         *
         * @return The partyId.
         */
        @Override
        public long getPartyId() {
            return instance.getPartyId();
        }

        /**
         * <code>int64 memberId = 2;</code>
         *
         * @return The memberId.
         */
        @Override
        public long getMemberId() {
            return instance.getMemberId();
        }

        /**
         * <code>int64 memberId = 2;</code>
         *
         * @param value The memberId to set.
         * @return This builder for chaining.
         */
        public Builder setMemberId(long value) {
            copyOnWrite();
            instance.setMemberId(value);
            return this;
        }

        /**
         * <code>int64 memberId = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearMemberId() {
            copyOnWrite();
            instance.clearMemberId();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:party.UserJoin)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UserJoin();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{
                        "partyId_",
                        "memberId_",
                };
                String info =
                        "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UserJoin> parser = PARSER;
                if (parser == null) {
                    synchronized (UserJoin.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser =
                                    new DefaultInstanceBasedParser<>(
                                            DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            }
            case GET_MEMOIZED_IS_INITIALIZED: {
                return (byte) 1;
            }
            case SET_MEMOIZED_IS_INITIALIZED: {
                return null;
            }
        }
        throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:party.UserJoin)
    private static final UserJoin DEFAULT_INSTANCE;

    static {
        UserJoin defaultInstance = new UserJoin();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                UserJoin.class, defaultInstance);
    }

    public static UserJoin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UserJoin> PARSER;
}
