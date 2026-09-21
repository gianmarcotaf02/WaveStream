package U4;

import android.content.Context;
import java.io.File;

public final class q {
    public static final p Companion = new p();

    public final Context f10152a;

    public final p162s8.d f10153b;

    public q(Context context, p162s8.d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f10152a = context;
        this.f10153b = json;
    }

    public static final File a(q qVar, String str) {
        qVar.getClass();
        File file = new File(qVar.f10152a.getCacheDir(), "SearchIndex");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str.concat(".json"));
    }
}
