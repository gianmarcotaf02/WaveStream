package p183w2;

import B4.g;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p121o0.p;
import p136q.C2662f;

public final class a implements SharedPreferences.Editor {

    public final b f29781a;

    public final SharedPreferences.Editor f29782b;

    public final AtomicBoolean f29784d = new AtomicBoolean(false);

    public final CopyOnWriteArrayList f29783c = new CopyOnWriteArrayList();

    public a(b bVar, SharedPreferences.Editor editor) {
        this.f29781a = bVar;
        this.f29782b = editor;
    }

    public final void a() {
        if (this.f29784d.getAndSet(false)) {
            b bVar = this.f29781a;
            for (String str : ((HashMap) bVar.getAll()).keySet()) {
                if (!this.f29783c.contains(str) && !b.c(str)) {
                    this.f29782b.remove(bVar.a(str));
                }
            }
        }
    }

    @Override
    public final void apply() {
        a();
        this.f29782b.apply();
        b();
        this.f29783c.clear();
    }

    public final void b() {
        b bVar = this.f29781a;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : bVar.f29786b) {
            Iterator it = this.f29783c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(bVar, (String) it.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        b bVar = this.f29781a;
        bVar.getClass();
        if (b.c(str)) {
            throw new SecurityException(p.o(str, " is a reserved key for the encryption keyset."));
        }
        this.f29783c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strA = bVar.a(str);
            try {
                Pair pair = new Pair(strA, new String(g.b(bVar.f29787c.a(bArr, strA.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f29782b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e6) {
                throw new AssertionError(e6);
            }
        } catch (GeneralSecurityException e9) {
            throw new SecurityException("Could not encrypt data: " + e9.getMessage(), e9);
        }
    }

    @Override
    public final SharedPreferences.Editor clear() {
        this.f29784d.set(true);
        return this;
    }

    @Override
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f29783c;
        a();
        try {
            return this.f29782b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override
    public final SharedPreferences.Editor putBoolean(String str, boolean z6) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z6 ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putFloat(String str, float f9) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f9);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putInt(String str, int i3) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i3);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C2662f(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override
    public final SharedPreferences.Editor remove(String str) {
        b bVar = this.f29781a;
        bVar.getClass();
        if (b.c(str)) {
            throw new SecurityException(p.o(str, " is a reserved key for the encryption keyset."));
        }
        this.f29782b.remove(bVar.a(str));
        this.f29783c.add(str);
        return this;
    }
}
