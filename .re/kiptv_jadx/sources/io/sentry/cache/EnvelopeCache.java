package io.sentry.cache;

/* JADX INFO: loaded from: classes4.dex */
public class EnvelopeCache extends io.sentry.cache.CacheStrategy implements io.sentry.cache.IEnvelopeCache {
    public static final java.lang.String CRASH_MARKER_FILE = "last_crash";
    public static final java.lang.String NATIVE_CRASH_MARKER_FILE = ".sentry-native/last_crash";
    public static final java.lang.String PREFIX_CURRENT_SESSION_FILE = "session";
    public static final java.lang.String PREFIX_PREVIOUS_SESSION_FILE = "previous_session";
    public static final java.lang.String STARTUP_CRASH_MARKER_FILE = "startup_crash";
    public static final java.lang.String SUFFIX_ENVELOPE_FILE = ".envelope";
    static final java.lang.String SUFFIX_SESSION_FILE = ".json";
    protected final io.sentry.util.AutoClosableReentrantLock cacheLock;
    private final java.util.Map<io.sentry.SentryEnvelope, java.lang.String> fileNameMap;
    private final java.util.concurrent.CountDownLatch previousSessionLatch;

    public EnvelopeCache(io.sentry.SentryOptions sentryOptions, java.lang.String str, int i3) {
        super(sentryOptions, str, i3);
        this.fileNameMap = new java.util.WeakHashMap();
        this.cacheLock = new io.sentry.util.AutoClosableReentrantLock();
        this.previousSessionLatch = new java.util.concurrent.CountDownLatch(1);
    }

    private java.io.File[] allEnvelopeFiles() {
        java.io.File[] fileArrListFiles;
        return (!isDirectoryValid() || (fileArrListFiles = this.directory.listFiles(new io.sentry.cache.c())) == null) ? new java.io.File[0] : fileArrListFiles;
    }

    public static io.sentry.cache.IEnvelopeCache create(io.sentry.SentryOptions sentryOptions) {
        java.lang.String cacheDirPath = sentryOptions.getCacheDirPath();
        int maxCacheItems = sentryOptions.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new io.sentry.cache.EnvelopeCache(sentryOptions, cacheDirPath, maxCacheItems);
        }
        sentryOptions.getLogger().log(io.sentry.SentryLevel.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new java.lang.Object[0]);
        return io.sentry.transport.NoOpEnvelopeCache.getInstance();
    }

    public static java.io.File getCurrentSessionFile(java.lang.String str) {
        return new java.io.File(str, "session.json");
    }

    private java.io.File getEnvelopeFile(io.sentry.SentryEnvelope sentryEnvelope) {
        java.lang.String str;
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.cacheLock.acquire();
        try {
            if (this.fileNameMap.containsKey(sentryEnvelope)) {
                str = this.fileNameMap.get(sentryEnvelope);
            } else {
                java.lang.String str2 = io.sentry.SentryUUID.generateSentryId() + SUFFIX_ENVELOPE_FILE;
                this.fileNameMap.put(sentryEnvelope, str2);
                str = str2;
            }
            java.io.File file = new java.io.File(this.directory.getAbsolutePath(), str);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return file;
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static java.io.File getPreviousSessionFile(java.lang.String str) {
        return new java.io.File(str, "previous_session.json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$allEnvelopeFiles$0(java.io.File file, java.lang.String str) {
        return str.endsWith(SUFFIX_ENVELOPE_FILE);
    }

    private void tryEndPreviousSession(io.sentry.Hint hint) {
        java.util.Date dateTime;
        java.lang.Object sentrySdkHint = io.sentry.util.HintUtils.getSentrySdkHint(hint);
        if (sentrySdkHint instanceof io.sentry.hints.AbnormalExit) {
            java.io.File previousSessionFile = getPreviousSessionFile(this.directory.getAbsolutePath());
            if (!previousSessionFile.exists()) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "No previous session file to end.", new java.lang.Object[0]);
                return;
            }
            io.sentry.ILogger logger = this.options.getLogger();
            io.sentry.SentryLevel sentryLevel = io.sentry.SentryLevel.WARNING;
            logger.log(sentryLevel, "Previous session is not ended, we'd need to end it.", new java.lang.Object[0]);
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(previousSessionFile), io.sentry.cache.CacheStrategy.UTF_8));
                try {
                    io.sentry.Session session = (io.sentry.Session) this.serializer.getValue().deserialize(bufferedReader, io.sentry.Session.class);
                    if (session != null) {
                        io.sentry.hints.AbnormalExit abnormalExit = (io.sentry.hints.AbnormalExit) sentrySdkHint;
                        java.lang.Long lTimestamp = abnormalExit.timestamp();
                        if (lTimestamp != null) {
                            dateTime = io.sentry.DateUtils.getDateTime(lTimestamp.longValue());
                            java.util.Date started = session.getStarted();
                            if (started == null || dateTime.before(started)) {
                                this.options.getLogger().log(sentryLevel, "Abnormal exit happened before previous session start, not ending the session.", new java.lang.Object[0]);
                            }
                        } else {
                            dateTime = null;
                        }
                        session.update(io.sentry.Session.State.Abnormal, null, true, abnormalExit.mechanism());
                        session.end(dateTime);
                        writeSessionToDisk(previousSessionFile, session);
                    }
                    bufferedReader.close();
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Error processing previous session.", th3);
            }
        }
    }

    private void updateCurrentSession(java.io.File file, io.sentry.SentryEnvelope sentryEnvelope) {
        java.lang.Iterable<io.sentry.SentryEnvelopeItem> items = sentryEnvelope.getItems();
        if (!items.iterator().hasNext()) {
            this.options.getLogger().log(io.sentry.SentryLevel.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        io.sentry.SentryEnvelopeItem next = items.iterator().next();
        if (!io.sentry.SentryItemType.Session.equals(next.getHeader().getType())) {
            this.options.getLogger().log(io.sentry.SentryLevel.INFO, "Current envelope has a different envelope type %s", next.getHeader().getType());
            return;
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(next.getData()), io.sentry.cache.CacheStrategy.UTF_8));
            try {
                io.sentry.Session session = (io.sentry.Session) this.serializer.getValue().deserialize(bufferedReader, io.sentry.Session.class);
                if (session == null) {
                    this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Item of type %s returned null by the parser.", next.getHeader().getType());
                } else {
                    writeSessionToDisk(file, session);
                }
                bufferedReader.close();
            } catch (java.lang.Throwable th) {
                try {
                    bufferedReader.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Item failed to process.", th3);
        }
    }

    private void writeCrashMarkerFile() {
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(new java.io.File(this.options.getCacheDirPath(), CRASH_MARKER_FILE));
            try {
                fileOutputStream.write(io.sentry.DateUtils.getTimestamp(io.sentry.DateUtils.getCurrentDateTime()).getBytes(io.sentry.cache.CacheStrategy.UTF_8));
                fileOutputStream.flush();
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
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Error writing the crash marker file to the disk", th3);
        }
    }

    private void writeEnvelopeToDisk(java.io.File file, io.sentry.SentryEnvelope sentryEnvelope) {
        if (file.exists()) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                this.serializer.getValue().serialize(sentryEnvelope, fileOutputStream);
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
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, th3, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    private void writeSessionToDisk(java.io.File file, io.sentry.Session session) {
        if (file.exists()) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Overwriting session to offline storage: %s", session.getSessionId());
            if (!file.delete()) {
                this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(fileOutputStream, io.sentry.cache.CacheStrategy.UTF_8));
                try {
                    this.serializer.getValue().serialize(session, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.lang.Throwable th5) {
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, th5, "Error writing Session to offline storage: %s", session.getSessionId());
        }
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public void discard(io.sentry.SentryEnvelope sentryEnvelope) {
        io.sentry.util.Objects.requireNonNull(sentryEnvelope, "Envelope is required.");
        java.io.File envelopeFile = getEnvelopeFile(sentryEnvelope);
        if (!envelopeFile.exists()) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Envelope was not cached: %s", envelopeFile.getAbsolutePath());
            return;
        }
        this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Discarding envelope from cache: %s", envelopeFile.getAbsolutePath());
        if (envelopeFile.delete()) {
            return;
        }
        this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to delete envelope: %s", envelopeFile.getAbsolutePath());
    }

    public void flushPreviousSession() {
        this.previousSessionLatch.countDown();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<io.sentry.SentryEnvelope> iterator() {
        java.io.File[] fileArrAllEnvelopeFiles = allEnvelopeFiles();
        java.util.ArrayList arrayList = new java.util.ArrayList(fileArrAllEnvelopeFiles.length);
        for (java.io.File file : fileArrAllEnvelopeFiles) {
            try {
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
                try {
                    arrayList.add(this.serializer.getValue().deserializeEnvelope(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (java.lang.Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.FileNotFoundException unused) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (java.io.IOException e6) {
                this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e6);
            }
        }
        return arrayList.iterator();
    }

    public void store(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint) {
        io.sentry.util.Objects.requireNonNull(sentryEnvelope, "Envelope is required.");
        rotateCacheIfNeeded(allEnvelopeFiles());
        java.io.File currentSessionFile = getCurrentSessionFile(this.directory.getAbsolutePath());
        java.io.File previousSessionFile = getPreviousSessionFile(this.directory.getAbsolutePath());
        if (io.sentry.util.HintUtils.hasType(hint, io.sentry.hints.SessionEnd.class) && !currentSessionFile.delete()) {
            this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Current envelope doesn't exist.", new java.lang.Object[0]);
        }
        if (io.sentry.util.HintUtils.hasType(hint, io.sentry.hints.AbnormalExit.class)) {
            tryEndPreviousSession(hint);
        }
        if (io.sentry.util.HintUtils.hasType(hint, io.sentry.hints.SessionStart.class)) {
            if (currentSessionFile.exists()) {
                this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Current session is not ended, we'd need to end it.", new java.lang.Object[0]);
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(currentSessionFile), io.sentry.cache.CacheStrategy.UTF_8));
                    try {
                        io.sentry.Session session = (io.sentry.Session) this.serializer.getValue().deserialize(bufferedReader, io.sentry.Session.class);
                        if (session != null) {
                            writeSessionToDisk(previousSessionFile, session);
                        }
                        bufferedReader.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Error processing session.", th3);
                }
            }
            updateCurrentSession(currentSessionFile, sentryEnvelope);
            boolean zExists = new java.io.File(this.options.getCacheDirPath(), NATIVE_CRASH_MARKER_FILE).exists();
            if (!zExists) {
                java.io.File file = new java.io.File(this.options.getCacheDirPath(), CRASH_MARKER_FILE);
                if (file.exists()) {
                    this.options.getLogger().log(io.sentry.SentryLevel.INFO, "Crash marker file exists, crashedLastRun will return true.", new java.lang.Object[0]);
                    if (!file.delete()) {
                        this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            io.sentry.SentryCrashLastRunState.getInstance().setCrashedLastRun(zExists);
            flushPreviousSession();
        }
        java.io.File envelopeFile = getEnvelopeFile(sentryEnvelope);
        if (envelopeFile.exists()) {
            this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Not adding Envelope to offline storage because it already exists: %s", envelopeFile.getAbsolutePath());
            return;
        }
        this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Adding Envelope to offline storage: %s", envelopeFile.getAbsolutePath());
        writeEnvelopeToDisk(envelopeFile, sentryEnvelope);
        if (io.sentry.util.HintUtils.hasType(hint, io.sentry.UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class)) {
            writeCrashMarkerFile();
        }
    }

    public boolean waitPreviousSessionFlush() {
        try {
            return this.previousSessionLatch.await(this.options.getSessionFlushTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Timed out waiting for previous session to flush.", new java.lang.Object[0]);
            return false;
        }
    }
}
