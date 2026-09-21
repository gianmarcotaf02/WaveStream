package io.sentry.clientreport;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpClientReportRecorder implements io.sentry.clientreport.IClientReportRecorder {
    @Override // io.sentry.clientreport.IClientReportRecorder
    public io.sentry.SentryEnvelope attachReportToEnvelope(io.sentry.SentryEnvelope sentryEnvelope) {
        return sentryEnvelope;
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEnvelope(io.sentry.clientreport.DiscardReason discardReason, io.sentry.SentryEnvelope sentryEnvelope) {
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEnvelopeItem(io.sentry.clientreport.DiscardReason discardReason, io.sentry.SentryEnvelopeItem sentryEnvelopeItem) {
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEvent(io.sentry.clientreport.DiscardReason discardReason, io.sentry.DataCategory dataCategory) {
    }

    @Override // io.sentry.clientreport.IClientReportRecorder
    public void recordLostEvent(io.sentry.clientreport.DiscardReason discardReason, io.sentry.DataCategory dataCategory, long j) {
    }
}
