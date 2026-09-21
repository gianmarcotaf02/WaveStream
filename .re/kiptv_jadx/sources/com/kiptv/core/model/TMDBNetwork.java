package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBNetwork;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBNetwork {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBNetwork.Companion INSTANCE = new com.kiptv.core.model.TMDBNetwork.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20217c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBNetwork$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBNetwork;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBNetwork$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBNetwork(int i3, int i9, java.lang.String str, java.lang.String str2) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBNetwork$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20215a = i9;
        this.f20216b = str;
        if ((i3 & 4) == 0) {
            this.f20217c = null;
        } else {
            this.f20217c = str2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBNetwork)) {
            return false;
        }
        com.kiptv.core.model.TMDBNetwork tMDBNetwork = (com.kiptv.core.model.TMDBNetwork) obj;
        return this.f20215a == tMDBNetwork.f20215a && kotlin.jvm.internal.m.a(this.f20216b, tMDBNetwork.f20216b) && kotlin.jvm.internal.m.a(this.f20217c, tMDBNetwork.f20217c);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20215a) * 31, 31, this.f20216b);
        java.lang.String str = this.f20217c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TMDBNetwork(id=");
        sb.append(this.f20215a);
        sb.append(", name=");
        sb.append(this.f20216b);
        sb.append(", logoPath=");
        return Y6.f.m(sb, this.f20217c, ")");
    }
}
