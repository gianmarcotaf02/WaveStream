package p054f7;

import com.google.common.util.concurrent.AbstractC1903s;
import java.security.AccessControlException;
import java.util.HashMap;
import p101l7.c;

public final class f {

    public static final boolean f21737i;
    public static final HashMap j;

    public int[] f21738a;

    public String f21739b;

    public int f21740c;

    public String[] f21741d;

    public String[] f21742e;

    public String[] f21743f;
    public a g;

    public String[] f21744h;

    static {
        try {
            f21737i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f21737i = false;
        }
        HashMap map = new HashMap();
        j = map;
        map.put(AbstractC1903s.L(new c("kotlin.jvm.internal.KotlinClass")), a.CLASS);
        map.put(AbstractC1903s.L(new c("kotlin.jvm.internal.KotlinFileFacade")), a.FILE_FACADE);
        map.put(AbstractC1903s.L(new c("kotlin.jvm.internal.KotlinMultifileClass")), a.MULTIFILE_CLASS);
        map.put(AbstractC1903s.L(new c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.MULTIFILE_CLASS_PART);
        map.put(AbstractC1903s.L(new c("kotlin.jvm.internal.KotlinSyntheticClass")), a.SYNTHETIC_CLASS);
    }
}
