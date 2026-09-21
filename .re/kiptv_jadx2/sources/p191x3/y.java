package p191x3;

import O3.a;
import O3.b;
import X3.g;
import android.os.Parcel;
import com.google.android.gms.internal.cast.AbstractC1818z;

public final class y extends g {

    public final h f31206d;

    public final Class f31207e;

    public y(h hVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 3);
        this.f31206d = hVar;
        this.f31207e = C3102c.class;
    }

    @Override
    public final boolean c0(int i3, Parcel parcel, Parcel parcel2) {
        Class cls = this.f31207e;
        h hVar = this.f31206d;
        switch (i3) {
            case 1:
                b bVar = new b(hVar);
                parcel2.writeNoException();
                AbstractC1818z.d(parcel2, bVar);
                return true;
            case 2:
                a aVarD0 = b.d0(parcel.readStrongBinder());
                AbstractC1818z.b(parcel);
                f fVar = (f) b.e0(aVarD0);
                if (cls.isInstance(fVar) && hVar != null) {
                    hVar.o((f) cls.cast(fVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                a aVarD1 = b.d0(parcel.readStrongBinder());
                String string = parcel.readString();
                AbstractC1818z.b(parcel);
                f fVar2 = (f) b.e0(aVarD1);
                if (cls.isInstance(fVar2) && hVar != null) {
                    hVar.k((f) cls.cast(fVar2), string);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                a aVarD2 = b.d0(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                AbstractC1818z.b(parcel);
                f fVar3 = (f) b.e0(aVarD2);
                if (cls.isInstance(fVar3) && hVar != null) {
                    hVar.f((f) cls.cast(fVar3), i9);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                a aVarD3 = b.d0(parcel.readStrongBinder());
                AbstractC1818z.b(parcel);
                f fVar4 = (f) b.e0(aVarD3);
                if (cls.isInstance(fVar4) && hVar != null) {
                    hVar.n((f) cls.cast(fVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                a aVarD4 = b.d0(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                AbstractC1818z.b(parcel);
                f fVar5 = (f) b.e0(aVarD4);
                if (cls.isInstance(fVar5) && hVar != null) {
                    hVar.q((f) cls.cast(fVar5), i10);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                a aVarD5 = b.d0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                AbstractC1818z.b(parcel);
                f fVar6 = (f) b.e0(aVarD5);
                if (cls.isInstance(fVar6) && hVar != null) {
                    hVar.e((f) cls.cast(fVar6), string2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                a aVarD6 = b.d0(parcel.readStrongBinder());
                int i11 = AbstractC1818z.f19179a;
                boolean z6 = parcel.readInt() != 0;
                AbstractC1818z.b(parcel);
                f fVar7 = (f) b.e0(aVarD6);
                if (cls.isInstance(fVar7) && hVar != null) {
                    hVar.h((f) cls.cast(fVar7), z6);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                a aVarD7 = b.d0(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                AbstractC1818z.b(parcel);
                f fVar8 = (f) b.e0(aVarD7);
                if (cls.isInstance(fVar8) && hVar != null) {
                    hVar.j((f) cls.cast(fVar8), i12);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                a aVarD8 = b.d0(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                AbstractC1818z.b(parcel);
                f fVar9 = (f) b.e0(aVarD8);
                if (cls.isInstance(fVar9) && hVar != null) {
                    hVar.d((f) cls.cast(fVar9), i13);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
