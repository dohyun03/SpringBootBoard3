package com.mysite.sbb;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import lombok.RequiredArgsConstructor;

@ControllerAdvice
@RequiredArgsConstructor
public class GlobalModelAttributes {

    private final CommonUtil commonUtil;

    @ModelAttribute("commonUtil")
    public CommonUtil addCommonUtil() {
        return this.commonUtil;
    }
}
