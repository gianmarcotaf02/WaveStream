package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/storage/FileUploadResponse;", "", "id", "", "path", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPath", "getKey", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class FileUploadResponse {
    private final java.lang.String id;
    private final java.lang.String key;
    private final java.lang.String path;

    public FileUploadResponse(java.lang.String str, java.lang.String path, java.lang.String str2) {
        kotlin.jvm.internal.m.e(path, "path");
        this.id = str;
        this.path = path;
        this.key = str2;
    }

    public static /* synthetic */ io.github.jan.supabase.storage.FileUploadResponse copy$default(io.github.jan.supabase.storage.FileUploadResponse fileUploadResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = fileUploadResponse.id;
        }
        if ((i3 & 2) != 0) {
            str2 = fileUploadResponse.path;
        }
        if ((i3 & 4) != 0) {
            str3 = fileUploadResponse.key;
        }
        return fileUploadResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    public final io.github.jan.supabase.storage.FileUploadResponse copy(java.lang.String id, java.lang.String path, java.lang.String key) {
        kotlin.jvm.internal.m.e(path, "path");
        return new io.github.jan.supabase.storage.FileUploadResponse(id, path, key);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.storage.FileUploadResponse)) {
            return false;
        }
        io.github.jan.supabase.storage.FileUploadResponse fileUploadResponse = (io.github.jan.supabase.storage.FileUploadResponse) other;
        return kotlin.jvm.internal.m.a(this.id, fileUploadResponse.id) && kotlin.jvm.internal.m.a(this.path, fileUploadResponse.path) && kotlin.jvm.internal.m.a(this.key, fileUploadResponse.key);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public int hashCode() {
        java.lang.String str = this.id;
        int iA = B2.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.path);
        java.lang.String str2 = this.key;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FileUploadResponse(id=");
        sb.append(this.id);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", key=");
        return Y6.f.l(sb, this.key, ')');
    }

    public /* synthetic */ FileUploadResponse(java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str, str2, (i3 & 4) != 0 ? null : str3);
    }
}
