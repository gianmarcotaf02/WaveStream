package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.C1642y f17186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f17187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17191f;

    public static void b(androidx.recyclerview.widget.X x9) {
        int i3 = x9.mFlags;
        if (!x9.isInvalid() && (i3 & 4) == 0) {
            x9.getOldPosition();
            x9.getAbsoluteAdapterPosition();
        }
    }

    public abstract boolean a(androidx.recyclerview.widget.X x9, androidx.recyclerview.widget.X x10, D1.r rVar, D1.r rVar2);

    public final void c(androidx.recyclerview.widget.X x9) {
        androidx.recyclerview.widget.C1642y c1642y = this.f17186a;
        if (c1642y != null) {
            boolean z6 = true;
            x9.setIsRecyclable(true);
            if (x9.mShadowedHolder != null && x9.mShadowingHolder == null) {
                x9.mShadowedHolder = null;
            }
            x9.mShadowingHolder = null;
            if (x9.shouldBeKeptAsChild()) {
                return;
            }
            android.view.View view = x9.itemView;
            androidx.recyclerview.widget.RecyclerView recyclerView = c1642y.f17522a;
            recyclerView.b0();
            android.support.v4.media.session.q qVar = recyclerView.f17298m;
            androidx.recyclerview.widget.C1642y c1642y2 = (androidx.recyclerview.widget.C1642y) qVar.f15617i;
            int iIndexOfChild = c1642y2.f17522a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                qVar.Q(view);
            } else {
                C8.a aVar = (C8.a) qVar.j;
                if (aVar.e(iIndexOfChild)) {
                    aVar.i(iIndexOfChild);
                    qVar.Q(view);
                    c1642y2.h(iIndexOfChild);
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                androidx.recyclerview.widget.X xG = androidx.recyclerview.widget.RecyclerView.G(view);
                androidx.recyclerview.widget.O o8 = recyclerView.j;
                o8.l(xG);
                o8.i(xG);
            }
            recyclerView.c0(!z6);
            if (z6 || !x9.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(x9.itemView, false);
        }
    }

    public abstract void d(androidx.recyclerview.widget.X x9);

    public abstract void e();

    public abstract boolean f();
}
