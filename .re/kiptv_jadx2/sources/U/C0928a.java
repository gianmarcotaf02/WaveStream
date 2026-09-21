package U;

import io.ktor.http.CodecsKt;

public final class C0928a implements p194x6.j {

    public final int f9957h = 0;

    public final boolean f9958i;
    public final boolean j;

    public final Object f9959k;

    public C0928a(InterfaceC0938k interfaceC0938k, boolean z6, boolean z9) {
        this.f9959k = interfaceC0938k;
        this.f9958i = z6;
        this.j = z9;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f9957h) {
            case 0:
                Y0.x xVar = (Y0.x) obj;
                long jA = ((InterfaceC0938k) this.f9959k).a();
                xVar.d(K.f9921c, new J(this.f9958i ? J.L.f5652i : J.L.j, jA, this.j ? I.f9912h : I.j, (9223372034707292159L & jA) != 9205357640488583168L));
                return p070h6.A.f22523a;
            default:
                return CodecsKt.encodeURLQueryComponent$lambda$4$lambda$3(this.f9958i, (StringBuilder) this.f9959k, this.j, ((Byte) obj).byteValue());
        }
    }

    public C0928a(boolean z6, StringBuilder sb, boolean z9) {
        this.f9958i = z6;
        this.f9959k = sb;
        this.j = z9;
    }
}
