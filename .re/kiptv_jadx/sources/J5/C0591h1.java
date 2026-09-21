package J5;

/* JADX INFO: renamed from: J5.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0591h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.PlaylistSettings f6433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f6435c;

    public C0591h1(com.kiptv.core.model.PlaylistSettings playlistSettings, boolean z6, java.lang.String str) {
        this.f6433a = playlistSettings;
        this.f6434b = z6;
        this.f6435c = str;
    }

    public static J5.C0591h1 a(J5.C0591h1 c0591h1, com.kiptv.core.model.PlaylistSettings playlistSettings, boolean z6, java.lang.String str, int i3) {
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
        return new J5.C0591h1(playlistSettings, z6, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J5.C0591h1)) {
            return false;
        }
        J5.C0591h1 c0591h1 = (J5.C0591h1) obj;
        return kotlin.jvm.internal.m.a(this.f6433a, c0591h1.f6433a) && this.f6434b == c0591h1.f6434b && kotlin.jvm.internal.m.a(this.f6435c, c0591h1.f6435c);
    }

    public final int hashCode() {
        com.kiptv.core.model.PlaylistSettings playlistSettings = this.f6433a;
        int iF = p121o0.p.f((playlistSettings == null ? 0 : playlistSettings.hashCode()) * 31, 31, this.f6434b);
        java.lang.String str = this.f6435c;
        return iF + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvMetadataUiState(activeSettings=");
        sb.append(this.f6433a);
        sb.append(", isClearingCache=");
        sb.append(this.f6434b);
        sb.append(", infoMessage=");
        return Y6.f.m(sb, this.f6435c, ")");
    }
}
