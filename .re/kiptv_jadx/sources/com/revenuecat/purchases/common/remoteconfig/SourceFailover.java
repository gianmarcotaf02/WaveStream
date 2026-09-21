package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/SourceFailover;", "", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle$Purpose;", "purpose", "", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSource;", "sources", "LB6/d;", "random", "", "initialToken", "<init>", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle$Purpose;Ljava/util/List;LB6/d;I)V", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle;", "handle", "Lh6/A;", "reportUnhealthy", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle;)V", "restart", "()V", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle$Purpose;", "Lcom/revenuecat/purchases/common/remoteconfig/WeightedSourceSelector;", "selector", "Lcom/revenuecat/purchases/common/remoteconfig/WeightedSourceSelector;", "token", "I", "getCurrentToken", "()I", "currentToken", "getCurrent", "()Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSourceHandle;", io.sentry.protocol.SentryThread.JsonKeys.CURRENT, "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class SourceFailover {
    private final com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle.Purpose purpose;
    private final com.revenuecat.purchases.common.remoteconfig.WeightedSourceSelector<com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource> selector;
    private int token;

    public SourceFailover(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle.Purpose purpose, java.util.List<com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource> sources, B6.d random, int i3) {
        kotlin.jvm.internal.m.e(purpose, "purpose");
        kotlin.jvm.internal.m.e(sources, "sources");
        kotlin.jvm.internal.m.e(random, "random");
        this.purpose = purpose;
        this.selector = new com.revenuecat.purchases.common.remoteconfig.WeightedSourceSelector<>(sources, random);
        this.token = i3;
    }

    public final com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle getCurrent() {
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource remoteConfigSource = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource) this.selector.getCurrent();
        if (remoteConfigSource != null) {
            return new com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle(this.purpose, remoteConfigSource, this.token);
        }
        return null;
    }

    /* JADX INFO: renamed from: getCurrentToken, reason: from getter */
    public final int getToken() {
        return this.token;
    }

    public final void reportUnhealthy(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle handle) {
        kotlin.jvm.internal.m.e(handle, "handle");
        if (handle.getToken() != this.token) {
            return;
        }
        this.selector.advance();
        this.token++;
    }

    public final void restart() {
        this.selector.reset();
        this.token++;
    }

    public /* synthetic */ SourceFailover(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSourceHandle.Purpose purpose, java.util.List list, B6.d dVar, int i3, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(purpose, list, dVar, (i9 & 8) != 0 ? 0 : i3);
    }
}
