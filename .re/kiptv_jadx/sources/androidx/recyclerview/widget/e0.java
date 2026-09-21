package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.e0> CREATOR = new androidx.recyclerview.widget.d0(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17400i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f17401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f17403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f17404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17407q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.f17399h);
        parcel.writeInt(this.f17400i);
        parcel.writeInt(this.j);
        if (this.j > 0) {
            parcel.writeIntArray(this.f17401k);
        }
        parcel.writeInt(this.f17402l);
        if (this.f17402l > 0) {
            parcel.writeIntArray(this.f17403m);
        }
        parcel.writeInt(this.f17405o ? 1 : 0);
        parcel.writeInt(this.f17406p ? 1 : 0);
        parcel.writeInt(this.f17407q ? 1 : 0);
        parcel.writeList(this.f17404n);
    }
}
