package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/ktor/client/plugins/sse/SSEConfig;", "", "<init>", "()V", "Lh6/A;", "showCommentEvents", "showRetryEvents", "", "Z", "getShowCommentEvents$ktor_client_core", "()Z", "setShowCommentEvents$ktor_client_core", "(Z)V", "getShowRetryEvents$ktor_client_core", "setShowRetryEvents$ktor_client_core", "LP7/b;", "reconnectionTime", "J", "getReconnectionTime-UwyO8pc", "()J", "setReconnectionTime-LRDsOJo", "(J)V", "", "maxReconnectionAttempts", "I", "getMaxReconnectionAttempts", "()I", "setMaxReconnectionAttempts", "(I)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SSEConfig {
    private int maxReconnectionAttempts;
    private long reconnectionTime;
    private boolean showCommentEvents;
    private boolean showRetryEvents;

    public SSEConfig() {
        P7.a aVar = P7.b.f8168i;
        this.reconnectionTime = E8.l.N(3000, P7.d.MILLISECONDS);
    }

    public final int getMaxReconnectionAttempts() {
        return this.maxReconnectionAttempts;
    }

    /* JADX INFO: renamed from: getReconnectionTime-UwyO8pc, reason: not valid java name and from getter */
    public final long getReconnectionTime() {
        return this.reconnectionTime;
    }

    /* JADX INFO: renamed from: getShowCommentEvents$ktor_client_core, reason: from getter */
    public final boolean getShowCommentEvents() {
        return this.showCommentEvents;
    }

    /* JADX INFO: renamed from: getShowRetryEvents$ktor_client_core, reason: from getter */
    public final boolean getShowRetryEvents() {
        return this.showRetryEvents;
    }

    public final void setMaxReconnectionAttempts(int i3) {
        this.maxReconnectionAttempts = i3;
    }

    /* JADX INFO: renamed from: setReconnectionTime-LRDsOJo, reason: not valid java name */
    public final void m441setReconnectionTimeLRDsOJo(long j) {
        this.reconnectionTime = j;
    }

    public final void setShowCommentEvents$ktor_client_core(boolean z6) {
        this.showCommentEvents = z6;
    }

    public final void setShowRetryEvents$ktor_client_core(boolean z6) {
        this.showRetryEvents = z6;
    }

    public final void showCommentEvents() {
        this.showCommentEvents = true;
    }

    public final void showRetryEvents() {
        this.showRetryEvents = true;
    }
}
