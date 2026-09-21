package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class EnvelopeSender extends io.sentry.DirectoryProcessor implements io.sentry.IEnvelopeSender {
    private final io.sentry.ILogger logger;
    private final io.sentry.IScopes scopes;
    private final io.sentry.ISerializer serializer;

    public EnvelopeSender(io.sentry.IScopes iScopes, io.sentry.ISerializer iSerializer, io.sentry.ILogger iLogger, long j, int i3) {
        super(iScopes, iLogger, j, i3);
        this.scopes = (io.sentry.IScopes) io.sentry.util.Objects.requireNonNull(iScopes, "Scopes are required.");
        this.serializer = (io.sentry.ISerializer) io.sentry.util.Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "Logger is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processFile$0(io.sentry.hints.Flushable flushable) {
        if (flushable.waitFlush()) {
            return;
        }
        this.logger.log(io.sentry.SentryLevel.WARNING, "Timed out waiting for envelope submission.", new java.lang.Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processFile$1(java.lang.Throwable th, java.io.File file, io.sentry.hints.Retryable retryable) {
        retryable.setRetry(false);
        this.logger.log(io.sentry.SentryLevel.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processFile$2(java.io.File file, io.sentry.hints.Retryable retryable) {
        if (retryable.isRetry()) {
            this.logger.log(io.sentry.SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            safeDelete(file, "after trying to capture it");
            this.logger.log(io.sentry.SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    private void safeDelete(java.io.File file, java.lang.String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.logger.log(io.sentry.SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (java.lang.Throwable th) {
            this.logger.log(io.sentry.SentryLevel.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.DirectoryProcessor
    public boolean isRelevantFileName(java.lang.String str) {
        return str.endsWith(io.sentry.cache.EnvelopeCache.SUFFIX_ENVELOPE_FILE);
    }

    @Override // io.sentry.DirectoryProcessor
    public /* bridge */ /* synthetic */ void processDirectory(java.io.File file) {
        super.processDirectory(file);
    }

    @Override // io.sentry.IEnvelopeSender
    public void processEnvelopeFile(java.lang.String str, io.sentry.Hint hint) {
        io.sentry.util.Objects.requireNonNull(str, "Path is required.");
        processFile(new java.io.File(str), hint);
    }

    @Override // io.sentry.DirectoryProcessor
    public void processFile(java.io.File file, io.sentry.Hint hint) {
        io.sentry.ILogger iLogger;
        io.sentry.f fVar;
        if (!file.isFile()) {
            this.logger.log(io.sentry.SentryLevel.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!isRelevantFileName(file.getName())) {
            this.logger.log(io.sentry.SentryLevel.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.logger.log(io.sentry.SentryLevel.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
                try {
                    io.sentry.SentryEnvelope sentryEnvelopeDeserializeEnvelope = this.serializer.deserializeEnvelope(bufferedInputStream);
                    if (sentryEnvelopeDeserializeEnvelope == null) {
                        this.logger.log(io.sentry.SentryLevel.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                    } else {
                        this.scopes.captureEnvelope(sentryEnvelopeDeserializeEnvelope, hint);
                    }
                    io.sentry.util.HintUtils.runIfHasTypeLogIfNot(hint, io.sentry.hints.Flushable.class, this.logger, new io.sentry.c(0, this));
                    bufferedInputStream.close();
                    io.sentry.util.HintUtils.runIfHasTypeLogIfNot(hint, io.sentry.hints.Retryable.class, this.logger, new io.sentry.f(this, file, 1));
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException e6) {
                this.logger.log(io.sentry.SentryLevel.ERROR, e6, "File '%s' cannot be found.", file.getAbsolutePath());
                iLogger = this.logger;
                fVar = new io.sentry.f(this, file, 1);
                io.sentry.util.HintUtils.runIfHasTypeLogIfNot(hint, io.sentry.hints.Retryable.class, iLogger, fVar);
            } catch (java.io.IOException e9) {
                this.logger.log(io.sentry.SentryLevel.ERROR, e9, "I/O on file '%s' failed.", file.getAbsolutePath());
                iLogger = this.logger;
                fVar = new io.sentry.f(this, file, 1);
                io.sentry.util.HintUtils.runIfHasTypeLogIfNot(hint, io.sentry.hints.Retryable.class, iLogger, fVar);
            } catch (java.lang.Throwable th3) {
                this.logger.log(io.sentry.SentryLevel.ERROR, th3, "Failed to capture cached envelope %s", file.getAbsolutePath());
                io.sentry.util.HintUtils.runIfHasTypeLogIfNot(hint, io.sentry.hints.Retryable.class, this.logger, new io.sentry.n(this, th3, file));
                iLogger = this.logger;
                fVar = new io.sentry.f(this, file, 1);
                io.sentry.util.HintUtils.runIfHasTypeLogIfNot(hint, io.sentry.hints.Retryable.class, iLogger, fVar);
            }
        } catch (java.lang.Throwable th4) {
            io.sentry.util.HintUtils.runIfHasTypeLogIfNot(hint, io.sentry.hints.Retryable.class, this.logger, new io.sentry.f(this, file, 1));
            throw th4;
        }
    }
}
