package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBCompany;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBCompany {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBCompany.Companion INSTANCE = new com.kiptv.core.model.TMDBCompany.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20135c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBCompany$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBCompany;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBCompany$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBCompany(int i3, int i9, java.lang.String str, java.lang.String str2) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBCompany$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20133a = i9;
        this.f20134b = str;
        if ((i3 & 4) == 0) {
            this.f20135c = null;
        } else {
            this.f20135c = str2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBCompany)) {
            return false;
        }
        com.kiptv.core.model.TMDBCompany tMDBCompany = (com.kiptv.core.model.TMDBCompany) obj;
        return this.f20133a == tMDBCompany.f20133a && kotlin.jvm.internal.m.a(this.f20134b, tMDBCompany.f20134b) && kotlin.jvm.internal.m.a(this.f20135c, tMDBCompany.f20135c);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20133a) * 31, 31, this.f20134b);
        java.lang.String str = this.f20135c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TMDBCompany(id=");
        sb.append(this.f20133a);
        sb.append(", name=");
        sb.append(this.f20134b);
        sb.append(", logoPath=");
        return Y6.f.m(sb, this.f20135c, ")");
    }
}
