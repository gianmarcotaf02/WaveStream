package p147r2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public final class g {

    public final int f26818a;

    public final int f26819b;

    public final long f26820c;

    public final long f26821d;

    public g(long j, int i3, int i9, long j9) {
        this.f26818a = i3;
        this.f26819b = i9;
        this.f26820c = j;
        this.f26821d = j9;
    }

    public static g a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f26818a);
            dataOutputStream.writeInt(this.f26819b);
            dataOutputStream.writeLong(this.f26820c);
            dataOutputStream.writeLong(this.f26821d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f26819b == gVar.f26819b && this.f26820c == gVar.f26820c && this.f26818a == gVar.f26818a && this.f26821d == gVar.f26821d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26819b), Long.valueOf(this.f26820c), Integer.valueOf(this.f26818a), Long.valueOf(this.f26821d));
    }
}
