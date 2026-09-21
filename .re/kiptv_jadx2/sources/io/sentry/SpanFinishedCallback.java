package io.sentry;

public interface SpanFinishedCallback {
    void execute(Span span);
}
