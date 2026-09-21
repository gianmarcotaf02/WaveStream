package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktProgressEpisode;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktProgressEpisode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktProgressEpisode.Companion INSTANCE = new com.kiptv.core.model.TraktProgressEpisode.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f20487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20488c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktProgressEpisode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktProgressEpisode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktProgressEpisode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktProgressEpisode(int i3, int i9, java.lang.Boolean bool, java.lang.String str) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.TraktProgressEpisode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20486a = i9;
        if ((i3 & 2) == 0) {
            this.f20487b = null;
        } else {
            this.f20487b = bool;
        }
        if ((i3 & 4) == 0) {
            this.f20488c = null;
        } else {
            this.f20488c = str;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktProgressEpisode)) {
            return false;
        }
        com.kiptv.core.model.TraktProgressEpisode traktProgressEpisode = (com.kiptv.core.model.TraktProgressEpisode) obj;
        return this.f20486a == traktProgressEpisode.f20486a && kotlin.jvm.internal.m.a(this.f20487b, traktProgressEpisode.f20487b) && kotlin.jvm.internal.m.a(this.f20488c, traktProgressEpisode.f20488c);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f20486a) * 31;
        java.lang.Boolean bool = this.f20487b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str = this.f20488c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktProgressEpisode(number=");
        sb.append(this.f20486a);
        sb.append(", completed=");
        sb.append(this.f20487b);
        sb.append(", lastWatchedAt=");
        return Y6.f.m(sb, this.f20488c, ")");
    }
}
