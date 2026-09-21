package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import io.ktor.client.utils.CacheControl;
import io.ktor.http.ContentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\b\u0010\u000bJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\r\u0010\u000bJ!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\"\u00020\f¢\u0006\u0004\b\b\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000bR\u0015\u0010$\u001a\u00020\u0016*\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0015\u0010&\u001a\u00020\u0016*\u00020!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0015\u0010(\u001a\u00020\u0016*\u00020!8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0015\u0010*\u001a\u00020\u0016*\u00020!8F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0015\u0010$\u001a\u00020\u0016*\u00020+8F¢\u0006\u0006\u001a\u0004\b\"\u0010,R\u0015\u0010&\u001a\u00020\u0016*\u00020+8F¢\u0006\u0006\u001a\u0004\b%\u0010,R\u0015\u0010(\u001a\u00020\u0016*\u00020+8F¢\u0006\u0006\u001a\u0004\b'\u0010,R\u0015\u0010*\u001a\u00020\u0016*\u00020+8F¢\u0006\u0006\u001a\u0004\b)\u0010,¨\u0006-"}, d2 = {"Lio/github/jan/supabase/storage/BucketBuilder;", "", "<init>", "()V", "", "", "mimeTypes", "Lh6/A;", "allowedMimeTypes", "([Ljava/lang/String;)V", "", "(Ljava/util/List;)V", "Lio/ktor/http/ContentType;", "allowedMimeTypesContentType", "([Lio/ktor/http/ContentType;)V", "", CacheControl.PUBLIC, "Ljava/lang/Boolean;", "getPublic", "()Ljava/lang/Boolean;", "setPublic", "(Ljava/lang/Boolean;)V", "Lio/github/jan/supabase/storage/FileSizeLimit;", "fileSizeLimit", "Ljava/lang/String;", "getFileSizeLimit-cccgrl4", "()Ljava/lang/String;", "setFileSizeLimit-saRlmmQ", "(Ljava/lang/String;)V", "Ljava/util/List;", "getAllowedMimeTypes$storage_kt_release", "()Ljava/util/List;", "setAllowedMimeTypes$storage_kt_release", "", "getBytes-ueSVNNQ", "(J)Ljava/lang/String;", "bytes", "getKilobytes-ueSVNNQ", "kilobytes", "getMegabytes-ueSVNNQ", "megabytes", "getGigabytes-ueSVNNQ", "gigabytes", "", "(I)Ljava/lang/String;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BucketBuilder {
    private List<String> allowedMimeTypes;
    private String fileSizeLimit;
    private Boolean public;

    public final void allowedMimeTypes(String... mimeTypes) {
        m.e(mimeTypes, "mimeTypes");
        this.allowedMimeTypes = p078i6.m.E0(mimeTypes);
    }

    public final void allowedMimeTypesContentType(List<ContentType> mimeTypes) {
        m.e(mimeTypes, "mimeTypes");
        ArrayList arrayList = new ArrayList(q.I0(mimeTypes, 10));
        Iterator<T> it = mimeTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContentType) it.next()).toString());
        }
        this.allowedMimeTypes = arrayList;
    }

    public final List<String> getAllowedMimeTypes$storage_kt_release() {
        return this.allowedMimeTypes;
    }

    public final String m327getBytesueSVNNQ(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('b');
        return FileSizeLimit.m344constructorimpl(sb.toString());
    }

    public final String getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public final String m330getGigabytesueSVNNQ(long j) {
        return FileSizeLimit.m344constructorimpl(j + "gb");
    }

    public final String m332getKilobytesueSVNNQ(long j) {
        return FileSizeLimit.m344constructorimpl(j + "kb");
    }

    public final String m334getMegabytesueSVNNQ(long j) {
        return FileSizeLimit.m344constructorimpl(j + "mb");
    }

    public final Boolean getPublic() {
        return this.public;
    }

    public final void setAllowedMimeTypes$storage_kt_release(List<String> list) {
        this.allowedMimeTypes = list;
    }

    public final void m335setFileSizeLimitsaRlmmQ(String str) {
        this.fileSizeLimit = str;
    }

    public final void setPublic(Boolean bool) {
        this.public = bool;
    }

    public final void allowedMimeTypes(List<String> mimeTypes) {
        m.e(mimeTypes, "mimeTypes");
        this.allowedMimeTypes = mimeTypes;
    }

    public final String m326getBytesueSVNNQ(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append('b');
        return FileSizeLimit.m344constructorimpl(sb.toString());
    }

    public final String m329getGigabytesueSVNNQ(int i3) {
        return FileSizeLimit.m344constructorimpl(i3 + "gb");
    }

    public final String m331getKilobytesueSVNNQ(int i3) {
        return FileSizeLimit.m344constructorimpl(i3 + "kb");
    }

    public final String m333getMegabytesueSVNNQ(int i3) {
        return FileSizeLimit.m344constructorimpl(i3 + "mb");
    }

    public final void allowedMimeTypes(ContentType... mimeTypes) {
        m.e(mimeTypes, "mimeTypes");
        ArrayList arrayList = new ArrayList(mimeTypes.length);
        for (ContentType contentType : mimeTypes) {
            arrayList.add(contentType.toString());
        }
        this.allowedMimeTypes = arrayList;
    }
}
