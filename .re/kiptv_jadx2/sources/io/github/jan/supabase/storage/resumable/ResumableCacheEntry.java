package io.github.jan.supabase.storage.resumable;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p036d8.d;
import p087j8.a;
import p119n8.i;
import p121o0.p;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.k0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u001c¨\u00067"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "", "", Request.JsonKeys.URL, "path", "bucketId", "Ld8/d;", "expiresAt", "", "upsert", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld8/d;ZLjava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld8/d;ZLjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$storage_kt_release", "(Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ld8/d;", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld8/d;ZLjava/lang/String;)Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getPath", "getBucketId", "Ld8/d;", "getExpiresAt", "Z", "getUpsert", "getContentType", "Companion", "$serializer", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class ResumableCacheEntry {

    public static final Companion INSTANCE = new Companion(null);
    private final String bucketId;
    private final String contentType;
    private final d expiresAt;
    private final String path;
    private final boolean upsert;
    private final String url;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return ResumableCacheEntry$$serializer.INSTANCE;
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public ResumableCacheEntry(int i3, String str, String str2, String str3, d dVar, boolean z6, String str4, k0 k0Var) {
        if (15 != (i3 & 15)) {
            AbstractC2686a0.l(i3, 15, ResumableCacheEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.url = str;
        this.path = str2;
        this.bucketId = str3;
        this.expiresAt = dVar;
        if ((i3 & 16) == 0) {
            this.upsert = false;
        } else {
            this.upsert = z6;
        }
        if ((i3 & 32) == 0) {
            this.contentType = "application/octet-stream";
        } else {
            this.contentType = str4;
        }
    }

    public static ResumableCacheEntry copy$default(ResumableCacheEntry resumableCacheEntry, String str, String str2, String str3, d dVar, boolean z6, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = resumableCacheEntry.url;
        }
        if ((i3 & 2) != 0) {
            str2 = resumableCacheEntry.path;
        }
        if ((i3 & 4) != 0) {
            str3 = resumableCacheEntry.bucketId;
        }
        if ((i3 & 8) != 0) {
            dVar = resumableCacheEntry.expiresAt;
        }
        if ((i3 & 16) != 0) {
            z6 = resumableCacheEntry.upsert;
        }
        if ((i3 & 32) != 0) {
            str4 = resumableCacheEntry.contentType;
        }
        boolean z9 = z6;
        String str5 = str4;
        return resumableCacheEntry.copy(str, str2, str3, dVar, z9, str5);
    }

    public static final void write$Self$storage_kt_release(ResumableCacheEntry self, b output, SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.url);
        output.s(serialDesc, 1, self.path);
        output.s(serialDesc, 2, self.bucketId);
        output.h(serialDesc, 3, a.f24333a, self.expiresAt);
        if (output.E(serialDesc) || self.upsert) {
            output.q(serialDesc, 4, self.upsert);
        }
        if (!output.E(serialDesc) && m.a(self.contentType, "application/octet-stream")) {
            return;
        }
        output.s(serialDesc, 5, self.contentType);
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getBucketId() {
        return this.bucketId;
    }

    public final d getExpiresAt() {
        return this.expiresAt;
    }

    public final boolean getUpsert() {
        return this.upsert;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final ResumableCacheEntry copy(String url, String path, String bucketId, d expiresAt, boolean upsert, String contentType) {
        m.e(url, "url");
        m.e(path, "path");
        m.e(bucketId, "bucketId");
        m.e(expiresAt, "expiresAt");
        m.e(contentType, "contentType");
        return new ResumableCacheEntry(url, path, bucketId, expiresAt, upsert, contentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResumableCacheEntry)) {
            return false;
        }
        ResumableCacheEntry resumableCacheEntry = (ResumableCacheEntry) other;
        return m.a(this.url, resumableCacheEntry.url) && m.a(this.path, resumableCacheEntry.path) && m.a(this.bucketId, resumableCacheEntry.bucketId) && m.a(this.expiresAt, resumableCacheEntry.expiresAt) && this.upsert == resumableCacheEntry.upsert && m.a(this.contentType, resumableCacheEntry.contentType);
    }

    public final String getBucketId() {
        return this.bucketId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final d getExpiresAt() {
        return this.expiresAt;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getUpsert() {
        return this.upsert;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.contentType.hashCode() + p.f((this.expiresAt.f21303h.hashCode() + B2.a.a(B2.a.a(this.url.hashCode() * 31, 31, this.path), 31, this.bucketId)) * 31, 31, this.upsert);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResumableCacheEntry(url=");
        sb.append(this.url);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", bucketId=");
        sb.append(this.bucketId);
        sb.append(", expiresAt=");
        sb.append(this.expiresAt);
        sb.append(", upsert=");
        sb.append(this.upsert);
        sb.append(", contentType=");
        return f.l(sb, this.contentType, ')');
    }

    public ResumableCacheEntry(String url, String path, String bucketId, d expiresAt, boolean z6, String contentType) {
        m.e(url, "url");
        m.e(path, "path");
        m.e(bucketId, "bucketId");
        m.e(expiresAt, "expiresAt");
        m.e(contentType, "contentType");
        this.url = url;
        this.path = path;
        this.bucketId = bucketId;
        this.expiresAt = expiresAt;
        this.upsert = z6;
        this.contentType = contentType;
    }

    public ResumableCacheEntry(String str, String str2, String str3, d dVar, boolean z6, String str4, int i3, AbstractC2541f abstractC2541f) {
        this(str, str2, str3, dVar, (i3 & 16) != 0 ? false : z6, (i3 & 32) != 0 ? "application/octet-stream" : str4);
    }
}
