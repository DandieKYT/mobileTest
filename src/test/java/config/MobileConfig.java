package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:test.properties"
})
public interface MobileConfig extends Config {
    @Key("deviceName")
    @DefaultValue("Google Pixel 3")
    String getDeviceName();

    @Key("osVersion")
    @DefaultValue("9.0")
    String getOsVersion();

    @Key("url")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String getUrl();

    @Key("user")
    @DefaultValue("dandiekyt_fmCgsX")
    String getUser();

    @Key("key")
    @DefaultValue("aUkbVXswGV3k2ybtE1Wr")
    String getKey();
}
