package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class J extends android.view.ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.X f17217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f17218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17220d;

    public J(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17218b = new android.graphics.Rect();
        this.f17219c = true;
        this.f17220d = false;
    }

    public J(int i3, int i9) {
        super(i3, i9);
        this.f17218b = new android.graphics.Rect();
        this.f17219c = true;
        this.f17220d = false;
    }

    public J(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f17218b = new android.graphics.Rect();
        this.f17219c = true;
        this.f17220d = false;
    }

    public J(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f17218b = new android.graphics.Rect();
        this.f17219c = true;
        this.f17220d = false;
    }

    public J(androidx.recyclerview.widget.J j) {
        super((android.view.ViewGroup.LayoutParams) j);
        this.f17218b = new android.graphics.Rect();
        this.f17219c = true;
        this.f17220d = false;
    }
}
