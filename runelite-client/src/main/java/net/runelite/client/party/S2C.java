package net.runelite.client.party;

/**
 * Protobuf type {@code party.S2C}
 */
public final class S2C extends
        com.google.protobuf.GeneratedMessageLite<
                S2C, S2C.Builder> implements
        // @@protoc_insertion_point(message_implements:party.S2C)
        Party.S2COrBuilder {
    private S2C() {
    }

    private int msgCase_ = 0;
    private Object msg_;

    public enum MsgCase {
        JOIN(1),
        PART(2),
        DATA(3),
        MSG_NOT_SET(0);
        private final int value;

        private MsgCase(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static MsgCase valueOf(int value) {
            return forNumber(value);
        }

        public static MsgCase forNumber(int value) {
            switch (value) {
                case 1:
                    return JOIN;
                case 2:
                    return PART;
                case 3:
                    return DATA;
                case 0:
                    return MSG_NOT_SET;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    @Override
    public MsgCase
    getMsgCase() {
        return MsgCase.forNumber(
                msgCase_);
    }

    /**
     * <code>.party.UserJoin join = 1;</code>
     */
    @Override
    public boolean hasJoin() {
        return msgCase_ == 1;
    }

    /**
     * <code>.party.UserJoin join = 1;</code>
     */
    @Override
    public UserJoin getJoin() {
        if (msgCase_ == 1) {
            return (UserJoin) msg_;
        }
        return UserJoin.getDefaultInstance();
    }

    /**
     * <code>.party.UserJoin join = 1;</code>
     */
    private void setJoin(UserJoin value) {
        value.getClass();
        msg_ = value;
        msgCase_ = 1;
    }

    /**
     * <code>.party.UserJoin join = 1;</code>
     */
    private void mergeJoin(UserJoin value) {
        value.getClass();
        if (msgCase_ == 1 &&
            msg_ != UserJoin.getDefaultInstance()) {
            msg_ = UserJoin.newBuilder((UserJoin) msg_)
                    .mergeFrom(value).buildPartial();
        } else {
            msg_ = value;
        }
        msgCase_ = 1;
    }

    /**
     * <code>.party.UserJoin join = 1;</code>
     */
    private void clearJoin() {
        if (msgCase_ == 1) {
            msgCase_ = 0;
            msg_ = null;
        }
    }

    /**
     * <code>.party.UserPart part = 2;</code>
     */
    @Override
    public boolean hasPart() {
        return msgCase_ == 2;
    }

    /**
     * <code>.party.UserPart part = 2;</code>
     */
    @Override
    public UserPart getPart() {
        if (msgCase_ == 2) {
            return (UserPart) msg_;
        }
        return UserPart.getDefaultInstance();
    }

    /**
     * <code>.party.UserPart part = 2;</code>
     */
    private void setPart(UserPart value) {
        value.getClass();
        msg_ = value;
        msgCase_ = 2;
    }

    /**
     * <code>.party.UserPart part = 2;</code>
     */
    private void clearPart() {
        if (msgCase_ == 2) {
            msgCase_ = 0;
            msg_ = null;
        }
    }

    /**
     * <code>.party.PartyData data = 3;</code>
     */
    @Override
    public boolean hasData() {
        return msgCase_ == 3;
    }

    /**
     * <code>.party.PartyData data = 3;</code>
     */
    @Override
    public PartyData getData() {
        if (msgCase_ == 3) {
            return (PartyData) msg_;
        }
        return PartyData.getDefaultInstance();
    }

    /**
     * <code>.party.PartyData data = 3;</code>
     */
    private void setData(PartyData value) {
        value.getClass();
        msg_ = value;
        msgCase_ = 3;
    }

    public static S2C parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(S2C prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code party.S2C}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    S2C, Builder> implements
            // @@protoc_insertion_point(builder_implements:party.S2C)
            Party.S2COrBuilder {
        // Construct using net.runelite.client.party.Party.S2C.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @Override
        public MsgCase
        getMsgCase() {
            return instance.getMsgCase();
        }


        /**
         * <code>.party.UserJoin join = 1;</code>
         */
        @Override
        public boolean hasJoin() {
            return instance.hasJoin();
        }

        /**
         * <code>.party.UserJoin join = 1;</code>
         */
        @Override
        public UserJoin getJoin() {
            return instance.getJoin();
        }

        /**
         * <code>.party.UserJoin join = 1;</code>
         */
        public Builder setJoin(UserJoin value) {
            copyOnWrite();
            instance.setJoin(value);
            return this;
        }

        /**
         * <code>.party.UserJoin join = 1;</code>
         */
        public Builder setJoin(
                UserJoin.Builder builderForValue) {
            copyOnWrite();
            instance.setJoin(builderForValue.build());
            return this;
        }

        /**
         * <code>.party.UserPart part = 2;</code>
         */
        @Override
        public boolean hasPart() {
            return instance.hasPart();
        }

        /**
         * <code>.party.UserPart part = 2;</code>
         */
        @Override
        public UserPart getPart() {
            return instance.getPart();
        }

        /**
         * <code>.party.UserPart part = 2;</code>
         */
        public Builder setPart(UserPart value) {
            copyOnWrite();
            instance.setPart(value);
            return this;
        }

        /**
         * <code>.party.UserPart part = 2;</code>
         */
        public Builder setPart(
                UserPart.Builder builderForValue) {
            copyOnWrite();
            instance.setPart(builderForValue.build());
            return this;
        }

        /**
         * <code>.party.PartyData data = 3;</code>
         */
        @Override
        public boolean hasData() {
            return instance.hasData();
        }

        /**
         * <code>.party.PartyData data = 3;</code>
         */
        @Override
        public PartyData getData() {
            return instance.getData();
        }

        /**
         * <code>.party.PartyData data = 3;</code>
         */
        public Builder setData(PartyData value) {
            copyOnWrite();
            instance.setData(value);
            return this;
        }

        /**
         * <code>.party.PartyData data = 3;</code>
         */
        public Builder setData(
                PartyData.Builder builderForValue) {
            copyOnWrite();
            instance.setData(builderForValue.build());
            return this;
        }

        // @@protoc_insertion_point(builder_scope:party.S2C)
    }

    @Override
    @SuppressWarnings({"unchecked", "fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new S2C();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{
                        "msg_",
                        "msgCase_",
                        UserJoin.class,
                        UserPart.class,
                        PartyData.class,
                };
                String info =
                        "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<" +
                        "\u0000\u0003<\u0000";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<S2C> parser = PARSER;
                if (parser == null) {
                    synchronized (S2C.class) {
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


    // @@protoc_insertion_point(class_scope:party.S2C)
    private static final S2C DEFAULT_INSTANCE;

    static {
        S2C defaultInstance = new S2C();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                S2C.class, defaultInstance);
    }

    private static volatile com.google.protobuf.Parser<S2C> PARSER;
}
