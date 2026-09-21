package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lio/github/jan/supabase/storage/StorageItem;", "", "path", "", "bucketId", "authenticated", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPath", "()Ljava/lang/String;", "getBucketId", "getAuthenticated", "()Z", "component1", "component2", "component3", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class StorageItem {
    private final boolean authenticated;
    private final java.lang.String bucketId;
    private final java.lang.String path;

    public StorageItem(java.lang.String path, java.lang.String bucketId, boolean z6) {
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(bucketId, "bucketId");
        this.path = path;
        this.bucketId = bucketId;
        this.authenticated = z6;
    }

    public static /* synthetic */ io.github.jan.supabase.storage.StorageItem copy$default(io.github.jan.supabase.storage.StorageItem storageItem, java.lang.String str, java.lang.String str2, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = storageItem.path;
        }
        if ((i3 & 2) != 0) {
            str2 = storageItem.bucketId;
        }
        if ((i3 & 4) != 0) {
            z6 = storageItem.authenticated;
        }
        return storageItem.copy(str, str2, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getBucketId() {
        return this.bucketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAuthenticated() {
        return this.authenticated;
    }

    public final io.github.jan.supabase.storage.StorageItem copy(java.lang.String path, java.lang.String bucketId, boolean authenticated) {
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(bucketId, "bucketId");
        return new io.github.jan.supabase.storage.StorageItem(path, bucketId, authenticated);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.storage.StorageItem)) {
            return false;
        }
        io.github.jan.supabase.storage.StorageItem storageItem = (io.github.jan.supabase.storage.StorageItem) other;
        return kotlin.jvm.internal.m.a(this.path, storageItem.path) && kotlin.jvm.internal.m.a(this.bucketId, storageItem.bucketId) && this.authenticated == storageItem.authenticated;
    }

    public final boolean getAuthenticated() {
        return this.authenticated;
    }

    public final java.lang.String getBucketId() {
        return this.bucketId;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.authenticated) + B2.a.a(this.path.hashCode() * 31, 31, this.bucketId);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StorageItem(path=");
        sb.append(this.path);
        sb.append(", bucketId=");
        sb.append(this.bucketId);
        sb.append(", authenticated=");
        return v5.L.a(sb, this.authenticated, ')');
    }
}
