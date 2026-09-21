package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17350f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17352i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17355m;

    public final void a(int i3) {
        if ((this.f17347c & i3) != 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Layout state should be one of " + java.lang.Integer.toBinaryString(i3) + " but it is " + java.lang.Integer.toBinaryString(this.f17347c));
    }

    public final int b() {
        return this.f17350f ? this.f17345a - this.f17346b : this.f17348d;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("State{mTargetPosition=-1, mData=null, mItemCount=");
        sb.append(this.f17348d);
        sb.append(", mIsMeasuring=");
        sb.append(this.f17351h);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.f17345a);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f17346b);
        sb.append(", mStructureChanged=");
        sb.append(this.f17349e);
        sb.append(", mInPreLayout=");
        sb.append(this.f17350f);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f17352i);
        sb.append(", mRunPredictiveAnimations=");
        return v5.L.a(sb, this.j, '}');
    }
}
