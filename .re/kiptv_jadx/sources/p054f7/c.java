package p054f7;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends p054f7.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21733i;
    public final /* synthetic */ p044e7.l j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(p044e7.l lVar, int i3) {
        super(0);
        this.f21733i = i3;
        this.j = lVar;
    }

    @Override // p054f7.b
    public final void e(java.lang.String[] strArr) {
        switch (this.f21733i) {
            case 0:
                if (strArr == null) {
                    throw new java.lang.IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((p054f7.d) this.j).f21735i.f21741d = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new java.lang.IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((p054f7.d) this.j).f21735i.f21742e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new java.lang.IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((p054f7.f) ((p020c0.C1704s0) this.j).f18362i).f21744h = strArr;
                return;
        }
    }
}
