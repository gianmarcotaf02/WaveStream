package T6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class B implements p027c7.d {
    @Override // p027c7.b
    public T6.C0927e a(p101l7.c fqName) {
        java.lang.Object next;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        java.util.Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.m.a(T6.AbstractC0926d.a(com.google.android.gms.internal.play_billing.AbstractC1833d1.x(com.google.android.gms.internal.play_billing.AbstractC1833d1.u(((T6.C0927e) next).f9853a))).a(), fqName)) {
                return (T6.C0927e) next;
            }
        }
        next = null;
        return (T6.C0927e) next;
    }

    public abstract java.lang.reflect.Type b();

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof T6.B) && kotlin.jvm.internal.m.a(b(), ((T6.B) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final java.lang.String toString() {
        return getClass().getName() + ": " + b();
    }
}
