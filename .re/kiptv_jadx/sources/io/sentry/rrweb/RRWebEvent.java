package io.sentry.rrweb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RRWebEvent {
    private long timestamp;
    private io.sentry.rrweb.RRWebEventType type;

    public static final class Deserializer {
        public boolean deserializeValue(io.sentry.rrweb.RRWebEvent rRWebEvent, java.lang.String str, io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            str.getClass();
            if (str.equals("type")) {
                rRWebEvent.type = (io.sentry.rrweb.RRWebEventType) io.sentry.util.Objects.requireNonNull((io.sentry.rrweb.RRWebEventType) objectReader.nextOrNull(iLogger, new io.sentry.rrweb.RRWebEventType.Deserializer()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            rRWebEvent.timestamp = objectReader.nextLong();
            return true;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String TAG = "tag";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TYPE = "type";
    }

    public static final class Serializer {
        public void serialize(io.sentry.rrweb.RRWebEvent rRWebEvent, io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
            objectWriter.name("type").value(iLogger, rRWebEvent.type);
            objectWriter.name("timestamp").value(rRWebEvent.timestamp);
        }
    }

    public RRWebEvent(io.sentry.rrweb.RRWebEventType rRWebEventType) {
        this.type = rRWebEventType;
        this.timestamp = java.lang.System.currentTimeMillis();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.sentry.rrweb.RRWebEvent)) {
            return false;
        }
        io.sentry.rrweb.RRWebEvent rRWebEvent = (io.sentry.rrweb.RRWebEvent) obj;
        return this.timestamp == rRWebEvent.timestamp && this.type == rRWebEvent.type;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public io.sentry.rrweb.RRWebEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.type, java.lang.Long.valueOf(this.timestamp));
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setType(io.sentry.rrweb.RRWebEventType rRWebEventType) {
        this.type = rRWebEventType;
    }

    public RRWebEvent() {
        this(io.sentry.rrweb.RRWebEventType.Custom);
    }
}
