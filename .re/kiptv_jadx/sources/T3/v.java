package T3;

/* JADX INFO: loaded from: classes.dex */
public enum v implements android.os.Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final android.os.Parcelable.Creator<T3.v> CREATOR = new T3.G(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9807h;

    v(java.lang.String str) {
        this.f9807h = str;
    }

    public static T3.v a(java.lang.String str) {
        for (T3.v vVar : values()) {
            if (str.equals(vVar.f9807h)) {
                return vVar;
            }
        }
        throw new T3.u(Y6.f.h("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f9807h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString(this.f9807h);
    }
}
