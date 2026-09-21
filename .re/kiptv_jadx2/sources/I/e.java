package I;

import com.google.android.gms.internal.play_billing.V0;
import kotlin.jvm.internal.m;
import p113n1.n;
import p188x0.G;
import p188x0.H;
import p188x0.O;
import p188x0.z;

public final class e implements O {

    public final a f4526a;

    public final a f4527b;

    public final a f4528c;

    public final a f4529d;

    public e(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f4526a = aVar;
        this.f4527b = aVar2;
        this.f4528c = aVar3;
        this.f4529d = aVar4;
    }

    public static e b(e eVar, b bVar, b bVar2, b bVar3, int i3) {
        a aVar = bVar;
        if ((i3 & 1) != 0) {
            aVar = eVar.f4526a;
        }
        a aVar2 = eVar.f4527b;
        a aVar3 = bVar2;
        if ((i3 & 4) != 0) {
            aVar3 = eVar.f4528c;
        }
        eVar.getClass();
        return new e(aVar, aVar2, aVar3, bVar3);
    }

    @Override
    public final z a(long j, n nVar, p113n1.c cVar) {
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
            return new G(V0.c(0L, j));
        }
        p181w0.b bVarC = V0.c(0L, j);
        n nVar2 = n.f25566h;
        float f13 = nVar == nVar2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
        if (nVar == nVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f14 = nVar == nVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        if (nVar != nVar2) {
            fA4 = fA3;
        }
        return new H(new p181w0.c(bVarC.f29746a, bVarC.f29747b, bVarC.f29748c, bVarC.f29749d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.a(this.f4526a, eVar.f4526a)) {
            return false;
        }
        if (!m.a(this.f4527b, eVar.f4527b)) {
            return false;
        }
        if (m.a(this.f4528c, eVar.f4528c)) {
            return m.a(this.f4529d, eVar.f4529d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4529d.hashCode() + ((this.f4528c.hashCode() + ((this.f4527b.hashCode() + (this.f4526a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f4526a + ", topEnd = " + this.f4527b + ", bottomEnd = " + this.f4528c + ", bottomStart = " + this.f4529d + ')';
    }
}
