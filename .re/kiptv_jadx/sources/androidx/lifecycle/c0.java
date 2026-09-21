package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.C1542y f16342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.EnumC1532n f16343i;
    public boolean j;

    public c0(androidx.lifecycle.C1542y registry, androidx.lifecycle.EnumC1532n event) {
        kotlin.jvm.internal.m.e(registry, "registry");
        kotlin.jvm.internal.m.e(event, "event");
        this.f16342h = registry;
        this.f16343i = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j) {
            return;
        }
        this.f16342h.e(this.f16343i);
        this.j = true;
    }
}
