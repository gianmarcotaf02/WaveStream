package io.github.jan.supabase.storage.resumable;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p117n6.c;
import p117n6.e;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@e(c = "io.github.jan.supabase.storage.resumable.SettingsResumableCache", f = "SettingsResumableCache.kt", l = {25}, m = "get-iiNwMIM")
public final class SettingsResumableCache$get$1 extends c {
    int label;
    Object result;
    final SettingsResumableCache this$0;

    public SettingsResumableCache$get$1(SettingsResumableCache settingsResumableCache, p100l6.c cVar) {
        super(cVar);
        this.this$0 = settingsResumableCache;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo381getiiNwMIM(null, this);
    }
}
