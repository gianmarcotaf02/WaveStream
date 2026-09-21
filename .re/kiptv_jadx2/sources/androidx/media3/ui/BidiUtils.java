package androidx.media3.ui;

import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextDirectionHeuristics;
import androidx.media3.common.util.Log;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p068h4.u;

final class BidiUtils {
    private static final String TAG = "BidiUtils";
    private static final u LF_SPLITTER = u.b("\n");
    private static final u CRLF_SPLITTER = u.b(ServerSentEventKt.END_OF_LINE);
    private static final p068h4.k LF_JOINER = new p068h4.k("\n");

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean containsRtl(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            byte directionality = Character.getDirectionality(iCodePointAt);
            if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return false;
    }

    public static CharSequence wrapText(CharSequence charSequence) {
        Spanned spanned;
        Object[] spans;
        int[] iArr;
        int[] iArr2;
        List<String> listC;
        int i3;
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        int i9 = 0;
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
            spans = spanned.getSpans(0, charSequence.length(), Object.class);
            iArr = new int[spans.length];
            iArr2 = new int[spans.length];
            Arrays.fill(iArr, -1);
            Arrays.fill(iArr2, -1);
        } else {
            spanned = null;
            spans = null;
            iArr = null;
            iArr2 = null;
        }
        if (charSequence.toString().contains(ServerSentEventKt.END_OF_LINE)) {
            listC = CRLF_SPLITTER.c(charSequence);
            i3 = 2;
        } else {
            listC = LF_SPLITTER.c(charSequence);
            i3 = 1;
        }
        ArrayList arrayList = new ArrayList(listC.size());
        int i10 = 0;
        int length = 0;
        for (String str : listC) {
            String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
            if (spans != null) {
                spanned.getClass();
                iArr.getClass();
                iArr2.getClass();
                int length2 = strUnicodeWrap.length() - str.length();
                if (length2 > 0) {
                    i10++;
                }
                for (int i11 = i9; i11 < spans.length; i11++) {
                    if (iArr[i11] < 0 && spanned.getSpanStart(spans[i11]) >= length) {
                        if (spanned.getSpanStart(spans[i11]) < str.length() + length) {
                            iArr[i11] = i10;
                        }
                    }
                    if (iArr2[i11] < 0 && spanned.getSpanEnd(spans[i11]) - 1 >= length && spanned.getSpanEnd(spans[i11]) - 1 < str.length() + length) {
                        iArr2[i11] = i10;
                    }
                }
                length += str.length() + i3;
                if (length2 > 0) {
                    i10++;
                }
            }
            arrayList.add(strUnicodeWrap);
            i9 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LF_JOINER.b(arrayList));
        if (spans != null) {
            spanned.getClass();
            iArr.getClass();
            iArr2.getClass();
            for (int i12 = 0; i12 < spans.length; i12++) {
                int spanStart = spanned.getSpanStart(spans[i12]) + iArr[i12];
                int spanEnd = spanned.getSpanEnd(spans[i12]) + iArr2[i12];
                int spanFlags = spanned.getSpanFlags(spans[i12]);
                if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                    StringBuilder sbS = p121o0.p.s(spanStart, spanEnd, "Span out of bounds: start=", ",end=", ",len=");
                    sbS.append(spannableStringBuilder.length());
                    Log.w(TAG, sbS.toString());
                } else {
                    spannableStringBuilder.setSpan(spans[i12], spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }
}
