package io.sentry.cache;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CacheStrategy {
    protected static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    protected final java.io.File directory;
    private final int maxSize;
    protected io.sentry.SentryOptions options;
    protected final io.sentry.util.LazyEvaluator<io.sentry.ISerializer> serializer = new io.sentry.util.LazyEvaluator<>(new io.sentry.util.LazyEvaluator.Evaluator() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.LazyEvaluator.Evaluator
        public final java.lang.Object evaluate() {
            return this.f23482h.lambda$new$0();
        }
    });

    public CacheStrategy(io.sentry.SentryOptions sentryOptions, java.lang.String str, int i3) {
        io.sentry.util.Objects.requireNonNull(str, "Directory is required.");
        this.options = (io.sentry.SentryOptions) io.sentry.util.Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.directory = new java.io.File(str);
        this.maxSize = i3;
    }

    private io.sentry.SentryEnvelope buildNewEnvelope(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.SentryEnvelopeItem sentryEnvelopeItem) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<io.sentry.SentryEnvelopeItem> it = sentryEnvelope.getItems().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(sentryEnvelopeItem);
        return new io.sentry.SentryEnvelope(sentryEnvelope.getHeader(), arrayList);
    }

    private io.sentry.Session getFirstSession(io.sentry.SentryEnvelope sentryEnvelope) {
        for (io.sentry.SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            if (isSessionType(sentryEnvelopeItem)) {
                return readSession(sentryEnvelopeItem);
            }
        }
        return null;
    }

    private boolean isSessionType(io.sentry.SentryEnvelopeItem sentryEnvelopeItem) {
        if (sentryEnvelopeItem == null) {
            return false;
        }
        return sentryEnvelopeItem.getHeader().getType().equals(io.sentry.SentryItemType.Session);
    }

    private boolean isValidEnvelope(io.sentry.SentryEnvelope sentryEnvelope) {
        return sentryEnvelope.getItems().iterator().hasNext();
    }

    private boolean isValidSession(io.sentry.Session session) {
        return session.getStatus().equals(io.sentry.Session.State.Ok) && session.getSessionId() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ io.sentry.ISerializer lambda$new$0() {
        return this.options.getSerializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortFilesOldestToNewest$1(java.io.File file, java.io.File file2) {
        return java.lang.Long.compare(file.lastModified(), file2.lastModified());
    }

    private void moveInitFlagIfNecessary(java.io.File file, java.io.File[] fileArr) {
        java.lang.Boolean init;
        io.sentry.SentryEnvelopeItem sentryEnvelopeItemFromSession;
        io.sentry.Session session;
        io.sentry.SentryEnvelope envelope = readEnvelope(file);
        if (envelope == null || !isValidEnvelope(envelope)) {
            return;
        }
        this.options.getClientReportRecorder().recordLostEnvelope(io.sentry.clientreport.DiscardReason.CACHE_OVERFLOW, envelope);
        io.sentry.Session firstSession = getFirstSession(envelope);
        if (firstSession == null || !isValidSession(firstSession) || (init = firstSession.getInit()) == null || !init.booleanValue()) {
            return;
        }
        for (java.io.File file2 : fileArr) {
            io.sentry.SentryEnvelope envelope2 = readEnvelope(file2);
            if (envelope2 != null && isValidEnvelope(envelope2)) {
                java.util.Iterator<io.sentry.SentryEnvelopeItem> it = envelope2.getItems().iterator();
                while (true) {
                    sentryEnvelopeItemFromSession = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    io.sentry.SentryEnvelopeItem next = it.next();
                    if (isSessionType(next) && (session = readSession(next)) != null && isValidSession(session)) {
                        java.lang.Boolean init2 = session.getInit();
                        if (init2 != null && init2.booleanValue()) {
                            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Session %s has 2 times the init flag.", firstSession.getSessionId());
                            return;
                        }
                        if (firstSession.getSessionId() != null && firstSession.getSessionId().equals(session.getSessionId())) {
                            session.setInitAsTrue();
                            try {
                                sentryEnvelopeItemFromSession = io.sentry.SentryEnvelopeItem.fromSession(this.serializer.getValue(), session);
                                it.remove();
                                break;
                            } catch (java.io.IOException e6) {
                                this.options.getLogger().log(io.sentry.SentryLevel.ERROR, e6, "Failed to create new envelope item for the session %s", firstSession.getSessionId());
                                break;
                            }
                        }
                    }
                }
                if (sentryEnvelopeItemFromSession != null) {
                    io.sentry.SentryEnvelope sentryEnvelopeBuildNewEnvelope = buildNewEnvelope(envelope2, sentryEnvelopeItemFromSession);
                    long jLastModified = file2.lastModified();
                    if (!file2.delete()) {
                        this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                    }
                    saveNewEnvelope(sentryEnvelopeBuildNewEnvelope, file2, jLastModified);
                    return;
                }
            }
        }
    }

    private io.sentry.SentryEnvelope readEnvelope(java.io.File file) {
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
            try {
                io.sentry.SentryEnvelope sentryEnvelopeDeserializeEnvelope = this.serializer.getValue().deserializeEnvelope(bufferedInputStream);
                bufferedInputStream.close();
                return sentryEnvelopeDeserializeEnvelope;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e6) {
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to deserialize the envelope.", e6);
            return null;
        }
    }

    private io.sentry.Session readSession(io.sentry.SentryEnvelopeItem sentryEnvelopeItem) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(sentryEnvelopeItem.getData()), UTF_8));
            try {
                io.sentry.Session session = (io.sentry.Session) this.serializer.getValue().deserialize(bufferedReader, io.sentry.Session.class);
                bufferedReader.close();
                return session;
            } catch (java.lang.Throwable th) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }

    private void saveNewEnvelope(io.sentry.SentryEnvelope sentryEnvelope, java.io.File file, long j) {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                this.serializer.getValue().serialize(sentryEnvelope, fileOutputStream);
                file.setLastModified(j);
                fileOutputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to serialize the new envelope to the disk.", th3);
        }
    }

    private void sortFilesOldestToNewest(java.io.File[] fileArr) {
        if (fileArr.length > 1) {
            java.util.Arrays.sort(fileArr, new io.sentry.cache.b());
        }
    }

    public boolean isDirectoryValid() {
        if (this.directory.isDirectory() && this.directory.canWrite() && this.directory.canRead()) {
            return true;
        }
        this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "The directory for caching files is inaccessible.: %s", this.directory.getAbsolutePath());
        return false;
    }

    public void rotateCacheIfNeeded(java.io.File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.maxSize) {
            this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new java.lang.Object[0]);
            int i3 = (length - this.maxSize) + 1;
            sortFilesOldestToNewest(fileArr);
            java.io.File[] fileArr2 = (java.io.File[]) java.util.Arrays.copyOfRange(fileArr, i3, length);
            for (int i9 = 0; i9 < i3; i9++) {
                java.io.File file = fileArr[i9];
                moveInitFlagIfNecessary(file, fileArr2);
                if (!file.delete()) {
                    this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
