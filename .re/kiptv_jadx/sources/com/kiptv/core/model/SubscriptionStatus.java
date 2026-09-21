package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/SubscriptionStatus;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class SubscriptionStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.SubscriptionStatus.Companion INSTANCE = new com.kiptv.core.model.SubscriptionStatus.Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20107h = {com.kiptv.core.model.l0.Companion.serializer(), null, null, null, null, null, null};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.kiptv.core.model.SubscriptionStatus f20108i = new com.kiptv.core.model.SubscriptionStatus(com.kiptv.core.model.l0.f20795i, false, null, false, 0, androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.l0 f20109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20114f;
    public final long g;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/SubscriptionStatus$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/SubscriptionStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.SubscriptionStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubscriptionStatus(int i3, com.kiptv.core.model.l0 l0Var, boolean z6, java.lang.String str, boolean z9, java.lang.String str2, java.lang.String str3, long j) {
        if (11 != (i3 & 11)) {
            p153r8.AbstractC2686a0.l(i3, 11, com.kiptv.core.model.SubscriptionStatus$$serializer.INSTANCE.getDescriptor());
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
            this.g = java.lang.System.currentTimeMillis();
        } else {
            this.g = j;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.SubscriptionStatus)) {
            return false;
        }
        com.kiptv.core.model.SubscriptionStatus subscriptionStatus = (com.kiptv.core.model.SubscriptionStatus) obj;
        return this.f20109a == subscriptionStatus.f20109a && this.f20110b == subscriptionStatus.f20110b && kotlin.jvm.internal.m.a(this.f20111c, subscriptionStatus.f20111c) && this.f20112d == subscriptionStatus.f20112d && kotlin.jvm.internal.m.a(this.f20113e, subscriptionStatus.f20113e) && kotlin.jvm.internal.m.a(this.f20114f, subscriptionStatus.f20114f) && this.g == subscriptionStatus.g;
    }

    public final int hashCode() {
        int iF = p121o0.p.f(this.f20109a.hashCode() * 31, 31, this.f20110b);
        java.lang.String str = this.f20111c;
        int iF2 = p121o0.p.f((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20112d);
        java.lang.String str2 = this.f20113e;
        int iHashCode = (iF2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20114f;
        return java.lang.Long.hashCode(this.g) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscriptionStatus(tier=");
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

    public SubscriptionStatus(com.kiptv.core.model.l0 l0Var, boolean z6, java.lang.String str, boolean z9, long j, int i3) {
        str = (i3 & 4) != 0 ? null : str;
        j = (i3 & 64) != 0 ? java.lang.System.currentTimeMillis() : j;
        this.f20109a = l0Var;
        this.f20110b = z6;
        this.f20111c = str;
        this.f20112d = z9;
        this.f20113e = null;
        this.f20114f = null;
        this.g = j;
    }
}
