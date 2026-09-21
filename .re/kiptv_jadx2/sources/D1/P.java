package D1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public abstract class P {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i9) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i3, i9);
    }
}
