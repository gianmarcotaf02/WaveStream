package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/UserSettingsUpsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class UserSettingsUpsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.UserSettingsUpsert.Companion INSTANCE = new com.kiptv.core.model.UserSettingsUpsert.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20599f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20601i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f20602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f20603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f20604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f20605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f20606o;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/UserSettingsUpsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/UserSettingsUpsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.UserSettingsUpsert$$serializer.INSTANCE;
        }
    }

    public UserSettingsUpsert(com.kiptv.core.model.UserSettings settings) {
        kotlin.jvm.internal.m.e(settings, "settings");
        java.lang.String defaultSubtitleLanguage = settings.f20581d;
        java.lang.String defaultAudioLanguage = settings.f20582e;
        boolean z6 = settings.f20583f;
        boolean z9 = settings.j;
        java.lang.String subtitleFontSize = settings.f20586k;
        java.lang.String subtitleColor = settings.f20587l;
        java.lang.String subtitleBackground = settings.f20588m;
        java.lang.String subtitlePosition = settings.f20589n;
        java.lang.String userId = settings.f20579b;
        kotlin.jvm.internal.m.e(userId, "userId");
        java.lang.String appLanguage = settings.f20580c;
        kotlin.jvm.internal.m.e(appLanguage, "appLanguage");
        kotlin.jvm.internal.m.e(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        kotlin.jvm.internal.m.e(defaultAudioLanguage, "defaultAudioLanguage");
        java.lang.String defaultStartScreen = settings.g;
        kotlin.jvm.internal.m.e(defaultStartScreen, "defaultStartScreen");
        kotlin.jvm.internal.m.e(subtitleFontSize, "subtitleFontSize");
        kotlin.jvm.internal.m.e(subtitleColor, "subtitleColor");
        kotlin.jvm.internal.m.e(subtitleBackground, "subtitleBackground");
        kotlin.jvm.internal.m.e(subtitlePosition, "subtitlePosition");
        java.lang.String themePrimaryColor = settings.f20590o;
        kotlin.jvm.internal.m.e(themePrimaryColor, "themePrimaryColor");
        java.lang.String backgroundStyle = settings.f20591p;
        kotlin.jvm.internal.m.e(backgroundStyle, "backgroundStyle");
        this.f20594a = userId;
        this.f20595b = appLanguage;
        this.f20596c = defaultSubtitleLanguage;
        this.f20597d = defaultAudioLanguage;
        this.f20598e = z6;
        this.f20599f = defaultStartScreen;
        this.g = settings.f20584h;
        this.f20600h = settings.f20585i;
        this.f20601i = z9;
        this.j = subtitleFontSize;
        this.f20602k = subtitleColor;
        this.f20603l = subtitleBackground;
        this.f20604m = subtitlePosition;
        this.f20605n = themePrimaryColor;
        this.f20606o = backgroundStyle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.UserSettingsUpsert)) {
            return false;
        }
        com.kiptv.core.model.UserSettingsUpsert userSettingsUpsert = (com.kiptv.core.model.UserSettingsUpsert) obj;
        return kotlin.jvm.internal.m.a(this.f20594a, userSettingsUpsert.f20594a) && kotlin.jvm.internal.m.a(this.f20595b, userSettingsUpsert.f20595b) && kotlin.jvm.internal.m.a(this.f20596c, userSettingsUpsert.f20596c) && kotlin.jvm.internal.m.a(this.f20597d, userSettingsUpsert.f20597d) && this.f20598e == userSettingsUpsert.f20598e && kotlin.jvm.internal.m.a(this.f20599f, userSettingsUpsert.f20599f) && this.g == userSettingsUpsert.g && this.f20600h == userSettingsUpsert.f20600h && this.f20601i == userSettingsUpsert.f20601i && kotlin.jvm.internal.m.a(this.j, userSettingsUpsert.j) && kotlin.jvm.internal.m.a(this.f20602k, userSettingsUpsert.f20602k) && kotlin.jvm.internal.m.a(this.f20603l, userSettingsUpsert.f20603l) && kotlin.jvm.internal.m.a(this.f20604m, userSettingsUpsert.f20604m) && kotlin.jvm.internal.m.a(this.f20605n, userSettingsUpsert.f20605n) && kotlin.jvm.internal.m.a(this.f20606o, userSettingsUpsert.f20606o);
    }

    public final int hashCode() {
        return this.f20606o.hashCode() + B2.a.a(B2.a.a(B2.a.a(B2.a.a(B2.a.a(p121o0.p.f(p121o0.p.f(p121o0.p.f(B2.a.a(p121o0.p.f(B2.a.a(B2.a.a(B2.a.a(this.f20594a.hashCode() * 31, 31, this.f20595b), 31, this.f20596c), 31, this.f20597d), 31, this.f20598e), 31, this.f20599f), 31, this.g), 31, this.f20600h), 31, this.f20601i), 31, this.j), 31, this.f20602k), 31, this.f20603l), 31, this.f20604m), 31, this.f20605n);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserSettingsUpsert(userId=");
        sb.append(this.f20594a);
        sb.append(", appLanguage=");
        sb.append(this.f20595b);
        sb.append(", defaultSubtitleLanguage=");
        sb.append(this.f20596c);
        sb.append(", defaultAudioLanguage=");
        sb.append(this.f20597d);
        sb.append(", autoplayNextEpisode=");
        sb.append(this.f20598e);
        sb.append(", defaultStartScreen=");
        sb.append(this.f20599f);
        sb.append(", recentlyWatchedLive=");
        sb.append(this.g);
        sb.append(", showRecentlyAdded=");
        sb.append(this.f20600h);
        sb.append(", continueWatchingTapPlays=");
        sb.append(this.f20601i);
        sb.append(", subtitleFontSize=");
        sb.append(this.j);
        sb.append(", subtitleColor=");
        sb.append(this.f20602k);
        sb.append(", subtitleBackground=");
        sb.append(this.f20603l);
        sb.append(", subtitlePosition=");
        sb.append(this.f20604m);
        sb.append(", themePrimaryColor=");
        sb.append(this.f20605n);
        sb.append(", backgroundStyle=");
        return Y6.f.m(sb, this.f20606o, ")");
    }

    public /* synthetic */ UserSettingsUpsert(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z6, java.lang.String str5, boolean z9, boolean z10, boolean z11, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11) {
        if (32767 != (i3 & 32767)) {
            p153r8.AbstractC2686a0.l(i3, 32767, com.kiptv.core.model.UserSettingsUpsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20594a = str;
        this.f20595b = str2;
        this.f20596c = str3;
        this.f20597d = str4;
        this.f20598e = z6;
        this.f20599f = str5;
        this.g = z9;
        this.f20600h = z10;
        this.f20601i = z11;
        this.j = str6;
        this.f20602k = str7;
        this.f20603l = str8;
        this.f20604m = str9;
        this.f20605n = str10;
        this.f20606o = str11;
    }
}
