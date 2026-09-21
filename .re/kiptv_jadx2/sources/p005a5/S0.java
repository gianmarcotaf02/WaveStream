package p005a5;

import O7.x;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.m;

public final class S0 implements FileFilter {

    public final int f13871a;

    public final Object f13872b;

    public S0(int i3, Object obj) {
        this.f13871a = i3;
        this.f13872b = obj;
    }

    @Override
    public final boolean accept(File file) {
        switch (this.f13871a) {
            case 0:
                String name = file.getName();
                StringBuilder sb = new StringBuilder();
                String str = (String) this.f13872b;
                sb.append(str);
                sb.append(".srt");
                if (!m.a(name, sb.toString())) {
                    String name2 = file.getName();
                    m.d(name2, "getName(...)");
                    if (!x.x0(name2, str + "_", false)) {
                        return false;
                    }
                    String name3 = file.getName();
                    m.d(name3, "getName(...)");
                    if (!x.q0(name3, ".srt", false)) {
                        return false;
                    }
                }
                return true;
            default:
                return ETagPayloadStore.deleteTrash$lambda$5((ETagPayloadStore) this.f13872b, file);
        }
    }
}
