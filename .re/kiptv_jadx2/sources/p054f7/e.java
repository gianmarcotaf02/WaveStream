package p054f7;

public final class e extends b {

    public final int f21736i;
    public final d j;

    public e(d dVar, int i3) {
        super(0);
        this.f21736i = i3;
        this.j = dVar;
    }

    @Override
    public final void e(String[] strArr) {
        switch (this.f21736i) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                this.j.f21735i.f21741d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                this.j.f21735i.f21742e = strArr;
                return;
        }
    }
}
