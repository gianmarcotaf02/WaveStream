package io.sentry;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.protocol.User;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.StringUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class Session implements JsonUnknown, JsonSerializable {
    private String abnormalMechanism;
    private final String distinctId;
    private Double duration;
    private final String environment;
    private final AtomicInteger errorCount;
    private Boolean init;
    private final String ipAddress;
    private final String release;
    private Long sequence;
    private final String sessionId;
    private final AutoClosableReentrantLock sessionLock;
    private final Date started;
    private State status;
    private Date timestamp;
    private Map<String, Object> unknown;
    private String userAgent;

    public static final class Deserializer implements JsonDeserializer<Session> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String strH = Y6.f.h("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(strH);
            iLogger.log(SentryLevel.ERROR, strH, illegalStateException);
            return illegalStateException;
        }

        @Override
        public Session deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            objectReader.beginObject();
            Integer numNextIntegerOrNull = null;
            ConcurrentHashMap concurrentHashMap = null;
            State stateValueOf = null;
            Date dateNextDateOrNull = null;
            Date dateNextDateOrNull2 = null;
            String strNextStringOrNull = null;
            String str = null;
            Boolean boolNextBooleanOrNull = null;
            Long lNextLongOrNull = null;
            Double dNextDoubleOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            String strNextStringOrNull4 = null;
            String strNextStringOrNull5 = null;
            String strNextStringOrNull6 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
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
                        String strCapitalize = StringUtils.capitalize(objectReader.nextStringOrNull());
                        if (strCapitalize == null) {
                            break;
                        } else {
                            stateValueOf = State.valueOf(strCapitalize);
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
                        String strNextStringOrNull7 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull7 != null && (strNextStringOrNull7.length() == 36 || strNextStringOrNull7.length() == 32)) {
                            str = strNextStringOrNull7;
                            break;
                        } else {
                            iLogger.log(SentryLevel.ERROR, "%s sid is not valid.", strNextStringOrNull7);
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
                        while (objectReader.peek() == JsonToken.NAME) {
                            String strNextName2 = objectReader.nextName();
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
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            if (stateValueOf == null) {
                throw missingRequiredFieldException("status", iLogger);
            }
            if (dateNextDateOrNull == null) {
                throw missingRequiredFieldException(JsonKeys.STARTED, iLogger);
            }
            if (numNextIntegerOrNull == null) {
                throw missingRequiredFieldException(JsonKeys.ERRORS, iLogger);
            }
            if (strNextStringOrNull5 == null) {
                throw missingRequiredFieldException("release", iLogger);
            }
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            Session session = new Session(stateValueOf, dateNextDateOrNull, dateNextDateOrNull2, numNextIntegerOrNull.intValue(), strNextStringOrNull, str, boolNextBooleanOrNull, lNextLongOrNull, dNextDoubleOrNull, strNextStringOrNull2, strNextStringOrNull3, strNextStringOrNull4, strNextStringOrNull5, strNextStringOrNull6);
            session.setUnknown(concurrentHashMap2);
            objectReader.endObject();
            return session;
        }
    }

    public static final class JsonKeys {
        public static final String ABNORMAL_MECHANISM = "abnormal_mechanism";
        public static final String ATTRS = "attrs";
        public static final String DID = "did";
        public static final String DURATION = "duration";
        public static final String ENVIRONMENT = "environment";
        public static final String ERRORS = "errors";
        public static final String INIT = "init";
        public static final String IP_ADDRESS = "ip_address";
        public static final String RELEASE = "release";
        public static final String SEQ = "seq";
        public static final String SID = "sid";
        public static final String STARTED = "started";
        public static final String STATUS = "status";
        public static final String TIMESTAMP = "timestamp";
        public static final String USER_AGENT = "user_agent";
    }

    public enum State {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public Session(State state, Date date, Date date2, int i3, String str, String str2, Boolean bool, Long l2, Double d4, String str3, String str4, String str5, String str6, String str7) {
        this.sessionLock = new AutoClosableReentrantLock();
        this.status = state;
        this.started = date;
        this.timestamp = date2;
        this.errorCount = new AtomicInteger(i3);
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

    private double calculateDurationTime(Date date) {
        return Math.abs(date.getTime() - this.started.getTime()) / 1000.0d;
    }

    private long getSequenceTimestamp(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    public void end() {
        end(DateUtils.getCurrentDateTime());
    }

    public int errorCount() {
        return this.errorCount.get();
    }

    public String getAbnormalMechanism() {
        return this.abnormalMechanism;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public Double getDuration() {
        return this.duration;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public Boolean getInit() {
        return this.init;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public String getRelease() {
        return this.release;
    }

    public Long getSequence() {
        return this.sequence;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public Date getStarted() {
        Date date = this.started;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public State getStatus() {
        return this.status;
    }

    public Date getTimestamp() {
        Date date = this.timestamp;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public boolean isTerminated() {
        return this.status != State.Ok;
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.sessionId != null) {
            objectWriter.name("sid").value(this.sessionId);
        }
        if (this.distinctId != null) {
            objectWriter.name(JsonKeys.DID).value(this.distinctId);
        }
        if (this.init != null) {
            objectWriter.name(JsonKeys.INIT).value(this.init);
        }
        objectWriter.name(JsonKeys.STARTED).value(iLogger, this.started);
        objectWriter.name("status").value(iLogger, this.status.name().toLowerCase(Locale.ROOT));
        if (this.sequence != null) {
            objectWriter.name(JsonKeys.SEQ).value(this.sequence);
        }
        objectWriter.name(JsonKeys.ERRORS).value(this.errorCount.intValue());
        if (this.duration != null) {
            objectWriter.name("duration").value(this.duration);
        }
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, this.timestamp);
        }
        if (this.abnormalMechanism != null) {
            objectWriter.name(JsonKeys.ABNORMAL_MECHANISM).value(iLogger, this.abnormalMechanism);
        }
        objectWriter.name(JsonKeys.ATTRS);
        objectWriter.beginObject();
        objectWriter.name("release").value(iLogger, this.release);
        if (this.environment != null) {
            objectWriter.name("environment").value(iLogger, this.environment);
        }
        if (this.ipAddress != null) {
            objectWriter.name("ip_address").value(iLogger, this.ipAddress);
        }
        if (this.userAgent != null) {
            objectWriter.name(JsonKeys.USER_AGENT).value(iLogger, this.userAgent);
        }
        objectWriter.endObject();
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                M0.x(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setInitAsTrue() {
        this.init = Boolean.TRUE;
    }

    @Override
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public boolean update(State state, String str, boolean z6) {
        return update(state, str, z6, null);
    }

    public Session m510clone() {
        return new Session(this.status, this.started, this.timestamp, this.errorCount.get(), this.distinctId, this.sessionId, this.init, this.sequence, this.duration, this.ipAddress, this.userAgent, this.environment, this.release, this.abnormalMechanism);
    }

    public void end(Date date) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        try {
            this.init = null;
            if (this.status == State.Ok) {
                this.status = State.Exited;
            }
            if (date != null) {
                this.timestamp = date;
            } else {
                this.timestamp = DateUtils.getCurrentDateTime();
            }
            Date date2 = this.timestamp;
            if (date2 != null) {
                this.duration = Double.valueOf(calculateDurationTime(date2));
                this.sequence = Long.valueOf(getSequenceTimestamp(this.timestamp));
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean update(State state, String str, boolean z6, String str2) {
        boolean z9;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        boolean z10 = true;
        if (state != null) {
            try {
                this.status = state;
                z9 = true;
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th2) {
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
            Date currentDateTime = DateUtils.getCurrentDateTime();
            this.timestamp = currentDateTime;
            if (currentDateTime != null) {
                this.sequence = Long.valueOf(getSequenceTimestamp(currentDateTime));
            }
        }
        if (iSentryLifecycleTokenAcquire != null) {
            iSentryLifecycleTokenAcquire.close();
        }
        return z10;
    }

    public Session(String str, User user, String str2, String str3) {
        this(State.Ok, DateUtils.getCurrentDateTime(), DateUtils.getCurrentDateTime(), 0, str, SentryUUID.generateSentryId(), Boolean.TRUE, null, null, user != null ? user.getIpAddress() : null, null, str2, str3, null);
    }
}
