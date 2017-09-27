package org.smart4j.framework.proxy;

/**
 * Author： caoshengsheng
 * Date： 2017/9/25
 */
public interface Proxy {

    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
