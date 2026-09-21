package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryEvent extends io.sentry.SentryBaseEvent implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private io.sentry.SentryValues<io.sentry.protocol.SentryException> exception;
    private java.util.List<java.lang.String> fingerprint;
    private io.sentry.SentryLevel level;
    private java.lang.String logger;
    private io.sentry.protocol.Message message;
    private java.util.Map<java.lang.String, java.lang.String> modules;
    private io.sentry.SentryValues<io.sentry.protocol.SentryThread> threads;
    private java.util.Date timestamp;
    private java.lang.String transaction;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SentryEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SentryEvent deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            objectReader.beginObject();
            io.sentry.SentryEvent sentryEvent = new io.sentry.SentryEvent();
            io.sentry.SentryBaseEvent.Deserializer deserializer = new io.sentry.SentryBaseEvent.Deserializer();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "fingerprint":
                        java.util.List list = (java.util.List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            sentryEvent.fingerprint = list;
                            break;
                        }
                        break;
                    case "threads":
                        objectReader.beginObject();
                        objectReader.nextName();
                        sentryEvent.threads = new io.sentry.SentryValues(objectReader.nextListOrNull(iLogger, new io.sentry.protocol.SentryThread.Deserializer()));
                        objectReader.endObject();
                        break;
                    case "logger":
                        sentryEvent.logger = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        java.util.Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        if (dateNextDateOrNull == null) {
                            break;
                        } else {
                            sentryEvent.timestamp = dateNextDateOrNull;
                            break;
                        }
                        break;
                    case "level":
                        sentryEvent.level = (io.sentry.SentryLevel) objectReader.nextOrNull(iLogger, new io.sentry.SentryLevel.Deserializer());
                        break;
                    case "message":
                        sentryEvent.message = (io.sentry.protocol.Message) objectReader.nextOrNull(iLogger, new io.sentry.protocol.Message.Deserializer());
                        break;
                    case "modules":
                        sentryEvent.modules = io.sentry.util.CollectionUtils.newConcurrentHashMap((java.util.Map) objectReader.nextObjectOrNull());
                        break;
                    case "exception":
                        objectReader.beginObject();
                        objectReader.nextName();
                        sentryEvent.exception = new io.sentry.SentryValues(objectReader.nextListOrNull(iLogger, new io.sentry.protocol.SentryException.Deserializer()));
                        objectReader.endObject();
                        break;
                    case "transaction":
                        sentryEvent.transaction = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (!deserializer.deserializeValue(sentryEvent, strNextName, objectReader, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                            }
                            objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            sentryEvent.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryEvent;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String EXCEPTION = "exception";
        public static final java.lang.String FINGERPRINT = "fingerprint";
        public static final java.lang.String LEVEL = "level";
        public static final java.lang.String LOGGER = "logger";
        public static final java.lang.String MESSAGE = "message";
        public static final java.lang.String MODULES = "modules";
        public static final java.lang.String THREADS = "threads";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TRANSACTION = "transaction";
    }

    public SentryEvent(io.sentry.protocol.SentryId sentryId, java.util.Date date) {
        super(sentryId);
        this.timestamp = date;
    }

    public java.util.List<io.sentry.protocol.SentryException> getExceptions() {
        io.sentry.SentryValues<io.sentry.protocol.SentryException> sentryValues = this.exception;
        if (sentryValues == null) {
            return null;
        }
        return sentryValues.getValues();
    }

    public java.util.List<java.lang.String> getFingerprints() {
        return this.fingerprint;
    }

    public io.sentry.SentryLevel getLevel() {
        return this.level;
    }

    public java.lang.String getLogger() {
        return this.logger;
    }

    public io.sentry.protocol.Message getMessage() {
        return this.message;
    }

    public java.lang.String getModule(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> map = this.modules;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public java.util.Map<java.lang.String, java.lang.String> getModules() {
        return this.modules;
    }

    public java.util.List<io.sentry.protocol.SentryThread> getThreads() {
        io.sentry.SentryValues<io.sentry.protocol.SentryThread> sentryValues = this.threads;
        if (sentryValues != null) {
            return sentryValues.getValues();
        }
        return null;
    }

    public java.util.Date getTimestamp() {
        return (java.util.Date) this.timestamp.clone();
    }

    public java.lang.String getTransaction() {
        return this.transaction;
    }

    public io.sentry.protocol.SentryException getUnhandledException() {
        io.sentry.SentryValues<io.sentry.protocol.SentryException> sentryValues = this.exception;
        if (sentryValues == null) {
            return null;
        }
        for (io.sentry.protocol.SentryException sentryException : sentryValues.getValues()) {
            if (sentryException.getMechanism() != null && sentryException.getMechanism().isHandled() != null && !sentryException.getMechanism().isHandled().booleanValue()) {
                return sentryException;
            }
        }
        return null;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public boolean isCrashed() {
        return getUnhandledException() != null;
    }

    public boolean isErrored() {
        io.sentry.SentryValues<io.sentry.protocol.SentryException> sentryValues = this.exception;
        return (sentryValues == null || sentryValues.getValues().isEmpty()) ? false : true;
    }

    public void removeModule(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> map = this.modules;
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, this.timestamp);
        if (this.message != null) {
            objectWriter.name("message").value(iLogger, this.message);
        }
        if (this.logger != null) {
            objectWriter.name(io.sentry.SentryEvent.JsonKeys.LOGGER).value(this.logger);
        }
        io.sentry.SentryValues<io.sentry.protocol.SentryThread> sentryValues = this.threads;
        if (sentryValues != null && !sentryValues.getValues().isEmpty()) {
            objectWriter.name(io.sentry.SentryEvent.JsonKeys.THREADS);
            objectWriter.beginObject();
            objectWriter.name("values").value(iLogger, this.threads.getValues());
            objectWriter.endObject();
        }
        io.sentry.SentryValues<io.sentry.protocol.SentryException> sentryValues2 = this.exception;
        if (sentryValues2 != null && !sentryValues2.getValues().isEmpty()) {
            objectWriter.name(io.sentry.SentryEvent.JsonKeys.EXCEPTION);
            objectWriter.beginObject();
            objectWriter.name("values").value(iLogger, this.exception.getValues());
            objectWriter.endObject();
        }
        if (this.level != null) {
            objectWriter.name("level").value(iLogger, this.level);
        }
        if (this.transaction != null) {
            objectWriter.name("transaction").value(this.transaction);
        }
        if (this.fingerprint != null) {
            objectWriter.name(io.sentry.SentryEvent.JsonKeys.FINGERPRINT).value(iLogger, this.fingerprint);
        }
        if (this.modules != null) {
            objectWriter.name(io.sentry.SentryEvent.JsonKeys.MODULES).value(iLogger, this.modules);
        }
        new io.sentry.SentryBaseEvent.Serializer().serialize(this, objectWriter, iLogger);
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setExceptions(java.util.List<io.sentry.protocol.SentryException> list) {
        this.exception = new io.sentry.SentryValues<>(list);
    }

    public void setFingerprints(java.util.List<java.lang.String> list) {
        this.fingerprint = list != null ? new java.util.ArrayList(list) : null;
    }

    public void setLevel(io.sentry.SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public void setLogger(java.lang.String str) {
        this.logger = str;
    }

    public void setMessage(io.sentry.protocol.Message message) {
        this.message = message;
    }

    public void setModule(java.lang.String str, java.lang.String str2) {
        if (this.modules == null) {
            this.modules = new java.util.HashMap();
        }
        this.modules.put(str, str2);
    }

    public void setModules(java.util.Map<java.lang.String, java.lang.String> map) {
        this.modules = io.sentry.util.CollectionUtils.newHashMap(map);
    }

    public void setThreads(java.util.List<io.sentry.protocol.SentryThread> list) {
        this.threads = new io.sentry.SentryValues<>(list);
    }

    public void setTimestamp(java.util.Date date) {
        this.timestamp = date;
    }

    public void setTransaction(java.lang.String str) {
        this.transaction = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public SentryEvent(java.lang.Throwable th) {
        this();
        this.throwable = th;
    }

    public SentryEvent() {
        this(new io.sentry.protocol.SentryId(), io.sentry.DateUtils.getCurrentDateTime());
    }

    public SentryEvent(java.util.Date date) {
        this(new io.sentry.protocol.SentryId(), date);
    }
}
