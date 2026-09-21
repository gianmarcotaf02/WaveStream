package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/storage/SupabaseInitializer;", "Lx2/b;", "Landroid/content/Context;", "<init>", "()V", "context", "create", "(Landroid/content/Context;)Landroid/content/Context;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SupabaseInitializer implements p190x2.b {
    @Override // p190x2.b
    public java.util.List<java.lang.Class<? extends p190x2.b>> dependencies() {
        return p078i6.w.f23205h;
    }

    @Override // p190x2.b
    public android.content.Context create(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        android.content.Context applicationContext = context.getApplicationContext();
        io.github.jan.supabase.storage.ContextKt.appContext = applicationContext;
        kotlin.jvm.internal.m.d(applicationContext, "also(...)");
        return applicationContext;
    }
}
