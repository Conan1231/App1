package com.example.app1;

import android.os.Parcel;
import android.os.Parcelable;

public class LifeCycleCounter implements Parcelable {
protected LifeCycleCounter(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<LifeCycleCounter> CREATOR = new Creator<LifeCycleCounter>() {
        @Override
        public LifeCycleCounter createFromParcel(Parcel in) {
            return new LifeCycleCounter(in);
        }

        @Override
        public LifeCycleCounter[] newArray(int size) {
            return new LifeCycleCounter[size];
        }
    };
}
