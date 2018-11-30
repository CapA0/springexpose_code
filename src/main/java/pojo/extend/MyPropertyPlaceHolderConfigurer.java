package pojo.extend;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * 加密算法加密properties后解密
 */
public class MyPropertyPlaceHolderConfigurer extends PropertyPlaceholderConfigurer {
    @Override
    protected String convertPropertyValue(String originalValue) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < originalValue.length(); i++) {
            if(originalValue.charAt(i) == 'A'){
                sb.append("a");
            }else if(originalValue.charAt(i) == 'B'){
                sb.append("+");
            }else if(originalValue.charAt(i) == 'C'){
                sb.append("t");
            }else{
               sb.append(originalValue.charAt(i));
            }
        }
        return sb.toString();
    }
}
