package com.dlnl.deliveryguard.web.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ReissueAccessTokenResponse {
    private String accessToken;
}
