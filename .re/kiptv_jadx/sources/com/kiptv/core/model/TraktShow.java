package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktShow;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktShow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktShow.Companion INSTANCE = new com.kiptv.core.model.TraktShow.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f20499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.TraktIds f20500c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktShow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktShow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktShow$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktShow(int i3, java.lang.String str, java.lang.Integer num, com.kiptv.core.model.TraktIds traktIds) {
        if ((i3 & 1) == 0) {
            this.f20498a = null;
        } else {
            this.f20498a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20499b = null;
        } else {
            this.f20499b = num;
        }
        if ((i3 & 4) == 0) {
            this.f20500c = new com.kiptv.core.model.TraktIds();
        } else {
            this.f20500c = traktIds;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktShow)) {
            return false;
        }
        com.kiptv.core.model.TraktShow traktShow = (com.kiptv.core.model.TraktShow) obj;
        return kotlin.jvm.internal.m.a(this.f20498a, traktShow.f20498a) && kotlin.jvm.internal.m.a(this.f20499b, traktShow.f20499b) && kotlin.jvm.internal.m.a(this.f20500c, traktShow.f20500c);
    }

    public final int hashCode() {
        java.lang.String str = this.f20498a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Integer num = this.f20499b;
        return this.f20500c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "TraktShow(title=" + this.f20498a + ", year=" + this.f20499b + ", ids=" + this.f20500c + ")";
    }
}
