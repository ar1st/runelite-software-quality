package net.runelite.client.party;

public final class Part extends
        com.google.protobuf.GeneratedMessageLite<
                Part, Part.Builder> implements
        // @@protoc_insertion_point(message_implements:party.Part)
        PartOrBuilder {
    private Part() {
    }


    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Part prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code party.Part}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    Part, Builder> implements
            // @@protoc_insertion_point(builder_implements:party.Part)
            PartOrBuilder {
        // Construct using Part.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        // @@protoc_insertion_point(builder_scope:party.Part)
    }

    @java.lang.Override
    @java.lang.SuppressWarnings({"fallthrough"})
    protected java.lang.Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            java.lang.Object arg0, java.lang.Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Part();
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case BUILD_MESSAGE_INFO: {
                java.lang.Object[] objects = null;
                java.lang.String info =
                        "\u0000\u0000";
                return newMessageInfo(DEFAULT_INSTANCE, info, objects);
            }
            // fall through
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                com.google.protobuf.Parser<Part> parser = PARSER;
                if (parser == null) {
                    synchronized (Part.class) {
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


    // @@protoc_insertion_point(class_scope:party.Part)
    private static final Part DEFAULT_INSTANCE;

    static {
        Part defaultInstance = new Part();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                Part.class, defaultInstance);
    }

    public static Part getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Part> PARSER;
}

