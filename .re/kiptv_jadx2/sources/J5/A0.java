package J5;

import java.util.List;

public final class A0 {

    public final String f6042a;

    public final String f6043b;

    public final boolean f6044c;

    public final String f6045d;

    public final List f6046e;

    public A0(String appLanguage, String defaultStartScreen, String autoOpenPlaylist, List playlists, boolean z6) {
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

    public static A0 a(A0 a2, String str, String str2, String str3, int i3) {
        if ((i3 & 1) != 0) {
            str = a2.f6042a;
        }
        String appLanguage = str;
        if ((i3 & 2) != 0) {
            str2 = a2.f6043b;
        }
        String defaultStartScreen = str2;
        boolean z6 = a2.f6044c;
        if ((i3 & 8) != 0) {
            str3 = a2.f6045d;
        }
        String autoOpenPlaylist = str3;
        List playlists = a2.f6046e;
        a2.getClass();
        kotlin.jvm.internal.m.e(appLanguage, "appLanguage");
        kotlin.jvm.internal.m.e(defaultStartScreen, "defaultStartScreen");
        kotlin.jvm.internal.m.e(autoOpenPlaylist, "autoOpenPlaylist");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        return new A0(appLanguage, defaultStartScreen, autoOpenPlaylist, playlists, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a2 = (A0) obj;
        return kotlin.jvm.internal.m.a(this.f6042a, a2.f6042a) && kotlin.jvm.internal.m.a(this.f6043b, a2.f6043b) && this.f6044c == a2.f6044c && kotlin.jvm.internal.m.a(this.f6045d, a2.f6045d) && kotlin.jvm.internal.m.a(this.f6046e, a2.f6046e);
    }

    public final int hashCode() {
        return this.f6046e.hashCode() + B2.a.a(p121o0.p.f(B2.a.a(this.f6042a.hashCode() * 31, 31, this.f6043b), 31, this.f6044c), 31, this.f6045d);
    }

    public final String toString() {
        return "TvGeneralPreferencesUiState(appLanguage=" + this.f6042a + ", defaultStartScreen=" + this.f6043b + ", homeEnabled=" + this.f6044c + ", autoOpenPlaylist=" + this.f6045d + ", playlists=" + this.f6046e + ")";
    }
}
