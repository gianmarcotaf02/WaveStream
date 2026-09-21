package J5;

import O1.C0739c;
import V4.C0973p;
import V4.C0974q;
import V7.InterfaceC0982h;
import com.kiptv.core.model.LocalDeviceSettings;
import com.kiptv.core.model.Playlist;
import com.kiptv.core.model.UserSettings;
import p005a5.C1444w8;
import p193x5.C3138q0;
import p193x5.C3147v0;

public final class V implements InterfaceC0982h {

    public final int f6285h;

    public final InterfaceC0982h f6286i;

    public V(InterfaceC0982h interfaceC0982h, int i3) {
        this.f6285h = i3;
        this.f6286i = interfaceC0982h;
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) throws Throwable {
        U u6;
        O1.r rVar;
        P5.c cVar2;
        C0973p c0973p;
        V7.N n3;
        C1444w8 c1444w8;
        String str;
        p116n5.z zVar;
        p125o5.c cVar3;
        p193x5.a1 a1Var;
        y5.r rVar2;
        switch (this.f6285h) {
            case 0:
                if (cVar instanceof U) {
                    u6 = (U) cVar;
                    int i3 = u6.f6279i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        u6.f6279i = i3 - Integer.MIN_VALUE;
                    } else {
                        u6 = new U(this, cVar);
                    }
                } else {
                    u6 = new U(this, cVar);
                }
                Object obj2 = u6.f6278h;
                p109m6.a aVar = p109m6.a.f25430h;
                int i9 = u6.f6279i;
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(obj2);
                    String str2 = ((UserSettings) obj).f20591p;
                    u6.f6279i = 1;
                    if (this.f6286i.emit(str2, u6) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj2);
                }
                return p070h6.A.f22523a;
            case 1:
                if (cVar instanceof O1.r) {
                    rVar = (O1.r) cVar;
                    int i10 = rVar.f7858i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        rVar.f7858i = i10 - Integer.MIN_VALUE;
                    } else {
                        rVar = new O1.r(this, cVar);
                    }
                } else {
                    rVar = new O1.r(this, cVar);
                }
                Object obj3 = rVar.f7857h;
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i11 = rVar.f7858i;
                if (i11 == 0) {
                    com.google.common.util.concurrent.P.u0(obj3);
                    O1.Y y = (O1.Y) obj;
                    if (y instanceof O1.Q) {
                        throw ((O1.Q) y).f7790b;
                    }
                    if (!(y instanceof C0739c)) {
                        if (y instanceof O1.O ? true : y instanceof O1.Z) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new I3.b();
                    }
                    Object obj4 = ((C0739c) y).f7813b;
                    rVar.f7858i = 1;
                    if (this.f6286i.emit(obj4, rVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj3);
                }
                return p070h6.A.f22523a;
            case 2:
                if (cVar instanceof P5.c) {
                    cVar2 = (P5.c) cVar;
                    int i12 = cVar2.f8148i;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        cVar2.f8148i = i12 - Integer.MIN_VALUE;
                    } else {
                        cVar2 = new P5.c(this, cVar);
                    }
                } else {
                    cVar2 = new P5.c(this, cVar);
                }
                Object obj5 = cVar2.f8147h;
                p109m6.a aVar3 = p109m6.a.f25430h;
                int i13 = cVar2.f8148i;
                if (i13 == 0) {
                    com.google.common.util.concurrent.P.u0(obj5);
                    Object objC = ((S1.b) obj).c(P5.g.f8156e);
                    cVar2.f8148i = 1;
                    if (this.f6286i.emit(objC, cVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj5);
                }
                return p070h6.A.f22523a;
            case 3:
                if (cVar instanceof C0973p) {
                    c0973p = (C0973p) cVar;
                    int i14 = c0973p.f10324i;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0973p.f10324i = i14 - Integer.MIN_VALUE;
                    } else {
                        c0973p = new C0973p(this, cVar);
                    }
                } else {
                    c0973p = new C0973p(this, cVar);
                }
                Object obj6 = c0973p.f10323h;
                p109m6.a aVar4 = p109m6.a.f25430h;
                int i15 = c0973p.f10324i;
                if (i15 == 0) {
                    com.google.common.util.concurrent.P.u0(obj6);
                    String str3 = (String) ((S1.b) obj).c(C0974q.f10326f);
                    if (str3 == null) {
                        str3 = "red";
                    }
                    c0973p.f10324i = 1;
                    if (this.f6286i.emit(str3, c0973p) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj6);
                }
                return p070h6.A.f22523a;
            case 4:
                if (cVar instanceof V7.N) {
                    n3 = (V7.N) cVar;
                    int i16 = n3.f10406i;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        n3.f10406i = i16 - Integer.MIN_VALUE;
                    } else {
                        n3 = new V7.N(this, cVar);
                    }
                } else {
                    n3 = new V7.N(this, cVar);
                }
                Object obj7 = n3.f10405h;
                p109m6.a aVar5 = p109m6.a.f25430h;
                int i17 = n3.f10406i;
                if (i17 == 0) {
                    com.google.common.util.concurrent.P.u0(obj7);
                    if (obj != null) {
                        n3.f10406i = 1;
                        if (this.f6286i.emit(obj, n3) == aVar5) {
                            return aVar5;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj7);
                }
                return p070h6.A.f22523a;
            case 5:
                if (cVar instanceof C1444w8) {
                    c1444w8 = (C1444w8) cVar;
                    int i18 = c1444w8.f15274i;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c1444w8.f15274i = i18 - Integer.MIN_VALUE;
                    } else {
                        c1444w8 = new C1444w8(this, cVar);
                    }
                } else {
                    c1444w8 = new C1444w8(this, cVar);
                }
                Object obj8 = c1444w8.f15273h;
                p109m6.a aVar6 = p109m6.a.f25430h;
                int i19 = c1444w8.f15274i;
                if (i19 == 0) {
                    com.google.common.util.concurrent.P.u0(obj8);
                    Playlist playlist = (Playlist) obj;
                    String string = (playlist == null || (str = playlist.f20033a) == null) ? null : str.toString();
                    c1444w8.f15274i = 1;
                    if (this.f6286i.emit(string, c1444w8) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj8);
                }
                return p070h6.A.f22523a;
            case 6:
                if (cVar instanceof p116n5.z) {
                    zVar = (p116n5.z) cVar;
                    int i20 = zVar.f25830i;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        zVar.f25830i = i20 - Integer.MIN_VALUE;
                    } else {
                        zVar = new p116n5.z(this, cVar);
                    }
                } else {
                    zVar = new p116n5.z(this, cVar);
                }
                Object obj9 = zVar.f25829h;
                p109m6.a aVar7 = p109m6.a.f25430h;
                int i21 = zVar.f25830i;
                if (i21 == 0) {
                    com.google.common.util.concurrent.P.u0(obj9);
                    String str4 = ((UserSettings) obj).f20591p;
                    zVar.f25830i = 1;
                    if (this.f6286i.emit(str4, zVar) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj9);
                }
                return p070h6.A.f22523a;
            case 7:
                if (cVar instanceof p125o5.c) {
                    cVar3 = (p125o5.c) cVar;
                    int i22 = cVar3.f26138i;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        cVar3.f26138i = i22 - Integer.MIN_VALUE;
                    } else {
                        cVar3 = new p125o5.c(this, cVar);
                    }
                } else {
                    cVar3 = new p125o5.c(this, cVar);
                }
                Object obj10 = cVar3.f26137h;
                p109m6.a aVar8 = p109m6.a.f25430h;
                int i23 = cVar3.f26138i;
                if (i23 == 0) {
                    com.google.common.util.concurrent.P.u0(obj10);
                    Boolean bool = (Boolean) ((S1.b) obj).c(p125o5.d.f26139c);
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                    cVar3.f26138i = 1;
                    if (this.f6286i.emit(boolValueOf, cVar3) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj10);
                }
                return p070h6.A.f22523a;
            case 8:
                if (cVar instanceof p193x5.a1) {
                    a1Var = (p193x5.a1) cVar;
                    int i24 = a1Var.f31423i;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        a1Var.f31423i = i24 - Integer.MIN_VALUE;
                    } else {
                        a1Var = new p193x5.a1(this, cVar);
                    }
                } else {
                    a1Var = new p193x5.a1(this, cVar);
                }
                Object obj11 = a1Var.f31422h;
                p109m6.a aVar9 = p109m6.a.f25430h;
                int i25 = a1Var.f31423i;
                if (i25 == 0) {
                    com.google.common.util.concurrent.P.u0(obj11);
                    C3138q0 c3138q0 = (C3138q0) obj;
                    C3147v0 c3147v0 = new C3147v0(c3138q0.f31585c, c3138q0.f31586d, c3138q0.f31588f, c3138q0.f31590i, c3138q0.f31600t);
                    a1Var.f31423i = 1;
                    if (this.f6286i.emit(c3147v0, a1Var) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj11);
                }
                return p070h6.A.f22523a;
            default:
                if (cVar instanceof y5.r) {
                    rVar2 = (y5.r) cVar;
                    int i26 = rVar2.f31937i;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        rVar2.f31937i = i26 - Integer.MIN_VALUE;
                    } else {
                        rVar2 = new y5.r(this, cVar);
                    }
                } else {
                    rVar2 = new y5.r(this, cVar);
                }
                Object obj12 = rVar2.f31936h;
                p109m6.a aVar10 = p109m6.a.f25430h;
                int i27 = rVar2.f31937i;
                if (i27 == 0) {
                    com.google.common.util.concurrent.P.u0(obj12);
                    Boolean boolValueOf2 = Boolean.valueOf(((LocalDeviceSettings) obj).f19827e);
                    rVar2.f31937i = 1;
                    if (this.f6286i.emit(boolValueOf2, rVar2) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj12);
                }
                return p070h6.A.f22523a;
        }
    }
}
