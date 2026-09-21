package V4;

import V7.InterfaceC0982h;
import com.kiptv.core.model.z0;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p153r8.C2691d;
import p153r8.p0;

public final class H implements InterfaceC0982h {

    public final int f10269h;

    public final InterfaceC0982h f10270i;
    public final z0 j;

    public final P f10271k;

    public H(InterfaceC0982h interfaceC0982h, z0 z0Var, P p2, int i3) {
        this.f10269h = i3;
        this.f10270i = interfaceC0982h;
        this.j = z0Var;
        this.f10271k = p2;
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        G g;
        O o8;
        switch (this.f10269h) {
            case 0:
                if (cVar instanceof G) {
                    g = (G) cVar;
                    int i3 = g.f10268i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        g.f10268i = i3 - Integer.MIN_VALUE;
                    } else {
                        g = new G(this, cVar);
                    }
                } else {
                    g = new G(this, cVar);
                }
                Object obj2 = g.f10267h;
                p109m6.a aVar = p109m6.a.f25430h;
                int i9 = g.f10268i;
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(obj2);
                    P.Companion.getClass();
                    z0 contentType = this.j;
                    kotlin.jvm.internal.m.e(contentType, "contentType");
                    String lowerCase = contentType.name().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    String str = (String) ((S1.b) obj).c(E6.G.Q("myList.hiddenPresets.".concat(lowerCase)));
                    Set set = p078i6.y.f23207h;
                    if (str != null) {
                        try {
                            p162s8.d dVar = this.f10271k.f10291b;
                            dVar.getClass();
                            set = (Set) dVar.b(str, new C2691d(p0.f26988a, 2));
                        } catch (Exception unused) {
                        }
                    }
                    g.f10268i = 1;
                    if (this.f10270i.emit(set, g) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj2);
                }
                return p070h6.A.f22523a;
            default:
                if (cVar instanceof O) {
                    o8 = (O) cVar;
                    int i10 = o8.f10286i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        o8.f10286i = i10 - Integer.MIN_VALUE;
                    } else {
                        o8 = new O(this, cVar);
                    }
                } else {
                    o8 = new O(this, cVar);
                }
                Object obj3 = o8.f10285h;
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i11 = o8.f10286i;
                if (i11 == 0) {
                    com.google.common.util.concurrent.P.u0(obj3);
                    P.Companion.getClass();
                    z0 contentType2 = this.j;
                    kotlin.jvm.internal.m.e(contentType2, "contentType");
                    String lowerCase2 = contentType2.name().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                    String str2 = (String) ((S1.b) obj).c(E6.G.Q("myList.tagOrder.".concat(lowerCase2)));
                    List list = p078i6.w.f23205h;
                    if (str2 != null) {
                        try {
                            p162s8.d dVar2 = this.f10271k.f10291b;
                            dVar2.getClass();
                            list = (List) dVar2.b(str2, new C2691d(p0.f26988a, 0));
                        } catch (Exception unused2) {
                        }
                    }
                    o8.f10286i = 1;
                    if (this.f10270i.emit(list, o8) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj3);
                }
                return p070h6.A.f22523a;
        }
    }
}
