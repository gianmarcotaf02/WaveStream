package androidx.recyclerview.widget;

public final class C1628j extends L {

    public final C1631m f17447a;

    public C1628j(C1631m c1631m) {
        this.f17447a = c1631m;
    }

    @Override
    public final void a(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C1631m c1631m = this.f17447a;
        int iComputeVerticalScrollRange = c1631m.f17471s.computeVerticalScrollRange();
        int i3 = c1631m.f17470r;
        int i9 = iComputeVerticalScrollRange - i3;
        int i10 = c1631m.f17455a;
        c1631m.f17472t = i9 > 0 && i3 >= i10;
        int iComputeHorizontalScrollRange = c1631m.f17471s.computeHorizontalScrollRange();
        int i11 = c1631m.f17469q;
        boolean z6 = iComputeHorizontalScrollRange - i11 > 0 && i11 >= i10;
        c1631m.f17473u = z6;
        boolean z9 = c1631m.f17472t;
        if (!z9 && !z6) {
            if (c1631m.f17474v != 0) {
                c1631m.d(0);
                return;
            }
            return;
        }
        if (z9) {
            float f9 = i3;
            c1631m.f17464l = (int) ((((f9 / 2.0f) + iComputeVerticalScrollOffset) * f9) / iComputeVerticalScrollRange);
            c1631m.f17463k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (c1631m.f17473u) {
            float f10 = iComputeHorizontalScrollOffset;
            float f11 = i11;
            c1631m.f17467o = (int) ((((f11 / 2.0f) + f10) * f11) / iComputeHorizontalScrollRange);
            c1631m.f17466n = Math.min(i11, (i11 * i11) / iComputeHorizontalScrollRange);
        }
        int i12 = c1631m.f17474v;
        if (i12 == 0 || i12 == 1) {
            c1631m.d(1);
        }
    }
}
