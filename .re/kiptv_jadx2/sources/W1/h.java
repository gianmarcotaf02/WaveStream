package W1;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

public abstract class h {
    public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j, int i3) {
        return Os.lseek(fileDescriptor, j, i3);
    }
}
