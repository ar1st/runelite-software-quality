package net.runelite.client.party;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

public final class Join extends
        GeneratedMessageLite<Join, Join.Builder> implements
        MessageLiteOrBuilder {

    private long partyId_;
    private long memberId_;
    private static final Join DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<Join> PARSER;

    private Join() {
    }


    static {
        Join defaultInstance = new Join();
        // New instances are implicitly immutable so no need to make
        // immutable.
        DEFAULT_INSTANCE = defaultInstance;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                Join.class, defaultInstance);
    }

    public static Join getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected java.lang.Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            java.lang.Object arg0, java.lang.Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new Join();
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
                com.google.protobuf.Parser<Join> parser = PARSER;
                if (parser == null) {
                    synchronized (Join.class) {
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

    public long getPartyId() {
        return partyId_;
    }

    private void setPartyId(long value) {
        partyId_ = value;
    }

    public long getMemberId() {
        return memberId_;
    }

    private void setMemberId(long value) {
        memberId_ = value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder extends
            GeneratedMessageLite.Builder<Join, Builder> {

        private Builder() {
            super(new Join());
        }

        public long getPartyId() {
            return instance.getPartyId();
        }

        public Builder setPartyId(long value) {
            copyOnWrite();
            instance.setPartyId(value);
            return this;
        }

        public long getMemberId() {
            return instance.getMemberId();
        }

        public Builder setMemberId(long value) {
            copyOnWrite();
            instance.setMemberId(value);
            return this;
        }
    }
}
