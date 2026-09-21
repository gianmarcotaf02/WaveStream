package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final class Message implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String formatted;
    private java.lang.String message;
    private java.util.List<java.lang.String> params;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.protocol.Message> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.protocol.Message deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.protocol.Message message = new io.sentry.protocol.Message();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "params":
                        java.util.List list = (java.util.List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            message.params = list;
                            break;
                        }
                        break;
                    case "message":
                        message.message = objectReader.nextStringOrNull();
                        break;
                    case "formatted":
                        message.formatted = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            message.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return message;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String FORMATTED = "formatted";
        public static final java.lang.String MESSAGE = "message";
        public static final java.lang.String PARAMS = "params";
    }

    public java.lang.String getFormatted() {
        return this.formatted;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public java.util.List<java.lang.String> getParams() {
        return this.params;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.formatted != null) {
            objectWriter.name(io.sentry.protocol.Message.JsonKeys.FORMATTED).value(this.formatted);
        }
        if (this.message != null) {
            objectWriter.name("message").value(this.message);
        }
        java.util.List<java.lang.String> list = this.params;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(io.sentry.protocol.Message.JsonKeys.PARAMS).value(iLogger, this.params);
        }
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setFormatted(java.lang.String str) {
        this.formatted = str;
    }

    public void setMessage(java.lang.String str) {
        this.message = str;
    }

    public void setParams(java.util.List<java.lang.String> list) {
        this.params = io.sentry.util.CollectionUtils.newArrayList(list);
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }
}
