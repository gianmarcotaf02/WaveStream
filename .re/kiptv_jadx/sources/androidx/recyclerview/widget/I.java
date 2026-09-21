package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.support.v4.media.session.q f17205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f17206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S2.a f17207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S2.a f17208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17210f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17212i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17216n;

    public I() {
        androidx.recyclerview.widget.G g = new androidx.recyclerview.widget.G(0, this);
        androidx.recyclerview.widget.G g9 = new androidx.recyclerview.widget.G(1, this);
        this.f17207c = new S2.a(g);
        this.f17208d = new S2.a(g9);
        this.f17209e = false;
        this.f17210f = false;
        this.g = true;
        this.f17211h = true;
    }

    public static int C(android.view.View view) {
        return ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17217a.getLayoutPosition();
    }

    public static androidx.recyclerview.widget.H D(android.content.Context context, android.util.AttributeSet attributeSet, int i3, int i9) {
        androidx.recyclerview.widget.H h9 = new androidx.recyclerview.widget.H();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p156s2.a.f27253a, i3, i9);
        h9.f17201a = typedArrayObtainStyledAttributes.getInt(0, 1);
        h9.f17202b = typedArrayObtainStyledAttributes.getInt(10, 1);
        h9.f17203c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        h9.f17204d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return h9;
    }

    public static boolean H(int i3, int i9, int i10) {
        int mode = android.view.View.MeasureSpec.getMode(i9);
        int size = android.view.View.MeasureSpec.getSize(i9);
        if (i10 > 0 && i3 != i10) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i3;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i3;
        }
        return true;
    }

    public static void I(android.view.View view, int i3, int i9, int i10, int i11) {
        androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view.getLayoutParams();
        android.graphics.Rect rect = j.f17218b;
        view.layout(i3 + rect.left + ((android.view.ViewGroup.MarginLayoutParams) j).leftMargin, i9 + rect.top + ((android.view.ViewGroup.MarginLayoutParams) j).topMargin, (i10 - rect.right) - ((android.view.ViewGroup.MarginLayoutParams) j).rightMargin, (i11 - rect.bottom) - ((android.view.ViewGroup.MarginLayoutParams) j).bottomMargin);
    }

    public static int f(int i3, int i9, int i10) {
        int mode = android.view.View.MeasureSpec.getMode(i3);
        int size = android.view.View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? java.lang.Math.max(i9, i10) : size;
        }
        return java.lang.Math.min(size, java.lang.Math.max(i9, i10));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int v(int i3, int i9, boolean z6, int i10, int i11) {
        int iMax = java.lang.Math.max(0, i3 - i10);
        if (z6) {
            if (i11 >= 0) {
                i9 = 1073741824;
            } else if (i11 != -1 || (i9 != Integer.MIN_VALUE && (i9 == 0 || i9 != 1073741824))) {
                i9 = 0;
                i11 = 0;
            } else {
                i11 = iMax;
            }
        } else if (i11 >= 0) {
            i9 = 1073741824;
        } else if (i11 == -1) {
            i11 = iMax;
        } else if (i11 != -2) {
            i9 = 0;
            i11 = 0;
        } else if (i9 == Integer.MIN_VALUE || i9 == 1073741824) {
            i11 = iMax;
            i9 = Integer.MIN_VALUE;
        } else {
            i11 = iMax;
            i9 = 0;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i11, i9);
    }

    public static void x(android.view.View view, android.graphics.Rect rect) {
        int[] iArr = androidx.recyclerview.widget.RecyclerView.f17250F0;
        androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view.getLayoutParams();
        android.graphics.Rect rect2 = j.f17218b;
        rect.set((view.getLeft() - rect2.left) - ((android.view.ViewGroup.MarginLayoutParams) j).leftMargin, (view.getTop() - rect2.top) - ((android.view.ViewGroup.MarginLayoutParams) j).topMargin, view.getRight() + rect2.right + ((android.view.ViewGroup.MarginLayoutParams) j).rightMargin, view.getBottom() + rect2.bottom + ((android.view.ViewGroup.MarginLayoutParams) j).bottomMargin);
    }

    public final int A() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int B() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int E(androidx.recyclerview.widget.O o8, androidx.recyclerview.widget.T t9) {
        return -1;
    }

    public final void F(android.view.View view, android.graphics.Rect rect) {
        android.graphics.Matrix matrix;
        android.graphics.Rect rect2 = ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f17206b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            android.graphics.RectF rectF = this.f17206b.f17310s;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean G();

    public void J(int i3) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            int iT = recyclerView.f17298m.t();
            for (int i9 = 0; i9 < iT; i9++) {
                recyclerView.f17298m.s(i9).offsetLeftAndRight(i3);
            }
        }
    }

    public void K(int i3) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            int iT = recyclerView.f17298m.t();
            for (int i9 = 0; i9 < iT; i9++) {
                recyclerView.f17298m.s(i9).offsetTopAndBottom(i3);
            }
        }
    }

    public abstract void M(androidx.recyclerview.widget.RecyclerView recyclerView);

    public abstract android.view.View N(android.view.View view, int i3, androidx.recyclerview.widget.O o8, androidx.recyclerview.widget.T t9);

    public void O(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        androidx.recyclerview.widget.O o8 = recyclerView.j;
        androidx.recyclerview.widget.T t9 = recyclerView.f17299m0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z6 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f17206b.canScrollVertically(-1) && !this.f17206b.canScrollHorizontally(-1) && !this.f17206b.canScrollHorizontally(1)) {
            z6 = false;
        }
        accessibilityEvent.setScrollable(z6);
        androidx.recyclerview.widget.A a2 = this.f17206b.f17312t;
        if (a2 != null) {
            accessibilityEvent.setItemCount(a2.getItemCount());
        }
    }

    public void P(androidx.recyclerview.widget.O o8, androidx.recyclerview.widget.T t9, E1.f fVar) {
        boolean zCanScrollVertically = this.f17206b.canScrollVertically(-1);
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = fVar.f2755a;
        if (zCanScrollVertically || this.f17206b.canScrollHorizontally(-1)) {
            fVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f17206b.canScrollVertically(1) || this.f17206b.canScrollHorizontally(1)) {
            fVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(E(o8, t9), w(o8, t9), false, 0));
    }

    public final void Q(android.view.View view, E1.f fVar) {
        androidx.recyclerview.widget.X xG = androidx.recyclerview.widget.RecyclerView.G(view);
        if (xG == null || xG.isRemoved()) {
            return;
        }
        android.support.v4.media.session.q qVar = this.f17205a;
        if (((java.util.ArrayList) qVar.f15618k).contains(xG.itemView)) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        R(recyclerView.j, recyclerView.f17299m0, view, fVar);
    }

    public abstract void X(androidx.recyclerview.widget.O o8, androidx.recyclerview.widget.T t9);

    public abstract void Y(androidx.recyclerview.widget.T t9);

    public abstract void Z(android.os.Parcelable parcelable);

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    public final void a(android.view.View view, int i3, boolean z6) {
        int iC;
        androidx.recyclerview.widget.X xG = androidx.recyclerview.widget.RecyclerView.G(view);
        if (z6 || xG.isRemoved()) {
            p136q.S s9 = (p136q.S) this.f17206b.f17300n.f9211i;
            androidx.recyclerview.widget.h0 h0VarA = (androidx.recyclerview.widget.h0) s9.get(xG);
            if (h0VarA == null) {
                h0VarA = androidx.recyclerview.widget.h0.a();
                s9.put(xG, h0VarA);
            }
            h0VarA.f17442a |= 1;
        } else {
            this.f17206b.f17300n.O(xG);
        }
        androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view.getLayoutParams();
        if (xG.wasReturnedFromScrap() || xG.isScrap()) {
            if (xG.isScrap()) {
                xG.unScrap();
            } else {
                xG.clearReturnedFromScrapFlag();
            }
            this.f17205a.i(view, i3, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f17206b) {
            android.support.v4.media.session.q qVar = this.f17205a;
            int iIndexOfChild = ((androidx.recyclerview.widget.C1642y) qVar.f15617i).f17522a.indexOfChild(view);
            if (iIndexOfChild == -1) {
                iC = -1;
            } else {
                C8.a aVar = (C8.a) qVar.j;
                if (aVar.e(iIndexOfChild)) {
                    iC = -1;
                } else {
                    iC = iIndexOfChild - aVar.c(iIndexOfChild);
                }
            }
            if (i3 == -1) {
                i3 = this.f17205a.t();
            }
            if (iC == -1) {
                throw new java.lang.IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f17206b.indexOfChild(view) + this.f17206b.w());
            }
            if (iC != i3) {
                androidx.recyclerview.widget.I i9 = this.f17206b.f17314u;
                android.view.View viewT = i9.t(iC);
                if (viewT == null) {
                    throw new java.lang.IllegalArgumentException("Cannot move a child from non-existing index:" + iC + i9.f17206b.toString());
                }
                i9.t(iC);
                i9.f17205a.n(iC);
                androidx.recyclerview.widget.J j9 = (androidx.recyclerview.widget.J) viewT.getLayoutParams();
                androidx.recyclerview.widget.X xG2 = androidx.recyclerview.widget.RecyclerView.G(viewT);
                if (xG2.isRemoved()) {
                    p136q.S s10 = (p136q.S) i9.f17206b.f17300n.f9211i;
                    androidx.recyclerview.widget.h0 h0VarA2 = (androidx.recyclerview.widget.h0) s10.get(xG2);
                    if (h0VarA2 == null) {
                        h0VarA2 = androidx.recyclerview.widget.h0.a();
                        s10.put(xG2, h0VarA2);
                    }
                    h0VarA2.f17442a = 1 | h0VarA2.f17442a;
                } else {
                    i9.f17206b.f17300n.O(xG2);
                }
                i9.f17205a.i(viewT, i3, j9, xG2.isRemoved());
            }
        } else {
            this.f17205a.h(view, i3, false);
            j.f17219c = true;
        }
        if (j.f17220d) {
            xG.itemView.invalidate();
            j.f17220d = false;
        }
    }

    public abstract android.os.Parcelable a0();

    public abstract void b(java.lang.String str);

    public void b0(int i3) {
    }

    public abstract boolean c();

    public final void c0(androidx.recyclerview.widget.O o8) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            if (!androidx.recyclerview.widget.RecyclerView.G(t(iU)).shouldIgnore()) {
                android.view.View viewT = t(iU);
                f0(iU);
                o8.h(viewT);
            }
        }
    }

    public abstract boolean d();

    public final void d0(androidx.recyclerview.widget.O o8) {
        java.util.ArrayList arrayList;
        int size = o8.f17242a.size();
        int i3 = size - 1;
        while (true) {
            arrayList = o8.f17242a;
            if (i3 < 0) {
                break;
            }
            android.view.View view = ((androidx.recyclerview.widget.X) arrayList.get(i3)).itemView;
            androidx.recyclerview.widget.X xG = androidx.recyclerview.widget.RecyclerView.G(view);
            if (!xG.shouldIgnore()) {
                xG.setIsRecyclable(false);
                if (xG.isTmpDetached()) {
                    this.f17206b.removeDetachedView(view, false);
                }
                androidx.recyclerview.widget.F f9 = this.f17206b.f17279S;
                if (f9 != null) {
                    f9.d(xG);
                }
                xG.setIsRecyclable(true);
                androidx.recyclerview.widget.X xG2 = androidx.recyclerview.widget.RecyclerView.G(view);
                xG2.mScrapContainer = null;
                xG2.mInChangeScrap = false;
                xG2.clearReturnedFromScrapFlag();
                o8.i(xG2);
            }
            i3--;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = o8.f17243b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f17206b.invalidate();
        }
    }

    public boolean e(androidx.recyclerview.widget.J j) {
        return j != null;
    }

    public final void e0(android.view.View view, androidx.recyclerview.widget.O o8) {
        android.support.v4.media.session.q qVar = this.f17205a;
        androidx.recyclerview.widget.C1642y c1642y = (androidx.recyclerview.widget.C1642y) qVar.f15617i;
        int iIndexOfChild = c1642y.f17522a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((C8.a) qVar.j).i(iIndexOfChild)) {
                qVar.Q(view);
            }
            c1642y.h(iIndexOfChild);
        }
        o8.h(view);
    }

    public final void f0(int i3) {
        if (t(i3) != null) {
            android.support.v4.media.session.q qVar = this.f17205a;
            int iX = qVar.x(i3);
            androidx.recyclerview.widget.C1642y c1642y = (androidx.recyclerview.widget.C1642y) qVar.f15617i;
            android.view.View childAt = c1642y.f17522a.getChildAt(iX);
            if (childAt == null) {
                return;
            }
            if (((C8.a) qVar.j).i(iX)) {
                qVar.Q(childAt);
            }
            c1642y.h(iX);
        }
    }

    public abstract void g(int i3, int i9, androidx.recyclerview.widget.T t9, U.C0948v c0948v);

    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    public final boolean g0(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z6, boolean z9) {
        int iZ = z();
        int iB = B();
        int iA = this.f17215m - A();
        int iY = this.f17216n - y();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i3 = left - iZ;
        int iMin = java.lang.Math.min(0, i3);
        int i9 = top - iB;
        int iMin2 = java.lang.Math.min(0, i9);
        int i10 = iWidth - iA;
        int iMax = java.lang.Math.max(0, i10);
        int iMax2 = java.lang.Math.max(0, iHeight - iY);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f17206b;
        java.util.WeakHashMap weakHashMap = D1.U.f1980a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = java.lang.Math.min(i3, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = java.lang.Math.max(iMin, i10);
        }
        if (iMin2 == 0) {
            iMin2 = java.lang.Math.min(i9, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (z9) {
            android.view.View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iZ2 = z();
                int iB2 = B();
                int iA2 = this.f17215m - A();
                int iY2 = this.f17216n - y();
                android.graphics.Rect rect2 = this.f17206b.f17306q;
                x(focusedChild, rect2);
                if (rect2.left - i11 < iA2 && rect2.right - i11 > iZ2 && rect2.top - i12 < iY2 && rect2.bottom - i12 > iB2) {
                    if (i11 == 0) {
                    }
                    if (z6) {
                        recyclerView.scrollBy(i11, i12);
                        return true;
                    }
                    recyclerView.a0(i11, i12, false);
                    return true;
                }
            }
        } else if (i11 == 0 || i12 != 0) {
            if (z6) {
                recyclerView.scrollBy(i11, i12);
                return true;
            }
            recyclerView.a0(i11, i12, false);
            return true;
        }
        return false;
    }

    public final void h0() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int i(androidx.recyclerview.widget.T t9);

    public abstract int i0(int i3, androidx.recyclerview.widget.O o8, androidx.recyclerview.widget.T t9);

    public abstract int j(androidx.recyclerview.widget.T t9);

    public abstract int j0(int i3, androidx.recyclerview.widget.O o8, androidx.recyclerview.widget.T t9);

    public abstract int k(androidx.recyclerview.widget.T t9);

    public final void k0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        l0(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int l(androidx.recyclerview.widget.T t9);

    public final void l0(int i3, int i9) {
        this.f17215m = android.view.View.MeasureSpec.getSize(i3);
        int mode = android.view.View.MeasureSpec.getMode(i3);
        this.f17213k = mode;
        if (mode == 0 && !androidx.recyclerview.widget.RecyclerView.f17252H0) {
            this.f17215m = 0;
        }
        this.f17216n = android.view.View.MeasureSpec.getSize(i9);
        int mode2 = android.view.View.MeasureSpec.getMode(i9);
        this.f17214l = mode2;
        if (mode2 != 0 || androidx.recyclerview.widget.RecyclerView.f17252H0) {
            return;
        }
        this.f17216n = 0;
    }

    public abstract int m(androidx.recyclerview.widget.T t9);

    public void m0(android.graphics.Rect rect, int i3, int i9) {
        int iA = A() + z() + rect.width();
        int iY = y() + B() + rect.height();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        java.util.WeakHashMap weakHashMap = D1.U.f1980a;
        this.f17206b.setMeasuredDimension(f(i3, iA, recyclerView.getMinimumWidth()), f(i9, iY, this.f17206b.getMinimumHeight()));
    }

    public abstract int n(androidx.recyclerview.widget.T t9);

    public final void n0(int i3, int i9) {
        int iU = u();
        if (iU == 0) {
            this.f17206b.l(i3, i9);
            return;
        }
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        for (int i14 = 0; i14 < iU; i14++) {
            android.view.View viewT = t(i14);
            android.graphics.Rect rect = this.f17206b.f17306q;
            x(viewT, rect);
            int i15 = rect.left;
            if (i15 < i13) {
                i13 = i15;
            }
            int i16 = rect.right;
            if (i16 > i10) {
                i10 = i16;
            }
            int i17 = rect.top;
            if (i17 < i11) {
                i11 = i17;
            }
            int i18 = rect.bottom;
            if (i18 > i12) {
                i12 = i18;
            }
        }
        this.f17206b.f17306q.set(i13, i11, i10, i12);
        m0(this.f17206b.f17306q, i3, i9);
    }

    public final void o(androidx.recyclerview.widget.O o8) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            android.view.View viewT = t(iU);
            androidx.recyclerview.widget.X xG = androidx.recyclerview.widget.RecyclerView.G(viewT);
            if (!xG.shouldIgnore()) {
                if (!xG.isInvalid() || xG.isRemoved() || this.f17206b.f17312t.hasStableIds()) {
                    t(iU);
                    this.f17205a.n(iU);
                    o8.j(viewT);
                    this.f17206b.f17300n.O(xG);
                } else {
                    f0(iU);
                    o8.i(xG);
                }
            }
        }
    }

    public final void o0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f17206b = null;
            this.f17205a = null;
            this.f17215m = 0;
            this.f17216n = 0;
        } else {
            this.f17206b = recyclerView;
            this.f17205a = recyclerView.f17298m;
            this.f17215m = recyclerView.getWidth();
            this.f17216n = recyclerView.getHeight();
        }
        this.f17213k = 1073741824;
        this.f17214l = 1073741824;
    }

    public android.view.View p(int i3) {
        int iU = u();
        for (int i9 = 0; i9 < iU; i9++) {
            android.view.View viewT = t(i9);
            androidx.recyclerview.widget.X xG = androidx.recyclerview.widget.RecyclerView.G(viewT);
            if (xG != null && xG.getLayoutPosition() == i3 && !xG.shouldIgnore() && (this.f17206b.f17299m0.f17350f || !xG.isRemoved())) {
                return viewT;
            }
        }
        return null;
    }

    public final boolean p0(android.view.View view, int i3, int i9, androidx.recyclerview.widget.J j) {
        return (!view.isLayoutRequested() && this.g && H(view.getWidth(), i3, ((android.view.ViewGroup.MarginLayoutParams) j).width) && H(view.getHeight(), i9, ((android.view.ViewGroup.MarginLayoutParams) j).height)) ? false : true;
    }

    public abstract androidx.recyclerview.widget.J q();

    public boolean q0() {
        return false;
    }

    public androidx.recyclerview.widget.J r(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.recyclerview.widget.J(context, attributeSet);
    }

    public final boolean r0(android.view.View view, int i3, int i9, androidx.recyclerview.widget.J j) {
        return (this.g && H(view.getMeasuredWidth(), i3, ((android.view.ViewGroup.MarginLayoutParams) j).width) && H(view.getMeasuredHeight(), i9, ((android.view.ViewGroup.MarginLayoutParams) j).height)) ? false : true;
    }

    public androidx.recyclerview.widget.J s(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.recyclerview.widget.J) {
            return new androidx.recyclerview.widget.J((androidx.recyclerview.widget.J) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new androidx.recyclerview.widget.J((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new androidx.recyclerview.widget.J(layoutParams);
    }

    public abstract boolean s0();

    public final android.view.View t(int i3) {
        android.support.v4.media.session.q qVar = this.f17205a;
        if (qVar != null) {
            return qVar.s(i3);
        }
        return null;
    }

    public final int u() {
        android.support.v4.media.session.q qVar = this.f17205a;
        if (qVar != null) {
            return qVar.t();
        }
        return 0;
    }

    public int w(androidx.recyclerview.widget.O o8, androidx.recyclerview.widget.T t9) {
        return -1;
    }

    public final int y() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int z() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public void L() {
    }

    public void T() {
    }

    public void S(int i3, int i9) {
    }

    public void U(int i3, int i9) {
    }

    public void V(int i3, int i9) {
    }

    public void W(int i3, int i9) {
    }

    public void h(int i3, U.C0948v c0948v) {
    }

    public void R(androidx.recyclerview.widget.O o8, androidx.recyclerview.widget.T t9, android.view.View view, E1.f fVar) {
    }
}
