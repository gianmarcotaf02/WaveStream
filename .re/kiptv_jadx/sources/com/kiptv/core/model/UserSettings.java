package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/UserSettings;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class UserSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.UserSettings.Companion INSTANCE = new com.kiptv.core.model.UserSettings.Companion();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.kiptv.core.model.UserSettings f20577s = new com.kiptv.core.model.UserSettings("", "", androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO, "off", androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO, true, "movies", true, true, true, "medium", "#FFFFFF", "semi-transparent", "bottom", "red", "black", null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f20581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.String f20582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20583f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20585i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String f20586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f20587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.String f20588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.String f20589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f20590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f20591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.String f20592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.String f20593r;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/UserSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/UserSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.UserSettings$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserSettings(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z6, java.lang.String str6, boolean z9, boolean z10, boolean z11, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14) {
        if ((i3 & 1) == 0) {
            this.f20578a = "";
        } else {
            this.f20578a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20579b = "";
        } else {
            this.f20579b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20580c = androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO;
        } else {
            this.f20580c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20581d = "off";
        } else {
            this.f20581d = str4;
        }
        if ((i3 & 16) == 0) {
            this.f20582e = androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO;
        } else {
            this.f20582e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20583f = true;
        } else {
            this.f20583f = z6;
        }
        if ((i3 & 64) == 0) {
            this.g = "movies";
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20584h = true;
        } else {
            this.f20584h = z9;
        }
        if ((i3 & 256) == 0) {
            this.f20585i = true;
        } else {
            this.f20585i = z10;
        }
        if ((i3 & 512) == 0) {
            this.j = true;
        } else {
            this.j = z11;
        }
        if ((i3 & 1024) == 0) {
            this.f20586k = "medium";
        } else {
            this.f20586k = str7;
        }
        if ((i3 & 2048) == 0) {
            this.f20587l = "#FFFFFF";
        } else {
            this.f20587l = str8;
        }
        this.f20588m = (i3 & 4096) == 0 ? "semi-transparent" : str9;
        this.f20589n = (i3 & 8192) == 0 ? "bottom" : str10;
        this.f20590o = (i3 & 16384) == 0 ? "red" : str11;
        this.f20591p = (32768 & i3) == 0 ? "black" : str12;
        if ((65536 & i3) == 0) {
            this.f20592q = null;
        } else {
            this.f20592q = str13;
        }
        if ((i3 & 131072) == 0) {
            this.f20593r = null;
        } else {
            this.f20593r = str14;
        }
    }

    public static com.kiptv.core.model.UserSettings a(com.kiptv.core.model.UserSettings userSettings, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i3) {
        java.lang.String id = userSettings.f20578a;
        java.lang.String userId = (i3 & 2) != 0 ? userSettings.f20579b : str;
        java.lang.String appLanguage = (i3 & 4) != 0 ? userSettings.f20580c : str2;
        java.lang.String defaultSubtitleLanguage = userSettings.f20581d;
        java.lang.String defaultAudioLanguage = userSettings.f20582e;
        boolean z6 = userSettings.f20583f;
        java.lang.String defaultStartScreen = userSettings.g;
        boolean z9 = userSettings.f20584h;
        boolean z10 = userSettings.f20585i;
        boolean z11 = userSettings.j;
        java.lang.String subtitleFontSize = userSettings.f20586k;
        java.lang.String subtitleColor = userSettings.f20587l;
        java.lang.String subtitleBackground = userSettings.f20588m;
        java.lang.String subtitlePosition = userSettings.f20589n;
        java.lang.String themePrimaryColor = (i3 & 16384) != 0 ? userSettings.f20590o : str3;
        java.lang.String backgroundStyle = (i3 & 32768) != 0 ? userSettings.f20591p : str4;
        java.lang.String str5 = userSettings.f20592q;
        java.lang.String str6 = userSettings.f20593r;
        userSettings.getClass();
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(userId, "userId");
        kotlin.jvm.internal.m.e(appLanguage, "appLanguage");
        kotlin.jvm.internal.m.e(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        kotlin.jvm.internal.m.e(defaultAudioLanguage, "defaultAudioLanguage");
        kotlin.jvm.internal.m.e(defaultStartScreen, "defaultStartScreen");
        kotlin.jvm.internal.m.e(subtitleFontSize, "subtitleFontSize");
        kotlin.jvm.internal.m.e(subtitleColor, "subtitleColor");
        kotlin.jvm.internal.m.e(subtitleBackground, "subtitleBackground");
        kotlin.jvm.internal.m.e(subtitlePosition, "subtitlePosition");
        kotlin.jvm.internal.m.e(themePrimaryColor, "themePrimaryColor");
        kotlin.jvm.internal.m.e(backgroundStyle, "backgroundStyle");
        return new com.kiptv.core.model.UserSettings(id, userId, appLanguage, defaultSubtitleLanguage, defaultAudioLanguage, z6, defaultStartScreen, z9, z10, z11, subtitleFontSize, subtitleColor, subtitleBackground, subtitlePosition, themePrimaryColor, backgroundStyle, str5, str6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.UserSettings)) {
            return false;
        }
        com.kiptv.core.model.UserSettings userSettings = (com.kiptv.core.model.UserSettings) obj;
        return kotlin.jvm.internal.m.a(this.f20578a, userSettings.f20578a) && kotlin.jvm.internal.m.a(this.f20579b, userSettings.f20579b) && kotlin.jvm.internal.m.a(this.f20580c, userSettings.f20580c) && kotlin.jvm.internal.m.a(this.f20581d, userSettings.f20581d) && kotlin.jvm.internal.m.a(this.f20582e, userSettings.f20582e) && this.f20583f == userSettings.f20583f && kotlin.jvm.internal.m.a(this.g, userSettings.g) && this.f20584h == userSettings.f20584h && this.f20585i == userSettings.f20585i && this.j == userSettings.j && kotlin.jvm.internal.m.a(this.f20586k, userSettings.f20586k) && kotlin.jvm.internal.m.a(this.f20587l, userSettings.f20587l) && kotlin.jvm.internal.m.a(this.f20588m, userSettings.f20588m) && kotlin.jvm.internal.m.a(this.f20589n, userSettings.f20589n) && kotlin.jvm.internal.m.a(this.f20590o, userSettings.f20590o) && kotlin.jvm.internal.m.a(this.f20591p, userSettings.f20591p) && kotlin.jvm.internal.m.a(this.f20592q, userSettings.f20592q) && kotlin.jvm.internal.m.a(this.f20593r, userSettings.f20593r);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(p121o0.p.f(p121o0.p.f(p121o0.p.f(B2.a.a(p121o0.p.f(B2.a.a(B2.a.a(B2.a.a(B2.a.a(this.f20578a.hashCode() * 31, 31, this.f20579b), 31, this.f20580c), 31, this.f20581d), 31, this.f20582e), 31, this.f20583f), 31, this.g), 31, this.f20584h), 31, this.f20585i), 31, this.j), 31, this.f20586k), 31, this.f20587l), 31, this.f20588m), 31, this.f20589n), 31, this.f20590o), 31, this.f20591p);
        java.lang.String str = this.f20592q;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20593r;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f20581d;
        java.lang.String str2 = this.f20582e;
        boolean z6 = this.f20583f;
        boolean z9 = this.j;
        java.lang.String str3 = this.f20586k;
        java.lang.String str4 = this.f20587l;
        java.lang.String str5 = this.f20588m;
        java.lang.String str6 = this.f20589n;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserSettings(id=");
        sb.append(this.f20578a);
        sb.append(", userId=");
        sb.append(this.f20579b);
        sb.append(", appLanguage=");
        B2.a.x(sb, this.f20580c, ", defaultSubtitleLanguage=", str, ", defaultAudioLanguage=");
        sb.append(str2);
        sb.append(", autoplayNextEpisode=");
        sb.append(z6);
        sb.append(", defaultStartScreen=");
        sb.append(this.g);
        sb.append(", recentlyWatchedLive=");
        sb.append(this.f20584h);
        sb.append(", showRecentlyAdded=");
        sb.append(this.f20585i);
        sb.append(", continueWatchingTapPlays=");
        sb.append(z9);
        sb.append(", subtitleFontSize=");
        B2.a.x(sb, str3, ", subtitleColor=", str4, ", subtitleBackground=");
        B2.a.x(sb, str5, ", subtitlePosition=", str6, ", themePrimaryColor=");
        sb.append(this.f20590o);
        sb.append(", backgroundStyle=");
        sb.append(this.f20591p);
        sb.append(", createdAt=");
        sb.append(this.f20592q);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f20593r, ")");
    }

    public UserSettings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z6, java.lang.String str6, boolean z9, boolean z10, boolean z11, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14) {
        this.f20578a = str;
        this.f20579b = str2;
        this.f20580c = str3;
        this.f20581d = str4;
        this.f20582e = str5;
        this.f20583f = z6;
        this.g = str6;
        this.f20584h = z9;
        this.f20585i = z10;
        this.j = z11;
        this.f20586k = str7;
        this.f20587l = str8;
        this.f20588m = str9;
        this.f20589n = str10;
        this.f20590o = str11;
        this.f20591p = str12;
        this.f20592q = str13;
        this.f20593r = str14;
    }
}
