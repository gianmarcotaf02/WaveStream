package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ReplayController {
    void captureReplay(java.lang.Boolean bool);

    /* JADX INFO: renamed from: getBreadcrumbConverter */
    io.sentry.ReplayBreadcrumbConverter getReplayBreadcrumbConverter();

    io.sentry.protocol.SentryId getReplayId();

    boolean isRecording();

    void pause();

    void resume();

    void setBreadcrumbConverter(io.sentry.ReplayBreadcrumbConverter replayBreadcrumbConverter);

    void start();

    void stop();
}
