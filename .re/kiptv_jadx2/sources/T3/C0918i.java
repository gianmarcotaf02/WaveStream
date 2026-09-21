package T3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class C0918i implements Parcelable {
    public static final Parcelable.Creator<C0918i> CREATOR = new G(13);

    public final Enum f9777h;

    public C0918i(InterfaceC0910a interfaceC0910a) {
        this.f9777h = (Enum) interfaceC0910a;
    }

    public static C0918i a(int i3) throws C0917h {
        InterfaceC0910a interfaceC0910a;
        if (i3 != -262) {
            for (t tVar : t.values()) {
                if (tVar.f9805h == i3) {
                    interfaceC0910a = tVar;
                }
            }
            for (EnumC0919j enumC0919j : EnumC0919j.values()) {
                if (enumC0919j.f9779h == i3) {
                    interfaceC0910a = enumC0919j;
                }
            }
            throw new C0917h(Y6.f.f(i3, "Algorithm with COSE value ", " not supported"));
        }
        interfaceC0910a = t.RS1;
        return new C0918i(interfaceC0910a);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0918i) && this.f9777h.a() == ((C0918i) obj).f9777h.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9777h});
    }

    public final String toString() {
        return Y6.f.h("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f9777h), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f9777h.a());
    }
}
