package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

public final class G {

    public final int f17192a;

    public final Object f17193b;

    public G(int i3, Object obj) {
        this.f17192a = i3;
        this.f17193b = obj;
    }

    public int a(View view) {
        switch (this.f17192a) {
            case 0:
                J j = (J) view.getLayoutParams();
                ((I) this.f17193b).getClass();
                return view.getRight() + ((J) view.getLayoutParams()).f17218b.right + ((ViewGroup.MarginLayoutParams) j).rightMargin;
            default:
                J j9 = (J) view.getLayoutParams();
                ((I) this.f17193b).getClass();
                return view.getBottom() + ((J) view.getLayoutParams()).f17218b.bottom + ((ViewGroup.MarginLayoutParams) j9).bottomMargin;
        }
    }

    public int b(View view) {
        switch (this.f17192a) {
            case 0:
                J j = (J) view.getLayoutParams();
                ((I) this.f17193b).getClass();
                return (view.getLeft() - ((J) view.getLayoutParams()).f17218b.left) - ((ViewGroup.MarginLayoutParams) j).leftMargin;
            default:
                J j9 = (J) view.getLayoutParams();
                ((I) this.f17193b).getClass();
                return (view.getTop() - ((J) view.getLayoutParams()).f17218b.top) - ((ViewGroup.MarginLayoutParams) j9).topMargin;
        }
    }

    public int c() {
        switch (this.f17192a) {
            case 0:
                I i3 = (I) this.f17193b;
                return i3.f17215m - i3.A();
            default:
                I i9 = (I) this.f17193b;
                return i9.f17216n - i9.y();
        }
    }

    public int d() {
        switch (this.f17192a) {
            case 0:
                return ((I) this.f17193b).z();
            default:
                return ((I) this.f17193b).B();
        }
    }
}
