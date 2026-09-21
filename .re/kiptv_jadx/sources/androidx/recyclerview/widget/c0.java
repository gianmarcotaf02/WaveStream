package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.c0> CREATOR = new T3.G(29);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17385i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17386k;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        return "FullSpanItem{mPosition=" + this.f17384h + ", mGapDir=" + this.f17385i + ", mHasUnwantedGapAfter=" + this.f17386k + ", mGapPerSpan=" + java.util.Arrays.toString(this.j) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.f17384h);
        parcel.writeInt(this.f17385i);
        parcel.writeInt(this.f17386k ? 1 : 0);
        int[] iArr = this.j;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.j);
        }
    }
}
