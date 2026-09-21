package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
abstract class DirectoryProcessor {
    private static final long ENVELOPE_PROCESSING_DELAY = 100;
    private final long flushTimeoutMillis;
    private final io.sentry.ILogger logger;
    private final java.util.Queue<java.lang.String> processedEnvelopes;
    private final io.sentry.IScopes scopes;

    public static final class SendCachedEnvelopeHint implements io.sentry.hints.Cached, io.sentry.hints.Retryable, io.sentry.hints.SubmissionResult, io.sentry.hints.Flushable, io.sentry.hints.Enqueable {
        private final java.lang.String filePath;
        private final long flushTimeoutMillis;
        private final io.sentry.ILogger logger;
        private final java.util.Queue<java.lang.String> processedEnvelopes;
        boolean retry = false;
        boolean succeeded = false;
        private final java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(1);

        public SendCachedEnvelopeHint(long j, io.sentry.ILogger iLogger, java.lang.String str, java.util.Queue<java.lang.String> queue) {
            this.flushTimeoutMillis = j;
            this.filePath = str;
            this.processedEnvelopes = queue;
            this.logger = iLogger;
        }

        @Override // io.sentry.hints.Retryable
        public boolean isRetry() {
            return this.retry;
        }

        @Override // io.sentry.hints.SubmissionResult
        public boolean isSuccess() {
            return this.succeeded;
        }

        @Override // io.sentry.hints.Enqueable
        public void markEnqueued() {
            this.processedEnvelopes.add(this.filePath);
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

    public DirectoryProcessor(io.sentry.IScopes iScopes, io.sentry.ILogger iLogger, long j, int i3) {
        this.scopes = iScopes;
        this.logger = iLogger;
        this.flushTimeoutMillis = j;
        this.processedEnvelopes = io.sentry.SynchronizedQueue.synchronizedQueue(new io.sentry.CircularFifoQueue(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$processDirectory$0(java.io.File file, java.lang.String str) {
        return isRelevantFileName(str);
    }

    public abstract boolean isRelevantFileName(java.lang.String str);

    public void processDirectory(java.io.File file) {
        try {
            io.sentry.ILogger iLogger = this.logger;
            io.sentry.SentryLevel sentryLevel = io.sentry.SentryLevel.DEBUG;
            iLogger.log(sentryLevel, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                this.logger.log(io.sentry.SentryLevel.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
                return;
            }
            if (!file.isDirectory()) {
                this.logger.log(io.sentry.SentryLevel.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
                return;
            }
            java.io.File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                this.logger.log(io.sentry.SentryLevel.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                return;
            }
            java.io.File[] fileArrListFiles2 = file.listFiles(new java.io.FilenameFilter() { // from class: io.sentry.b
                @Override // java.io.FilenameFilter
                public final boolean accept(java.io.File file2, java.lang.String str) {
                    return this.f23479a.lambda$processDirectory$0(file2, str);
                }
            });
            this.logger.log(sentryLevel, "Processing %d items from cache dir %s", java.lang.Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0), file.getAbsolutePath());
            for (java.io.File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    java.lang.String absolutePath = file2.getAbsolutePath();
                    if (this.processedEnvelopes.contains(absolutePath)) {
                        this.logger.log(io.sentry.SentryLevel.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.RateLimiter rateLimiter = this.scopes.getRateLimiter();
                        if (rateLimiter != null && rateLimiter.isActiveForCategory(io.sentry.DataCategory.All)) {
                            this.logger.log(io.sentry.SentryLevel.INFO, "DirectoryProcessor, rate limiting active.", new java.lang.Object[0]);
                            return;
                        } else {
                            this.logger.log(io.sentry.SentryLevel.DEBUG, "Processing file: %s", absolutePath);
                            processFile(file2, io.sentry.util.HintUtils.createWithTypeCheckHint(new io.sentry.DirectoryProcessor.SendCachedEnvelopeHint(this.flushTimeoutMillis, this.logger, absolutePath, this.processedEnvelopes)));
                            java.lang.Thread.sleep(100L);
                        }
                    }
                } else {
                    this.logger.log(io.sentry.SentryLevel.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (java.lang.Throwable th) {
            this.logger.log(io.sentry.SentryLevel.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    public abstract void processFile(java.io.File file, io.sentry.Hint hint);
}
