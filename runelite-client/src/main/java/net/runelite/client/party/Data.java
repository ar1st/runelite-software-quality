package net.runelite.client.party;

/**
 * Protobuf type {@code party.Data}
 */
public final class Data extends
        com.google.protobuf.GeneratedMessageLite<
                Data, Data.Builder> implements
        // @@protoc_insertion_point(message_implements:party.Data)
        Party.DataOrBuilder {
    private Data() {
        type_ = "";
        data_ = com.google.protobuf.ByteString.EMPTY;
    }

    private String type_;

    /**
     * <code>string type = 2;</code>
     *
     * @return The type.
     */
    @Override
    public String getType() {
        return type_;
    }

    /**
     * <code>string type = 2;</code>
     *
     * @return The bytes for type.
     */
    @Override
    public com.google.protobuf.ByteString
    getTypeBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(type_);
    }

    /**
     * <code>string type = 2;</code>
     *
     * @param value The type to set.
     */
    private void setType(
            String value) {

        type_ = value;
    }

    private com.google.protobuf.ByteString data_;

    /**
     * <code>bytes data = 1;</code>
     *
     * @return The data.
     */
    @Override
    public com.google.protobuf.ByteString getData() {
        return data_;
    }

    /**
     * <code>bytes data = 1;</code>
     *
     * @param value The data to set.
     */
    private void setData(com.google.protobuf.ByteString value) {

        data_ = value;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Data prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code party.Data}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    Data, Builder> implements
            // @@protoc_insertion_point(builder_implements:party.Data)
            Party.DataOrBuilder {
        // Construct using net.runelite.client.party.Party.Data.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <code>string type = 2;</code>
         *
         * @return The type.
         */
        @Override
        public String getType() {
            return instance.getType();
        }

        /**
         * <code>string type = 2;</code>
         *
         * @return The bytes for type.
         */
        @Override
        public com.google.protobuf.ByteString
        getTypeBytes() {
            return instance.getTypeBytes();
        }

        /**
         * <code>string type = 2;</code>
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
         * <code>bytes data = 1;</code>
         *
         * @return The data.
         */
        @Override
        public com.google.protobuf.ByteString getData() {
            return instance.getData();
        }

        /**
         * <code>bytes data = 1;</code>
         *
         * @param value The data to set.
         * @return This builder for chaining.
         */
        public Builder setData(com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setData(value);
            return this;
        }


        // @@protoc_insertion_point(builder_scope:party.Data)
    }

    @Override
    @SuppressWarnings({"fallthrough"})
    protected Object dynamicMethod(
            MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Data();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                Object[] objects = new Object[]{
                        "data_",
                        "type_",
                };
                String info =
                        "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0208";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<Data> parser = PARSER;
                if (parser == null) {
                    synchronized (Data.class) {
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


    // @@protoc_insertion_point(class_scope:party.Data)
    private static final Data DEFAULT_INSTANCE;

    static {
        Data defaultInstance = new Data();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                Data.class, defaultInstance);
    }

    public static Data getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Data> PARSER;

}
