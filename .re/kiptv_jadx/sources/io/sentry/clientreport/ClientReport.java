package io.sentry.clientreport;

/* JADX INFO: loaded from: classes4.dex */
public final class ClientReport implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private final java.util.List<io.sentry.clientreport.DiscardedEvent> discardedEvents;
    private final java.util.Date timestamp;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.clientreport.ClientReport> {
        private java.lang.Exception missingRequiredFieldException(java.lang.String str, io.sentry.ILogger iLogger) {
            java.lang.String strH = Y6.f.h("Missing required field \"", str, "\"");
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(strH);
            iLogger.log(io.sentry.SentryLevel.ERROR, strH, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.clientreport.ClientReport deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) throws java.lang.Exception {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            objectReader.beginObject();
            java.util.Date dateNextDateOrNull = null;
            java.util.HashMap map = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(io.sentry.clientreport.ClientReport.JsonKeys.DISCARDED_EVENTS)) {
                    arrayList.addAll(objectReader.nextListOrNull(iLogger, new io.sentry.clientreport.DiscardedEvent.Deserializer()));
                } else if (strNextName.equals("timestamp")) {
                    dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                } else {
                    if (map == null) {
                        map = new java.util.HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            if (dateNextDateOrNull == null) {
                throw missingRequiredFieldException("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw missingRequiredFieldException(io.sentry.clientreport.ClientReport.JsonKeys.DISCARDED_EVENTS, iLogger);
            }
            io.sentry.clientreport.ClientReport clientReport = new io.sentry.clientreport.ClientReport(dateNextDateOrNull, arrayList);
            clientReport.setUnknown(map);
            return clientReport;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String DISCARDED_EVENTS = "discarded_events";
        public static final java.lang.String TIMESTAMP = "timestamp";
    }

    public ClientReport(java.util.Date date, java.util.List<io.sentry.clientreport.DiscardedEvent> list) {
        this.timestamp = date;
        this.discardedEvents = list;
    }

    public java.util.List<io.sentry.clientreport.DiscardedEvent> getDiscardedEvents() {
        return this.discardedEvents;
    }

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(io.sentry.DateUtils.getTimestamp(this.timestamp));
        objectWriter.name(io.sentry.clientreport.ClientReport.JsonKeys.DISCARDED_EVENTS).value(iLogger, this.discardedEvents);
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
}
