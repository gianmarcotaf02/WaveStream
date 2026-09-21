package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.SampleRateUtils;
import io.sentry.util.StringUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public final class Baggage {
    static final String CHARSET = "UTF-8";
    static final String SENTRY_BAGGAGE_PREFIX = "sentry-";
    final Map<String, String> keyValues;
    final ILogger logger;
    private boolean mutable;
    private boolean shouldFreeze;
    final String thirdPartyHeader;
    static final Integer MAX_BAGGAGE_STRING_LENGTH = 8192;
    static final Integer MAX_BAGGAGE_LIST_MEMBER_COUNT = 64;

    public static final class DSCKeys {
        public static final String TRACE_ID = "sentry-trace_id";
        public static final String PUBLIC_KEY = "sentry-public_key";
        public static final String RELEASE = "sentry-release";
        public static final String USER_ID = "sentry-user_id";
        public static final String ENVIRONMENT = "sentry-environment";
        public static final String TRANSACTION = "sentry-transaction";
        public static final String SAMPLE_RATE = "sentry-sample_rate";
        public static final String SAMPLE_RAND = "sentry-sample_rand";
        public static final String SAMPLED = "sentry-sampled";
        public static final String REPLAY_ID = "sentry-replay_id";
        public static final List<String> ALL = Arrays.asList(TRACE_ID, PUBLIC_KEY, RELEASE, USER_ID, ENVIRONMENT, TRANSACTION, SAMPLE_RATE, SAMPLE_RAND, SAMPLED, REPLAY_ID);
    }

    public Baggage(ILogger iLogger) {
        this(new HashMap(), null, true, false, iLogger);
    }

    private static String decode(String str) {
        return URLDecoder.decode(str, CHARSET);
    }

    private String encode(String str) {
        return URLEncoder.encode(str, CHARSET).replaceAll("\\+", "%20");
    }

    public static Baggage fromEvent(SentryEvent sentryEvent, SentryOptions sentryOptions) {
        Baggage baggage = new Baggage(sentryOptions.getLogger());
        SpanContext trace = sentryEvent.getContexts().getTrace();
        baggage.setTraceId(trace != null ? trace.getTraceId().toString() : null);
        baggage.setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        baggage.setRelease(sentryEvent.getRelease());
        baggage.setEnvironment(sentryEvent.getEnvironment());
        baggage.setTransaction(sentryEvent.getTransaction());
        baggage.setSampleRate(null);
        baggage.setSampled(null);
        baggage.setSampleRand(null);
        Object obj = sentryEvent.getContexts().get("replay_id");
        if (obj != null && !obj.toString().equals(SentryId.EMPTY_ID.toString())) {
            baggage.setReplayId(obj.toString());
            sentryEvent.getContexts().remove("replay_id");
        }
        baggage.freeze();
        return baggage;
    }

    public static Baggage fromHeader(String str) {
        return fromHeader(str, false, ScopesAdapter.getInstance().getOptions().getLogger());
    }

    private static boolean isHighQualityTransactionName(TransactionNameSource transactionNameSource) {
        return (transactionNameSource == null || TransactionNameSource.URL.equals(transactionNameSource)) ? false : true;
    }

    private static Double sampleRand(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRand();
    }

    private static Double sampleRate(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRate();
    }

    private static String sampleRateToString(Double d4) {
        if (SampleRateUtils.isValidTracesSampleRate(d4, false)) {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT)).format(d4);
        }
        return null;
    }

    private static Boolean sampled(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampled();
    }

    private Double toDouble(String str) {
        if (str != null) {
            try {
                double d4 = Double.parseDouble(str);
                if (SampleRateUtils.isValidTracesSampleRate(Double.valueOf(d4), false)) {
                    return Double.valueOf(d4);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public void forceSetSampleRate(String str) {
        set(DSCKeys.SAMPLE_RATE, str, true);
    }

    public void freeze() {
        this.mutable = false;
    }

    public String get(String str) {
        if (str == null) {
            return null;
        }
        return this.keyValues.get(str);
    }

    public String getEnvironment() {
        return get(DSCKeys.ENVIRONMENT);
    }

    public String getPublicKey() {
        return get(DSCKeys.PUBLIC_KEY);
    }

    public String getRelease() {
        return get(DSCKeys.RELEASE);
    }

    public String getReplayId() {
        return get(DSCKeys.REPLAY_ID);
    }

    public String getSampleRand() {
        return get(DSCKeys.SAMPLE_RAND);
    }

    public Double getSampleRandDouble() {
        return toDouble(getSampleRand());
    }

    public String getSampleRate() {
        return get(DSCKeys.SAMPLE_RATE);
    }

    public Double getSampleRateDouble() {
        return toDouble(getSampleRate());
    }

    public String getSampled() {
        return get(DSCKeys.SAMPLED);
    }

    public String getThirdPartyHeader() {
        return this.thirdPartyHeader;
    }

    public String getTraceId() {
        return get(DSCKeys.TRACE_ID);
    }

    public String getTransaction() {
        return get(DSCKeys.TRANSACTION);
    }

    public Map<String, Object> getUnknown() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : this.keyValues.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!DSCKeys.ALL.contains(key) && value != null) {
                concurrentHashMap.put(key.replaceFirst(SENTRY_BAGGAGE_PREFIX, ""), value);
            }
        }
        return concurrentHashMap;
    }

    public String getUserId() {
        return get(DSCKeys.USER_ID);
    }

    public boolean isMutable() {
        return this.mutable;
    }

    public boolean isShouldFreeze() {
        return this.shouldFreeze;
    }

    public void set(String str, String str2) {
        set(str, str2, false);
    }

    public void setEnvironment(String str) {
        set(DSCKeys.ENVIRONMENT, str);
    }

    public void setPublicKey(String str) {
        set(DSCKeys.PUBLIC_KEY, str);
    }

    public void setRelease(String str) {
        set(DSCKeys.RELEASE, str);
    }

    public void setReplayId(String str) {
        set(DSCKeys.REPLAY_ID, str);
    }

    public void setSampleRand(String str) {
        set(DSCKeys.SAMPLE_RAND, str);
    }

    public void setSampleRandDouble(Double d4) {
        setSampleRand(sampleRateToString(d4));
    }

    public void setSampleRate(String str) {
        set(DSCKeys.SAMPLE_RATE, str);
    }

    public void setSampled(String str) {
        set(DSCKeys.SAMPLED, str);
    }

    public void setTraceId(String str) {
        set(DSCKeys.TRACE_ID, str);
    }

    public void setTransaction(String str) {
        set(DSCKeys.TRANSACTION, str);
    }

    public void setUserId(String str) {
        set(DSCKeys.USER_ID, str);
    }

    public void setValuesFromSamplingDecision(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return;
        }
        setSampled(StringUtils.toString(sampled(tracesSamplingDecision)));
        if (tracesSamplingDecision.getSampleRand() != null) {
            setSampleRand(sampleRateToString(sampleRand(tracesSamplingDecision)));
        }
        if (tracesSamplingDecision.getSampleRate() != null) {
            forceSetSampleRate(sampleRateToString(sampleRate(tracesSamplingDecision)));
        }
    }

    public void setValuesFromScope(IScope iScope, SentryOptions sentryOptions) {
        PropagationContext propagationContext = iScope.getPropagationContext();
        SentryId replayId = iScope.getReplayId();
        setTraceId(propagationContext.getTraceId().toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!SentryId.EMPTY_ID.equals(replayId)) {
            setReplayId(replayId.toString());
        }
        setTransaction(null);
        setSampleRate(null);
        setSampled(null);
    }

    public void setValuesFromTransaction(SentryId sentryId, SentryId sentryId2, SentryOptions sentryOptions, TracesSamplingDecision tracesSamplingDecision, String str, TransactionNameSource transactionNameSource) {
        setTraceId(sentryId.toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!isHighQualityTransactionName(transactionNameSource)) {
            str = null;
        }
        setTransaction(str);
        if (sentryId2 != null && !SentryId.EMPTY_ID.equals(sentryId2)) {
            setReplayId(sentryId2.toString());
        }
        setSampleRate(sampleRateToString(sampleRate(tracesSamplingDecision)));
        setSampled(StringUtils.toString(sampled(tracesSamplingDecision)));
        setSampleRand(sampleRateToString(sampleRand(tracesSamplingDecision)));
    }

    public String toHeaderString(String str) {
        String str2;
        int iCountOf;
        StringBuilder sb = new StringBuilder();
        if (str == null || str.isEmpty()) {
            str2 = "";
            iCountOf = 0;
        } else {
            sb.append(str);
            iCountOf = StringUtils.countOf(str, ',') + 1;
            str2 = ",";
        }
        for (String str3 : new TreeSet(this.keyValues.keySet())) {
            String str4 = this.keyValues.get(str3);
            if (str4 != null) {
                Integer num = MAX_BAGGAGE_LIST_MEMBER_COUNT;
                if (iCountOf >= num.intValue()) {
                    this.logger.log(SentryLevel.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str3, num);
                } else {
                    try {
                        String str5 = str2 + encode(str3) + "=" + encode(str4);
                        int length = sb.length() + str5.length();
                        Integer num2 = MAX_BAGGAGE_STRING_LENGTH;
                        if (length > num2.intValue()) {
                            this.logger.log(SentryLevel.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str3, num2);
                        } else {
                            iCountOf++;
                            sb.append(str5);
                            str2 = ",";
                        }
                    } catch (Throwable th) {
                        this.logger.log(SentryLevel.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str3, str4);
                    }
                }
            }
        }
        return sb.toString();
    }

    public TraceContext toTraceContext() {
        String traceId = getTraceId();
        String replayId = getReplayId();
        String publicKey = getPublicKey();
        if (traceId == null || publicKey == null) {
            return null;
        }
        SentryId sentryId = new SentryId(traceId);
        SentryId sentryId2 = null;
        String release = getRelease();
        String environment = getEnvironment();
        String userId = getUserId();
        String transaction = getTransaction();
        String sampleRate = getSampleRate();
        String sampled = getSampled();
        if (replayId != null) {
            sentryId2 = new SentryId(replayId);
        }
        TraceContext traceContext = new TraceContext(sentryId, publicKey, release, environment, userId, transaction, sampleRate, sampled, sentryId2, getSampleRand());
        traceContext.setUnknown(getUnknown());
        return traceContext;
    }

    public Baggage(Baggage baggage) {
        this(baggage.keyValues, baggage.thirdPartyHeader, baggage.mutable, baggage.shouldFreeze, baggage.logger);
    }

    private void set(String str, String str2, boolean z6) {
        if (this.mutable || z6) {
            this.keyValues.put(str, str2);
        }
    }

    public Baggage(Map<String, String> map, String str, boolean z6, boolean z9, ILogger iLogger) {
        this.keyValues = map;
        this.logger = iLogger;
        this.thirdPartyHeader = str;
        this.mutable = z6;
        this.shouldFreeze = z9;
    }

    public static Baggage fromHeader(List<String> list) {
        return fromHeader(list, false, ScopesAdapter.getInstance().getOptions().getLogger());
    }

    public static Baggage fromHeader(String str, ILogger iLogger) {
        return fromHeader(str, false, iLogger);
    }

    public static Baggage fromHeader(List<String> list, ILogger iLogger) {
        return fromHeader(list, false, iLogger);
    }

    public static Baggage fromHeader(List<String> list, boolean z6, ILogger iLogger) {
        if (list != null) {
            return fromHeader(StringUtils.join(",", list), z6, iLogger);
        }
        return fromHeader((String) null, z6, iLogger);
    }

    public static Baggage fromHeader(String str, boolean z6, ILogger iLogger) {
        String strJoin;
        Throwable th;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        boolean z9 = false;
        if (str != null) {
            try {
                boolean z10 = false;
                for (String str2 : str.split(",", -1)) {
                    try {
                        if (str2.trim().startsWith(SENTRY_BAGGAGE_PREFIX)) {
                            try {
                                int iIndexOf = str2.indexOf("=");
                                String strTrim = str2.substring(0, iIndexOf).trim();
                                map.put(decode(strTrim), decode(str2.substring(iIndexOf + 1).trim()));
                                if (!DSCKeys.SAMPLE_RAND.equalsIgnoreCase(strTrim)) {
                                    z10 = true;
                                }
                            } catch (Throwable th2) {
                                iLogger.log(SentryLevel.ERROR, th2, "Unable to decode baggage key value pair %s", str2);
                            }
                        } else if (z6) {
                            arrayList.add(str2.trim());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z9 = z10;
                        iLogger.log(SentryLevel.ERROR, th, "Unable to decode baggage header %s", str);
                        if (arrayList.isEmpty()) {
                            strJoin = null;
                        } else {
                            strJoin = StringUtils.join(",", arrayList);
                        }
                        return new Baggage(map, strJoin, true, z9, iLogger);
                    }
                }
                z9 = z10;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (arrayList.isEmpty()) {
            strJoin = null;
        } else {
            strJoin = StringUtils.join(",", arrayList);
        }
        return new Baggage(map, strJoin, true, z9, iLogger);
    }
}
