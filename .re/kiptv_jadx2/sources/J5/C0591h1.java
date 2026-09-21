package J5;

import com.kiptv.core.model.PlaylistSettings;

public final class C0591h1 {

    public final PlaylistSettings f6433a;

    public final boolean f6434b;

    public final String f6435c;

    public C0591h1(PlaylistSettings playlistSettings, boolean z6, String str) {
        this.f6433a = playlistSettings;
        this.f6434b = z6;
        this.f6435c = str;
    }

    public static C0591h1 a(C0591h1 c0591h1, PlaylistSettings playlistSettings, boolean z6, String str, int i3) {
        if ((i3 & 1) != 0) {
            playlistSettings = c0591h1.f6433a;
        }
        if ((i3 & 2) != 0) {
            z6 = c0591h1.f6434b;
        }
        if ((i3 & 4) != 0) {
            str = c0591h1.f6435c;
        }
        c0591h1.getClass();
        return new C0591h1(playlistSettings, z6, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0591h1)) {
            return false;
        }
        C0591h1 c0591h1 = (C0591h1) obj;
        return kotlin.jvm.internal.m.a(this.f6433a, c0591h1.f6433a) && this.f6434b == c0591h1.f6434b && kotlin.jvm.internal.m.a(this.f6435c, c0591h1.f6435c);
    }

    public final int hashCode() {
        PlaylistSettings playlistSettings = this.f6433a;
        int iF = p121o0.p.f((playlistSettings == null ? 0 : playlistSettings.hashCode()) * 31, 31, this.f6434b);
        String str = this.f6435c;
        return iF + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvMetadataUiState(activeSettings=");
        sb.append(this.f6433a);
        sb.append(", isClearingCache=");
        sb.append(this.f6434b);
        sb.append(", infoMessage=");
        return Y6.f.m(sb, this.f6435c, ")");
    }
}
