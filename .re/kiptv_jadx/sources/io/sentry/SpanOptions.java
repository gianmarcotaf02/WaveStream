package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public class SpanOptions {
    private io.sentry.SentryDate startTimestamp = null;
    private io.sentry.ScopeBindingMode scopeBindingMode = io.sentry.ScopeBindingMode.AUTO;
    private boolean trimStart = false;
    private boolean trimEnd = false;
    private boolean isIdle = false;
    protected java.lang.String origin = io.sentry.SpanContext.DEFAULT_ORIGIN;

    public java.lang.String getOrigin() {
        return this.origin;
    }

    public io.sentry.ScopeBindingMode getScopeBindingMode() {
        return this.scopeBindingMode;
    }

    public io.sentry.SentryDate getStartTimestamp() {
        return this.startTimestamp;
    }

    public boolean isIdle() {
        return this.isIdle;
    }

    public boolean isTrimEnd() {
        return this.trimEnd;
    }

    public boolean isTrimStart() {
        return this.trimStart;
    }

    public void setIdle(boolean z6) {
        this.isIdle = z6;
    }

    public void setOrigin(java.lang.String str) {
        this.origin = str;
    }

    public void setScopeBindingMode(io.sentry.ScopeBindingMode scopeBindingMode) {
        this.scopeBindingMode = scopeBindingMode;
    }

    public void setStartTimestamp(io.sentry.SentryDate sentryDate) {
        this.startTimestamp = sentryDate;
    }

    public void setTrimEnd(boolean z6) {
        this.trimEnd = z6;
    }

    public void setTrimStart(boolean z6) {
        this.trimStart = z6;
    }
}
