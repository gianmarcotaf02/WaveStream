package G5;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f3814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamLiveStream f3815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f3816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3818e;

    public d(java.util.List channels, com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, java.util.List dayGroups, boolean z6, java.lang.String str) {
        kotlin.jvm.internal.m.e(channels, "channels");
        kotlin.jvm.internal.m.e(dayGroups, "dayGroups");
        this.f3814a = channels;
        this.f3815b = xtreamLiveStream;
        this.f3816c = dayGroups;
        this.f3817d = z6;
        this.f3818e = str;
    }

    public static G5.d a(G5.d dVar, java.util.ArrayList arrayList, com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, java.util.ArrayList arrayList2, boolean z6, java.lang.String str, int i3) {
        java.util.List list = arrayList;
        if ((i3 & 1) != 0) {
            list = dVar.f3814a;
        }
        java.util.List channels = list;
        if ((i3 & 2) != 0) {
            xtreamLiveStream = dVar.f3815b;
        }
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream2 = xtreamLiveStream;
        java.util.List list2 = arrayList2;
        if ((i3 & 4) != 0) {
            list2 = dVar.f3816c;
        }
        java.util.List dayGroups = list2;
        if ((i3 & 8) != 0) {
            z6 = dVar.f3817d;
        }
        boolean z9 = z6;
        if ((i3 & 16) != 0) {
            str = dVar.f3818e;
        }
        dVar.getClass();
        kotlin.jvm.internal.m.e(channels, "channels");
        kotlin.jvm.internal.m.e(dayGroups, "dayGroups");
        return new G5.d(channels, xtreamLiveStream2, dayGroups, z9, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G5.d)) {
            return false;
        }
        G5.d dVar = (G5.d) obj;
        return kotlin.jvm.internal.m.a(this.f3814a, dVar.f3814a) && kotlin.jvm.internal.m.a(this.f3815b, dVar.f3815b) && kotlin.jvm.internal.m.a(this.f3816c, dVar.f3816c) && this.f3817d == dVar.f3817d && kotlin.jvm.internal.m.a(this.f3818e, dVar.f3818e);
    }

    public final int hashCode() {
        int iHashCode = this.f3814a.hashCode() * 31;
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream = this.f3815b;
        int iF = p121o0.p.f(B2.a.b((iHashCode + (xtreamLiveStream == null ? 0 : xtreamLiveStream.hashCode())) * 31, 31, this.f3816c), 31, this.f3817d);
        java.lang.String str = this.f3818e;
        return iF + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvReplayUiState(channels=");
        sb.append(this.f3814a);
        sb.append(", selectedChannel=");
        sb.append(this.f3815b);
        sb.append(", dayGroups=");
        sb.append(this.f3816c);
        sb.append(", loading=");
        sb.append(this.f3817d);
        sb.append(", error=");
        return Y6.f.m(sb, this.f3818e, ")");
    }
}
