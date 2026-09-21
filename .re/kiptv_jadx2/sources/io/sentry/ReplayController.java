package io.sentry;

import io.sentry.protocol.SentryId;

public interface ReplayController {
    void captureReplay(Boolean bool);

    ReplayBreadcrumbConverter getReplayBreadcrumbConverter();

    SentryId getReplayId();

    boolean isRecording();

    void pause();

    void resume();

    void setBreadcrumbConverter(ReplayBreadcrumbConverter replayBreadcrumbConverter);

    void start();

    void stop();
}
