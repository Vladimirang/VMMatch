package com.vmloft.develop.library.im.base;

import com.vmloft.develop.library.tools.base.VMCallback;

public class IMCallback<T> implements VMCallback<T> {

    @Override
    public void onSuccess(T t) {

    }

    @Override
    public void onError(int code, String desc) {

    }

    @Override
    public void onProgress(int progress, String desc) {

    }
}
