package V7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B.C0063a f10507a = new B.C0063a(26);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N6.A f10508b = new N6.A("NO_VALUE", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N6.A f10509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N6.A f10510d;

    static {
        int i3 = 2;
        f10509c = new N6.A("NONE", i3);
        f10510d = new N6.A("PENDING", i3);
    }

    public static V7.a0 a(int i3, int i9, U7.EnumC0955c enumC0955c) {
        int i10 = (i9 & 1) != 0 ? 0 : 1;
        if ((i9 & 2) != 0) {
            i3 = 0;
        }
        if ((i9 & 4) != 0) {
            enumC0955c = U7.EnumC0955c.f10175h;
        }
        if (i10 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i10, "replay cannot be negative, but was ").toString());
        }
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i10 <= 0 && i3 <= 0 && enumC0955c != U7.EnumC0955c.f10175h) {
            throw new java.lang.IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC0955c).toString());
        }
        int i11 = i3 + i10;
        if (i11 < 0) {
            i11 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        }
        return new V7.a0(i10, i11, enumC0955c);
    }

    public static final V7.n0 b(java.lang.Object obj) {
        if (obj == null) {
            obj = W7.AbstractC1009c.f10731b;
        }
        return new V7.n0(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object c(V7.p0 p0Var, p194x6.n nVar, java.lang.Throwable th, p117n6.c cVar) {
        V7.C0992s c0992s;
        if (cVar instanceof V7.C0992s) {
            c0992s = (V7.C0992s) cVar;
            int i3 = c0992s.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0992s.j = i3 - Integer.MIN_VALUE;
            } else {
                c0992s = new V7.C0992s(cVar);
            }
        } else {
            c0992s = new V7.C0992s(cVar);
        }
        java.lang.Object obj = c0992s.f10512i;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = c0992s.j;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                c0992s.f10511h = th;
                c0992s.j = 1;
                if (nVar.invoke(p0Var, th, c0992s) == obj2) {
                    return obj2;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = c0992s.f10511h;
                com.google.common.util.concurrent.P.u0(obj);
            }
            return p070h6.A.f22523a;
        } catch (java.lang.Throwable th2) {
            if (th != null && th != th2) {
                com.google.common.util.concurrent.AbstractC1903s.j(th2, th);
            }
            throw th2;
        }
    }

    public static final void d(java.lang.Object[] objArr, long j, java.lang.Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static V7.InterfaceC0981g e(V7.InterfaceC0981g interfaceC0981g, int i3) {
        U7.EnumC0955c enumC0955c = U7.EnumC0955c.f10175h;
        if (i3 < 0 && i3 != -2 && i3 != -1) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i3 == -1) {
            enumC0955c = U7.EnumC0955c.f10176i;
            i3 = 0;
        }
        int i9 = i3;
        U7.EnumC0955c enumC0955c2 = enumC0955c;
        return interfaceC0981g instanceof W7.v ? W7.AbstractC1009c.b((W7.v) interfaceC0981g, null, i9, enumC0955c2, 1) : new W7.j(interfaceC0981g, null, i9, enumC0955c2, 2);
    }

    public static final V7.C0977c f(p194x6.m mVar) {
        return new V7.C0977c(mVar, p100l6.i.f24820h, -2, U7.EnumC0955c.f10175h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.io.Serializable g(O1.C0754s c0754s, V7.InterfaceC0982h interfaceC0982h, p117n6.c cVar) throws java.lang.Throwable {
        V7.C0997x c0997x;
        kotlin.jvm.internal.A a2;
        S7.InterfaceC0891h0 interfaceC0891h0;
        java.util.concurrent.CancellationException cancellationExceptionT;
        if (cVar instanceof V7.C0997x) {
            c0997x = (V7.C0997x) cVar;
            int i3 = c0997x.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0997x.j = i3 - Integer.MIN_VALUE;
            } else {
                c0997x = new V7.C0997x(cVar);
            }
        } else {
            c0997x = new V7.C0997x(cVar);
        }
        java.lang.Object obj = c0997x.f10529i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0997x.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
            try {
                V7.InterfaceC0982h o8 = new U.O(interfaceC0982h, a9, 4);
                c0997x.f10528h = a9;
                c0997x.j = 1;
                if (c0754s.collect(o8, c0997x) == aVar) {
                    return aVar;
                }
                return null;
            } catch (java.lang.Throwable th) {
                th = th;
                a2 = a9;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = c0997x.f10528h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                return null;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        java.lang.Throwable th3 = (java.lang.Throwable) a2.f24539h;
        if ((th3 != null && th3.equals(th)) || ((interfaceC0891h0 = (S7.InterfaceC0891h0) c0997x.getContext().get(S7.C0889g0.f9584h)) != null && interfaceC0891h0.isCancelled() && (cancellationExceptionT = interfaceC0891h0.t()) != null && cancellationExceptionT.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof java.util.concurrent.CancellationException) {
            com.google.common.util.concurrent.AbstractC1903s.j(th3, th);
            throw th3;
        }
        com.google.common.util.concurrent.AbstractC1903s.j(th, th3);
        throw th;
    }

    public static final java.lang.Object h(V7.InterfaceC0981g interfaceC0981g, p194x6.m mVar, p100l6.c cVar) {
        int i3 = V7.D.f10376a;
        java.lang.Object objCollect = e(new W7.n(new H5.z0(mVar, null), interfaceC0981g, p100l6.i.f24820h, -2, U7.EnumC0955c.f10175h), 0).collect(W7.x.f10778h, cVar);
        p109m6.a aVar = p109m6.a.f25430h;
        p070h6.A a2 = p070h6.A.f22523a;
        if (objCollect != aVar) {
            objCollect = a2;
        }
        return objCollect == aVar ? objCollect : a2;
    }

    public static final V7.Q i(V7.InterfaceC0981g interfaceC0981g, V7.InterfaceC0981g interfaceC0981g2, V7.InterfaceC0981g interfaceC0981g3, V7.InterfaceC0981g interfaceC0981g4, p194x6.p pVar) {
        return new V7.Q(new V7.InterfaceC0981g[]{interfaceC0981g, interfaceC0981g2, interfaceC0981g3, interfaceC0981g4}, pVar);
    }

    public static final V7.Q j(V7.InterfaceC0981g interfaceC0981g, V7.InterfaceC0981g interfaceC0981g2, V7.InterfaceC0981g interfaceC0981g3, p194x6.o oVar) {
        return new V7.Q(new V7.InterfaceC0981g[]{interfaceC0981g, interfaceC0981g2, interfaceC0981g3}, oVar);
    }

    public static final V7.InterfaceC0981g k(V7.InterfaceC0981g interfaceC0981g, long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Debounce timeout should not be negative");
        }
        if (j == 0) {
            return interfaceC0981g;
        }
        return new O1.C0754s(3, new V7.C0991q(new J.C0537c(j, 2), interfaceC0981g, null));
    }

    public static final V7.InterfaceC0981g l(V7.InterfaceC0981g interfaceC0981g) {
        if (interfaceC0981g instanceof V7.l0) {
            return interfaceC0981g;
        }
        B.C0063a c0063a = f10507a;
        if (interfaceC0981g instanceof V7.C0980f) {
            V7.C0980f c0980f = (V7.C0980f) interfaceC0981g;
            c0980f.getClass();
            if (c0980f.f10458i == c0063a) {
                return (V7.C0980f) interfaceC0981g;
            }
        }
        return new V7.C0980f(interfaceC0981g, c0063a);
    }

    public static final java.lang.Object m(V7.InterfaceC0982h interfaceC0982h, V7.InterfaceC0981g interfaceC0981g, p117n6.i iVar) throws java.lang.Throwable {
        if (interfaceC0982h instanceof V7.p0) {
            throw ((V7.p0) interfaceC0982h).f10500h;
        }
        java.lang.Object objCollect = interfaceC0981g.collect(interfaceC0982h, iVar);
        return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:25:0x0055, B:29:0x006a, B:31:0x0072, B:20:0x0046, B:24:0x0051), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0084 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object n(V7.InterfaceC0982h interfaceC0982h, U7.C c9, boolean z6, p100l6.c cVar) throws java.lang.Throwable {
        V7.C0985k c0985k;
        U7.C0957e it;
        U7.C0957e c0957e;
        V7.InterfaceC0982h interfaceC0982h2;
        java.lang.Object objB;
        if (cVar instanceof V7.C0985k) {
            c0985k = (V7.C0985k) cVar;
            int i3 = c0985k.f10476m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0985k.f10476m = i3 - Integer.MIN_VALUE;
            } else {
                c0985k = new V7.C0985k(cVar);
            }
        } else {
            c0985k = new V7.C0985k(cVar);
        }
        java.lang.Object obj = c0985k.f10475l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0985k.f10476m;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                if (interfaceC0982h instanceof V7.p0) {
                    throw ((V7.p0) interfaceC0982h).f10500h;
                }
                it = c9.iterator();
                c0985k.f10472h = interfaceC0982h;
                c0985k.f10473i = c9;
                c0985k.j = it;
                c0985k.f10474k = z6;
                c0985k.f10476m = 1;
                objB = it.b(c0985k);
                if (objB == aVar) {
                    interfaceC0982h2 = interfaceC0982h;
                    c0957e = it;
                    obj = objB;
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        if (z6) {
                            c9.e(null);
                        }
                        return p070h6.A.f22523a;
                    }
                    java.lang.Object objC = c0957e.c();
                    c0985k.f10472h = interfaceC0982h2;
                    c0985k.f10473i = c9;
                    c0985k.j = c0957e;
                    c0985k.f10474k = z6;
                    c0985k.f10476m = 2;
                }
                return aVar;
            }
            if (i9 == 1) {
                z6 = c0985k.f10474k;
                c0957e = c0985k.j;
                c9 = c0985k.f10473i;
                interfaceC0982h2 = c0985k.f10472h;
                com.google.common.util.concurrent.P.u0(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    if (z6) {
                        c9.e(null);
                    }
                    return p070h6.A.f22523a;
                }
                java.lang.Object objC2 = c0957e.c();
                c0985k.f10472h = interfaceC0982h2;
                c0985k.f10473i = c9;
                c0985k.j = c0957e;
                c0985k.f10474k = z6;
                c0985k.f10476m = 2;
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z6 = c0985k.f10474k;
                c0957e = c0985k.j;
                c9 = c0985k.f10473i;
                interfaceC0982h2 = c0985k.f10472h;
                com.google.common.util.concurrent.P.u0(obj);
            }
            it = c0957e;
            interfaceC0982h = interfaceC0982h2;
            c0985k.f10472h = interfaceC0982h;
            c0985k.f10473i = c9;
            c0985k.j = it;
            c0985k.f10474k = z6;
            c0985k.f10476m = 1;
            objB = it.b(c0985k);
            if (objB == aVar) {
                interfaceC0982h2 = interfaceC0982h;
                c0957e = it;
                obj = objB;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    if (z6) {
                        c9.e(null);
                    }
                    return p070h6.A.f22523a;
                }
                java.lang.Object objC3 = c0957e.c();
                c0985k.f10472h = interfaceC0982h2;
                c0985k.f10473i = c9;
                c0985k.j = c0957e;
                c0985k.f10474k = z6;
                c0985k.f10476m = 2;
            }
            return aVar;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (z6) {
                    O2.g.E(c9, th);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object o(V7.InterfaceC0981g interfaceC0981g, p117n6.c cVar) {
        V7.G g;
        kotlin.jvm.internal.A a2;
        W7.C1007a e6;
        E5.C0298k0 c0298k0;
        if (cVar instanceof V7.G) {
            g = (V7.G) cVar;
            int i3 = g.f10385k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g.f10385k = i3 - Integer.MIN_VALUE;
            } else {
                g = new V7.G(cVar);
            }
        } else {
            g = new V7.G(cVar);
        }
        java.lang.Object obj = g.j;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = g.f10385k;
        N6.A a9 = W7.AbstractC1009c.f10731b;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
            a10.f24539h = a9;
            E5.C0298k0 c0298k1 = new E5.C0298k0(11, a10);
            try {
                g.f10383h = a10;
                g.f10384i = c0298k1;
                g.f10385k = 1;
                if (interfaceC0981g.collect(c0298k1, g) == obj2) {
                    return obj2;
                }
                a2 = a10;
            } catch (W7.C1007a e9) {
                a2 = a10;
                e6 = e9;
                c0298k0 = c0298k1;
                if (e6.f10726h == c0298k0) {
                    throw e6;
                }
                S7.C.p(g.getContext());
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0298k0 = g.f10384i;
            a2 = g.f10383h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (W7.C1007a e10) {
                e6 = e10;
                if (e6.f10726h == c0298k0) {
                    throw e6;
                }
                S7.C.p(g.getContext());
            }
        }
        java.lang.Object obj3 = a2.f24539h;
        if (obj3 != a9) {
            return obj3;
        }
        throw new java.util.NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object p(V7.InterfaceC0981g interfaceC0981g, p194x6.m mVar, p100l6.c cVar) {
        V7.H h9;
        kotlin.jvm.internal.A a2;
        W7.C1007a e6;
        V7.F f9;
        if (cVar instanceof V7.H) {
            h9 = (V7.H) cVar;
            int i3 = h9.f10388k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h9.f10388k = i3 - Integer.MIN_VALUE;
            } else {
                h9 = new V7.H(cVar);
            }
        } else {
            h9 = new V7.H(cVar);
        }
        java.lang.Object obj = h9.j;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = h9.f10388k;
        N6.A a9 = W7.AbstractC1009c.f10731b;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
            a10.f24539h = a9;
            V7.F f10 = new V7.F(mVar, a10, 0);
            try {
                h9.f10386h = a10;
                h9.f10387i = f10;
                h9.f10388k = 1;
                if (interfaceC0981g.collect(f10, h9) == obj2) {
                    return obj2;
                }
                a2 = a10;
            } catch (W7.C1007a e9) {
                a2 = a10;
                e6 = e9;
                f9 = f10;
                if (e6.f10726h == f9) {
                    throw e6;
                }
                S7.C.p(h9.getContext());
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f9 = h9.f10387i;
            a2 = h9.f10386h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (W7.C1007a e10) {
                e6 = e10;
                if (e6.f10726h == f9) {
                    throw e6;
                }
                S7.C.p(h9.getContext());
            }
        }
        java.lang.Object obj3 = a2.f24539h;
        if (obj3 != a9) {
            return obj3;
        }
        throw new java.util.NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object q(V7.InterfaceC0981g interfaceC0981g, p194x6.m mVar, p117n6.c cVar) {
        V7.J j;
        kotlin.jvm.internal.A a2;
        W7.C1007a e6;
        V7.F f9;
        if (cVar instanceof V7.J) {
            j = (V7.J) cVar;
            int i3 = j.f10395k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j.f10395k = i3 - Integer.MIN_VALUE;
            } else {
                j = new V7.J(cVar);
            }
        } else {
            j = new V7.J(cVar);
        }
        java.lang.Object obj = j.j;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = j.f10395k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
            V7.F f10 = new V7.F(mVar, a9, 1);
            try {
                j.f10393h = a9;
                j.f10394i = f10;
                j.f10395k = 1;
                if (interfaceC0981g.collect(f10, j) == obj2) {
                    return obj2;
                }
                a2 = a9;
            } catch (W7.C1007a e9) {
                a2 = a9;
                e6 = e9;
                f9 = f10;
                if (e6.f10726h == f9) {
                    throw e6;
                }
                S7.C.p(j.getContext());
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f9 = j.f10394i;
            a2 = j.f10393h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (W7.C1007a e10) {
                e6 = e10;
                if (e6.f10726h == f9) {
                    throw e6;
                }
                S7.C.p(j.getContext());
            }
        }
        return a2.f24539h;
    }

    public static final V7.InterfaceC0981g r(V7.X x9, p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        return ((i3 == 0 || i3 == -3) && enumC0955c == U7.EnumC0955c.f10175h) ? x9 : new W7.j(x9, hVar, i3, enumC0955c);
    }

    public static final void s(V7.InterfaceC0981g interfaceC0981g, S7.A a2) {
        S7.C.A(a2, null, new V7.C0986l(interfaceC0981g, null), 3);
    }

    public static final V7.C0978d t(U7.C c9) {
        return new V7.C0978d(c9, false);
    }

    public static final V7.W u(V7.InterfaceC0981g interfaceC0981g, S7.A a2, V7.e0 e0Var, java.lang.Object obj) {
        S2.a aVar;
        W7.g gVar;
        V7.InterfaceC0981g interfaceC0981gE;
        int i3 = 5;
        U7.n.f10215d.getClass();
        U7.m mVar = U7.m.f10213a;
        if (!(interfaceC0981g instanceof W7.g) || (interfaceC0981gE = (gVar = (W7.g) interfaceC0981g).e()) == null) {
            U7.EnumC0955c enumC0955c = U7.EnumC0955c.f10175h;
            aVar = new S2.a(interfaceC0981g, p100l6.i.f24820h, i3);
        } else {
            int i9 = gVar.f10740i;
            if (i9 == -3 || i9 == -2 || i9 == 0) {
                U7.EnumC0955c enumC0955c2 = U7.EnumC0955c.f10175h;
            }
            aVar = new S2.a(interfaceC0981gE, gVar.f10739h, i3);
        }
        V7.n0 n0VarB = b(obj);
        S7.C.z(a2, (p100l6.h) aVar.j, e0Var.equals(V7.d0.f10453a) ? S7.B.f9521h : S7.B.f9523k, new V7.M(e0Var, (V7.InterfaceC0981g) aVar.f9211i, n0VarB, obj, null));
        return new V7.W(n0VarB);
    }
}
