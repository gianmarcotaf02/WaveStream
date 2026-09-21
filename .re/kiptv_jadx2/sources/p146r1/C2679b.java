package p146r1;

import C5.F0;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

public final class C2679b extends o implements j {

    public final int f26724h;

    public final y f26725i;

    public C2679b(y yVar, int i3) {
        super(1);
        this.f26724h = i3;
        this.f26725i = yVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f26724h) {
            case 0:
                y yVar = this.f26725i;
                yVar.show();
                return new F0(14, yVar);
            default:
                y yVar2 = this.f26725i;
                if (yVar2.f26790l.f26783a) {
                    yVar2.f26789k.invoke();
                }
                return A.f22523a;
        }
    }
}
