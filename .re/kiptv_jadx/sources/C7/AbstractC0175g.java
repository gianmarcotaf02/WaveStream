package C7;

/* JADX INFO: renamed from: C7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0175g implements C7.M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B7.d f1587b;

    public AbstractC0175g(B7.p storageManager) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.f1587b = new B7.d((B7.m) storageManager, new A7.k(3, this), new C7.C0173e(0, this));
    }

    public abstract java.util.Collection b();

    public abstract C7.AbstractC0191x c();

    public abstract N6.Q d();

    @Override // C7.M
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final java.util.List i() {
        return ((C7.C0174f) this.f1587b.invoke()).f1585b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C7.M) && obj.hashCode() == hashCode()) {
            C7.M m8 = (C7.M) obj;
            if (m8.getParameters().size() == getParameters().size()) {
                N6.InterfaceC0694h interfaceC0694hH = h();
                N6.InterfaceC0694h interfaceC0694hH2 = m8.h();
                if (interfaceC0694hH2 == null || E7.l.f(interfaceC0694hH) || p127o7.d.o(interfaceC0694hH) || E7.l.f(interfaceC0694hH2) || p127o7.d.o(interfaceC0694hH2)) {
                    return false;
                }
                return f(interfaceC0694hH2);
            }
        }
        return false;
    }

    public abstract boolean f(N6.InterfaceC0694h interfaceC0694h);

    public final int hashCode() {
        int i3 = this.f1586a;
        if (i3 != 0) {
            return i3;
        }
        N6.InterfaceC0694h interfaceC0694hH = h();
        int iIdentityHashCode = (E7.l.f(interfaceC0694hH) || p127o7.d.o(interfaceC0694hH)) ? java.lang.System.identityHashCode(this) : p127o7.d.g(interfaceC0694hH).f24832a.hashCode();
        this.f1586a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public java.util.List k(java.util.List list) {
        return list;
    }
}
