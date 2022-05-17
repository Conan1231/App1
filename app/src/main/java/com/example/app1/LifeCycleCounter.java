package com.example.app1;

import android.os.Parcel;
import android.os.Parcelable;

public class LifeCycleCounter implements Parcelable {
    int anzCreate = 0;
    int anzDestroy = 0;
    int anzPause = 0;
    int anzResume = 0;
    int anzStart = 0;
    int anzStop = 0;

    public LifeCycleCounter(){

    }

protected LifeCycleCounter(Parcel in) {
    anzCreate = in.readInt();
    anzDestroy = in.readInt();
    anzPause = in.readInt();
    anzResume = in.readInt();
    anzStart = in.readInt();
    anzStop = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(anzCreate);
        parcel.writeInt(anzDestroy);
        parcel.writeInt(anzPause);
        parcel.writeInt(anzResume);
        parcel.writeInt(anzStart);
        parcel.writeInt(anzStop);
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
