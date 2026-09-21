package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f17193b;

    public /* synthetic */ G(int i3, java.lang.Object obj) {
        this.f17192a = i3;
        this.f17193b = obj;
    }

    public int a(android.view.View view) {
        switch (this.f17192a) {
            case 0:
                androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f17193b).getClass();
                return view.getRight() + ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b.right + ((android.view.ViewGroup.MarginLayoutParams) j).rightMargin;
            default:
                androidx.recyclerview.widget.J j9 = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f17193b).getClass();
                return view.getBottom() + ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b.bottom + ((android.view.ViewGroup.MarginLayoutParams) j9).bottomMargin;
        }
    }

    public int b(android.view.View view) {
        switch (this.f17192a) {
            case 0:
                androidx.recyclerview.widget.J j = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f17193b).getClass();
                return (view.getLeft() - ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b.left) - ((android.view.ViewGroup.MarginLayoutParams) j).leftMargin;
            default:
                androidx.recyclerview.widget.J j9 = (androidx.recyclerview.widget.J) view.getLayoutParams();
                ((androidx.recyclerview.widget.I) this.f17193b).getClass();
                return (view.getTop() - ((androidx.recyclerview.widget.J) view.getLayoutParams()).f17218b.top) - ((android.view.ViewGroup.MarginLayoutParams) j9).topMargin;
        }
    }

    public int c() {
        switch (this.f17192a) {
            case 0:
                androidx.recyclerview.widget.I i3 = (androidx.recyclerview.widget.I) this.f17193b;
                return i3.f17215m - i3.A();
            default:
                androidx.recyclerview.widget.I i9 = (androidx.recyclerview.widget.I) this.f17193b;
                return i9.f17216n - i9.y();
        }
    }

    public int d() {
        switch (this.f17192a) {
            case 0:
                return ((androidx.recyclerview.widget.I) this.f17193b).z();
            default:
                return ((androidx.recyclerview.widget.I) this.f17193b).B();
        }
    }
}
