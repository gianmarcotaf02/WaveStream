package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBGenre;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBGenre {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBGenre.Companion INSTANCE = new com.kiptv.core.model.TMDBGenre.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20179b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBGenre$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBGenre;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBGenre$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBGenre(int i3, int i9, java.lang.String str) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBGenre$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20178a = i9;
        this.f20179b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBGenre)) {
            return false;
        }
        com.kiptv.core.model.TMDBGenre tMDBGenre = (com.kiptv.core.model.TMDBGenre) obj;
        return this.f20178a == tMDBGenre.f20178a && kotlin.jvm.internal.m.a(this.f20179b, tMDBGenre.f20179b);
    }

    public final int hashCode() {
        return this.f20179b.hashCode() + (java.lang.Integer.hashCode(this.f20178a) * 31);
    }

    public final java.lang.String toString() {
        return "TMDBGenre(id=" + this.f20178a + ", name=" + this.f20179b + ")";
    }
}
