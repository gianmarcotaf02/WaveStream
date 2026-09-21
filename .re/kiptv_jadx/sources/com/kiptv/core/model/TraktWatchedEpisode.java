package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktWatchedEpisode;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktWatchedEpisode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktWatchedEpisode.Companion INSTANCE = new com.kiptv.core.model.TraktWatchedEpisode.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f20542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20543c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktWatchedEpisode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktWatchedEpisode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktWatchedEpisode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktWatchedEpisode(int i3, int i9, java.lang.Integer num, java.lang.String str) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.TraktWatchedEpisode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20541a = i9;
        if ((i3 & 2) == 0) {
            this.f20542b = null;
        } else {
            this.f20542b = num;
        }
        if ((i3 & 4) == 0) {
            this.f20543c = null;
        } else {
            this.f20543c = str;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktWatchedEpisode)) {
            return false;
        }
        com.kiptv.core.model.TraktWatchedEpisode traktWatchedEpisode = (com.kiptv.core.model.TraktWatchedEpisode) obj;
        return this.f20541a == traktWatchedEpisode.f20541a && kotlin.jvm.internal.m.a(this.f20542b, traktWatchedEpisode.f20542b) && kotlin.jvm.internal.m.a(this.f20543c, traktWatchedEpisode.f20543c);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f20541a) * 31;
        java.lang.Integer num = this.f20542b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str = this.f20543c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktWatchedEpisode(number=");
        sb.append(this.f20541a);
        sb.append(", plays=");
        sb.append(this.f20542b);
        sb.append(", lastWatchedAt=");
        return Y6.f.m(sb, this.f20543c, ")");
    }

    public TraktWatchedEpisode(java.lang.String str, int i3, java.lang.Integer num) {
        this.f20541a = i3;
        this.f20542b = num;
        this.f20543c = str;
    }
}
