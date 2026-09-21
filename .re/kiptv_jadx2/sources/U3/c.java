package U3;

import android.os.IInterface;

public interface c extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z6, int i3);

    int getIntFlagValue(String str, int i3, int i9);

    long getLongFlagValue(String str, long j, int i3);

    String getStringFlagValue(String str, String str2, int i3);

    void init(O3.a aVar);
}
