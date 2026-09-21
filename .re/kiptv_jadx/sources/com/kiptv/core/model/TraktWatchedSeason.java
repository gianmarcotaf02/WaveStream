package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktWatchedSeason;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktWatchedSeason {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktWatchedSeason.Companion INSTANCE = new com.kiptv.core.model.TraktWatchedSeason.Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20548c = {null, new p153r8.C2691d(com.kiptv.core.model.TraktWatchedEpisode$$serializer.INSTANCE, 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20550b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktWatchedSeason$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktWatchedSeason;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktWatchedSeason$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktWatchedSeason(int i3, int i9, java.util.List list) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.TraktWatchedSeason$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20549a = i9;
        if ((i3 & 2) == 0) {
            this.f20550b = null;
        } else {
            this.f20550b = list;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktWatchedSeason)) {
            return false;
        }
        com.kiptv.core.model.TraktWatchedSeason traktWatchedSeason = (com.kiptv.core.model.TraktWatchedSeason) obj;
        return this.f20549a == traktWatchedSeason.f20549a && kotlin.jvm.internal.m.a(this.f20550b, traktWatchedSeason.f20550b);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f20549a) * 31;
        java.util.List list = this.f20550b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final java.lang.String toString() {
        return "TraktWatchedSeason(number=" + this.f20549a + ", episodes=" + this.f20550b + ")";
    }

    public TraktWatchedSeason(int i3, java.util.ArrayList arrayList) {
        this.f20549a = i3;
        this.f20550b = arrayList;
    }
}
