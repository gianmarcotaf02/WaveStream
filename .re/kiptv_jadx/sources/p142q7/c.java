package p142q7;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends p142q7.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26653b = 1;

    public /* synthetic */ c(java.lang.Object obj) {
        super(obj);
    }

    @Override // p142q7.g
    public final C7.AbstractC0191x a(N6.B module) {
        switch (this.f26653b) {
            case 0:
                kotlin.jvm.internal.m.e(module, "module");
                K6.i iVarG = module.g();
                iVarG.getClass();
                return iVarG.s(K6.k.BOOLEAN);
            case 1:
                kotlin.jvm.internal.m.e(module, "module");
                K6.i iVarG2 = module.g();
                iVarG2.getClass();
                return iVarG2.s(K6.k.DOUBLE);
            default:
                kotlin.jvm.internal.m.e(module, "module");
                K6.i iVarG3 = module.g();
                iVarG3.getClass();
                return iVarG3.s(K6.k.FLOAT);
        }
    }

    @Override // p142q7.g
    public java.lang.String toString() {
        switch (this.f26653b) {
            case 1:
                return ((java.lang.Number) this.f26656a).doubleValue() + ".toDouble()";
            case 2:
                return ((java.lang.Number) this.f26656a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d4) {
        super(java.lang.Double.valueOf(d4));
    }

    public c(float f9) {
        super(java.lang.Float.valueOf(f9));
    }
}
