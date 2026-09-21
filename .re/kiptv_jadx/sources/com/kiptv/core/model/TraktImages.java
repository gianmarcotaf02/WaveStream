package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktImages;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktImages {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktImages.Companion INSTANCE = new com.kiptv.core.model.TraktImages.Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20414c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f20415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20416b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktImages$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktImages;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktImages$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        f20414c = new kotlinx.serialization.KSerializer[]{new p153r8.C2691d(p0Var, 0), new p153r8.C2691d(p0Var, 0)};
    }

    public /* synthetic */ TraktImages(java.util.List list, int i3, java.util.List list2) {
        if ((i3 & 1) == 0) {
            this.f20415a = null;
        } else {
            this.f20415a = list;
        }
        if ((i3 & 2) == 0) {
            this.f20416b = null;
        } else {
            this.f20416b = list2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktImages)) {
            return false;
        }
        com.kiptv.core.model.TraktImages traktImages = (com.kiptv.core.model.TraktImages) obj;
        return kotlin.jvm.internal.m.a(this.f20415a, traktImages.f20415a) && kotlin.jvm.internal.m.a(this.f20416b, traktImages.f20416b);
    }

    public final int hashCode() {
        java.util.List list = this.f20415a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.util.List list2 = this.f20416b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktImages(poster=" + this.f20415a + ", fanart=" + this.f20416b + ")";
    }
}
