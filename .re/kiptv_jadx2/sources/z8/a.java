package z8;

import kotlin.jvm.internal.m;

public abstract class a {

    public final String f32956a;

    public final boolean f32957b;

    public b f32958c;

    public long f32959d;

    public a(String name, boolean z6) {
        m.e(name, "name");
        this.f32956a = name;
        this.f32957b = z6;
        this.f32959d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f32956a;
    }
}
