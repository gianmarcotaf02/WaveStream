package p193x5;

/* JADX INFO: renamed from: x5.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3143t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f31641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f31643d;

    public C3143t0(int i3, int i9, java.lang.String str, java.lang.String channelName) {
        kotlin.jvm.internal.m.e(channelName, "channelName");
        this.f31640a = i3;
        this.f31641b = str;
        this.f31642c = i9;
        this.f31643d = channelName;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p193x5.C3143t0)) {
            return false;
        }
        p193x5.C3143t0 c3143t0 = (p193x5.C3143t0) obj;
        return this.f31640a == c3143t0.f31640a && kotlin.jvm.internal.m.a(this.f31641b, c3143t0.f31641b) && this.f31642c == c3143t0.f31642c && kotlin.jvm.internal.m.a(this.f31643d, c3143t0.f31643d);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f31640a) * 31;
        java.lang.String str = this.f31641b;
        return this.f31643d.hashCode() + p121o0.p.d(this.f31642c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EpgFocusRequest(streamId=");
        sb.append(this.f31640a);
        sb.append(", epgChannelId=");
        sb.append(this.f31641b);
        sb.append(", offsetMinutes=");
        sb.append(this.f31642c);
        sb.append(", channelName=");
        return Y6.f.m(sb, this.f31643d, ")");
    }
}
