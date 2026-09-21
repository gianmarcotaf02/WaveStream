package T1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f9683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f9684c;

    public g(androidx.recyclerview.widget.I i3) {
        this.f9682a = Integer.MIN_VALUE;
        this.f9684c = new android.graphics.Rect();
        this.f9683b = i3;
    }

    public static T1.g a(androidx.recyclerview.widget.I i3, int i9) {
        if (i9 == 0) {
            return new androidx.recyclerview.widget.C1639v(i3, 0);
        }
        if (i9 == 1) {
            return new androidx.recyclerview.widget.C1639v(i3, 1);
        }
        throw new java.lang.IllegalArgumentException("invalid orientation");
    }

    public abstract int b(android.view.View view);

    public abstract int c(android.view.View view);

    public abstract int d(android.view.View view);

    public abstract int e(android.view.View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(android.view.View view);

    public abstract int n(android.view.View view);

    public abstract void o(int i3);

    public g(T1.i iVar) {
        this.f9682a = 0;
        this.f9684c = new T1.d();
        this.f9683b = iVar;
    }
}
