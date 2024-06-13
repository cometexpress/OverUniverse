package com.cometexpress.overuniverse.common.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00042\u00020\u0002:\u0002\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/cometexpress/overuniverse/common/api/APIResult;", "T", "", "U", "Lcom/cometexpress/overuniverse/data/ErrorModel;", "()V", "Error", "Success", "Lcom/cometexpress/overuniverse/common/api/APIResult$Error;", "Lcom/cometexpress/overuniverse/common/api/APIResult$Success;", "app_debug"})
public abstract class APIResult<T extends java.lang.Object, U extends com.cometexpress.overuniverse.data.ErrorModel> {
    
    private APIResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/cometexpress/overuniverse/common/api/APIResult$Error;", "U", "Lcom/cometexpress/overuniverse/data/ErrorModel;", "Lcom/cometexpress/overuniverse/common/api/APIResult;", "", "error", "(Lcom/cometexpress/overuniverse/data/ErrorModel;)V", "getError", "()Lcom/cometexpress/overuniverse/data/ErrorModel;", "Lcom/cometexpress/overuniverse/data/ErrorModel;", "component1", "copy", "(Lcom/cometexpress/overuniverse/data/ErrorModel;)Lcom/cometexpress/overuniverse/common/api/APIResult$Error;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Error<U extends com.cometexpress.overuniverse.data.ErrorModel> extends com.cometexpress.overuniverse.common.api.APIResult {
        @org.jetbrains.annotations.NotNull()
        private final U error = null;
        
        public Error(@org.jetbrains.annotations.NotNull()
        U error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final U getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final U component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.cometexpress.overuniverse.common.api.APIResult.Error<U> copy(@org.jetbrains.annotations.NotNull()
        U error) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/cometexpress/overuniverse/common/api/APIResult$Success;", "T", "", "Lcom/cometexpress/overuniverse/common/api/APIResult;", "", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/cometexpress/overuniverse/common/api/APIResult$Success;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.cometexpress.overuniverse.common.api.APIResult {
        @org.jetbrains.annotations.NotNull()
        private final T data = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        T data) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final T getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.cometexpress.overuniverse.common.api.APIResult.Success<T> copy(@org.jetbrains.annotations.NotNull()
        T data) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}