package H1;

/* JADX INFO: loaded from: classes.dex */
public final class h extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<H1.h> CREATOR = new B3.e(9);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3865h;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return Y6.f.k(sb, this.f3865h, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f3865h);
    }
}
