package p153r8;

import com.google.android.gms.internal.play_billing.V0;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p135p8.f;

public final class g0 implements SerialDescriptor {

    public final String f26963a;

    public final f f26964b;

    public g0(String str, f kind) {
        m.e(kind, "kind");
        this.f26963a = str;
        this.f26964b = kind;
    }

    @Override
    public final String a() {
        return this.f26963a;
    }

    public final void b() {
        throw new IllegalStateException(Y6.f.m(new StringBuilder("Primitive descriptor "), this.f26963a, " does not have elements"));
    }

    @Override
    public final V0 c() {
        return this.f26964b;
    }

    @Override
    public final int e(String name) {
        m.e(name, "name");
        b();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (m.a(this.f26963a, g0Var.f26963a)) {
            if (m.a(this.f26964b, g0Var.f26964b)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final String g(int i3) {
        b();
        throw null;
    }

    @Override
    public final List h(int i3) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.f26964b.hashCode() * 31) + this.f26963a.hashCode();
    }

    @Override
    public final SerialDescriptor i(int i3) {
        b();
        throw null;
    }

    @Override
    public final boolean j(int i3) {
        b();
        throw null;
    }

    public final String toString() {
        return Y6.f.l(new StringBuilder("PrimitiveDescriptor("), this.f26963a, ')');
    }
}
