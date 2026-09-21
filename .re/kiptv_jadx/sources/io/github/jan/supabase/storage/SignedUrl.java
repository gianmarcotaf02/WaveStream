package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lio/github/jan/supabase/storage/SignedUrl;", "", "", "error", "signedURL", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$storage_kt_release", "(Lio/github/jan/supabase/storage/SignedUrl;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/storage/SignedUrl;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "getSignedURL", "getPath", "Companion", "$serializer", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class SignedUrl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.storage.SignedUrl.Companion INSTANCE = new io.github.jan.supabase.storage.SignedUrl.Companion(null);
    private final java.lang.String error;
    private final java.lang.String path;
    private final java.lang.String signedURL;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/SignedUrl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/SignedUrl;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.storage.SignedUrl$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public /* synthetic */ SignedUrl(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, p153r8.k0 k0Var) {
        if (6 != (i3 & 6)) {
            p153r8.AbstractC2686a0.l(i3, 6, io.github.jan.supabase.storage.SignedUrl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.error = null;
        } else {
            this.error = str;
        }
        this.signedURL = str2;
        this.path = str3;
    }

    public static /* synthetic */ io.github.jan.supabase.storage.SignedUrl copy$default(io.github.jan.supabase.storage.SignedUrl signedUrl, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = signedUrl.error;
        }
        if ((i3 & 2) != 0) {
            str2 = signedUrl.signedURL;
        }
        if ((i3 & 4) != 0) {
            str3 = signedUrl.path;
        }
        return signedUrl.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$storage_kt_release(io.github.jan.supabase.storage.SignedUrl self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.error != null) {
            output.t(serialDesc, 0, p153r8.p0.f26988a, self.error);
        }
        output.s(serialDesc, 1, self.signedURL);
        output.s(serialDesc, 2, self.path);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getSignedURL() {
        return this.signedURL;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    public final io.github.jan.supabase.storage.SignedUrl copy(java.lang.String error, java.lang.String signedURL, java.lang.String path) {
        kotlin.jvm.internal.m.e(signedURL, "signedURL");
        kotlin.jvm.internal.m.e(path, "path");
        return new io.github.jan.supabase.storage.SignedUrl(error, signedURL, path);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.storage.SignedUrl)) {
            return false;
        }
        io.github.jan.supabase.storage.SignedUrl signedUrl = (io.github.jan.supabase.storage.SignedUrl) other;
        return kotlin.jvm.internal.m.a(this.error, signedUrl.error) && kotlin.jvm.internal.m.a(this.signedURL, signedUrl.signedURL) && kotlin.jvm.internal.m.a(this.path, signedUrl.path);
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public final java.lang.String getSignedURL() {
        return this.signedURL;
    }

    public int hashCode() {
        java.lang.String str = this.error;
        return this.path.hashCode() + B2.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.signedURL);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignedUrl(error=");
        sb.append(this.error);
        sb.append(", signedURL=");
        sb.append(this.signedURL);
        sb.append(", path=");
        return Y6.f.l(sb, this.path, ')');
    }

    public SignedUrl(java.lang.String str, java.lang.String signedURL, java.lang.String path) {
        kotlin.jvm.internal.m.e(signedURL, "signedURL");
        kotlin.jvm.internal.m.e(path, "path");
        this.error = str;
        this.signedURL = signedURL;
        this.path = path;
    }

    public /* synthetic */ SignedUrl(java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : str, str2, str3);
    }
}
