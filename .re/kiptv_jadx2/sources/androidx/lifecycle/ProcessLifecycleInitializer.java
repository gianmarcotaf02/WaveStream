package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lx2/b;", "Landroidx/lifecycle/w;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProcessLifecycleInitializer implements p190x2.b {
    @Override
    public final Object create(Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        p190x2.a aVarC = p190x2.a.c(context);
        kotlin.jvm.internal.m.d(aVarC, "getInstance(...)");
        if (!aVarC.f31148b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC1537t.f16374a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.m.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1536s());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f16308p;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f16312l = new Handler();
        processLifecycleOwner.f16313m.e(EnumC1532n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.m.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new K(processLifecycleOwner));
        return processLifecycleOwner;
    }

    @Override
    public final List dependencies() {
        return p078i6.w.f23205h;
    }
}
