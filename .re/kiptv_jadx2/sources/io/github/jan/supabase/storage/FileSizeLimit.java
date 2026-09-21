package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u000e"}, d2 = {"Lio/github/jan/supabase/storage/FileSizeLimit;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileSizeLimit {
    private final String value;

    private FileSizeLimit(String str) {
        this.value = str;
    }

    public static final FileSizeLimit m343boximpl(String str) {
        return new FileSizeLimit(str);
    }

    public static String m344constructorimpl(String value) {
        m.e(value, "value");
        return value;
    }

    public static boolean m345equalsimpl(String str, Object obj) {
        return (obj instanceof FileSizeLimit) && m.a(str, ((FileSizeLimit) obj).m349unboximpl());
    }

    public static final boolean m346equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    public static int m347hashCodeimpl(String str) {
        return str.hashCode();
    }

    public static String m348toStringimpl(String str) {
        return B2.a.i(')', "FileSizeLimit(value=", str);
    }

    public boolean equals(Object other) {
        return m345equalsimpl(this.value, other);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m347hashCodeimpl(this.value);
    }

    public String toString() {
        return m348toStringimpl(this.value);
    }

    public final String m349unboximpl() {
        return this.value;
    }
}
