package com.github.ltsopensource.core.loadbalance;

import com.github.ltsopensource.core.constant.Constants;
import com.github.ltsopensource.core.spi.SPI;

import java.util.List;

/**
 * Robert HG (254963746@qq.com) on 3/25/15.
 */
@SPI(key = Constants.LOADBALANCE, dftValue = "random")
public interface LoadBalance {

    public <S> S select(List<S> shards, String seed);

}