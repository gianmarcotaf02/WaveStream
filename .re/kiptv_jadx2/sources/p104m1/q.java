package p104m1;

import com.google.common.util.concurrent.D;
import p113n1.p;

public final class q {

    public static final q f25185c = new q(D.w(0), D.w(0));

    public final long f25186a;

    public final long f25187b;

    public q(long j, long j9) {
        this.f25186a = j;
        this.f25187b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p.a(this.f25186a, qVar.f25186a) && p.a(this.f25187b, qVar.f25187b);
    }

    public final int hashCode() {
        p113n1.q[] qVarArr = p.f25569b;
        return Long.hashCode(this.f25187b) + (Long.hashCode(this.f25186a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) p.d(this.f25186a)) + ", restLine=" + ((Object) p.d(this.f25187b)) + ')';
    }
}
