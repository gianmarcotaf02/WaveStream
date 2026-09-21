package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktEpisode;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktEpisode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktEpisode.Companion INSTANCE = new com.kiptv.core.model.TraktEpisode.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f20392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.TraktIds f20394d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktEpisode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktEpisode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktEpisode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktEpisode(int i3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, com.kiptv.core.model.TraktIds traktIds) {
        if ((i3 & 1) == 0) {
            this.f20391a = null;
        } else {
            this.f20391a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20392b = null;
        } else {
            this.f20392b = num2;
        }
        if ((i3 & 4) == 0) {
            this.f20393c = null;
        } else {
            this.f20393c = str;
        }
        if ((i3 & 8) == 0) {
            this.f20394d = null;
        } else {
            this.f20394d = traktIds;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktEpisode)) {
            return false;
        }
        com.kiptv.core.model.TraktEpisode traktEpisode = (com.kiptv.core.model.TraktEpisode) obj;
        return kotlin.jvm.internal.m.a(this.f20391a, traktEpisode.f20391a) && kotlin.jvm.internal.m.a(this.f20392b, traktEpisode.f20392b) && kotlin.jvm.internal.m.a(this.f20393c, traktEpisode.f20393c) && kotlin.jvm.internal.m.a(this.f20394d, traktEpisode.f20394d);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20391a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f20392b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str = this.f20393c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        com.kiptv.core.model.TraktIds traktIds = this.f20394d;
        return iHashCode3 + (traktIds != null ? traktIds.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktEpisode(season=" + this.f20391a + ", number=" + this.f20392b + ", title=" + this.f20393c + ", ids=" + this.f20394d + ")";
    }
}
