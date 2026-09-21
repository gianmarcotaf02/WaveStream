package p183w2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.content.SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p183w2.b f29781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences.Editor f29782b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f29784d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f29783c = new java.util.concurrent.CopyOnWriteArrayList();

    public a(p183w2.b bVar, android.content.SharedPreferences.Editor editor) {
        this.f29781a = bVar;
        this.f29782b = editor;
    }

    public final void a() {
        if (this.f29784d.getAndSet(false)) {
            p183w2.b bVar = this.f29781a;
            for (java.lang.String str : ((java.util.HashMap) bVar.getAll()).keySet()) {
                if (!this.f29783c.contains(str) && !p183w2.b.c(str)) {
                    this.f29782b.remove(bVar.a(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.f29782b.apply();
        b();
        this.f29783c.clear();
    }

    public final void b() {
        p183w2.b bVar = this.f29781a;
        for (android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : bVar.f29786b) {
            java.util.Iterator it = this.f29783c.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(bVar, (java.lang.String) it.next());
            }
        }
    }

    public final void c(java.lang.String str, byte[] bArr) {
        p183w2.b bVar = this.f29781a;
        bVar.getClass();
        if (p183w2.b.c(str)) {
            throw new java.lang.SecurityException(p121o0.p.o(str, " is a reserved key for the encryption keyset."));
        }
        this.f29783c.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            java.lang.String strA = bVar.a(str);
            try {
                android.util.Pair pair = new android.util.Pair(strA, new java.lang.String(B4.g.b(bVar.f29787c.a(bArr, strA.getBytes(java.nio.charset.StandardCharsets.UTF_8))), "US-ASCII"));
                this.f29782b.putString((java.lang.String) pair.first, (java.lang.String) pair.second);
            } catch (java.io.UnsupportedEncodingException e6) {
                throw new java.lang.AssertionError(e6);
            }
        } catch (java.security.GeneralSecurityException e9) {
            throw new java.lang.SecurityException("Could not encrypt data: " + e9.getMessage(), e9);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor clear() {
        this.f29784d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f29783c;
        a();
        try {
            return this.f29782b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z6) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z6 ? (byte) 1 : (byte) 0);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f9) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f9);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putInt(java.lang.String str, int i3) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i3);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putLong(java.lang.String str, long j) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        int length = bytes.length;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        if (set == null) {
            set = new p136q.C2662f(0);
            set.add("__NULL__");
        }
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList(set.size());
        int size = set.size() * 4;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((java.lang.String) it.next()).getBytes(java.nio.charset.StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        c(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final android.content.SharedPreferences.Editor remove(java.lang.String str) {
        p183w2.b bVar = this.f29781a;
        bVar.getClass();
        if (p183w2.b.c(str)) {
            throw new java.lang.SecurityException(p121o0.p.o(str, " is a reserved key for the encryption keyset."));
        }
        this.f29782b.remove(bVar.a(str));
        this.f29783c.add(str);
        return this;
    }
}
