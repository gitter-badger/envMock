package com.pecpwee.lib.envMock.model.telephony;

import com.pecpwee.lib.envMock.model.AbsTimeModel;

/**
 * Created by pw on 2017/6/22.
 */

public class GetNetworkType extends AbsTimeModel {
    public int getNetworkType() {
        return networkType;
    }

    int networkType = 0;

    public GetNetworkType(int networkType) {
        super(CONST.GET_NETWORK_TYPE);
        this.networkType = networkType;
    }
}
