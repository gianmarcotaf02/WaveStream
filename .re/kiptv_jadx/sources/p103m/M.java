package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class M extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<p103m.M> CREATOR = new androidx.recyclerview.widget.d0(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24942h;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeByte(this.f24942h ? (byte) 1 : (byte) 0);
    }
}
