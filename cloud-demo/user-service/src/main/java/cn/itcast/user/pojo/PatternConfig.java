package cn.itcast.user.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 自己拼音
 * @see [相关类/方法]（可选）
 * @since 2021/1/15
 */
@Data
@Component
@ConfigurationProperties("pattern")
public class PatternConfig {
    private String dateformat;
}
