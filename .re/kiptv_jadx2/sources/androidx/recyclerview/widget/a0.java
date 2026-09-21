package androidx.recyclerview.widget;

import java.util.Arrays;

public final class a0 {

    public int f17370a;

    public int f17371b;

    public boolean f17372c;

    public boolean f17373d;

    public boolean f17374e;

    public int[] f17375f;
    public final StaggeredGridLayoutManager g;

    public a0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
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
            Arrays.fill(iArr, -1);
        }
    }
}
