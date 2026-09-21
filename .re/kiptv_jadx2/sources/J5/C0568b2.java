package J5;

import com.kiptv.core.model.EPGProgram;
import kotlin.jvm.functions.Function0;
import p193x5.C3115f;

public final class C0568b2 implements p194x6.m {

    public final int f6351h;

    public final p020c0.X f6352i;

    public C0568b2(int i3, p020c0.X x9) {
        this.f6351h = i3;
        this.f6352i = x9;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6351h) {
            case 0:
                String rowKey = (String) obj;
                Function0 action = (Function0) obj2;
                kotlin.jvm.internal.m.e(rowKey, "rowKey");
                kotlin.jvm.internal.m.e(action, "action");
                this.f6352i.setValue(rowKey);
                action.invoke();
                break;
            default:
                EPGProgram program = (EPGProgram) obj;
                S4.p group = (S4.p) obj2;
                kotlin.jvm.internal.m.e(program, "program");
                kotlin.jvm.internal.m.e(group, "group");
                this.f6352i.setValue(new C3115f(program, group));
                break;
        }
        return p070h6.A.f22523a;
    }
}
