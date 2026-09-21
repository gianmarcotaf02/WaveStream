package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f17375f;
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager g;

    public a0(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f17370a = -1;
        this.f17371b = Integer.MIN_VALUE;
        this.f17372c = false;
        this.f17373d = false;
        this.f17374e = false;
        int[] iArr = this.f17375f;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
    }
}
