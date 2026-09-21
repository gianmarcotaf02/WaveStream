package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {
    public static int a(android.widget.TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(android.widget.TextView textView, int i3, int i9, int i10, int i11) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i9, i10, i11);
    }

    public static void c(android.widget.TextView textView, int[] iArr, int i3) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
    }

    public static boolean d(android.widget.TextView textView, java.lang.String str) {
        return textView.setFontVariationSettings(str);
    }
}
