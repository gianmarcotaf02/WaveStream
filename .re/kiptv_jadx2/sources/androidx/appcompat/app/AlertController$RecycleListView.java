package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.a;

public class AlertController$RecycleListView extends ListView {

    public final int f15632h;

    public final int f15633i;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f22422t);
        this.f15633i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f15632h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
