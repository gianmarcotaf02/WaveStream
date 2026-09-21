package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1637t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17512f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17514i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f17515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17516l;

    public final void a(android.view.View view) {
        int layoutPosition;
        int size = this.f17515k.size();
        android.view.View view2 = null;
        int i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        for (int i9 = 0; i9 < size; i9++) {
            android.view.View view3 = ((androidx.recyclerview.widget.X) this.f17515k.get(i9)).itemView;
            androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view3.getLayoutParams();
            if (view3 != view && !j.f17217a.isRemoved() && (layoutPosition = (j.f17217a.getLayoutPosition() - this.f17510d) * this.f17511e) >= 0 && layoutPosition < i3) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i3 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f17510d = -1;
        } else {
            this.f17510d = ((androidx.recyclerview.widget.J) view2.getLayoutParams()).f17217a.getLayoutPosition();
        }
    }

    public final android.view.View b(androidx.recyclerview.widget.O o8) {
        java.util.List list = this.f17515k;
        if (list == null) {
            android.view.View view = o8.k(this.f17510d, Long.MAX_VALUE).itemView;
            this.f17510d += this.f17511e;
            return view;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            android.view.View view2 = ((androidx.recyclerview.widget.X) this.f17515k.get(i3)).itemView;
            androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view2.getLayoutParams();
            if (!j.f17217a.isRemoved() && this.f17510d == j.f17217a.getLayoutPosition()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
