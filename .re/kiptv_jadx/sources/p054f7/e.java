package p054f7;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends p054f7.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21736i;
    public final /* synthetic */ p054f7.d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p054f7.d dVar, int i3) {
        super(0);
        this.f21736i = i3;
        this.j = dVar;
    }

    @Override // p054f7.b
    public final void e(java.lang.String[] strArr) {
        switch (this.f21736i) {
            case 0:
                if (strArr == null) {
                    throw new java.lang.IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                this.j.f21735i.f21741d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new java.lang.IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                this.j.f21735i.f21742e = strArr;
                return;
        }
    }
}
