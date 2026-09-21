package p063g8;

import h8.a;
import kotlin.jvm.internal.m;
import p080i8.p;

public final class c implements n {

    public final j f22371a;

    public c(j jVar) {
        this.f22371a = jVar;
    }

    @Override
    public final a a() {
        return this.f22371a.a();
    }

    @Override
    public final p b() {
        return this.f22371a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return m.a(this.f22371a, ((c) obj).f22371a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22371a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.f22371a + ')';
    }
}
