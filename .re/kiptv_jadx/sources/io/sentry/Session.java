package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class Session implements io.sentry.JsonUnknown, io.sentry.JsonSerializable {
    private java.lang.String abnormalMechanism;
    private final java.lang.String distinctId;
    private java.lang.Double duration;
    private final java.lang.String environment;
    private final java.util.concurrent.atomic.AtomicInteger errorCount;
    private java.lang.Boolean init;
    private final java.lang.String ipAddress;
    private final java.lang.String release;
    private java.lang.Long sequence;
    private final java.lang.String sessionId;
    private final io.sentry.util.AutoClosableReentrantLock sessionLock;
    private final java.util.Date started;
    private io.sentry.Session.State status;
    private java.util.Date timestamp;
    private java.util.Map<java.lang.String, java.lang.Object> unknown;
    private java.lang.String userAgent;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.Session> {
        private java.lang.Exception missingRequiredFieldException(java.lang.String str, io.sentry.ILogger iLogger) {
            java.lang.String strH = Y6.f.h("Missing required field \"", str, "\"");
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(strH);
            iLogger.log(io.sentry.SentryLevel.ERROR, strH, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.Session deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) throws java.lang.Exception {
            objectReader.beginObject();
            java.lang.Integer numNextIntegerOrNull = null;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = null;
            io.sentry.Session.State stateValueOf = null;
            java.util.Date dateNextDateOrNull = null;
            java.util.Date dateNextDateOrNull2 = null;
            java.lang.String strNextStringOrNull = null;
            java.lang.String str = null;
            java.lang.Boolean boolNextBooleanOrNull = null;
            java.lang.Long lNextLongOrNull = null;
            java.lang.Double dNextDoubleOrNull = null;
            java.lang.String strNextStringOrNull2 = null;
            java.lang.String strNextStringOrNull3 = null;
            java.lang.String strNextStringOrNull4 = null;
            java.lang.String strNextStringOrNull5 = null;
            java.lang.String strNextStringOrNull6 = null;
            while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                java.lang.String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "duration":
                        dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        break;
                    case "started":
                        dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        break;
                    case "errors":
                        numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        break;
                    case "status":
                        java.lang.String strCapitalize = io.sentry.util.StringUtils.capitalize(objectReader.nextStringOrNull());
                        if (strCapitalize == null) {
                            break;
                        } else {
                            stateValueOf = io.sentry.Session.State.valueOf(strCapitalize);
                            break;
                        }
                        break;
                    case "did":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "seq":
                        lNextLongOrNull = objectReader.nextLongOrNull();
                        break;
                    case "sid":
                        java.lang.String strNextStringOrNull7 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull7 != null && (strNextStringOrNull7.length() == 36 || strNextStringOrNull7.length() == 32)) {
                            str = strNextStringOrNull7;
                            break;
                        } else {
                            iLogger.log(io.sentry.SentryLevel.ERROR, "%s sid is not valid.", strNextStringOrNull7);
                            break;
                        }
                        break;
                    case "init":
                        boolNextBooleanOrNull = objectReader.nextBooleanOrNull();
                        break;
                    case "timestamp":
                        dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                        break;
                    case "attrs":
                        objectReader.beginObject();
                        while (objectReader.peek() == io.sentry.vendor.gson.stream.JsonToken.NAME) {
                            java.lang.String strNextName2 = objectReader.nextName();
                            strNextName2.getClass();
                            switch (strNextName2) {
                                case "environment":
                                    strNextStringOrNull4 = objectReader.nextStringOrNull();
                                    break;
                                case "release":
                                    strNextStringOrNull5 = objectReader.nextStringOrNull();
                                    break;
                                case "ip_address":
                                    strNextStringOrNull2 = objectReader.nextStringOrNull();
                                    break;
                                case "user_agent":
                                    strNextStringOrNull3 = objectReader.nextStringOrNull();
                                    break;
                                default:
                                    objectReader.skipValue();
                                    break;
                            }
                        }
                        objectReader.endObject();
                        break;
                    case "abnormal_mechanism":
                        strNextStringOrNull6 = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            if (stateValueOf == null) {
                throw missingRequiredFieldException("status", iLogger);
            }
            if (dateNextDateOrNull == null) {
                throw missingRequiredFieldException(io.sentry.Session.JsonKeys.STARTED, iLogger);
            }
            if (numNextIntegerOrNull == null) {
                throw missingRequiredFieldException(io.sentry.Session.JsonKeys.ERRORS, iLogger);
            }
            if (strNextStringOrNull5 == null) {
                throw missingRequiredFieldException("release", iLogger);
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            io.sentry.Session session = new io.sentry.Session(stateValueOf, dateNextDateOrNull, dateNextDateOrNull2, numNextIntegerOrNull.intValue(), strNextStringOrNull, str, boolNextBooleanOrNull, lNextLongOrNull, dNextDoubleOrNull, strNextStringOrNull2, strNextStringOrNull3, strNextStringOrNull4, strNextStringOrNull5, strNextStringOrNull6);
            session.setUnknown(concurrentHashMap2);
            objectReader.endObject();
            return session;
        }
    }

    public static final class JsonKeys {
        public static final java.lang.String ABNORMAL_MECHANISM = "abnormal_mechanism";
        public static final java.lang.String ATTRS = "attrs";
        public static final java.lang.String DID = "did";
        public static final java.lang.String DURATION = "duration";
        public static final java.lang.String ENVIRONMENT = "environment";
        public static final java.lang.String ERRORS = "errors";
        public static final java.lang.String INIT = "init";
        public static final java.lang.String IP_ADDRESS = "ip_address";
        public static final java.lang.String RELEASE = "release";
        public static final java.lang.String SEQ = "seq";
        public static final java.lang.String SID = "sid";
        public static final java.lang.String STARTED = "started";
        public static final java.lang.String STATUS = "status";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String USER_AGENT = "user_agent";
    }

    public enum State {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public Session(io.sentry.Session.State state, java.util.Date date, java.util.Date date2, int i3, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Long l2, java.lang.Double d4, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.sessionLock = new io.sentry.util.AutoClosableReentrantLock();
        this.status = state;
        this.started = date;
        this.timestamp = date2;
        this.errorCount = new java.util.concurrent.atomic.AtomicInteger(i3);
        this.distinctId = str;
        this.sessionId = str2;
        this.init = bool;
        this.sequence = l2;
        this.duration = d4;
        this.ipAddress = str3;
        this.userAgent = str4;
        this.environment = str5;
        this.release = str6;
        this.abnormalMechanism = str7;
    }

    private double calculateDurationTime(java.util.Date date) {
        return java.lang.Math.abs(date.getTime() - this.started.getTime()) / 1000.0d;
    }

    private long getSequenceTimestamp(java.util.Date date) {
        long time = date.getTime();
        return time < 0 ? java.lang.Math.abs(time) : time;
    }

    public void end() {
        end(io.sentry.DateUtils.getCurrentDateTime());
    }

    public int errorCount() {
        return this.errorCount.get();
    }

    public java.lang.String getAbnormalMechanism() {
        return this.abnormalMechanism;
    }

    public java.lang.String getDistinctId() {
        return this.distinctId;
    }

    public java.lang.Double getDuration() {
        return this.duration;
    }

    public java.lang.String getEnvironment() {
        return this.environment;
    }

    public java.lang.Boolean getInit() {
        return this.init;
    }

    public java.lang.String getIpAddress() {
        return this.ipAddress;
    }

    public java.lang.String getRelease() {
        return this.release;
    }

    public java.lang.Long getSequence() {
        return this.sequence;
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    public java.util.Date getStarted() {
        java.util.Date date = this.started;
        if (date == null) {
            return null;
        }
        return (java.util.Date) date.clone();
    }

    public io.sentry.Session.State getStatus() {
        return this.status;
    }

    public java.util.Date getTimestamp() {
        java.util.Date date = this.timestamp;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        return null;
    }

    @Override // io.sentry.JsonUnknown
    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        return this.unknown;
    }

    public java.lang.String getUserAgent() {
        return this.userAgent;
    }

    public boolean isTerminated() {
        return this.status != io.sentry.Session.State.Ok;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.beginObject();
        if (this.sessionId != null) {
            objectWriter.name("sid").value(this.sessionId);
        }
        if (this.distinctId != null) {
            objectWriter.name(io.sentry.Session.JsonKeys.DID).value(this.distinctId);
        }
        if (this.init != null) {
            objectWriter.name(io.sentry.Session.JsonKeys.INIT).value(this.init);
        }
        objectWriter.name(io.sentry.Session.JsonKeys.STARTED).value(iLogger, this.started);
        objectWriter.name("status").value(iLogger, this.status.name().toLowerCase(java.util.Locale.ROOT));
        if (this.sequence != null) {
            objectWriter.name(io.sentry.Session.JsonKeys.SEQ).value(this.sequence);
        }
        objectWriter.name(io.sentry.Session.JsonKeys.ERRORS).value(this.errorCount.intValue());
        if (this.duration != null) {
            objectWriter.name("duration").value(this.duration);
        }
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, this.timestamp);
        }
        if (this.abnormalMechanism != null) {
            objectWriter.name(io.sentry.Session.JsonKeys.ABNORMAL_MECHANISM).value(iLogger, this.abnormalMechanism);
        }
        objectWriter.name(io.sentry.Session.JsonKeys.ATTRS);
        objectWriter.beginObject();
        objectWriter.name("release").value(iLogger, this.release);
        if (this.environment != null) {
            objectWriter.name("environment").value(iLogger, this.environment);
        }
        if (this.ipAddress != null) {
            objectWriter.name("ip_address").value(iLogger, this.ipAddress);
        }
        if (this.userAgent != null) {
            objectWriter.name(io.sentry.Session.JsonKeys.USER_AGENT).value(iLogger, this.userAgent);
        }
        objectWriter.endObject();
        java.util.Map<java.lang.String, java.lang.Object> map = this.unknown;
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                com.google.android.gms.internal.play_billing.M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setInitAsTrue() {
        this.init = java.lang.Boolean.TRUE;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.unknown = map;
    }

    public boolean update(io.sentry.Session.State state, java.lang.String str, boolean z6) {
        return update(state, str, z6, null);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public io.sentry.Session m510clone() {
        return new io.sentry.Session(this.status, this.started, this.timestamp, this.errorCount.get(), this.distinctId, this.sessionId, this.init, this.sequence, this.duration, this.ipAddress, this.userAgent, this.environment, this.release, this.abnormalMechanism);
    }

    public void end(java.util.Date date) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        try {
            this.init = null;
            if (this.status == io.sentry.Session.State.Ok) {
                this.status = io.sentry.Session.State.Exited;
            }
            if (date != null) {
                this.timestamp = date;
            } else {
                this.timestamp = io.sentry.DateUtils.getCurrentDateTime();
            }
            java.util.Date date2 = this.timestamp;
            if (date2 != null) {
                this.duration = java.lang.Double.valueOf(calculateDurationTime(date2));
                this.sequence = java.lang.Long.valueOf(getSequenceTimestamp(this.timestamp));
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean update(io.sentry.Session.State state, java.lang.String str, boolean z6, java.lang.String str2) {
        boolean z9;
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        boolean z10 = true;
        if (state != null) {
            try {
                this.status = state;
                z9 = true;
            } catch (java.lang.Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            z9 = false;
        }
        if (str != null) {
            this.userAgent = str;
            z9 = true;
        }
        if (z6) {
            this.errorCount.addAndGet(1);
            z9 = true;
        }
        if (str2 != null) {
            this.abnormalMechanism = str2;
        } else {
            z10 = z9;
        }
        if (z10) {
            this.init = null;
            java.util.Date currentDateTime = io.sentry.DateUtils.getCurrentDateTime();
            this.timestamp = currentDateTime;
            if (currentDateTime != null) {
                this.sequence = java.lang.Long.valueOf(getSequenceTimestamp(currentDateTime));
            }
        }
        if (iSentryLifecycleTokenAcquire != null) {
            iSentryLifecycleTokenAcquire.close();
        }
        return z10;
    }

    public Session(java.lang.String str, io.sentry.protocol.User user, java.lang.String str2, java.lang.String str3) {
        this(io.sentry.Session.State.Ok, io.sentry.DateUtils.getCurrentDateTime(), io.sentry.DateUtils.getCurrentDateTime(), 0, str, io.sentry.SentryUUID.generateSentryId(), java.lang.Boolean.TRUE, null, null, user != null ? user.getIpAddress() : null, null, str2, str3, null);
    }
}
