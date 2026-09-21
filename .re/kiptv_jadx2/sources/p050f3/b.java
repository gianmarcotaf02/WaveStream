package p050f3;

import Y6.f;
import android.content.Context;

public final class b extends c {

    public final Context f21684a;

    public final V1.b f21685b;

    public final V1.b f21686c;

    public final String f21687d;

    public b(Context context, V1.b bVar, V1.b bVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f21684a = context;
        if (bVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f21685b = bVar;
        if (bVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f21686c = bVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f21687d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f21684a.equals(((b) cVar).f21684a)) {
                b bVar = (b) cVar;
                if (this.f21685b.equals(bVar.f21685b) && this.f21686c.equals(bVar.f21686c) && this.f21687d.equals(bVar.f21687d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f21684a.hashCode() ^ 1000003) * 1000003) ^ this.f21685b.hashCode()) * 1000003) ^ this.f21686c.hashCode()) * 1000003) ^ this.f21687d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f21684a);
        sb.append(", wallClock=");
        sb.append(this.f21685b);
        sb.append(", monotonicClock=");
        sb.append(this.f21686c);
        sb.append(", backendName=");
        return f.m(sb, this.f21687d, "}");
    }
}
