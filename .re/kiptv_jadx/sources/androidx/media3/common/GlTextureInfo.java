package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class GlTextureInfo {
    public static final androidx.media3.common.GlTextureInfo UNSET = new androidx.media3.common.GlTextureInfo(-1, -1, -1, -1, -1);
    public final int fboId;
    public final int height;
    public final int rboId;
    public final int texId;
    public final int width;

    public GlTextureInfo(int i3, int i9, int i10, int i11, int i12) {
        this.texId = i3;
        this.fboId = i9;
        this.rboId = i10;
        this.width = i11;
        this.height = i12;
    }

    public void release() throws androidx.media3.common.util.GlUtil.GlException {
        int i3 = this.texId;
        if (i3 != -1) {
            androidx.media3.common.util.GlUtil.deleteTexture(i3);
        }
        int i9 = this.fboId;
        if (i9 != -1) {
            androidx.media3.common.util.GlUtil.deleteFbo(i9);
        }
        int i10 = this.rboId;
        if (i10 != -1) {
            androidx.media3.common.util.GlUtil.deleteRbo(i10);
        }
    }
}
