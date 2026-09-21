package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements p165t2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p079i7.f f16326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.os.Bundle f16328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p070h6.p f16329d;

    public Y(p079i7.f savedStateRegistry, androidx.lifecycle.k0 viewModelStoreOwner) {
        kotlin.jvm.internal.m.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.m.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f16326a = savedStateRegistry;
        this.f16329d = com.google.common.util.concurrent.D.B(new D5.C0261o(28, viewModelStoreOwner));
    }

    @Override // p165t2.d
    public final android.os.Bundle a() {
        android.os.Bundle bundleI = com.google.android.gms.internal.play_billing.V0.i((p070h6.k[]) java.util.Arrays.copyOf(new p070h6.k[0], 0));
        android.os.Bundle bundle = this.f16328c;
        if (bundle != null) {
            bundleI.putAll(bundle);
        }
        for (java.util.Map.Entry entry : ((androidx.lifecycle.Z) this.f16329d.getValue()).f16330b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            android.os.Bundle bundleA = ((R0.C0849t0) ((androidx.lifecycle.U) entry.getValue()).f16319b.f2774l).a();
            if (!bundleA.isEmpty()) {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.L(bundleI, str, bundleA);
            }
        }
        this.f16327b = false;
        return bundleI;
    }

    public final void b() {
        if (this.f16327b) {
            return;
        }
        android.os.Bundle bundleI0 = this.f16326a.I0("androidx.lifecycle.internal.SavedStateHandlesProvider");
        android.os.Bundle bundleI = com.google.android.gms.internal.play_billing.V0.i((p070h6.k[]) java.util.Arrays.copyOf(new p070h6.k[0], 0));
        android.os.Bundle bundle = this.f16328c;
        if (bundle != null) {
            bundleI.putAll(bundle);
        }
        if (bundleI0 != null) {
            bundleI.putAll(bundleI0);
        }
        this.f16328c = bundleI;
        this.f16327b = true;
    }
}
