package C7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E7.i f1571a = E7.l.c(E7.k.f3270s, new java.lang.String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E7.i f1572b = E7.l.c(E7.k.f3267p, new java.lang.String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C7.X f1573c = new C7.X("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C7.X f1574d = new C7.X("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i3) {
        java.lang.String str;
        int i9;
        if (i3 != 4 && i3 != 9 && i3 != 11 && i3 != 15 && i3 != 17 && i3 != 19 && i3 != 26 && i3 != 35 && i3 != 48 && i3 != 53 && i3 != 6 && i3 != 7) {
            switch (i3) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i3 != 4 && i3 != 9 && i3 != 11 && i3 != 15 && i3 != 17 && i3 != 19 && i3 != 26 && i3 != 35 && i3 != 48 && i3 != 53 && i3 != 6 && i3 != 7) {
            switch (i3) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i9 = 2;
                    break;
                default:
                    i9 = 3;
                    break;
            }
        } else {
            i9 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i9];
        switch (i3) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                objArr[0] = androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY;
                break;
            case 37:
                objArr[0] = "b";
                break;
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i3 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i3 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i3 == 11 || i3 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i3 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i3 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i3 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i3 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i3 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i3 != 53) {
            if (i3 != 6 && i3 != 7) {
                switch (i3) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_MHAS /* 45 */:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case com.revenuecat.purchases.utils.PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case dev.jdtech.mpv.MPVLib.MPV_LOG_LEVEL_DEBUG /* 60 */:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 4 && i3 != 9 && i3 != 11 && i3 != 15 && i3 != 17 && i3 != 19 && i3 != 26 && i3 != 35 && i3 != 48 && i3 != 53 && i3 != 6 && i3 != 7) {
            switch (i3) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static boolean b(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x == null) {
            a(28);
            throw null;
        }
        if (abstractC0191x.v0()) {
            return true;
        }
        return C7.AbstractC0171c.k(abstractC0191x) && b(((C7.AbstractC0185q) abstractC0191x.x0()).j);
    }

    public static boolean c(C7.AbstractC0191x abstractC0191x, p194x6.j jVar, L7.h hVar) {
        if (abstractC0191x == null) {
            return false;
        }
        C7.a0 a0VarX0 = abstractC0191x.x0();
        if (l(abstractC0191x)) {
            return ((java.lang.Boolean) jVar.invoke(a0VarX0)).booleanValue();
        }
        if (hVar != null && hVar.contains(abstractC0191x)) {
            return false;
        }
        if (((java.lang.Boolean) jVar.invoke(a0VarX0)).booleanValue()) {
            return true;
        }
        if (hVar == null) {
            hVar = new L7.h();
        }
        hVar.add(abstractC0191x);
        C7.AbstractC0185q abstractC0185q = a0VarX0 instanceof C7.AbstractC0185q ? (C7.AbstractC0185q) a0VarX0 : null;
        if (abstractC0185q != null && (c(abstractC0185q.f1599i, jVar, hVar) || c(abstractC0185q.j, jVar, hVar))) {
            return true;
        }
        if ((a0VarX0 instanceof C7.C0181m) && c(((C7.C0181m) a0VarX0).f1595i, jVar, hVar)) {
            return true;
        }
        C7.M mU0 = abstractC0191x.u0();
        if (mU0 instanceof C7.C0190w) {
            java.util.Iterator it = ((C7.C0190w) mU0).f1610b.iterator();
            while (it.hasNext()) {
                if (c((C7.AbstractC0191x) it.next(), jVar, hVar)) {
                    return true;
                }
            }
            return false;
        }
        for (C7.P p2 : abstractC0191x.s0()) {
            if (!p2.c() && c(p2.b(), jVar, hVar)) {
                return true;
            }
        }
        return false;
    }

    public static java.util.List d(java.util.List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C7.G(((N6.U) it.next()).j()));
        }
        return p078i6.o.N1(arrayList);
    }

    public static boolean e(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x == null) {
            a(27);
            throw null;
        }
        if (!abstractC0191x.v0() && (!C7.AbstractC0171c.k(abstractC0191x) || !e(((C7.AbstractC0185q) abstractC0191x.x0()).j))) {
            if (!(abstractC0191x.x0() instanceof C7.C0181m)) {
                if (f(abstractC0191x)) {
                    if (!(abstractC0191x.u0().h() instanceof N6.InterfaceC0691e)) {
                        C7.V vD = C7.V.d(abstractC0191x);
                        java.util.Collection<C7.AbstractC0191x> collectionI = abstractC0191x.u0().i();
                        java.util.ArrayList arrayList = new java.util.ArrayList(collectionI.size());
                        for (C7.AbstractC0191x abstractC0191x2 : collectionI) {
                            if (abstractC0191x2 == null) {
                                a(21);
                                throw null;
                            }
                            C7.AbstractC0191x abstractC0191xI = vD.i(abstractC0191x2, C7.b0.j);
                            C7.AbstractC0191x abstractC0191xH = abstractC0191xI != null ? h(abstractC0191xI, abstractC0191x.v0()) : null;
                            if (abstractC0191xH != null) {
                                arrayList.add(abstractC0191xH);
                            }
                        }
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((C7.AbstractC0191x) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                C7.M mU0 = abstractC0191x.u0();
                if (mU0 instanceof C7.C0190w) {
                    java.util.Iterator it2 = ((C7.C0190w) mU0).f1610b.iterator();
                    while (it2.hasNext()) {
                        if (e((C7.AbstractC0191x) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x == null) {
            a(60);
            throw null;
        }
        if ((abstractC0191x.u0().h() instanceof N6.U ? (N6.U) abstractC0191x.u0().h() : null) != null) {
            return true;
        }
        abstractC0191x.u0();
        return false;
    }

    public static C7.a0 g(C7.AbstractC0191x abstractC0191x, boolean z6) {
        if (abstractC0191x == null) {
            a(3);
            throw null;
        }
        C7.a0 a0VarY0 = abstractC0191x.x0().y0(z6);
        if (a0VarY0 != null) {
            return a0VarY0;
        }
        a(4);
        throw null;
    }

    public static C7.AbstractC0191x h(C7.AbstractC0191x abstractC0191x, boolean z6) {
        if (abstractC0191x != null) {
            return z6 ? g(abstractC0191x, true) : abstractC0191x;
        }
        a(8);
        throw null;
    }

    public static C7.B i(C7.B b9, boolean z6) {
        if (b9 == null) {
            a(5);
            throw null;
        }
        if (!z6) {
            return b9;
        }
        C7.B bY0 = b9.y0(true);
        if (bY0 != null) {
            return bY0;
        }
        a(6);
        throw null;
    }

    public static C7.G j(N6.U u6) {
        if (u6 != null) {
            return new C7.G(u6);
        }
        a(45);
        throw null;
    }

    public static C7.P k(N6.U u6, p017b7.a aVar) {
        if (u6 != null) {
            return aVar.f18010a == C7.W.f1568h ? new C7.G(C7.AbstractC0171c.w(u6)) : new C7.G(u6);
        }
        a(46);
        throw null;
    }

    public static boolean l(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x != null) {
            return abstractC0191x == f1573c || abstractC0191x == f1574d;
        }
        a(0);
        throw null;
    }
}
