package com.email;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "featureswitch", name = "switchLabel", havingValue = "yahooAlias", matchIfMissing = true)
class YahooAliasService implements SendResetPasswordEmailService {

    @Override
    public String sendEmail() {
        return "Sending email from yahoo";
    }
}