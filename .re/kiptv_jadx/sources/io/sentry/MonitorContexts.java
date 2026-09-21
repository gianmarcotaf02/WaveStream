package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class MonitorContexts extends java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> implements io.sentry.JsonSerializable {
    private static final long serialVersionUID = 3987329379811822556L;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.MonitorContexts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.MonitorContexts deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            io.sentry.MonitorContexts monitorContexts = new io.sentry.MonitorContexts();
            objectReader.beginObject();
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("trace")) {
                    monitorContexts.setTrace(new io.sentry.SpanContext.Deserializer().deserialize(objectReader, iLogger));
                } else {
                    java.lang.Object objNextObjectOrNull = objectReader.nextObjectOrNull();
                    if (objNextObjectOrNull != null) {
                        monitorContexts.put(strNextName, objNextObjectOrNull);
                    }
                }
            }
            objectReader.endObject();
            return monitorContexts;
        }
    }

    public MonitorContexts() {
    }

    private <T> T toContextType(java.lang.String str, java.lang.Class<T> cls) {
        java.lang.Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public io.sentry.SpanContext getTrace() {
        return (io.sentry.SpanContext) toContextType("trace", io.sentry.SpanContext.class);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        java.util.ArrayList<java.lang.String> list = java.util.Collections.list(keys());
        java.util.Collections.sort(list);
        for (java.lang.String str : list) {
            java.lang.Object obj = get(str);
            if (obj != null) {
                objectWriter.name(str).value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public void setTrace(io.sentry.SpanContext spanContext) {
        io.sentry.util.Objects.requireNonNull(spanContext, "traceContext is required");
        put("trace", spanContext);
    }

    public MonitorContexts(io.sentry.MonitorContexts monitorContexts) {
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : monitorContexts.entrySet()) {
            if (entry != null) {
                java.lang.Object value = entry.getValue();
                if ("trace".equals(entry.getKey()) && (value instanceof io.sentry.SpanContext)) {
                    setTrace(new io.sentry.SpanContext((io.sentry.SpanContext) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }
}
