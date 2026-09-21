package com.kiptv.core.local.cache;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/local/cache/MovieCollectionStore$Summary", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MovieCollectionStore$Summary {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.local.cache.MovieCollectionStore$Summary.Companion INSTANCE = new com.kiptv.core.local.cache.MovieCollectionStore$Summary.Companion();
    public static final kotlinx.serialization.KSerializer[] g = {null, null, null, null, null, new p153r8.C2691d(com.kiptv.core.local.cache.MovieCollectionStore$Part$$serializer.INSTANCE, 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f19615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f19616f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.local.cache.MovieCollectionStore$Summary$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MovieCollectionStore$Summary(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.local.cache.MovieCollectionStore$Summary$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19611a = i9;
        this.f19612b = str;
        if ((i3 & 4) == 0) {
            this.f19613c = null;
        } else {
            this.f19613c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f19614d = null;
        } else {
            this.f19614d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f19615e = null;
        } else {
            this.f19615e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f19616f = p078i6.w.f23205h;
        } else {
            this.f19616f = list;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.local.cache.MovieCollectionStore$Summary)) {
            return false;
        }
        com.kiptv.core.local.cache.MovieCollectionStore$Summary movieCollectionStore$Summary = (com.kiptv.core.local.cache.MovieCollectionStore$Summary) obj;
        return this.f19611a == movieCollectionStore$Summary.f19611a && kotlin.jvm.internal.m.a(this.f19612b, movieCollectionStore$Summary.f19612b) && kotlin.jvm.internal.m.a(this.f19613c, movieCollectionStore$Summary.f19613c) && kotlin.jvm.internal.m.a(this.f19614d, movieCollectionStore$Summary.f19614d) && kotlin.jvm.internal.m.a(this.f19615e, movieCollectionStore$Summary.f19615e) && kotlin.jvm.internal.m.a(this.f19616f, movieCollectionStore$Summary.f19616f);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f19611a) * 31, 31, this.f19612b);
        java.lang.String str = this.f19613c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f19614d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f19615e;
        return this.f19616f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "Summary(id=" + this.f19611a + ", name=" + this.f19612b + ", posterPath=" + this.f19613c + ", backdropPath=" + this.f19614d + ", overview=" + this.f19615e + ", parts=" + this.f19616f + ")";
    }

    public MovieCollectionStore$Summary(int i3, java.lang.String name, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List parts) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(parts, "parts");
        this.f19611a = i3;
        this.f19612b = name;
        this.f19613c = str;
        this.f19614d = str2;
        this.f19615e = str3;
        this.f19616f = parts;
    }
}
