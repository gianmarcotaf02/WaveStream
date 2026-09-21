package io.ktor.util;

import java.util.List;
import p194x6.m;

public final class d implements m {

    public final int f23410h;

    public final StringValuesBuilderImpl f23411i;

    public d(StringValuesBuilderImpl stringValuesBuilderImpl, int i3) {
        this.f23410h = i3;
        this.f23411i = stringValuesBuilderImpl;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        List list = (List) obj2;
        switch (this.f23410h) {
            case 0:
                return StringValuesBuilderImpl.appendMissing$lambda$1(this.f23411i, str, list);
            default:
                return StringValuesBuilderImpl.appendAll$lambda$0(this.f23411i, str, list);
        }
    }
}
