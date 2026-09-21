package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
final class EnvelopeFileObserver extends android.os.FileObserver {
    private final io.sentry.IEnvelopeSender envelopeSender;
    private final long flushTimeoutMillis;
    private final io.sentry.ILogger logger;
    private final java.lang.String rootPath;

    public static final class CachedEnvelopeHint implements io.sentry.hints.Cached, io.sentry.hints.Retryable, io.sentry.hints.SubmissionResult, io.sentry.hints.Flushable, io.sentry.hints.ApplyScopeData, io.sentry.hints.Resettable {
        private final long flushTimeoutMillis;
        private java.util.concurrent.CountDownLatch latch;
        private final io.sentry.ILogger logger;
        boolean retry;
        boolean succeeded;

        public CachedEnvelopeHint(long j, io.sentry.ILogger iLogger) {
            reset();
            this.flushTimeoutMillis = j;
            this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.Retryable
        public boolean isRetry() {
            return this.retry;
        }

        @Override // io.sentry.hints.SubmissionResult
        public boolean isSuccess() {
            return this.succeeded;
        }

        @Override // io.sentry.hints.Resettable
        public void reset() {
            this.latch = new java.util.concurrent.CountDownLatch(1);
            this.retry = false;
            this.succeeded = false;
        }

        @Override // io.sentry.hints.SubmissionResult
        public void setResult(boolean z6) {
            this.succeeded = z6;
            this.latch.countDown();
        }

        @Override // io.sentry.hints.Retryable
        public void setRetry(boolean z6) {
            this.retry = z6;
        }

        @Override // io.sentry.hints.Flushable
        public boolean waitFlush() {
            try {
                return this.latch.await(this.flushTimeoutMillis, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e6) {
                java.lang.Thread.currentThread().interrupt();
                this.logger.log(io.sentry.SentryLevel.ERROR, "Exception while awaiting on lock.", e6);
                return false;
            }
        }
    }

    public EnvelopeFileObserver(java.lang.String str, io.sentry.IEnvelopeSender iEnvelopeSender, io.sentry.ILogger iLogger, long j) {
        super(str);
        this.rootPath = str;
        this.envelopeSender = (io.sentry.IEnvelopeSender) io.sentry.util.Objects.requireNonNull(iEnvelopeSender, "Envelope sender is required.");
        this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "Logger is required.");
        this.flushTimeoutMillis = j;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i3, java.lang.String str) {
        if (str == null || i3 != 8) {
            return;
        }
        this.logger.log(io.sentry.SentryLevel.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", java.lang.Integer.valueOf(i3), this.rootPath, str);
        io.sentry.Hint hintCreateWithTypeCheckHint = io.sentry.util.HintUtils.createWithTypeCheckHint(new io.sentry.android.core.EnvelopeFileObserver.CachedEnvelopeHint(this.flushTimeoutMillis, this.logger));
        this.envelopeSender.processEnvelopeFile(this.rootPath + java.io.File.separator + str, hintCreateWithTypeCheckHint);
    }
}
