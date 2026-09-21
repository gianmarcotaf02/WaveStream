package J5;

public final class J1 {

    public final boolean f6130A;

    public final boolean f6131B;

    public final boolean f6132a;

    public final boolean f6133b;

    public final String f6134c;

    public final String f6135d;

    public final String f6136e;

    public final String f6137f;
    public final String g;

    public final String f6138h;

    public final String f6139i;
    public final String j;

    public final String f6140k;

    public final boolean f6141l;

    public final String f6142m;

    public final String f6143n;

    public final String f6144o;

    public final boolean f6145p;

    public final boolean f6146q;

    public final String f6147r;

    public final String f6148s;

    public final String f6149t;

    public final String f6150u;

    public final String f6151v;

    public final String f6152w;

    public final boolean f6153x;
    public final String y;

    public final boolean f6154z;

    public J1(boolean z6, boolean z9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10, String str11, String str12, boolean z11, boolean z12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z13, String str19, boolean z14, boolean z15, boolean z16) {
        this.f6132a = z6;
        this.f6133b = z9;
        this.f6134c = str;
        this.f6135d = str2;
        this.f6136e = str3;
        this.f6137f = str4;
        this.g = str5;
        this.f6138h = str6;
        this.f6139i = str7;
        this.j = str8;
        this.f6140k = str9;
        this.f6141l = z10;
        this.f6142m = str10;
        this.f6143n = str11;
        this.f6144o = str12;
        this.f6145p = z11;
        this.f6146q = z12;
        this.f6147r = str13;
        this.f6148s = str14;
        this.f6149t = str15;
        this.f6150u = str16;
        this.f6151v = str17;
        this.f6152w = str18;
        this.f6153x = z13;
        this.y = str19;
        this.f6154z = z14;
        this.f6130A = z15;
        this.f6131B = z16;
    }

    public static J1 a(J1 j9, boolean z6, boolean z9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10, String str11, String str12, boolean z11, boolean z12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z13, String str19, boolean z14, boolean z15, boolean z16, int i3) {
        boolean z17 = (i3 & 1) != 0 ? j9.f6132a : z6;
        boolean z18 = (i3 & 2) != 0 ? j9.f6133b : z9;
        String defaultStartScreen = (i3 & 4) != 0 ? j9.f6134c : str;
        String defaultSubtitleLanguage = (i3 & 8) != 0 ? j9.f6135d : str2;
        String defaultAudioLanguage = (i3 & 16) != 0 ? j9.f6136e : str3;
        String subtitleFontSize = (i3 & 32) != 0 ? j9.f6137f : str4;
        String subtitleColor = (i3 & 64) != 0 ? j9.g : str5;
        String subtitleBackground = (i3 & 128) != 0 ? j9.f6138h : str6;
        String subtitlePosition = (i3 & 256) != 0 ? j9.f6139i : str7;
        String subtitleStyleSource = (i3 & 512) != 0 ? j9.j : str8;
        String subtitleFontDesign = (i3 & 1024) != 0 ? j9.f6140k : str9;
        boolean z19 = (i3 & 2048) != 0 ? j9.f6141l : z10;
        String subtitleEdgeStyle = (i3 & 4096) != 0 ? j9.f6142m : str10;
        String vodPlayerEngine = (i3 & 8192) != 0 ? j9.f6143n : str11;
        boolean z20 = z17;
        String livePlayerEngine = (i3 & 16384) != 0 ? j9.f6144o : str12;
        boolean z21 = (i3 & 32768) != 0 ? j9.f6145p : z11;
        boolean z22 = (i3 & 65536) != 0 ? j9.f6146q : z12;
        String networkBufferSize = (i3 & 131072) != 0 ? j9.f6147r : str13;
        boolean z23 = z18;
        String hardwareAcceleration = (i3 & 262144) != 0 ? j9.f6148s : str14;
        boolean z24 = z19;
        String deinterlacingMode = (i3 & 524288) != 0 ? j9.f6149t : str15;
        String liveStreamFormat = (i3 & 1048576) != 0 ? j9.f6150u : str16;
        String epgPreviewMode = (i3 & 2097152) != 0 ? j9.f6151v : str17;
        String liveTVPreviewMode = (i3 & 4194304) != 0 ? j9.f6152w : str18;
        boolean z25 = (i3 & 8388608) != 0 ? j9.f6153x : z13;
        String customUserAgent = (i3 & 16777216) != 0 ? j9.y : str19;
        boolean z26 = (i3 & 33554432) != 0 ? j9.f6154z : z14;
        boolean z27 = (i3 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? j9.f6130A : z15;
        boolean z28 = (i3 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? j9.f6131B : z16;
        j9.getClass();
        kotlin.jvm.internal.m.e(defaultStartScreen, "defaultStartScreen");
        kotlin.jvm.internal.m.e(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        kotlin.jvm.internal.m.e(defaultAudioLanguage, "defaultAudioLanguage");
        kotlin.jvm.internal.m.e(subtitleFontSize, "subtitleFontSize");
        kotlin.jvm.internal.m.e(subtitleColor, "subtitleColor");
        kotlin.jvm.internal.m.e(subtitleBackground, "subtitleBackground");
        kotlin.jvm.internal.m.e(subtitlePosition, "subtitlePosition");
        kotlin.jvm.internal.m.e(subtitleStyleSource, "subtitleStyleSource");
        kotlin.jvm.internal.m.e(subtitleFontDesign, "subtitleFontDesign");
        kotlin.jvm.internal.m.e(subtitleEdgeStyle, "subtitleEdgeStyle");
        kotlin.jvm.internal.m.e(vodPlayerEngine, "vodPlayerEngine");
        kotlin.jvm.internal.m.e(livePlayerEngine, "livePlayerEngine");
        kotlin.jvm.internal.m.e(networkBufferSize, "networkBufferSize");
        kotlin.jvm.internal.m.e(hardwareAcceleration, "hardwareAcceleration");
        kotlin.jvm.internal.m.e(deinterlacingMode, "deinterlacingMode");
        kotlin.jvm.internal.m.e(liveStreamFormat, "liveStreamFormat");
        kotlin.jvm.internal.m.e(epgPreviewMode, "epgPreviewMode");
        kotlin.jvm.internal.m.e(liveTVPreviewMode, "liveTVPreviewMode");
        kotlin.jvm.internal.m.e(customUserAgent, "customUserAgent");
        return new J1(z20, z23, defaultStartScreen, defaultSubtitleLanguage, defaultAudioLanguage, subtitleFontSize, subtitleColor, subtitleBackground, subtitlePosition, subtitleStyleSource, subtitleFontDesign, z24, subtitleEdgeStyle, vodPlayerEngine, livePlayerEngine, z21, z22, networkBufferSize, hardwareAcceleration, deinterlacingMode, liveStreamFormat, epgPreviewMode, liveTVPreviewMode, z25, customUserAgent, z26, z27, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J1)) {
            return false;
        }
        J1 j9 = (J1) obj;
        return this.f6132a == j9.f6132a && this.f6133b == j9.f6133b && kotlin.jvm.internal.m.a(this.f6134c, j9.f6134c) && kotlin.jvm.internal.m.a(this.f6135d, j9.f6135d) && kotlin.jvm.internal.m.a(this.f6136e, j9.f6136e) && kotlin.jvm.internal.m.a(this.f6137f, j9.f6137f) && kotlin.jvm.internal.m.a(this.g, j9.g) && kotlin.jvm.internal.m.a(this.f6138h, j9.f6138h) && kotlin.jvm.internal.m.a(this.f6139i, j9.f6139i) && kotlin.jvm.internal.m.a(this.j, j9.j) && kotlin.jvm.internal.m.a(this.f6140k, j9.f6140k) && this.f6141l == j9.f6141l && kotlin.jvm.internal.m.a(this.f6142m, j9.f6142m) && kotlin.jvm.internal.m.a(this.f6143n, j9.f6143n) && kotlin.jvm.internal.m.a(this.f6144o, j9.f6144o) && this.f6145p == j9.f6145p && this.f6146q == j9.f6146q && kotlin.jvm.internal.m.a(this.f6147r, j9.f6147r) && kotlin.jvm.internal.m.a(this.f6148s, j9.f6148s) && kotlin.jvm.internal.m.a(this.f6149t, j9.f6149t) && kotlin.jvm.internal.m.a(this.f6150u, j9.f6150u) && kotlin.jvm.internal.m.a(this.f6151v, j9.f6151v) && kotlin.jvm.internal.m.a(this.f6152w, j9.f6152w) && this.f6153x == j9.f6153x && kotlin.jvm.internal.m.a(this.y, j9.y) && this.f6154z == j9.f6154z && this.f6130A == j9.f6130A && this.f6131B == j9.f6131B;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6131B) + p121o0.p.f(p121o0.p.f(B2.a.a(p121o0.p.f(B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(p121o0.p.f(p121o0.p.f(B2.a.a(B2.a.a(B2.a.a(p121o0.p.f(B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(p121o0.p.f(Boolean.hashCode(this.f6132a) * 31, 31, this.f6133b), 31, this.f6134c), 31, this.f6135d), 31, this.f6136e), 31, this.f6137f), 31, this.g), 31, this.f6138h), 31, this.f6139i), 31, this.j), 31, this.f6140k), 31, this.f6141l), 31, this.f6142m), 31, this.f6143n), 31, this.f6144o), 31, this.f6145p), 31, this.f6146q), 31, this.f6147r), 31, this.f6148s), 31, this.f6149t), 31, this.f6150u), 31, this.f6151v), 31, this.f6152w), 31, this.f6153x), 31, this.y), 31, this.f6154z), 31, this.f6130A);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvPlaybackSettingsUiState(autoplayNextEpisode=");
        sb.append(this.f6132a);
        sb.append(", continueWatchingTapPlays=");
        sb.append(this.f6133b);
        sb.append(", defaultStartScreen=");
        sb.append(this.f6134c);
        sb.append(", defaultSubtitleLanguage=");
        sb.append(this.f6135d);
        sb.append(", defaultAudioLanguage=");
        sb.append(this.f6136e);
        sb.append(", subtitleFontSize=");
        sb.append(this.f6137f);
        sb.append(", subtitleColor=");
        sb.append(this.g);
        sb.append(", subtitleBackground=");
        sb.append(this.f6138h);
        sb.append(", subtitlePosition=");
        sb.append(this.f6139i);
        sb.append(", subtitleStyleSource=");
        sb.append(this.j);
        sb.append(", subtitleFontDesign=");
        sb.append(this.f6140k);
        sb.append(", subtitleBold=");
        sb.append(this.f6141l);
        sb.append(", subtitleEdgeStyle=");
        sb.append(this.f6142m);
        sb.append(", vodPlayerEngine=");
        sb.append(this.f6143n);
        sb.append(", livePlayerEngine=");
        sb.append(this.f6144o);
        sb.append(", allowVodFallback=");
        sb.append(this.f6145p);
        sb.append(", allowLiveFallback=");
        sb.append(this.f6146q);
        sb.append(", networkBufferSize=");
        sb.append(this.f6147r);
        sb.append(", hardwareAcceleration=");
        sb.append(this.f6148s);
        sb.append(", deinterlacingMode=");
        sb.append(this.f6149t);
        sb.append(", liveStreamFormat=");
        sb.append(this.f6150u);
        sb.append(", epgPreviewMode=");
        sb.append(this.f6151v);
        sb.append(", liveTVPreviewMode=");
        sb.append(this.f6152w);
        sb.append(", backgroundPlaybackEnabled=");
        sb.append(this.f6153x);
        sb.append(", customUserAgent=");
        sb.append(this.y);
        sb.append(", isXtreamPlaylist=");
        sb.append(this.f6154z);
        sb.append(", skipIntroEnabled=");
        sb.append(this.f6130A);
        sb.append(", skipIntroAutoSkip=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f6131B, ")");
    }
}
