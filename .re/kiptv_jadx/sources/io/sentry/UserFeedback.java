package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class UserFeedback implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String comments;
    private java.lang.String email;
    private final io.sentry.protocol.SentryId eventId;
    private java.lang.String name;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.UserFeedback> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.UserFeedback deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.SentryId sentryIdDeserialize = null;
            java.lang.String strNextStringOrNull = null;
            java.lang.String strNextStringOrNull2 = null;
            java.lang.String strNextStringOrNull3 = null;
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "comments":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "email":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "event_id":
                        sentryIdDeserialize = new io.sentry.protocol.SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new java.util.HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            if (sentryIdDeserialize != null) {
                io.sentry.UserFeedback userFeedback = new io.sentry.UserFeedback(sentryIdDeserialize, strNextStringOrNull, strNextStringOrNull2, strNextStringOrNull3);
                userFeedback.setUnknown(map);
                return userFeedback;
            }
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Missing required field \"event_id\"");
            iLogger.log(io.sentry.SentryLevel.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String COMMENTS = "comments";
        public static final java.lang.String EMAIL = "email";
        public static final java.lang.String EVENT_ID = "event_id";
        public static final java.lang.String NAME = "name";
    }

    public UserFeedback(io.sentry.protocol.SentryId sentryId) {
        this(sentryId, null, null, null);
    }

    public java.lang.String getComments() {
        return this.comments;
    }

    public java.lang.String getEmail() {
        return this.email;
    }

    public io.sentry.protocol.SentryId getEventId() {
        return this.eventId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("event_id");
        this.eventId.serialize(objectWriter, iLogger);
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.email != null) {
            objectWriter.name("email").value(this.email);
        }
        if (this.comments != null) {
            objectWriter.name(io.sentry.UserFeedback.JsonKeys.COMMENTS).value(this.comments);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setComments(java.lang.String str) {
        this.comments = str;
    }

    public void setEmail(java.lang.String str) {
        this.email = str;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserFeedback{eventId=");
        sb.append(this.eventId);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', email='");
        sb.append(this.email);
        sb.append("', comments='");
        return Y6.f.m(sb, this.comments, "'}");
    }

    public UserFeedback(io.sentry.protocol.SentryId sentryId, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.eventId = sentryId;
        this.name = str;
        this.email = str2;
        this.comments = str3;
    }
}
