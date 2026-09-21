package androidx.recyclerview.widget;

public final class T {

    public int f17345a;

    public int f17346b;

    public int f17347c;

    public int f17348d;

    public boolean f17349e;

    public boolean f17350f;
    public boolean g;

    public boolean f17351h;

    public boolean f17352i;
    public boolean j;

    public int f17353k;

    public long f17354l;

    public int f17355m;

    public final void a(int i3) {
        if ((this.f17347c & i3) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i3) + " but it is " + Integer.toBinaryString(this.f17347c));
    }

    public final int b() {
        return this.f17350f ? this.f17345a - this.f17346b : this.f17348d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=-1, mData=null, mItemCount=");
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
