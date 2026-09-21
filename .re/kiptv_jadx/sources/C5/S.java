package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5.EnumC0107f f1115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f1116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f1117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f1118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5.W f1119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1120f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1122i;

    public S(C5.EnumC0107f enumC0107f, java.util.List list, java.lang.String activeTileId, java.lang.String str, C5.W layout, boolean z6, int i3, int i9, int i10) {
        kotlin.jvm.internal.m.e(activeTileId, "activeTileId");
        kotlin.jvm.internal.m.e(layout, "layout");
        this.f1115a = enumC0107f;
        this.f1116b = list;
        this.f1117c = activeTileId;
        this.f1118d = str;
        this.f1119e = layout;
        this.f1120f = z6;
        this.g = i3;
        this.f1121h = i9;
        this.f1122i = i10;
    }

    public static C5.S a(C5.S s9, C5.EnumC0107f enumC0107f, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, C5.W w6, boolean z6, int i3, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            enumC0107f = s9.f1115a;
        }
        C5.EnumC0107f enumC0107f2 = enumC0107f;
        java.util.List list = arrayList;
        if ((i11 & 2) != 0) {
            list = s9.f1116b;
        }
        java.util.List list2 = list;
        if ((i11 & 4) != 0) {
            str = s9.f1117c;
        }
        java.lang.String activeTileId = str;
        if ((i11 & 8) != 0) {
            str2 = s9.f1118d;
        }
        java.lang.String str3 = str2;
        if ((i11 & 16) != 0) {
            w6 = s9.f1119e;
        }
        C5.W layout = w6;
        boolean z9 = (i11 & 32) != 0 ? s9.f1120f : z6;
        int i12 = (i11 & 64) != 0 ? s9.g : i3;
        int i13 = (i11 & 128) != 0 ? s9.f1121h : i9;
        int i14 = (i11 & 256) != 0 ? s9.f1122i : i10;
        kotlin.jvm.internal.m.e(activeTileId, "activeTileId");
        kotlin.jvm.internal.m.e(layout, "layout");
        return new C5.S(enumC0107f2, list2, activeTileId, str3, layout, z9, i12, i13, i14);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.S)) {
            return false;
        }
        C5.S s9 = (C5.S) obj;
        return this.f1115a == s9.f1115a && kotlin.jvm.internal.m.a(this.f1116b, s9.f1116b) && kotlin.jvm.internal.m.a(this.f1117c, s9.f1117c) && kotlin.jvm.internal.m.a(this.f1118d, s9.f1118d) && this.f1119e == s9.f1119e && this.f1120f == s9.f1120f && this.g == s9.g && this.f1121h == s9.f1121h && this.f1122i == s9.f1122i;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.b(this.f1115a.hashCode() * 31, 31, this.f1116b), 31, this.f1117c);
        java.lang.String str = this.f1118d;
        return java.lang.Integer.hashCode(this.f1122i) + p121o0.p.d(this.f1121h, p121o0.p.d(this.g, p121o0.p.f((this.f1119e.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f1120f), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvFloatingPlaybackState(mode=");
        sb.append(this.f1115a);
        sb.append(", tiles=");
        sb.append(this.f1116b);
        sb.append(", activeTileId=");
        sb.append(this.f1117c);
        sb.append(", primaryTileId=");
        sb.append(this.f1118d);
        sb.append(", layout=");
        sb.append(this.f1119e);
        sb.append(", surfacesReady=");
        sb.append(this.f1120f);
        sb.append(", surfaceGeneration=");
        sb.append(this.g);
        sb.append(", maxReachedTick=");
        sb.append(this.f1121h);
        sb.append(", vodBlockedTick=");
        return Y6.f.k(sb, this.f1122i, ")");
    }
}
