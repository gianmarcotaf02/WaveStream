package androidx.recyclerview.widget;

import U.C0948v;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class I {

    public android.support.v4.media.session.q f17205a;

    public RecyclerView f17206b;

    public final S2.a f17207c;

    public final S2.a f17208d;

    public boolean f17209e;

    public boolean f17210f;
    public final boolean g;

    public final boolean f17211h;

    public int f17212i;
    public boolean j;

    public int f17213k;

    public int f17214l;

    public int f17215m;

    public int f17216n;

    public I() {
        G g = new G(0, this);
        G g9 = new G(1, this);
        this.f17207c = new S2.a(g);
        this.f17208d = new S2.a(g9);
        this.f17209e = false;
        this.f17210f = false;
        this.g = true;
        this.f17211h = true;
    }

    public static int C(View view) {
        return ((J) view.getLayoutParams()).f17217a.getLayoutPosition();
    }

    public static H D(Context context, AttributeSet attributeSet, int i3, int i9) {
        H h9 = new H();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p156s2.a.f27253a, i3, i9);
        h9.f17201a = typedArrayObtainStyledAttributes.getInt(0, 1);
        h9.f17202b = typedArrayObtainStyledAttributes.getInt(10, 1);
        h9.f17203c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        h9.f17204d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return h9;
    }

    public static boolean H(int i3, int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
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

    public static void I(View view, int i3, int i9, int i10, int i11) {
        J j = (J) view.getLayoutParams();
        Rect rect = j.f17218b;
        view.layout(i3 + rect.left + ((ViewGroup.MarginLayoutParams) j).leftMargin, i9 + rect.top + ((ViewGroup.MarginLayoutParams) j).topMargin, (i10 - rect.right) - ((ViewGroup.MarginLayoutParams) j).rightMargin, (i11 - rect.bottom) - ((ViewGroup.MarginLayoutParams) j).bottomMargin);
    }

    public static int f(int i3, int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i9, i10) : size;
        }
        return Math.min(size, Math.max(i9, i10));
    }

    public static int v(int i3, int i9, boolean z6, int i10, int i11) {
        int iMax = Math.max(0, i3 - i10);
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
        return View.MeasureSpec.makeMeasureSpec(i11, i9);
    }

    public static void x(View view, Rect rect) {
        int[] iArr = RecyclerView.f17250F0;
        J j = (J) view.getLayoutParams();
        Rect rect2 = j.f17218b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) j).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) j).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) j).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) j).bottomMargin);
    }

    public final int A() {
        RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int E(O o8, T t9) {
        return -1;
    }

    public final void F(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((J) view.getLayoutParams()).f17218b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f17206b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f17206b.f17310s;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean G();

    public void J(int i3) {
        RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            int iT = recyclerView.f17298m.t();
            for (int i9 = 0; i9 < iT; i9++) {
                recyclerView.f17298m.s(i9).offsetLeftAndRight(i3);
            }
        }
    }

    public void K(int i3) {
        RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            int iT = recyclerView.f17298m.t();
            for (int i9 = 0; i9 < iT; i9++) {
                recyclerView.f17298m.s(i9).offsetTopAndBottom(i3);
            }
        }
    }

    public abstract void M(RecyclerView recyclerView);

    public abstract View N(View view, int i3, O o8, T t9);

    public void O(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f17206b;
        O o8 = recyclerView.j;
        T t9 = recyclerView.f17299m0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z6 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f17206b.canScrollVertically(-1) && !this.f17206b.canScrollHorizontally(-1) && !this.f17206b.canScrollHorizontally(1)) {
            z6 = false;
        }
        accessibilityEvent.setScrollable(z6);
        A a2 = this.f17206b.f17312t;
        if (a2 != null) {
            accessibilityEvent.setItemCount(a2.getItemCount());
        }
    }

    public void P(O o8, T t9, E1.f fVar) {
        boolean zCanScrollVertically = this.f17206b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f2755a;
        if (zCanScrollVertically || this.f17206b.canScrollHorizontally(-1)) {
            fVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f17206b.canScrollVertically(1) || this.f17206b.canScrollHorizontally(1)) {
            fVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(E(o8, t9), w(o8, t9), false, 0));
    }

    public final void Q(View view, E1.f fVar) {
        X xG = RecyclerView.G(view);
        if (xG == null || xG.isRemoved()) {
            return;
        }
        android.support.v4.media.session.q qVar = this.f17205a;
        if (((ArrayList) qVar.f15618k).contains(xG.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.f17206b;
        R(recyclerView.j, recyclerView.f17299m0, view, fVar);
    }

    public abstract void X(O o8, T t9);

    public abstract void Y(T t9);

    public abstract void Z(Parcelable parcelable);

    public final void a(View view, int i3, boolean z6) {
        int iC;
        X xG = RecyclerView.G(view);
        if (z6 || xG.isRemoved()) {
            p136q.S s9 = (p136q.S) this.f17206b.f17300n.f9211i;
            h0 h0VarA = (h0) s9.get(xG);
            if (h0VarA == null) {
                h0VarA = h0.a();
                s9.put(xG, h0VarA);
            }
            h0VarA.f17442a |= 1;
        } else {
            this.f17206b.f17300n.O(xG);
        }
        J j = (J) view.getLayoutParams();
        if (xG.wasReturnedFromScrap() || xG.isScrap()) {
            if (xG.isScrap()) {
                xG.unScrap();
            } else {
                xG.clearReturnedFromScrapFlag();
            }
            this.f17205a.i(view, i3, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f17206b) {
            android.support.v4.media.session.q qVar = this.f17205a;
            int iIndexOfChild = ((C1642y) qVar.f15617i).f17522a.indexOfChild(view);
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
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f17206b.indexOfChild(view) + this.f17206b.w());
            }
            if (iC != i3) {
                I i9 = this.f17206b.f17314u;
                View viewT = i9.t(iC);
                if (viewT == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + i9.f17206b.toString());
                }
                i9.t(iC);
                i9.f17205a.n(iC);
                J j9 = (J) viewT.getLayoutParams();
                X xG2 = RecyclerView.G(viewT);
                if (xG2.isRemoved()) {
                    p136q.S s10 = (p136q.S) i9.f17206b.f17300n.f9211i;
                    h0 h0VarA2 = (h0) s10.get(xG2);
                    if (h0VarA2 == null) {
                        h0VarA2 = h0.a();
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

    public abstract Parcelable a0();

    public abstract void b(String str);

    public void b0(int i3) {
    }

    public abstract boolean c();

    public final void c0(O o8) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            if (!RecyclerView.G(t(iU)).shouldIgnore()) {
                View viewT = t(iU);
                f0(iU);
                o8.h(viewT);
            }
        }
    }

    public abstract boolean d();

    public final void d0(O o8) {
        ArrayList arrayList;
        int size = o8.f17242a.size();
        int i3 = size - 1;
        while (true) {
            arrayList = o8.f17242a;
            if (i3 < 0) {
                break;
            }
            View view = ((X) arrayList.get(i3)).itemView;
            X xG = RecyclerView.G(view);
            if (!xG.shouldIgnore()) {
                xG.setIsRecyclable(false);
                if (xG.isTmpDetached()) {
                    this.f17206b.removeDetachedView(view, false);
                }
                F f9 = this.f17206b.f17279S;
                if (f9 != null) {
                    f9.d(xG);
                }
                xG.setIsRecyclable(true);
                X xG2 = RecyclerView.G(view);
                xG2.mScrapContainer = null;
                xG2.mInChangeScrap = false;
                xG2.clearReturnedFromScrapFlag();
                o8.i(xG2);
            }
            i3--;
        }
        arrayList.clear();
        ArrayList arrayList2 = o8.f17243b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f17206b.invalidate();
        }
    }

    public boolean e(J j) {
        return j != null;
    }

    public final void e0(View view, O o8) {
        android.support.v4.media.session.q qVar = this.f17205a;
        C1642y c1642y = (C1642y) qVar.f15617i;
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
            C1642y c1642y = (C1642y) qVar.f15617i;
            View childAt = c1642y.f17522a.getChildAt(iX);
            if (childAt == null) {
                return;
            }
            if (((C8.a) qVar.j).i(iX)) {
                qVar.Q(childAt);
            }
            c1642y.h(iX);
        }
    }

    public abstract void g(int i3, int i9, T t9, C0948v c0948v);

    public final boolean g0(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z9) {
        int iZ = z();
        int iB = B();
        int iA = this.f17215m - A();
        int iY = this.f17216n - y();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i3 = left - iZ;
        int iMin = Math.min(0, i3);
        int i9 = top - iB;
        int iMin2 = Math.min(0, i9);
        int i10 = iWidth - iA;
        int iMax = Math.max(0, i10);
        int iMax2 = Math.max(0, iHeight - iY);
        RecyclerView recyclerView2 = this.f17206b;
        WeakHashMap weakHashMap = D1.U.f1980a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i3, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i10);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i9, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (z9) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iZ2 = z();
                int iB2 = B();
                int iA2 = this.f17215m - A();
                int iY2 = this.f17216n - y();
                Rect rect2 = this.f17206b.f17306q;
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
        RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int i(T t9);

    public abstract int i0(int i3, O o8, T t9);

    public abstract int j(T t9);

    public abstract int j0(int i3, O o8, T t9);

    public abstract int k(T t9);

    public final void k0(RecyclerView recyclerView) {
        l0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int l(T t9);

    public final void l0(int i3, int i9) {
        this.f17215m = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        this.f17213k = mode;
        if (mode == 0 && !RecyclerView.f17252H0) {
            this.f17215m = 0;
        }
        this.f17216n = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i9);
        this.f17214l = mode2;
        if (mode2 != 0 || RecyclerView.f17252H0) {
            return;
        }
        this.f17216n = 0;
    }

    public abstract int m(T t9);

    public void m0(Rect rect, int i3, int i9) {
        int iA = A() + z() + rect.width();
        int iY = y() + B() + rect.height();
        RecyclerView recyclerView = this.f17206b;
        WeakHashMap weakHashMap = D1.U.f1980a;
        this.f17206b.setMeasuredDimension(f(i3, iA, recyclerView.getMinimumWidth()), f(i9, iY, this.f17206b.getMinimumHeight()));
    }

    public abstract int n(T t9);

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
            View viewT = t(i14);
            Rect rect = this.f17206b.f17306q;
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

    public final void o(O o8) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            X xG = RecyclerView.G(viewT);
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

    public final void o0(RecyclerView recyclerView) {
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

    public View p(int i3) {
        int iU = u();
        for (int i9 = 0; i9 < iU; i9++) {
            View viewT = t(i9);
            X xG = RecyclerView.G(viewT);
            if (xG != null && xG.getLayoutPosition() == i3 && !xG.shouldIgnore() && (this.f17206b.f17299m0.f17350f || !xG.isRemoved())) {
                return viewT;
            }
        }
        return null;
    }

    public final boolean p0(View view, int i3, int i9, J j) {
        return (!view.isLayoutRequested() && this.g && H(view.getWidth(), i3, ((ViewGroup.MarginLayoutParams) j).width) && H(view.getHeight(), i9, ((ViewGroup.MarginLayoutParams) j).height)) ? false : true;
    }

    public abstract J q();

    public boolean q0() {
        return false;
    }

    public J r(Context context, AttributeSet attributeSet) {
        return new J(context, attributeSet);
    }

    public final boolean r0(View view, int i3, int i9, J j) {
        return (this.g && H(view.getMeasuredWidth(), i3, ((ViewGroup.MarginLayoutParams) j).width) && H(view.getMeasuredHeight(), i9, ((ViewGroup.MarginLayoutParams) j).height)) ? false : true;
    }

    public J s(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof J) {
            return new J((J) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new J((ViewGroup.MarginLayoutParams) layoutParams) : new J(layoutParams);
    }

    public abstract boolean s0();

    public final View t(int i3) {
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

    public int w(O o8, T t9) {
        return -1;
    }

    public final int y() {
        RecyclerView recyclerView = this.f17206b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int z() {
        RecyclerView recyclerView = this.f17206b;
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

    public void h(int i3, C0948v c0948v) {
    }

    public void R(O o8, T t9, View view, E1.f fVar) {
    }
}
