package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfilingTransactionData implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String id;
    private java.lang.String name;
    private java.lang.Long relativeEndCpuMs;
    private java.lang.Long relativeEndNs;
    private java.lang.Long relativeStartCpuMs;
    private java.lang.Long relativeStartNs;
    private java.lang.String traceId;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.ProfilingTransactionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.ProfilingTransactionData deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.ProfilingTransactionData profilingTransactionData = new io.sentry.ProfilingTransactionData();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "relative_start_ns":
                        java.lang.Long lNextLongOrNull = objectReader.nextLongOrNull();
                        if (lNextLongOrNull == null) {
                            break;
                        } else {
                            profilingTransactionData.relativeStartNs = lNextLongOrNull;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        java.lang.Long lNextLongOrNull2 = objectReader.nextLongOrNull();
                        if (lNextLongOrNull2 == null) {
                            break;
                        } else {
                            profilingTransactionData.relativeEndNs = lNextLongOrNull2;
                            break;
                        }
                        break;
                    case "id":
                        java.lang.String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull == null) {
                            break;
                        } else {
                            profilingTransactionData.id = strNextStringOrNull;
                            break;
                        }
                        break;
                    case "name":
                        java.lang.String strNextStringOrNull2 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull2 == null) {
                            break;
                        } else {
                            profilingTransactionData.name = strNextStringOrNull2;
                            break;
                        }
                        break;
                    case "trace_id":
                        java.lang.String strNextStringOrNull3 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull3 == null) {
                            break;
                        } else {
                            profilingTransactionData.traceId = strNextStringOrNull3;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        java.lang.Long lNextLongOrNull3 = objectReader.nextLongOrNull();
                        if (lNextLongOrNull3 == null) {
                            break;
                        } else {
                            profilingTransactionData.relativeEndCpuMs = lNextLongOrNull3;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        java.lang.Long lNextLongOrNull4 = objectReader.nextLongOrNull();
                        if (lNextLongOrNull4 == null) {
                            break;
                        } else {
                            profilingTransactionData.relativeStartCpuMs = lNextLongOrNull4;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            profilingTransactionData.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profilingTransactionData;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String END_CPU_MS = "relative_cpu_end_ms";
        public static final java.lang.String END_NS = "relative_end_ns";
        public static final java.lang.String ID = "id";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String START_CPU_MS = "relative_cpu_start_ms";
        public static final java.lang.String START_NS = "relative_start_ns";
        public static final java.lang.String TRACE_ID = "trace_id";
    }

    public ProfilingTransactionData() {
        this(io.sentry.NoOpTransaction.getInstance(), 0L, 0L);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.sentry.ProfilingTransactionData.class == obj.getClass()) {
            io.sentry.ProfilingTransactionData profilingTransactionData = (io.sentry.ProfilingTransactionData) obj;
            if (this.id.equals(profilingTransactionData.id) && this.traceId.equals(profilingTransactionData.traceId) && this.name.equals(profilingTransactionData.name) && this.relativeStartNs.equals(profilingTransactionData.relativeStartNs) && this.relativeStartCpuMs.equals(profilingTransactionData.relativeStartCpuMs) && io.sentry.util.Objects.equals(this.relativeEndCpuMs, profilingTransactionData.relativeEndCpuMs) && io.sentry.util.Objects.equals(this.relativeEndNs, profilingTransactionData.relativeEndNs) && io.sentry.util.Objects.equals(this.unknown, profilingTransactionData.unknown)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.Long getRelativeEndCpuMs() {
        return this.relativeEndCpuMs;
    }

    public java.lang.Long getRelativeEndNs() {
        return this.relativeEndNs;
    }

    public java.lang.Long getRelativeStartCpuMs() {
        return this.relativeStartCpuMs;
    }

    public java.lang.Long getRelativeStartNs() {
        return this.relativeStartNs;
    }

    public java.lang.String getTraceId() {
        return this.traceId;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return io.sentry.util.Objects.hash(this.id, this.traceId, this.name, this.relativeStartNs, this.relativeEndNs, this.relativeStartCpuMs, this.relativeEndCpuMs, this.unknown);
    }

    public void notifyFinish(java.lang.Long l2, java.lang.Long l9, java.lang.Long l10, java.lang.Long l11) {
        if (this.relativeEndNs == null) {
            this.relativeEndNs = java.lang.Long.valueOf(l2.longValue() - l9.longValue());
            this.relativeStartNs = java.lang.Long.valueOf(this.relativeStartNs.longValue() - l9.longValue());
            this.relativeEndCpuMs = java.lang.Long.valueOf(l10.longValue() - l11.longValue());
            this.relativeStartCpuMs = java.lang.Long.valueOf(this.relativeStartCpuMs.longValue() - l11.longValue());
        }
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("id").value(iLogger, this.id);
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name("name").value(iLogger, this.name);
        objectWriter.name(io.sentry.ProfilingTransactionData.JsonKeys.START_NS).value(iLogger, this.relativeStartNs);
        objectWriter.name(io.sentry.ProfilingTransactionData.JsonKeys.END_NS).value(iLogger, this.relativeEndNs);
        objectWriter.name(io.sentry.ProfilingTransactionData.JsonKeys.START_CPU_MS).value(iLogger, this.relativeStartCpuMs);
        objectWriter.name(io.sentry.ProfilingTransactionData.JsonKeys.END_CPU_MS).value(iLogger, this.relativeEndCpuMs);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setId(java.lang.String str) {
        this.id = str;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setRelativeEndNs(java.lang.Long l2) {
        this.relativeEndNs = l2;
    }

    public void setRelativeStartNs(java.lang.Long l2) {
        this.relativeStartNs = l2;
    }

    public void setTraceId(java.lang.String str) {
        this.traceId = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public ProfilingTransactionData(io.sentry.ITransaction iTransaction, java.lang.Long l2, java.lang.Long l9) {
        this.id = iTransaction.getEventId().toString();
        this.traceId = iTransaction.getSpanContext().getTraceId().toString();
        this.name = iTransaction.getName().isEmpty() ? "unknown" : iTransaction.getName();
        this.relativeStartNs = l2;
        this.relativeStartCpuMs = l9;
    }
}
