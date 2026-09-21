package androidx.lifecycle;

import D5.C0261o;
import R0.C0849t0;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.V0;
import java.util.Arrays;
import java.util.Map;

public final class Y implements p165t2.d {

    public final p079i7.f f16326a;

    public boolean f16327b;

    public Bundle f16328c;

    public final p070h6.p f16329d;

    public Y(p079i7.f savedStateRegistry, k0 viewModelStoreOwner) {
        kotlin.jvm.internal.m.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.m.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f16326a = savedStateRegistry;
        this.f16329d = com.google.common.util.concurrent.D.B(new C0261o(28, viewModelStoreOwner));
    }

    @Override
    public final Bundle a() {
        Bundle bundleI = V0.i((p070h6.k[]) Arrays.copyOf(new p070h6.k[0], 0));
        Bundle bundle = this.f16328c;
        if (bundle != null) {
            bundleI.putAll(bundle);
        }
        for (Map.Entry entry : ((Z) this.f16329d.getValue()).f16330b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((C0849t0) ((U) entry.getValue()).f16319b.f2774l).a();
            if (!bundleA.isEmpty()) {
                AbstractC1833d1.L(bundleI, str, bundleA);
            }
        }
        this.f16327b = false;
        return bundleI;
    }

    public final void b() {
        if (this.f16327b) {
            return;
        }
        Bundle bundleI0 = this.f16326a.I0("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleI = V0.i((p070h6.k[]) Arrays.copyOf(new p070h6.k[0], 0));
        Bundle bundle = this.f16328c;
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
