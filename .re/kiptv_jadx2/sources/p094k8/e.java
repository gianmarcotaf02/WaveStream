package p094k8;

import java.io.Flushable;

public interface e extends AutoCloseable, Flushable {
    @Override
    void close();

    void flush();

    void write(a aVar, long j);
}
