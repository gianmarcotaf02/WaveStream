package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.C1542y f16347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.os.Handler f16348b = new android.os.Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.c0 f16349c;

    public d0(androidx.lifecycle.AbstractServiceC1543z abstractServiceC1543z) {
        this.f16347a = new androidx.lifecycle.C1542y(abstractServiceC1543z);
    }

    public final void a(androidx.lifecycle.EnumC1532n enumC1532n) {
        androidx.lifecycle.c0 c0Var = this.f16349c;
        if (c0Var != null) {
            c0Var.run();
        }
        androidx.lifecycle.c0 c0Var2 = new androidx.lifecycle.c0(this.f16347a, enumC1532n);
        this.f16349c = c0Var2;
        this.f16348b.postAtFrontOfQueue(c0Var2);
    }
}
