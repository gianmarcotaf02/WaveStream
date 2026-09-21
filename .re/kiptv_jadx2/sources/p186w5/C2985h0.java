package p186w5;

import B2.a;
import com.kiptv.core.model.A;
import kotlin.jvm.internal.m;

public final class C2985h0 {

    public final String f30235a;

    public final A f30236b;

    public final String f30237c;

    public final InterfaceC2983g0 f30238d;

    public C2985h0(String id, A kind, String str, InterfaceC2983g0 interfaceC2983g0) {
        m.e(id, "id");
        m.e(kind, "kind");
        this.f30235a = id;
        this.f30236b = kind;
        this.f30237c = str;
        this.f30238d = interfaceC2983g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2985h0)) {
            return false;
        }
        C2985h0 c2985h0 = (C2985h0) obj;
        return m.a(this.f30235a, c2985h0.f30235a) && this.f30236b == c2985h0.f30236b && m.a(this.f30237c, c2985h0.f30237c) && m.a(this.f30238d, c2985h0.f30238d);
    }

    public final int hashCode() {
        return this.f30238d.hashCode() + a.a((this.f30236b.hashCode() + (this.f30235a.hashCode() * 31)) * 31, 31, this.f30237c);
    }

    public final String toString() {
        return "TvHomeRow(id=" + this.f30235a + ", kind=" + this.f30236b + ", title=" + this.f30237c + ", content=" + this.f30238d + ")";
    }
}
