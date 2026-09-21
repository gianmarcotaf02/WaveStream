package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSource;", "Lcom/revenuecat/purchases/common/remoteconfig/WeightedSource;", io.sentry.protocol.Request.JsonKeys.URL, "", io.sentry.protocol.SentryThread.JsonKeys.PRIORITY, "", "weight", "(Ljava/lang/String;II)V", "getPriority", "()I", "getUrl", "()Ljava/lang/String;", "getWeight", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class RemoteConfigSource implements com.revenuecat.purchases.common.remoteconfig.WeightedSource {
    private final int priority;
    private final java.lang.String url;
    private final int weight;

    public RemoteConfigSource(java.lang.String url, int i3, int i9) {
        kotlin.jvm.internal.m.e(url, "url");
        this.url = url;
        this.priority = i3;
        this.weight = i9;
    }

    public static /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource copy$default(com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource remoteConfigSource, java.lang.String str, int i3, int i9, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            str = remoteConfigSource.url;
        }
        if ((i10 & 2) != 0) {
            i3 = remoteConfigSource.priority;
        }
        if ((i10 & 4) != 0) {
            i9 = remoteConfigSource.weight;
        }
        return remoteConfigSource.copy(str, i3, i9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    public final com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource copy(java.lang.String url, int priority, int weight) {
        kotlin.jvm.internal.m.e(url, "url");
        return new com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource(url, priority, weight);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource)) {
            return false;
        }
        com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource remoteConfigSource = (com.revenuecat.purchases.common.remoteconfig.RemoteConfigSource) other;
        return kotlin.jvm.internal.m.a(this.url, remoteConfigSource.url) && this.priority == remoteConfigSource.priority && this.weight == remoteConfigSource.weight;
    }

    @Override // com.revenuecat.purchases.common.remoteconfig.WeightedSource
    public int getPriority() {
        return this.priority;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    @Override // com.revenuecat.purchases.common.remoteconfig.WeightedSource
    public int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.weight) + p121o0.p.d(this.priority, this.url.hashCode() * 31, 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoteConfigSource(url=");
        sb.append(this.url);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", weight=");
        return Y6.f.j(sb, this.weight, ')');
    }
}
