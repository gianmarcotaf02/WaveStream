package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktPlaylistCursor;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktPlaylistCursor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktPlaylistCursor.Companion INSTANCE = new com.kiptv.core.model.TraktPlaylistCursor.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20485e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktPlaylistCursor$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktPlaylistCursor;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktPlaylistCursor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktPlaylistCursor(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if ((i3 & 1) == 0) {
            this.f20481a = null;
        } else {
            this.f20481a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20482b = null;
        } else {
            this.f20482b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20483c = null;
        } else {
            this.f20483c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20484d = null;
        } else {
            this.f20484d = str4;
        }
        if ((i3 & 16) == 0) {
            this.f20485e = null;
        } else {
            this.f20485e = str5;
        }
    }

    public static com.kiptv.core.model.TraktPlaylistCursor a(com.kiptv.core.model.TraktPlaylistCursor traktPlaylistCursor, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i3) {
        if ((i3 & 1) != 0) {
            str = traktPlaylistCursor.f20481a;
        }
        java.lang.String str6 = str;
        if ((i3 & 2) != 0) {
            str2 = traktPlaylistCursor.f20482b;
        }
        java.lang.String str7 = str2;
        if ((i3 & 4) != 0) {
            str3 = traktPlaylistCursor.f20483c;
        }
        java.lang.String str8 = str3;
        if ((i3 & 8) != 0) {
            str4 = traktPlaylistCursor.f20484d;
        }
        java.lang.String str9 = str4;
        if ((i3 & 16) != 0) {
            str5 = traktPlaylistCursor.f20485e;
        }
        traktPlaylistCursor.getClass();
        return new com.kiptv.core.model.TraktPlaylistCursor(str6, str7, str8, str9, str5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getF20481a() {
        return this.f20481a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final java.lang.String getF20485e() {
        return this.f20485e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktPlaylistCursor)) {
            return false;
        }
        com.kiptv.core.model.TraktPlaylistCursor traktPlaylistCursor = (com.kiptv.core.model.TraktPlaylistCursor) obj;
        return kotlin.jvm.internal.m.a(this.f20481a, traktPlaylistCursor.f20481a) && kotlin.jvm.internal.m.a(this.f20482b, traktPlaylistCursor.f20482b) && kotlin.jvm.internal.m.a(this.f20483c, traktPlaylistCursor.f20483c) && kotlin.jvm.internal.m.a(this.f20484d, traktPlaylistCursor.f20484d) && kotlin.jvm.internal.m.a(this.f20485e, traktPlaylistCursor.f20485e);
    }

    public final int hashCode() {
        java.lang.String str = this.f20481a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f20482b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20483c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20484d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20485e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktPlaylistCursor(moviesWatchedAt=");
        sb.append(this.f20481a);
        sb.append(", episodesWatchedAt=");
        sb.append(this.f20482b);
        sb.append(", moviesPausedAt=");
        sb.append(this.f20483c);
        sb.append(", episodesPausedAt=");
        sb.append(this.f20484d);
        sb.append(", watchlistUpdatedAt=");
        return Y6.f.m(sb, this.f20485e, ")");
    }

    public /* synthetic */ TraktPlaylistCursor() {
        this(null, null, null, null, null);
    }

    public TraktPlaylistCursor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f20481a = str;
        this.f20482b = str2;
        this.f20483c = str3;
        this.f20484d = str4;
        this.f20485e = str5;
    }
}
