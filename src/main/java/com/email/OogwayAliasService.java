package com.email;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "featureswitch", name = "switchLabel", havingValue = "oogwayAlias", matchIfMissing = true)
class OogwayAliasService implements SendResetPasswordEmailService {

    @Override
    public String sendEmail() {
        return "Sending email from oogway";
    }
}