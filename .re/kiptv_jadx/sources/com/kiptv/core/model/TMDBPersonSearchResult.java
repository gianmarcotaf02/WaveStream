package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonSearchResult;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBPersonSearchResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBPersonSearchResult.Companion INSTANCE = new com.kiptv.core.model.TMDBPersonSearchResult.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Double f20270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f20271f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonSearchResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBPersonSearchResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBPersonSearchResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBPersonSearchResult(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Double d4, java.lang.Boolean bool) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBPersonSearchResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20266a = i9;
        this.f20267b = str;
        if ((i3 & 4) == 0) {
            this.f20268c = null;
        } else {
            this.f20268c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20269d = null;
        } else {
            this.f20269d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20270e = null;
        } else {
            this.f20270e = d4;
        }
        if ((i3 & 32) == 0) {
            this.f20271f = null;
        } else {
            this.f20271f = bool;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBPersonSearchResult)) {
            return false;
        }
        com.kiptv.core.model.TMDBPersonSearchResult tMDBPersonSearchResult = (com.kiptv.core.model.TMDBPersonSearchResult) obj;
        return this.f20266a == tMDBPersonSearchResult.f20266a && kotlin.jvm.internal.m.a(this.f20267b, tMDBPersonSearchResult.f20267b) && kotlin.jvm.internal.m.a(this.f20268c, tMDBPersonSearchResult.f20268c) && kotlin.jvm.internal.m.a(this.f20269d, tMDBPersonSearchResult.f20269d) && kotlin.jvm.internal.m.a(this.f20270e, tMDBPersonSearchResult.f20270e) && kotlin.jvm.internal.m.a(this.f20271f, tMDBPersonSearchResult.f20271f);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20266a) * 31, 31, this.f20267b);
        java.lang.String str = this.f20268c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20269d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Double d4 = this.f20270e;
        int iHashCode3 = (iHashCode2 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.Boolean bool = this.f20271f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TMDBPersonSearchResult(id=" + this.f20266a + ", name=" + this.f20267b + ", profilePath=" + this.f20268c + ", knownForDepartment=" + this.f20269d + ", popularity=" + this.f20270e + ", adult=" + this.f20271f + ")";
    }
}
