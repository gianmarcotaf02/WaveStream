package p039e1;

import android.text.Layout;

public abstract class d {

    public static final int[] f21340a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f21340a = iArr;
    }
}
