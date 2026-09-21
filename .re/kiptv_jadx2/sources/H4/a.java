package H4;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

public abstract class a {

    public static final TimeZone f4017a = DesugarTimeZone.getTimeZone("UTC");

    public static void a(StringBuilder sb, int i3, int i9) {
        String string = Integer.toString(i3);
        for (int length = i9 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }
}
