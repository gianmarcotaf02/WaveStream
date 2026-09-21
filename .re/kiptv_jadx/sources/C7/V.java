package C7;

/* JADX INFO: loaded from: classes4.dex */
public final class V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C7.V f1566b = new C7.V(C7.T.f1565a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C7.T f1567a;

    public V(C7.T t9) {
        this.f1567a = t9;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i3) {
        java.lang.String str;
        int i9;
        if (i3 != 1 && i3 != 2 && i3 != 8 && i3 != 34 && i3 != 37) {
            switch (i3) {
                default:
                    switch (i3) {
                        default:
                            switch (i3) {
                                default:
                                    switch (i3) {
                                        case 40:
                                        case 41:
                                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i3 != 1 && i3 != 2 && i3 != 8 && i3 != 34 && i3 != 37) {
            switch (i3) {
                case 11:
                case 12:
                case 13:
                    i9 = 2;
                    break;
                default:
                    switch (i3) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i9 = 2;
                            break;
                        default:
                            switch (i3) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i9 = 2;
                                    break;
                                default:
                                    switch (i3) {
                                        case 40:
                                        case 41:
                                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                                            i9 = 2;
                                            break;
                                        default:
                                            i9 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i9 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i9];
        switch (i3) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
                objArr[0] = "typeParameterVariance";
                break;
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                objArr[0] = "projectionKind";
                break;
        }
        if (i3 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i3 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i3 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i3 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i3 != 37) {
            switch (i3) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i3) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i3) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i3) {
                                        case 40:
                                        case 41:
                                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i3) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                objArr[2] = "combine";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 1 && i3 != 2 && i3 != 8 && i3 != 34 && i3 != 37) {
            switch (i3) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i3) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i3) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i3) {
                                        case 40:
                                        case 41:
                                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                                            break;
                                        default:
                                            throw new java.lang.IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static C7.b0 b(C7.b0 b0Var, C7.b0 b0Var2) {
        if (b0Var == null) {
            a(38);
            throw null;
        }
        if (b0Var2 == null) {
            a(39);
            throw null;
        }
        C7.b0 b0Var3 = C7.b0.j;
        if (b0Var == b0Var3) {
            if (b0Var2 != null) {
                return b0Var2;
            }
            a(40);
            throw null;
        }
        if (b0Var2 == b0Var3) {
            if (b0Var != null) {
                return b0Var;
            }
            a(41);
            throw null;
        }
        if (b0Var == b0Var2) {
            if (b0Var2 != null) {
                return b0Var2;
            }
            a(42);
            throw null;
        }
        throw new java.lang.AssertionError("Variance conflict: type parameter variance '" + b0Var + "' and projection kind '" + b0Var2 + "' cannot be combined");
    }

    public static int c(C7.b0 b0Var, C7.b0 b0Var2) {
        C7.b0 b0Var3 = C7.b0.f1576k;
        if (b0Var == b0Var3 && b0Var2 == C7.b0.f1577l) {
            return 3;
        }
        return (b0Var == C7.b0.f1577l && b0Var2 == b0Var3) ? 2 : 1;
    }

    public static C7.V d(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x == null) {
            a(6);
            throw null;
        }
        return new C7.V(C7.N.f1560b.f(abstractC0191x.u0(), abstractC0191x.s0()));
    }

    public static C7.V e(C7.T t9, C7.T t10) {
        if (t9 == null) {
            a(3);
            throw null;
        }
        if (t10 == null) {
            a(4);
            throw null;
        }
        if (t9.e()) {
            t9 = t10;
        } else if (!t10.e()) {
            t9 = new C7.C0184p(t9, t10);
        }
        return new C7.V(t9);
    }

    public static java.lang.String h(java.lang.Object obj) {
        try {
            return obj.toString();
        } catch (java.lang.Throwable th) {
            if (L7.k.h(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final C7.T f() {
        C7.T t9 = this.f1567a;
        if (t9 != null) {
            return t9;
        }
        a(8);
        throw null;
    }

    public final C7.AbstractC0191x g(C7.AbstractC0191x abstractC0191x, C7.b0 b0Var) {
        if (abstractC0191x == null) {
            a(9);
            throw null;
        }
        if (this.f1567a.e()) {
            return abstractC0191x;
        }
        try {
            C7.AbstractC0191x abstractC0191xB = j(new C7.G(abstractC0191x, b0Var), null, 0).b();
            if (abstractC0191xB != null) {
                return abstractC0191xB;
            }
            a(12);
            throw null;
        } catch (C7.U e6) {
            return E7.l.c(E7.k.f3269r, e6.getMessage());
        }
    }

    public final C7.AbstractC0191x i(C7.AbstractC0191x abstractC0191x, C7.b0 b0Var) {
        if (abstractC0191x == null) {
            a(14);
            throw null;
        }
        if (b0Var == null) {
            a(15);
            throw null;
        }
        C7.P g = new C7.G(f().f(abstractC0191x, b0Var), b0Var);
        C7.T t9 = this.f1567a;
        if (!t9.e()) {
            try {
                g = j(g, null, 0);
            } catch (C7.U unused) {
                g = null;
            }
        }
        if (t9.a() || t9.b()) {
            boolean zB = t9.b();
            if (g == null) {
                g = null;
            } else if (!g.c()) {
                C7.AbstractC0191x abstractC0191xB = g.b();
                kotlin.jvm.internal.m.d(abstractC0191xB, "getType(...)");
                if (C7.Y.c(abstractC0191xB, H7.b.f4520h, null)) {
                    C7.b0 b0VarA = g.a();
                    kotlin.jvm.internal.m.d(b0VarA, "getProjectionKind(...)");
                    if (b0VarA == C7.b0.f1577l) {
                        g = new C7.G((C7.AbstractC0191x) O7.r.n(abstractC0191xB).f4519b, b0VarA);
                    } else if (zB) {
                        g = new C7.G((C7.AbstractC0191x) O7.r.n(abstractC0191xB).f4518a, b0VarA);
                    } else {
                        H7.c cVar = new H7.c();
                        C7.V v6 = new C7.V(cVar);
                        if (!cVar.e()) {
                            try {
                                g = v6.j(g, null, 0);
                            } catch (C7.U unused2) {
                                g = null;
                            }
                        }
                    }
                }
            }
        }
        if (g == null) {
            return null;
        }
        return g.b();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:104:0x0212  */
    /* JADX WARN: Code duplicated, block: B:106:0x021a  */
    /* JADX WARN: Code duplicated, block: B:107:0x021d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0220  */
    /* JADX WARN: Code duplicated, block: B:110:0x0223  */
    /* JADX WARN: Code duplicated, block: B:112:0x0226  */
    /* JADX WARN: Code duplicated, block: B:118:0x0243  */
    /* JADX WARN: Code duplicated, block: B:123:0x0266  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:127:0x028d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0291  */
    /* JADX WARN: Code duplicated, block: B:132:0x0297  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x015a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:73:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:79:0x018b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:85:0x019e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01be  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final C7.P j(C7.P p2, N6.U u6, int i3) throws C7.U {
        C7.AbstractC0191x abstractC0191xB;
        C7.b0 b0VarA;
        C7.a0 a0VarX0;
        C7.C0169a c0169a;
        C7.B b9;
        java.util.List parameters;
        java.util.List newArguments;
        java.util.ArrayList arrayList;
        boolean z6;
        C7.AbstractC0191x abstractC0191xP;
        N6.U u7;
        C7.P p9;
        C7.P pJ;
        int iC;
        char c9;
        C7.b0 b0VarE;
        C7.b0 b0Var;
        C7.V v6;
        int iC2;
        F7.d dVarX0;
        C7.InterfaceC0179k interfaceC0179k;
        C7.AbstractC0191x abstractC0191xH;
        O6.h hVarC;
        int iC3;
        int i9 = 1;
        C7.AbstractC0191x abstractC0191xI = null;
        if (p2 == null) {
            a(18);
            throw null;
        }
        C7.T t9 = this.f1567a;
        if (i3 > 100) {
            throw new java.lang.IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + h(p2) + "; substitution: " + h(t9));
        }
        if (!p2.c()) {
            C7.AbstractC0191x abstractC0191xB2 = p2.b();
            if (abstractC0191xB2 instanceof C7.Z) {
                C7.Z z9 = (C7.Z) abstractC0191xB2;
                C7.a0 a0VarN0 = z9.n0();
                C7.AbstractC0191x abstractC0191xZ = z9.z();
                C7.P pJ2 = j(new C7.G(a0VarN0, p2.a()), u6, i3 + 1);
                return pJ2.c() ? pJ2 : new C7.G(C7.AbstractC0171c.F(pJ2.b().x0(), i(abstractC0191xZ, p2.a())), pJ2.a());
            }
            kotlin.jvm.internal.m.e(abstractC0191xB2, "<this>");
            abstractC0191xB2.x0();
            if (!(abstractC0191xB2.x0() instanceof p017b7.g)) {
                C7.P pD = t9.d(abstractC0191xB2);
                if (pD == null) {
                    pD = null;
                } else if (abstractC0191xB2.getAnnotations().h(K6.o.y)) {
                    C7.M mU0 = pD.b().u0();
                    if (mU0 instanceof D7.i) {
                        C7.P p10 = ((D7.i) mU0).f2481a;
                        C7.b0 b0VarA2 = p10.a();
                        if (c(p2.a(), b0VarA2) == 3) {
                            pD = new C7.G(p10.b());
                        } else if (u6 != null && c(u6.E(), b0VarA2) == 3) {
                            pD = new C7.G(p10.b());
                        }
                    }
                }
                C7.b0 b0VarA3 = p2.a();
                if (pD == null && C7.AbstractC0171c.k(abstractC0191xB2)) {
                    F7.d dVarX1 = abstractC0191xB2.x0();
                    C7.InterfaceC0179k interfaceC0179k2 = dVarX1 instanceof C7.InterfaceC0179k ? (C7.InterfaceC0179k) dVarX1 : null;
                    if (!(interfaceC0179k2 != null ? interfaceC0179k2.i0() : false)) {
                        C7.AbstractC0185q abstractC0185q = (C7.AbstractC0185q) abstractC0191xB2.x0();
                        C7.B b10 = abstractC0185q.f1599i;
                        int i10 = i3 + 1;
                        C7.P pJ3 = j(new C7.G(b10, b0VarA3), u6, i10);
                        C7.B b11 = abstractC0185q.j;
                        C7.P pJ4 = j(new C7.G(b11, b0VarA3), u6, i10);
                        C7.b0 b0VarA4 = pJ3.a();
                        if (pJ3.b() != b10 || pJ4.b() != b11) {
                            return new C7.G(C7.AbstractC0171c.e(C7.AbstractC0171c.b(pJ3.b()), C7.AbstractC0171c.b(pJ4.b())), b0VarA4);
                        }
                    } else if (!K6.i.E(abstractC0191xB2)) {
                        if (pD != null) {
                            iC2 = c(b0VarA3, pD.a());
                            if (!(abstractC0191xB2.u0() instanceof p134p7.b)) {
                                iC3 = Z.AbstractC1149h0.c(iC2);
                                if (iC3 != 1) {
                                    return new C7.G(abstractC0191xB2.u0().g().o(), C7.b0.f1577l);
                                }
                                if (iC3 == 2) {
                                    throw new C7.U("Out-projection in in-position");
                                }
                            }
                            dVarX0 = abstractC0191xB2.x0();
                            if (dVarX0 instanceof C7.InterfaceC0179k) {
                                interfaceC0179k = (C7.InterfaceC0179k) dVarX0;
                            } else {
                                interfaceC0179k = null;
                            }
                            if (interfaceC0179k != null) {
                                interfaceC0179k = null;
                            } else {
                                interfaceC0179k = null;
                            }
                            if (pD.c()) {
                                return pD;
                            }
                            if (interfaceC0179k != null) {
                                abstractC0191xH = interfaceC0179k.p0(pD.b());
                            } else {
                                abstractC0191xH = C7.Y.h(pD.b(), abstractC0191xB2.v0());
                            }
                            if (!abstractC0191xB2.getAnnotations().isEmpty()) {
                                hVarC = t9.c(abstractC0191xB2.getAnnotations());
                                if (hVarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (hVarC.h(K6.o.y)) {
                                    hVarC = new O6.l(hVarC, new C7.C0189v(i9));
                                }
                                abstractC0191xH = E6.G.L(abstractC0191xH, new O6.i(new O6.h[]{abstractC0191xH.getAnnotations(), hVarC}));
                            }
                            if (iC2 == 1) {
                                b0VarA3 = b(b0VarA3, pD.a());
                            }
                            return new C7.G(abstractC0191xH, b0VarA3);
                        }
                        abstractC0191xB = p2.b();
                        b0VarA = p2.a();
                        if (!(abstractC0191xB.u0().h() instanceof N6.U)) {
                            a0VarX0 = abstractC0191xB.x0();
                            if (a0VarX0 instanceof C7.C0169a) {
                                c0169a = (C7.C0169a) a0VarX0;
                            } else {
                                c0169a = null;
                            }
                            if (c0169a != null) {
                                b9 = c0169a.j;
                            } else {
                                b9 = null;
                            }
                            if (b9 != null) {
                                if (t9 instanceof C7.C0187t) {
                                    v6 = this;
                                } else {
                                    v6 = this;
                                }
                                abstractC0191xI = v6.i(b9, C7.b0.j);
                            }
                            parameters = abstractC0191xB.u0().getParameters();
                            newArguments = abstractC0191xB.s0();
                            arrayList = new java.util.ArrayList(parameters.size());
                            z6 = false;
                            for (int i11 = 0; i11 < parameters.size(); i11++) {
                                u7 = (N6.U) parameters.get(i11);
                                p9 = (C7.P) newArguments.get(i11);
                                pJ = j(p9, u7, i3 + 1);
                                iC = Z.AbstractC1149h0.c(c(u7.E(), pJ.a()));
                                if (iC != 0) {
                                    if (iC != 1) {
                                        c9 = 2;
                                        if (iC == 2) {
                                        }
                                    } else {
                                        c9 = 2;
                                    }
                                    pJ = C7.Y.j(u7);
                                } else {
                                    c9 = 2;
                                    b0VarE = u7.E();
                                    b0Var = C7.b0.j;
                                    if (b0VarE != b0Var) {
                                        pJ = new C7.G(pJ.b(), b0Var);
                                    }
                                }
                                if (pJ != p9) {
                                    z6 = true;
                                }
                                arrayList.add(pJ);
                            }
                            if (z6) {
                                newArguments = arrayList;
                            }
                            O6.h newAnnotations = t9.c(abstractC0191xB.getAnnotations());
                            kotlin.jvm.internal.m.e(newArguments, "newArguments");
                            kotlin.jvm.internal.m.e(newAnnotations, "newAnnotations");
                            abstractC0191xP = C7.AbstractC0171c.p(abstractC0191xB, newArguments, newAnnotations, 4);
                            if (abstractC0191xP instanceof C7.B) {
                                abstractC0191xP = C7.AbstractC0171c.E((C7.B) abstractC0191xP, (C7.B) abstractC0191xI);
                            }
                            return new C7.G(abstractC0191xP, b0VarA);
                        }
                    }
                } else if (!K6.i.E(abstractC0191xB2) && !C7.AbstractC0171c.j(abstractC0191xB2)) {
                    if (pD != null) {
                        iC2 = c(b0VarA3, pD.a());
                        if (!(abstractC0191xB2.u0() instanceof p134p7.b)) {
                            iC3 = Z.AbstractC1149h0.c(iC2);
                            if (iC3 != 1) {
                                return new C7.G(abstractC0191xB2.u0().g().o(), C7.b0.f1577l);
                            }
                            if (iC3 == 2) {
                                throw new C7.U("Out-projection in in-position");
                            }
                        }
                        dVarX0 = abstractC0191xB2.x0();
                        if (dVarX0 instanceof C7.InterfaceC0179k) {
                            interfaceC0179k = (C7.InterfaceC0179k) dVarX0;
                        } else {
                            interfaceC0179k = null;
                        }
                        if (interfaceC0179k != null || !interfaceC0179k.i0()) {
                            interfaceC0179k = null;
                        }
                        if (pD.c()) {
                            return pD;
                        }
                        if (interfaceC0179k != null) {
                            abstractC0191xH = interfaceC0179k.p0(pD.b());
                        } else {
                            abstractC0191xH = C7.Y.h(pD.b(), abstractC0191xB2.v0());
                        }
                        if (!abstractC0191xB2.getAnnotations().isEmpty()) {
                            hVarC = t9.c(abstractC0191xB2.getAnnotations());
                            if (hVarC != null) {
                                a(33);
                                throw null;
                            }
                            if (hVarC.h(K6.o.y)) {
                                hVarC = new O6.l(hVarC, new C7.C0189v(i9));
                            }
                            abstractC0191xH = E6.G.L(abstractC0191xH, new O6.i(new O6.h[]{abstractC0191xH.getAnnotations(), hVarC}));
                        }
                        if (iC2 == 1) {
                            b0VarA3 = b(b0VarA3, pD.a());
                        }
                        return new C7.G(abstractC0191xH, b0VarA3);
                    }
                    abstractC0191xB = p2.b();
                    b0VarA = p2.a();
                    if (!(abstractC0191xB.u0().h() instanceof N6.U)) {
                        a0VarX0 = abstractC0191xB.x0();
                        if (a0VarX0 instanceof C7.C0169a) {
                            c0169a = (C7.C0169a) a0VarX0;
                        } else {
                            c0169a = null;
                        }
                        if (c0169a != null) {
                            b9 = c0169a.j;
                        } else {
                            b9 = null;
                        }
                        if (b9 != null) {
                            if ((t9 instanceof C7.C0187t) || !t9.b()) {
                                v6 = this;
                            } else {
                                C7.C0187t c0187t = (C7.C0187t) t9;
                                v6 = new C7.V(new C7.C0187t(c0187t.f1602b, c0187t.f1603c, false));
                            }
                            abstractC0191xI = v6.i(b9, C7.b0.j);
                        }
                        parameters = abstractC0191xB.u0().getParameters();
                        newArguments = abstractC0191xB.s0();
                        arrayList = new java.util.ArrayList(parameters.size());
                        z6 = false;
                        while (i11 < parameters.size()) {
                            u7 = (N6.U) parameters.get(i11);
                            p9 = (C7.P) newArguments.get(i11);
                            pJ = j(p9, u7, i3 + 1);
                            iC = Z.AbstractC1149h0.c(c(u7.E(), pJ.a()));
                            if (iC != 0) {
                                if (iC != 1) {
                                    c9 = 2;
                                    if (iC == 2) {
                                    }
                                } else {
                                    c9 = 2;
                                }
                                pJ = C7.Y.j(u7);
                            } else {
                                c9 = 2;
                                b0VarE = u7.E();
                                b0Var = C7.b0.j;
                                if (b0VarE != b0Var && !pJ.c()) {
                                    pJ = new C7.G(pJ.b(), b0Var);
                                }
                            }
                            if (pJ != p9) {
                                z6 = true;
                            }
                            arrayList.add(pJ);
                        }
                        if (z6) {
                            newArguments = arrayList;
                        }
                        O6.h newAnnotations2 = t9.c(abstractC0191xB.getAnnotations());
                        kotlin.jvm.internal.m.e(newArguments, "newArguments");
                        kotlin.jvm.internal.m.e(newAnnotations2, "newAnnotations");
                        abstractC0191xP = C7.AbstractC0171c.p(abstractC0191xB, newArguments, newAnnotations2, 4);
                        if ((abstractC0191xP instanceof C7.B) && (abstractC0191xI instanceof C7.B)) {
                            abstractC0191xP = C7.AbstractC0171c.E((C7.B) abstractC0191xP, (C7.B) abstractC0191xI);
                        }
                        return new C7.G(abstractC0191xP, b0VarA);
                    }
                }
            }
        }
        return p2;
    }
}
