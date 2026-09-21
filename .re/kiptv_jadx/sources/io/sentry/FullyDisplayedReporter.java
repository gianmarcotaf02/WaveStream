package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class FullyDisplayedReporter {
    private static final io.sentry.FullyDisplayedReporter instance = new io.sentry.FullyDisplayedReporter();
    private final java.util.List<io.sentry.FullyDisplayedReporter.FullyDisplayedReporterListener> listeners = new java.util.concurrent.CopyOnWriteArrayList();

    public interface FullyDisplayedReporterListener {
        void onFullyDrawn();
    }

    private FullyDisplayedReporter() {
    }

    public static io.sentry.FullyDisplayedReporter getInstance() {
        return instance;
    }

    public void registerFullyDrawnListener(io.sentry.FullyDisplayedReporter.FullyDisplayedReporterListener fullyDisplayedReporterListener) {
        this.listeners.add(fullyDisplayedReporterListener);
    }

    public void reportFullyDrawn() {
        java.util.Iterator<io.sentry.FullyDisplayedReporter.FullyDisplayedReporterListener> it = this.listeners.iterator();
        this.listeners.clear();
        while (it.hasNext()) {
            it.next().onFullyDrawn();
        }
    }
}
