package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class J extends ViewGroup.MarginLayoutParams {

    public X f17217a;

    public final Rect f17218b;

    public boolean f17219c;

    public boolean f17220d;

    public J(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17218b = new Rect();
        this.f17219c = true;
        this.f17220d = false;
    }

    public J(int i3, int i9) {
        super(i3, i9);
        this.f17218b = new Rect();
        this.f17219c = true;
        this.f17220d = false;
    }

    public J(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f17218b = new Rect();
        this.f17219c = true;
        this.f17220d = false;
    }

    public J(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f17218b = new Rect();
        this.f17219c = true;
        this.f17220d = false;
    }

    public J(J j) {
        super((ViewGroup.LayoutParams) j);
        this.f17218b = new Rect();
        this.f17219c = true;
        this.f17220d = false;
    }
}
