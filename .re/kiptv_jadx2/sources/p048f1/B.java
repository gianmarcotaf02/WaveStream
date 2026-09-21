package p048f1;

import B2.a;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class B {

    public final i f21625a;

    public final s f21626b;

    public final int f21627c;

    public final int f21628d;

    public final Object f21629e;

    public B(i iVar, s sVar, int i3, int i9, Object obj) {
        this.f21625a = iVar;
        this.f21626b = sVar;
        this.f21627c = i3;
        this.f21628d = i9;
        this.f21629e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b9 = (B) obj;
        return m.a(this.f21625a, b9.f21625a) && m.a(this.f21626b, b9.f21626b) && this.f21627c == b9.f21627c && this.f21628d == b9.f21628d && m.a(this.f21629e, b9.f21629e);
    }

    public final int hashCode() {
        i iVar = this.f21625a;
        int iD = p.d(this.f21628d, p.d(this.f21627c, (((iVar == null ? 0 : iVar.hashCode()) * 31) + this.f21626b.f21672h) * 31, 31), 31);
        Object obj = this.f21629e;
        return iD + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f21625a);
        sb.append(", fontWeight=");
        sb.append(this.f21626b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i3 = this.f21627c;
        if (i3 == 0) {
            str = "Normal";
        } else {
            str = i3 == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i9 = this.f21628d;
        if (i9 == 0) {
            str2 = "None";
        } else if (i9 == 1) {
            str2 = "Weight";
        } else if (i9 == 2) {
            str2 = "Style";
        } else if (i9 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        return a.n(sb, this.f21629e, ')');
    }
}
