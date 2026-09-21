package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktListItem;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktListItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktListItem.Companion INSTANCE = new com.kiptv.core.model.TraktListItem.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Long f20433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.TraktMediaFull f20436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.kiptv.core.model.TraktMediaFull f20437f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktListItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktListItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktListItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktListItem(int i3, java.lang.Integer num, java.lang.Long l2, java.lang.String str, java.lang.String str2, com.kiptv.core.model.TraktMediaFull traktMediaFull, com.kiptv.core.model.TraktMediaFull traktMediaFull2) {
        if ((i3 & 1) == 0) {
            this.f20432a = null;
        } else {
            this.f20432a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20433b = null;
        } else {
            this.f20433b = l2;
        }
        if ((i3 & 4) == 0) {
            this.f20434c = null;
        } else {
            this.f20434c = str;
        }
        if ((i3 & 8) == 0) {
            this.f20435d = "";
        } else {
            this.f20435d = str2;
        }
        if ((i3 & 16) == 0) {
            this.f20436e = null;
        } else {
            this.f20436e = traktMediaFull;
        }
        if ((i3 & 32) == 0) {
            this.f20437f = null;
        } else {
            this.f20437f = traktMediaFull2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktListItem)) {
            return false;
        }
        com.kiptv.core.model.TraktListItem traktListItem = (com.kiptv.core.model.TraktListItem) obj;
        return kotlin.jvm.internal.m.a(this.f20432a, traktListItem.f20432a) && kotlin.jvm.internal.m.a(this.f20433b, traktListItem.f20433b) && kotlin.jvm.internal.m.a(this.f20434c, traktListItem.f20434c) && kotlin.jvm.internal.m.a(this.f20435d, traktListItem.f20435d) && kotlin.jvm.internal.m.a(this.f20436e, traktListItem.f20436e) && kotlin.jvm.internal.m.a(this.f20437f, traktListItem.f20437f);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20432a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Long l2 = this.f20433b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.String str = this.f20434c;
        int iA = B2.a.a((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20435d);
        com.kiptv.core.model.TraktMediaFull traktMediaFull = this.f20436e;
        int iHashCode3 = (iA + (traktMediaFull == null ? 0 : traktMediaFull.hashCode())) * 31;
        com.kiptv.core.model.TraktMediaFull traktMediaFull2 = this.f20437f;
        return iHashCode3 + (traktMediaFull2 != null ? traktMediaFull2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktListItem(rank=" + this.f20432a + ", id=" + this.f20433b + ", listedAt=" + this.f20434c + ", type=" + this.f20435d + ", movie=" + this.f20436e + ", show=" + this.f20437f + ")";
    }
}
