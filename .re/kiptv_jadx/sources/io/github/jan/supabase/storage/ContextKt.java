package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0000\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"appContext", "Landroid/content/Context;", "applicationContext", "storage-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContextKt {
    private static android.content.Context appContext;

    public static final android.content.Context applicationContext() {
        android.content.Context context = appContext;
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException("Application context not initialized");
    }
}
