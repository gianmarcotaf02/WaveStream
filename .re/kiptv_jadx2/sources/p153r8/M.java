package p153r8;

import O7.x;
import com.google.android.gms.internal.play_billing.V0;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p078i6.w;
import p121o0.p;
import p135p8.j;

public abstract class M implements SerialDescriptor {

    public final SerialDescriptor f26918a;

    public M(SerialDescriptor serialDescriptor) {
        this.f26918a = serialDescriptor;
    }

    @Override
    public final V0 c() {
        return j.g;
    }

    @Override
    public final int e(String name) {
        m.e(name, "name");
        Integer numZ0 = x.z0(name);
        if (numZ0 != null) {
            return numZ0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        return m.a(this.f26918a, m8.f26918a) && m.a(a(), m8.a());
    }

    @Override
    public final int f() {
        return 1;
    }

    @Override
    public final String g(int i3) {
        return String.valueOf(i3);
    }

    @Override
    public final List h(int i3) {
        if (i3 >= 0) {
            return w.f23205h;
        }
        StringBuilder sbT = p.t(i3, "Illegal index ", ", ");
        sbT.append(a());
        sbT.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f26918a.hashCode() * 31);
    }

    @Override
    public final SerialDescriptor i(int i3) {
        if (i3 >= 0) {
            return this.f26918a;
        }
        StringBuilder sbT = p.t(i3, "Illegal index ", ", ");
        sbT.append(a());
        sbT.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    @Override
    public final boolean j(int i3) {
        if (i3 >= 0) {
            return false;
        }
        StringBuilder sbT = p.t(i3, "Illegal index ", ", ");
        sbT.append(a());
        sbT.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f26918a + ')';
    }
}
