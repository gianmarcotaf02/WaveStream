package I;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p188x0.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I.a f4526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I.a f4527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I.a f4528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I.a f4529d;

    public e(I.a aVar, I.a aVar2, I.a aVar3, I.a aVar4) {
        this.f4526a = aVar;
        this.f4527b = aVar2;
        this.f4528c = aVar3;
        this.f4529d = aVar4;
    }

    public static I.e b(I.e eVar, I.b bVar, I.b bVar2, I.b bVar3, int i3) {
        I.a aVar = bVar;
        if ((i3 & 1) != 0) {
            aVar = eVar.f4526a;
        }
        I.a aVar2 = eVar.f4527b;
        I.a aVar3 = bVar2;
        if ((i3 & 4) != 0) {
            aVar3 = eVar.f4528c;
        }
        eVar.getClass();
        return new I.e(aVar, aVar2, aVar3, bVar3);
    }

    @Override // p188x0.O
    public final p188x0.z a(long j, p113n1.n nVar, p113n1.c cVar) {
        float fA = this.f4526a.a(j, cVar);
        float fA2 = this.f4527b.a(j, cVar);
        float fA3 = this.f4528c.a(j, cVar);
        float fA4 = this.f4529d.a(j, cVar);
        float fC = p181w0.d.c(j);
        float f9 = fA + fA4;
        if (f9 > fC) {
            float f10 = fC / f9;
            fA *= f10;
            fA4 *= f10;
        }
        float f11 = fA2 + fA3;
        if (f11 > fC) {
            float f12 = fC / f11;
            fA2 *= f12;
            fA3 *= f12;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            A.b.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new p188x0.G(com.google.android.gms.internal.play_billing.V0.c(0L, j));
        }
        p181w0.b bVarC = com.google.android.gms.internal.play_billing.V0.c(0L, j);
        p113n1.n nVar2 = p113n1.n.f25566h;
        float f13 = nVar == nVar2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(f13)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f13)) & 4294967295L);
        if (nVar == nVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(fA)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA)) & 4294967295L);
        float f14 = nVar == nVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) java.lang.Float.floatToRawIntBits(f14)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f14)) & 4294967295L);
        if (nVar != nVar2) {
            fA4 = fA3;
        }
        return new p188x0.H(new p181w0.c(bVarC.f29746a, bVarC.f29747b, bVarC.f29748c, bVarC.f29749d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) java.lang.Float.floatToRawIntBits(fA4)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I.e)) {
            return false;
        }
        I.e eVar = (I.e) obj;
        if (!kotlin.jvm.internal.m.a(this.f4526a, eVar.f4526a)) {
            return false;
        }
        if (!kotlin.jvm.internal.m.a(this.f4527b, eVar.f4527b)) {
            return false;
        }
        if (kotlin.jvm.internal.m.a(this.f4528c, eVar.f4528c)) {
            return kotlin.jvm.internal.m.a(this.f4529d, eVar.f4529d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4529d.hashCode() + ((this.f4528c.hashCode() + ((this.f4527b.hashCode() + (this.f4526a.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "RoundedCornerShape(topStart = " + this.f4526a + ", topEnd = " + this.f4527b + ", bottomEnd = " + this.f4528c + ", bottomStart = " + this.f4529d + ')';
    }
}
