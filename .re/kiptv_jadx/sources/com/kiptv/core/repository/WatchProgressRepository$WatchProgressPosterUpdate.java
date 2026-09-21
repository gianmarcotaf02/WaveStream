package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/WatchProgressRepository$WatchProgressPosterUpdate", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class WatchProgressRepository$WatchProgressPosterUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.WatchProgressRepository$WatchProgressPosterUpdate.Companion INSTANCE = new com.kiptv.core.repository.WatchProgressRepository$WatchProgressPosterUpdate.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20945b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressPosterUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressPosterUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.WatchProgressRepository$WatchProgressPosterUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WatchProgressRepository$WatchProgressPosterUpdate(int i3, java.lang.String str, java.lang.String str2) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.repository.WatchProgressRepository$WatchProgressPosterUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20944a = str;
        this.f20945b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.WatchProgressRepository$WatchProgressPosterUpdate)) {
            return false;
        }
        com.kiptv.core.repository.WatchProgressRepository$WatchProgressPosterUpdate watchProgressRepository$WatchProgressPosterUpdate = (com.kiptv.core.repository.WatchProgressRepository$WatchProgressPosterUpdate) obj;
        return kotlin.jvm.internal.m.a(this.f20944a, watchProgressRepository$WatchProgressPosterUpdate.f20944a) && kotlin.jvm.internal.m.a(this.f20945b, watchProgressRepository$WatchProgressPosterUpdate.f20945b);
    }

    public final int hashCode() {
        return this.f20945b.hashCode() + (this.f20944a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WatchProgressPosterUpdate(posterUrl=");
        sb.append(this.f20944a);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f20945b, ")");
    }

    public WatchProgressRepository$WatchProgressPosterUpdate(java.lang.String posterUrl, java.lang.String str) {
        kotlin.jvm.internal.m.e(posterUrl, "posterUrl");
        this.f20944a = posterUrl;
        this.f20945b = str;
    }
}
