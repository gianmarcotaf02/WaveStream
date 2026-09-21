package T3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r implements android.os.Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    T3.r EF5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ T3.r[] f9800h = {new T3.r("PUBLIC_KEY", 0)};
    public static final android.os.Parcelable.Creator<T3.r> CREATOR = new T3.G(2);

    public static T3.r a(java.lang.String str) throws T3.q {
        for (T3.r rVar : values()) {
            rVar.getClass();
            if (str.equals("public-key")) {
                return rVar;
            }
        }
        throw new T3.q(Y6.f.h("PublicKeyCredentialType ", str, " not supported"));
    }

    public static T3.r valueOf(java.lang.String str) {
        return (T3.r) java.lang.Enum.valueOf(T3.r.class, str);
    }

    public static T3.r[] values() {
        return (T3.r[]) f9800h.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeString("public-key");
    }
}
