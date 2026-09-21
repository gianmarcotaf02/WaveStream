package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f6043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f6045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f6046e;

    public A0(java.lang.String appLanguage, java.lang.String defaultStartScreen, java.lang.String autoOpenPlaylist, java.util.List playlists, boolean z6) {
        kotlin.jvm.internal.m.e(appLanguage, "appLanguage");
        kotlin.jvm.internal.m.e(defaultStartScreen, "defaultStartScreen");
        kotlin.jvm.internal.m.e(autoOpenPlaylist, "autoOpenPlaylist");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        this.f6042a = appLanguage;
        this.f6043b = defaultStartScreen;
        this.f6044c = z6;
        this.f6045d = autoOpenPlaylist;
        this.f6046e = playlists;
    }

    public static J5.A0 a(J5.A0 a2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3) {
        if ((i3 & 1) != 0) {
            str = a2.f6042a;
        }
        java.lang.String appLanguage = str;
        if ((i3 & 2) != 0) {
            str2 = a2.f6043b;
        }
        java.lang.String defaultStartScreen = str2;
        boolean z6 = a2.f6044c;
        if ((i3 & 8) != 0) {
            str3 = a2.f6045d;
        }
        java.lang.String autoOpenPlaylist = str3;
        java.util.List playlists = a2.f6046e;
        a2.getClass();
        kotlin.jvm.internal.m.e(appLanguage, "appLanguage");
        kotlin.jvm.internal.m.e(defaultStartScreen, "defaultStartScreen");
        kotlin.jvm.internal.m.e(autoOpenPlaylist, "autoOpenPlaylist");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        return new J5.A0(appLanguage, defaultStartScreen, autoOpenPlaylist, playlists, z6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J5.A0)) {
            return false;
        }
        J5.A0 a2 = (J5.A0) obj;
        return kotlin.jvm.internal.m.a(this.f6042a, a2.f6042a) && kotlin.jvm.internal.m.a(this.f6043b, a2.f6043b) && this.f6044c == a2.f6044c && kotlin.jvm.internal.m.a(this.f6045d, a2.f6045d) && kotlin.jvm.internal.m.a(this.f6046e, a2.f6046e);
    }

    public final int hashCode() {
        return this.f6046e.hashCode() + B2.a.a(p121o0.p.f(B2.a.a(this.f6042a.hashCode() * 31, 31, this.f6043b), 31, this.f6044c), 31, this.f6045d);
    }

    public final java.lang.String toString() {
        return "TvGeneralPreferencesUiState(appLanguage=" + this.f6042a + ", defaultStartScreen=" + this.f6043b + ", homeEnabled=" + this.f6044c + ", autoOpenPlaylist=" + this.f6045d + ", playlists=" + this.f6046e + ")";
    }
}
