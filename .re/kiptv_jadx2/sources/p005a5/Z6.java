package p005a5;

import B2.a;
import com.google.android.gms.internal.play_billing.M0;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class Z6 {

    public final String f14173a;

    public final String f14174b;

    public final boolean f14175c;

    public final boolean f14176d;

    public final boolean f14177e;

    public Z6(String str, String str2, boolean z6, boolean z9, boolean z10) {
        this.f14173a = str;
        this.f14174b = str2;
        this.f14175c = z6;
        this.f14176d = z9;
        this.f14177e = z10;
    }

    public final boolean a() {
        return this.f14176d;
    }

    public final boolean b() {
        return this.f14177e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z6)) {
            return false;
        }
        Z6 z6 = (Z6) obj;
        return m.a(this.f14173a, z6.f14173a) && m.a(this.f14174b, z6.f14174b) && this.f14175c == z6.f14175c && this.f14176d == z6.f14176d && this.f14177e == z6.f14177e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14177e) + p.f(p.f(a.a(this.f14173a.hashCode() * 31, 31, this.f14174b), 31, this.f14175c), 31, this.f14176d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Context(userId=");
        sb.append(this.f14173a);
        sb.append(", playlistId=");
        sb.append(this.f14174b);
        sb.append(", pullWatched=");
        sb.append(this.f14175c);
        sb.append(", pullPlayback=");
        sb.append(this.f14176d);
        sb.append(", syncWatchlist=");
        return M0.o(sb, this.f14177e, ")");
    }
}
