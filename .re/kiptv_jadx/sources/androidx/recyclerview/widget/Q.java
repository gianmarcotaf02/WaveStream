package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends androidx.recyclerview.widget.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f17249a;

    public Q(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f17249a = recyclerView;
    }

    public final void a() {
        boolean z6 = androidx.recyclerview.widget.RecyclerView.f17253I0;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17249a;
        if (z6 && recyclerView.f17257A && recyclerView.f17323z) {
            java.util.WeakHashMap weakHashMap = D1.U.f1980a;
            recyclerView.postOnAnimation(recyclerView.f17304p);
        } else {
            recyclerView.H = true;
            recyclerView.requestLayout();
        }
    }
}
