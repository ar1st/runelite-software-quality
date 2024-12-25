package net.runelite.client.party;

/**
 * Protobuf type {@code party.PartyData}
 */
public final class PartyData extends
        com.google.protobuf.GeneratedMessageLite<
                PartyData, PartyData.Builder> implements
        // @@protoc_insertion_point(message_implements:party.PartyData)
        Party.PartyDataOrBuilder {
    private PartyData() {
        type_ = "";
        data_ = com.google.protobuf.ByteString.EMPTY;
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

    private String type_;

    /**
     * <code>string type = 4;</code>
     *
     * @return The type.
     */
    @Override
    public String getType() {
        return type_;
    }

    /**
     * <code>string type = 4;</code>
     *
     * @return The bytes for type.
     */
    @Override
    public com.google.protobuf.ByteString
    getTypeBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(type_);
    }

    /**
     * <code>string type = 4;</code>
     *
     * @param value The type to set.
     */
    private void setType(
            String value) {
        type_ = value;
    }

    private com.google.protobuf.ByteString data_;

    /**
     * <code>bytes data = 3;</code>
     *
     * @return The data.
     */
    @Override
    public com.google.protobuf.ByteString getData() {
        return data_;
    }

    /**
     * <code>bytes data = 3;</code>
     *
     * @param value The data to set.
     */
    private void setData(com.google.protobuf.ByteString value) {
        data_ = value;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(PartyData prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code party.PartyData}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    PartyData, Builder> implements
            // @@protoc_insertion_point(builder_implements:party.PartyData)
            Party.PartyDataOrBuilder {
        // Construct using net.runelite.client.party.Party.PartyData.newBuilder()
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
         * <code>string type = 4;</code>
         *
         * @return The type.
         */
        @Override
        public String getType() {
            return instance.getType();
        }

        /**
         * <code>string type = 4;</code>
         *
         * @return The bytes for type.
         */
        @Override
        public com.google.protobuf.ByteString
        getTypeBytes() {
            return instance.getTypeBytes();
        }

        /**
         * <code>string type = 4;</code>
         *
         * @param value The type to set.
         * @return This builder for chaining.
         */
        public Builder setType(
                String value) {
            copyOnWrite();
            instance.setType(value);
            return this;
        }

        /**
         * <code>bytes data = 3;</code>
         *
         * @return The data.
         */
        @Override
        public com.google.protobuf.ByteString getData() {
            return instance.getData();
        }

        /**
         * <code>bytes data = 3;</code>
         *
         * @param value The data to set.
         * @return This builder for chaining.
         */
        public Builder setData(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setData(value);
            return this;
        }

        // @@protoc_insertion_point(builder_scope:party.PartyData)
    }

    @Override
    @SuppressWarnings({"fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new PartyData();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{
                        "partyId_",
                        "memberId_",
                        "data_",
                        "type_",
                };
                String info =
                        "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002" +
                        "\u0003\n\u0004\u0208";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<PartyData> parser = PARSER;
                if (parser == null) {
                    synchronized (PartyData.class) {
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


    // @@protoc_insertion_point(class_scope:party.PartyData)
    private static final PartyData DEFAULT_INSTANCE;

    static {
        PartyData defaultInstance = new PartyData();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                PartyData.class, defaultInstance);
    }

    public static PartyData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<PartyData> PARSER;
}
