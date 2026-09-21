package A3;

import java.util.Arrays;

public final class a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, 1, 0, 0, 0, Boolean.FALSE});
    }
}
