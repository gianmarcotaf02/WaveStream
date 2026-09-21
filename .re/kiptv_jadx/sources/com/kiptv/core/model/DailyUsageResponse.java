package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/DailyUsageResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class DailyUsageResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.DailyUsageResponse.Companion INSTANCE = new com.kiptv.core.model.DailyUsageResponse.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f19728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19729f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19730h;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/DailyUsageResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/DailyUsageResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.DailyUsageResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DailyUsageResponse(int i3, int i9, int i10, int i11, int i12, double d4, boolean z6, boolean z9, java.lang.String str) {
        if (127 != (i3 & 127)) {
            p153r8.AbstractC2686a0.l(i3, 127, com.kiptv.core.model.DailyUsageResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19724a = i9;
        this.f19725b = i10;
        this.f19726c = i11;
        this.f19727d = i12;
        this.f19728e = d4;
        this.f19729f = z6;
        this.g = z9;
        if ((i3 & 128) == 0) {
            this.f19730h = null;
        } else {
            this.f19730h = str;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.DailyUsageResponse)) {
            return false;
        }
        com.kiptv.core.model.DailyUsageResponse dailyUsageResponse = (com.kiptv.core.model.DailyUsageResponse) obj;
        return this.f19724a == dailyUsageResponse.f19724a && this.f19725b == dailyUsageResponse.f19725b && this.f19726c == dailyUsageResponse.f19726c && this.f19727d == dailyUsageResponse.f19727d && java.lang.Double.compare(this.f19728e, dailyUsageResponse.f19728e) == 0 && this.f19729f == dailyUsageResponse.f19729f && this.g == dailyUsageResponse.g && kotlin.jvm.internal.m.a(this.f19730h, dailyUsageResponse.f19730h);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(p121o0.p.f((java.lang.Double.hashCode(this.f19728e) + p121o0.p.d(this.f19727d, p121o0.p.d(this.f19726c, p121o0.p.d(this.f19725b, java.lang.Integer.hashCode(this.f19724a) * 31, 31), 31), 31)) * 31, 31, this.f19729f), 31, this.g);
        java.lang.String str = this.f19730h;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DailyUsageResponse(usedSeconds=");
        sb.append(this.f19724a);
        sb.append(", limitSeconds=");
        sb.append(this.f19725b);
        sb.append(", remainingSeconds=");
        sb.append(this.f19726c);
        sb.append(", sessionCount=");
        sb.append(this.f19727d);
        sb.append(", usagePercentage=");
        sb.append(this.f19728e);
        sb.append(", hasReachedLimit=");
        sb.append(this.f19729f);
        sb.append(", isPremium=");
        sb.append(this.g);
        sb.append(", lastActivity=");
        return Y6.f.m(sb, this.f19730h, ")");
    }
}
