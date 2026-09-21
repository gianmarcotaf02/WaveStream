package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public enum SentryItemType implements io.sentry.JsonSerializable {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    ReplayEvent(io.sentry.SentryReplayEvent.REPLAY_EVENT_TYPE),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Unknown("__unknown__");

    private final java.lang.String itemType;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SentryItemType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SentryItemType deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            return io.sentry.SentryItemType.valueOfLabel(objectReader.nextString().toLowerCase(java.util.Locale.ROOT));
        }
    }

    SentryItemType(java.lang.String str) {
        this.itemType = str;
    }

    public static io.sentry.SentryItemType resolve(java.lang.Object obj) {
        if (obj instanceof io.sentry.SentryEvent) {
            return Event;
        }
        if (obj instanceof io.sentry.protocol.SentryTransaction) {
            return Transaction;
        }
        if (obj instanceof io.sentry.Session) {
            return Session;
        }
        return obj instanceof io.sentry.clientreport.ClientReport ? ClientReport : Attachment;
    }

    public static io.sentry.SentryItemType valueOfLabel(java.lang.String str) {
        for (io.sentry.SentryItemType sentryItemType : values()) {
            if (sentryItemType.itemType.equals(str)) {
                return sentryItemType;
            }
        }
        return Unknown;
    }

    public java.lang.String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.value(this.itemType);
    }
}
