package T3;

/* JADX INFO: loaded from: classes.dex */
public enum A implements android.os.Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final android.os.Parcelable.Creator<T3.A> CREATOR = new T3.G(10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9743h;

    A(java.lang.String str) {
        this.f9743h = str;
    }

    public static T3.A a(java.lang.String str) throws T3.I {
        for (T3.A a2 : values()) {
            if (str.equals(a2.f9743h)) {
                return a2;
            }
        }
        throw new T3.I(Y6.f.h("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f9743h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString(this.f9743h);
    }
}
