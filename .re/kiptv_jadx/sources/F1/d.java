package F1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f3511a = new java.lang.String[0];

    public static void a(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence) {
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            F1.b.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i3 >= 30) {
            F1.b.a(editorInfo, charSequence);
            return;
        }
        int i9 = editorInfo.initialSelStart;
        int i10 = editorInfo.initialSelEnd;
        int i11 = i9 > i10 ? i10 : i9;
        if (i9 <= i10) {
            i9 = i10;
        }
        int length = charSequence.length();
        if (i11 < 0 || i9 > length) {
            c(editorInfo, null, 0, 0);
            return;
        }
        int i12 = editorInfo.inputType & 4095;
        if (i12 == 129 || i12 == 225 || i12 == 18) {
            c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            c(editorInfo, charSequence, i11, i9);
            return;
        }
        int i13 = i9 - i11;
        int i14 = i13 > 1024 ? 0 : i13;
        int i15 = 2048 - i14;
        int iMin = java.lang.Math.min(charSequence.length() - i9, i15 - java.lang.Math.min(i11, (int) (((double) i15) * 0.8d)));
        int iMin2 = java.lang.Math.min(i11, i15 - iMin);
        int i16 = i11 - iMin2;
        if (java.lang.Character.isLowSurrogate(charSequence.charAt(i16))) {
            i16++;
            iMin2--;
        }
        if (java.lang.Character.isHighSurrogate(charSequence.charAt((i9 + iMin) - 1))) {
            iMin--;
        }
        int i17 = iMin2 + i14;
        c(editorInfo, i14 != i13 ? android.text.TextUtils.concat(charSequence.subSequence(i16, i16 + iMin2), charSequence.subSequence(i9, iMin + i9)) : charSequence.subSequence(i16, i17 + iMin + i16), iMin2, i17);
    }

    public static void b(android.view.inputmethod.EditorInfo editorInfo, boolean z6) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            F1.c.a(editorInfo, z6);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z6);
    }

    public static void c(android.view.inputmethod.EditorInfo editorInfo, java.lang.CharSequence charSequence, int i3, int i9) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new android.text.SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i9);
    }
}
