package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class TracesSamplingDecision {
    private final java.lang.Double profileSampleRate;
    private final java.lang.Boolean profileSampled;
    private final java.lang.Double sampleRand;
    private final java.lang.Double sampleRate;
    private final java.lang.Boolean sampled;

    public TracesSamplingDecision(java.lang.Boolean bool) {
        this(bool, null);
    }

    public java.lang.Double getProfileSampleRate() {
        return this.profileSampleRate;
    }

    public java.lang.Boolean getProfileSampled() {
        return this.profileSampled;
    }

    public java.lang.Double getSampleRand() {
        return this.sampleRand;
    }

    public java.lang.Double getSampleRate() {
        return this.sampleRate;
    }

    public java.lang.Boolean getSampled() {
        return this.sampled;
    }

    public TracesSamplingDecision(java.lang.Boolean bool, java.lang.Double d4) {
        this(bool, d4, null, java.lang.Boolean.FALSE, null);
    }

    public TracesSamplingDecision(java.lang.Boolean bool, java.lang.Double d4, java.lang.Double d6) {
        this(bool, d4, d6, java.lang.Boolean.FALSE, null);
    }

    public TracesSamplingDecision(java.lang.Boolean bool, java.lang.Double d4, java.lang.Boolean bool2, java.lang.Double d6) {
        this(bool, d4, null, bool2, d6);
    }

    public TracesSamplingDecision(java.lang.Boolean bool, java.lang.Double d4, java.lang.Double d6, java.lang.Boolean bool2, java.lang.Double d9) {
        this.sampled = bool;
        this.sampleRate = d4;
        this.sampleRand = d6;
        this.profileSampled = java.lang.Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.profileSampleRate = d9;
    }
}
