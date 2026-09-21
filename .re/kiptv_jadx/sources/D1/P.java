package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    public static android.view.View.AccessibilityDelegate a(android.view.View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i3, int i9) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i3, i9);
    }
}
