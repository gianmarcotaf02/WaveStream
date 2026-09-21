package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@p119n8.h("ratingAdd")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/model/TraktPendingEvent$RatingAdd", "Lcom/kiptv/core/model/u0;", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktPendingEvent$RatingAdd extends com.kiptv.core.model.u0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktPendingEvent$RatingAdd.Companion INSTANCE = new com.kiptv.core.model.TraktPendingEvent$RatingAdd.Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.TraktMediaRef f20470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20472d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktPendingEvent$RatingAdd$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktPendingEvent$RatingAdd;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktPendingEvent$RatingAdd$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktPendingEvent$RatingAdd(int i3, com.kiptv.core.model.TraktMediaRef traktMediaRef, int i9, java.lang.String str) {
        if (7 != (i3 & 7)) {
            p153r8.AbstractC2686a0.l(i3, 7, com.kiptv.core.model.TraktPendingEvent$RatingAdd$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20470b = traktMediaRef;
        this.f20471c = i9;
        this.f20472d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktPendingEvent$RatingAdd)) {
            return false;
        }
        com.kiptv.core.model.TraktPendingEvent$RatingAdd traktPendingEvent$RatingAdd = (com.kiptv.core.model.TraktPendingEvent$RatingAdd) obj;
        return kotlin.jvm.internal.m.a(this.f20470b, traktPendingEvent$RatingAdd.f20470b) && this.f20471c == traktPendingEvent$RatingAdd.f20471c && kotlin.jvm.internal.m.a(this.f20472d, traktPendingEvent$RatingAdd.f20472d);
    }

    public final int hashCode() {
        return this.f20472d.hashCode() + p121o0.p.d(this.f20471c, this.f20470b.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RatingAdd(ref=");
        sb.append(this.f20470b);
        sb.append(", rating=");
        sb.append(this.f20471c);
        sb.append(", ratedAt=");
        return Y6.f.m(sb, this.f20472d, ")");
    }

    public TraktPendingEvent$RatingAdd(int i3, com.kiptv.core.model.TraktMediaRef ref, java.lang.String str) {
        kotlin.jvm.internal.m.e(ref, "ref");
        this.f20470b = ref;
        this.f20471c = i3;
        this.f20472d = str;
    }
}
