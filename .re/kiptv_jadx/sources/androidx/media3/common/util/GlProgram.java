package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final java.util.Map<java.lang.String, androidx.media3.common.util.GlProgram.Attribute> attributeByName;
    private final androidx.media3.common.util.GlProgram.Attribute[] attributes;
    private boolean externalTexturesRequireNearestSampling;
    private final int programId;
    private final java.util.Map<java.lang.String, androidx.media3.common.util.GlProgram.Uniform> uniformByName;
    private final androidx.media3.common.util.GlProgram.Uniform[] uniforms;

    public static final class Attribute {
        private java.nio.Buffer buffer;
        private final int location;
        public final java.lang.String name;
        private int size;

        private Attribute(java.lang.String str, int i3) {
            this.name = str;
            this.location = i3;
        }

        public static androidx.media3.common.util.GlProgram.Attribute create(int i3, int i9) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetProgramiv(i3, 35722, iArr, 0);
            int i10 = iArr[0];
            byte[] bArr = new byte[i10];
            android.opengl.GLES20.glGetActiveAttrib(i3, i9, i10, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            java.lang.String str = new java.lang.String(bArr, 0, androidx.media3.common.util.GlProgram.getCStringLength(bArr));
            return new androidx.media3.common.util.GlProgram.Attribute(str, androidx.media3.common.util.GlProgram.getAttributeLocation(i3, str));
        }

        public void bind() throws androidx.media3.common.util.GlUtil.GlException {
            java.nio.Buffer buffer = this.buffer;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.U(buffer, "call setBuffer before bind");
            android.opengl.GLES20.glBindBuffer(34962, 0);
            android.opengl.GLES20.glVertexAttribPointer(this.location, this.size, 5126, false, 0, buffer);
            android.opengl.GLES20.glEnableVertexAttribArray(this.location);
            androidx.media3.common.util.GlUtil.checkGlError();
        }

        public void setBuffer(float[] fArr, int i3) {
            this.buffer = androidx.media3.common.util.GlUtil.createBuffer(fArr);
            this.size = i3;
        }
    }

    public static final class Uniform {
        private final int location;
        public final java.lang.String name;
        private int texIdValue;
        private int texUnitIndex;
        private final int type;
        private final float[] floatValue = new float[16];
        private final int[] intValue = new int[4];
        private int texMinFilter = androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR;

        private Uniform(java.lang.String str, int i3, int i9) {
            this.name = str;
            this.location = i3;
            this.type = i9;
        }

        public static androidx.media3.common.util.GlProgram.Uniform create(int i3, int i9) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetProgramiv(i3, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i10 = iArr[0];
            byte[] bArr = new byte[i10];
            android.opengl.GLES20.glGetActiveUniform(i3, i9, i10, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            java.lang.String str = new java.lang.String(bArr, 0, androidx.media3.common.util.GlProgram.getCStringLength(bArr));
            return new androidx.media3.common.util.GlProgram.Uniform(str, androidx.media3.common.util.GlProgram.getUniformLocation(i3, str), iArr2[0]);
        }

        public void bind(boolean z6) throws androidx.media3.common.util.GlUtil.GlException {
            int i3 = this.type;
            if (i3 == 5124) {
                android.opengl.GLES20.glUniform1iv(this.location, 1, this.intValue, 0);
                androidx.media3.common.util.GlUtil.checkGlError();
                return;
            }
            if (i3 == 5126) {
                android.opengl.GLES20.glUniform1fv(this.location, 1, this.floatValue, 0);
                androidx.media3.common.util.GlUtil.checkGlError();
                return;
            }
            if (i3 == 35678 || i3 == androidx.media3.common.util.GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT || i3 == 36198) {
                if (this.texIdValue == 0) {
                    throw new java.lang.IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                android.opengl.GLES20.glActiveTexture(this.texUnitIndex + 33984);
                androidx.media3.common.util.GlUtil.checkGlError();
                int i9 = this.type;
                androidx.media3.common.util.GlUtil.bindTexture(i9 == 35678 ? 3553 : 36197, this.texIdValue, (i9 == 35678 || !z6) ? androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR : 9728);
                if (this.type == 35678) {
                    if (this.texMinFilter == 9987) {
                        android.opengl.GLES20.glGenerateMipmap(3553);
                        androidx.media3.common.util.GlUtil.checkGlError();
                    }
                    android.opengl.GLES20.glTexParameteri(3553, 10241, this.texMinFilter);
                    androidx.media3.common.util.GlUtil.checkGlError();
                }
                android.opengl.GLES20.glUniform1i(this.location, this.texUnitIndex);
                androidx.media3.common.util.GlUtil.checkGlError();
                return;
            }
            switch (i3) {
                case 35664:
                    android.opengl.GLES20.glUniform2fv(this.location, 1, this.floatValue, 0);
                    androidx.media3.common.util.GlUtil.checkGlError();
                    return;
                case 35665:
                    android.opengl.GLES20.glUniform3fv(this.location, 1, this.floatValue, 0);
                    androidx.media3.common.util.GlUtil.checkGlError();
                    return;
                case 35666:
                    android.opengl.GLES20.glUniform4fv(this.location, 1, this.floatValue, 0);
                    androidx.media3.common.util.GlUtil.checkGlError();
                    return;
                case 35667:
                    android.opengl.GLES20.glUniform2iv(this.location, 1, this.intValue, 0);
                    androidx.media3.common.util.GlUtil.checkGlError();
                    return;
                case 35668:
                    android.opengl.GLES20.glUniform3iv(this.location, 1, this.intValue, 0);
                    androidx.media3.common.util.GlUtil.checkGlError();
                    return;
                case 35669:
                    android.opengl.GLES20.glUniform4iv(this.location, 1, this.intValue, 0);
                    androidx.media3.common.util.GlUtil.checkGlError();
                    return;
                default:
                    switch (i3) {
                        case 35675:
                            android.opengl.GLES20.glUniformMatrix3fv(this.location, 1, false, this.floatValue, 0);
                            androidx.media3.common.util.GlUtil.checkGlError();
                            return;
                        case 35676:
                            android.opengl.GLES20.glUniformMatrix4fv(this.location, 1, false, this.floatValue, 0);
                            androidx.media3.common.util.GlUtil.checkGlError();
                            return;
                        default:
                            throw new java.lang.IllegalStateException("Unexpected uniform type: " + this.type);
                    }
            }
        }

        public void setFloat(float f9) {
            this.floatValue[0] = f9;
        }

        public void setFloats(float[] fArr) {
            java.lang.System.arraycopy(fArr, 0, this.floatValue, 0, fArr.length);
        }

        public void setInt(int i3) {
            this.intValue[0] = i3;
        }

        public void setInts(int[] iArr) {
            java.lang.System.arraycopy(iArr, 0, this.intValue, 0, iArr.length);
        }

        public void setSamplerTexId(int i3, int i9) {
            this.texIdValue = i3;
            this.texUnitIndex = i9;
        }

        public void setTexMinFilter(int i3) {
            this.texMinFilter = i3;
        }
    }

    public GlProgram(android.content.Context context, int i3, int i9) {
        this(androidx.media3.common.util.Util.loadRawResource(context, i3), androidx.media3.common.util.Util.loadRawResource(context, i9));
    }

    private static void addShader(int i3, int i9, java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        int iGlCreateShader = android.opengl.GLES20.glCreateShader(i9);
        android.opengl.GLES20.glShaderSource(iGlCreateShader, str);
        android.opengl.GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        android.opengl.GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        androidx.media3.common.util.GlUtil.checkGlException(iArr[0] == 1, android.opengl.GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        android.opengl.GLES20.glAttachShader(i3, iGlCreateShader);
        android.opengl.GLES20.glDeleteShader(iGlCreateShader);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i3, java.lang.String str) {
        return android.opengl.GLES20.glGetAttribLocation(i3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (bArr[i3] == 0) {
                return i3;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i3, java.lang.String str) {
        return android.opengl.GLES20.glGetUniformLocation(i3, str);
    }

    public void bindAttributesAndUniforms() throws androidx.media3.common.util.GlUtil.GlException {
        for (androidx.media3.common.util.GlProgram.Attribute attribute : this.attributes) {
            attribute.bind();
        }
        for (androidx.media3.common.util.GlProgram.Uniform uniform : this.uniforms) {
            uniform.bind(this.externalTexturesRequireNearestSampling);
        }
    }

    public void delete() throws androidx.media3.common.util.GlUtil.GlException {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            return;
        }
        android.opengl.GLES20.glDeleteProgram(this.programId);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        int attributeLocation = getAttributeLocation(str);
        android.opengl.GLES20.glEnableVertexAttribArray(attributeLocation);
        androidx.media3.common.util.GlUtil.checkGlError();
        return attributeLocation;
    }

    public void setBufferAttribute(java.lang.String str, float[] fArr, int i3) {
        androidx.media3.common.util.GlProgram.Attribute attribute = this.attributeByName.get(str);
        attribute.getClass();
        attribute.setBuffer(fArr, i3);
    }

    public void setExternalTexturesRequireNearestSampling(boolean z6) {
        this.externalTexturesRequireNearestSampling = z6;
    }

    public void setFloatUniform(java.lang.String str, float f9) {
        androidx.media3.common.util.GlProgram.Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setFloat(f9);
    }

    public void setFloatsUniform(java.lang.String str, float[] fArr) {
        androidx.media3.common.util.GlProgram.Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setFloats(fArr);
    }

    public void setFloatsUniformIfPresent(java.lang.String str, float[] fArr) {
        androidx.media3.common.util.GlProgram.Uniform uniform = this.uniformByName.get(str);
        if (uniform == null) {
            return;
        }
        uniform.setFloats(fArr);
    }

    public void setIntUniform(java.lang.String str, int i3) {
        androidx.media3.common.util.GlProgram.Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setInt(i3);
    }

    public void setIntsUniform(java.lang.String str, int[] iArr) {
        androidx.media3.common.util.GlProgram.Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setInts(iArr);
    }

    public void setSamplerTexIdUniform(java.lang.String str, int i3, int i9) {
        androidx.media3.common.util.GlProgram.Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setSamplerTexId(i3, i9);
    }

    public void use() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glUseProgram(this.programId);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    private int getAttributeLocation(java.lang.String str) {
        return getAttributeLocation(this.programId, str);
    }

    public int getUniformLocation(java.lang.String str) {
        return getUniformLocation(this.programId, str);
    }

    public GlProgram(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this(androidx.media3.common.util.Util.loadAsset(context, str), androidx.media3.common.util.Util.loadAsset(context, str2));
    }

    public void setSamplerTexIdUniform(java.lang.String str, int i3, int i9, int i10) {
        androidx.media3.common.util.GlProgram.Uniform uniform = this.uniformByName.get(str);
        uniform.getClass();
        uniform.setSamplerTexId(i3, i9);
        uniform.setTexMinFilter(i10);
    }

    public GlProgram(java.lang.String str, java.lang.String str2) throws androidx.media3.common.util.GlUtil.GlException {
        int iGlCreateProgram = android.opengl.GLES20.glCreateProgram();
        this.programId = iGlCreateProgram;
        androidx.media3.common.util.GlUtil.checkGlError();
        addShader(iGlCreateProgram, 35633, str);
        addShader(iGlCreateProgram, 35632, str2);
        android.opengl.GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        android.opengl.GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        androidx.media3.common.util.GlUtil.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + android.opengl.GLES20.glGetProgramInfoLog(iGlCreateProgram));
        android.opengl.GLES20.glUseProgram(iGlCreateProgram);
        this.attributeByName = new java.util.HashMap();
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.attributes = new androidx.media3.common.util.GlProgram.Attribute[iArr2[0]];
        for (int i3 = 0; i3 < iArr2[0]; i3++) {
            androidx.media3.common.util.GlProgram.Attribute attributeCreate = androidx.media3.common.util.GlProgram.Attribute.create(this.programId, i3);
            this.attributes[i3] = attributeCreate;
            this.attributeByName.put(attributeCreate.name, attributeCreate);
        }
        this.uniformByName = new java.util.HashMap();
        int[] iArr3 = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.programId, 35718, iArr3, 0);
        this.uniforms = new androidx.media3.common.util.GlProgram.Uniform[iArr3[0]];
        for (int i9 = 0; i9 < iArr3[0]; i9++) {
            androidx.media3.common.util.GlProgram.Uniform uniformCreate = androidx.media3.common.util.GlProgram.Uniform.create(this.programId, i9);
            this.uniforms[i9] = uniformCreate;
            this.uniformByName.put(uniformCreate.name, uniformCreate);
        }
        androidx.media3.common.util.GlUtil.checkGlError();
    }
}
