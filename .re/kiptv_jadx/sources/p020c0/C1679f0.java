package p020c0;

/* JADX INFO: renamed from: c0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1679f0 implements android.os.Parcelable.ClassLoaderCreator {
    public static p020c0.C1681g0 a(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        p020c0.C1676e c1676e;
        if (classLoader == null) {
            classLoader = p020c0.C1679f0.class.getClassLoader();
        }
        java.lang.Object value = parcel.readValue(classLoader);
        int i3 = parcel.readInt();
        if (i3 == 0) {
            c1676e = p020c0.C1676e.f18240k;
        } else if (i3 == 1) {
            c1676e = p020c0.C1676e.f18243n;
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException(Y6.f.f(i3, "Unsupported MutableState policy ", " was restored"));
            }
            c1676e = p020c0.C1676e.f18241l;
        }
        return new p020c0.C1681g0(value, c1676e);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i3) {
        return new p020c0.C1681g0[i3];
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return a(parcel, null);
    }
}
