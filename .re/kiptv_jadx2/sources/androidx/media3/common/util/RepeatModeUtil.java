package androidx.media3.common.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
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
