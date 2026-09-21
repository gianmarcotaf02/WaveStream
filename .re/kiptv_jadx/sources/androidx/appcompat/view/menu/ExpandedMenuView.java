package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements p095l.k, p095l.z, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f15644i = {android.R.attr.background, android.R.attr.divider};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p095l.l f15645h;

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        j1.l lVarS = j1.l.s(context, attributeSet, f15644i, android.R.attr.listViewStyle);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) lVarS.j;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(lVarS.l(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(lVarS.l(1));
        }
        lVarS.u();
    }

    @Override // p095l.k
    public final boolean a(p095l.n nVar) {
        return this.f15645h.q(nVar, null, 0);
    }

    @Override // p095l.z
    public final void b(p095l.l lVar) {
        this.f15645h = lVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i3, long j) {
        a((p095l.n) getAdapter().getItem(i3));
    }
}
