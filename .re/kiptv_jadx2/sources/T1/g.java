package T1;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.C1639v;
import androidx.recyclerview.widget.I;

public abstract class g {

    public int f9682a;

    public final Object f9683b;

    public final Object f9684c;

    public g(I i3) {
        this.f9682a = Integer.MIN_VALUE;
        this.f9684c = new Rect();
        this.f9683b = i3;
    }

    public static g a(I i3, int i9) {
        if (i9 == 0) {
            return new C1639v(i3, 0);
        }
        if (i9 == 1) {
            return new C1639v(i3, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i3);

    public g(i iVar) {
        this.f9682a = 0;
        this.f9684c = new d();
        this.f9683b = iVar;
    }
}
