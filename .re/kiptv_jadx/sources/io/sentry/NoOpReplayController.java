package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpReplayController implements io.sentry.ReplayController {
    private static final io.sentry.NoOpReplayController instance = new io.sentry.NoOpReplayController();

    private NoOpReplayController() {
    }

    public static io.sentry.NoOpReplayController getInstance() {
        return instance;
    }

    @Override // io.sentry.ReplayController
    public void captureReplay(java.lang.Boolean bool) {
    }

    @Override // io.sentry.ReplayController
    /* JADX INFO: renamed from: getBreadcrumbConverter */
    public io.sentry.ReplayBreadcrumbConverter getReplayBreadcrumbConverter() {
        return io.sentry.NoOpReplayBreadcrumbConverter.getInstance();
    }

    @Override // io.sentry.ReplayController
    public io.sentry.protocol.SentryId getReplayId() {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ReplayController
    public boolean isRecording() {
        return false;
    }

    @Override // io.sentry.ReplayController
    public void pause() {
    }

    @Override // io.sentry.ReplayController
    public void resume() {
    }

    @Override // io.sentry.ReplayController
    public void setBreadcrumbConverter(io.sentry.ReplayBreadcrumbConverter replayBreadcrumbConverter) {
    }

    @Override // io.sentry.ReplayController
    public void start() {
    }

    @Override // io.sentry.ReplayController
    public void stop() {
    }
}
