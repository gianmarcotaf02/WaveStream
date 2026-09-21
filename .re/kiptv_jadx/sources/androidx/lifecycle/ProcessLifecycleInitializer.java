package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lx2/b;", "Landroidx/lifecycle/w;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ProcessLifecycleInitializer implements p190x2.b {
    @Override // p190x2.b
    public final java.lang.Object create(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        p190x2.a aVarC = p190x2.a.c(context);
        kotlin.jvm.internal.m.d(aVarC, "getInstance(...)");
        if (!aVarC.f31148b.contains(androidx.lifecycle.ProcessLifecycleInitializer.class)) {
            throw new java.lang.IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!androidx.lifecycle.AbstractC1537t.f16374a.getAndSet(true)) {
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.m.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new androidx.lifecycle.C1536s());
        }
        androidx.lifecycle.ProcessLifecycleOwner processLifecycleOwner = androidx.lifecycle.ProcessLifecycleOwner.f16308p;
        processLifecycleOwner.getClass();
        processLifecycleOwner.f16312l = new android.os.Handler();
        processLifecycleOwner.f16313m.e(androidx.lifecycle.EnumC1532n.ON_CREATE);
        android.content.Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.m.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext2).registerActivityLifecycleCallbacks(new androidx.lifecycle.K(processLifecycleOwner));
        return processLifecycleOwner;
    }

    @Override // p190x2.b
    public final java.util.List dependencies() {
        return p078i6.w.f23205h;
    }
}
