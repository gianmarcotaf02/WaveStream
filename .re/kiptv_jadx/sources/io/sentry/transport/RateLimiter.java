package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class RateLimiter implements java.io.Closeable, java.lang.AutoCloseable {
    private static final int HTTP_RETRY_AFTER_DEFAULT_DELAY_MILLIS = 60000;
    private final io.sentry.transport.ICurrentDateProvider currentDateProvider;
    private final io.sentry.SentryOptions options;
    private final java.util.List<io.sentry.transport.RateLimiter.IRateLimitObserver> rateLimitObservers;
    private final java.util.Map<io.sentry.DataCategory, java.util.Date> sentryRetryAfterLimit;
    private java.util.Timer timer;
    private final io.sentry.util.AutoClosableReentrantLock timerLock;

    public interface IRateLimitObserver {
        void onRateLimitChanged(io.sentry.transport.RateLimiter rateLimiter);
    }

    public RateLimiter(io.sentry.transport.ICurrentDateProvider iCurrentDateProvider, io.sentry.SentryOptions sentryOptions) {
        this.sentryRetryAfterLimit = new java.util.concurrent.ConcurrentHashMap();
        this.rateLimitObservers = new java.util.concurrent.CopyOnWriteArrayList();
        this.timer = null;
        this.timerLock = new io.sentry.util.AutoClosableReentrantLock();
        this.currentDateProvider = iCurrentDateProvider;
        this.options = sentryOptions;
    }

    private void applyRetryAfterOnlyIfLonger(io.sentry.DataCategory dataCategory, java.util.Date date) {
        java.util.Date date2 = this.sentryRetryAfterLimit.get(dataCategory);
        if (date2 == null || date.after(date2)) {
            this.sentryRetryAfterLimit.put(dataCategory, date);
            notifyRateLimitObservers();
            io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
            try {
                if (this.timer == null) {
                    this.timer = new java.util.Timer(true);
                }
                this.timer.schedule(new java.util.TimerTask() { // from class: io.sentry.transport.RateLimiter.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        io.sentry.transport.RateLimiter.this.notifyRateLimitObservers();
                    }
                }, date);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
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
    }

    private io.sentry.DataCategory getCategoryFromItemType(java.lang.String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return io.sentry.DataCategory.Attachment;
            case "replay_video":
                return io.sentry.DataCategory.Replay;
            case "profile":
                return io.sentry.DataCategory.Profile;
            case "event":
                return io.sentry.DataCategory.Error;
            case "check_in":
                return io.sentry.DataCategory.Monitor;
            case "session":
                return io.sentry.DataCategory.Session;
            case "transaction":
                return io.sentry.DataCategory.Transaction;
            default:
                return io.sentry.DataCategory.Unknown;
        }
    }

    private boolean isRetryAfter(java.lang.String str) {
        return isActiveForCategory(getCategoryFromItemType(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$markHintWhenSendingFailed$2(io.sentry.hints.DiskFlushNotification diskFlushNotification) {
        diskFlushNotification.markFlushed();
        this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Disk flush envelope fired due to rate limit", new java.lang.Object[0]);
    }

    private void markHintWhenSendingFailed(io.sentry.Hint hint, boolean z6) {
        io.sentry.util.HintUtils.runIfHasType(hint, io.sentry.hints.SubmissionResult.class, new io.sentry.transport.e(3));
        io.sentry.util.HintUtils.runIfHasType(hint, io.sentry.hints.Retryable.class, new io.sentry.h(z6, 4));
        io.sentry.util.HintUtils.runIfHasType(hint, io.sentry.hints.DiskFlushNotification.class, new io.sentry.transport.b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRateLimitObservers() {
        java.util.Iterator<io.sentry.transport.RateLimiter.IRateLimitObserver> it = this.rateLimitObservers.iterator();
        while (it.hasNext()) {
            it.next().onRateLimitChanged(this);
        }
    }

    private long parseRetryAfterOrDefault(java.lang.String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (java.lang.Double.parseDouble(str) * 1000.0d);
        } catch (java.lang.NumberFormatException unused) {
            return 60000L;
        }
    }

    public void addRateLimitObserver(io.sentry.transport.RateLimiter.IRateLimitObserver iRateLimitObserver) {
        this.rateLimitObservers.add(iRateLimitObserver);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            java.util.Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            this.rateLimitObservers.clear();
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

    public io.sentry.SentryEnvelope filter(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint) {
        java.util.ArrayList arrayList = null;
        for (io.sentry.SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            if (isRetryAfter(sentryEnvelopeItem.getHeader().getType().getItemType())) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(sentryEnvelopeItem);
                this.options.getClientReportRecorder().recordLostEnvelopeItem(io.sentry.clientreport.DiscardReason.RATELIMIT_BACKOFF, sentryEnvelopeItem);
            }
        }
        if (arrayList == null) {
            return sentryEnvelope;
        }
        this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "%d envelope items will be dropped due rate limiting.", java.lang.Integer.valueOf(arrayList.size()));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (io.sentry.SentryEnvelopeItem sentryEnvelopeItem2 : sentryEnvelope.getItems()) {
            if (!arrayList.contains(sentryEnvelopeItem2)) {
                arrayList2.add(sentryEnvelopeItem2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new io.sentry.SentryEnvelope(sentryEnvelope.getHeader(), arrayList2);
        }
        this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Envelope discarded due all items rate limited.", new java.lang.Object[0]);
        markHintWhenSendingFailed(hint, false);
        return null;
    }

    public boolean isActiveForCategory(io.sentry.DataCategory dataCategory) {
        java.util.Date date;
        java.util.Date date2 = new java.util.Date(this.currentDateProvider.getCurrentTimeMillis());
        java.util.Date date3 = this.sentryRetryAfterLimit.get(io.sentry.DataCategory.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (io.sentry.DataCategory.Unknown.equals(dataCategory) || (date = this.sentryRetryAfterLimit.get(dataCategory)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean isAnyRateLimitActive() {
        java.util.Date date = new java.util.Date(this.currentDateProvider.getCurrentTimeMillis());
        java.util.Iterator<io.sentry.DataCategory> it = this.sentryRetryAfterLimit.keySet().iterator();
        while (it.hasNext()) {
            java.util.Date date2 = this.sentryRetryAfterLimit.get(it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public void removeRateLimitObserver(io.sentry.transport.RateLimiter.IRateLimitObserver iRateLimitObserver) {
        this.rateLimitObservers.remove(iRateLimitObserver);
    }

    public void updateRetryAfterLimits(java.lang.String str, java.lang.String str2, int i3) {
        if (str == null) {
            if (i3 == 429) {
                applyRetryAfterOnlyIfLonger(io.sentry.DataCategory.All, new java.util.Date(this.currentDateProvider.getCurrentTimeMillis() + parseRetryAfterOrDefault(str2)));
                return;
            }
            return;
        }
        for (java.lang.String str3 : str.split(",", -1)) {
            java.lang.String[] strArrSplit = str3.replace(io.ktor.sse.ServerSentEventKt.SPACE, "").split(":", -1);
            if (strArrSplit.length > 0) {
                long retryAfterOrDefault = parseRetryAfterOrDefault(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    java.lang.String str4 = strArrSplit[1];
                    java.util.Date date = new java.util.Date(this.currentDateProvider.getCurrentTimeMillis() + retryAfterOrDefault);
                    if (str4 == null || str4.isEmpty()) {
                        applyRetryAfterOnlyIfLonger(io.sentry.DataCategory.All, date);
                    } else {
                        for (java.lang.String str5 : str4.split(";", -1)) {
                            io.sentry.DataCategory dataCategoryValueOf = io.sentry.DataCategory.Unknown;
                            try {
                                java.lang.String strCamelCase = io.sentry.util.StringUtils.camelCase(str5);
                                if (strCamelCase != null) {
                                    dataCategoryValueOf = io.sentry.DataCategory.valueOf(strCamelCase);
                                } else {
                                    this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (java.lang.IllegalArgumentException e6) {
                                this.options.getLogger().log(io.sentry.SentryLevel.INFO, e6, "Unknown category: %s", str5);
                            }
                            if (!io.sentry.DataCategory.Unknown.equals(dataCategoryValueOf)) {
                                applyRetryAfterOnlyIfLonger(dataCategoryValueOf, date);
                            }
                        }
                    }
                }
            }
        }
    }

    public RateLimiter(io.sentry.SentryOptions sentryOptions) {
        this(io.sentry.transport.CurrentDateProvider.getInstance(), sentryOptions);
    }
}
