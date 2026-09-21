package io.github.jan.supabase.storage.resumable;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "io.github.jan.supabase.storage.resumable.SettingsResumableCache", f = "SettingsResumableCache.kt", l = {25}, m = "get-iiNwMIM")
public final class SettingsResumableCache$get$1 extends p117n6.c {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.github.jan.supabase.storage.resumable.SettingsResumableCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsResumableCache$get$1(io.github.jan.supabase.storage.resumable.SettingsResumableCache settingsResumableCache, p100l6.c cVar) {
        super(cVar);
        this.this$0 = settingsResumableCache;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo381getiiNwMIM(null, this);
    }
}
