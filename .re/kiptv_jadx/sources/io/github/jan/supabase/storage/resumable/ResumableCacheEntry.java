package io.github.jan.supabase.storage.resumable;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u001c¨\u00067"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "", "", io.sentry.protocol.Request.JsonKeys.URL, "path", "bucketId", "Ld8/d;", "expiresAt", "", "upsert", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld8/d;ZLjava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld8/d;ZLjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$storage_kt_release", "(Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ld8/d;", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld8/d;ZLjava/lang/String;)Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getPath", "getBucketId", "Ld8/d;", "getExpiresAt", "Z", "getUpsert", "getContentType", "Companion", "$serializer", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class ResumableCacheEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.storage.resumable.ResumableCacheEntry.Companion INSTANCE = new io.github.jan.supabase.storage.resumable.ResumableCacheEntry.Companion(null);
    private final java.lang.String bucketId;
    private final java.lang.String contentType;
    private final p036d8.d expiresAt;
    private final java.lang.String path;
    private final boolean upsert;
    private final java.lang.String url;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.storage.resumable.ResumableCacheEntry$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ ResumableCacheEntry(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, p036d8.d dVar, boolean z6, java.lang.String str4, p153r8.k0 k0Var) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, io.github.jan.supabase.storage.resumable.ResumableCacheEntry$$serializer.INSTANCE.getDescriptor());
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

    public static /* synthetic */ io.github.jan.supabase.storage.resumable.ResumableCacheEntry copy$default(io.github.jan.supabase.storage.resumable.ResumableCacheEntry resumableCacheEntry, java.lang.String str, java.lang.String str2, java.lang.String str3, p036d8.d dVar, boolean z6, java.lang.String str4, int i3, java.lang.Object obj) {
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
        java.lang.String str5 = str4;
        return resumableCacheEntry.copy(str, str2, str3, dVar, z9, str5);
    }

    public static final /* synthetic */ void write$Self$storage_kt_release(io.github.jan.supabase.storage.resumable.ResumableCacheEntry self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.url);
        output.s(serialDesc, 1, self.path);
        output.s(serialDesc, 2, self.bucketId);
        output.h(serialDesc, 3, p087j8.a.f24333a, self.expiresAt);
        if (output.E(serialDesc) || self.upsert) {
            output.q(serialDesc, 4, self.upsert);
        }
        if (!output.E(serialDesc) && kotlin.jvm.internal.m.a(self.contentType, "application/octet-stream")) {
            return;
        }
        output.s(serialDesc, 5, self.contentType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getBucketId() {
        return this.bucketId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final p036d8.d getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getUpsert() {
        return this.upsert;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getContentType() {
        return this.contentType;
    }

    public final io.github.jan.supabase.storage.resumable.ResumableCacheEntry copy(java.lang.String url, java.lang.String path, java.lang.String bucketId, p036d8.d expiresAt, boolean upsert, java.lang.String contentType) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(bucketId, "bucketId");
        kotlin.jvm.internal.m.e(expiresAt, "expiresAt");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        return new io.github.jan.supabase.storage.resumable.ResumableCacheEntry(url, path, bucketId, expiresAt, upsert, contentType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.storage.resumable.ResumableCacheEntry)) {
            return false;
        }
        io.github.jan.supabase.storage.resumable.ResumableCacheEntry resumableCacheEntry = (io.github.jan.supabase.storage.resumable.ResumableCacheEntry) other;
        return kotlin.jvm.internal.m.a(this.url, resumableCacheEntry.url) && kotlin.jvm.internal.m.a(this.path, resumableCacheEntry.path) && kotlin.jvm.internal.m.a(this.bucketId, resumableCacheEntry.bucketId) && kotlin.jvm.internal.m.a(this.expiresAt, resumableCacheEntry.expiresAt) && this.upsert == resumableCacheEntry.upsert && kotlin.jvm.internal.m.a(this.contentType, resumableCacheEntry.contentType);
    }

    public final java.lang.String getBucketId() {
        return this.bucketId;
    }

    public final java.lang.String getContentType() {
        return this.contentType;
    }

    public final p036d8.d getExpiresAt() {
        return this.expiresAt;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final boolean getUpsert() {
        return this.upsert;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.contentType.hashCode() + p121o0.p.f((this.expiresAt.f21303h.hashCode() + B2.a.a(B2.a.a(this.url.hashCode() * 31, 31, this.path), 31, this.bucketId)) * 31, 31, this.upsert);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResumableCacheEntry(url=");
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
        return Y6.f.l(sb, this.contentType, ')');
    }

    public ResumableCacheEntry(java.lang.String url, java.lang.String path, java.lang.String bucketId, p036d8.d expiresAt, boolean z6, java.lang.String contentType) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(bucketId, "bucketId");
        kotlin.jvm.internal.m.e(expiresAt, "expiresAt");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        this.url = url;
        this.path = path;
        this.bucketId = bucketId;
        this.expiresAt = expiresAt;
        this.upsert = z6;
        this.contentType = contentType;
    }

    public /* synthetic */ ResumableCacheEntry(java.lang.String str, java.lang.String str2, java.lang.String str3, p036d8.d dVar, boolean z6, java.lang.String str4, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, str3, dVar, (i3 & 16) != 0 ? false : z6, (i3 & 32) != 0 ? "application/octet-stream" : str4);
    }
}
