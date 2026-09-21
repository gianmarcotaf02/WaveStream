package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"authenticatedStorageItem", "Lio/github/jan/supabase/storage/StorageItem;", "bucketId", "", "path", "publicStorageItem", "storage-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StorageItemKt {
    public static final StorageItem authenticatedStorageItem(String bucketId, String path) {
        m.e(bucketId, "bucketId");
        m.e(path, "path");
        return new StorageItem(path, bucketId, true);
    }

    public static final StorageItem publicStorageItem(String bucketId, String path) {
        m.e(bucketId, "bucketId");
        m.e(path, "path");
        return new StorageItem(path, bucketId, false);
    }
}
