package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final androidx.media3.exoplayer.video.spherical.Projection.Mesh leftMesh;
    public final androidx.media3.exoplayer.video.spherical.Projection.Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final androidx.media3.exoplayer.video.spherical.Projection.SubMesh[] subMeshes;

        public Mesh(androidx.media3.exoplayer.video.spherical.Projection.SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public androidx.media3.exoplayer.video.spherical.Projection.SubMesh getSubMesh(int i3) {
            return this.subMeshes[i3];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i3, float[] fArr, float[] fArr2, int i9) {
            this.textureId = i3;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i9;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(androidx.media3.exoplayer.video.spherical.Projection.Mesh mesh, int i3) {
        this(mesh, mesh, i3);
    }

    public static androidx.media3.exoplayer.video.spherical.Projection createEquirectangular(int i3) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i3);
    }

    public Projection(androidx.media3.exoplayer.video.spherical.Projection.Mesh mesh, androidx.media3.exoplayer.video.spherical.Projection.Mesh mesh2, int i3) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i3;
        this.singleMesh = mesh == mesh2;
    }

    public static androidx.media3.exoplayer.video.spherical.Projection createEquirectangular(float f9, int i3, int i9, float f10, float f11, int i10) {
        int i11 = i3;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(f9 > 0.0f);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i11 >= 1);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i9 >= 1);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(f10 > 0.0f && f10 <= 180.0f);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(f11 > 0.0f && f11 <= 360.0f);
        float radians = (float) java.lang.Math.toRadians(f10);
        float radians2 = (float) java.lang.Math.toRadians(f11);
        float f12 = radians / i11;
        float f13 = radians2 / i9;
        int i12 = i9 + 1;
        int i13 = ((i12 * 2) + 2) * i11;
        float[] fArr = new float[i13 * 3];
        float[] fArr2 = new float[i13 * 2];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i11) {
            float f14 = radians / 2.0f;
            float f15 = (i14 * f12) - f14;
            int i17 = i14 + 1;
            float f16 = (i17 * f12) - f14;
            int i18 = 0;
            while (i18 < i12) {
                float f17 = radians;
                float f18 = radians2;
                int i19 = 2;
                int i20 = 0;
                while (i20 < i19) {
                    float f19 = i20 == 0 ? f15 : f16;
                    float f20 = f12;
                    float f21 = i18 * f13;
                    float f22 = f13;
                    float f23 = f15;
                    double d4 = f9;
                    double d6 = (f21 + 3.1415927f) - (f18 / 2.0f);
                    double dSin = java.lang.Math.sin(d6) * d4;
                    double d9 = f19;
                    fArr[i15] = -((float) (java.lang.Math.cos(d9) * dSin));
                    fArr[i15 + 1] = (float) (java.lang.Math.sin(d9) * d4);
                    int i21 = i15 + 3;
                    fArr[i15 + 2] = (float) (java.lang.Math.cos(d6) * d4 * java.lang.Math.cos(d9));
                    fArr2[i16] = f21 / f18;
                    int i22 = i16 + 2;
                    fArr2[i16 + 1] = ((i14 + i20) * f20) / f17;
                    if ((i18 == 0 && i20 == 0) || (i18 == i9 && i20 == 1)) {
                        java.lang.System.arraycopy(fArr, i15, fArr, i21, 3);
                        i15 += 6;
                        i19 = 2;
                        java.lang.System.arraycopy(fArr2, i16, fArr2, i22, 2);
                        i16 += 4;
                    } else {
                        i19 = 2;
                        i15 = i21;
                        i16 = i22;
                    }
                    i20++;
                    f12 = f20;
                    f13 = f22;
                    f15 = f23;
                }
                i18++;
                radians2 = f18;
                radians = f17;
            }
            i11 = i3;
            i14 = i17;
        }
        return new androidx.media3.exoplayer.video.spherical.Projection(new androidx.media3.exoplayer.video.spherical.Projection.Mesh(new androidx.media3.exoplayer.video.spherical.Projection.SubMesh(0, fArr, fArr2, 1)), i10);
    }
}
