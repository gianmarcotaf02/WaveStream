package io.github.jan.supabase.storage.resumable;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.ktor.util.PlatformUtils;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007¨\u0006\u0002"}, d2 = {"createDefaultResumableCache", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "storage-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SettingsResumableCacheKt {
    @SupabaseInternal
    public static final ResumableCache createDefaultResumableCache() {
        return !PlatformUtils.INSTANCE.getIS_NODE() ? new SettingsResumableCache(null, 1, null) : new MemoryResumableCache(null, 1, null);
    }
}
