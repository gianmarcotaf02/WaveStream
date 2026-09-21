package androidx.mediarouter.app;

/* JADX INFO: loaded from: classes.dex */
final class OverlayListView extends android.widget.ListView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f17184h;

    public OverlayListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17184h = new java.util.ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.ArrayList arrayList = this.f17184h;
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new java.lang.ClassCastException();
            }
        }
    }
}
