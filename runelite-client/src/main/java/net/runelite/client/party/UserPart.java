package net.runelite.client.party;

public final class UserPart extends
        com.google.protobuf.GeneratedMessageLite<
                UserPart, UserPart.Builder> implements
        // @@protoc_insertion_point(message_implements:party.UserPart)
        UserPartOrBuilder {
    UserPart() {
    }

    private long partyId_;

    /**
     * <code>int64 partyId = 1;</code>
     *
     * @return The partyId.
     */
    @java.lang.Override
    public long getPartyId() {
        return partyId_;
    }

    private long memberId_;

    /**
     * <code>int64 memberId = 2;</code>
     *
     * @return The memberId.
     */
    @java.lang.Override
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

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(UserPart prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code party.UserPart}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    UserPart, Builder> implements
            // @@protoc_insertion_point(builder_implements:party.UserPart)
            UserPartOrBuilder {
        // Construct using UserPart.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <code>int64 partyId = 1;</code>
         *
         * @return The partyId.
         */
        @java.lang.Override
        public long getPartyId() {
            return instance.getPartyId();
        }

        /**
         * <code>int64 memberId = 2;</code>
         *
         * @return The memberId.
         */
        @java.lang.Override
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

        // @@protoc_insertion_point(builder_scope:party.UserPart)
    }

    @java.lang.Override
    @java.lang.SuppressWarnings({"fallthrough"})
    protected java.lang.Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            java.lang.Object arg0, java.lang.Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new UserPart();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                java.lang.Object[] objects = new java.lang.Object[]{
                        "partyId_",
                        "memberId_",
                };
                java.lang.String info =
                        "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<UserPart> parser = PARSER;
                if (parser == null) {
                    synchronized (UserPart.class) {
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


    // @@protoc_insertion_point(class_scope:party.UserPart)
    private static final UserPart DEFAULT_INSTANCE;

    static {
        UserPart defaultInstance = new UserPart();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                UserPart.class, defaultInstance);
    }

    public static UserPart getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<UserPart> PARSER;
}