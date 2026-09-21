package io.github.jan.supabase.storage.resumable;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0002¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/storage/resumable/Fingerprint;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "parts", "", "getParts-impl", "(Ljava/lang/String;)Ljava/util/List;", "source", "getSource-impl", "size", "", "getSize-impl", "(Ljava/lang/String;)J", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "Companion", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Fingerprint {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.storage.resumable.Fingerprint.Companion INSTANCE = new io.github.jan.supabase.storage.resumable.Fingerprint.Companion(null);
    public static final int FINGERPRINT_PARTS = 2;
    public static final java.lang.String FINGERPRINT_SEPARATOR = "::";
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/storage/resumable/Fingerprint$Companion;", "", "<init>", "()V", "FINGERPRINT_PARTS", "", "FINGERPRINT_SEPARATOR", "", "invoke", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "source", "size", "", "invoke-dc9EZ54", "(Ljava/lang/String;J)Ljava/lang/String;", "value", "invoke-3xapfgk", "(Ljava/lang/String;)Ljava/lang/String;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX INFO: renamed from: invoke-3xapfgk, reason: not valid java name */
        public final java.lang.String m379invoke3xapfgk(java.lang.String value) {
            kotlin.jvm.internal.m.e(value, "value");
            java.lang.String strM370constructorimpl = io.github.jan.supabase.storage.resumable.Fingerprint.m370constructorimpl(value);
            if (io.github.jan.supabase.storage.resumable.Fingerprint.m373getPartsimpl(strM370constructorimpl).size() != 2) {
                return null;
            }
            return strM370constructorimpl;
        }

        /* JADX INFO: renamed from: invoke-dc9EZ54, reason: not valid java name */
        public final java.lang.String m380invokedc9EZ54(java.lang.String source, long size) {
            kotlin.jvm.internal.m.e(source, "source");
            return io.github.jan.supabase.storage.resumable.Fingerprint.m370constructorimpl(source + io.github.jan.supabase.storage.resumable.Fingerprint.FINGERPRINT_SEPARATOR + size);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Fingerprint(java.lang.String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ io.github.jan.supabase.storage.resumable.Fingerprint m369boximpl(java.lang.String str) {
        return new io.github.jan.supabase.storage.resumable.Fingerprint(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m370constructorimpl(java.lang.String str) {
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m371equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof io.github.jan.supabase.storage.resumable.Fingerprint) && kotlin.jvm.internal.m.a(str, ((io.github.jan.supabase.storage.resumable.Fingerprint) obj).m378unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m372equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.m.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getParts-impl, reason: not valid java name */
    public static final java.util.List<java.lang.String> m373getPartsimpl(java.lang.String str) {
        return O7.q.b1(str, new java.lang.String[]{FINGERPRINT_SEPARATOR}, 0, 6);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final long m374getSizeimpl(java.lang.String str) {
        return java.lang.Long.parseLong(m373getPartsimpl(str).get(1));
    }

    /* JADX INFO: renamed from: getSource-impl, reason: not valid java name */
    public static final java.lang.String m375getSourceimpl(java.lang.String str) {
        return m373getPartsimpl(str).get(0);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m376hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m377toStringimpl(java.lang.String str) {
        return B2.a.i(')', "Fingerprint(value=", str);
    }

    public boolean equals(java.lang.Object other) {
        return m371equalsimpl(this.value, other);
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m376hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m377toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m378unboximpl() {
        return this.value;
    }
}
