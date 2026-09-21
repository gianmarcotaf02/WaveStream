package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/WatchProgressRepository$WatchProgressHideUpdate", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class WatchProgressRepository$WatchProgressHideUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.WatchProgressRepository$WatchProgressHideUpdate.Companion INSTANCE = new com.kiptv.core.repository.WatchProgressRepository$WatchProgressHideUpdate.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20943b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressHideUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressHideUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.WatchProgressRepository$WatchProgressHideUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WatchProgressRepository$WatchProgressHideUpdate(int i3, java.lang.String str, boolean z6) {
        if (2 != (i3 & 2)) {
            p153r8.AbstractC2686a0.l(i3, 2, com.kiptv.core.repository.WatchProgressRepository$WatchProgressHideUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20942a = true;
        } else {
            this.f20942a = z6;
        }
        this.f20943b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.WatchProgressRepository$WatchProgressHideUpdate)) {
            return false;
        }
        com.kiptv.core.repository.WatchProgressRepository$WatchProgressHideUpdate watchProgressRepository$WatchProgressHideUpdate = (com.kiptv.core.repository.WatchProgressRepository$WatchProgressHideUpdate) obj;
        return this.f20942a == watchProgressRepository$WatchProgressHideUpdate.f20942a && kotlin.jvm.internal.m.a(this.f20943b, watchProgressRepository$WatchProgressHideUpdate.f20943b);
    }

    public final int hashCode() {
        return this.f20943b.hashCode() + (java.lang.Boolean.hashCode(this.f20942a) * 31);
    }

    public final java.lang.String toString() {
        return "WatchProgressHideUpdate(hiddenFromContinueWatching=" + this.f20942a + ", updatedAt=" + this.f20943b + ")";
    }

    public WatchProgressRepository$WatchProgressHideUpdate(java.lang.String str) {
        this.f20942a = true;
        this.f20943b = str;
    }
}
