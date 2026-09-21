package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OfflineEpisodeInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class OfflineEpisodeInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.OfflineEpisodeInfo.Companion INSTANCE = new com.kiptv.core.model.OfflineEpisodeInfo.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f19974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19975f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f19976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f19977i;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OfflineEpisodeInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OfflineEpisodeInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.OfflineEpisodeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OfflineEpisodeInfo(int i3, java.lang.String str, java.lang.String str2, int i9, int i10, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, java.lang.String str6) {
        if (287 != (i3 & 287)) {
            p153r8.AbstractC2686a0.l(i3, 287, com.kiptv.core.model.OfflineEpisodeInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19970a = str;
        this.f19971b = str2;
        this.f19972c = i9;
        this.f19973d = i10;
        this.f19974e = str3;
        if ((i3 & 32) == 0) {
            this.f19975f = null;
        } else {
            this.f19975f = str4;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i3 & 128) == 0) {
            this.f19976h = null;
        } else {
            this.f19976h = num;
        }
        this.f19977i = str6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.OfflineEpisodeInfo)) {
            return false;
        }
        com.kiptv.core.model.OfflineEpisodeInfo offlineEpisodeInfo = (com.kiptv.core.model.OfflineEpisodeInfo) obj;
        return kotlin.jvm.internal.m.a(this.f19970a, offlineEpisodeInfo.f19970a) && kotlin.jvm.internal.m.a(this.f19971b, offlineEpisodeInfo.f19971b) && this.f19972c == offlineEpisodeInfo.f19972c && this.f19973d == offlineEpisodeInfo.f19973d && kotlin.jvm.internal.m.a(this.f19974e, offlineEpisodeInfo.f19974e) && kotlin.jvm.internal.m.a(this.f19975f, offlineEpisodeInfo.f19975f) && kotlin.jvm.internal.m.a(this.g, offlineEpisodeInfo.g) && kotlin.jvm.internal.m.a(this.f19976h, offlineEpisodeInfo.f19976h) && kotlin.jvm.internal.m.a(this.f19977i, offlineEpisodeInfo.f19977i);
    }

    public final int hashCode() {
        int iA = B2.a.a(p121o0.p.d(this.f19973d, p121o0.p.d(this.f19972c, B2.a.a(this.f19970a.hashCode() * 31, 31, this.f19971b), 31), 31), 31, this.f19974e);
        java.lang.String str = this.f19975f;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f19976h;
        return this.f19977i.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OfflineEpisodeInfo(id=");
        sb.append(this.f19970a);
        sb.append(", episodeId=");
        sb.append(this.f19971b);
        sb.append(", seasonNumber=");
        sb.append(this.f19972c);
        sb.append(", episodeNumber=");
        sb.append(this.f19973d);
        sb.append(", title=");
        sb.append(this.f19974e);
        sb.append(", overview=");
        sb.append(this.f19975f);
        sb.append(", stillImageURL=");
        sb.append(this.g);
        sb.append(", runtimeMinutes=");
        sb.append(this.f19976h);
        sb.append(", containerExtension=");
        return Y6.f.m(sb, this.f19977i, ")");
    }
}
