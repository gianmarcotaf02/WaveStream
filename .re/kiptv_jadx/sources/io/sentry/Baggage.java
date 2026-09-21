package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class Baggage {
    static final java.lang.String CHARSET = "UTF-8";
    static final java.lang.String SENTRY_BAGGAGE_PREFIX = "sentry-";
    final java.util.Map<java.lang.String, java.lang.String> keyValues;
    final io.sentry.ILogger logger;
    private boolean mutable;
    private boolean shouldFreeze;
    final java.lang.String thirdPartyHeader;
    static final java.lang.Integer MAX_BAGGAGE_STRING_LENGTH = 8192;
    static final java.lang.Integer MAX_BAGGAGE_LIST_MEMBER_COUNT = 64;

    public static final class DSCKeys {
        public static final java.lang.String TRACE_ID = "sentry-trace_id";
        public static final java.lang.String PUBLIC_KEY = "sentry-public_key";
        public static final java.lang.String RELEASE = "sentry-release";
        public static final java.lang.String USER_ID = "sentry-user_id";
        public static final java.lang.String ENVIRONMENT = "sentry-environment";
        public static final java.lang.String TRANSACTION = "sentry-transaction";
        public static final java.lang.String SAMPLE_RATE = "sentry-sample_rate";
        public static final java.lang.String SAMPLE_RAND = "sentry-sample_rand";
        public static final java.lang.String SAMPLED = "sentry-sampled";
        public static final java.lang.String REPLAY_ID = "sentry-replay_id";
        public static final java.util.List<java.lang.String> ALL = java.util.Arrays.asList(TRACE_ID, PUBLIC_KEY, RELEASE, USER_ID, ENVIRONMENT, TRANSACTION, SAMPLE_RATE, SAMPLE_RAND, SAMPLED, REPLAY_ID);
    }

    public Baggage(io.sentry.ILogger iLogger) {
        this(new java.util.HashMap(), null, true, false, iLogger);
    }

    private static java.lang.String decode(java.lang.String str) {
        return java.net.URLDecoder.decode(str, CHARSET);
    }

    private java.lang.String encode(java.lang.String str) {
        return java.net.URLEncoder.encode(str, CHARSET).replaceAll("\\+", "%20");
    }

    public static io.sentry.Baggage fromEvent(io.sentry.SentryEvent sentryEvent, io.sentry.SentryOptions sentryOptions) {
        io.sentry.Baggage baggage = new io.sentry.Baggage(sentryOptions.getLogger());
        io.sentry.SpanContext trace = sentryEvent.getContexts().getTrace();
        baggage.setTraceId(trace != null ? trace.getTraceId().toString() : null);
        baggage.setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        baggage.setRelease(sentryEvent.getRelease());
        baggage.setEnvironment(sentryEvent.getEnvironment());
        baggage.setTransaction(sentryEvent.getTransaction());
        baggage.setSampleRate(null);
        baggage.setSampled(null);
        baggage.setSampleRand(null);
        java.lang.Object obj = sentryEvent.getContexts().get("replay_id");
        if (obj != null && !obj.toString().equals(io.sentry.protocol.SentryId.EMPTY_ID.toString())) {
            baggage.setReplayId(obj.toString());
            sentryEvent.getContexts().remove("replay_id");
        }
        baggage.freeze();
        return baggage;
    }

    public static io.sentry.Baggage fromHeader(java.lang.String str) {
        return fromHeader(str, false, io.sentry.ScopesAdapter.getInstance().getOptions().getLogger());
    }

    private static boolean isHighQualityTransactionName(io.sentry.protocol.TransactionNameSource transactionNameSource) {
        return (transactionNameSource == null || io.sentry.protocol.TransactionNameSource.URL.equals(transactionNameSource)) ? false : true;
    }

    private static java.lang.Double sampleRand(io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRand();
    }

    private static java.lang.Double sampleRate(io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRate();
    }

    private static java.lang.String sampleRateToString(java.lang.Double d4) {
        if (io.sentry.util.SampleRateUtils.isValidTracesSampleRate(d4, false)) {
            return new java.text.DecimalFormat("#.################", java.text.DecimalFormatSymbols.getInstance(java.util.Locale.ROOT)).format(d4);
        }
        return null;
    }

    private static java.lang.Boolean sampled(io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampled();
    }

    private java.lang.Double toDouble(java.lang.String str) {
        if (str != null) {
            try {
                double d4 = java.lang.Double.parseDouble(str);
                if (io.sentry.util.SampleRateUtils.isValidTracesSampleRate(java.lang.Double.valueOf(d4), false)) {
                    return java.lang.Double.valueOf(d4);
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }

    public void forceSetSampleRate(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.SAMPLE_RATE, str, true);
    }

    public void freeze() {
        this.mutable = false;
    }

    public java.lang.String get(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.keyValues.get(str);
    }

    public java.lang.String getEnvironment() {
        return get(io.sentry.Baggage.DSCKeys.ENVIRONMENT);
    }

    public java.lang.String getPublicKey() {
        return get(io.sentry.Baggage.DSCKeys.PUBLIC_KEY);
    }

    public java.lang.String getRelease() {
        return get(io.sentry.Baggage.DSCKeys.RELEASE);
    }

    public java.lang.String getReplayId() {
        return get(io.sentry.Baggage.DSCKeys.REPLAY_ID);
    }

    public java.lang.String getSampleRand() {
        return get(io.sentry.Baggage.DSCKeys.SAMPLE_RAND);
    }

    public java.lang.Double getSampleRandDouble() {
        return toDouble(getSampleRand());
    }

    public java.lang.String getSampleRate() {
        return get(io.sentry.Baggage.DSCKeys.SAMPLE_RATE);
    }

    public java.lang.Double getSampleRateDouble() {
        return toDouble(getSampleRate());
    }

    public java.lang.String getSampled() {
        return get(io.sentry.Baggage.DSCKeys.SAMPLED);
    }

    public java.lang.String getThirdPartyHeader() {
        return this.thirdPartyHeader;
    }

    public java.lang.String getTraceId() {
        return get(io.sentry.Baggage.DSCKeys.TRACE_ID);
    }

    public java.lang.String getTransaction() {
        return get(io.sentry.Baggage.DSCKeys.TRANSACTION);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getUnknown() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.keyValues.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (!io.sentry.Baggage.DSCKeys.ALL.contains(key) && value != null) {
                concurrentHashMap.put(key.replaceFirst(SENTRY_BAGGAGE_PREFIX, ""), value);
            }
        }
        return concurrentHashMap;
    }

    public java.lang.String getUserId() {
        return get(io.sentry.Baggage.DSCKeys.USER_ID);
    }

    public boolean isMutable() {
        return this.mutable;
    }

    public boolean isShouldFreeze() {
        return this.shouldFreeze;
    }

    public void set(java.lang.String str, java.lang.String str2) {
        set(str, str2, false);
    }

    public void setEnvironment(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.ENVIRONMENT, str);
    }

    public void setPublicKey(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.PUBLIC_KEY, str);
    }

    public void setRelease(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.RELEASE, str);
    }

    public void setReplayId(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.REPLAY_ID, str);
    }

    public void setSampleRand(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.SAMPLE_RAND, str);
    }

    public void setSampleRandDouble(java.lang.Double d4) {
        setSampleRand(sampleRateToString(d4));
    }

    public void setSampleRate(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.SAMPLE_RATE, str);
    }

    public void setSampled(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.SAMPLED, str);
    }

    public void setTraceId(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.TRACE_ID, str);
    }

    public void setTransaction(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.TRANSACTION, str);
    }

    public void setUserId(java.lang.String str) {
        set(io.sentry.Baggage.DSCKeys.USER_ID, str);
    }

    public void setValuesFromSamplingDecision(io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return;
        }
        setSampled(io.sentry.util.StringUtils.toString(sampled(tracesSamplingDecision)));
        if (tracesSamplingDecision.getSampleRand() != null) {
            setSampleRand(sampleRateToString(sampleRand(tracesSamplingDecision)));
        }
        if (tracesSamplingDecision.getSampleRate() != null) {
            forceSetSampleRate(sampleRateToString(sampleRate(tracesSamplingDecision)));
        }
    }

    public void setValuesFromScope(io.sentry.IScope iScope, io.sentry.SentryOptions sentryOptions) {
        io.sentry.PropagationContext propagationContext = iScope.getPropagationContext();
        io.sentry.protocol.SentryId replayId = iScope.getReplayId();
        setTraceId(propagationContext.getTraceId().toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!io.sentry.protocol.SentryId.EMPTY_ID.equals(replayId)) {
            setReplayId(replayId.toString());
        }
        setTransaction(null);
        setSampleRate(null);
        setSampled(null);
    }

    public void setValuesFromTransaction(io.sentry.protocol.SentryId sentryId, io.sentry.protocol.SentryId sentryId2, io.sentry.SentryOptions sentryOptions, io.sentry.TracesSamplingDecision tracesSamplingDecision, java.lang.String str, io.sentry.protocol.TransactionNameSource transactionNameSource) {
        setTraceId(sentryId.toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!isHighQualityTransactionName(transactionNameSource)) {
            str = null;
        }
        setTransaction(str);
        if (sentryId2 != null && !io.sentry.protocol.SentryId.EMPTY_ID.equals(sentryId2)) {
            setReplayId(sentryId2.toString());
        }
        setSampleRate(sampleRateToString(sampleRate(tracesSamplingDecision)));
        setSampled(io.sentry.util.StringUtils.toString(sampled(tracesSamplingDecision)));
        setSampleRand(sampleRateToString(sampleRand(tracesSamplingDecision)));
    }

    public java.lang.String toHeaderString(java.lang.String str) {
        java.lang.String str2;
        int iCountOf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str == null || str.isEmpty()) {
            str2 = "";
            iCountOf = 0;
        } else {
            sb.append(str);
            iCountOf = io.sentry.util.StringUtils.countOf(str, ',') + 1;
            str2 = ",";
        }
        for (java.lang.String str3 : new java.util.TreeSet(this.keyValues.keySet())) {
            java.lang.String str4 = this.keyValues.get(str3);
            if (str4 != null) {
                java.lang.Integer num = MAX_BAGGAGE_LIST_MEMBER_COUNT;
                if (iCountOf >= num.intValue()) {
                    this.logger.log(io.sentry.SentryLevel.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str3, num);
                } else {
                    try {
                        java.lang.String str5 = str2 + encode(str3) + "=" + encode(str4);
                        int length = sb.length() + str5.length();
                        java.lang.Integer num2 = MAX_BAGGAGE_STRING_LENGTH;
                        if (length > num2.intValue()) {
                            this.logger.log(io.sentry.SentryLevel.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str3, num2);
                        } else {
                            iCountOf++;
                            sb.append(str5);
                            str2 = ",";
                        }
                    } catch (java.lang.Throwable th) {
                        this.logger.log(io.sentry.SentryLevel.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str3, str4);
                    }
                }
            }
        }
        return sb.toString();
    }

    public io.sentry.TraceContext toTraceContext() {
        java.lang.String traceId = getTraceId();
        java.lang.String replayId = getReplayId();
        java.lang.String publicKey = getPublicKey();
        if (traceId == null || publicKey == null) {
            return null;
        }
        io.sentry.protocol.SentryId sentryId = new io.sentry.protocol.SentryId(traceId);
        io.sentry.protocol.SentryId sentryId2 = null;
        java.lang.String release = getRelease();
        java.lang.String environment = getEnvironment();
        java.lang.String userId = getUserId();
        java.lang.String transaction = getTransaction();
        java.lang.String sampleRate = getSampleRate();
        java.lang.String sampled = getSampled();
        if (replayId != null) {
            sentryId2 = new io.sentry.protocol.SentryId(replayId);
        }
        io.sentry.TraceContext traceContext = new io.sentry.TraceContext(sentryId, publicKey, release, environment, userId, transaction, sampleRate, sampled, sentryId2, getSampleRand());
        traceContext.setUnknown(getUnknown());
        return traceContext;
    }

    public Baggage(io.sentry.Baggage baggage) {
        this(baggage.keyValues, baggage.thirdPartyHeader, baggage.mutable, baggage.shouldFreeze, baggage.logger);
    }

    private void set(java.lang.String str, java.lang.String str2, boolean z6) {
        if (this.mutable || z6) {
            this.keyValues.put(str, str2);
        }
    }

    public Baggage(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, boolean z6, boolean z9, io.sentry.ILogger iLogger) {
        this.keyValues = map;
        this.logger = iLogger;
        this.thirdPartyHeader = str;
        this.mutable = z6;
        this.shouldFreeze = z9;
    }

    public static io.sentry.Baggage fromHeader(java.util.List<java.lang.String> list) {
        return fromHeader(list, false, io.sentry.ScopesAdapter.getInstance().getOptions().getLogger());
    }

    public static io.sentry.Baggage fromHeader(java.lang.String str, io.sentry.ILogger iLogger) {
        return fromHeader(str, false, iLogger);
    }

    public static io.sentry.Baggage fromHeader(java.util.List<java.lang.String> list, io.sentry.ILogger iLogger) {
        return fromHeader(list, false, iLogger);
    }

    public static io.sentry.Baggage fromHeader(java.util.List<java.lang.String> list, boolean z6, io.sentry.ILogger iLogger) {
        if (list != null) {
            return fromHeader(io.sentry.util.StringUtils.join(",", list), z6, iLogger);
        }
        return fromHeader((java.lang.String) null, z6, iLogger);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    public static io.sentry.Baggage fromHeader(java.lang.String str, boolean z6, io.sentry.ILogger iLogger) {
        java.lang.String strJoin;
        java.lang.Throwable th;
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z9 = false;
        if (str != null) {
            try {
                boolean z10 = false;
                for (java.lang.String str2 : str.split(",", -1)) {
                    try {
                        if (str2.trim().startsWith(SENTRY_BAGGAGE_PREFIX)) {
                            try {
                                int iIndexOf = str2.indexOf("=");
                                java.lang.String strTrim = str2.substring(0, iIndexOf).trim();
                                map.put(decode(strTrim), decode(str2.substring(iIndexOf + 1).trim()));
                                if (!io.sentry.Baggage.DSCKeys.SAMPLE_RAND.equalsIgnoreCase(strTrim)) {
                                    z10 = true;
                                }
                            } catch (java.lang.Throwable th2) {
                                iLogger.log(io.sentry.SentryLevel.ERROR, th2, "Unable to decode baggage key value pair %s", str2);
                            }
                        } else if (z6) {
                            arrayList.add(str2.trim());
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        z9 = z10;
                        iLogger.log(io.sentry.SentryLevel.ERROR, th, "Unable to decode baggage header %s", str);
                        if (arrayList.isEmpty()) {
                            strJoin = null;
                        } else {
                            strJoin = io.sentry.util.StringUtils.join(",", arrayList);
                        }
                        return new io.sentry.Baggage(map, strJoin, true, z9, iLogger);
                    }
                }
                z9 = z10;
            } catch (java.lang.Throwable th4) {
                th = th4;
            }
        }
        if (arrayList.isEmpty()) {
            strJoin = null;
        } else {
            strJoin = io.sentry.util.StringUtils.join(",", arrayList);
        }
        return new io.sentry.Baggage(map, strJoin, true, z9, iLogger);
    }
}
