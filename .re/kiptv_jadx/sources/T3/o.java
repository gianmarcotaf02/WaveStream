package T3;

/* JADX INFO: loaded from: classes.dex */
public final class o extends I3.a {
    public static final android.os.Parcelable.Creator<T3.o> CREATOR = new T3.G(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T3.r f9796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T3.C0918i f9797i;

    public o(java.lang.String str, int i3) {
        H3.q.g(str);
        try {
            this.f9796h = T3.r.a(str);
            try {
                this.f9797i = T3.C0918i.a(i3);
            } catch (T3.C0917h e6) {
                throw new java.lang.IllegalArgumentException(e6);
            }
        } catch (T3.q e9) {
            throw new java.lang.IllegalArgumentException(e9);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof T3.o)) {
            return false;
        }
        T3.o oVar = (T3.o) obj;
        return this.f9796h.equals(oVar.f9796h) && this.f9797i.equals(oVar.f9797i);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f9796h, this.f9797i});
    }

    public final java.lang.String toString() {
        return Y6.f.i("PublicKeyCredentialParameters{\n type=", java.lang.String.valueOf(this.f9796h), ", \n algorithm=", java.lang.String.valueOf(this.f9797i), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T3.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        this.f9796h.getClass();
        E6.G.Z(parcel, 2, "public-key");
        E6.G.W(parcel, 3, java.lang.Integer.valueOf(this.f9797i.f9777h.a()));
        E6.G.g0(parcel, iF0);
    }
}
