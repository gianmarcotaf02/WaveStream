package E5;

/* JADX INFO: loaded from: classes4.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.Playlist f2882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f2885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f2886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f2887f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2889i;
    public final java.lang.String j;

    public /* synthetic */ I(com.kiptv.core.model.Playlist playlist, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i3) {
        this((i3 & 1) != 0 ? null : playlist, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? null : str6, false, false, null);
    }

    public static E5.I a(E5.I i3, java.lang.String str, java.lang.String url, java.lang.String username, java.lang.String password, java.lang.String epgUrl, java.lang.String str2, boolean z6, boolean z9, java.lang.String str3, int i9) {
        java.lang.String name = str;
        com.kiptv.core.model.Playlist playlist = i3.f2882a;
        if ((i9 & 2) != 0) {
            name = i3.f2883b;
        }
        if ((i9 & 4) != 0) {
            url = i3.f2884c;
        }
        if ((i9 & 8) != 0) {
            username = i3.f2885d;
        }
        if ((i9 & 16) != 0) {
            password = i3.f2886e;
        }
        if ((i9 & 32) != 0) {
            epgUrl = i3.f2887f;
        }
        if ((i9 & 64) != 0) {
            str2 = i3.g;
        }
        if ((i9 & 128) != 0) {
            z6 = i3.f2888h;
        }
        if ((i9 & 256) != 0) {
            z9 = i3.f2889i;
        }
        if ((i9 & 512) != 0) {
            str3 = i3.j;
        }
        java.lang.String str4 = str3;
        i3.getClass();
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        kotlin.jvm.internal.m.e(epgUrl, "epgUrl");
        boolean z10 = z9;
        boolean z11 = z6;
        java.lang.String str5 = str2;
        java.lang.String str6 = epgUrl;
        java.lang.String str7 = password;
        java.lang.String str8 = username;
        return new E5.I(playlist, name, url, str8, str7, str6, str5, z11, z10, str4);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e A[RETURN] */
    public final boolean b() {
        java.lang.String str = this.f2883b;
        if (!O7.q.N0(str)) {
            java.lang.String str2 = this.f2884c;
            if (!O7.q.N0(str2)) {
                com.kiptv.core.model.Playlist playlist = this.f2882a;
                boolean zC = playlist != null ? playlist.c() : false;
                java.lang.String str3 = this.f2886e;
                java.lang.String str4 = this.f2885d;
                if ((zC || (!O7.q.N0(str4) && !O7.q.N0(str3))) && playlist != null) {
                    if (kotlin.jvm.internal.m.a(O7.q.r1(str).toString(), playlist.f20035c) && kotlin.jvm.internal.m.a(O7.q.r1(str2).toString(), playlist.f20036d) && kotlin.jvm.internal.m.a(str4, playlist.f20037e) && kotlin.jvm.internal.m.a(str3, playlist.f20038f)) {
                        java.lang.String str5 = this.f2887f;
                        if (O7.q.N0(str5)) {
                            str5 = null;
                        }
                        if (!kotlin.jvm.internal.m.a(str5, playlist.g) || !kotlin.jvm.internal.m.a(this.g, playlist.f20039h)) {
                            if (!this.f2888h) {
                                return true;
                            }
                        }
                    } else if (!this.f2888h) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E5.I)) {
            return false;
        }
        E5.I i3 = (E5.I) obj;
        return kotlin.jvm.internal.m.a(this.f2882a, i3.f2882a) && kotlin.jvm.internal.m.a(this.f2883b, i3.f2883b) && kotlin.jvm.internal.m.a(this.f2884c, i3.f2884c) && kotlin.jvm.internal.m.a(this.f2885d, i3.f2885d) && kotlin.jvm.internal.m.a(this.f2886e, i3.f2886e) && kotlin.jvm.internal.m.a(this.f2887f, i3.f2887f) && kotlin.jvm.internal.m.a(this.g, i3.g) && this.f2888h == i3.f2888h && this.f2889i == i3.f2889i && kotlin.jvm.internal.m.a(this.j, i3.j);
    }

    public final int hashCode() {
        com.kiptv.core.model.Playlist playlist = this.f2882a;
        int iA = B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a((playlist == null ? 0 : playlist.hashCode()) * 31, 31, this.f2883b), 31, this.f2884c), 31, this.f2885d), 31, this.f2886e), 31, this.f2887f);
        java.lang.String str = this.g;
        int iF = p121o0.p.f(p121o0.p.f((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2888h), 31, this.f2889i);
        java.lang.String str2 = this.j;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvEditPlaylistUiState(playlist=");
        sb.append(this.f2882a);
        sb.append(", name=");
        sb.append(this.f2883b);
        sb.append(", url=");
        sb.append(this.f2884c);
        sb.append(", username=");
        sb.append(this.f2885d);
        sb.append(", password=");
        sb.append(this.f2886e);
        sb.append(", epgUrl=");
        sb.append(this.f2887f);
        sb.append(", avatar=");
        sb.append(this.g);
        sb.append(", isSaving=");
        sb.append(this.f2888h);
        sb.append(", isDeleting=");
        sb.append(this.f2889i);
        sb.append(", errorMessage=");
        return Y6.f.m(sb, this.j, ")");
    }

    public I(com.kiptv.core.model.Playlist playlist, java.lang.String name, java.lang.String url, java.lang.String username, java.lang.String password, java.lang.String epgUrl, java.lang.String str, boolean z6, boolean z9, java.lang.String str2) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        kotlin.jvm.internal.m.e(epgUrl, "epgUrl");
        this.f2882a = playlist;
        this.f2883b = name;
        this.f2884c = url;
        this.f2885d = username;
        this.f2886e = password;
        this.f2887f = epgUrl;
        this.g = str;
        this.f2888h = z6;
        this.f2889i = z9;
        this.j = str2;
    }
}
