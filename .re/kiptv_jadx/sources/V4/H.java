package V4;

/* JADX INFO: loaded from: classes.dex */
public final class H implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V7.InterfaceC0982h f10270i;
    public final /* synthetic */ com.kiptv.core.model.z0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V4.P f10271k;

    public /* synthetic */ H(V7.InterfaceC0982h interfaceC0982h, com.kiptv.core.model.z0 z0Var, V4.P p2, int i3) {
        this.f10269h = i3;
        this.f10270i = interfaceC0982h;
        this.j = z0Var;
        this.f10271k = p2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        V4.G g;
        V4.O o8;
        switch (this.f10269h) {
            case 0:
                if (cVar instanceof V4.G) {
                    g = (V4.G) cVar;
                    int i3 = g.f10268i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        g.f10268i = i3 - Integer.MIN_VALUE;
                    } else {
                        g = new V4.G(this, cVar);
                    }
                } else {
                    g = new V4.G(this, cVar);
                }
                java.lang.Object obj2 = g.f10267h;
                p109m6.a aVar = p109m6.a.f25430h;
                int i9 = g.f10268i;
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(obj2);
                    V4.P.Companion.getClass();
                    com.kiptv.core.model.z0 contentType = this.j;
                    kotlin.jvm.internal.m.e(contentType, "contentType");
                    java.lang.String lowerCase = contentType.name().toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    java.lang.String str = (java.lang.String) ((S1.b) obj).c(E6.G.Q("myList.hiddenPresets.".concat(lowerCase)));
                    java.util.Set set = p078i6.y.f23207h;
                    if (str != null) {
                        try {
                            p162s8.d dVar = this.f10271k.f10291b;
                            dVar.getClass();
                            set = (java.util.Set) dVar.b(str, new p153r8.C2691d(p153r8.p0.f26988a, 2));
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    g.f10268i = 1;
                    if (this.f10270i.emit(set, g) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i9 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj2);
                }
                return p070h6.A.f22523a;
            default:
                if (cVar instanceof V4.O) {
                    o8 = (V4.O) cVar;
                    int i10 = o8.f10286i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        o8.f10286i = i10 - Integer.MIN_VALUE;
                    } else {
                        o8 = new V4.O(this, cVar);
                    }
                } else {
                    o8 = new V4.O(this, cVar);
                }
                java.lang.Object obj3 = o8.f10285h;
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i11 = o8.f10286i;
                if (i11 == 0) {
                    com.google.common.util.concurrent.P.u0(obj3);
                    V4.P.Companion.getClass();
                    com.kiptv.core.model.z0 contentType2 = this.j;
                    kotlin.jvm.internal.m.e(contentType2, "contentType");
                    java.lang.String lowerCase2 = contentType2.name().toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                    java.lang.String str2 = (java.lang.String) ((S1.b) obj).c(E6.G.Q("myList.tagOrder.".concat(lowerCase2)));
                    java.util.List list = p078i6.w.f23205h;
                    if (str2 != null) {
                        try {
                            p162s8.d dVar2 = this.f10271k.f10291b;
                            dVar2.getClass();
                            list = (java.util.List) dVar2.b(str2, new p153r8.C2691d(p153r8.p0.f26988a, 0));
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                    o8.f10286i = 1;
                    if (this.f10270i.emit(list, o8) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj3);
                }
                return p070h6.A.f22523a;
        }
    }
}
