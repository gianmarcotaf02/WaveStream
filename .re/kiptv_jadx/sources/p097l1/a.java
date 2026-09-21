package p097l1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p203z0.c f24712a;

    public a(p203z0.c cVar) {
        this.f24712a = cVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        android.graphics.Paint.Join join;
        android.graphics.Paint.Cap cap;
        if (textPaint != null) {
            p203z0.f fVar = p203z0.f.f32132b;
            p203z0.c cVar = this.f24712a;
            if (kotlin.jvm.internal.m.a(cVar, fVar)) {
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                return;
            }
            if (!(cVar instanceof p203z0.g)) {
                throw new I3.b();
            }
            textPaint.setStyle(android.graphics.Paint.Style.STROKE);
            p203z0.g gVar = (p203z0.g) cVar;
            textPaint.setStrokeWidth(gVar.f32133b);
            textPaint.setStrokeMiter(gVar.f32134c);
            int i3 = gVar.f32136e;
            if (i3 == 0) {
                join = android.graphics.Paint.Join.MITER;
            } else if (i3 == 1) {
                join = android.graphics.Paint.Join.ROUND;
            } else {
                join = i3 == 2 ? android.graphics.Paint.Join.BEVEL : android.graphics.Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i9 = gVar.f32135d;
            if (i9 == 0) {
                cap = android.graphics.Paint.Cap.BUTT;
            } else if (i9 == 1) {
                cap = android.graphics.Paint.Cap.ROUND;
            } else {
                cap = i9 == 2 ? android.graphics.Paint.Cap.SQUARE : android.graphics.Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            p188x0.C3089i c3089i = gVar.f32137f;
            textPaint.setPathEffect(c3089i != null ? c3089i.f31114a : null);
        }
    }
}
