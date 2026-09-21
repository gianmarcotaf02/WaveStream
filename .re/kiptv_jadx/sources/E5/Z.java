package E5;

/* JADX INFO: loaded from: classes4.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.Playlist f2973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2978f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2979h;

    public Z(com.kiptv.core.model.Playlist playlist, int i3, int i9, int i10, int i11, int i12, int i13, boolean z6) {
        this.f2973a = playlist;
        this.f2974b = i3;
        this.f2975c = i9;
        this.f2976d = i10;
        this.f2977e = i11;
        this.f2978f = i12;
        this.g = i13;
        this.f2979h = z6;
    }

    public static E5.Z a(E5.Z z6, com.kiptv.core.model.Playlist playlist, int i3, int i9, int i10, int i11, int i12, int i13, boolean z9, int i14) {
        if ((i14 & 1) != 0) {
            playlist = z6.f2973a;
        }
        com.kiptv.core.model.Playlist playlist2 = playlist;
        if ((i14 & 2) != 0) {
            i3 = z6.f2974b;
        }
        int i15 = i3;
        if ((i14 & 4) != 0) {
            i9 = z6.f2975c;
        }
        int i16 = i9;
        if ((i14 & 8) != 0) {
            i10 = z6.f2976d;
        }
        int i17 = i10;
        if ((i14 & 16) != 0) {
            i11 = z6.f2977e;
        }
        int i18 = i11;
        if ((i14 & 32) != 0) {
            i12 = z6.f2978f;
        }
        int i19 = i12;
        int i20 = (i14 & 64) != 0 ? z6.g : i13;
        boolean z10 = (i14 & 128) != 0 ? z6.f2979h : z9;
        z6.getClass();
        return new E5.Z(playlist2, i15, i16, i17, i18, i19, i20, z10);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E5.Z)) {
            return false;
        }
        E5.Z z6 = (E5.Z) obj;
        return kotlin.jvm.internal.m.a(this.f2973a, z6.f2973a) && this.f2974b == z6.f2974b && this.f2975c == z6.f2975c && this.f2976d == z6.f2976d && this.f2977e == z6.f2977e && this.f2978f == z6.f2978f && this.g == z6.g && this.f2979h == z6.f2979h;
    }

    public final int hashCode() {
        com.kiptv.core.model.Playlist playlist = this.f2973a;
        return java.lang.Boolean.hashCode(this.f2979h) + p121o0.p.d(this.g, p121o0.p.d(this.f2978f, p121o0.p.d(this.f2977e, p121o0.p.d(this.f2976d, p121o0.p.d(this.f2975c, p121o0.p.d(this.f2974b, (playlist == null ? 0 : playlist.hashCode()) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvPlaylistInfoUiState(playlist=");
        sb.append(this.f2973a);
        sb.append(", moviesCount=");
        sb.append(this.f2974b);
        sb.append(", seriesCount=");
        sb.append(this.f2975c);
        sb.append(", channelsCount=");
        sb.append(this.f2976d);
        sb.append(", movieCategoriesCount=");
        sb.append(this.f2977e);
        sb.append(", seriesCategoriesCount=");
        sb.append(this.f2978f);
        sb.append(", liveCategoriesCount=");
        sb.append(this.g);
        sb.append(", isContentReady=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f2979h, ")");
    }
}
