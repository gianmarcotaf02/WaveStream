package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u000e"}, d2 = {"Lio/github/jan/supabase/storage/FileSizeLimit;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileSizeLimit {
    private final java.lang.String value;

    private /* synthetic */ FileSizeLimit(java.lang.String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ io.github.jan.supabase.storage.FileSizeLimit m343boximpl(java.lang.String str) {
        return new io.github.jan.supabase.storage.FileSizeLimit(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m344constructorimpl(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m345equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof io.github.jan.supabase.storage.FileSizeLimit) && kotlin.jvm.internal.m.a(str, ((io.github.jan.supabase.storage.FileSizeLimit) obj).m349unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m346equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.m.a(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m347hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m348toStringimpl(java.lang.String str) {
        return B2.a.i(')', "FileSizeLimit(value=", str);
    }

    public boolean equals(java.lang.Object other) {
        return m345equalsimpl(this.value, other);
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m347hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m348toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m349unboximpl() {
        return this.value;
    }
}
