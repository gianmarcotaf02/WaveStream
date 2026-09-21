package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.Hint;
import io.sentry.IEnvelopeSender;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.hints.ApplyScopeData;
import io.sentry.hints.Cached;
import io.sentry.hints.Flushable;
import io.sentry.hints.Resettable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class EnvelopeFileObserver extends FileObserver {
    private final IEnvelopeSender envelopeSender;
    private final long flushTimeoutMillis;
    private final ILogger logger;
    private final String rootPath;

    public static final class CachedEnvelopeHint implements Cached, Retryable, SubmissionResult, Flushable, ApplyScopeData, Resettable {
        private final long flushTimeoutMillis;
        private CountDownLatch latch;
        private final ILogger logger;
        boolean retry;
        boolean succeeded;

        public CachedEnvelopeHint(long j, ILogger iLogger) {
            reset();
            this.flushTimeoutMillis = j;
            this.logger = (ILogger) Objects.requireNonNull(iLogger, "ILogger is required.");
        }

        @Override
        public boolean isRetry() {
            return this.retry;
        }

        @Override
        public boolean isSuccess() {
            return this.succeeded;
        }

        @Override
        public void reset() {
            this.latch = new CountDownLatch(1);
            this.retry = false;
            this.succeeded = false;
        }

        @Override
        public void setResult(boolean z6) {
            this.succeeded = z6;
            this.latch.countDown();
        }

        @Override
        public void setRetry(boolean z6) {
            this.retry = z6;
        }

        @Override
        public boolean waitFlush() {
            try {
                return this.latch.await(this.flushTimeoutMillis, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e6) {
                Thread.currentThread().interrupt();
                this.logger.log(SentryLevel.ERROR, "Exception while awaiting on lock.", e6);
                return false;
            }
        }
    }

    public EnvelopeFileObserver(String str, IEnvelopeSender iEnvelopeSender, ILogger iLogger, long j) {
        super(str);
        this.rootPath = str;
        this.envelopeSender = (IEnvelopeSender) Objects.requireNonNull(iEnvelopeSender, "Envelope sender is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
        this.flushTimeoutMillis = j;
    }

    @Override
    public void onEvent(int i3, String str) {
        if (str == null || i3 != 8) {
            return;
        }
        this.logger.log(SentryLevel.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i3), this.rootPath, str);
        Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(new CachedEnvelopeHint(this.flushTimeoutMillis, this.logger));
        this.envelopeSender.processEnvelopeFile(this.rootPath + File.separator + str, hintCreateWithTypeCheckHint);
    }
}
