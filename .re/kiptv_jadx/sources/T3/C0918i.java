package T3;

/* JADX INFO: renamed from: T3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0918i implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<T3.C0918i> CREATOR = new T3.G(13);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Enum f9777h;

    /* JADX WARN: Multi-variable type inference failed */
    public C0918i(T3.InterfaceC0910a interfaceC0910a) {
        this.f9777h = (java.lang.Enum) interfaceC0910a;
    }

    public static T3.C0918i a(int i3) throws T3.C0917h {
        T3.InterfaceC0910a interfaceC0910a;
        if (i3 != -262) {
            for (T3.t tVar : T3.t.values()) {
                if (tVar.f9805h == i3) {
                    interfaceC0910a = tVar;
                }
            }
            for (T3.EnumC0919j enumC0919j : T3.EnumC0919j.values()) {
                if (enumC0919j.f9779h == i3) {
                    interfaceC0910a = enumC0919j;
                }
            }
            throw new T3.C0917h(Y6.f.f(i3, "Algorithm with COSE value ", " not supported"));
        }
        interfaceC0910a = T3.t.RS1;
        return new T3.C0918i(interfaceC0910a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T3.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T3.a, java.lang.Enum] */
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof T3.C0918i) && this.f9777h.a() == ((T3.C0918i) obj).f9777h.a();
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f9777h});
    }

    public final java.lang.String toString() {
        return Y6.f.h("COSEAlgorithmIdentifier{algorithm=", java.lang.String.valueOf(this.f9777h), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T3.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.f9777h.a());
    }
}
