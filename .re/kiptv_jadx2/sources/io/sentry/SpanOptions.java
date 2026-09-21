package io.sentry;

public class SpanOptions {
    private SentryDate startTimestamp = null;
    private ScopeBindingMode scopeBindingMode = ScopeBindingMode.AUTO;
    private boolean trimStart = false;
    private boolean trimEnd = false;
    private boolean isIdle = false;
    protected String origin = SpanContext.DEFAULT_ORIGIN;

    public String getOrigin() {
        return this.origin;
    }

    public ScopeBindingMode getScopeBindingMode() {
        return this.scopeBindingMode;
    }

    public SentryDate getStartTimestamp() {
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

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setScopeBindingMode(ScopeBindingMode scopeBindingMode) {
        this.scopeBindingMode = scopeBindingMode;
    }

    public void setStartTimestamp(SentryDate sentryDate) {
        this.startTimestamp = sentryDate;
    }

    public void setTrimEnd(boolean z6) {
        this.trimEnd = z6;
    }

    public void setTrimStart(boolean z6) {
        this.trimStart = z6;
    }
}
