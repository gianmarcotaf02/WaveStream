package Y;

/* JADX INFO: loaded from: classes.dex */
public final class r extends android.view.ViewGroup {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f11007i;
    public final java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final S2.a f11008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11009l;

    public r(android.content.Context context) {
        super(context);
        this.f11006h = 5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f11007i = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.j = arrayList2;
        this.f11008k = new S2.a(7);
        setClipChildren(false);
        Y.t tVar = new Y.t(context);
        addView(tVar);
        arrayList.add(tVar);
        arrayList2.add(tVar);
        this.f11009l = 1;
        setTag(com.kiptv.tv.R.id.hide_in_inspector_tag, java.lang.Boolean.TRUE);
    }

    public final Y.t a(Y.s sVar) {
        S2.a aVar = this.f11008k;
        Y.t tVar = (Y.t) ((java.util.LinkedHashMap) aVar.f9211i).get(sVar);
        if (tVar != null) {
            return tVar;
        }
        Y.t tVar2 = (Y.t) p078i6.u.S0(this.j);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) aVar.f9211i;
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) aVar.j;
        if (tVar2 == null) {
            int i3 = this.f11009l;
            java.util.ArrayList arrayList = this.f11007i;
            if (i3 > p078i6.p.A0(arrayList)) {
                tVar2 = new Y.t(getContext());
                addView(tVar2);
                arrayList.add(tVar2);
            } else {
                tVar2 = (Y.t) arrayList.get(this.f11009l);
                Y.s sVar2 = (Y.s) linkedHashMap2.get(tVar2);
                if (sVar2 != null) {
                    sVar2.F();
                    Y.t tVar3 = (Y.t) linkedHashMap.get(sVar2);
                    if (tVar3 != null) {
                    }
                    linkedHashMap.remove(sVar2);
                    tVar2.c();
                }
            }
            int i9 = this.f11009l;
            if (i9 < this.f11006h - 1) {
                this.f11009l = i9 + 1;
            } else {
                this.f11009l = 0;
            }
        }
        linkedHashMap.put(sVar, tVar2);
        linkedHashMap2.put(tVar2, sVar);
        return tVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i9) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
    }
}
