package T3;

/* JADX INFO: renamed from: T3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0912c implements android.os.Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final android.os.Parcelable.Creator<T3.EnumC0912c> CREATOR = new B3.e(20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9760h;

    EnumC0912c(java.lang.String str) {
        this.f9760h = str;
    }

    public static T3.EnumC0912c a(java.lang.String str) {
        for (T3.EnumC0912c enumC0912c : values()) {
            if (str.equals(enumC0912c.f9760h)) {
                return enumC0912c;
            }
        }
        throw new T3.C0911b(Y6.f.h("Attachment ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f9760h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString(this.f9760h);
    }
}
