package T3;

/* JADX INFO: renamed from: T3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0914e implements android.os.Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final android.os.Parcelable.Creator<T3.EnumC0914e> CREATOR = new T3.G(8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9762h;

    EnumC0914e(java.lang.String str) {
        this.f9762h = str;
    }

    public static T3.EnumC0914e a(java.lang.String str) throws T3.C0913d {
        for (T3.EnumC0914e enumC0914e : values()) {
            if (str.equals(enumC0914e.f9762h)) {
                return enumC0914e;
            }
        }
        throw new T3.C0913d(Y6.f.h("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f9762h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString(this.f9762h);
    }
}
