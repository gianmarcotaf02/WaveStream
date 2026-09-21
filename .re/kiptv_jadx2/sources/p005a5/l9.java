package p005a5;

import Y6.f;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class l9 {

    public final Object f14747a;

    public final LinkedHashMap f14748b;

    public final Object f14749c;

    public final HashMap f14750d;

    public final long f14751e;

    public final String f14752f;

    public l9(Map map, LinkedHashMap linkedHashMap, Map map2, HashMap map3, long j, String playlistId) {
        m.e(playlistId, "playlistId");
        this.f14747a = map;
        this.f14748b = linkedHashMap;
        this.f14749c = map2;
        this.f14750d = map3;
        this.f14751e = j;
        this.f14752f = playlistId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return this.f14747a.equals(l9Var.f14747a) && this.f14748b.equals(l9Var.f14748b) && this.f14749c.equals(l9Var.f14749c) && this.f14750d.equals(l9Var.f14750d) && this.f14751e == l9Var.f14751e && m.a(this.f14752f, l9Var.f14752f);
    }

    public final int hashCode() {
        return this.f14752f.hashCode() + p.e((this.f14750d.hashCode() + ((this.f14749c.hashCode() + ((this.f14748b.hashCode() + (this.f14747a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f14751e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Snapshot(programsByChannel=");
        sb.append(this.f14747a);
        sb.append(", programsByChannelLower=");
        sb.append(this.f14748b);
        sb.append(", channelsById=");
        sb.append(this.f14749c);
        sb.append(", idByNormalizedName=");
        sb.append(this.f14750d);
        sb.append(", cachedAtMillis=");
        sb.append(this.f14751e);
        sb.append(", playlistId=");
        return f.m(sb, this.f14752f, ")");
    }
}
