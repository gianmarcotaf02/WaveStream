package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/storage/FileUploadResponse;", "", "id", "", "path", SubscriberAttributeKt.JSON_NAME_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPath", "getKey", "component1", "component2", "component3", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileUploadResponse {
    private final String id;
    private final String key;
    private final String path;

    public FileUploadResponse(String str, String path, String str2) {
        m.e(path, "path");
        this.id = str;
        this.path = path;
        this.key = str2;
    }

    public static FileUploadResponse copy$default(FileUploadResponse fileUploadResponse, String str, String str2, String str3, int i3, Object obj) {
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

    public final String getId() {
        return this.id;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getKey() {
        return this.key;
    }

    public final FileUploadResponse copy(String id, String path, String key) {
        m.e(path, "path");
        return new FileUploadResponse(id, path, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadResponse)) {
            return false;
        }
        FileUploadResponse fileUploadResponse = (FileUploadResponse) other;
        return m.a(this.id, fileUploadResponse.id) && m.a(this.path, fileUploadResponse.path) && m.a(this.key, fileUploadResponse.key);
    }

    public final String getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.id;
        int iA = B2.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.path);
        String str2 = this.key;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FileUploadResponse(id=");
        sb.append(this.id);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", key=");
        return Y6.f.l(sb, this.key, ')');
    }

    public FileUploadResponse(String str, String str2, String str3, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str, str2, (i3 & 4) != 0 ? null : str3);
    }
}
