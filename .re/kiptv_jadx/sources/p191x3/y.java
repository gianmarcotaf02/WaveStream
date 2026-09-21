package p191x3;

/* JADX INFO: loaded from: classes.dex */
public final class y extends X3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p191x3.h f31206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Class f31207e;

    public y(p191x3.h hVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 3);
        this.f31206d = hVar;
        this.f31207e = p191x3.C3102c.class;
    }

    @Override // X3.g
    public final boolean c0(int i3, android.os.Parcel parcel, android.os.Parcel parcel2) {
        java.lang.Class cls = this.f31207e;
        p191x3.h hVar = this.f31206d;
        switch (i3) {
            case 1:
                O3.b bVar = new O3.b(hVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.AbstractC1818z.d(parcel2, bVar);
                return true;
            case 2:
                O3.a aVarD0 = O3.b.d0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p191x3.f fVar = (p191x3.f) O3.b.e0(aVarD0);
                if (cls.isInstance(fVar) && hVar != null) {
                    hVar.o((p191x3.f) cls.cast(fVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                O3.a aVarD1 = O3.b.d0(parcel.readStrongBinder());
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p191x3.f fVar2 = (p191x3.f) O3.b.e0(aVarD1);
                if (cls.isInstance(fVar2) && hVar != null) {
                    hVar.k((p191x3.f) cls.cast(fVar2), string);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                O3.a aVarD2 = O3.b.d0(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p191x3.f fVar3 = (p191x3.f) O3.b.e0(aVarD2);
                if (cls.isInstance(fVar3) && hVar != null) {
                    hVar.f((p191x3.f) cls.cast(fVar3), i9);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                O3.a aVarD3 = O3.b.d0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p191x3.f fVar4 = (p191x3.f) O3.b.e0(aVarD3);
                if (cls.isInstance(fVar4) && hVar != null) {
                    hVar.n((p191x3.f) cls.cast(fVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                O3.a aVarD4 = O3.b.d0(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p191x3.f fVar5 = (p191x3.f) O3.b.e0(aVarD4);
                if (cls.isInstance(fVar5) && hVar != null) {
                    hVar.q((p191x3.f) cls.cast(fVar5), i10);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                O3.a aVarD5 = O3.b.d0(parcel.readStrongBinder());
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p191x3.f fVar6 = (p191x3.f) O3.b.e0(aVarD5);
                if (cls.isInstance(fVar6) && hVar != null) {
                    hVar.e((p191x3.f) cls.cast(fVar6), string2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                O3.a aVarD6 = O3.b.d0(parcel.readStrongBinder());
                int i11 = com.google.android.gms.internal.cast.AbstractC1818z.f19179a;
                boolean z6 = parcel.readInt() != 0;
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p191x3.f fVar7 = (p191x3.f) O3.b.e0(aVarD6);
                if (cls.isInstance(fVar7) && hVar != null) {
                    hVar.h((p191x3.f) cls.cast(fVar7), z6);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                O3.a aVarD7 = O3.b.d0(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p191x3.f fVar8 = (p191x3.f) O3.b.e0(aVarD7);
                if (cls.isInstance(fVar8) && hVar != null) {
                    hVar.j((p191x3.f) cls.cast(fVar8), i12);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                O3.a aVarD8 = O3.b.d0(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p191x3.f fVar9 = (p191x3.f) O3.b.e0(aVarD8);
                if (cls.isInstance(fVar9) && hVar != null) {
                    hVar.d((p191x3.f) cls.cast(fVar9), i13);
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
