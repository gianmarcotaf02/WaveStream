package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBEpisodeCredits;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBEpisodeCredits {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBEpisodeCredits.Companion INSTANCE = new com.kiptv.core.model.TMDBEpisodeCredits.Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20167c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f20168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20169b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBEpisodeCredits$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBEpisodeCredits;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBEpisodeCredits$$serializer.INSTANCE;
        }
    }

    static {
        com.kiptv.core.model.TMDBCastMember$$serializer tMDBCastMember$$serializer = com.kiptv.core.model.TMDBCastMember$$serializer.INSTANCE;
        f20167c = new kotlinx.serialization.KSerializer[]{new p153r8.C2691d(tMDBCastMember$$serializer, 0), new p153r8.C2691d(tMDBCastMember$$serializer, 0)};
    }

    public /* synthetic */ TMDBEpisodeCredits(java.util.List list, int i3, java.util.List list2) {
        if ((i3 & 1) == 0) {
            this.f20168a = null;
        } else {
            this.f20168a = list;
        }
        if ((i3 & 2) == 0) {
            this.f20169b = null;
        } else {
            this.f20169b = list2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBEpisodeCredits)) {
            return false;
        }
        com.kiptv.core.model.TMDBEpisodeCredits tMDBEpisodeCredits = (com.kiptv.core.model.TMDBEpisodeCredits) obj;
        return kotlin.jvm.internal.m.a(this.f20168a, tMDBEpisodeCredits.f20168a) && kotlin.jvm.internal.m.a(this.f20169b, tMDBEpisodeCredits.f20169b);
    }

    public final int hashCode() {
        java.util.List list = this.f20168a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.util.List list2 = this.f20169b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBEpisodeCredits(cast=" + this.f20168a + ", guestStars=" + this.f20169b + ")";
    }
}
