package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;

public final class NoOpClientReportRecorder implements IClientReportRecorder {
    @Override
    public SentryEnvelope attachReportToEnvelope(SentryEnvelope sentryEnvelope) {
        return sentryEnvelope;
    }

    @Override
    public void recordLostEnvelope(DiscardReason discardReason, SentryEnvelope sentryEnvelope) {
    }

    @Override
    public void recordLostEnvelopeItem(DiscardReason discardReason, SentryEnvelopeItem sentryEnvelopeItem) {
    }

    @Override
    public void recordLostEvent(DiscardReason discardReason, DataCategory dataCategory) {
    }

    @Override
    public void recordLostEvent(DiscardReason discardReason, DataCategory dataCategory, long j) {
    }
}
