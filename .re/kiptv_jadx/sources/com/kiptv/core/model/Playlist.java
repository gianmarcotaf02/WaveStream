package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/Playlist;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class Playlist {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.Playlist.Companion INSTANCE = new com.kiptv.core.model.Playlist.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20038f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20040i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f20041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f20042l;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/Playlist$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/Playlist;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.Playlist$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Playlist(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z6, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
        if ((i3 & 1) == 0) {
            this.f20033a = "";
        } else {
            this.f20033a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20034b = "";
        } else {
            this.f20034b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20035c = "";
        } else {
            this.f20035c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20036d = "";
        } else {
            this.f20036d = str4;
        }
        if ((i3 & 16) == 0) {
            this.f20037e = "";
        } else {
            this.f20037e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20038f = "";
        } else {
            this.f20038f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i3 & 128) == 0) {
            this.f20039h = null;
        } else {
            this.f20039h = str8;
        }
        if ((i3 & 256) == 0) {
            this.f20040i = false;
        } else {
            this.f20040i = z6;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str9;
        }
        if ((i3 & 1024) == 0) {
            this.f20041k = null;
        } else {
            this.f20041k = str10;
        }
        if ((i3 & 2048) == 0) {
            this.f20042l = null;
        } else {
            this.f20042l = str11;
        }
    }

    public static com.kiptv.core.model.Playlist a(com.kiptv.core.model.Playlist playlist, boolean z6) {
        java.lang.String str = playlist.f20039h;
        java.lang.String id = playlist.f20033a;
        kotlin.jvm.internal.m.e(id, "id");
        java.lang.String userId = playlist.f20034b;
        kotlin.jvm.internal.m.e(userId, "userId");
        java.lang.String name = playlist.f20035c;
        kotlin.jvm.internal.m.e(name, "name");
        java.lang.String url = playlist.f20036d;
        kotlin.jvm.internal.m.e(url, "url");
        java.lang.String username = playlist.f20037e;
        kotlin.jvm.internal.m.e(username, "username");
        java.lang.String password = playlist.f20038f;
        kotlin.jvm.internal.m.e(password, "password");
        return new com.kiptv.core.model.Playlist(id, userId, name, url, username, password, playlist.g, str, z6, playlist.j, playlist.f20041k, playlist.f20042l);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getF20033a() {
        return this.f20033a;
    }

    public final boolean c() {
        return this.f20037e.length() == 0;
    }

    public final boolean d() {
        return this.f20037e.length() > 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.Playlist)) {
            return false;
        }
        com.kiptv.core.model.Playlist playlist = (com.kiptv.core.model.Playlist) obj;
        return kotlin.jvm.internal.m.a(this.f20033a, playlist.f20033a) && kotlin.jvm.internal.m.a(this.f20034b, playlist.f20034b) && kotlin.jvm.internal.m.a(this.f20035c, playlist.f20035c) && kotlin.jvm.internal.m.a(this.f20036d, playlist.f20036d) && kotlin.jvm.internal.m.a(this.f20037e, playlist.f20037e) && kotlin.jvm.internal.m.a(this.f20038f, playlist.f20038f) && kotlin.jvm.internal.m.a(this.g, playlist.g) && kotlin.jvm.internal.m.a(this.f20039h, playlist.f20039h) && this.f20040i == playlist.f20040i && kotlin.jvm.internal.m.a(this.j, playlist.j) && kotlin.jvm.internal.m.a(this.f20041k, playlist.f20041k) && kotlin.jvm.internal.m.a(this.f20042l, playlist.f20042l);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(this.f20033a.hashCode() * 31, 31, this.f20034b), 31, this.f20035c), 31, this.f20036d), 31, this.f20037e), 31, this.f20038f);
        java.lang.String str = this.g;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20039h;
        int iF = p121o0.p.f((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f20040i);
        java.lang.String str3 = this.j;
        int iHashCode2 = (iF + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20041k;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20042l;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Playlist(id=");
        sb.append(this.f20033a);
        sb.append(", userId=");
        sb.append(this.f20034b);
        sb.append(", name=");
        sb.append(this.f20035c);
        sb.append(", url=");
        sb.append(this.f20036d);
        sb.append(", username=");
        sb.append(this.f20037e);
        sb.append(", password=");
        sb.append(this.f20038f);
        sb.append(", epgUrl=");
        sb.append(this.g);
        sb.append(", avatar=");
        sb.append(this.f20039h);
        sb.append(", isActive=");
        sb.append(this.f20040i);
        sb.append(", lastUsed=");
        sb.append(this.j);
        sb.append(", createdAt=");
        sb.append(this.f20041k);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f20042l, ")");
    }

    public Playlist(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z6, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
        this.f20033a = str;
        this.f20034b = str2;
        this.f20035c = str3;
        this.f20036d = str4;
        this.f20037e = str5;
        this.f20038f = str6;
        this.g = str7;
        this.f20039h = str8;
        this.f20040i = z6;
        this.j = str9;
        this.f20041k = str10;
        this.f20042l = str11;
    }
}
