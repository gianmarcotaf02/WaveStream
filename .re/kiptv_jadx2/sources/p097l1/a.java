package p097l1;

import I3.b;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.m;
import p188x0.C3089i;
import p203z0.c;
import p203z0.f;
import p203z0.g;

public final class a extends CharacterStyle implements UpdateAppearance {

    public final c f24712a;

    public a(c cVar) {
        this.f24712a = cVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            f fVar = f.f32132b;
            c cVar = this.f24712a;
            if (m.a(cVar, fVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(cVar instanceof g)) {
                throw new b();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            g gVar = (g) cVar;
            textPaint.setStrokeWidth(gVar.f32133b);
            textPaint.setStrokeMiter(gVar.f32134c);
            int i3 = gVar.f32136e;
            if (i3 == 0) {
                join = Paint.Join.MITER;
            } else if (i3 == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i3 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i9 = gVar.f32135d;
            if (i9 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i9 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i9 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            C3089i c3089i = gVar.f32137f;
            textPaint.setPathEffect(c3089i != null ? c3089i.f31114a : null);
        }
    }
}
