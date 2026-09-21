package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryId implements io.sentry.JsonSerializable {
    public static final io.sentry.protocol.SentryId EMPTY_ID = new io.sentry.protocol.SentryId(io.sentry.util.StringUtils.PROPER_NIL_UUID.replace("-", ""));
    private final io.sentry.util.LazyEvaluator<java.lang.String> lazyStringValue;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SentryId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SentryId deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            return new io.sentry.protocol.SentryId(objectReader.nextString());
        }
    }

    public SentryId() {
        this((java.util.UUID) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.String lambda$new$0(java.util.UUID uuid) {
        return lambda$new$1(io.sentry.util.UUIDStringUtils.toSentryIdString(uuid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String lambda$new$2(java.lang.String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: normalize, reason: merged with bridge method [inline-methods] */
    public java.lang.String lambda$new$1(java.lang.String str) {
        return io.sentry.util.StringUtils.normalizeUUID(str).replace("-", "");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.sentry.protocol.SentryId.class != obj.getClass()) {
            return false;
        }
        return this.lazyStringValue.getValue().equals(((io.sentry.protocol.SentryId) obj).lazyStringValue.getValue());
    }

    public int hashCode() {
        return this.lazyStringValue.getValue().hashCode();
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.value(toString());
    }

    public java.lang.String toString() {
        return this.lazyStringValue.getValue();
    }

    public SentryId(java.util.UUID uuid) {
        if (uuid != null) {
            this.lazyStringValue = new io.sentry.util.LazyEvaluator<>(new F.f0(this, uuid, 17));
        } else {
            this.lazyStringValue = new io.sentry.util.LazyEvaluator<>(new io.sentry.protocol.a(0));
        }
    }

    public SentryId(java.lang.String str) {
        java.lang.String strNormalizeUUID = io.sentry.util.StringUtils.normalizeUUID(str);
        if (strNormalizeUUID.length() != 32 && strNormalizeUUID.length() != 36) {
            throw new java.lang.IllegalArgumentException(p121o0.p.C("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ", str));
        }
        if (strNormalizeUUID.length() == 36) {
            this.lazyStringValue = new io.sentry.util.LazyEvaluator<>(new F.f0(this, strNormalizeUUID, 18));
        } else {
            this.lazyStringValue = new io.sentry.util.LazyEvaluator<>(new F1.e(21, strNormalizeUUID));
        }
    }
}
