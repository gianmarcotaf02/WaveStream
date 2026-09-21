package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryTransaction extends io.sentry.SentryBaseEvent implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private final java.util.Map<java.lang.String, io.sentry.protocol.MeasurementValue> measurements;
    private final java.util.List<io.sentry.protocol.SentrySpan> spans;
    private java.lang.Double startTimestamp;
    private java.lang.Double timestamp;
    private java.lang.String transaction;
    private io.sentry.protocol.TransactionInfo transactionInfo;
    private final java.lang.String type;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.SentryTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.SentryTransaction deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.SentryTransaction sentryTransaction = new io.sentry.protocol.SentryTransaction("", java.lang.Double.valueOf(0.0d), null, new java.util.ArrayList(), new java.util.HashMap(), new io.sentry.protocol.TransactionInfo(io.sentry.protocol.TransactionNameSource.CUSTOM.apiName()));
            io.sentry.SentryBaseEvent.Deserializer deserializer = new io.sentry.SentryBaseEvent.Deserializer();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "start_timestamp":
                        try {
                            java.lang.Double dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                            if (dNextDoubleOrNull != null) {
                                sentryTransaction.startTimestamp = dNextDoubleOrNull;
                            }
                            break;
                        } catch (java.lang.NumberFormatException unused) {
                            java.util.Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                            if (dateNextDateOrNull != null) {
                                sentryTransaction.startTimestamp = java.lang.Double.valueOf(io.sentry.DateUtils.dateToSeconds(dateNextDateOrNull));
                            }
                            break;
                        }
                        break;
                    case "measurements":
                        java.util.Map mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new io.sentry.protocol.MeasurementValue.Deserializer());
                        if (mapNextMapOrNull != null) {
                            sentryTransaction.measurements.putAll(mapNextMapOrNull);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        objectReader.nextString();
                        break;
                    case "timestamp":
                        try {
                            java.lang.Double dNextDoubleOrNull2 = objectReader.nextDoubleOrNull();
                            if (dNextDoubleOrNull2 != null) {
                                sentryTransaction.timestamp = dNextDoubleOrNull2;
                            }
                            break;
                        } catch (java.lang.NumberFormatException unused2) {
                            java.util.Date dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                            if (dateNextDateOrNull2 != null) {
                                sentryTransaction.timestamp = java.lang.Double.valueOf(io.sentry.DateUtils.dateToSeconds(dateNextDateOrNull2));
                            }
                            break;
                        }
                        break;
                    case "spans":
                        java.util.List listNextListOrNull = objectReader.nextListOrNull(iLogger, new io.sentry.protocol.SentrySpan.Deserializer());
                        if (listNextListOrNull != null) {
                            sentryTransaction.spans.addAll(listNextListOrNull);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        sentryTransaction.transactionInfo = new io.sentry.protocol.TransactionInfo.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "transaction":
                        sentryTransaction.transaction = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (deserializer.deserializeValue(sentryTransaction, strNextName, objectReader, iLogger)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                            }
                            objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                            break;
                        }
                        break;
                }
            }
            sentryTransaction.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryTransaction;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String MEASUREMENTS = "measurements";
        public static final java.lang.String SPANS = "spans";
        public static final java.lang.String START_TIMESTAMP = "start_timestamp";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TRANSACTION = "transaction";
        public static final java.lang.String TRANSACTION_INFO = "transaction_info";
        public static final java.lang.String TYPE = "type";
    }

    public SentryTransaction(io.sentry.SentryTracer sentryTracer) {
        super(sentryTracer.getEventId());
        this.spans = new java.util.ArrayList();
        this.type = "transaction";
        this.measurements = new java.util.HashMap();
        io.sentry.util.Objects.requireNonNull(sentryTracer, "sentryTracer is required");
        this.startTimestamp = java.lang.Double.valueOf(io.sentry.DateUtils.nanosToSeconds(sentryTracer.getStartDate().nanoTimestamp()));
        this.timestamp = java.lang.Double.valueOf(io.sentry.DateUtils.nanosToSeconds(sentryTracer.getStartDate().laterDateNanosTimestampByDiff(sentryTracer.getFinishDate())));
        this.transaction = sentryTracer.getName();
        for (io.sentry.Span span : sentryTracer.getChildren()) {
            if (java.lang.Boolean.TRUE.equals(span.isSampled())) {
                this.spans.add(new io.sentry.protocol.SentrySpan(span));
            }
        }
        io.sentry.protocol.Contexts contexts = getContexts();
        contexts.putAll(sentryTracer.getContexts());
        io.sentry.SpanContext spanContext = sentryTracer.getSpanContext();
        java.util.Map<java.lang.String, java.lang.Object> data = sentryTracer.getData();
        io.sentry.SpanContext spanContext2 = new io.sentry.SpanContext(spanContext.getTraceId(), spanContext.getSpanId(), spanContext.getParentSpanId(), spanContext.getOperation(), spanContext.getDescription(), spanContext.getSamplingDecision(), spanContext.getStatus(), spanContext.getOrigin());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : spanContext.getTags().entrySet()) {
            setTag(entry.getKey(), entry.getValue());
        }
        if (data != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : data.entrySet()) {
                spanContext2.setData(entry2.getKey(), entry2.getValue());
            }
        }
        contexts.setTrace(spanContext2);
        this.transactionInfo = new io.sentry.protocol.TransactionInfo(sentryTracer.getTransactionNameSource().apiName());
    }

    private java.math.BigDecimal doubleToBigDecimal(java.lang.Double d4) {
        return java.math.BigDecimal.valueOf(d4.doubleValue()).setScale(6, java.math.RoundingMode.DOWN);
    }

    public java.util.Map<java.lang.String, io.sentry.protocol.MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    public io.sentry.TracesSamplingDecision getSamplingDecision() {
        io.sentry.SpanContext trace = getContexts().getTrace();
        if (trace == null) {
            return null;
        }
        return trace.getSamplingDecision();
    }

    public java.util.List<io.sentry.protocol.SentrySpan> getSpans() {
        return this.spans;
    }

    public java.lang.Double getStartTimestamp() {
        return this.startTimestamp;
    }

    public io.sentry.SpanStatus getStatus() {
        io.sentry.SpanContext trace = getContexts().getTrace();
        if (trace != null) {
            return trace.getStatus();
        }
        return null;
    }

    public java.lang.Double getTimestamp() {
        return this.timestamp;
    }

    public java.lang.String getTransaction() {
        return this.transaction;
    }

    public java.lang.String getType() {
        return "transaction";
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public boolean isFinished() {
        return this.timestamp != null;
    }

    public boolean isSampled() {
        io.sentry.TracesSamplingDecision samplingDecision = getSamplingDecision();
        if (samplingDecision == null) {
            return false;
        }
        return samplingDecision.getSampled().booleanValue();
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.transaction != null) {
            objectWriter.name("transaction").value(this.transaction);
        }
        objectWriter.name("start_timestamp").value(iLogger, doubleToBigDecimal(this.startTimestamp));
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(this.timestamp));
        }
        if (!this.spans.isEmpty()) {
            objectWriter.name(io.sentry.protocol.SentryTransaction.JsonKeys.SPANS).value(iLogger, this.spans);
        }
        objectWriter.name("type").value("transaction");
        if (!this.measurements.isEmpty()) {
            objectWriter.name("measurements").value(iLogger, this.measurements);
        }
        objectWriter.name(io.sentry.protocol.SentryTransaction.JsonKeys.TRANSACTION_INFO).value(iLogger, this.transactionInfo);
        new io.sentry.SentryBaseEvent.Serializer().serialize(this, objectWriter, iLogger);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public SentryTransaction(java.lang.String str, java.lang.Double d4, java.lang.Double d6, java.util.List<io.sentry.protocol.SentrySpan> list, java.util.Map<java.lang.String, io.sentry.protocol.MeasurementValue> map, io.sentry.protocol.TransactionInfo transactionInfo) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.spans = arrayList;
        this.type = "transaction";
        java.util.HashMap map2 = new java.util.HashMap();
        this.measurements = map2;
        this.transaction = str;
        this.startTimestamp = d4;
        this.timestamp = d6;
        arrayList.addAll(list);
        map2.putAll(map);
        java.util.Iterator<io.sentry.protocol.SentrySpan> it = list.iterator();
        while (it.hasNext()) {
            this.measurements.putAll(it.next().getMeasurements());
        }
        this.transactionInfo = transactionInfo;
    }
}
