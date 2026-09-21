package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBCrewMember;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBCrewMember {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBCrewMember.Companion INSTANCE = new com.kiptv.core.model.TMDBCrewMember.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20153e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBCrewMember$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBCrewMember;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBCrewMember$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBCrewMember(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBCrewMember$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20149a = i9;
        this.f20150b = str;
        if ((i3 & 4) == 0) {
            this.f20151c = null;
        } else {
            this.f20151c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20152d = null;
        } else {
            this.f20152d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20153e = null;
        } else {
            this.f20153e = str4;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBCrewMember)) {
            return false;
        }
        com.kiptv.core.model.TMDBCrewMember tMDBCrewMember = (com.kiptv.core.model.TMDBCrewMember) obj;
        return this.f20149a == tMDBCrewMember.f20149a && kotlin.jvm.internal.m.a(this.f20150b, tMDBCrewMember.f20150b) && kotlin.jvm.internal.m.a(this.f20151c, tMDBCrewMember.f20151c) && kotlin.jvm.internal.m.a(this.f20152d, tMDBCrewMember.f20152d) && kotlin.jvm.internal.m.a(this.f20153e, tMDBCrewMember.f20153e);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20149a) * 31, 31, this.f20150b);
        java.lang.String str = this.f20151c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20152d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20153e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TMDBCrewMember(id=");
        sb.append(this.f20149a);
        sb.append(", name=");
        sb.append(this.f20150b);
        sb.append(", job=");
        sb.append(this.f20151c);
        sb.append(", department=");
        sb.append(this.f20152d);
        sb.append(", profilePath=");
        return Y6.f.m(sb, this.f20153e, ")");
    }
}
