package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

public final class C1639v extends T1.g {

    public final int f17519d;

    public C1639v(I i3, int i9) {
        super(i3);
        this.f17519d = i9;
    }

    @Override
    public final int b(View view) {
        switch (this.f17519d) {
            case 0:
                J j = (J) view.getLayoutParams();
                ((I) this.f9683b).getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f17218b.right + ((ViewGroup.MarginLayoutParams) j).rightMargin;
            default:
                J j9 = (J) view.getLayoutParams();
                ((I) this.f9683b).getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f17218b.bottom + ((ViewGroup.MarginLayoutParams) j9).bottomMargin;
        }
    }

    @Override
    public final int c(View view) {
        switch (this.f17519d) {
            case 0:
                J j = (J) view.getLayoutParams();
                ((I) this.f9683b).getClass();
                Rect rect = ((J) view.getLayoutParams()).f17218b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) j).leftMargin + ((ViewGroup.MarginLayoutParams) j).rightMargin;
            default:
                J j9 = (J) view.getLayoutParams();
                ((I) this.f9683b).getClass();
                Rect rect2 = ((J) view.getLayoutParams()).f17218b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) j9).topMargin + ((ViewGroup.MarginLayoutParams) j9).bottomMargin;
        }
    }

    @Override
    public final int d(View view) {
        switch (this.f17519d) {
            case 0:
                J j = (J) view.getLayoutParams();
                ((I) this.f9683b).getClass();
                Rect rect = ((J) view.getLayoutParams()).f17218b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) j).topMargin + ((ViewGroup.MarginLayoutParams) j).bottomMargin;
            default:
                J j9 = (J) view.getLayoutParams();
                ((I) this.f9683b).getClass();
                Rect rect2 = ((J) view.getLayoutParams()).f17218b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) j9).leftMargin + ((ViewGroup.MarginLayoutParams) j9).rightMargin;
        }
    }

    @Override
    public final int e(View view) {
        switch (this.f17519d) {
            case 0:
                J j = (J) view.getLayoutParams();
                ((I) this.f9683b).getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f17218b.left) - ((ViewGroup.MarginLayoutParams) j).leftMargin;
            default:
                J j9 = (J) view.getLayoutParams();
                ((I) this.f9683b).getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f17218b.top) - ((ViewGroup.MarginLayoutParams) j9).topMargin;
        }
    }

    @Override
    public final int f() {
        switch (this.f17519d) {
            case 0:
                return ((I) this.f9683b).f17215m;
            default:
                return ((I) this.f9683b).f17216n;
        }
    }

    @Override
    public final int g() {
        switch (this.f17519d) {
            case 0:
                I i3 = (I) this.f9683b;
                return i3.f17215m - i3.A();
            default:
                I i9 = (I) this.f9683b;
                return i9.f17216n - i9.y();
        }
    }

    @Override
    public final int h() {
        switch (this.f17519d) {
            case 0:
                return ((I) this.f9683b).A();
            default:
                return ((I) this.f9683b).y();
        }
    }

    @Override
    public final int i() {
        switch (this.f17519d) {
            case 0:
                return ((I) this.f9683b).f17213k;
            default:
                return ((I) this.f9683b).f17214l;
        }
    }

    @Override
    public final int j() {
        switch (this.f17519d) {
            case 0:
                return ((I) this.f9683b).f17214l;
            default:
                return ((I) this.f9683b).f17213k;
        }
    }

    @Override
    public final int k() {
        switch (this.f17519d) {
            case 0:
                return ((I) this.f9683b).z();
            default:
                return ((I) this.f9683b).B();
        }
    }

    @Override
    public final int l() {
        switch (this.f17519d) {
            case 0:
                I i3 = (I) this.f9683b;
                return (i3.f17215m - i3.z()) - i3.A();
            default:
                I i9 = (I) this.f9683b;
                return (i9.f17216n - i9.B()) - i9.y();
        }
    }

    @Override
    public final int m(View view) {
        switch (this.f17519d) {
            case 0:
                I i3 = (I) this.f9683b;
                Rect rect = (Rect) this.f9684c;
                i3.F(view, rect);
                return rect.right;
            default:
                I i9 = (I) this.f9683b;
                Rect rect2 = (Rect) this.f9684c;
                i9.F(view, rect2);
                return rect2.bottom;
        }
    }

    @Override
    public final int n(View view) {
        switch (this.f17519d) {
            case 0:
                I i3 = (I) this.f9683b;
                Rect rect = (Rect) this.f9684c;
                i3.F(view, rect);
                return rect.left;
            default:
                I i9 = (I) this.f9683b;
                Rect rect2 = (Rect) this.f9684c;
                i9.F(view, rect2);
                return rect2.top;
        }
    }

    @Override
    public final void o(int i3) {
        switch (this.f17519d) {
            case 0:
                ((I) this.f9683b).J(i3);
                break;
            default:
                ((I) this.f9683b).K(i3);
                break;
        }
    }
}
