package I2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends M8.q {
    public final M8.w j;

    public c(M8.w delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.j = delegate;
    }

    @Override // M8.q
    public final M8.v B(M8.A a2) {
        return this.j.B(a2);
    }

    @Override // M8.q
    public final M8.I G(M8.A a2, boolean z6) {
        M8.A aC = a2.c();
        if (aC != null) {
            b(aC);
        }
        return this.j.G(a2, z6);
    }

    @Override // M8.q
    public final M8.K N(M8.A file) {
        kotlin.jvm.internal.m.e(file, "file");
        return this.j.N(file);
    }

    public final void P(M8.A source, M8.A target) throws java.io.IOException {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(target, "target");
        this.j.P(source, target);
    }

    @Override // M8.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.getClass();
    }

    @Override // M8.q
    public final void e(M8.A dir) throws java.io.IOException {
        kotlin.jvm.internal.m.e(dir, "dir");
        this.j.e(dir);
    }

    @Override // M8.q
    public final void i(M8.A path) throws java.io.IOException {
        kotlin.jvm.internal.m.e(path, "path");
        this.j.i(path);
    }

    public final java.lang.String toString() {
        return kotlin.jvm.internal.B.f24540a.b(I2.c.class).h() + '(' + this.j + ')';
    }

    @Override // M8.q
    public final java.util.List u(M8.A a2) throws java.io.IOException {
        java.util.List listU = this.j.u(a2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (M8.A path : (java.util.ArrayList) listU) {
            kotlin.jvm.internal.m.e(path, "path");
            arrayList.add(path);
        }
        p078i6.t.K0(arrayList);
        return arrayList;
    }

    @Override // M8.q
    public final M8.p z(M8.A path) {
        kotlin.jvm.internal.m.e(path, "path");
        M8.p pVarZ = this.j.z(path);
        if (pVarZ == null) {
            return null;
        }
        M8.A a2 = pVarZ.f7270c;
        if (a2 == null) {
            return pVarZ;
        }
        java.util.Map extras = pVarZ.f7274h;
        kotlin.jvm.internal.m.e(extras, "extras");
        return new M8.p(pVarZ.f7268a, pVarZ.f7269b, a2, pVarZ.f7271d, pVarZ.f7272e, pVarZ.f7273f, pVarZ.g, extras);
    }
}
