package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    private RepeatModeUtil() {
    }

    public static int getNextRepeatMode(int i3, int i9) {
        for (int i10 = 1; i10 <= 2; i10++) {
            int i11 = (i3 + i10) % 3;
            if (isRepeatModeEnabled(i11, i9)) {
                return i11;
            }
        }
        return i3;
    }

    public static boolean isRepeatModeEnabled(int i3, int i9) {
        if (i3 == 0) {
            return true;
        }
        if (i3 != 1) {
            return i3 == 2 && (i9 & 2) != 0;
        }
        return (i9 & 1) != 0;
    }
}
