package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends android.widget.ListView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15633i;

    public AlertController$RecycleListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f22422t);
        this.f15633i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f15632h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
