package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class C {
    public static final p099l5.B Companion = new p099l5.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f24759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f24760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f24761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f24762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p099l5.A f24763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f24764f;
    public final p099l5.z g;

    public C(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, p099l5.A audioSource, java.lang.Integer num2, p099l5.z zVar) {
        kotlin.jvm.internal.m.e(audioSource, "audioSource");
        this.f24759a = str;
        this.f24760b = num;
        this.f24761c = str2;
        this.f24762d = str3;
        this.f24763e = audioSource;
        this.f24764f = num2;
        this.g = zVar;
    }

    public final p086j6.b a(p099l5.EnumC2549b engineType) {
        java.lang.String strA;
        kotlin.jvm.internal.m.e(engineType, "engineType");
        boolean z6 = engineType == p099l5.EnumC2549b.ExoPlayer;
        p086j6.b bVarU = com.google.common.util.concurrent.P.U();
        java.lang.String str = this.f24759a;
        if (str != null) {
            java.lang.Integer num = this.f24760b;
            if ((num != null ? num.intValue() : 0) > 0) {
                str = str + " · " + num + " FPS";
            }
        }
        if (str != null) {
            bVarU.add(str);
        }
        java.lang.String str2 = this.f24761c;
        boolean zA = kotlin.jvm.internal.m.a(str2, "Dolby Vision");
        java.lang.String str3 = this.f24762d;
        if (!zA || z6) {
            if (str2 == null) {
                str2 = str3;
            }
            if (str2 != null) {
                bVarU.add(str2);
            }
        } else if (str3 != null) {
            bVarU.add(str3);
        }
        p099l5.A a2 = p099l5.A.f24751n;
        p099l5.A a9 = this.f24763e;
        if (a9 == a2 && !z6) {
            a9 = p099l5.A.f24750m;
        }
        int iOrdinal = a9.ordinal();
        java.lang.Integer num2 = this.f24764f;
        switch (iOrdinal) {
            case 0:
                strA = p099l5.A.a(num2 != null ? num2.intValue() : 0);
                break;
            case 1:
                strA = "Mono";
                break;
            case 2:
                strA = "Stereo";
                break;
            case 3:
                strA = p099l5.A.a(num2 != null ? num2.intValue() : 0);
                break;
            case 4:
                strA = "Dolby Digital";
                break;
            case 5:
                strA = "Dolby Digital Plus";
                break;
            case 6:
                strA = "Dolby Atmos";
                break;
            case 7:
                strA = "Dolby TrueHD";
                break;
            case 8:
                strA = "DTS";
                break;
            case 9:
                strA = "DTS-HD";
                break;
            case 10:
                java.lang.String strA2 = p099l5.A.a(num2 != null ? num2.intValue() : 0);
                if (strA2 == null || (strA = strA2.concat(" AAC")) == null) {
                    strA = "AAC";
                }
                break;
            case 11:
                strA = "Opus";
                break;
            case 12:
                strA = "FLAC";
                break;
            default:
                throw new I3.b();
        }
        if (strA != null) {
            bVarU.add(strA);
        }
        return com.google.common.util.concurrent.P.M(bVarU);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p099l5.C)) {
            return false;
        }
        p099l5.C c9 = (p099l5.C) obj;
        return kotlin.jvm.internal.m.a(this.f24759a, c9.f24759a) && kotlin.jvm.internal.m.a(this.f24760b, c9.f24760b) && kotlin.jvm.internal.m.a(this.f24761c, c9.f24761c) && kotlin.jvm.internal.m.a(this.f24762d, c9.f24762d) && this.f24763e == c9.f24763e && kotlin.jvm.internal.m.a(this.f24764f, c9.f24764f) && this.g == c9.g;
    }

    public final int hashCode() {
        java.lang.String str = this.f24759a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Integer num = this.f24760b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str2 = this.f24761c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f24762d;
        int iHashCode4 = (this.f24763e.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        java.lang.Integer num2 = this.f24764f;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        p099l5.z zVar = this.g;
        return iHashCode5 + (zVar != null ? zVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "StreamMediaInfo(resolutionLabel=" + this.f24759a + ", frameRate=" + this.f24760b + ", dynamicRange=" + this.f24761c + ", videoCodec=" + this.f24762d + ", audioSource=" + this.f24763e + ", audioChannelCount=" + this.f24764f + ", audioOutput=" + this.g + ")";
    }

    public /* synthetic */ C(java.lang.String str, java.lang.Integer num, java.lang.String str2, p099l5.A a2, java.lang.Integer num2, p099l5.z zVar, int i3) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : num, (java.lang.String) null, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? p099l5.A.f24746h : a2, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : zVar);
    }
}
