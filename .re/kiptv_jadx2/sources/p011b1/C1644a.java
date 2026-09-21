package p011b1;

import B.d0;
import D1.C0223h;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.media3.datasource.e;
import j1.a;
import j1.b;
import j1.c;
import p021c1.f;
import p021c1.h;
import p021c1.i;
import p021c1.j;
import p031d1.d;
import p104m1.l;
import p188x0.AbstractC3083c;
import p188x0.AbstractC3095o;
import p188x0.InterfaceC3097q;
import p188x0.N;
import p188x0.z;

public final class C1644a {

    public final c f17791a;

    public final int f17792b;

    public final long f17793c;

    public final i f17794d;

    public final CharSequence f17795e;

    public final Object f17796f;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public C1644a(j1.c r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p011b1.C1644a.<init>(j1.c, int, int, long):void");
    }

    public final i a(int i3, int i9, TextUtils.TruncateAt truncateAt, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence) {
        v vVar;
        float fD = d();
        c cVar = this.f17791a;
        a aVar = b.f23869a;
        w wVar = cVar.f23871i.f17788c;
        return new i(charSequence, fD, cVar.f23875n, i3, truncateAt, cVar.f23880s, (wVar == null || (vVar = wVar.f17858a) == null) ? false : vVar.f17856a, i10, i12, i13, i14, i11, i9, cVar.f23877p);
    }

    public final float b() {
        return this.f17794d.a();
    }

    public final long c(p181w0.b bVar, int i3, C0223h c0223h) {
        d bVar2;
        int i9;
        int[] rangeForRect;
        SegmentFinder segmentFinderK;
        RectF rectFG = z.G(bVar);
        boolean z6 = i3 != 0 && i3 == 1;
        final d0 d0Var = new d0(14, c0223h);
        int i10 = Build.VERSION.SDK_INT;
        i iVar = this.f17794d;
        TextPaint textPaint = iVar.f18468a;
        Layout layout = iVar.f18473f;
        if (i10 >= 34) {
            if (z6) {
                segmentFinderK = new p031d1.a(new S2.a(layout.getText(), iVar.j(), 20));
            } else {
                e.n();
                segmentFinderK = e.k(e.j(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFG, segmentFinderK, new Layout.TextInclusionStrategy() {
                @Override
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) d0Var.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            E2.d dVarC = iVar.c();
            if (z6) {
                bVar2 = new S2.a(layout.getText(), iVar.j(), 20);
            } else {
                CharSequence text = layout.getText();
                bVar2 = i10 >= 29 ? new p031d1.b(text, textPaint) : new p031d1.c(text);
            }
            d dVar = bVar2;
            int lineForVertical = layout.getLineForVertical((int) rectFG.top);
            if (rectFG.top <= iVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < iVar.g) {
                int i11 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFG.bottom);
                if (lineForVertical2 != 0 || rectFG.bottom >= iVar.g(0)) {
                    int iE = f.e(iVar, layout, dVarC, i11, rectFG, dVar, d0Var, true);
                    while (true) {
                        i9 = i11;
                        if (iE != -1 || i9 >= lineForVertical2) {
                            break;
                        }
                        i11 = i9 + 1;
                        iE = f.e(iVar, layout, dVarC, i11, rectFG, dVar, d0Var, true);
                    }
                    if (iE == -1) {
                        rangeForRect = null;
                    } else {
                        int i12 = lineForVertical2;
                        int iE2 = f.e(iVar, layout, dVarC, i12, rectFG, dVar, d0Var, false);
                        while (iE2 == -1 && i9 < i12) {
                            i12--;
                            iE2 = f.e(iVar, layout, dVarC, i12, rectFG, dVar, d0Var, false);
                        }
                        if (iE2 == -1) {
                            rangeForRect = null;
                        } else {
                            rangeForRect = new int[]{dVar.g(iE + 1), dVar.h(iE2 - 1)};
                        }
                    }
                } else {
                    rangeForRect = null;
                }
            } else {
                rangeForRect = null;
            }
        }
        return rangeForRect == null ? L.f17782b : D.b(rangeForRect[0], rangeForRect[1]);
    }

    public final float d() {
        return p113n1.a.h(this.f17793c);
    }

    public final void e(InterfaceC3097q interfaceC3097q) {
        Canvas canvasA = AbstractC3083c.a(interfaceC3097q);
        i iVar = this.f17794d;
        if (iVar.f18471d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        if (canvasA.getClipBounds(iVar.f18481p)) {
            int i3 = iVar.f18474h;
            if (i3 != 0) {
                canvasA.translate(0.0f, i3);
            }
            ThreadLocal threadLocal = j.f18483a;
            Object hVar = threadLocal.get();
            if (hVar == null) {
                hVar = new h();
                threadLocal.set(hVar);
            }
            h hVar2 = (h) hVar;
            hVar2.f18467a = canvasA;
            try {
                iVar.f18473f.draw(hVar2);
                hVar2.f18467a = null;
                if (i3 != 0) {
                    canvasA.translate(0.0f, (-1) * i3);
                }
            } catch (Throwable th) {
                hVar2.f18467a = null;
                throw th;
            }
        }
        if (iVar.f18471d) {
            canvasA.restore();
        }
    }

    public final void f(InterfaceC3097q interfaceC3097q, long j, N n3, l lVar, p203z0.c cVar) {
        j1.e eVar = this.f17791a.f23875n;
        int i3 = eVar.f23885c;
        eVar.d(j);
        eVar.f(n3);
        eVar.g(lVar);
        eVar.e(cVar);
        eVar.b(3);
        e(interfaceC3097q);
        eVar.b(i3);
    }

    public final void g(InterfaceC3097q interfaceC3097q, AbstractC3095o abstractC3095o, float f9, N n3, l lVar, p203z0.c cVar) {
        j1.e eVar = this.f17791a.f23875n;
        int i3 = eVar.f23885c;
        float fD = d();
        eVar.c(abstractC3095o, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f9);
        eVar.f(n3);
        eVar.g(lVar);
        eVar.e(cVar);
        eVar.b(3);
        e(interfaceC3097q);
        eVar.b(i3);
    }
}
