package org.example.propertydemo;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-07-30
 * Time: 22:47
 */
@Component
@PropertySource(value = "classpath:application-test.properties")
@ConfigurationProperties(prefix = "test.pro")
@Data
public class TestProperty {
    public String file1;
    public String file2;
}
