package p153r8;

import com.google.android.gms.internal.play_billing.V0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class j0 implements SerialDescriptor, InterfaceC2701l {

    public final SerialDescriptor f26973a;

    public final String f26974b;

    public final Set f26975c;

    public j0(SerialDescriptor original) {
        m.e(original, "original");
        this.f26973a = original;
        this.f26974b = original.a() + '?';
        this.f26975c = AbstractC2686a0.b(original);
    }

    @Override
    public final String a() {
        return this.f26974b;
    }

    @Override
    public final Set b() {
        return this.f26975c;
    }

    @Override
    public final V0 c() {
        return this.f26973a.c();
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final int e(String name) {
        m.e(name, "name");
        return this.f26973a.e(name);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return m.a(this.f26973a, ((j0) obj).f26973a);
        }
        return false;
    }

    @Override
    public final int f() {
        return this.f26973a.f();
    }

    @Override
    public final String g(int i3) {
        return this.f26973a.g(i3);
    }

    @Override
    public final List getAnnotations() {
        return this.f26973a.getAnnotations();
    }

    @Override
    public final List h(int i3) {
        return this.f26973a.h(i3);
    }

    public final int hashCode() {
        return this.f26973a.hashCode() * 31;
    }

    @Override
    public final SerialDescriptor i(int i3) {
        return this.f26973a.i(i3);
    }

    @Override
    public final boolean isInline() {
        return this.f26973a.isInline();
    }

    @Override
    public final boolean j(int i3) {
        return this.f26973a.j(i3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26973a);
        sb.append('?');
        return sb.toString();
    }
}
