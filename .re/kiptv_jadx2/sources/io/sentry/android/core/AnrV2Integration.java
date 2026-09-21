package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.Attachment;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.Integration;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.threaddump.Lines;
import io.sentry.android.core.internal.threaddump.ThreadDumpParser;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.Backfillable;
import io.sentry.hints.BlockingFlushHint;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryThread;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AnrV2Integration implements Integration, Closeable, AutoCloseable {
    static final long NINETY_DAYS_THRESHOLD = TimeUnit.DAYS.toMillis(91);
    private final Context context;
    private final ICurrentDateProvider dateProvider;
    private SentryAndroidOptions options;

    public static class AnrProcessor implements Runnable {
        private final Context context;
        private final SentryAndroidOptions options;
        private final IScopes scopes;
        private final long threshold;

        public AnrProcessor(Context context, IScopes iScopes, SentryAndroidOptions sentryAndroidOptions, ICurrentDateProvider iCurrentDateProvider) {
            this.context = context;
            this.scopes = iScopes;
            this.options = sentryAndroidOptions;
            this.threshold = iCurrentDateProvider.getCurrentTimeMillis() - AnrV2Integration.NINETY_DAYS_THRESHOLD;
        }

        private byte[] getDumpBytes(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
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
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        private ParseResult parseThreadDump(ApplicationExitInfo applicationExitInfo, boolean z6) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        ParseResult parseResult = new ParseResult(ParseResult.Type.NO_DUMP);
                        if (traceInputStream == null) {
                            return parseResult;
                        }
                        traceInputStream.close();
                        return parseResult;
                    }
                    byte[] dumpBytes = getDumpBytes(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(dumpBytes)));
                        try {
                            List<SentryThread> list = new ThreadDumpParser(this.options, z6).parse(Lines.readLines(bufferedReader));
                            if (list.isEmpty()) {
                                ParseResult parseResult2 = new ParseResult(ParseResult.Type.NO_DUMP);
                                bufferedReader.close();
                                return parseResult2;
                            }
                            ParseResult parseResult3 = new ParseResult(ParseResult.Type.DUMP, dumpBytes, list);
                            bufferedReader.close();
                            return parseResult3;
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        this.options.getLogger().log(SentryLevel.WARNING, "Failed to parse ANR thread dump", th3);
                        return new ParseResult(ParseResult.Type.ERROR, dumpBytes);
                    }
                } catch (Throwable th4) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to read ANR thread dump", th6);
                return new ParseResult(ParseResult.Type.NO_DUMP);
            }
        }

        private void reportAsSentryEvent(ApplicationExitInfo applicationExitInfo, boolean z6) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z9 = applicationExitInfo.getImportance() != 100;
            ParseResult threadDump = parseThreadDump(applicationExitInfo, z9);
            if (threadDump.type == ParseResult.Type.NO_DUMP) {
                this.options.getLogger().log(SentryLevel.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            AnrV2Hint anrV2Hint = new AnrV2Hint(this.options.getFlushTimeoutMillis(), this.options.getLogger(), timestamp, z6, z9);
            Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(anrV2Hint);
            SentryEvent sentryEvent = new SentryEvent();
            ParseResult.Type type = threadDump.type;
            if (type == ParseResult.Type.ERROR) {
                Message message = new Message();
                message.setFormatted("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                sentryEvent.setMessage(message);
            } else if (type == ParseResult.Type.DUMP) {
                sentryEvent.setThreads(threadDump.threads);
            }
            sentryEvent.setLevel(SentryLevel.FATAL);
            sentryEvent.setTimestamp(DateUtils.getDateTime(timestamp));
            if (this.options.isAttachAnrThreadDump() && (bArr = threadDump.dump) != null) {
                hintCreateWithTypeCheckHint.setThreadDump(Attachment.fromThreadDump(bArr));
            }
            if (this.scopes.captureEvent(sentryEvent, hintCreateWithTypeCheckHint).equals(SentryId.EMPTY_ID) || anrV2Hint.waitFlush()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", sentryEvent.getEventId());
        }

        private void reportNonEnrichedHistoricalAnrs(List<ApplicationExitInfo> list, Long l2) {
            Collections.reverse(list);
            Iterator<ApplicationExitInfo> it = list.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoE = androidx.media3.exoplayer.source.mediaparser.b.e(it.next());
                if (applicationExitInfoE.getReason() == 6) {
                    if (applicationExitInfoE.getTimestamp() < this.threshold) {
                        this.options.getLogger().log(SentryLevel.DEBUG, "ANR happened too long ago %s.", applicationExitInfoE);
                    } else if (l2 == null || applicationExitInfoE.getTimestamp() > l2.longValue()) {
                        reportAsSentryEvent(applicationExitInfoE, false);
                    } else {
                        this.options.getLogger().log(SentryLevel.DEBUG, "ANR has already been reported %s.", applicationExitInfoE);
                    }
                }
            }
        }

        @Override
        public void run() {
            ApplicationExitInfo applicationExitInfoE;
            List historicalProcessExitReasons = ((ActivityManager) this.context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            IEnvelopeCache envelopeDiskCache = this.options.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof EnvelopeCache) && this.options.isEnableAutoSessionTracking()) {
                EnvelopeCache envelopeCache = (EnvelopeCache) envelopeDiskCache;
                if (!envelopeCache.waitPreviousSessionFlush()) {
                    this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    envelopeCache.flushPreviousSession();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long lLastReportedAnr = AndroidEnvelopeCache.lastReportedAnr(this.options);
            Iterator it = arrayList.iterator();
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
                this.options.getLogger().log(SentryLevel.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfoE.getTimestamp() < this.threshold) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (lLastReportedAnr != null && applicationExitInfoE.getTimestamp() <= lLastReportedAnr.longValue()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.options.isReportHistoricalAnrs()) {
                reportNonEnrichedHistoricalAnrs(arrayList, lLastReportedAnr);
            }
            reportAsSentryEvent(applicationExitInfoE, true);
        }
    }

    public static final class AnrV2Hint extends BlockingFlushHint implements Backfillable, AbnormalExit {
        private final boolean isBackgroundAnr;
        private final boolean shouldEnrich;
        private final long timestamp;

        public AnrV2Hint(long j, ILogger iLogger, long j9, boolean z6, boolean z9) {
            super(j, iLogger);
            this.timestamp = j9;
            this.shouldEnrich = z6;
            this.isBackgroundAnr = z9;
        }

        @Override
        public boolean ignoreCurrentThread() {
            return false;
        }

        @Override
        public boolean isFlushable(SentryId sentryId) {
            return true;
        }

        @Override
        public String mechanism() {
            return this.isBackgroundAnr ? "anr_background" : "anr_foreground";
        }

        @Override
        public void setFlushable(SentryId sentryId) {
        }

        @Override
        public boolean shouldEnrich() {
            return this.shouldEnrich;
        }

        @Override
        public Long timestamp() {
            return Long.valueOf(this.timestamp);
        }
    }

    public AnrV2Integration(Context context) {
        this(context, CurrentDateProvider.getInstance());
    }

    @Override
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.options.isAnrEnabled()));
        if (this.options.getCacheDirPath() == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.options.isAnrEnabled()) {
            try {
                sentryOptions.getExecutorService().submit(new AnrProcessor(this.context, iScopes, this.options, this.dateProvider));
            } catch (Throwable th) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to start AnrProcessor.", th);
            }
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "AnrV2Integration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion("AnrV2");
        }
    }

    public AnrV2Integration(Context context, ICurrentDateProvider iCurrentDateProvider) {
        this.context = ContextUtils.getApplicationContext(context);
        this.dateProvider = iCurrentDateProvider;
    }

    public static final class ParseResult {
        final byte[] dump;
        final List<SentryThread> threads;
        final Type type;

        public enum Type {
            DUMP,
            NO_DUMP,
            ERROR
        }

        public ParseResult(Type type) {
            this.type = type;
            this.dump = null;
            this.threads = null;
        }

        public ParseResult(Type type, byte[] bArr) {
            this.type = type;
            this.dump = bArr;
            this.threads = null;
        }

        public ParseResult(Type type, byte[] bArr, List<SentryThread> list) {
            this.type = type;
            this.dump = bArr;
            this.threads = list;
        }
    }
}
