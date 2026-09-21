package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/LocalDeviceSettings;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class LocalDeviceSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.LocalDeviceSettings.Companion INSTANCE = new com.kiptv.core.model.LocalDeviceSettings.Companion();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.kiptv.core.model.LocalDeviceSettings f19822v = new com.kiptv.core.model.LocalDeviceSettings(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO, true, true, false, false, null, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO, false, "system", "default", false, "none", "channelList", "off", "off", false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f19823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f19824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19828f;
    public java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f19829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f19830i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.String f19831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.String f19833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.String f19834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.String f19836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.lang.String f19837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.lang.String f19838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.lang.String f19839s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19840t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19841u;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kiptv/core/model/LocalDeviceSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/LocalDeviceSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "STORAGE_KEY", "Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public static java.lang.String a(java.lang.String value) {
            kotlin.jvm.internal.m.e(value, "value");
            return (value.equals("onFocus") || value.equals("onTap")) ? value : "off";
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.LocalDeviceSettings$$serializer.INSTANCE;
        }
    }

    public LocalDeviceSettings(java.lang.String str, java.lang.String str2, boolean z6, boolean z9, boolean z10, boolean z11, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z12, java.lang.String str8, java.lang.String str9, boolean z13, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, boolean z14, boolean z15) {
        this.f19823a = str;
        this.f19824b = str2;
        this.f19825c = z6;
        this.f19826d = z9;
        this.f19827e = z10;
        this.f19828f = z11;
        this.g = str3;
        this.f19829h = str4;
        this.f19830i = str5;
        this.j = str6;
        this.f19831k = str7;
        this.f19832l = z12;
        this.f19833m = str8;
        this.f19834n = str9;
        this.f19835o = z13;
        this.f19836p = str10;
        this.f19837q = str11;
        this.f19838r = str12;
        this.f19839s = str13;
        this.f19840t = z14;
        this.f19841u = z15;
    }

    public static com.kiptv.core.model.LocalDeviceSettings a(com.kiptv.core.model.LocalDeviceSettings localDeviceSettings, boolean z6, boolean z9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z10, int i3) {
        java.lang.String vodPlayerEngine = localDeviceSettings.f19823a;
        java.lang.String livePlayerEngine = localDeviceSettings.f19824b;
        boolean z11 = localDeviceSettings.f19825c;
        boolean z12 = localDeviceSettings.f19826d;
        boolean z13 = (i3 & 16) != 0 ? localDeviceSettings.f19827e : z6;
        boolean z14 = (i3 & 32) != 0 ? localDeviceSettings.f19828f : z9;
        java.lang.String str6 = (i3 & 64) != 0 ? localDeviceSettings.g : str;
        java.lang.String networkBufferSize = (i3 & 128) != 0 ? localDeviceSettings.f19829h : str2;
        java.lang.String hardwareAcceleration = (i3 & 256) != 0 ? localDeviceSettings.f19830i : str3;
        java.lang.String deinterlacingMode = (i3 & 512) != 0 ? localDeviceSettings.j : str4;
        java.lang.String liveStreamFormat = localDeviceSettings.f19831k;
        boolean z15 = localDeviceSettings.f19832l;
        java.lang.String subtitleStyleSource = localDeviceSettings.f19833m;
        java.lang.String subtitleFontDesign = localDeviceSettings.f19834n;
        boolean z16 = localDeviceSettings.f19835o;
        java.lang.String subtitleEdgeStyle = localDeviceSettings.f19836p;
        java.lang.String liveTabLayout = (i3 & 65536) != 0 ? localDeviceSettings.f19837q : str5;
        java.lang.String epgPreviewMode = localDeviceSettings.f19838r;
        boolean z17 = z13;
        java.lang.String liveTVPreviewMode = localDeviceSettings.f19839s;
        boolean z18 = z14;
        boolean z19 = (i3 & 524288) != 0 ? localDeviceSettings.f19840t : z10;
        boolean z20 = localDeviceSettings.f19841u;
        localDeviceSettings.getClass();
        kotlin.jvm.internal.m.e(vodPlayerEngine, "vodPlayerEngine");
        kotlin.jvm.internal.m.e(livePlayerEngine, "livePlayerEngine");
        kotlin.jvm.internal.m.e(networkBufferSize, "networkBufferSize");
        kotlin.jvm.internal.m.e(hardwareAcceleration, "hardwareAcceleration");
        kotlin.jvm.internal.m.e(deinterlacingMode, "deinterlacingMode");
        kotlin.jvm.internal.m.e(liveStreamFormat, "liveStreamFormat");
        kotlin.jvm.internal.m.e(subtitleStyleSource, "subtitleStyleSource");
        kotlin.jvm.internal.m.e(subtitleFontDesign, "subtitleFontDesign");
        kotlin.jvm.internal.m.e(subtitleEdgeStyle, "subtitleEdgeStyle");
        kotlin.jvm.internal.m.e(liveTabLayout, "liveTabLayout");
        kotlin.jvm.internal.m.e(epgPreviewMode, "epgPreviewMode");
        kotlin.jvm.internal.m.e(liveTVPreviewMode, "liveTVPreviewMode");
        return new com.kiptv.core.model.LocalDeviceSettings(vodPlayerEngine, livePlayerEngine, z11, z12, z17, z18, str6, networkBufferSize, hardwareAcceleration, deinterlacingMode, liveStreamFormat, z15, subtitleStyleSource, subtitleFontDesign, z16, subtitleEdgeStyle, liveTabLayout, epgPreviewMode, liveTVPreviewMode, z19, z20);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.LocalDeviceSettings)) {
            return false;
        }
        com.kiptv.core.model.LocalDeviceSettings localDeviceSettings = (com.kiptv.core.model.LocalDeviceSettings) obj;
        return kotlin.jvm.internal.m.a(this.f19823a, localDeviceSettings.f19823a) && kotlin.jvm.internal.m.a(this.f19824b, localDeviceSettings.f19824b) && this.f19825c == localDeviceSettings.f19825c && this.f19826d == localDeviceSettings.f19826d && this.f19827e == localDeviceSettings.f19827e && this.f19828f == localDeviceSettings.f19828f && kotlin.jvm.internal.m.a(this.g, localDeviceSettings.g) && kotlin.jvm.internal.m.a(this.f19829h, localDeviceSettings.f19829h) && kotlin.jvm.internal.m.a(this.f19830i, localDeviceSettings.f19830i) && kotlin.jvm.internal.m.a(this.j, localDeviceSettings.j) && kotlin.jvm.internal.m.a(this.f19831k, localDeviceSettings.f19831k) && this.f19832l == localDeviceSettings.f19832l && kotlin.jvm.internal.m.a(this.f19833m, localDeviceSettings.f19833m) && kotlin.jvm.internal.m.a(this.f19834n, localDeviceSettings.f19834n) && this.f19835o == localDeviceSettings.f19835o && kotlin.jvm.internal.m.a(this.f19836p, localDeviceSettings.f19836p) && kotlin.jvm.internal.m.a(this.f19837q, localDeviceSettings.f19837q) && kotlin.jvm.internal.m.a(this.f19838r, localDeviceSettings.f19838r) && kotlin.jvm.internal.m.a(this.f19839s, localDeviceSettings.f19839s) && this.f19840t == localDeviceSettings.f19840t && this.f19841u == localDeviceSettings.f19841u;
    }

    public final int hashCode() {
        int iF = p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(B2.a.a(this.f19823a.hashCode() * 31, 31, this.f19824b), 31, this.f19825c), 31, this.f19826d), 31, this.f19827e), 31, this.f19828f);
        java.lang.String str = this.g;
        return java.lang.Boolean.hashCode(this.f19841u) + p121o0.p.f(B2.a.a(B2.a.a(B2.a.a(B2.a.a(p121o0.p.f(B2.a.a(B2.a.a(p121o0.p.f(B2.a.a(B2.a.a(B2.a.a(B2.a.a((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.f19829h), 31, this.f19830i), 31, this.j), 31, this.f19831k), 31, this.f19832l), 31, this.f19833m), 31, this.f19834n), 31, this.f19835o), 31, this.f19836p), 31, this.f19837q), 31, this.f19838r), 31, this.f19839s), 31, this.f19840t);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f19823a;
        java.lang.String str2 = this.f19824b;
        boolean z6 = this.f19825c;
        boolean z9 = this.f19826d;
        java.lang.String str3 = this.f19831k;
        java.lang.String str4 = this.f19833m;
        java.lang.String str5 = this.f19834n;
        boolean z10 = this.f19835o;
        java.lang.String str6 = this.f19836p;
        java.lang.String str7 = this.f19838r;
        java.lang.String str8 = this.f19839s;
        boolean z11 = this.f19841u;
        java.lang.StringBuilder sbO = Y6.f.o("LocalDeviceSettings(vodPlayerEngine=", str, ", livePlayerEngine=", str2, ", allowVODPlayerEngineFallback=");
        sbO.append(z6);
        sbO.append(", allowLivePlayerEngineFallback=");
        sbO.append(z9);
        sbO.append(", incognitoMode=");
        sbO.append(this.f19827e);
        sbO.append(", autoOpenLastPlaylist=");
        sbO.append(this.f19828f);
        sbO.append(", autoOpenPlaylistId=");
        sbO.append(this.g);
        sbO.append(", networkBufferSize=");
        sbO.append(this.f19829h);
        sbO.append(", hardwareAcceleration=");
        sbO.append(this.f19830i);
        sbO.append(", deinterlacingMode=");
        B2.a.x(sbO, this.j, ", liveStreamFormat=", str3, ", downloadOverCellular=");
        sbO.append(this.f19832l);
        sbO.append(", subtitleStyleSource=");
        sbO.append(str4);
        sbO.append(", subtitleFontDesign=");
        sbO.append(str5);
        sbO.append(", subtitleBold=");
        sbO.append(z10);
        sbO.append(", subtitleEdgeStyle=");
        sbO.append(str6);
        sbO.append(", liveTabLayout=");
        B2.a.x(sbO, this.f19837q, ", epgPreviewMode=", str7, ", liveTVPreviewMode=");
        sbO.append(str8);
        sbO.append(", splitMyListByTag=");
        sbO.append(this.f19840t);
        sbO.append(", backgroundPlaybackEnabled=");
        sbO.append(z11);
        sbO.append(")");
        return sbO.toString();
    }
}
