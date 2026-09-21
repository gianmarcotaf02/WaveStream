package io.sentry;

public final class TracesSamplingDecision {
    private final Double profileSampleRate;
    private final Boolean profileSampled;
    private final Double sampleRand;
    private final Double sampleRate;
    private final Boolean sampled;

    public TracesSamplingDecision(Boolean bool) {
        this(bool, null);
    }

    public Double getProfileSampleRate() {
        return this.profileSampleRate;
    }

    public Boolean getProfileSampled() {
        return this.profileSampled;
    }

    public Double getSampleRand() {
        return this.sampleRand;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public Boolean getSampled() {
        return this.sampled;
    }

    public TracesSamplingDecision(Boolean bool, Double d4) {
        this(bool, d4, null, Boolean.FALSE, null);
    }

    public TracesSamplingDecision(Boolean bool, Double d4, Double d6) {
        this(bool, d4, d6, Boolean.FALSE, null);
    }

    public TracesSamplingDecision(Boolean bool, Double d4, Boolean bool2, Double d6) {
        this(bool, d4, null, bool2, d6);
    }

    public TracesSamplingDecision(Boolean bool, Double d4, Double d6, Boolean bool2, Double d9) {
        this.sampled = bool;
        this.sampleRate = d4;
        this.sampleRand = d6;
        this.profileSampled = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.profileSampleRate = d9;
    }
}
