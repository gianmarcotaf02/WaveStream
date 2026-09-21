package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1639v extends T1.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1639v(androidx.recyclerview.widget.I i3, int i9) {
        super(i3);
        this.f17519d = i9;
    }

    @Override // T1.g
    public final int b(android.view.View view) {
        switch (this.f17519d) {
            case 0:
                androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f9683b).getClass();
                return view.getRight() + ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b.right + ((android.view.ViewGroup.MarginLayoutParams) j).rightMargin;
            default:
                androidx.recyclerview.widget.J j9 = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f9683b).getClass();
                return view.getBottom() + ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b.bottom + ((android.view.ViewGroup.MarginLayoutParams) j9).bottomMargin;
        }
    }

    @Override // T1.g
    public final int c(android.view.View view) {
        switch (this.f17519d) {
            case 0:
                androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f9683b).getClass();
                android.graphics.Rect rect = ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((android.view.ViewGroup.MarginLayoutParams) j).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) j).rightMargin;
            default:
                androidx.recyclerview.widget.J j9 = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f9683b).getClass();
                android.graphics.Rect rect2 = ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((android.view.ViewGroup.MarginLayoutParams) j9).topMargin + ((android.view.ViewGroup.MarginLayoutParams) j9).bottomMargin;
        }
    }

    @Override // T1.g
    public final int d(android.view.View view) {
        switch (this.f17519d) {
            case 0:
                androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f9683b).getClass();
                android.graphics.Rect rect = ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((android.view.ViewGroup.MarginLayoutParams) j).topMargin + ((android.view.ViewGroup.MarginLayoutParams) j).bottomMargin;
            default:
                androidx.recyclerview.widget.J j9 = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f9683b).getClass();
                android.graphics.Rect rect2 = ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((android.view.ViewGroup.MarginLayoutParams) j9).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) j9).rightMargin;
        }
    }

    @Override // T1.g
    public final int e(android.view.View view) {
        switch (this.f17519d) {
            case 0:
                androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f9683b).getClass();
                return (view.getLeft() - ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b.left) - ((android.view.ViewGroup.MarginLayoutParams) j).leftMargin;
            default:
                androidx.recyclerview.widget.J j9 = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f9683b).getClass();
                return (view.getTop() - ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b.top) - ((android.view.ViewGroup.MarginLayoutParams) j9).topMargin;
        }
    }

    @Override // T1.g
    public final int f() {
        switch (this.f17519d) {
            case 0:
                return ((androidx.recyclerview.widget.I) this.f9683b).f17215m;
            default:
                return ((androidx.recyclerview.widget.I) this.f9683b).f17216n;
        }
    }

    @Override // T1.g
    public final int g() {
        switch (this.f17519d) {
            case 0:
                androidx.recyclerview.widget.I i3 = (androidx.recyclerview.widget.I) this.f9683b;
                return i3.f17215m - i3.A();
            default:
                androidx.recyclerview.widget.I i9 = (androidx.recyclerview.widget.I) this.f9683b;
                return i9.f17216n - i9.y();
        }
    }

    @Override // T1.g
    public final int h() {
        switch (this.f17519d) {
            case 0:
                return ((androidx.recyclerview.widget.I) this.f9683b).A();
            default:
                return ((androidx.recyclerview.widget.I) this.f9683b).y();
        }
    }

    @Override // T1.g
    public final int i() {
        switch (this.f17519d) {
            case 0:
                return ((androidx.recyclerview.widget.I) this.f9683b).f17213k;
            default:
                return ((androidx.recyclerview.widget.I) this.f9683b).f17214l;
        }
    }

    @Override // T1.g
    public final int j() {
        switch (this.f17519d) {
            case 0:
                return ((androidx.recyclerview.widget.I) this.f9683b).f17214l;
            default:
                return ((androidx.recyclerview.widget.I) this.f9683b).f17213k;
        }
    }

    @Override // T1.g
    public final int k() {
        switch (this.f17519d) {
            case 0:
                return ((androidx.recyclerview.widget.I) this.f9683b).z();
            default:
                return ((androidx.recyclerview.widget.I) this.f9683b).B();
        }
    }

    @Override // T1.g
    public final int l() {
        switch (this.f17519d) {
            case 0:
                androidx.recyclerview.widget.I i3 = (androidx.recyclerview.widget.I) this.f9683b;
                return (i3.f17215m - i3.z()) - i3.A();
            default:
                androidx.recyclerview.widget.I i9 = (androidx.recyclerview.widget.I) this.f9683b;
                return (i9.f17216n - i9.B()) - i9.y();
        }
    }

    @Override // T1.g
    public final int m(android.view.View view) {
        switch (this.f17519d) {
            case 0:
                androidx.recyclerview.widget.I i3 = (androidx.recyclerview.widget.I) this.f9683b;
                android.graphics.Rect rect = (android.graphics.Rect) this.f9684c;
                i3.F(view, rect);
                return rect.right;
            default:
                androidx.recyclerview.widget.I i9 = (androidx.recyclerview.widget.I) this.f9683b;
                android.graphics.Rect rect2 = (android.graphics.Rect) this.f9684c;
                i9.F(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // T1.g
    public final int n(android.view.View view) {
        switch (this.f17519d) {
            case 0:
                androidx.recyclerview.widget.I i3 = (androidx.recyclerview.widget.I) this.f9683b;
                android.graphics.Rect rect = (android.graphics.Rect) this.f9684c;
                i3.F(view, rect);
                return rect.left;
            default:
                androidx.recyclerview.widget.I i9 = (androidx.recyclerview.widget.I) this.f9683b;
                android.graphics.Rect rect2 = (android.graphics.Rect) this.f9684c;
                i9.F(view, rect2);
                return rect2.top;
        }
    }

    @Override // T1.g
    public final void o(int i3) {
        switch (this.f17519d) {
            case 0:
                ((androidx.recyclerview.widget.I) this.f9683b).J(i3);
                break;
            default:
                ((androidx.recyclerview.widget.I) this.f9683b).K(i3);
                break;
        }
    }
}
