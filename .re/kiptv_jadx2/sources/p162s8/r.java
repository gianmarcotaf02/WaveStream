package p162s8;

import java.io.Serializable;
import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.d;
import t8.M;

public final class r extends d {

    public final boolean f27420h;

    public final SerialDescriptor f27421i;
    public final String j;

    public r(Serializable body, boolean z6, SerialDescriptor serialDescriptor) {
        m.e(body, "body");
        this.f27420h = z6;
        this.f27421i = serialDescriptor;
        this.j = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override
    public final String d() {
        return this.j;
    }

    @Override
    public final boolean e() {
        return this.f27420h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f27420h == rVar.f27420h && m.a(this.j, rVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + (Boolean.hashCode(this.f27420h) * 31);
    }

    @Override
    public final String toString() {
        boolean z6 = this.f27420h;
        String str = this.j;
        if (!z6) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        M.a(str, sb);
        return sb.toString();
    }
}
