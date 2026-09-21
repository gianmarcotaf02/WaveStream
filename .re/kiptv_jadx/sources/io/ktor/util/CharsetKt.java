package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "isLowerCase", "(C)Z", "", "", "toCharArray", "(Ljava/lang/String;)[C", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CharsetKt {
    public static final boolean isLowerCase(char c9) {
        return java.lang.Character.toLowerCase(c9) == c9;
    }

    public static final char[] toCharArray(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i3] = str.charAt(i3);
        }
        return cArr;
    }
}
