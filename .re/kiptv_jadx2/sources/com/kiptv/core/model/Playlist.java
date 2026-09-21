package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/Playlist;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class Playlist {

    public static final Companion INSTANCE = new Companion();

    public final String f20033a;

    public final String f20034b;

    public final String f20035c;

    public final String f20036d;

    public final String f20037e;

    public final String f20038f;
    public final String g;

    public final String f20039h;

    public final boolean f20040i;
    public final String j;

    public final String f20041k;

    public final String f20042l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/Playlist$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/Playlist;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return Playlist$$serializer.INSTANCE;
        }
    }

    public Playlist(int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z6, String str9, String str10, String str11) {
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

    public static Playlist a(Playlist playlist, boolean z6) {
        String str = playlist.f20039h;
        String id = playlist.f20033a;
        kotlin.jvm.internal.m.e(id, "id");
        String userId = playlist.f20034b;
        kotlin.jvm.internal.m.e(userId, "userId");
        String name = playlist.f20035c;
        kotlin.jvm.internal.m.e(name, "name");
        String url = playlist.f20036d;
        kotlin.jvm.internal.m.e(url, "url");
        String username = playlist.f20037e;
        kotlin.jvm.internal.m.e(username, "username");
        String password = playlist.f20038f;
        kotlin.jvm.internal.m.e(password, "password");
        return new Playlist(id, userId, name, url, username, password, playlist.g, str, z6, playlist.j, playlist.f20041k, playlist.f20042l);
    }

    public final String getF20033a() {
        return this.f20033a;
    }

    public final boolean c() {
        return this.f20037e.length() == 0;
    }

    public final boolean d() {
        return this.f20037e.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) obj;
        return kotlin.jvm.internal.m.a(this.f20033a, playlist.f20033a) && kotlin.jvm.internal.m.a(this.f20034b, playlist.f20034b) && kotlin.jvm.internal.m.a(this.f20035c, playlist.f20035c) && kotlin.jvm.internal.m.a(this.f20036d, playlist.f20036d) && kotlin.jvm.internal.m.a(this.f20037e, playlist.f20037e) && kotlin.jvm.internal.m.a(this.f20038f, playlist.f20038f) && kotlin.jvm.internal.m.a(this.g, playlist.g) && kotlin.jvm.internal.m.a(this.f20039h, playlist.f20039h) && this.f20040i == playlist.f20040i && kotlin.jvm.internal.m.a(this.j, playlist.j) && kotlin.jvm.internal.m.a(this.f20041k, playlist.f20041k) && kotlin.jvm.internal.m.a(this.f20042l, playlist.f20042l);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(this.f20033a.hashCode() * 31, 31, this.f20034b), 31, this.f20035c), 31, this.f20036d), 31, this.f20037e), 31, this.f20038f);
        String str = this.g;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20039h;
        int iF = p121o0.p.f((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f20040i);
        String str3 = this.j;
        int iHashCode2 = (iF + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20041k;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20042l;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playlist(id=");
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

    public Playlist(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z6, String str9, String str10, String str11) {
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
