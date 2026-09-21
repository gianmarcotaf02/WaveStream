package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class HostnameCache {
    private static io.sentry.HostnameCache INSTANCE;
    private final long cacheDuration;
    private final java.util.concurrent.ExecutorService executorService;
    private volatile long expirationTimestamp;
    private final java.util.concurrent.Callable<java.net.InetAddress> getLocalhost;
    private volatile java.lang.String hostname;
    private final java.util.concurrent.atomic.AtomicBoolean updateRunning;
    private static final long HOSTNAME_CACHE_DURATION = java.util.concurrent.TimeUnit.HOURS.toMillis(5);
    private static final long GET_HOSTNAME_TIMEOUT = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);

    public static final class HostnameCacheThreadFactory implements java.util.concurrent.ThreadFactory {
        private int cnt;

        private HostnameCacheThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SentryHostnameCache-");
            int i3 = this.cnt;
            this.cnt = i3 + 1;
            sb.append(i3);
            java.lang.Thread thread = new java.lang.Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private HostnameCache() {
        this(HOSTNAME_CACHE_DURATION);
    }

    public static io.sentry.HostnameCache getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new io.sentry.HostnameCache();
        }
        return INSTANCE;
    }

    private void handleCacheUpdateFailure() {
        this.expirationTimestamp = java.util.concurrent.TimeUnit.SECONDS.toMillis(1L) + java.lang.System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Void lambda$updateCache$1() {
        try {
            this.hostname = this.getLocalhost.call().getCanonicalHostName();
            this.expirationTimestamp = java.lang.System.currentTimeMillis() + this.cacheDuration;
            return null;
        } finally {
            this.updateRunning.set(false);
        }
    }

    private void updateCache() {
        try {
            this.executorService.submit(new io.sentry.p(16, this)).get(GET_HOSTNAME_TIMEOUT, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            handleCacheUpdateFailure();
        } catch (java.lang.RuntimeException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused2) {
            handleCacheUpdateFailure();
        }
    }

    public void close() {
        this.executorService.shutdown();
    }

    public java.lang.String getHostname() {
        if (this.expirationTimestamp < java.lang.System.currentTimeMillis() && this.updateRunning.compareAndSet(false, true)) {
            updateCache();
        }
        return this.hostname;
    }

    public boolean isClosed() {
        return this.executorService.isShutdown();
    }

    public HostnameCache(long j) {
        this(j, new io.sentry.d(0));
    }

    public HostnameCache(long j, java.util.concurrent.Callable<java.net.InetAddress> callable) {
        this.updateRunning = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.executorService = java.util.concurrent.Executors.newSingleThreadExecutor(new io.sentry.HostnameCache.HostnameCacheThreadFactory());
        this.cacheDuration = j;
        this.getLocalhost = (java.util.concurrent.Callable) io.sentry.util.Objects.requireNonNull(callable, "getLocalhost is required");
        updateCache();
    }
}
