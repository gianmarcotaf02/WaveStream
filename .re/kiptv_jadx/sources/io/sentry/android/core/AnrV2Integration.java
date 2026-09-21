package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public class AnrV2Integration implements io.sentry.Integration, java.io.Closeable, java.lang.AutoCloseable {
    static final long NINETY_DAYS_THRESHOLD = java.util.concurrent.TimeUnit.DAYS.toMillis(91);
    private final android.content.Context context;
    private final io.sentry.transport.ICurrentDateProvider dateProvider;
    private io.sentry.android.core.SentryAndroidOptions options;

    public static class AnrProcessor implements java.lang.Runnable {
        private final android.content.Context context;
        private final io.sentry.android.core.SentryAndroidOptions options;
        private final io.sentry.IScopes scopes;
        private final long threshold;

        public AnrProcessor(android.content.Context context, io.sentry.IScopes iScopes, io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.ICurrentDateProvider iCurrentDateProvider) {
            this.context = context;
            this.scopes = iScopes;
            this.options = sentryAndroidOptions;
            this.threshold = iCurrentDateProvider.getCurrentTimeMillis() - io.sentry.android.core.AnrV2Integration.NINETY_DAYS_THRESHOLD;
        }

        private byte[] getDumpBytes(java.io.InputStream inputStream) throws java.io.IOException {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i3 = inputStream.read(bArr, 0, 1024);
                    if (i3 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        private io.sentry.android.core.AnrV2Integration.ParseResult parseThreadDump(android.app.ApplicationExitInfo applicationExitInfo, boolean z6) {
            try {
                java.io.InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        io.sentry.android.core.AnrV2Integration.ParseResult parseResult = new io.sentry.android.core.AnrV2Integration.ParseResult(io.sentry.android.core.AnrV2Integration.ParseResult.Type.NO_DUMP);
                        if (traceInputStream == null) {
                            return parseResult;
                        }
                        traceInputStream.close();
                        return parseResult;
                    }
                    byte[] dumpBytes = getDumpBytes(traceInputStream);
                    traceInputStream.close();
                    try {
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(dumpBytes)));
                        try {
                            java.util.List<io.sentry.protocol.SentryThread> list = new io.sentry.android.core.internal.threaddump.ThreadDumpParser(this.options, z6).parse(io.sentry.android.core.internal.threaddump.Lines.readLines(bufferedReader));
                            if (list.isEmpty()) {
                                io.sentry.android.core.AnrV2Integration.ParseResult parseResult2 = new io.sentry.android.core.AnrV2Integration.ParseResult(io.sentry.android.core.AnrV2Integration.ParseResult.Type.NO_DUMP);
                                bufferedReader.close();
                                return parseResult2;
                            }
                            io.sentry.android.core.AnrV2Integration.ParseResult parseResult3 = new io.sentry.android.core.AnrV2Integration.ParseResult(io.sentry.android.core.AnrV2Integration.ParseResult.Type.DUMP, dumpBytes, list);
                            bufferedReader.close();
                            return parseResult3;
                        } catch (java.lang.Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Failed to parse ANR thread dump", th3);
                        return new io.sentry.android.core.AnrV2Integration.ParseResult(io.sentry.android.core.AnrV2Integration.ParseResult.Type.ERROR, dumpBytes);
                    }
                } catch (java.lang.Throwable th4) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (java.lang.Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (java.lang.Throwable th6) {
                this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Failed to read ANR thread dump", th6);
                return new io.sentry.android.core.AnrV2Integration.ParseResult(io.sentry.android.core.AnrV2Integration.ParseResult.Type.NO_DUMP);
            }
        }

        private void reportAsSentryEvent(android.app.ApplicationExitInfo applicationExitInfo, boolean z6) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z9 = applicationExitInfo.getImportance() != 100;
            io.sentry.android.core.AnrV2Integration.ParseResult threadDump = parseThreadDump(applicationExitInfo, z9);
            if (threadDump.type == io.sentry.android.core.AnrV2Integration.ParseResult.Type.NO_DUMP) {
                this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            io.sentry.android.core.AnrV2Integration.AnrV2Hint anrV2Hint = new io.sentry.android.core.AnrV2Integration.AnrV2Hint(this.options.getFlushTimeoutMillis(), this.options.getLogger(), timestamp, z6, z9);
            io.sentry.Hint hintCreateWithTypeCheckHint = io.sentry.util.HintUtils.createWithTypeCheckHint(anrV2Hint);
            io.sentry.SentryEvent sentryEvent = new io.sentry.SentryEvent();
            io.sentry.android.core.AnrV2Integration.ParseResult.Type type = threadDump.type;
            if (type == io.sentry.android.core.AnrV2Integration.ParseResult.Type.ERROR) {
                io.sentry.protocol.Message message = new io.sentry.protocol.Message();
                message.setFormatted("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                sentryEvent.setMessage(message);
            } else if (type == io.sentry.android.core.AnrV2Integration.ParseResult.Type.DUMP) {
                sentryEvent.setThreads(threadDump.threads);
            }
            sentryEvent.setLevel(io.sentry.SentryLevel.FATAL);
            sentryEvent.setTimestamp(io.sentry.DateUtils.getDateTime(timestamp));
            if (this.options.isAttachAnrThreadDump() && (bArr = threadDump.dump) != null) {
                hintCreateWithTypeCheckHint.setThreadDump(io.sentry.Attachment.fromThreadDump(bArr));
            }
            if (this.scopes.captureEvent(sentryEvent, hintCreateWithTypeCheckHint).equals(io.sentry.protocol.SentryId.EMPTY_ID) || anrV2Hint.waitFlush()) {
                return;
            }
            this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", sentryEvent.getEventId());
        }

        private void reportNonEnrichedHistoricalAnrs(java.util.List<android.app.ApplicationExitInfo> list, java.lang.Long l2) {
            java.util.Collections.reverse(list);
            java.util.Iterator<android.app.ApplicationExitInfo> it = list.iterator();
            while (it.hasNext()) {
                android.app.ApplicationExitInfo applicationExitInfoE = androidx.media3.exoplayer.source.mediaparser.b.e(it.next());
                if (applicationExitInfoE.getReason() == 6) {
                    if (applicationExitInfoE.getTimestamp() < this.threshold) {
                        this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "ANR happened too long ago %s.", applicationExitInfoE);
                    } else if (l2 == null || applicationExitInfoE.getTimestamp() > l2.longValue()) {
                        reportAsSentryEvent(applicationExitInfoE, false);
                    } else {
                        this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "ANR has already been reported %s.", applicationExitInfoE);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            android.app.ApplicationExitInfo applicationExitInfoE;
            java.util.List historicalProcessExitReasons = ((android.app.ActivityManager) this.context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "No records in historical exit reasons.", new java.lang.Object[0]);
                return;
            }
            io.sentry.cache.IEnvelopeCache envelopeDiskCache = this.options.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.EnvelopeCache) && this.options.isEnableAutoSessionTracking()) {
                io.sentry.cache.EnvelopeCache envelopeCache = (io.sentry.cache.EnvelopeCache) envelopeDiskCache;
                if (!envelopeCache.waitPreviousSessionFlush()) {
                    this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file.", new java.lang.Object[0]);
                    envelopeCache.flushPreviousSession();
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(historicalProcessExitReasons);
            java.lang.Long lLastReportedAnr = io.sentry.android.core.cache.AndroidEnvelopeCache.lastReportedAnr(this.options);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    applicationExitInfoE = null;
                    break;
                }
                applicationExitInfoE = androidx.media3.exoplayer.source.mediaparser.b.e(it.next());
                if (applicationExitInfoE.getReason() == 6) {
                    arrayList.remove(applicationExitInfoE);
                    break;
                }
            }
            if (applicationExitInfoE == null) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "No ANRs have been found in the historical exit reasons list.", new java.lang.Object[0]);
                return;
            }
            if (applicationExitInfoE.getTimestamp() < this.threshold) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Latest ANR happened too long ago, returning early.", new java.lang.Object[0]);
                return;
            }
            if (lLastReportedAnr != null && applicationExitInfoE.getTimestamp() <= lLastReportedAnr.longValue()) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Latest ANR has already been reported, returning early.", new java.lang.Object[0]);
                return;
            }
            if (this.options.isReportHistoricalAnrs()) {
                reportNonEnrichedHistoricalAnrs(arrayList, lLastReportedAnr);
            }
            reportAsSentryEvent(applicationExitInfoE, true);
        }
    }

    public static final class AnrV2Hint extends io.sentry.hints.BlockingFlushHint implements io.sentry.hints.Backfillable, io.sentry.hints.AbnormalExit {
        private final boolean isBackgroundAnr;
        private final boolean shouldEnrich;
        private final long timestamp;

        public AnrV2Hint(long j, io.sentry.ILogger iLogger, long j9, boolean z6, boolean z9) {
            super(j, iLogger);
            this.timestamp = j9;
            this.shouldEnrich = z6;
            this.isBackgroundAnr = z9;
        }

        @Override // io.sentry.hints.AbnormalExit
        public boolean ignoreCurrentThread() {
            return false;
        }

        @Override // io.sentry.hints.DiskFlushNotification
        public boolean isFlushable(io.sentry.protocol.SentryId sentryId) {
            return true;
        }

        @Override // io.sentry.hints.AbnormalExit
        public java.lang.String mechanism() {
            return this.isBackgroundAnr ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.DiskFlushNotification
        public void setFlushable(io.sentry.protocol.SentryId sentryId) {
        }

        @Override // io.sentry.hints.Backfillable
        public boolean shouldEnrich() {
            return this.shouldEnrich;
        }

        @Override // io.sentry.hints.AbnormalExit
        public java.lang.Long timestamp() {
            return java.lang.Long.valueOf(this.timestamp);
        }
    }

    public AnrV2Integration(android.content.Context context) {
        this(context, io.sentry.transport.CurrentDateProvider.getInstance());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "AnrV2Integration removed.", new java.lang.Object[0]);
        }
    }

    @Override // io.sentry.Integration
    public void register(io.sentry.IScopes iScopes, io.sentry.SentryOptions sentryOptions) {
        io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions = (io.sentry.android.core.SentryAndroidOptions) io.sentry.util.Objects.requireNonNull(sentryOptions instanceof io.sentry.android.core.SentryAndroidOptions ? (io.sentry.android.core.SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "AnrIntegration enabled: %s", java.lang.Boolean.valueOf(this.options.isAnrEnabled()));
        if (this.options.getCacheDirPath() == null) {
            this.options.getLogger().log(io.sentry.SentryLevel.INFO, "Cache dir is not set, unable to process ANRs", new java.lang.Object[0]);
            return;
        }
        if (this.options.isAnrEnabled()) {
            try {
                sentryOptions.getExecutorService().submit(new io.sentry.android.core.AnrV2Integration.AnrProcessor(this.context, iScopes, this.options, this.dateProvider));
            } catch (java.lang.Throwable th) {
                sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Failed to start AnrProcessor.", th);
            }
            sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "AnrV2Integration installed.", new java.lang.Object[0]);
            io.sentry.util.IntegrationUtils.addIntegrationToSdkVersion("AnrV2");
        }
    }

    public AnrV2Integration(android.content.Context context, io.sentry.transport.ICurrentDateProvider iCurrentDateProvider) {
        this.context = io.sentry.android.core.ContextUtils.getApplicationContext(context);
        this.dateProvider = iCurrentDateProvider;
    }

    public static final class ParseResult {
        final byte[] dump;
        final java.util.List<io.sentry.protocol.SentryThread> threads;
        final io.sentry.android.core.AnrV2Integration.ParseResult.Type type;

        public enum Type {
            DUMP,
            NO_DUMP,
            ERROR
        }

        public ParseResult(io.sentry.android.core.AnrV2Integration.ParseResult.Type type) {
            this.type = type;
            this.dump = null;
            this.threads = null;
        }

        public ParseResult(io.sentry.android.core.AnrV2Integration.ParseResult.Type type, byte[] bArr) {
            this.type = type;
            this.dump = bArr;
            this.threads = null;
        }

        public ParseResult(io.sentry.android.core.AnrV2Integration.ParseResult.Type type, byte[] bArr, java.util.List<io.sentry.protocol.SentryThread> list) {
            this.type = type;
            this.dump = bArr;
            this.threads = list;
        }
    }
}
