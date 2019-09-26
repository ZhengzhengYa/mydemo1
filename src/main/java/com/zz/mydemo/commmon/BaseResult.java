package com.zz.mydemo.commmon;

public class BaseResult {
    private boolean isSuccess;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "isSuccess=" + isSuccess +
                '}';
    }
}
