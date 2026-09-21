package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements p063g8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p063g8.j f22371a;

    public c(p063g8.j jVar) {
        this.f22371a = jVar;
    }

    @Override // p063g8.k
    public final h8.a a() {
        return this.f22371a.a();
    }

    @Override // p063g8.k
    public final p080i8.p b() {
        return this.f22371a.b();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p063g8.c) {
            return kotlin.jvm.internal.m.a(this.f22371a, ((p063g8.c) obj).f22371a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22371a.hashCode();
    }

    public final java.lang.String toString() {
        return "BasicFormatStructure(" + this.f22371a + ')';
    }
}
