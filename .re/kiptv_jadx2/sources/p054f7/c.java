package p054f7;

import p020c0.C1704s0;
import p044e7.l;

public final class c extends b {

    public final int f21733i;
    public final l j;

    public c(l lVar, int i3) {
        super(0);
        this.f21733i = i3;
        this.j = lVar;
    }

    @Override
    public final void e(String[] strArr) {
        switch (this.f21733i) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((d) this.j).f21735i.f21741d = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((d) this.j).f21735i.f21742e = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((f) ((C1704s0) this.j).f18362i).f21744h = strArr;
                return;
        }
    }
}
