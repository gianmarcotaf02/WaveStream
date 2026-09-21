package com.revenuecat.purchases.common.remoteconfig;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfigSource;", "Lcom/revenuecat/purchases/common/remoteconfig/WeightedSource;", Request.JsonKeys.URL, "", SentryThread.JsonKeys.PRIORITY, "", "weight", "(Ljava/lang/String;II)V", "getPriority", "()I", "getUrl", "()Ljava/lang/String;", "getWeight", "component1", "component2", "component3", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigSource implements WeightedSource {
    private final int priority;
    private final String url;
    private final int weight;

    public RemoteConfigSource(String url, int i3, int i9) {
        m.e(url, "url");
        this.url = url;
        this.priority = i3;
        this.weight = i9;
    }

    public static RemoteConfigSource copy$default(RemoteConfigSource remoteConfigSource, String str, int i3, int i9, int i10, Object obj) {
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

    public final String getUrl() {
        return this.url;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final RemoteConfigSource copy(String url, int priority, int weight) {
        m.e(url, "url");
        return new RemoteConfigSource(url, priority, weight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfigSource)) {
            return false;
        }
        RemoteConfigSource remoteConfigSource = (RemoteConfigSource) other;
        return m.a(this.url, remoteConfigSource.url) && this.priority == remoteConfigSource.priority && this.weight == remoteConfigSource.weight;
    }

    @Override
    public int getPriority() {
        return this.priority;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Integer.hashCode(this.weight) + p.d(this.priority, this.url.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigSource(url=");
        sb.append(this.url);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", weight=");
        return f.j(sb, this.weight, ')');
    }
}
