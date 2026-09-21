package p019c;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f18073b = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.j f18074c;

    public n(boolean z6) {
        this.f18072a = z6;
    }

    public abstract void b();

    public void c(p019c.a backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
    }

    public void d(p019c.a backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
    }

    public final void e() {
        java.util.Iterator it = this.f18073b.iterator();
        while (it.hasNext()) {
            ((p019c.b) it.next()).cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.j] */
    public final void f(boolean z6) {
        this.f18072a = z6;
        ?? r9 = this.f18074c;
        if (r9 != 0) {
            r9.invoke();
        }
    }

    public void a() {
    }
}
