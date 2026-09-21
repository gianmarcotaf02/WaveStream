package W7;

import U7.EnumC0955c;
import V7.InterfaceC0981g;
import V7.InterfaceC0982h;
import androidx.media3.common.util.Log;
import java.util.ArrayList;

public abstract class g implements v {

    public final p100l6.h f10739h;

    public final int f10740i;
    public final EnumC0955c j;

    public g(p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        this.f10739h = hVar;
        this.f10740i = i3;
        this.j = enumC0955c;
    }

    @Override
    public final InterfaceC0981g a(p100l6.h hVar, int i3, EnumC0955c enumC0955c) {
        p100l6.h hVar2 = this.f10739h;
        p100l6.h hVarPlus = hVar.plus(hVar2);
        EnumC0955c enumC0955c2 = EnumC0955c.f10175h;
        EnumC0955c enumC0955c3 = this.j;
        int i9 = this.f10740i;
        if (enumC0955c == enumC0955c2) {
            if (i9 != -3) {
                if (i3 == -3) {
                    i3 = i9;
                } else if (i9 != -2) {
                    if (i3 == -2) {
                        i3 = i9;
                    } else {
                        i3 += i9;
                        if (i3 < 0) {
                            i3 = Log.LOG_LEVEL_OFF;
                        }
                    }
                }
            }
            enumC0955c = enumC0955c3;
        }
        return (kotlin.jvm.internal.m.a(hVarPlus, hVar2) && i3 == i9 && enumC0955c == enumC0955c3) ? this : d(hVarPlus, i3, enumC0955c);
    }

    public String b() {
        return null;
    }

    public abstract Object c(U7.A a2, p100l6.c cVar);

    @Override
    public Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        Object objM = S7.C.m(new C1011e(interfaceC0982h, this, null), cVar);
        return objM == p109m6.a.f25430h ? objM : p070h6.A.f22523a;
    }

    public abstract g d(p100l6.h hVar, int i3, EnumC0955c enumC0955c);

    public InterfaceC0981g e() {
        return null;
    }

    public U7.C f(S7.A a2) {
        int i3 = this.f10740i;
        if (i3 == -3) {
            i3 = -2;
        }
        S7.B b9 = S7.B.j;
        p194x6.m fVar = new f(this, null);
        U7.z zVar = new U7.z(S7.C.B(a2, this.f10739h), N3.a.b(i3, 4, this.j), true, true);
        zVar.b0(b9, zVar, fVar);
        return zVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        p100l6.i iVar = p100l6.i.f24820h;
        p100l6.h hVar = this.f10739h;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i3 = this.f10740i;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        EnumC0955c enumC0955c = EnumC0955c.f10175h;
        EnumC0955c enumC0955c2 = this.j;
        if (enumC0955c2 != enumC0955c) {
            arrayList.add("onBufferOverflow=" + enumC0955c2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return Y6.f.l(sb, p078i6.o.o1(arrayList, ", ", null, null, null, 62), ']');
    }
}
