package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/w;", "<init>", "()V", "androidx/lifecycle/J", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProcessLifecycleOwner implements androidx.lifecycle.InterfaceC1540w {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final androidx.lifecycle.ProcessLifecycleOwner f16308p = new androidx.lifecycle.ProcessLifecycleOwner();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16310i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.os.Handler f16312l;
    public boolean j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16311k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.C1542y f16313m = new androidx.lifecycle.C1542y(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D1.RunnableC0239y f16314n = new D1.RunnableC0239y(8, this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.i0 f16315o = new androidx.lifecycle.i0(this);

    private ProcessLifecycleOwner() {
    }

    public final void b() {
        int i3 = this.f16310i + 1;
        this.f16310i = i3;
        if (i3 == 1) {
            if (this.j) {
                this.f16313m.e(androidx.lifecycle.EnumC1532n.ON_RESUME);
                this.j = false;
            } else {
                android.os.Handler handler = this.f16312l;
                kotlin.jvm.internal.m.b(handler);
                handler.removeCallbacks(this.f16314n);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC1540w
    public final androidx.lifecycle.AbstractC1534p getLifecycle() {
        return this.f16313m;
    }
}
