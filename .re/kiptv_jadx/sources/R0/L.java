package R0;

/* JADX INFO: loaded from: classes.dex */
public abstract class L implements R0.U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Class[] f8796a = {java.io.Serializable.class, android.os.Parcelable.class, java.lang.String.class, android.util.SparseArray.class, android.os.Binder.class, android.util.Size.class, android.util.SizeF.class};

    public static final boolean a(android.view.View view, android.view.View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(Y0.p pVar) {
        return !pVar.k().f15960h.c(Y0.t.f11126i);
    }

    public static final boolean c(Y0.p pVar, android.content.res.Resources resources) {
        java.lang.Object objG = pVar.f11094d.f15960h.g(Y0.t.f11119a);
        if (objG == null) {
            objG = null;
        }
        java.util.List list = (java.util.List) objG;
        return !Y0.s.e(pVar) && (pVar.f11094d.j || (pVar.o() && ((list != null ? (java.lang.String) p078i6.o.j1(list) : null) != null || j(pVar) != null || i(pVar, resources) != null || h(pVar))));
    }

    public static final void d(E1.f fVar, Y0.p pVar) {
        java.lang.Object objG = pVar.f11094d.f15960h.g(Y0.t.y);
        if (objG == null) {
            objG = null;
        }
        Y0.i iVar = (Y0.i) objG;
        if (b(pVar)) {
            if (iVar != null && iVar.f11038a == 8) {
                return;
            }
            Y0.w wVar = Y0.l.y;
            p136q.H h9 = pVar.f11094d.f15960h;
            java.lang.Object objG2 = h9.g(wVar);
            if (objG2 == null) {
                objG2 = null;
            }
            Y0.a aVar = (Y0.a) objG2;
            if (aVar != null) {
                fVar.b(new E1.d(null, android.R.id.accessibilityActionPageUp, aVar.f11024a, null));
            }
            java.lang.Object objG3 = h9.g(Y0.l.f11061A);
            if (objG3 == null) {
                objG3 = null;
            }
            Y0.a aVar2 = (Y0.a) objG3;
            if (aVar2 != null) {
                fVar.b(new E1.d(null, android.R.id.accessibilityActionPageDown, aVar2.f11024a, null));
            }
            java.lang.Object objG4 = h9.g(Y0.l.f11086z);
            if (objG4 == null) {
                objG4 = null;
            }
            Y0.a aVar3 = (Y0.a) objG4;
            if (aVar3 != null) {
                fVar.b(new E1.d(null, android.R.id.accessibilityActionPageLeft, aVar3.f11024a, null));
            }
            java.lang.Object objG5 = h9.g(Y0.l.f11062B);
            if (objG5 == null) {
                objG5 = null;
            }
            Y0.a aVar4 = (Y0.a) objG5;
            if (aVar4 != null) {
                fVar.b(new E1.d(null, android.R.id.accessibilityActionPageRight, aVar4.f11024a, null));
            }
        }
    }

    public static final void e(E1.f fVar, Y0.p pVar) {
        if (b(pVar)) {
            java.lang.Object objG = pVar.f11094d.f15960h.g(Y0.l.f11071i);
            if (objG == null) {
                objG = null;
            }
            Y0.a aVar = (Y0.a) objG;
            if (aVar != null) {
                fVar.b(new E1.d(null, android.R.id.accessibilityActionSetProgress, aVar.f11024a, null));
            }
        }
    }

    public static final boolean f(java.lang.Object obj) {
        if (obj instanceof p121o0.l) {
            p121o0.l lVar = (p121o0.l) obj;
            if (lVar.b() == p020c0.C1676e.f18240k || lVar.b() == p020c0.C1676e.f18243n || lVar.b() == p020c0.C1676e.f18241l) {
                java.lang.Object value = lVar.getValue();
                if (value == null) {
                    return true;
                }
                return f(value);
            }
        } else {
            if ((obj instanceof p070h6.e) && (obj instanceof java.io.Serializable)) {
                return false;
            }
            java.lang.Class[] clsArr = f8796a;
            for (int i3 = 0; i3 < 7; i3++) {
                if (clsArr[i3].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float g(int i3, float[] fArr, float[] fArr2, int i9) {
        int i10 = i3 * 4;
        return (fArr[i10 + 3] * fArr2[12 + i9]) + (fArr[i10 + 2] * fArr2[8 + i9]) + (fArr[i10 + 1] * fArr2[4 + i9]) + (fArr[i10] * fArr2[i9]);
    }

    public static final boolean h(Y0.p pVar) {
        java.lang.Object objG = pVar.f11094d.f15960h.g(Y0.t.f11112J);
        if (objG == null) {
            objG = null;
        }
        p002a1.a aVar = (p002a1.a) objG;
        Y0.w wVar = Y0.t.y;
        p136q.H h9 = pVar.f11094d.f15960h;
        java.lang.Object objG2 = h9.g(wVar);
        if (objG2 == null) {
            objG2 = null;
        }
        Y0.i iVar = (Y0.i) objG2;
        boolean z6 = aVar != null;
        java.lang.Object objG3 = h9.g(Y0.t.f11111I);
        if (((java.lang.Boolean) (objG3 != null ? objG3 : null)) == null || (iVar != null && iVar.f11038a == 4)) {
            return z6;
        }
        return true;
    }

    public static final java.lang.String i(Y0.p pVar, android.content.res.Resources resources) {
        int iS;
        java.lang.Object objG = pVar.f11094d.f15960h.g(Y0.t.f11120b);
        java.lang.String string = null;
        if (objG == null) {
            objG = null;
        }
        Y0.w wVar = Y0.t.f11112J;
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = pVar.f11094d;
        p136q.H h9 = semanticsConfiguration.f15960h;
        java.lang.Object objG2 = h9.g(wVar);
        if (objG2 == null) {
            objG2 = null;
        }
        p002a1.a aVar = (p002a1.a) objG2;
        java.lang.Object objG3 = h9.g(Y0.t.y);
        if (objG3 == null) {
            objG3 = null;
        }
        Y0.i iVar = (Y0.i) objG3;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new I3.b();
                    }
                    if (objG == null) {
                        objG = resources.getString(com.kiptv.tv.R.string.indeterminate);
                    }
                } else if (iVar != null && iVar.f11038a == 2 && objG == null) {
                    objG = resources.getString(com.kiptv.tv.R.string.state_off);
                }
            } else if (iVar != null && iVar.f11038a == 2 && objG == null) {
                objG = resources.getString(com.kiptv.tv.R.string.state_on);
            }
        }
        java.lang.Object objG4 = h9.g(Y0.t.f11111I);
        if (objG4 == null) {
            objG4 = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((iVar == null || iVar.f11038a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(com.kiptv.tv.R.string.selected) : resources.getString(com.kiptv.tv.R.string.not_selected);
            }
        }
        java.lang.Object objG5 = h9.g(Y0.t.f11121c);
        if (objG5 == null) {
            objG5 = null;
        }
        Y0.h hVar = (Y0.h) objG5;
        if (hVar != null) {
            if (hVar != Y0.h.f11035c) {
                if (objG == null) {
                    D6.d dVar = hVar.f11037b;
                    float f9 = dVar.f2457b;
                    float f10 = dVar.f2456a;
                    float f11 = f9 - f10 == 0.0f ? 0.0f : (hVar.f11036a - f10) / (f9 - f10);
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    }
                    if (f11 == 0.0f) {
                        iS = 0;
                    } else {
                        iS = f11 == 1.0f ? 100 : O7.r.s(java.lang.Math.round(f11 * 100), 1, 99);
                    }
                    objG = resources.getString(com.kiptv.tv.R.string.template_percent, java.lang.Integer.valueOf(iS));
                }
            } else if (objG == null) {
                objG = resources.getString(com.kiptv.tv.R.string.in_progress);
            }
        }
        Y0.w wVar2 = Y0.t.f11109F;
        if (h9.c(wVar2)) {
            androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfigurationK = new Y0.p(pVar.f11091a, true, pVar.f11093c, semanticsConfiguration).k();
            Y0.w wVar3 = Y0.t.f11119a;
            p136q.H h10 = semanticsConfigurationK.f15960h;
            java.lang.Object objG6 = h10.g(wVar3);
            if (objG6 == null) {
                objG6 = null;
            }
            java.util.Collection collection = (java.util.Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                java.lang.Object objG7 = h10.g(Y0.t.f11105B);
                if (objG7 == null) {
                    objG7 = null;
                }
                java.util.Collection collection2 = (java.util.Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    java.lang.Object objG8 = h10.g(wVar2);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(com.kiptv.tv.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (java.lang.String) objG;
    }

    public static final p011b1.C1650g j(Y0.p pVar) {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = pVar.f11094d;
        Y0.w wVar = Y0.t.f11119a;
        p011b1.C1650g c1650g = (p011b1.C1650g) Y0.s.d(semanticsConfiguration, Y0.t.f11109F);
        java.util.List list = (java.util.List) Y0.s.d(pVar.f11094d, Y0.t.f11105B);
        return c1650g == null ? list != null ? (p011b1.C1650g) p078i6.o.j1(list) : null : c1650g;
    }

    public static boolean k() {
        try {
            if (androidx.compose.ui.platform.AndroidComposeView.f15871R0 == null) {
                androidx.compose.ui.platform.AndroidComposeView.f15871R0 = java.lang.Class.forName("android.os.SystemProperties");
            }
            if (androidx.compose.ui.platform.AndroidComposeView.S0 == null) {
                java.lang.Class cls = androidx.compose.ui.platform.AndroidComposeView.f15871R0;
                androidx.compose.ui.platform.AndroidComposeView.S0 = cls != null ? cls.getDeclaredMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE) : null;
            }
            java.lang.reflect.Method method = androidx.compose.ui.platform.AndroidComposeView.S0;
            java.lang.Object objInvoke = method != null ? method.invoke(null, "debug.layout", java.lang.Boolean.FALSE) : null;
            return kotlin.jvm.internal.m.a(objInvoke instanceof java.lang.Boolean ? (java.lang.Boolean) objInvoke : null, java.lang.Boolean.TRUE);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static final p011b1.J l(androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        p194x6.j jVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object objG = semanticsConfiguration.f15960h.g(Y0.l.f11064a);
        if (objG == null) {
            objG = null;
        }
        Y0.a aVar = (Y0.a) objG;
        if (aVar == null || (jVar = (p194x6.j) aVar.f11025b) == null || !((java.lang.Boolean) jVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (p011b1.J) arrayList.get(0);
    }

    public static final boolean m(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f9 * f14) - (f10 * f13);
        float f26 = (f9 * f15) - (f11 * f13);
        float f27 = (f9 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 != 0.0f) {
            float f38 = 1.0f / f37;
            fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
            fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
            fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
            fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
            float f39 = -f13;
            fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
            fArr2[5] = ((f12 * f32) + ((f36 * f9) - (f11 * f33))) * f38;
            float f40 = -f21;
            fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
            fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
            fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
            fArr2[9] = (((f33 * f10) + ((-f9) * f35)) - (f12 * f31)) * f38;
            fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
            fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
            fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
            fArr2[13] = ((f11 * f31) + ((f9 * f34) - (f10 * f32))) * f38;
            fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
            fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        }
        return !(f37 == 0.0f);
    }

    public static final boolean n(float f9, float f10, p188x0.C3088h c3088h) {
        float f11 = f9 - 0.005f;
        float f12 = f10 - 0.005f;
        float f13 = f9 + 0.005f;
        float f14 = f10 + 0.005f;
        p188x0.C3088h c3088hA = p188x0.AbstractC3091k.a();
        p188x0.I[] iArr = p188x0.I.f31051h;
        if (java.lang.Float.isNaN(f11) || java.lang.Float.isNaN(f12) || java.lang.Float.isNaN(f13) || java.lang.Float.isNaN(f14)) {
            p188x0.AbstractC3091k.b("Invalid rectangle, make sure no value is NaN");
        }
        if (c3088hA.f31112b == null) {
            c3088hA.f31112b = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = c3088hA.f31112b;
        kotlin.jvm.internal.m.b(rectF);
        rectF.set(f11, f12, f13, f14);
        android.graphics.RectF rectF2 = c3088hA.f31112b;
        kotlin.jvm.internal.m.b(rectF2);
        c3088hA.f31111a.addRect(rectF2, android.graphics.Path.Direction.CCW);
        p188x0.C3088h c3088hA2 = p188x0.AbstractC3091k.a();
        c3088hA2.d(c3088h, c3088hA, 1);
        boolean zIsEmpty = c3088hA2.f31111a.isEmpty();
        c3088hA2.e();
        c3088hA.e();
        return !zIsEmpty;
    }

    public static final boolean o(float f9, float f10, float f11, float f12, long j) {
        float f13 = f9 - f11;
        float f14 = f10 - f12;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f14 * f14) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f13 * f13) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void p(float[] fArr, float[] fArr2) {
        float fG = g(0, fArr2, fArr, 0);
        float fG2 = g(0, fArr2, fArr, 1);
        float fG3 = g(0, fArr2, fArr, 2);
        float fG4 = g(0, fArr2, fArr, 3);
        float fG5 = g(1, fArr2, fArr, 0);
        float fG6 = g(1, fArr2, fArr, 1);
        float fG7 = g(1, fArr2, fArr, 2);
        float fG8 = g(1, fArr2, fArr, 3);
        float fG9 = g(2, fArr2, fArr, 0);
        float fG10 = g(2, fArr2, fArr, 1);
        float fG11 = g(2, fArr2, fArr, 2);
        float fG12 = g(2, fArr2, fArr, 3);
        float fG13 = g(3, fArr2, fArr, 0);
        float fG14 = g(3, fArr2, fArr, 1);
        float fG15 = g(3, fArr2, fArr, 2);
        float fG16 = g(3, fArr2, fArr, 3);
        fArr[0] = fG;
        fArr[1] = fG2;
        fArr[2] = fG3;
        fArr[3] = fG4;
        fArr[4] = fG5;
        fArr[5] = fG6;
        fArr[6] = fG7;
        fArr[7] = fG8;
        fArr[8] = fG9;
        fArr[9] = fG10;
        fArr[10] = fG11;
        fArr[11] = fG12;
        fArr[12] = fG13;
        fArr[13] = fG14;
        fArr[14] = fG15;
        fArr[15] = fG16;
    }

    public static final p138q1.j q(R0.C0816c0 c0816c0, int i3) {
        java.lang.Object next;
        java.util.Iterator<T> it = c0816c0.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Q0.F) ((java.util.Map.Entry) next).getKey()).f8242i != i3);
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return (p138q1.j) entry.getValue();
        }
        return null;
    }

    public static final java.lang.String r(java.lang.Object obj) {
        java.lang.String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(name);
        sb.append('@');
        return B2.a.p(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.System.identityHashCode(obj))}, 1, "%07x", sb);
    }

    public static final java.lang.String s(int i3) {
        if (i3 == 0) {
            return "android.widget.Button";
        }
        if (i3 == 1) {
            return "android.widget.CheckBox";
        }
        if (i3 == 3) {
            return "android.widget.RadioButton";
        }
        if (i3 == 5) {
            return io.sentry.SentryReplayOptions.IMAGE_VIEW_CLASS_NAME;
        }
        if (i3 == 6) {
            return "android.widget.Spinner";
        }
        if (i3 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
