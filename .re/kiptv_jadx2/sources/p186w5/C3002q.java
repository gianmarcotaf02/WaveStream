package p186w5;

import com.kiptv.core.model.HomeSectionConfig;
import kotlin.jvm.functions.Function0;
import p020c0.X;
import p070h6.A;

public final class C3002q implements Function0 {

    public final int f30371h;

    public final HomeSectionConfig f30372i;
    public final X j;

    public C3002q(HomeSectionConfig homeSectionConfig, X x9, int i3) {
        this.f30371h = i3;
        this.f30372i = homeSectionConfig;
        this.j = x9;
    }

    @Override
    public final Object invoke() {
        switch (this.f30371h) {
            case 0:
                this.j.setValue(this.f30372i);
                break;
            default:
                this.j.setValue(this.f30372i);
                break;
        }
        return A.f22523a;
    }
}
