package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/SubscriptionStatus;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class SubscriptionStatus {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20107h = {l0.Companion.serializer(), null, null, null, null, null, null};

    public static final SubscriptionStatus f20108i = new SubscriptionStatus(l0.f20795i, false, null, false, 0, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);

    public final l0 f20109a;

    public final boolean f20110b;

    public final String f20111c;

    public final boolean f20112d;

    public final String f20113e;

    public final String f20114f;
    public final long g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/SubscriptionStatus$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/SubscriptionStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return SubscriptionStatus$$serializer.INSTANCE;
        }
    }

    public SubscriptionStatus(int i3, l0 l0Var, boolean z6, String str, boolean z9, String str2, String str3, long j) {
        if (11 != (i3 & 11)) {
            AbstractC2686a0.l(i3, 11, SubscriptionStatus$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20109a = l0Var;
        this.f20110b = z6;
        if ((i3 & 4) == 0) {
            this.f20111c = null;
        } else {
            this.f20111c = str;
        }
        this.f20112d = z9;
        if ((i3 & 16) == 0) {
            this.f20113e = null;
        } else {
            this.f20113e = str2;
        }
        if ((i3 & 32) == 0) {
            this.f20114f = null;
        } else {
            this.f20114f = str3;
        }
        if ((i3 & 64) == 0) {
            this.g = System.currentTimeMillis();
        } else {
            this.g = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionStatus)) {
            return false;
        }
        SubscriptionStatus subscriptionStatus = (SubscriptionStatus) obj;
        return this.f20109a == subscriptionStatus.f20109a && this.f20110b == subscriptionStatus.f20110b && kotlin.jvm.internal.m.a(this.f20111c, subscriptionStatus.f20111c) && this.f20112d == subscriptionStatus.f20112d && kotlin.jvm.internal.m.a(this.f20113e, subscriptionStatus.f20113e) && kotlin.jvm.internal.m.a(this.f20114f, subscriptionStatus.f20114f) && this.g == subscriptionStatus.g;
    }

    public final int hashCode() {
        int iF = p121o0.p.f(this.f20109a.hashCode() * 31, 31, this.f20110b);
        String str = this.f20111c;
        int iF2 = p121o0.p.f((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20112d);
        String str2 = this.f20113e;
        int iHashCode = (iF2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20114f;
        return Long.hashCode(this.g) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionStatus(tier=");
        sb.append(this.f20109a);
        sb.append(", isActive=");
        sb.append(this.f20110b);
        sb.append(", expiresAt=");
        sb.append(this.f20111c);
        sb.append(", willRenew=");
        sb.append(this.f20112d);
        sb.append(", productIdentifier=");
        sb.append(this.f20113e);
        sb.append(", managementUrl=");
        sb.append(this.f20114f);
        sb.append(", cachedAt=");
        return Y6.f.g(this.g, ")", sb);
    }

    public SubscriptionStatus(l0 l0Var, boolean z6, String str, boolean z9, long j, int i3) {
        str = (i3 & 4) != 0 ? null : str;
        j = (i3 & 64) != 0 ? System.currentTimeMillis() : j;
        this.f20109a = l0Var;
        this.f20110b = z6;
        this.f20111c = str;
        this.f20112d = z9;
        this.f20113e = null;
        this.f20114f = null;
        this.g = j;
    }
}
