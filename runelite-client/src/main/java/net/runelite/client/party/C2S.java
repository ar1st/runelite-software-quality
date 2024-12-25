package net.runelite.client.party;

public final class C2S extends
        com.google.protobuf.GeneratedMessageLite<
                C2S, C2S.Builder> implements
        // @@protoc_insertion_point(message_implements:party.C2S)
        Party.C2SOrBuilder {
    private C2S() {
    }

    private static final C2S DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<C2S> PARSER;

    private int msgCase_ = 0;
    private java.lang.Object msg_;

    public enum MsgCase {
        JOIN(1),
        PART(2),
        DATA(3),
        MSG_NOT_SET(0);
        private final int value;

        MsgCase(int value) {
            this.value = value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
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

    @java.lang.Override
    public MsgCase
    getMsgCase() {
        return MsgCase.forNumber(
                msgCase_);
    }

    /**
     * <code>.party.Join join = 1;</code>
     */
    @java.lang.Override
    public boolean hasJoin() {
        return msgCase_ == 1;
    }

    /**
     * <code>.party.Join join = 1;</code>
     */
    @java.lang.Override
    public Join getJoin() {
        if (msgCase_ == 1) {
            return (Join) msg_;
        }
        return Join.getDefaultInstance();
    }

    /**
     * <code>.party.Join join = 1;</code>
     */
    private void setJoin(Join value) {
        value.getClass();
        msg_ = value;
        msgCase_ = 1;
    }

    /**
     * <code>.party.Part part = 2;</code>
     */
    @java.lang.Override
    public boolean hasPart() {
        return msgCase_ == 2;
    }

    /**
     * <code>.party.Part part = 2;</code>
     */
    @java.lang.Override
    public net.runelite.client.party.Party.Part getPart() {
        if (msgCase_ == 2) {
            return (net.runelite.client.party.Party.Part) msg_;
        }
        return net.runelite.client.party.Party.Part.getDefaultInstance();
    }

    /**
     * <code>.party.Part part = 2;</code>
     */
    private void setPart(net.runelite.client.party.Party.Part value) {
        value.getClass();
        msg_ = value;
        msgCase_ = 2;
    }

    /**
     * <code>.party.Part part = 2;</code>
     */
    private void clearPart() {
        if (msgCase_ == 2) {
            msgCase_ = 0;
            msg_ = null;
        }
    }

    /**
     * <code>.party.Data data = 3;</code>
     */
    @java.lang.Override
    public boolean hasData() {
        return msgCase_ == 3;
    }

    /**
     * <code>.party.Data data = 3;</code>
     */
    @java.lang.Override
    public net.runelite.client.party.Party.Data getData() {
        if (msgCase_ == 3) {
            return (net.runelite.client.party.Party.Data) msg_;
        }
        return net.runelite.client.party.Party.Data.getDefaultInstance();
    }

    /**
     * <code>.party.Data data = 3;</code>
     */
    private void setData(net.runelite.client.party.Party.Data value) {
        value.getClass();
        msg_ = value;
        msgCase_ = 3;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public Builder newBuilder(C2S prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code party.C2S}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    C2S, Builder> implements
            // @@protoc_insertion_point(builder_implements:party.C2S)
            net.runelite.client.party.Party.C2SOrBuilder {
        // Construct using net.runelite.client.party.Party.C2S.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }

        @java.lang.Override
        public MsgCase
        getMsgCase() {
            return instance.getMsgCase();
        }


        /**
         * <code>.party.Join join = 1;</code>
         */
        @java.lang.Override
        public boolean hasJoin() {
            return instance.hasJoin();
        }

        /**
         * <code>.party.Join join = 1;</code>
         */
        @java.lang.Override
        public Join getJoin() {
            return instance.getJoin();
        }

        /**
         * <code>.party.Join join = 1;</code>
         */
        public Builder setJoin(Join value) {
            copyOnWrite();
            instance.setJoin(value);
            return this;
        }

        /**
         * <code>.party.Join join = 1;</code>
         */
        public Builder setJoin(Join.Builder builderForValue) {
            copyOnWrite();
            instance.setJoin(builderForValue.build());
            return this;
        }

        /**
         * <code>.party.Part part = 2;</code>
         */
        @java.lang.Override
        public boolean hasPart() {
            return instance.hasPart();
        }

        /**
         * <code>.party.Part part = 2;</code>
         */
        @java.lang.Override
        public net.runelite.client.party.Party.Part getPart() {
            return instance.getPart();
        }

        /**
         * <code>.party.Part part = 2;</code>
         */
        public Builder setPart(net.runelite.client.party.Party.Part value) {
            copyOnWrite();
            instance.setPart(value);
            return this;
        }

        /**
         * <code>.party.Part part = 2;</code>
         */
        public Builder setPart(
                net.runelite.client.party.Party.Part.Builder builderForValue) {
            copyOnWrite();
            instance.setPart(builderForValue.build());
            return this;
        }

        /**
         * <code>.party.Data data = 3;</code>
         */
        @java.lang.Override
        public boolean hasData() {
            return instance.hasData();
        }

        /**
         * <code>.party.Data data = 3;</code>
         */
        @java.lang.Override
        public net.runelite.client.party.Party.Data getData() {
            return instance.getData();
        }

        /**
         * <code>.party.Data data = 3;</code>
         */
        public Builder setData(net.runelite.client.party.Party.Data value) {
            copyOnWrite();
            instance.setData(value);
            return this;
        }

        /**
         * <code>.party.Data data = 3;</code>
         */
        public Builder setData(
                net.runelite.client.party.Party.Data.Builder builderForValue) {
            copyOnWrite();
            instance.setData(builderForValue.build());
            return this;
        }
        // @@protoc_insertion_point(builder_scope:party.C2S)
    }

    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected java.lang.Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            java.lang.Object arg0, java.lang.Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new C2S();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                java.lang.Object[] objects = new java.lang.Object[]{
                        "msg_",
                        "msgCase_",
                        Join.class,
                        net.runelite.client.party.Party.Part.class,
                        net.runelite.client.party.Party.Data.class,
                };
                java.lang.String info =
                        "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<" +
                        "\u0000\u0003<\u0000";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<C2S> parser = PARSER;
                if (parser == null) {
                    synchronized (C2S.class) {
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

    static {
        C2S defaultInstance = new C2S();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                C2S.class, defaultInstance);
    }

}
