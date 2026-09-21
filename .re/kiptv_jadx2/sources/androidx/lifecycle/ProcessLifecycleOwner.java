package androidx.lifecycle;

import D1.RunnableC0239y;
import android.os.Handler;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/w;", "<init>", "()V", "androidx/lifecycle/J", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProcessLifecycleOwner implements InterfaceC1540w {

    public static final ProcessLifecycleOwner f16308p = new ProcessLifecycleOwner();

    public int f16309h;

    public int f16310i;

    public Handler f16312l;
    public boolean j = true;

    public boolean f16311k = true;

    public final C1542y f16313m = new C1542y(this);

    public final RunnableC0239y f16314n = new RunnableC0239y(8, this);

    public final i0 f16315o = new i0(this);

    private ProcessLifecycleOwner() {
    }

    public final void b() {
        int i3 = this.f16310i + 1;
        this.f16310i = i3;
        if (i3 == 1) {
            if (this.j) {
                this.f16313m.e(EnumC1532n.ON_RESUME);
                this.j = false;
            } else {
                Handler handler = this.f16312l;
                kotlin.jvm.internal.m.b(handler);
                handler.removeCallbacks(this.f16314n);
            }
        }
    }

    @Override
    public final AbstractC1534p getLifecycle() {
        return this.f16313m;
    }
}
