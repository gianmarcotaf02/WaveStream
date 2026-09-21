package T3;

/* JADX INFO: loaded from: classes.dex */
public enum w implements android.os.Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final android.os.Parcelable.Creator<T3.w> CREATOR = new T3.G(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9809h;

    w(java.lang.String str) {
        this.f9809h = str;
    }

    public static T3.w a(java.lang.String str) throws T3.x {
        for (T3.w wVar : values()) {
            if (str.equals(wVar.f9809h)) {
                return wVar;
            }
        }
        throw new T3.x(Y6.f.h("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f9809h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString(this.f9809h);
    }
}
