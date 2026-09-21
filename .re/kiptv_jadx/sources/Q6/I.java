package Q6;

/* JADX INFO: loaded from: classes4.dex */
public class I extends Q6.T implements N6.N {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Q6.u f8572A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Q6.u f8573B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public java.util.ArrayList f8574C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Q6.J f8575D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Q6.K f8576E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Q6.r f8577F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Q6.r f8578G;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f8579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B7.h f8580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public kotlin.jvm.functions.Function0 f8581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final N6.EnumC0711z f8582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public N6.C0701o f8583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.util.Collection f8584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final N6.N f8585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8586t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8587u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f8588v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f8589w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f8590x;
    public final boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.util.List f8591z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(N6.InterfaceC0697k interfaceC0697k, N6.N n3, O6.h hVar, N6.EnumC0711z enumC0711z, N6.C0701o c0701o, boolean z6, p101l7.e eVar, int i3, N6.P p2, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(interfaceC0697k, hVar, eVar, null, p2);
        if (interfaceC0697k == null) {
            i0(0);
            throw null;
        }
        if (hVar == null) {
            i0(1);
            throw null;
        }
        if (enumC0711z == null) {
            i0(2);
            throw null;
        }
        if (c0701o == null) {
            i0(3);
            throw null;
        }
        if (eVar == null) {
            i0(4);
            throw null;
        }
        if (i3 == 0) {
            i0(5);
            throw null;
        }
        if (p2 == null) {
            i0(6);
            throw null;
        }
        this.f8579m = z6;
        this.f8584r = null;
        this.f8591z = java.util.Collections.EMPTY_LIST;
        this.f8582p = enumC0711z;
        this.f8583q = c0701o;
        this.f8585s = n3 == null ? this : n3;
        this.f8586t = i3;
        this.f8587u = z9;
        this.f8588v = z10;
        this.f8589w = z11;
        this.f8590x = z12;
        this.y = z13;
    }

    public static Q6.I H0(N6.InterfaceC0691e interfaceC0691e, N6.EnumC0711z enumC0711z, N6.C0701o c0701o, boolean z6, p101l7.e eVar, int i3, N6.P p2) {
        O6.f fVar = O6.g.f7987a;
        if (interfaceC0691e == null) {
            i0(7);
            throw null;
        }
        if (c0701o == null) {
            i0(10);
            throw null;
        }
        if (eVar == null) {
            i0(11);
            throw null;
        }
        if (i3 == 0) {
            i0(12);
            throw null;
        }
        if (p2 != null) {
            return new Q6.I(interfaceC0691e, null, fVar, enumC0711z, c0701o, z6, eVar, i3, p2, false, false, false, false, false);
        }
        i0(13);
        throw null;
    }

    public static N6.InterfaceC0706u J0(C7.V v6, N6.M m8) {
        if (m8 == null) {
            i0(31);
            throw null;
        }
        N6.InterfaceC0706u interfaceC0706u = ((Q6.G) m8).f8562s;
        if (interfaceC0706u != null) {
            return interfaceC0706u.b(v6);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void i0(int i3) {
        java.lang.String str;
        int i9;
        if (i3 != 28 && i3 != 38 && i3 != 39 && i3 != 41 && i3 != 42) {
            switch (i3) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i3 != 28 && i3 != 38 && i3 != 39 && i3 != 41 && i3 != 42) {
            switch (i3) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
            case 41:
            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i3 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i3 == 38) {
            objArr[1] = "getOriginal";
        } else if (i3 == 39) {
            objArr[1] = "getKind";
        } else if (i3 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i3 != 42) {
            switch (i3) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i3) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case androidx.media3.extractor.flac.FlacConstants.STREAM_INFO_BLOCK_SIZE /* 38 */:
            case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_PREFIX_SEI /* 39 */:
            case 41:
            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_H265 /* 36 */:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 28 && i3 != 38 && i3 != 39 && i3 != 41 && i3 != 42) {
            switch (i3) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.n(this, obj);
    }

    @Override // N6.InterfaceC0710y
    public final boolean C() {
        return this.f8589w;
    }

    @Override // N6.N
    public final boolean F() {
        return this.y;
    }

    @Override // N6.InterfaceC0689c
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final Q6.I K(N6.InterfaceC0691e interfaceC0691e, N6.EnumC0711z enumC0711z, N6.C0701o c0701o) {
        Q6.H h9 = new Q6.H(this);
        if (interfaceC0691e == null) {
            Q6.H.a(0);
            throw null;
        }
        h9.f8563a = interfaceC0691e;
        h9.f8566d = null;
        h9.f8564b = enumC0711z;
        if (c0701o == null) {
            Q6.H.a(8);
            throw null;
        }
        h9.f8565c = c0701o;
        h9.f8567e = 2;
        h9.g = false;
        Q6.I iB = h9.b();
        if (iB != null) {
            return iB;
        }
        i0(42);
        throw null;
    }

    public Q6.I I0(N6.InterfaceC0697k interfaceC0697k, N6.EnumC0711z enumC0711z, N6.C0701o c0701o, N6.N n3, int i3, p101l7.e eVar) {
        N6.Q q9 = N6.P.f7377b;
        if (interfaceC0697k == null) {
            i0(32);
            throw null;
        }
        if (enumC0711z == null) {
            i0(33);
            throw null;
        }
        if (c0701o == null) {
            i0(34);
            throw null;
        }
        if (i3 == 0) {
            i0(35);
            throw null;
        }
        if (eVar == null) {
            i0(36);
            throw null;
        }
        O6.h annotations = getAnnotations();
        boolean zIsConst = isConst();
        boolean zIsExternal = isExternal();
        return new Q6.I(interfaceC0697k, n3, annotations, enumC0711z, c0701o, this.f8579m, eVar, i3, q9, this.f8587u, zIsConst, this.f8589w, zIsExternal, this.y);
    }

    public final void K0(Q6.J j, Q6.K k9, Q6.r rVar, Q6.r rVar2) {
        this.f8575D = j;
        this.f8576E = k9;
        this.f8577F = rVar;
        this.f8578G = rVar2;
    }

    public final void L0(B7.h hVar, kotlin.jvm.functions.Function0 function0) {
        if (function0 == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f8581o = function0;
        if (hVar == null) {
            hVar = (B7.h) function0.invoke();
        }
        this.f8580n = hVar;
    }

    @Override // N6.X
    public final p142q7.g M() {
        B7.h hVar = this.f8580n;
        if (hVar != null) {
            return (p142q7.g) hVar.invoke();
        }
        return null;
    }

    public final void N0(C7.AbstractC0191x abstractC0191x, java.util.List list, Q6.u uVar, Q6.u uVar2, java.util.List list2) {
        if (abstractC0191x == null) {
            i0(17);
            throw null;
        }
        if (list == null) {
            i0(18);
            throw null;
        }
        if (list2 == null) {
            i0(19);
            throw null;
        }
        this.f8611l = abstractC0191x;
        this.f8574C = new java.util.ArrayList(list);
        this.f8573B = uVar2;
        this.f8572A = uVar;
        this.f8591z = list2;
    }

    @Override // Q6.T, N6.InterfaceC0688b
    public final Q6.u S() {
        return this.f8572A;
    }

    @Override // N6.X
    public final boolean U() {
        return this.f8579m;
    }

    @Override // Q6.T, N6.InterfaceC0688b
    public final Q6.u V() {
        return this.f8573B;
    }

    @Override // N6.N
    public final Q6.r W() {
        return this.f8578G;
    }

    @Override // N6.N
    public final Q6.r Y() {
        return this.f8577F;
    }

    @Override // N6.InterfaceC0688b
    public final java.util.List Z() {
        java.util.List list = this.f8591z;
        if (list != null) {
            return list;
        }
        i0(22);
        throw null;
    }

    @Override // N6.X
    public final boolean b0() {
        return this.f8587u;
    }

    @Override // N6.InterfaceC0689c
    public final int c() {
        int i3 = this.f8586t;
        if (i3 != 0) {
            return i3;
        }
        i0(39);
        throw null;
    }

    @Override // N6.InterfaceC0710y
    public final N6.EnumC0711z e() {
        N6.EnumC0711z enumC0711z = this.f8582p;
        if (enumC0711z != null) {
            return enumC0711z;
        }
        i0(24);
        throw null;
    }

    @Override // N6.InterfaceC0689c
    public final void f0(java.util.Collection collection) {
        if (collection != null) {
            this.f8584r = collection;
        } else {
            i0(40);
            throw null;
        }
    }

    @Override // N6.N
    public final Q6.J getGetter() {
        return this.f8575D;
    }

    @Override // Q6.T, N6.InterfaceC0688b
    public final C7.AbstractC0191x getReturnType() {
        C7.AbstractC0191x type = getType();
        if (type != null) {
            return type;
        }
        i0(23);
        throw null;
    }

    @Override // N6.N
    public final Q6.K getSetter() {
        return this.f8576E;
    }

    @Override // Q6.T, N6.InterfaceC0688b
    public final java.util.List getTypeParameters() {
        java.util.ArrayList arrayList = this.f8574C;
        if (arrayList != null) {
            return arrayList;
        }
        throw new java.lang.IllegalStateException("typeParameters == null for " + this);
    }

    @Override // N6.InterfaceC0700n
    public final N6.C0701o getVisibility() {
        N6.C0701o c0701o = this.f8583q;
        if (c0701o != null) {
            return c0701o;
        }
        i0(25);
        throw null;
    }

    @Override // N6.InterfaceC0688b
    public final java.util.Collection i() {
        java.util.Collection collection = this.f8584r;
        if (collection == null) {
            collection = java.util.Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        i0(41);
        throw null;
    }

    @Override // N6.X
    public boolean isConst() {
        return this.f8588v;
    }

    public boolean isExternal() {
        return this.f8590x;
    }

    @Override // N6.N
    public final java.util.ArrayList m() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        Q6.J j = this.f8575D;
        if (j != null) {
            arrayList.add(j);
        }
        Q6.K k9 = this.f8576E;
        if (k9 != null) {
            arrayList.add(k9);
        }
        return arrayList;
    }

    @Override // N6.InterfaceC0710y
    public final boolean m0() {
        return false;
    }

    @Override // N6.InterfaceC0688b
    public java.lang.Object r(N6.InterfaceC0687a interfaceC0687a) {
        return null;
    }

    @Override // N6.S
    public final N6.N b(C7.V v6) {
        if (v6 == null) {
            i0(27);
            throw null;
        }
        if (v6.f1567a.e()) {
            return this;
        }
        Q6.H h9 = new Q6.H(this);
        C7.T tF = v6.f();
        if (tF == null) {
            Q6.H.a(15);
            throw null;
        }
        h9.f8568f = tF;
        h9.f8566d = a();
        return h9.b();
    }

    @Override // Q6.AbstractC0805n, Q6.AbstractC0804m, N6.InterfaceC0697k
    public final N6.N a() {
        N6.N n3 = this.f8585s;
        N6.N nA = n3 == this ? this : n3.a();
        if (nA != null) {
            return nA;
        }
        i0(38);
        throw null;
    }

    public void M0(C7.AbstractC0191x abstractC0191x) {
    }
}
