package p105m2;

/* JADX INFO: renamed from: m2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2620s extends p105m2.AbstractC2621t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f25358a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.concurrent.Executor f25359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p105m2.C2604b f25360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p105m2.C2617o f25361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f25362e;

    public final void j(p105m2.C2617o c2617o, java.util.ArrayList arrayList) {
        if (c2617o == null) {
            throw new java.lang.NullPointerException("groupRoute must not be null");
        }
        synchronized (this.f25358a) {
            try {
                try {
                    java.util.concurrent.Executor executor = this.f25359b;
                    if (executor != null) {
                        executor.execute(new p105m2.RunnableC2619q(this, this.f25360c, c2617o, arrayList, 1));
                    } else {
                        this.f25361d = c2617o;
                        this.f25362e = new java.util.ArrayList(arrayList);
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
