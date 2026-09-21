package p121o0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements android.os.Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26000a;

    public /* synthetic */ m(int i3) {
        this.f26000a = i3;
    }

    public static p121o0.n a(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = p121o0.m.class.getClassLoader();
        }
        int i3 = parcel.readInt();
        if (i3 == 0) {
            return new p121o0.n();
        }
        p056g0.f fVarP = p056g0.i.f21767i.p();
        for (int i9 = 0; i9 < i3; i9++) {
            fVarP.add(parcel.readValue(classLoader));
        }
        return new p121o0.n(fVarP.n());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        switch (this.f26000a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return N1.b.f7298i;
                }
                throw new java.lang.IllegalStateException("superState must be null");
            case 2:
                return new androidx.recyclerview.widget.S(parcel, classLoader);
            default:
                return new p103m.W0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i3) {
        switch (this.f26000a) {
            case 0:
                return new p121o0.n[i3];
            case 1:
                return new N1.b[i3];
            case 2:
                return new androidx.recyclerview.widget.S[i3];
            default:
                return new p103m.W0[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f26000a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return N1.b.f7298i;
                }
                throw new java.lang.IllegalStateException("superState must be null");
            case 2:
                return new androidx.recyclerview.widget.S(parcel, null);
            default:
                return new p103m.W0(parcel, null);
        }
    }
}
