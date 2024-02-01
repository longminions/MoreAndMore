package MoreAndMore.ForHalogen.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationsProperties {
	private final static Logger logger = LoggerFactory.getLogger(ApplicationsProperties.class);

    private static final String PATH_SEPARATOR = System.getProperties().getProperty("file.separator");

    private Properties defaultConfigs;

    private static ApplicationsProperties instance = new ApplicationsProperties();

    public static ApplicationsProperties getInstance() {
        return instance;
    }

    private ApplicationsProperties() {
        InputStream input = null;
        try {
            input = ApplicationsProperties.class.getClassLoader().getResourceAsStream(CommonKeys.CONFIGS_FILE_NAME);
            defaultConfigs = new Properties();
            defaultConfigs.load(input);
            if (input != null) {
                input.close();
            }
        } catch (Exception e) {
            logger.error("Can't load defaults configs", e);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException releaseIo) {
                // closeQuietly
                // logger.warn("Error when shutdown or release resource ! {}", Encode.forJava(releaseIo.getMessage()));
            }
        }
    }
}
