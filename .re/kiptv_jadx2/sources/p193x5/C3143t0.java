package p193x5;

import Y6.f;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C3143t0 {

    public final int f31640a;

    public final String f31641b;

    public final int f31642c;

    public final String f31643d;

    public C3143t0(int i3, int i9, String str, String channelName) {
        m.e(channelName, "channelName");
        this.f31640a = i3;
        this.f31641b = str;
        this.f31642c = i9;
        this.f31643d = channelName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3143t0)) {
            return false;
        }
        C3143t0 c3143t0 = (C3143t0) obj;
        return this.f31640a == c3143t0.f31640a && m.a(this.f31641b, c3143t0.f31641b) && this.f31642c == c3143t0.f31642c && m.a(this.f31643d, c3143t0.f31643d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f31640a) * 31;
        String str = this.f31641b;
        return this.f31643d.hashCode() + p.d(this.f31642c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpgFocusRequest(streamId=");
        sb.append(this.f31640a);
        sb.append(", epgChannelId=");
        sb.append(this.f31641b);
        sb.append(", offsetMinutes=");
        sb.append(this.f31642c);
        sb.append(", channelName=");
        return f.m(sb, this.f31643d, ")");
    }
}
