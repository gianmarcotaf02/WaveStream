package io.sentry.clientreport;

/* JADX INFO: loaded from: classes4.dex */
public final class DiscardedEvent implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private final java.lang.String category;
    private final java.lang.Long quantity;
    private final java.lang.String reason;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.clientreport.DiscardedEvent> {
        private java.lang.Exception missingRequiredFieldException(java.lang.String str, io.sentry.ILogger iLogger) {
            java.lang.String strH = Y6.f.h("Missing required field \"", str, "\"");
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(strH);
            iLogger.log(io.sentry.SentryLevel.ERROR, strH, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.clientreport.DiscardedEvent deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) throws java.lang.Exception {
            objectReader.beginObject();
            java.lang.String strNextStringOrNull = null;
            java.lang.String strNextStringOrNull2 = null;
            java.lang.Long lNextLongOrNull = null;
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "quantity":
                        lNextLongOrNull = objectReader.nextLongOrNull();
                        break;
                    case "reason":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "category":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
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
            if (strNextStringOrNull == null) {
                throw missingRequiredFieldException(io.sentry.clientreport.DiscardedEvent.JsonKeys.REASON, iLogger);
            }
            if (strNextStringOrNull2 == null) {
                throw missingRequiredFieldException("category", iLogger);
            }
            if (lNextLongOrNull == null) {
                throw missingRequiredFieldException(io.sentry.clientreport.DiscardedEvent.JsonKeys.QUANTITY, iLogger);
            }
            io.sentry.clientreport.DiscardedEvent discardedEvent = new io.sentry.clientreport.DiscardedEvent(strNextStringOrNull, strNextStringOrNull2, lNextLongOrNull);
            discardedEvent.setUnknown(map);
            return discardedEvent;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String CATEGORY = "category";
        public static final java.lang.String QUANTITY = "quantity";
        public static final java.lang.String REASON = "reason";
    }

    public DiscardedEvent(java.lang.String str, java.lang.String str2, java.lang.Long l2) {
        this.reason = str;
        this.category = str2;
        this.quantity = l2;
    }

    public java.lang.String getCategory() {
        return this.category;
    }

    public java.lang.Long getQuantity() {
        return this.quantity;
    }

    public java.lang.String getReason() {
        return this.reason;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(io.sentry.clientreport.DiscardedEvent.JsonKeys.REASON).value(this.reason);
        objectWriter.name("category").value(this.category);
        objectWriter.name(io.sentry.clientreport.DiscardedEvent.JsonKeys.QUANTITY).value(this.quantity);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public java.lang.String toString() {
        return "DiscardedEvent{reason='" + this.reason + "', category='" + this.category + "', quantity=" + this.quantity + '}';
    }
}
